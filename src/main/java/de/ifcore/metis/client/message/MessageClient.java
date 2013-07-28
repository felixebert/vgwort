package de.ifcore.metis.client.message;

import javax.xml.ws.BindingProvider;

import org.apache.commons.codec.binary.Base64;

import de.ifcore.metis.client.MetisEndpoint;
import de.ifcore.metis.client.message.jaxws.Authors;
import de.ifcore.metis.client.message.jaxws.Involved;
import de.ifcore.metis.client.message.jaxws.Message;
import de.ifcore.metis.client.message.jaxws.MessageService;
import de.ifcore.metis.client.message.jaxws.MessageText;
import de.ifcore.metis.client.message.jaxws.NewMessageFault_Exception;
import de.ifcore.metis.client.message.jaxws.NewMessageRequest;
import de.ifcore.metis.client.message.jaxws.NewMessageResponse;
import de.ifcore.metis.client.message.jaxws.Text;

public class MessageClient
{
	private final Message port;

	public MessageClient(MetisEndpoint endpoint)
	{
		this.port = new MessageService().getMessagePort();

		String wsdlUrl = endpoint.buildUrl("/services/1.0/messageService.wsdl");
		endpoint.configure((BindingProvider)port, wsdlUrl);
	}

	public void submitText()
	{
		MessageText messageText = new MessageText();
		messageText.setShorttext("Lösung von GTA IV");
		messageText.setLyric(false);
		Text text = new Text();
		text.setPlainText(Base64.encodeBase64String("test".getBytes()).getBytes());
		messageText.setText(text);

		Involved involved = new Involved();
		Authors authors = new Authors();
		authors.getAuthor().add(involved);

		NewMessageRequest messageRequest = new NewMessageRequest();
		messageRequest.setPrivateidentificationid("aa5577ed95c745cf9c4f77a5e9220505");
		messageRequest.setMessagetext(messageText);

		try
		{
			NewMessageResponse messageResponse = port.newMessage(messageRequest);
			System.out.println(messageResponse);
			System.out.println(messageResponse.getStatus());
		}
		catch (NewMessageFault_Exception e)
		{
			e.printStackTrace();
		}
	}
}
