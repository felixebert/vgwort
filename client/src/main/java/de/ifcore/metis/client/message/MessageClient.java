package de.ifcore.metis.client.message;

import de.ifcore.metis.client.AbstractServiceClient;
import de.ifcore.metis.client.MetisEndpoint;
import de.vgwort._1_3.messageservice.Message;
import de.vgwort._1_3.messageservice.MessageService;
import de.vgwort._1_3.messageservice.NewMessageFault;
import de.vgwort._1_3.messageservice.xsd.NewMessageRequest;
import de.vgwort._1_3.messageservice.xsd.NewMessageResponse;

public class MessageClient extends AbstractServiceClient<Message>
{
	public MessageClient(MetisEndpoint endpoint)
	{
		super(new MessageService().getMessagePort(), endpoint, "/services/1.0/messageService.wsdl");
	}

	protected MessageClient(Message port)
	{
		super(port);
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
