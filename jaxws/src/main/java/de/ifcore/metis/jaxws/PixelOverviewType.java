
package de.ifcore.metis.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pixelOverviewType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="pixelOverviewType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="MINDESTZUGRIFF"/>
 *     &lt;enumeration value="ANTEILIGER_MINDESTZUGRIFF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "pixelOverviewType")
@XmlEnum
public enum PixelOverviewType {

    MINDESTZUGRIFF,
    ANTEILIGER_MINDESTZUGRIFF;

    public String value() {
        return name();
    }

    public static PixelOverviewType fromValue(String v) {
        return valueOf(v);
    }

}
