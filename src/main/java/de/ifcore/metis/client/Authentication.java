package de.ifcore.metis.client;

public class Authentication
{
	private final String user;
	private final String password;

	public Authentication(String user, String password)
	{
		this.user = user;
		this.password = password;
	}

	public String getUser()
	{
		return user;
	}

	public String getPassword()
	{
		return password;
	}
}
