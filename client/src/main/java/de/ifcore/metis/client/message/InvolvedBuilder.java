package de.ifcore.metis.client.message;

import de.vgwort._1_3.messageservice.xsd.Involved;
import de.vgwort._1_3.messageservice.xsd.ObjectFactory;

public class InvolvedBuilder
{
	private static final ObjectFactory objectFactory = new ObjectFactory();

	public static Involved byCode(String code)
	{
		Involved involved = new Involved();
		involved.getContent().add(objectFactory.createInvolvedCode(code));
		return involved;
	}

	public static Involved byCardnumber(String firstName, String surName, Integer cardNumber)
	{
		Involved involved = new Involved();
		involved.getContent().add(objectFactory.createInvolvedFirstName(firstName));
		involved.getContent().add(objectFactory.createInvolvedSurName(surName));
		involved.getContent().add(objectFactory.createInvolvedCardNumber(cardNumber));
		return involved;
	}

	public static Involved byName(String firstName, String surName)
	{
		Involved involved = new Involved();
		involved.getContent().add(objectFactory.createInvolvedFirstName(firstName));
		involved.getContent().add(objectFactory.createInvolvedSurName(surName));
		return involved;
	}
}
