//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.4-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.24 at 03:23:05 PM EST 
//


package _21090.org.iso;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSD_TS.DateTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSD_TS.DateTime">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QSET_TS.DateTime">
 *       &lt;sequence>
 *         &lt;element name="first" type="{uri:iso.org:21090}QSET_TS.DateTime" minOccurs="0"/>
 *         &lt;element name="second" type="{uri:iso.org:21090}QSET_TS.DateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSD_TS.DateTime", propOrder = {
    "first",
    "second"
})
public class QSDTSDateTime
    extends QSETTSDateTime
{

    protected QSETTSDateTime first;
    protected QSETTSDateTime second;

    /**
     * Gets the value of the first property.
     * 
     * @return
     *     possible object is
     *     {@link QSETTSDateTime }
     *     
     */
    public QSETTSDateTime getFirst() {
        return first;
    }

    /**
     * Sets the value of the first property.
     * 
     * @param value
     *     allowed object is
     *     {@link QSETTSDateTime }
     *     
     */
    public void setFirst(QSETTSDateTime value) {
        this.first = value;
    }

    /**
     * Gets the value of the second property.
     * 
     * @return
     *     possible object is
     *     {@link QSETTSDateTime }
     *     
     */
    public QSETTSDateTime getSecond() {
        return second;
    }

    /**
     * Sets the value of the second property.
     * 
     * @param value
     *     allowed object is
     *     {@link QSETTSDateTime }
     *     
     */
    public void setSecond(QSETTSDateTime value) {
        this.second = value;
    }

}
