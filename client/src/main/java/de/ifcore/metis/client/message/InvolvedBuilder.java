package de.ifcore.metis.client.message;

import de.vgwort._1_3.messageservice.xsd.Involved;

public class InvolvedBuilder
{
	/**
	 * chooses the most accurate option to build an {@link Involved} instance - e.g. prefers to set the cardNumber (see
	 * METIS documentation)
	 *
	 * @param firstName  Author firstName
	 * @param surName    Author surName
	 * @param cardNumber VG WORT Karteinummer
	 * @param code       agency abbreviation
	 * @return instance of {@link Involved} containing cardnumber + firstname + surname OR firstname + surName OR code
	 */
	public static Involved build(String firstName, String surName, Integer cardNumber, String code)
	{
		if (cardNumber != null)
		{
			return byCardnumber(firstName, surName, cardNumber);
		}
		if (firstName != null && surName != null)
		{
			return byName(firstName, surName);
		}
		return byCode(code);
	}

	public static Involved byCode(String code)
	{
		Involved involved = new Involved();
		involved.setCode(code);
		return involved;
	}

	public static Involved byName(String firstName, String surName)
	{
		Involved involved = new Involved();
		involved.setFirstName(firstName);
		involved.setSurName(surName);
		return involved;
	}

	public static Involved byCardnumber(String firstName, String surName, Integer cardNumber)
	{
		Involved involved = byName(firstName, surName);
		involved.setCardNumber(cardNumber);
		return involved;
	}

}
