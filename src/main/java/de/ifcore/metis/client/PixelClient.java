package de.ifcore.metis.client;

import javax.xml.ws.BindingProvider;

import de.ifcore.metis.jaxws.pixel.OrderPixelFault_Exception;
import de.ifcore.metis.jaxws.pixel.OrderPixelRequest;
import de.ifcore.metis.jaxws.pixel.OrderPixelResponse;
import de.ifcore.metis.jaxws.pixel.Pixel;
import de.ifcore.metis.jaxws.pixel.PixelService;
import de.ifcore.metis.jaxws.pixel.Pixel_Type;

public class PixelClient
{
	private final Pixel port;

	public PixelClient(MetisEndpoint endpoint)
	{
		this.port = new PixelService().getPixelPort();

		String wsdlUrl = endpoint.buildUrl("/services/1.0/pixelService.wsdl");
		endpoint.configure((BindingProvider)port, wsdlUrl);
	}

	public void order(int count)
	{
		try
		{
			OrderPixelRequest request = new OrderPixelRequest();
			request.setCount(count);

			OrderPixelResponse response = port.orderPixel(request);
			for (Pixel_Type pixel : response.getPixels().getPixel())
			{
				System.out.println("public: " + pixel.getPublicIdentificationId());
				System.out.println("private: " + pixel.getPrivateIdentificationId());
			}
		}
		catch (OrderPixelFault_Exception e)
		{
			e.printStackTrace();
		}
	}
}
