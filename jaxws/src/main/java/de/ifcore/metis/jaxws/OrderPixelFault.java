package de.ifcore.metis.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://vgwort.de/1.0/PixelService/xsd}tomFault">
 *       &lt;sequence>
 *         &lt;element name="maxOrder" type="{http://vgwort.de/1.0/PixelService/xsd}int_0-Max"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "maxOrder" })
@XmlRootElement(name = "orderPixelFault")
public class OrderPixelFault extends TomFault
{

	protected int maxOrder;

	/**
	 * Gets the value of the maxOrder property.
	 * 
	 */
	public int getMaxOrder()
	{
		return maxOrder;
	}

	/**
	 * Sets the value of the maxOrder property.
	 * 
	 */
	public void setMaxOrder(int value)
	{
		this.maxOrder = value;
	}

}
