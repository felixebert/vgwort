
package de.ifcore.metis.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für QualityControlValues complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="QualityControlValues">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="month" use="required" type="{http://vgwort.de/1.3/MessageService/xsd}int_1-12" />
 *       &lt;attribute name="year" use="required" type="{http://vgwort.de/1.3/MessageService/xsd}int_1000-9999" />
 *       &lt;attribute name="orderedPixel" use="required" type="{http://vgwort.de/1.3/MessageService/xsd}int_0-MAX" />
 *       &lt;attribute name="startedPixel" use="required" type="{http://vgwort.de/1.3/MessageService/xsd}int_0-MAX" />
 *       &lt;attribute name="minAccess" use="required" type="{http://vgwort.de/1.3/MessageService/xsd}int_0-MAX" />
 *       &lt;attribute name="minAccessNoMessage" use="required" type="{http://vgwort.de/1.3/MessageService/xsd}int_0-MAX" />
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
     * Ruft den Wert der month-Eigenschaft ab.
     * 
     */
    public int getMonth() {
        return month;
    }

    /**
     * Legt den Wert der month-Eigenschaft fest.
     * 
     */
    public void setMonth(int value) {
        this.month = value;
    }

    /**
     * Ruft den Wert der year-Eigenschaft ab.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Legt den Wert der year-Eigenschaft fest.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Ruft den Wert der orderedPixel-Eigenschaft ab.
     * 
     */
    public int getOrderedPixel() {
        return orderedPixel;
    }

    /**
     * Legt den Wert der orderedPixel-Eigenschaft fest.
     * 
     */
    public void setOrderedPixel(int value) {
        this.orderedPixel = value;
    }

    /**
     * Ruft den Wert der startedPixel-Eigenschaft ab.
     * 
     */
    public int getStartedPixel() {
        return startedPixel;
    }

    /**
     * Legt den Wert der startedPixel-Eigenschaft fest.
     * 
     */
    public void setStartedPixel(int value) {
        this.startedPixel = value;
    }

    /**
     * Ruft den Wert der minAccess-Eigenschaft ab.
     * 
     */
    public int getMinAccess() {
        return minAccess;
    }

    /**
     * Legt den Wert der minAccess-Eigenschaft fest.
     * 
     */
    public void setMinAccess(int value) {
        this.minAccess = value;
    }

    /**
     * Ruft den Wert der minAccessNoMessage-Eigenschaft ab.
     * 
     */
    public int getMinAccessNoMessage() {
        return minAccessNoMessage;
    }

    /**
     * Legt den Wert der minAccessNoMessage-Eigenschaft fest.
     * 
     */
    public void setMinAccessNoMessage(int value) {
        this.minAccessNoMessage = value;
    }

}
