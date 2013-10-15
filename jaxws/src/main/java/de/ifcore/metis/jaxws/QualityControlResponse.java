
package de.ifcore.metis.jaxws;

import java.util.ArrayList;
import java.util.List;
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
 *       &lt;sequence>
 *         &lt;element name="qualityControlValues" type="{http://vgwort.de/1.3/MessageService/xsd}QualityControlValues" maxOccurs="12" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="orderedPixelTillToday" use="required" type="{http://vgwort.de/1.3/MessageService/xsd}int_0-MAX" />
 *       &lt;attribute name="startedPixelTillToday" use="required" type="{http://vgwort.de/1.3/MessageService/xsd}int_0-MAX" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "qualityControlValues"
})
@XmlRootElement(name = "qualityControlResponse")
public class QualityControlResponse {

    protected List<QualityControlValues> qualityControlValues;
    @XmlAttribute(name = "orderedPixelTillToday", required = true)
    protected int orderedPixelTillToday;
    @XmlAttribute(name = "startedPixelTillToday", required = true)
    protected int startedPixelTillToday;

    /**
     * Gets the value of the qualityControlValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualityControlValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualityControlValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualityControlValues }
     * 
     * 
     */
    public List<QualityControlValues> getQualityControlValues() {
        if (qualityControlValues == null) {
            qualityControlValues = new ArrayList<QualityControlValues>();
        }
        return this.qualityControlValues;
    }

    /**
     * Ruft den Wert der orderedPixelTillToday-Eigenschaft ab.
     * 
     */
    public int getOrderedPixelTillToday() {
        return orderedPixelTillToday;
    }

    /**
     * Legt den Wert der orderedPixelTillToday-Eigenschaft fest.
     * 
     */
    public void setOrderedPixelTillToday(int value) {
        this.orderedPixelTillToday = value;
    }

    /**
     * Ruft den Wert der startedPixelTillToday-Eigenschaft ab.
     * 
     */
    public int getStartedPixelTillToday() {
        return startedPixelTillToday;
    }

    /**
     * Legt den Wert der startedPixelTillToday-Eigenschaft fest.
     * 
     */
    public void setStartedPixelTillToday(int value) {
        this.startedPixelTillToday = value;
    }

}
