package de.ifcore.metis.client.message;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.binary.Base64;

import de.vgwort._1_3.messageservice.xsd.Authors;
import de.vgwort._1_3.messageservice.xsd.Involved;
import de.vgwort._1_3.messageservice.xsd.MessageText;
import de.vgwort._1_3.messageservice.xsd.NewMessageRequest;
import de.vgwort._1_3.messageservice.xsd.ObjectFactory;
import de.vgwort._1_3.messageservice.xsd.Parties;
import de.vgwort._1_3.messageservice.xsd.Text;
import de.vgwort._1_3.messageservice.xsd.Translators;
import de.vgwort._1_3.messageservice.xsd.Webrange;
import de.vgwort._1_3.messageservice.xsd.Webranges;

public class MessageRequestBuilder
{
	private static final ObjectFactory objectFactory = new ObjectFactory();

	private String privatePixelId;

	private String shortText;
	private String plainText;
	private byte[] pdf;
	private boolean lyric;
	private Boolean accessRestricted;

	private List<String[]> webranges = new ArrayList<>();

	private List<Involved> authors = new ArrayList<>();
	private List<Involved> translators = new ArrayList<>();

	public String getPrivatePixelId()
	{
		return privatePixelId;
	}

	public void setPrivatePixelId(String privatePixelId)
	{
		this.privatePixelId = privatePixelId;
	}

	public String getShortText()
	{
		return shortText;
	}

	public void setShortText(String shortText)
	{
		this.shortText = shortText;
	}

	public String getPlainText()
	{
		return plainText;
	}

	public void setPlainText(String plainText)
	{
		this.plainText = plainText;
	}

	public byte[] getPdf()
	{
		return pdf;
	}

	public void setPdf(byte[] pdf)
	{
		this.pdf = pdf;
	}

	public boolean isLyric()
	{
		return lyric;
	}

	public void setLyric(boolean lyric)
	{
		this.lyric = lyric;
	}

	public Boolean getAccessRestricted()
	{
		return accessRestricted;
	}

	public void setAccessRestricted(Boolean accessRestricted)
	{
		this.accessRestricted = accessRestricted;
	}

	public List<String[]> getWebranges()
	{
		return webranges;
	}

	public void setWebranges(List<String[]> webranges)
	{
		this.webranges = webranges;
	}

	public void addWebrange(String url)
	{
		addWebrange(new String[] { url });
	}

	public void addWebrange(String[] urls)
	{
		webranges.add(urls);
	}

	public List<Involved> getAuthors()
	{
		return authors;
	}

	public void setAuthors(List<Involved> authors)
	{
		this.authors = authors;
	}

	public void addAuthor(Involved author)
	{
		authors.add(author);
	}

	public List<Involved> getTranslators()
	{
		return translators;
	}

	public void setTranslators(List<Involved> translators)
	{
		this.translators = translators;
	}

	public void addTranslator(Involved translator)
	{
		translators.add(translator);
	}

	public NewMessageRequest build()
	{
		NewMessageRequest messageRequest = new NewMessageRequest();
		messageRequest.setPrivateidentificationid(privatePixelId);
		messageRequest.setMessagetext(buildMessageText());
		messageRequest.setParties(buildParties());
		messageRequest.setWebranges(buildWebranges());
		return messageRequest;
	}

	public Webranges buildWebranges()
	{
		Webranges webranges = new Webranges();
		for (String[] urls : this.webranges)
		{
			Webrange webrange = new Webrange();
			for (String url : urls)
			{
				webrange.getUrl().add(url);
			}
			webranges.getWebrange().add(webrange);
		}
		return webranges;
	}

	public Parties buildParties()
	{
		Parties parties = new Parties();

		if (!this.authors.isEmpty())
		{
			parties.getContent().add(objectFactory.createPartiesAuthors(buildAuthors()));
		}

		if (!this.translators.isEmpty())
		{
			parties.getContent().add(objectFactory.createPartiesTranslators(buildTranslators()));
		}

		return parties;
	}

	public Translators buildTranslators()
	{
		Translators translators = new Translators();
		for (Involved translator : this.translators)
		{
			translators.getTranslator().add(translator);
		}
		return translators;
	}

	public Authors buildAuthors()
	{
		Authors authors = new Authors();
		for (Involved author : this.authors)
		{
			authors.getAuthor().add(author);
		}
		return authors;
	}

	public MessageText buildMessageText()
	{
		MessageText messageText = new MessageText();
		messageText.setShorttext(shortText);
		messageText.setLyric(lyric);
		messageText.setAccessRestricted(accessRestricted);
		messageText.setText(buildText());
		return messageText;
	}

	public Text buildText()
	{
		Text text = new Text();
		if (plainText != null)
		{
			text.setPlainText(base64Encode(plainText.getBytes()));
		}
		if (pdf != null)
		{
			text.setPdf(base64Encode(pdf));
		}
		return text;
	}

	private byte[] base64Encode(byte[] bytes)
	{
		return Base64.encodeBase64String(bytes).getBytes();
	}
}
