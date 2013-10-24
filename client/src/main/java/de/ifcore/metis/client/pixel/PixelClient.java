package de.ifcore.metis.client.pixel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.ws.WebServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.ifcore.metis.client.AbstractServiceClient;
import de.ifcore.metis.client.MetisEndpoint;
import de.ifcore.metis.client.exception.MetisException;
import de.vgwort._1_0.pixelservice.OrderPixelFault;
import de.vgwort._1_0.pixelservice.PixelService;
import de.vgwort._1_0.pixelservice.xsd.OrderPixelRequest;
import de.vgwort._1_0.pixelservice.xsd.OrderPixelResponse;

public class PixelClient extends AbstractServiceClient<de.vgwort._1_0.pixelservice.Pixel>
{
	private static final Logger log = LoggerFactory.getLogger(PixelClient.class);

	public PixelClient(MetisEndpoint endpoint)
	{
		super(new PixelService().getPixelPort(), endpoint, "/services/1.0/pixelService.wsdl");
	}

	protected PixelClient(de.vgwort._1_0.pixelservice.Pixel port)
	{
		super(port);
	}

	/**
	 * sends an {@link OrderPixelRequest} via SOAP to METIS
	 * 
	 * @param count
	 *            number of pixels to order
	 * @return list of ordered pixels
	 * @throws MetisException
	 *             in case of ...
	 *             <ul>
	 *             <li>an validation / business error reported by metis</li>
	 *             <li>connection problems</li>
	 *             </ul>
	 */
	public List<Pixel> order(int count)
	{
		log.debug("ordering " + count + " pixels");
		OrderPixelRequest request = new OrderPixelRequest();
		request.setCount(count);

		try
		{
			OrderPixelResponse response = port.orderPixel(request);

			List<Pixel> pixels = new ArrayList<>();
			for (de.vgwort._1_0.pixelservice.xsd.Pixel pixelEntry : response.getPixels().getPixel())
			{
				Pixel pixel = new Pixel(pixelEntry.getPublicIdentificationId(),
						pixelEntry.getPrivateIdentificationId(), response.getDomain());
				pixels.add(pixel);
			}
			return Collections.unmodifiableList(pixels);
		}
		catch (OrderPixelFault | WebServiceException e)
		{
			throw new MetisException(e);
		}
	}
}
