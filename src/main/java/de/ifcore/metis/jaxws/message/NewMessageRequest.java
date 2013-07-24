
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
 *         &lt;element name="parties" type="{http://vgwort.de/1.2/MessageService/xsd}Parties"/>
 *         &lt;element name="messagetext" type="{http://vgwort.de/1.2/MessageService/xsd}MessageText"/>
 *         &lt;element name="webranges" type="{http://vgwort.de/1.2/MessageService/xsd}Webranges"/>
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
    "parties",
    "messagetext",
    "webranges"
})
@XmlRootElement(name = "newMessageRequest")
public class NewMessageRequest {

    @XmlElement(required = true)
    protected Parties parties;
    @XmlElement(required = true)
    protected MessageText messagetext;
    @XmlElement(required = true)
    protected Webranges webranges;
    @XmlAttribute(name = "privateidentificationid", required = true)
    protected String privateidentificationid;

    /**
     * Gets the value of the parties property.
     * 
     * @return
     *     possible object is
     *     {@link Parties }
     *     
     */
    public Parties getParties() {
        return parties;
    }

    /**
     * Sets the value of the parties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parties }
     *     
     */
    public void setParties(Parties value) {
        this.parties = value;
    }

    /**
     * Gets the value of the messagetext property.
     * 
     * @return
     *     possible object is
     *     {@link MessageText }
     *     
     */
    public MessageText getMessagetext() {
        return messagetext;
    }

    /**
     * Sets the value of the messagetext property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageText }
     *     
     */
    public void setMessagetext(MessageText value) {
        this.messagetext = value;
    }

    /**
     * Gets the value of the webranges property.
     * 
     * @return
     *     possible object is
     *     {@link Webranges }
     *     
     */
    public Webranges getWebranges() {
        return webranges;
    }

    /**
     * Sets the value of the webranges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Webranges }
     *     
     */
    public void setWebranges(Webranges value) {
        this.webranges = value;
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
