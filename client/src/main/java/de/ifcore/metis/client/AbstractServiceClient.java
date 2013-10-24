package de.ifcore.metis.client;

import javax.xml.ws.BindingProvider;

public abstract class AbstractServiceClient<T>
{
	protected final T port;

	protected AbstractServiceClient(T port)
	{
		this.port = port;
	}

	protected AbstractServiceClient(T port, MetisEndpoint endpoint, String path)
	{
		String wsdlUrl = endpoint.buildUrl(path);
		endpoint.configure((BindingProvider)port, wsdlUrl);
		this.port = port;
	}
}
