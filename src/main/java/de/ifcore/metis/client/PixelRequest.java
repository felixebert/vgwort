package de.ifcore.metis.client;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import org.apache.axis.encoding.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import de.ifcore.metis.jaxws.message.Authors;
import de.ifcore.metis.jaxws.message.Involved;
import de.ifcore.metis.jaxws.message.Message;
import de.ifcore.metis.jaxws.message.MessageService;
import de.ifcore.metis.jaxws.message.MessageText;
import de.ifcore.metis.jaxws.message.NewMessageFault_Exception;
import de.ifcore.metis.jaxws.message.NewMessageRequest;
import de.ifcore.metis.jaxws.message.NewMessageResponse;
import de.ifcore.metis.jaxws.message.Parties;
import de.ifcore.metis.jaxws.message.Text;
import de.ifcore.metis.jaxws.pixel.OrderPixelFault_Exception;
import de.ifcore.metis.jaxws.pixel.OrderPixelRequest;
import de.ifcore.metis.jaxws.pixel.OrderPixelResponse;
import de.ifcore.metis.jaxws.pixel.Pixel;
import de.ifcore.metis.jaxws.pixel.PixelService;
import de.ifcore.metis.jaxws.pixel.Pixel_Type;

@Service
public class PixelRequest
{
	@Autowired
	private MetisConfig metisConfig;

	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PixelRequest pixelRequest = context.getBean(PixelRequest.class);
		pixelRequest.doRequest();
		context.close();
	}

	public void doRequest()
	{
		PixelService pixelService = new PixelService();
		Pixel pixelPort = pixelService.getPixelPort();

		Map<String, Object> req_ctx = ((BindingProvider)pixelPort).getRequestContext();
		req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				"https://tom-test.vgwort.de/services/1.0/pixelService.wsdl");

		Map<String, List<String>> headers = new HashMap<String, List<String>>();
		String base64String = Base64.encode((metisConfig.getUser() + ":" + metisConfig.getPassword()).getBytes());
		headers.put("Authorization", Collections.singletonList("Basic " + base64String));
		req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);

		try
		{
			OrderPixelRequest orderPixelRequest = new OrderPixelRequest();
			orderPixelRequest.setCount(1);

			OrderPixelResponse pixelResponse = pixelPort.orderPixel(orderPixelRequest);

			System.out.println(pixelResponse);
			System.out.println(pixelResponse.getPixels());
			System.out.println(pixelResponse.getPixels().getPixel());
			for (Pixel_Type pixel : pixelResponse.getPixels().getPixel())
			{
				System.out.println("public: " + pixel.getPublicIdentificationId());
				System.out.println("private: " + pixel.getPrivateIdentificationId());
			}
		}
		catch (OrderPixelFault_Exception e)
		{
			e.printStackTrace();
		}
	}

	public void submitText()
	{
		MessageService messageService = new MessageService();
		Message messagePort = messageService.getMessagePort();

		Map<String, Object> req_ctx = ((BindingProvider)messagePort).getRequestContext();
		req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				"https://tom-test.vgwort.de/services/1.0/messageService.wsdl");

		Map<String, List<String>> headers = new HashMap<String, List<String>>();
		String base64String = Base64.encode((metisConfig.getUser() + ":" + metisConfig.getPassword()).getBytes());
		headers.put("Authorization", Collections.singletonList("Basic " + base64String));
		req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);

		try
		{
			MessageText messageText = new MessageText();
			messageText.setShorttext("Lösung von GTA IV");
			messageText.setLyric(false);
			Text text = new Text();
			text.setPlainText(Base64.encode("test".getBytes()).getBytes());
			messageText.setText(text);

			Involved involved = new Involved();
			Authors authors = new Authors();
			authors.getAuthor().add(involved);
			Parties parties = new Parties();

			NewMessageRequest messageRequest = new NewMessageRequest();
			messageRequest.setPrivateidentificationid("aa5577ed95c745cf9c4f77a5e9220505");
			messageRequest.setMessagetext(messageText);

			NewMessageResponse messageResponse = messagePort.newMessage(messageRequest);
			System.out.println(messageResponse);
			System.out.println(messageResponse.getStatus());
		}
		catch (NewMessageFault_Exception e)
		{
			e.printStackTrace();
		}
	}
}
