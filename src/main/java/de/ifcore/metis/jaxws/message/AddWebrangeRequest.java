
package de.ifcore.metis.jaxws.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="webrange" type="{http://vgwort.de/1.2/MessageService/xsd}Webrange"/>
 *       &lt;/sequence>
 *       &lt;attribute name="privateidentificationid" use="required" type="{http://vgwort.de/1.2/MessageService/xsd}pixelIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "webrange"
})
@XmlRootElement(name = "addWebrangeRequest")
public class AddWebrangeRequest {

    @XmlElement(required = true)
    protected Webrange webrange;
    @XmlAttribute(name = "privateidentificationid", required = true)
    protected String privateidentificationid;

    /**
     * Gets the value of the webrange property.
     * 
     * @return
     *     possible object is
     *     {@link Webrange }
     *     
     */
    public Webrange getWebrange() {
        return webrange;
    }

    /**
     * Sets the value of the webrange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Webrange }
     *     
     */
    public void setWebrange(Webrange value) {
        this.webrange = value;
    }

    /**
     * Gets the value of the privateidentificationid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateidentificationid() {
        return privateidentificationid;
    }

    /**
     * Sets the value of the privateidentificationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateidentificationid(String value) {
        this.privateidentificationid = value;
    }

}
