package de.ifcore.metis.client;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import de.ifcore.metis.client.message.MessageClient;
import de.ifcore.metis.client.pixel.Pixel;
import de.ifcore.metis.client.pixel.PixelClient;

@Named
public class MetisClient
{
	private final MetisEndpoint endpoint;

	@Inject
	public MetisClient(MetisEndpoint endpoint)
	{
		this.endpoint = endpoint;
	}

	public List<Pixel> orderPixels(int count)
	{
		PixelClient client = new PixelClient(endpoint);
		return client.order(count);
	}

	public void submitText()
	{
		MessageClient client = new MessageClient(endpoint);
		client.submitText();
	}
}
