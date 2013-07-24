
package de.ifcore.metis.jaxws.pixel;

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
 *       &lt;attribute name="offset" use="required" type="{http://vgwort.de/1.0/PixelService/xsd}int_0-Max" />
 *       &lt;attribute name="type" use="required" type="{http://vgwort.de/1.0/PixelService/xsd}pixelOverviewType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "pixelOverviewRequest")
public class PixelOverviewRequest {

    @XmlAttribute(name = "offset", required = true)
    protected int offset;
    @XmlAttribute(name = "type", required = true)
    protected PixelOverviewType type;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PixelOverviewType }
     *     
     */
    public PixelOverviewType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PixelOverviewType }
     *     
     */
    public void setType(PixelOverviewType value) {
        this.type = value;
    }

}
