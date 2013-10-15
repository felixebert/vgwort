
package de.ifcore.metis.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="cardNumber" use="required" type="{http://vgwort.de/1.3/MessageService/xsd}cardNumberType" />
 *       &lt;attribute name="surName" use="required" type="{http://vgwort.de/1.3/MessageService/xsd}string_2-255" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "checkAuthorRequest")
public class CheckAuthorRequest {

    @XmlAttribute(name = "cardNumber", required = true)
    protected int cardNumber;
    @XmlAttribute(name = "surName", required = true)
    protected String surName;

    /**
     * Ruft den Wert der cardNumber-Eigenschaft ab.
     * 
     */
    public int getCardNumber() {
        return cardNumber;
    }

    /**
     * Legt den Wert der cardNumber-Eigenschaft fest.
     * 
     */
    public void setCardNumber(int value) {
        this.cardNumber = value;
    }

    /**
     * Ruft den Wert der surName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurName() {
        return surName;
    }

    /**
     * Legt den Wert der surName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurName(String value) {
        this.surName = value;
    }

}
