package de.ifcore.metis.client.message;

import de.vgwort._1_3.messageservice.xsd.*;
import org.apache.commons.codec.binary.Base64;

import java.util.ArrayList;
import java.util.List;

public class MessageRequestBuilder
{
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

	protected Webranges buildWebranges()
	{
		Webranges webranges = new Webranges();
		for (String[] urls : this.webranges)
		{
			Webrange webrange = new Webrange();
			for (String url : urls)
			{
				webrange.getUrls().add(url);
			}
			webranges.getWebranges().add(webrange);
		}
		return webranges;
	}

	protected Parties buildParties()
	{
		Parties parties = new Parties();

		if (!this.authors.isEmpty())
		{
			parties.setAuthors(buildAuthors());
		}

		if (!this.translators.isEmpty())
		{
			parties.setTranslators(buildTranslators());
		}

		return parties;
	}

	protected Translators buildTranslators()
	{
		Translators translators = new Translators();
		for (Involved translator : this.translators)
		{
			translators.getTranslators().add(translator);
		}
		return translators;
	}

	protected Authors buildAuthors()
	{
		Authors authors = new Authors();
		for (Involved author : this.authors)
		{
			authors.getAuthors().add(author);
		}
		return authors;
	}

	protected MessageText buildMessageText()
	{
		MessageText messageText = new MessageText();
		messageText.setShorttext(shortText);
		messageText.setLyric(lyric);
		messageText.setAccessRestricted(accessRestricted);
		messageText.setText(buildText());
		return messageText;
	}

	protected Text buildText()
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
