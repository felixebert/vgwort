package de.ifcore.metis.client.pixel;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import de.ifcore.metis.client.MetisEndpoint;

public class PixelClientIntegrationTest
{
	@Test
	@Ignore
	public void testOrder()
	{
		MetisEndpoint endpoint = new MetisEndpoint("tom-test.vgwort.de", "user", "pw");
		PixelClient client = new PixelClient(endpoint);

		List<Pixel> pixels = client.order(1);
		assertEquals(1, pixels.size());
		System.out.println(pixels.iterator().next().toString());
	}
}
