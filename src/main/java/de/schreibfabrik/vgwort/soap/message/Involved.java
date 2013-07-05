
package de.schreibfabrik.vgwort.soap.message;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Involved complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Involved">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="code" type="{http://vgwort.de/1.2/MessageService/xsd}codeType"/>
 *         &lt;sequence>
 *           &lt;element name="firstName" type="{http://vgwort.de/1.2/MessageService/xsd}string_2-40"/>
 *           &lt;element name="surName" type="{http://vgwort.de/1.2/MessageService/xsd}string_2-255"/>
 *           &lt;choice>
 *             &lt;element name="cardNumber" type="{http://vgwort.de/1.2/MessageService/xsd}cardNumberType"/>
 *             &lt;element name="code" type="{http://vgwort.de/1.2/MessageService/xsd}codeType" minOccurs="0"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Involved", propOrder = {
    "content"
})
public class Involved {

    @XmlElementRefs({
        @XmlElementRef(name = "surName", namespace = "http://vgwort.de/1.2/MessageService/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "code", namespace = "http://vgwort.de/1.2/MessageService/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cardNumber", namespace = "http://vgwort.de/1.2/MessageService/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "firstName", namespace = "http://vgwort.de/1.2/MessageService/xsd", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends Serializable>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Code" is used by two different parts of a schema. See: 
     * line 161 of https://tom-test.vgwort.de/services/1.2/messageService.wsdl
     * line 155 of https://tom-test.vgwort.de/services/1.2/messageService.wsdl
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.content;
    }

}
