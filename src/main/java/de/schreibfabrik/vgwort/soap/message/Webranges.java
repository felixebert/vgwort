
package de.schreibfabrik.vgwort.soap.message;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Webranges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Webranges">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="webrange" type="{http://vgwort.de/1.2/MessageService/xsd}Webrange" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Webranges", propOrder = {
    "webrange"
})
public class Webranges {

    @XmlElement(required = true)
    protected List<Webrange> webrange;

    /**
     * Gets the value of the webrange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the webrange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebrange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Webrange }
     * 
     * 
     */
    public List<Webrange> getWebrange() {
        if (webrange == null) {
            webrange = new ArrayList<Webrange>();
        }
        return this.webrange;
    }

}
