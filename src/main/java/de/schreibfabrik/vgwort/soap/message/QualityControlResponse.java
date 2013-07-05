
package de.schreibfabrik.vgwort.soap.message;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="qualityControlValues" type="{http://vgwort.de/1.2/MessageService/xsd}QualityControlValues" maxOccurs="12" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="orderedPixelTillToday" use="required" type="{http://vgwort.de/1.2/MessageService/xsd}int_0-MAX" />
 *       &lt;attribute name="startedPixelTillToday" use="required" type="{http://vgwort.de/1.2/MessageService/xsd}int_0-MAX" />
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
     * Gets the value of the orderedPixelTillToday property.
     * 
     */
    public int getOrderedPixelTillToday() {
        return orderedPixelTillToday;
    }

    /**
     * Sets the value of the orderedPixelTillToday property.
     * 
     */
    public void setOrderedPixelTillToday(int value) {
        this.orderedPixelTillToday = value;
    }

    /**
     * Gets the value of the startedPixelTillToday property.
     * 
     */
    public int getStartedPixelTillToday() {
        return startedPixelTillToday;
    }

    /**
     * Sets the value of the startedPixelTillToday property.
     * 
     */
    public void setStartedPixelTillToday(int value) {
        this.startedPixelTillToday = value;
    }

}
