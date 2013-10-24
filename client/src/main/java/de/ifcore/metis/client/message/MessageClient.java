package de.ifcore.metis.client.message;

import javax.xml.ws.WebServiceException;

import de.ifcore.metis.client.AbstractServiceClient;
import de.ifcore.metis.client.MetisEndpoint;
import de.ifcore.metis.client.exception.MetisException;
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

	/**
	 * sends an {@link NewMessageRequest} via SOAP to METIS
	 * 
	 * @param request
	 * @throws MetisException
	 *             in case of ...
	 *             <ul>
	 *             <li>an validation / business error reported by metis</li>
	 *             <li>connection problems</li>
	 *             </ul>
	 */
	public void submit(NewMessageRequest request)
	{
		try
		{
			NewMessageResponse response = port.newMessage(request);
			System.out.println(response);
			System.out.println(response.getStatus());
		}
		catch (NewMessageFault | WebServiceException e)
		{
			throw new MetisException(e);
		}
	}
}
