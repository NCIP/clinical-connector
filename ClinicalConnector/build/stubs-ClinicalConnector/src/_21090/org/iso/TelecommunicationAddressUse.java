//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.4-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.24 at 03:23:05 PM EST 
//


package _21090.org.iso;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelecommunicationAddressUse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TelecommunicationAddressUse">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="HP"/>
 *     &lt;enumeration value="HV"/>
 *     &lt;enumeration value="WP"/>
 *     &lt;enumeration value="DIR"/>
 *     &lt;enumeration value="PUB"/>
 *     &lt;enumeration value="BAD"/>
 *     &lt;enumeration value="TMP"/>
 *     &lt;enumeration value="AS"/>
 *     &lt;enumeration value="EC"/>
 *     &lt;enumeration value="MC"/>
 *     &lt;enumeration value="PG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TelecommunicationAddressUse")
@XmlEnum
public enum TelecommunicationAddressUse {

    H,
    HP,
    HV,
    WP,
    DIR,
    PUB,
    BAD,
    TMP,
    AS,
    EC,
    MC,
    PG;

    public String value() {
        return name();
    }

    public static TelecommunicationAddressUse fromValue(String v) {
        return valueOf(v);
    }

}
