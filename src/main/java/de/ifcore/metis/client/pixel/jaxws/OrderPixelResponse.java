
package de.ifcore.metis.client.pixel.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="domain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderDateTime" type="{http://vgwort.de/1.0/PixelService/xsd}stringDateType"/>
 *         &lt;element name="pixels" type="{http://vgwort.de/1.0/PixelService/xsd}Pixels"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "domain",
    "orderDateTime",
    "pixels"
})
@XmlRootElement(name = "orderPixelResponse")
public class OrderPixelResponse {

    @XmlElement(required = true)
    protected String domain;
    @XmlElement(required = true)
    protected String orderDateTime;
    @XmlElement(required = true)
    protected Pixels pixels;

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Gets the value of the orderDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderDateTime() {
        return orderDateTime;
    }

    /**
     * Sets the value of the orderDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDateTime(String value) {
        this.orderDateTime = value;
    }

    /**
     * Gets the value of the pixels property.
     * 
     * @return
     *     possible object is
     *     {@link Pixels }
     *     
     */
    public Pixels getPixels() {
        return pixels;
    }

    /**
     * Sets the value of the pixels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pixels }
     *     
     */
    public void setPixels(Pixels value) {
        this.pixels = value;
    }

}
