package de.ifcore.metis.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MetisClient
{
	private final MetisEndpoint endpoint;

	@Autowired
	public MetisClient(MetisEndpoint endpoint)
	{
		this.endpoint = endpoint;
	}

	public void orderPixels(int count)
	{
		PixelClient client = new PixelClient(endpoint);
		client.order(count);
	}

	public void submitText()
	{
		MessageClient client = new MessageClient(endpoint);
		client.submitText();
	}
}
