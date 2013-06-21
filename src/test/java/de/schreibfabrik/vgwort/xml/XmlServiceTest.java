package de.schreibfabrik.vgwort.xml;

import static org.junit.Assert.assertFalse;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.xml.sax.SAXException;

import de.schreibfabrik.vgwort.IntegrationTest;
import de.schreibfabrik.vgwort.xml.domain.OrderPixelRequest;

@RunWith(SpringJUnit4ClassRunner.class)
public class XmlServiceTest extends IntegrationTest
{
	@Autowired
	private XmlService xmlService;

	@Test
	public void testMarshall() throws JAXBException, SAXException, IOException
	{
		OrderPixelRequest orderPixelRequest = new OrderPixelRequest();
		orderPixelRequest.setCount(10);
		ByteArrayOutputStream stream = xmlService.marshall(orderPixelRequest);
		assertFalse(stream.size() == 0);
	}

	@Test
	public void testUnmarshall()
	{
	}
}
