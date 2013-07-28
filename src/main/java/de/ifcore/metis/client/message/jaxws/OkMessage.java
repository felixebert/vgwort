
package de.ifcore.metis.client.message.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for okMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="okMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="status" type="{http://vgwort.de/1.2/MessageService/xsd}okType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "okMessage")
@XmlSeeAlso({
    NewMessageResponse.class,
    AddWebrangeResponse.class
})
public class OkMessage {

    @XmlAttribute(name = "status")
    protected OkType status;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link OkType }
     *     
     */
    public OkType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link OkType }
     *     
     */
    public void setStatus(OkType value) {
        this.status = value;
    }

}
