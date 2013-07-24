package de.ifcore.metis.client;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import org.apache.axis.encoding.Base64;

public class MetisEndpoint
{
	private final String url;
	private final String user;
	private final String password;

	private transient Map<String, List<String>> requestHeaders;

	public MetisEndpoint(String url, String user, String password)
	{
		this.url = url;
		this.user = user;
		this.password = password;
	}

	public String getUrl()
	{
		return url;
	}

	public String getUser()
	{
		return user;
	}

	public String getPassword()
	{
		return password;
	}

	protected Map<String, List<String>> getRequestHeaders()
	{
		if (requestHeaders == null)
		{
			requestHeaders = generateRequestHeaders();
		}
		return requestHeaders;
	}

	protected Map<String, List<String>> generateRequestHeaders()
	{
		Map<String, List<String>> headers = new HashMap<String, List<String>>();
		String base64String = Base64.encode((user + ":" + password).getBytes());
		headers.put("Authorization", Collections.singletonList("Basic " + base64String));
		return Collections.unmodifiableMap(headers);
	}

	public void configure(BindingProvider bindingProvider, String wsdlUrl)
	{
		Map<String, Object> requestContext = bindingProvider.getRequestContext();
		requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsdlUrl);
		requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, getRequestHeaders());
	}

	public String buildUrl(String path)
	{
		return url + path;
	}
}
