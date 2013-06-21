package de.schreibfabrik.vgwort.xml;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public interface XmlService
{
	public ByteArrayOutputStream marshall(Object object);

	public Object unmarshal(InputStream stream);
}
