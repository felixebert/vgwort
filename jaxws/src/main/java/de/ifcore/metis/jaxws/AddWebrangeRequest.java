
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
 *         &lt;element name="webrange" type="{http://vgwort.de/1.3/MessageService/xsd}Webrange"/>
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
    "webrange"
})
@XmlRootElement(name = "addWebrangeRequest")
public class AddWebrangeRequest {

    @XmlElement(required = true)
    protected Webrange webrange;
    @XmlAttribute(name = "privateidentificationid", required = true)
    protected String privateidentificationid;

    /**
     * Ruft den Wert der webrange-Eigenschaft ab.
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
     * Legt den Wert der webrange-Eigenschaft fest.
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
