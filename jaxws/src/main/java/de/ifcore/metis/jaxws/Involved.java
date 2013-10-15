
package de.ifcore.metis.jaxws;

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
 * <p>Java-Klasse für Involved complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Involved">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="code" type="{http://vgwort.de/1.3/MessageService/xsd}codeType"/>
 *         &lt;sequence>
 *           &lt;element name="firstName" type="{http://vgwort.de/1.3/MessageService/xsd}string_2-40"/>
 *           &lt;element name="surName" type="{http://vgwort.de/1.3/MessageService/xsd}string_2-255"/>
 *           &lt;choice>
 *             &lt;element name="cardNumber" type="{http://vgwort.de/1.3/MessageService/xsd}cardNumberType"/>
 *             &lt;element name="code" type="{http://vgwort.de/1.3/MessageService/xsd}codeType" minOccurs="0"/>
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
        @XmlElementRef(name = "firstName", namespace = "http://vgwort.de/1.3/MessageService/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "surName", namespace = "http://vgwort.de/1.3/MessageService/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cardNumber", namespace = "http://vgwort.de/1.3/MessageService/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "code", namespace = "http://vgwort.de/1.3/MessageService/xsd", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends Serializable>> content;

    /**
     * Ruft das restliche Contentmodell ab. 
     * 
     * <p>
     * Sie rufen diese "catch-all"-Eigenschaft aus folgendem Grund ab: 
     * Der Feldname "Code" wird von zwei verschiedenen Teilen eines Schemas verwendet. Siehe: 
     * Zeile 162 von https://tom.vgwort.de/services/1.3/messageService.wsdl
     * Zeile 156 von https://tom.vgwort.de/services/1.3/messageService.wsdl
     * <p>
     * Um diese Eigenschaft zu entfernen, wenden Sie eine Eigenschaftenanpassung für eine
     * der beiden folgenden Deklarationen an, um deren Namen zu ändern: 
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
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
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
