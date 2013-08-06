package de.ifcore.metis.client.pixel;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.ifcore.metis.client.MetisEndpoint;

public class PixelClientIntegrationTest
{
	private static final Logger log = LoggerFactory.getLogger(PixelClientIntegrationTest.class);

	@Test
	@Ignore
	public void testOrder()
	{
		MetisEndpoint endpoint = new MetisEndpoint("tom-test.vgwort.de", "xx", "yy");
		PixelClient client = new PixelClient(endpoint);

		List<Pixel> pixels = client.order(1);
		assertEquals(1, pixels.size());
		log.debug(pixels.iterator().next().toString());
	}
}
