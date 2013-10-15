
package de.ifcore.metis.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Text complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Text">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="pdf" type="{http://vgwort.de/1.3/MessageService/xsd}base64BinaryMax15MB"/>
 *         &lt;element name="plainText" type="{http://vgwort.de/1.3/MessageService/xsd}base64BinaryMax15MB"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Text", propOrder = {
    "pdf",
    "plainText"
})
public class Text {

    protected byte[] pdf;
    protected byte[] plainText;

    /**
     * Ruft den Wert der pdf-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPdf() {
        return pdf;
    }

    /**
     * Legt den Wert der pdf-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPdf(byte[] value) {
        this.pdf = value;
    }

    /**
     * Ruft den Wert der plainText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPlainText() {
        return plainText;
    }

    /**
     * Legt den Wert der plainText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPlainText(byte[] value) {
        this.plainText = value;
    }

}
