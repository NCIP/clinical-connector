//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.4-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.24 at 03:23:05 PM EST 
//


package _21090.org.iso;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSU_TS.Birth complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSU_TS.Birth">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QSET_TS.Birth">
 *       &lt;sequence>
 *         &lt;element name="term" type="{uri:iso.org:21090}QSET_TS.Birth" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSU_TS.Birth", propOrder = {
    "term"
})
public class QSUTSBirth
    extends QSETTSBirth
{

    protected List<QSETTSBirth> term;

    /**
     * Gets the value of the term property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the term property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QSETTSBirth }
     * 
     * 
     */
    public List<QSETTSBirth> getTerm() {
        if (term == null) {
            term = new ArrayList<QSETTSBirth>();
        }
        return this.term;
    }

}
