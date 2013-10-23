package de.ifcore.metis.client.it;

import java.io.IOException;
import java.util.Properties;

import org.junit.BeforeClass;

public abstract class AbstractClientTest
{
	protected static String USER;
	protected static String PASSWORD;

	@BeforeClass
	public static void setProperties() throws IOException
	{
		if (System.getProperty("metis.user") != null)
		{
			USER = System.getProperty("metis.user");
			PASSWORD = System.getProperty("metis.pass");
		}
		else
		{
			Properties prop = new Properties();
			prop.load(AbstractClientTest.class.getClassLoader().getResourceAsStream("metis.properties"));
			USER = prop.getProperty("metis.user");
			PASSWORD = prop.getProperty("metis.pass");
			if ("true".equals(prop.getProperty("jaxws.dump")))
			{
				System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
				System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
				System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
				System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
			}
		}
	}
}
