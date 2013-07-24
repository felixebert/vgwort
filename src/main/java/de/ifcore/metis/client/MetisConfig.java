package de.ifcore.metis.client;

public class MetisConfig
{
	private final String user;
	private final String password;

	public MetisConfig(String user, String password)
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

	@Override
	public String toString()
	{
		return "MetisConfig [user=" + user + ", password=" + password + "]";
	}
}
