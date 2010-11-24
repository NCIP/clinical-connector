/**
 * ClinicalInterpretation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * An assessment which involves determining the meaning of a clinical
 * result.
 * 
 * For example, the results of a white blood cell count may be interpreted
 * as constituting a grade 2 toxicity.
 */
public class ClinicalInterpretation  extends gov.nih.nci.cabig.ccts.domain.bridg.Assessment  implements java.io.Serializable {
    /** Specifies whether a clinical result is abnormal.
 * 
 * For example, a value of Y designates the LabResult as abnormal.
 * 
 * For example, HIV infection. */
    private gov.nih.nci.cabig.ccts.domain.cdt.BL abnormalIndicator;
    /** Specifies whether a subject's clinical condition is important based
 * on judgement. */
    private gov.nih.nci.cabig.ccts.domain.cdt.BL clinicallySignificantIndicator;
    /** A code to describe the intensity of the assessment.
 * 
 * For example, moderate could be used to describe acne. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD severity;
    /** The Adverse Event numeric grade (0-5) based on the NCI Common Toxicity
 * Criteria (CTC). 
 * 
 * NOTE:  Similar to CTC Toxicity Grade */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD toxicityGrade;
    /** The medical description of the assessment using the National Cancer
 * Institute's (NCI) Common Toxicity Criteria (CTC) terminology.
 * 
 * For example, hypocalcaemia.
 * 
 * NOTE:  Similar to CTC Term (short name). */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD toxicityTerm;

    public ClinicalInterpretation() {
    }

    public ClinicalInterpretation(
           gov.nih.nci.cabig.ccts.domain.cdt.BL abnormalIndicator,
           gov.nih.nci.cabig.ccts.domain.cdt.BL clinicallySignificantIndicator,
           gov.nih.nci.cabig.ccts.domain.cdt.CD severity,
           gov.nih.nci.cabig.ccts.domain.cdt.CD toxicityGrade,
           gov.nih.nci.cabig.ccts.domain.cdt.CD toxicityTerm) {
           this.abnormalIndicator = abnormalIndicator;
           this.clinicallySignificantIndicator = clinicallySignificantIndicator;
           this.severity = severity;
           this.toxicityGrade = toxicityGrade;
           this.toxicityTerm = toxicityTerm;
    }


    /**
     * Gets the abnormalIndicator value for this ClinicalInterpretation.
     * 
     * @return abnormalIndicator Specifies whether a clinical result is abnormal.
 * 
 * For example, a value of Y designates the LabResult as abnormal.
 * 
 * For example, HIV infection.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.BL getAbnormalIndicator() {
        return abnormalIndicator;
    }


    /**
     * Sets the abnormalIndicator value for this ClinicalInterpretation.
     * 
     * @param abnormalIndicator Specifies whether a clinical result is abnormal.
 * 
 * For example, a value of Y designates the LabResult as abnormal.
 * 
 * For example, HIV infection.
     */
    public void setAbnormalIndicator(gov.nih.nci.cabig.ccts.domain.cdt.BL abnormalIndicator) {
        this.abnormalIndicator = abnormalIndicator;
    }


    /**
     * Gets the clinicallySignificantIndicator value for this ClinicalInterpretation.
     * 
     * @return clinicallySignificantIndicator Specifies whether a subject's clinical condition is important based
 * on judgement.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.BL getClinicallySignificantIndicator() {
        return clinicallySignificantIndicator;
    }


    /**
     * Sets the clinicallySignificantIndicator value for this ClinicalInterpretation.
     * 
     * @param clinicallySignificantIndicator Specifies whether a subject's clinical condition is important based
 * on judgement.
     */
    public void setClinicallySignificantIndicator(gov.nih.nci.cabig.ccts.domain.cdt.BL clinicallySignificantIndicator) {
        this.clinicallySignificantIndicator = clinicallySignificantIndicator;
    }


