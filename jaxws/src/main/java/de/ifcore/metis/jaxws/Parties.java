
package de.ifcore.metis.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Parties complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Parties">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="authors" type="{http://vgwort.de/1.3/MessageService/xsd}Authors"/>
 *           &lt;element name="translators" type="{http://vgwort.de/1.3/MessageService/xsd}Translators" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="translators" type="{http://vgwort.de/1.3/MessageService/xsd}Translators"/>
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
@XmlType(name = "Parties", propOrder = {
    "content"
})
public class Parties {

    @XmlElementRefs({
        @XmlElementRef(name = "translators", namespace = "http://vgwort.de/1.3/MessageService/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "authors", namespace = "http://vgwort.de/1.3/MessageService/xsd", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Ruft das restliche Contentmodell ab. 
     * 
     * <p>
     * Sie rufen diese "catch-all"-Eigenschaft aus folgendem Grund ab: 
     * Der Feldname "Translators" wird von zwei verschiedenen Teilen eines Schemas verwendet. Siehe: 
     * Zeile 137 von https://tom.vgwort.de/services/1.3/messageService.wsdl
     * Zeile 134 von https://tom.vgwort.de/services/1.3/messageService.wsdl
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
     * {@link JAXBElement }{@code <}{@link Authors }{@code >}
     * {@link JAXBElement }{@code <}{@link Translators }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
