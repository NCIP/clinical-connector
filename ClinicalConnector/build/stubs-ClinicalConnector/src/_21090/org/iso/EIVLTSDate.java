//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.4-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.24 at 03:23:05 PM EST 
//


package _21090.org.iso;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EIVL_TS.Date complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EIVL_TS.Date">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QSET_TS.Date">
 *       &lt;sequence>
 *         &lt;element name="offset" type="{uri:iso.org:21090}IVL_PQ" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="event" type="{uri:iso.org:21090}TimingEvent" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EIVL_TS.Date", propOrder = {
    "offset"
})
public class EIVLTSDate
    extends QSETTSDate
{

    protected IVLPQ offset;
    @XmlAttribute
    protected TimingEvent event;

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link IVLPQ }
     *     
     */
    public IVLPQ getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLPQ }
     *     
     */
    public void setOffset(IVLPQ value) {
        this.offset = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link TimingEvent }
     *     
     */
    public TimingEvent getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimingEvent }
     *     
     */
    public void setEvent(TimingEvent value) {
        this.event = value;
    }

}