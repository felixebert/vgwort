
package de.ifcore.metis.jaxws.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Text complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Text">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="pdf" type="{http://vgwort.de/1.2/MessageService/xsd}base64BinaryMax15MB"/>
 *         &lt;element name="plainText" type="{http://vgwort.de/1.2/MessageService/xsd}base64BinaryMax15MB"/>
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
     * Gets the value of the pdf property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPdf() {
        return pdf;
    }

    /**
     * Sets the value of the pdf property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPdf(byte[] value) {
        this.pdf = value;
    }

    /**
     * Gets the value of the plainText property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPlainText() {
        return plainText;
    }

    /**
     * Sets the value of the plainText property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPlainText(byte[] value) {
        this.plainText = value;
    }

}
