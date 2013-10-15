
package de.ifcore.metis.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für MessageText complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MessageText">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shorttext" type="{http://vgwort.de/1.3/MessageService/xsd}string_1-100"/>
 *         &lt;element name="text" type="{http://vgwort.de/1.3/MessageService/xsd}Text"/>
 *       &lt;/sequence>
 *       &lt;attribute name="lyric" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="accessRestricted" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageText", propOrder = {
    "shorttext",
    "text"
})
public class MessageText {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shorttext;
    @XmlElement(required = true)
    protected Text text;
    @XmlAttribute(name = "lyric", required = true)
    protected boolean lyric;
    @XmlAttribute(name = "accessRestricted")
    protected Boolean accessRestricted;

    /**
     * Ruft den Wert der shorttext-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShorttext() {
        return shorttext;
    }

    /**
     * Legt den Wert der shorttext-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShorttext(String value) {
        this.shorttext = value;
    }

    /**
     * Ruft den Wert der text-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Text }
     *     
     */
    public Text getText() {
        return text;
    }

    /**
     * Legt den Wert der text-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Text }
     *     
     */
    public void setText(Text value) {
        this.text = value;
    }

    /**
     * Ruft den Wert der lyric-Eigenschaft ab.
     * 
     */
    public boolean isLyric() {
        return lyric;
    }

    /**
     * Legt den Wert der lyric-Eigenschaft fest.
     * 
     */
    public void setLyric(boolean value) {
        this.lyric = value;
    }

    /**
     * Ruft den Wert der accessRestricted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAccessRestricted() {
        if (accessRestricted == null) {
            return false;
        } else {
            return accessRestricted;
        }
    }

    /**
     * Legt den Wert der accessRestricted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccessRestricted(Boolean value) {
        this.accessRestricted = value;
    }

}
