package de.ifcore.metis.client.exception;

public class MetisClientException extends RuntimeException
{
	private static final long serialVersionUID = -4111995068175152964L;

	public MetisClientException()
	{
		super();
	}

	public MetisClientException(String message)
	{
		super(message);
	}

	public MetisClientException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public MetisClientException(Throwable cause)
	{
		super(cause);
	}
}
