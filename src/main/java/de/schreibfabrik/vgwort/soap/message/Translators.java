
package de.schreibfabrik.vgwort.soap.message;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Translators complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Translators">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="translator" type="{http://vgwort.de/1.2/MessageService/xsd}Involved" maxOccurs="99"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Translators", propOrder = {
    "translator"
})
public class Translators {

    @XmlElement(required = true)
    protected List<Involved> translator;

    /**
     * Gets the value of the translator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the translator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranslator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Involved }
     * 
     * 
     */
    public List<Involved> getTranslator() {
        if (translator == null) {
            translator = new ArrayList<Involved>();
        }
        return this.translator;
    }

}
