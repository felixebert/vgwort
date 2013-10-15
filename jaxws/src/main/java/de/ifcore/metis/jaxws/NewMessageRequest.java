
package de.ifcore.metis.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parties" type="{http://vgwort.de/1.3/MessageService/xsd}Parties"/>
 *         &lt;element name="messagetext" type="{http://vgwort.de/1.3/MessageService/xsd}MessageText"/>
 *         &lt;element name="webranges" type="{http://vgwort.de/1.3/MessageService/xsd}Webranges"/>
 *       &lt;/sequence>
 *       &lt;attribute name="privateidentificationid" use="required" type="{http://vgwort.de/1.3/MessageService/xsd}pixelIDType" />
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
     * Ruft den Wert der parties-Eigenschaft ab.
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
     * Legt den Wert der parties-Eigenschaft fest.
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
     * Ruft den Wert der messagetext-Eigenschaft ab.
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
     * Legt den Wert der messagetext-Eigenschaft fest.
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
     * Ruft den Wert der webranges-Eigenschaft ab.
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
     * Legt den Wert der webranges-Eigenschaft fest.
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
     * Ruft den Wert der privateidentificationid-Eigenschaft ab.
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
     * Legt den Wert der privateidentificationid-Eigenschaft fest.
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
