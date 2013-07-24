
package de.ifcore.metis.jaxws.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualityControlValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualityControlValues">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="month" use="required" type="{http://vgwort.de/1.2/MessageService/xsd}int_1-12" />
 *       &lt;attribute name="year" use="required" type="{http://vgwort.de/1.2/MessageService/xsd}int_1000-9999" />
 *       &lt;attribute name="orderedPixel" use="required" type="{http://vgwort.de/1.2/MessageService/xsd}int_0-MAX" />
 *       &lt;attribute name="startedPixel" use="required" type="{http://vgwort.de/1.2/MessageService/xsd}int_0-MAX" />
 *       &lt;attribute name="minAccess" use="required" type="{http://vgwort.de/1.2/MessageService/xsd}int_0-MAX" />
 *       &lt;attribute name="minAccessNoMessage" use="required" type="{http://vgwort.de/1.2/MessageService/xsd}int_0-MAX" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualityControlValues")
public class QualityControlValues {

    @XmlAttribute(name = "month", required = true)
    protected int month;
    @XmlAttribute(name = "year", required = true)
    protected int year;
    @XmlAttribute(name = "orderedPixel", required = true)
    protected int orderedPixel;
    @XmlAttribute(name = "startedPixel", required = true)
    protected int startedPixel;
    @XmlAttribute(name = "minAccess", required = true)
    protected int minAccess;
    @XmlAttribute(name = "minAccessNoMessage", required = true)
    protected int minAccessNoMessage;

    /**
     * Gets the value of the month property.
     * 
     */
    public int getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     */
    public void setMonth(int value) {
        this.month = value;
    }

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Gets the value of the orderedPixel property.
     * 
     */
    public int getOrderedPixel() {
        return orderedPixel;
    }

    /**
     * Sets the value of the orderedPixel property.
     * 
     */
    public void setOrderedPixel(int value) {
        this.orderedPixel = value;
    }

    /**
     * Gets the value of the startedPixel property.
     * 
     */
    public int getStartedPixel() {
        return startedPixel;
    }

    /**
     * Sets the value of the startedPixel property.
     * 
     */
    public void setStartedPixel(int value) {
        this.startedPixel = value;
    }

    /**
     * Gets the value of the minAccess property.
     * 
     */
    public int getMinAccess() {
        return minAccess;
    }

    /**
     * Sets the value of the minAccess property.
     * 
     */
    public void setMinAccess(int value) {
        this.minAccess = value;
    }

    /**
     * Gets the value of the minAccessNoMessage property.
     * 
     */
    public int getMinAccessNoMessage() {
        return minAccessNoMessage;
    }

    /**
     * Sets the value of the minAccessNoMessage property.
     * 
     */
    public void setMinAccessNoMessage(int value) {
        this.minAccessNoMessage = value;
    }

}
