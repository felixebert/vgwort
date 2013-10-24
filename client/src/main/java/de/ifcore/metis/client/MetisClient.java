package de.ifcore.metis.client;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import de.ifcore.metis.client.message.MessageClient;
import de.ifcore.metis.client.pixel.Pixel;
import de.ifcore.metis.client.pixel.PixelClient;
import de.vgwort._1_3.messageservice.xsd.NewMessageRequest;

@Named
public class MetisClient
{
	private final PixelClient pixelClient;
	private final MessageClient messageClient;

	@Inject
	public MetisClient(MetisEndpoint endpoint)
	{
		this.pixelClient = new PixelClient(endpoint);
		this.messageClient = new MessageClient(endpoint);
	}

	/**
	 * @see PixelClient#order(int)
	 */
	public List<Pixel> orderPixels(int count)
	{
		return pixelClient.order(count);
	}

	/**
	 * @see MessageClient#submit(NewMessageRequest)
	 */
	public void submitMessage(NewMessageRequest request)
	{
		messageClient.submit(request);
	}
}
