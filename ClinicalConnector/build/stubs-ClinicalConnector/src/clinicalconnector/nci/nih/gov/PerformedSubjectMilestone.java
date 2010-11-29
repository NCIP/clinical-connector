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
import _21090.org.iso.II;
import _21090.org.iso.TS;


/**
 * <p>Java class for PerformedSubjectMilestone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerformedSubjectMilestone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informedConsentDate" type="{uri:iso.org:21090}TS"/>
 *         &lt;element name="registrationDate" type="{uri:iso.org:21090}TS"/>
 *         &lt;element name="registrationSiteIdentifier" type="{uri:iso.org:21090}II"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformedSubjectMilestone", propOrder = {
    "informedConsentDate",
    "registrationDate",
    "registrationSiteIdentifier"
})
public class PerformedSubjectMilestone {

    @XmlElement(required = true)
    protected TS informedConsentDate;
    @XmlElement(required = true)
    protected TS registrationDate;
    @XmlElement(required = true)
    protected II registrationSiteIdentifier;

    /**
     * Gets the value of the informedConsentDate property.
     * 
     * @return
     *     possible object is
     *     {@link TS }
     *     
     */
    public TS getInformedConsentDate() {
        return informedConsentDate;
    }

    /**
     * Sets the value of the informedConsentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TS }
     *     
     */
    public void setInformedConsentDate(TS value) {
        this.informedConsentDate = value;
    }

    /**
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link TS }
     *     
     */
    public TS getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TS }
     *     
     */
    public void setRegistrationDate(TS value) {
        this.registrationDate = value;
    }

    /**
     * Gets the value of the registrationSiteIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getRegistrationSiteIdentifier() {
        return registrationSiteIdentifier;
    }

    /**
     * Sets the value of the registrationSiteIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setRegistrationSiteIdentifier(II value) {
        this.registrationSiteIdentifier = value;
    }

}