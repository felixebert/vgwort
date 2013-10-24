package de.ifcore.metis.client.pixel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import de.ifcore.metis.client.exception.MetisException;
import de.vgwort._1_0.pixelservice.OrderPixelFault;
import de.vgwort._1_0.pixelservice.xsd.OrderPixelRequest;
import de.vgwort._1_0.pixelservice.xsd.OrderPixelResponse;
import de.vgwort._1_0.pixelservice.xsd.Pixel;
import de.vgwort._1_0.pixelservice.xsd.Pixels;

public class PixelClientTest
{
	private de.vgwort._1_0.pixelservice.Pixel port;

	@Before
	public void setup()
	{
		port = mock(de.vgwort._1_0.pixelservice.Pixel.class);
	}

	@Test
	public void shouldReturnPixels() throws OrderPixelFault
	{
		when(port.orderPixel(Mockito.any(OrderPixelRequest.class))).thenReturn(buildResponse(mockPixel(), mockPixel()));
		PixelClient client = new PixelClient(port);

		List<de.ifcore.metis.client.pixel.Pixel> result = client.order(2);
		assertNotNull(result);
		assertEquals(2, result.size());
		assertEquals("123", result.get(0).getPrivateId());
		assertEquals("456", result.get(0).getPublicId());
	}

	@Test(expected = MetisException.class)
	public void shouldThrowExceptionOnServerError() throws OrderPixelFault
	{
		when(port.orderPixel(Mockito.any(OrderPixelRequest.class))).thenThrow(new OrderPixelFault("serror", null));
		PixelClient client = new PixelClient(port);
		client.order(1);
	}

	private Pixel mockPixel()
	{
		Pixel pixel = new Pixel();
		pixel.setPrivateIdentificationId("123");
		pixel.setPublicIdentificationId("456");
		return pixel;
	}

	private OrderPixelResponse buildResponse(Pixel... pixels)
	{
		OrderPixelResponse response = new OrderPixelResponse();
		response.setPixels(new Pixels());
		for (Pixel pixel : pixels)
		{
			response.getPixels().getPixel().add(pixel);
		}
		return response;
	}
}
