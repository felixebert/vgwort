package de.ifcore.metis.client.exception;

public class MetisException extends RuntimeException
{
	private static final long serialVersionUID = -4111995068175152964L;

	public MetisException()
	{
		super();
	}

	public MetisException(String message)
	{
		super(message);
	}

	public MetisException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public MetisException(Throwable cause)
	{
		super(cause);
	}
}
