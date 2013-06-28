
package de.schreibfabrik.vgwort.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Pixel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pixel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="publicIdentificationId" type="{http://vgwort.de/1.0/PixelService/xsd}pixelIDType" />
 *       &lt;attribute name="privateIdentificationId" type="{http://vgwort.de/1.0/PixelService/xsd}pixelIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pixel")
public class Pixel_Type {

    @XmlAttribute(name = "publicIdentificationId")
    protected String publicIdentificationId;
    @XmlAttribute(name = "privateIdentificationId")
    protected String privateIdentificationId;

    /**
     * Gets the value of the publicIdentificationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicIdentificationId() {
        return publicIdentificationId;
    }

    /**
     * Sets the value of the publicIdentificationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicIdentificationId(String value) {
        this.publicIdentificationId = value;
    }

    /**
     * Gets the value of the privateIdentificationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateIdentificationId() {
        return privateIdentificationId;
    }

    /**
     * Sets the value of the privateIdentificationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateIdentificationId(String value) {
        this.privateIdentificationId = value;
    }

}
