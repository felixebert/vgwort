package de.ifcore.metis.client.it;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import de.ifcore.metis.client.MetisEndpoint;
import de.ifcore.metis.client.pixel.Pixel;
import de.ifcore.metis.client.pixel.PixelClient;

public class PixelClientTest extends AbstractClientTest
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
		PixelClient client = new PixelClient(endpoint);

		List<Pixel> pixels = client.order(1);
		assertEquals(1, pixels.size());
	}
}
