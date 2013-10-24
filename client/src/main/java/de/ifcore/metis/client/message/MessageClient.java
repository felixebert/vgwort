package de.ifcore.metis.client.message;

import javax.xml.ws.BindingProvider;

import de.ifcore.metis.client.MetisEndpoint;
import de.vgwort._1_3.messageservice.Message;
import de.vgwort._1_3.messageservice.MessageService;
import de.vgwort._1_3.messageservice.NewMessageFault;
import de.vgwort._1_3.messageservice.xsd.NewMessageRequest;
import de.vgwort._1_3.messageservice.xsd.NewMessageResponse;

public class MessageClient
{
	private final Message port;

	public MessageClient(MetisEndpoint endpoint)
	{
		this.port = new MessageService().getMessagePort();

		String wsdlUrl = endpoint.buildUrl("/services/1.0/messageService.wsdl");
		endpoint.configure((BindingProvider)port, wsdlUrl);
	}

	public void submit(NewMessageRequest request)
	{
		try
		{
			NewMessageResponse response = port.newMessage(request);
			System.out.println(response);
			System.out.println(response.getStatus());
		}
		catch (NewMessageFault e)
		{
			e.printStackTrace();
		}
	}
}
