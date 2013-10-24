package de.ifcore.metis.client.it;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import de.ifcore.metis.client.MetisEndpoint;
import de.ifcore.metis.client.exception.MetisException;
import de.ifcore.metis.client.pixel.Pixel;
import de.ifcore.metis.client.pixel.PixelClient;

public class OrderPixelTest extends AbstractClientTest
{
	private PixelClient client;

	@Before
	public void setup()
	{
		client = new PixelClient(new MetisEndpoint("tom-test.vgwort.de", USER, PASSWORD));
	}

	@Test
	public void shouldOrderPixels()
	{
		List<Pixel> pixels = client.order(1);
		assertEquals(1, pixels.size());
	}

	@Test(expected = MetisException.class)
	public void shouldHandleBusinessError()
	{
		client.order(Integer.MAX_VALUE);
	}

	@Test(expected = MetisException.class)
	public void shouldHandleValidationError()
	{
		client.order(-1);
	}
}
