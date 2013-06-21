package de.schreibfabrik.vgwort.xml;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import javax.inject.Inject;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.stereotype.Service;

@Service
public class XmlServiceImpl implements XmlService
{
	private final Marshaller marshaller;
	private final Unmarshaller unmarshaller;

	@Inject
	public XmlServiceImpl(Marshaller marshaller, Unmarshaller unmarshaller)
	{
		this.marshaller = marshaller;
		this.unmarshaller = unmarshaller;
	}

	@Override
	public ByteArrayOutputStream marshall(Object object)
	{
		try
		{
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			marshaller.marshal(object, new StreamResult(byteArrayOutputStream));
			return byteArrayOutputStream;
		}
		catch (Exception e)
		{
			throw new IllegalStateException(e);
		}
	}

	@Override
	public Object unmarshal(InputStream stream)
	{
		try
		{
			StreamSource source = new StreamSource(stream);
			return unmarshaller.unmarshal(source);
		}
		catch (Exception e)
		{
			throw new IllegalStateException(e);
		}
	}
}
