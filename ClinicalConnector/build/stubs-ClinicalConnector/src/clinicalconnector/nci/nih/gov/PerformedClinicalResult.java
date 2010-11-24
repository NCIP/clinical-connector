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
import _21090.org.iso.BL;
import _21090.org.iso.CD;
import _21090.org.iso.IVLPQ;
import _21090.org.iso.PQ;
import _21090.org.iso.SC;
import _21090.org.iso.ST;
import _21090.org.iso.TS;


/**
 * <p>Java class for PerformedClinicalResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerformedClinicalResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asCollectedIndicator" type="{uri:iso.org:21090}BL"/>
 *         &lt;element name="comment" type="{uri:iso.org:21090}SC"/>
 *         &lt;element name="confidentialityCode" type="{uri:iso.org:21090}CD"/>
 *         &lt;element name="numericalResult" type="{uri:iso.org:21090}PQ"/>
 *         &lt;element name="referenceRange" type="{uri:iso.org:21090}IVL_PQ"/>
 *         &lt;element name="referenceRangeComment" type="{uri:iso.org:21090}ST"/>
 *         &lt;element name="reportedDate" type="{uri:iso.org:21090}TS"/>
 *         &lt;element name="reportedResultStatusCode" type="{uri:iso.org:21090}CD"/>
 *         &lt;element name="textResult" type="{uri:iso.org:21090}ST"/>
 *         &lt;element name="uncertaintyCode" type="{uri:iso.org:21090}CD"/>
 *         &lt;element name="performedObservation" type="{http://clinicalconnector.nci.nih.gov}PerformedObservation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformedClinicalResult", propOrder = {
    "asCollectedIndicator",
    "comment",
    "confidentialityCode",
    "numericalResult",
    "referenceRange",
    "referenceRangeComment",
    "reportedDate",
    "reportedResultStatusCode",
    "textResult",
    "uncertaintyCode",
    "performedObservation"
})
public class PerformedClinicalResult {

    @XmlElement(required = true)
    protected BL asCollectedIndicator;
    @XmlElement(required = true)
    protected SC comment;
    @XmlElement(required = true)
    protected CD confidentialityCode;
    @XmlElement(required = true)
    protected PQ numericalResult;
    @XmlElement(required = true)
    protected IVLPQ referenceRange;
    @XmlElement(required = true)
    protected ST referenceRangeComment;
    @XmlElement(required = true)
    protected TS reportedDate;
    @XmlElement(required = true)
    protected CD reportedResultStatusCode;
    @XmlElement(required = true)
    protected ST textResult;
    @XmlElement(required = true)
    protected CD uncertaintyCode;
    @XmlElement(required = true)
    protected PerformedObservation performedObservation;

    /**
     * Gets the value of the asCollectedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link BL }
     *     
     */
    public BL getAsCollectedIndicator() {
        return asCollectedIndicator;
    }

    /**
     * Sets the value of the asCollectedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BL }
     *     
     */
    public void setAsCollectedIndicator(BL value) {
        this.asCollectedIndicator = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link SC }
     *     
     */
    public SC getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SC }
     *     
     */
    public void setComment(SC value) {
        this.comment = value;
    }

    /**
     * Gets the value of the confidentialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getConfidentialityCode() {
        return confidentialityCode;
    }

    /**
     * Sets the value of the confidentialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setConfidentialityCode(CD value) {
        this.confidentialityCode = value;
    }

    /**
     * Gets the value of the numericalResult property.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getNumericalResult() {
        return numericalResult;
    }

    /**
     * Sets the value of the numericalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setNumericalResult(PQ value) {
        this.numericalResult = value;
    }

    /**
     * Gets the value of the referenceRange property.
     * 
     * @return
     *     possible object is
     *     {@link IVLPQ }
     *     
     */
    public IVLPQ getReferenceRange() {
        return referenceRange;
    }

    /**
     * Sets the value of the referenceRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLPQ }
     *     
     */
    public void setReferenceRange(IVLPQ value) {
        this.referenceRange = value;
    }

    /**
     * Gets the value of the referenceRangeComment property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getReferenceRangeComment() {
        return referenceRangeComment;
    }

    /**
     * Sets the value of the referenceRangeComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setReferenceRangeComment(ST value) {
        this.referenceRangeComment = value;
    }

    /**
     * Gets the value of the reportedDate property.
     * 
     * @return
     *     possible object is
     *     {@link TS }
     *     
     */
    public TS getReportedDate() {
        return reportedDate;
    }

    /**
     * Sets the value of the reportedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TS }
     *     
     */
    public void setReportedDate(TS value) {
        this.reportedDate = value;
    }

    /**
     * Gets the value of the reportedResultStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getReportedResultStatusCode() {
        return reportedResultStatusCode;
    }

    /**
     * Sets the value of the reportedResultStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setReportedResultStatusCode(CD value) {
        this.reportedResultStatusCode = value;
    }

    /**
     * Gets the value of the textResult property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getTextResult() {
        return textResult;
    }

    /**
     * Sets the value of the textResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setTextResult(ST value) {
        this.textResult = value;
    }

    /**
     * Gets the value of the uncertaintyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getUncertaintyCode() {
        return uncertaintyCode;
    }

    /**
     * Sets the value of the uncertaintyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setUncertaintyCode(CD value) {
        this.uncertaintyCode = value;
    }

    /**
     * Gets the value of the performedObservation property.
     * 
     * @return
     *     possible object is
     *     {@link PerformedObservation }
     *     
     */
    public PerformedObservation getPerformedObservation() {
        return performedObservation;
    }

    /**
     * Sets the value of the performedObservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformedObservation }
     *     
     */
    public void setPerformedObservation(PerformedObservation value) {
        this.performedObservation = value;
    }

}
