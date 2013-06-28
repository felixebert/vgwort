
package de.schreibfabrik.vgwort.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Pixels complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pixels">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pixel" type="{http://vgwort.de/1.0/PixelService/xsd}Pixel" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pixels", propOrder = {
    "pixel"
})
public class Pixels {

    @XmlElement(required = true)
    protected List<Pixel_Type> pixel;

    /**
     * Gets the value of the pixel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pixel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPixel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pixel_Type }
     * 
     * 
     */
    public List<Pixel_Type> getPixel() {
        if (pixel == null) {
            pixel = new ArrayList<Pixel_Type>();
        }
        return this.pixel;
    }

}
