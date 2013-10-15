
package de.ifcore.metis.jaxws;

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
 *       &lt;attribute name="valid" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "checkAuthorResponse")
public class CheckAuthorResponse {

    @XmlAttribute(name = "valid", required = true)
    protected boolean valid;

    /**
     * Ruft den Wert der valid-Eigenschaft ab.
     * 
     */
    public boolean isValid() {
        return valid;
    }

    /**
     * Legt den Wert der valid-Eigenschaft fest.
     * 
     */
    public void setValid(boolean value) {
        this.valid = value;
    }

}
