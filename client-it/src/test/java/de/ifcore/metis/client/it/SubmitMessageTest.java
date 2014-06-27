package de.ifcore.metis.client.it;

import de.ifcore.metis.client.MetisEndpoint;
import de.ifcore.metis.client.message.InvolvedBuilder;
import de.ifcore.metis.client.message.MessageClient;
import de.ifcore.metis.client.message.MessageRequestBuilder;
import de.vgwort._1_3.messageservice.xsd.NewMessageRequest;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Before;
import org.junit.Test;

public class SubmitMessageTest extends AbstractClientTest
{
	private MessageClient client;

	@Before
	public void setup()
	{
		client = new MessageClient(new MetisEndpoint("tom-test.vgwort.de", USER, PASSWORD));
	}

	@Test
	public void testSubmit()
	{
		MessageRequestBuilder builder = new MessageRequestBuilder();
		builder.setPrivatePixelId("810fb95144754016a81b9e3b8cb23fde");
		builder.addAuthor(InvolvedBuilder.build("Hans", "Müller", null, null));
		builder.setPlainText(RandomStringUtils.randomAlphabetic(2000));
		builder.setShortText("Ein Test-Text!");
		builder.addWebrange("http://www.mogelpower.de/cheats.test.html");
		NewMessageRequest request = builder.build();
		client.submit(request);
	}
}
