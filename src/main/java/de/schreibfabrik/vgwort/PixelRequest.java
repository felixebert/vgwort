package de.schreibfabrik.vgwort;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import de.schreibfabrik.vgwort.xml.XmlService;

@Service
public class PixelRequest
{
	@Autowired
	private XmlService xmlService;

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PixelRequest service = context.getBean(PixelRequest.class);
		service.sendRequest();
	}

	public void sendRequest()
	{
		HttpHost targetHost = new HttpHost("tom.vgwort.de", 443, "https");
		DefaultHttpClient httpclient = new DefaultHttpClient();
		AuthCache authCache = new BasicAuthCache();
		BasicScheme basicAuth = new BasicScheme();
		authCache.put(targetHost, basicAuth);
		BasicHttpContext localcontext = new BasicHttpContext();
		localcontext.setAttribute(ClientContext.AUTH_CACHE, authCache);

		httpclient.getCredentialsProvider().setCredentials(
				new AuthScope(targetHost.getHostName(), targetHost.getPort()),
				new UsernamePasswordCredentials("XXX", "XXX"));

		HttpPost httpPost = new HttpPost("/services/1.0/pixelOrder");
		try
		{
			httpPost.setEntity(new StringEntity(
					"<?xml version='1.0' encoding='UTF-8'?><soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"><soapenv:Body><ns1:orderPixelRequest xmlns:ns1=\"http://vgwort.de/1.0/PixelService/xsd\"><ns1:count>3</ns1:count></ns1:orderPixelRequest></soapenv:Body></soapenv:Envelope>",
					"UTF-8"));
		}
		catch (UnsupportedEncodingException e1)
		{
			e1.printStackTrace();
		}

		System.out.println("executing request: " + httpPost.getRequestLine());
		System.out.println("to target: " + targetHost);

		try
		{
			System.out.println("to target: " + IOUtils.toString(httpPost.getEntity().getContent()));
		}
		catch (IllegalStateException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		catch (IOException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try
		{
			HttpResponse response = httpclient.execute(targetHost, httpPost, localcontext);
			System.out.println(response.getStatusLine());
			try
			{
				HttpEntity entity = response.getEntity();
				EntityUtils.consume(entity);
			}
			finally
			{
				httpPost.releaseConnection();
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
