package de.ifcore.metis.client.message;

import javax.xml.ws.BindingProvider;

import org.apache.commons.codec.binary.Base64;

import de.ifcore.metis.client.MetisEndpoint;
import de.ifcore.metis.jaxws.Authors;
import de.ifcore.metis.jaxws.Involved;
import de.ifcore.metis.jaxws.Message;
import de.ifcore.metis.jaxws.MessageService;
import de.ifcore.metis.jaxws.MessageText;
import de.ifcore.metis.jaxws.NewMessageFault_Exception;
import de.ifcore.metis.jaxws.NewMessageRequest;
import de.ifcore.metis.jaxws.NewMessageResponse;
import de.ifcore.metis.jaxws.Text;

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
		messageRequest.setPrivateidentificationid("");
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
