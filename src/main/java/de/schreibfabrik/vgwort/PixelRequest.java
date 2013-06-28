package de.schreibfabrik.vgwort;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import org.apache.axis.encoding.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import de.schreibfabrik.vgwort.soap.OrderPixelFault_Exception;
import de.schreibfabrik.vgwort.soap.OrderPixelRequest;
import de.schreibfabrik.vgwort.soap.OrderPixelResponse;
import de.schreibfabrik.vgwort.soap.Pixel;
import de.schreibfabrik.vgwort.soap.PixelService;
import de.schreibfabrik.vgwort.soap.Pixel_Type;
import de.schreibfabrik.vgwort.xml.XmlService;

@Service
public class PixelRequest
{
	@Autowired
	private XmlService xmlService;

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		PixelService pixelService = new PixelService();
		Pixel pixelPort = pixelService.getPixelPort();

		Map<String, Object> req_ctx = ((BindingProvider)pixelPort).getRequestContext();
		req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				"https://tom-test.vgwort.de/services/1.0/pixelService.wsdl");

		Map<String, List<String>> headers = new HashMap<String, List<String>>();
		String base64String = Base64.encode("xx:xx".getBytes());
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
				System.out.println(pixel.getPublicIdentificationId());
			}
		}
		catch (OrderPixelFault_Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
