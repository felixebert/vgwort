package de.ifcore.metis.client.it;

import org.junit.Before;
import org.junit.Test;

import de.ifcore.metis.client.MetisEndpoint;
import de.ifcore.metis.client.message.MessageClient;

public class MessageClientTest extends AbstractClientTest
{
	private MetisEndpoint endpoint;

	@Before
	public void setup()
	{
		endpoint = new MetisEndpoint("tom-test.vgwort.de", USER, PASSWORD);
	}

	@Test
	public void testOrder()
	{
		MessageClient client = new MessageClient(endpoint);
		client.submitText();
	}
}
