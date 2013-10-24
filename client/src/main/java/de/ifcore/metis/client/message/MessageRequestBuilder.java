package de.ifcore.metis.client.message;

import java.util.List;

import org.apache.commons.codec.binary.Base64;

import de.vgwort._1_3.messageservice.xsd.Authors;
import de.vgwort._1_3.messageservice.xsd.Involved;
import de.vgwort._1_3.messageservice.xsd.MessageText;
import de.vgwort._1_3.messageservice.xsd.NewMessageRequest;
import de.vgwort._1_3.messageservice.xsd.ObjectFactory;
import de.vgwort._1_3.messageservice.xsd.Parties;
import de.vgwort._1_3.messageservice.xsd.Text;
import de.vgwort._1_3.messageservice.xsd.Webrange;
import de.vgwort._1_3.messageservice.xsd.Webranges;

public class MessageRequestBuilder
{
	private String privatePixelId;
	private String title;
	private byte[] text;
	private boolean lyric;
	private boolean accessRestricted;
	private List<String> urls;
	private List<Involved> authors;
	private List<Involved> translators;

	public NewMessageRequest build()
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

		return messageRequest;
	}
}
