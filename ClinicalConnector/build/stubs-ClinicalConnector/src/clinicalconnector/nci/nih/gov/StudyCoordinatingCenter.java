//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.4-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.24 at 03:23:05 PM EST 
//


package clinicalconnector.nci.nih.gov;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import _21090.org.iso.AD;
import _21090.org.iso.II;


/**
 * <p>Java class for StudyCoordinatingCenter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudyCoordinatingCenter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{uri:iso.org:21090}II"/>
 *         &lt;element name="postalAddress" type="{uri:iso.org:21090}AD"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudyCoordinatingCenter", propOrder = {
    "identifier",
    "postalAddress"
})
public class StudyCoordinatingCenter {

    @XmlElement(required = true)
    protected II identifier;
    @XmlElement(required = true)
    protected AD postalAddress;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setIdentifier(II value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the postalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AD }
     *     
     */
    public AD getPostalAddress() {
        return postalAddress;
    }

    /**
     * Sets the value of the postalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AD }
     *     
     */
    public void setPostalAddress(AD value) {
        this.postalAddress = value;
    }

}
