
package de.ifcore.metis.client.message.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for MessageText complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageText">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shorttext" type="{http://vgwort.de/1.2/MessageService/xsd}string_1-100"/>
 *         &lt;element name="text" type="{http://vgwort.de/1.2/MessageService/xsd}Text"/>
 *       &lt;/sequence>
 *       &lt;attribute name="lyric" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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

    /**
     * Gets the value of the shorttext property.
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
     * Sets the value of the shorttext property.
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
     * Gets the value of the text property.
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
     * Sets the value of the text property.
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
     * Gets the value of the lyric property.
     * 
     */
    public boolean isLyric() {
        return lyric;
    }

    /**
     * Sets the value of the lyric property.
     * 
     */
    public void setLyric(boolean value) {
        this.lyric = value;
    }

}
