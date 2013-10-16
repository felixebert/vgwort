package de.ifcore.metis.client.message;

import javax.xml.ws.BindingProvider;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.ifcore.metis.client.MetisEndpoint;
import de.vgwort._1_3.messageservice.Message;
import de.vgwort._1_3.messageservice.MessageService;
import de.vgwort._1_3.messageservice.NewMessageFault;
import de.vgwort._1_3.messageservice.xsd.Authors;
import de.vgwort._1_3.messageservice.xsd.Involved;
import de.vgwort._1_3.messageservice.xsd.MessageText;
import de.vgwort._1_3.messageservice.xsd.NewMessageRequest;
import de.vgwort._1_3.messageservice.xsd.NewMessageResponse;
import de.vgwort._1_3.messageservice.xsd.ObjectFactory;
import de.vgwort._1_3.messageservice.xsd.Parties;
import de.vgwort._1_3.messageservice.xsd.Text;
import de.vgwort._1_3.messageservice.xsd.Webrange;
import de.vgwort._1_3.messageservice.xsd.Webranges;

public class MessageClient
{
	private static final Logger log = LoggerFactory.getLogger(MessageClient.class);
	private final Message port;

	public MessageClient(MetisEndpoint endpoint)
	{
		this.port = new MessageService().getMessagePort();

		String wsdlUrl = endpoint.buildUrl("/services/1.0/messageService.wsdl");
		endpoint.configure((BindingProvider)port, wsdlUrl);
	}

	public void submitText()
	{
		ObjectFactory objectFactory = new ObjectFactory();

		MessageText messageText = new MessageText();
		messageText.setShorttext("Lösung von GTA IV");
		messageText.setLyric(false);
		Text text = new Text();
		text.setPlainText(Base64.encodeBase64String(new String(new char[1000]).replace("\0", "test123 ").getBytes())
				.getBytes());
		messageText.setText(text);

		Involved involved = new Involved();
		involved.getContent().add(objectFactory.createInvolvedFirstName("René"));
		involved.getContent().add(objectFactory.createInvolvedSurName("Meyer"));
		Authors authors = new Authors();
		authors.getAuthor().add(involved);
		Parties parties = new Parties();
		parties.getContent().add(objectFactory.createPartiesAuthors(authors));

		Webranges webranges = new Webranges();
		Webrange webrange = new Webrange();
		webrange.getUrl().add("http://www.mogelpower.de/");
		webranges.getWebrange().add(webrange);

		NewMessageRequest messageRequest = new NewMessageRequest();
		messageRequest.setPrivateidentificationid("0337deb651024ae89703114bde198c04");
		messageRequest.setMessagetext(messageText);
		messageRequest.setParties(parties);
		messageRequest.setWebranges(webranges);

		try
		{
			NewMessageResponse messageResponse = port.newMessage(messageRequest);
			System.out.println(messageResponse);
			System.out.println(messageResponse.getStatus());
		}
		catch (NewMessageFault e)
		{
			e.printStackTrace();
		}
	}
}
