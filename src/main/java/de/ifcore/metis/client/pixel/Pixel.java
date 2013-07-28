package de.ifcore.metis.client.pixel;

public class Pixel
{
	private final String publicIdentificationId;
	private final String privateIdentificationId;

	public Pixel(String publicIdentificationId, String privateIdentificationId)
	{
		this.publicIdentificationId = publicIdentificationId;
		this.privateIdentificationId = privateIdentificationId;
	}

	public String getPublicIdentificationId()
	{
		return publicIdentificationId;
	}

	public String getPrivateIdentificationId()
	{
		return privateIdentificationId;
	}

	@Override
	public String toString()
	{
		return "Pixel [publicIdentificationId=" + publicIdentificationId + ", privateIdentificationId="
				+ privateIdentificationId + "]";
	}
}