    /**
     * Gets the severity value for this ClinicalInterpretation.
     * 
     * @return severity A code to describe the intensity of the assessment.
 * 
 * For example, moderate could be used to describe acne.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this ClinicalInterpretation.
     * 
     * @param severity A code to describe the intensity of the assessment.
 * 
 * For example, moderate could be used to describe acne.
     */
    public void setSeverity(gov.nih.nci.cabig.ccts.domain.cdt.CD severity) {
        this.severity = severity;
    }


    /**
     * Gets the toxicityGrade value for this ClinicalInterpretation.
     * 
     * @return toxicityGrade The Adverse Event numeric grade (0-5) based on the NCI Common Toxicity
 * Criteria (CTC). 
 * 
 * NOTE:  Similar to CTC Toxicity Grade
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getToxicityGrade() {
        return toxicityGrade;
    }


    /**
     * Sets the toxicityGrade value for this ClinicalInterpretation.
     * 
     * @param toxicityGrade The Adverse Event numeric grade (0-5) based on the NCI Common Toxicity
 * Criteria (CTC). 
 * 
 * NOTE:  Similar to CTC Toxicity Grade
     */
    public void setToxicityGrade(gov.nih.nci.cabig.ccts.domain.cdt.CD toxicityGrade) {
        this.toxicityGrade = toxicityGrade;
    }


    /**
     * Gets the toxicityTerm value for this ClinicalInterpretation.
     * 
     * @return toxicityTerm The medical description of the assessment using the National Cancer
 * Institute's (NCI) Common Toxicity Criteria (CTC) terminology.
 * 
 * For example, hypocalcaemia.
 * 
 * NOTE:  Similar to CTC Term (short name).
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getToxicityTerm() {
        return toxicityTerm;
    }


    /**
     * Sets the toxicityTerm value for this ClinicalInterpretation.
     * 
     * @param toxicityTerm The medical description of the assessment using the National Cancer
 * Institute's (NCI) Common Toxicity Criteria (CTC) terminology.
 * 
 * For example, hypocalcaemia.
 * 
 * NOTE:  Similar to CTC Term (short name).
     */
    public void setToxicityTerm(gov.nih.nci.cabig.ccts.domain.cdt.CD toxicityTerm) {
        this.toxicityTerm = toxicityTerm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClinicalInterpretation)) return false;
        ClinicalInterpretation other = (ClinicalInterpretation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.abnormalIndicator==null && other.getAbnormalIndicator()==null) || 
             (this.abnormalIndicator!=null &&
              this.abnormalIndicator.equals(other.getAbnormalIndicator()))) &&
            ((this.clinicallySignificantIndicator==null && other.getClinicallySignificantIndicator()==null) || 
             (this.clinicallySignificantIndicator!=null &&
              this.clinicallySignificantIndicator.equals(other.getClinicallySignificantIndicator()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity()))) &&
            ((this.toxicityGrade==null && other.getToxicityGrade()==null) || 
             (this.toxicityGrade!=null &&
              this.toxicityGrade.equals(other.getToxicityGrade()))) &&
            ((this.toxicityTerm==null && other.getToxicityTerm()==null) || 
             (this.toxicityTerm!=null &&
              this.toxicityTerm.equals(other.getToxicityTerm())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAbnormalIndicator() != null) {
            _hashCode += getAbnormalIndicator().hashCode();
        }
        if (getClinicallySignificantIndicator() != null) {
            _hashCode += getClinicallySignificantIndicator().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        if (getToxicityGrade() != null) {
            _hashCode += getToxicityGrade().hashCode();
        }
        if (getToxicityTerm() != null) {
            _hashCode += getToxicityTerm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClinicalInterpretation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ClinicalInterpretation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abnormalIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "abnormalIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "BL"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clinicallySignificantIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "clinicallySignificantIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "BL"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toxicityGrade");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "toxicityGrade"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toxicityTerm");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "toxicityTerm"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
