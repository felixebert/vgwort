
package de.schreibfabrik.vgwort.soap.pixel;

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
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="privateIdentificationId" type="{http://vgwort.de/1.0/PixelService/xsd}pixelIDType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="offset" use="required" type="{http://vgwort.de/1.0/PixelService/xsd}int_0-Max" />
 *       &lt;attribute name="amount" use="required" type="{http://vgwort.de/1.0/PixelService/xsd}int_0-Max" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "privateIdentificationId"
})
@XmlRootElement(name = "pixelOverviewResponse")
public class PixelOverviewResponse {

    protected List<String> privateIdentificationId;
    @XmlAttribute(name = "offset", required = true)
    protected int offset;
    @XmlAttribute(name = "amount", required = true)
    protected int amount;

    /**
     * Gets the value of the privateIdentificationId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the privateIdentificationId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrivateIdentificationId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrivateIdentificationId() {
        if (privateIdentificationId == null) {
            privateIdentificationId = new ArrayList<String>();
        }
        return this.privateIdentificationId;
    }

    /**
     * Gets the value of the offset property.
     * 
     */
    public int getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     */
    public void setOffset(int value) {
        this.offset = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(int value) {
        this.amount = value;
    }

}
