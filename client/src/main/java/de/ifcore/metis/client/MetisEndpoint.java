package de.ifcore.metis.client;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import org.apache.commons.codec.binary.Base64;

public class MetisEndpoint
{
	private final String hostname;
	private final String user;
	private final String password;

	private transient Map<String, List<String>> requestHeaders;

	public MetisEndpoint(String hostname, String user, String password)
	{
		this.hostname = hostname;
		this.user = user;
		this.password = password;
	}

	public String getHostname()
	{
		return hostname;
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

	/**
	 * generates required request headers, especially the headers for the basic HTTP-Authentication
	 * 
	 * @return
	 */
	protected Map<String, List<String>> generateRequestHeaders()
	{
		Map<String, List<String>> headers = new HashMap<String, List<String>>();
		String base64String = Base64.encodeBase64String((user + ":" + password).getBytes());
		headers.put("Authorization", Collections.singletonList("Basic " + base64String));
		return Collections.unmodifiableMap(headers);
	}

	/**
	 * adds the wsdlUrl and additional request headers to the BindingProvider
	 * 
	 * @param bindingProvider
	 * @param wsdlUrl
	 */
	public void configure(BindingProvider bindingProvider, String wsdlUrl)
	{
		Map<String, Object> requestContext = bindingProvider.getRequestContext();
		requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsdlUrl);
		requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, getRequestHeaders());
	}

	public String buildUrl(String path)
	{
		return "https://" + hostname + path;
	}
}
