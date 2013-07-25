package de.ifcore.metis.client;

import javax.xml.ws.BindingProvider;

import org.apache.axis.encoding.Base64;

import de.ifcore.metis.jaxws.message.Authors;
import de.ifcore.metis.jaxws.message.Involved;
import de.ifcore.metis.jaxws.message.Message;
import de.ifcore.metis.jaxws.message.MessageService;
import de.ifcore.metis.jaxws.message.MessageText;
import de.ifcore.metis.jaxws.message.NewMessageFault_Exception;
import de.ifcore.metis.jaxws.message.NewMessageRequest;
import de.ifcore.metis.jaxws.message.NewMessageResponse;
import de.ifcore.metis.jaxws.message.Text;

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

			NewMessageRequest messageRequest = new NewMessageRequest();
			messageRequest.setPrivateidentificationid("aa5577ed95c745cf9c4f77a5e9220505");
			messageRequest.setMessagetext(messageText);

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
