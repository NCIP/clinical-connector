/**
 * ObservationResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * The result of observing, monitoring, measuring or otherwise qualitatively
 * or quantitatively recording one or more aspects of physiologic or
 * psychologic processes. 
 * 
 * For example, in a clinical trial, observations can result from planned
 * activities to address specific questions such as those observations
 * made during a physical examination, laboratory tests, ECG testing,
 * and sets of individual questions listed on questionnaires. 
 * 
 * NOTE: Not all observations are necessarily planned -- for example,
 * some observations may be laboratory tests that are done in response
 * to patient occurrences that are not planned but used to assess patient
 * symptoms. 
 * 
 * NOTE: An observation may be a symptom that a patient experiences that,
 * in the context of a particular clinical trial, will be assessed as
 * adverse.
 */
public abstract class ObservationResult  implements java.io.Serializable {
    /** Specifies whether the value associated with (e.g. observation)
 * or derived from (e.g. assessment) a specified Activity can be used
 * as the reference point against which subsequent observation/assessment
 * values may be compared in order to determine the outcome of a particular
 * process, procedure, or intervention. */
    private gov.nih.nci.cabig.ccts.domain.cdt.BL baselineIndicator;
    /** Coded data or information that is determined by an act of observation.
 * 
 * For example, the result of a lab test, physical finding, self-reported
 * symptom. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD codedResult;
    /** The additional free text description of an ObservationResult.
 * 
 * For example, comments from the investigator regarding the condition
 * of the specimen or any other observation.
 * 
 * For example, comments in addition to the specimen condition from the
 * central or performing laboratory describing the specimen. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST comment;
    /** A code for the degree of confidentiality applicable to an ObservationResult. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD confidentiality;
    /** Numeric data or information that is determined by an act of observation.
 * 
 * For example, the result of a lab test, physical finding, self-reported
 * symptom. */
    private gov.nih.nci.cabig.ccts.domain.cdt.PQ numericResult;
    /** The date and time that the ObservationResult was reported. */
    private gov.nih.nci.cabig.ccts.domain.cdt.TS reportedDate;
    /** A code specifying detail about an anatomical site or system that
 * is the focus of the observation.
 * 
 * For example, left arm for skin rash */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD targetSite;
    /** Textual data or information that is determined by an act of observation.
 * 
 * For example, the result of a lab test, physical finding, self-reported
 * symptom. For example, the result for a HIV test would be positive
 * or negative. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST textResult;
    /** A code indicating whether the ObservationResult, with its subordinate
 * components has been asserted to be uncertain in any way. 
 * 
 * For example, a patient might have had a cholecystectomy procedure
 * in the past (but isn't sure). */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD uncertainty;
    private gov.nih.nci.cabig.ccts.domain.bridg.ObservationResultAssessmentRelationship[] observationResultAssessmentRelationship;

    public ObservationResult() {
    }

    public ObservationResult(
           gov.nih.nci.cabig.ccts.domain.cdt.BL baselineIndicator,
           gov.nih.nci.cabig.ccts.domain.cdt.CD codedResult,
           gov.nih.nci.cabig.ccts.domain.cdt.ST comment,
           gov.nih.nci.cabig.ccts.domain.cdt.CD confidentiality,
           gov.nih.nci.cabig.ccts.domain.cdt.PQ numericResult,
           gov.nih.nci.cabig.ccts.domain.bridg.ObservationResultAssessmentRelationship[] observationResultAssessmentRelationship,
           gov.nih.nci.cabig.ccts.domain.cdt.TS reportedDate,
           gov.nih.nci.cabig.ccts.domain.cdt.CD targetSite,
           gov.nih.nci.cabig.ccts.domain.cdt.ST textResult,
           gov.nih.nci.cabig.ccts.domain.cdt.CD uncertainty) {
           this.baselineIndicator = baselineIndicator;
           this.codedResult = codedResult;
           this.comment = comment;
           this.confidentiality = confidentiality;
           this.numericResult = numericResult;
           this.reportedDate = reportedDate;
           this.targetSite = targetSite;
           this.textResult = textResult;
           this.uncertainty = uncertainty;
           this.observationResultAssessmentRelationship = observationResultAssessmentRelationship;
    }


    /**
     * Gets the baselineIndicator value for this ObservationResult.
     * 
     * @return baselineIndicator Specifies whether the value associated with (e.g. observation)
 * or derived from (e.g. assessment) a specified Activity can be used
 * as the reference point against which subsequent observation/assessment
 * values may be compared in order to determine the outcome of a particular
 * process, procedure, or intervention.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.BL getBaselineIndicator() {
        return baselineIndicator;
    }


    /**
     * Sets the baselineIndicator value for this ObservationResult.
     * 
     * @param baselineIndicator Specifies whether the value associated with (e.g. observation)
 * or derived from (e.g. assessment) a specified Activity can be used
 * as the reference point against which subsequent observation/assessment
 * values may be compared in order to determine the outcome of a particular
 * process, procedure, or intervention.
     */
    public void setBaselineIndicator(gov.nih.nci.cabig.ccts.domain.cdt.BL baselineIndicator) {
        this.baselineIndicator = baselineIndicator;
    }


    /**
     * Gets the codedResult value for this ObservationResult.
     * 
     * @return codedResult Coded data or information that is determined by an act of observation.
 * 
 * For example, the result of a lab test, physical finding, self-reported
 * symptom.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getCodedResult() {
        return codedResult;
    }


    /**
     * Sets the codedResult value for this ObservationResult.
     * 
     * @param codedResult Coded data or information that is determined by an act of observation.
 * 
 * For example, the result of a lab test, physical finding, self-reported
 * symptom.
     */
    public void setCodedResult(gov.nih.nci.cabig.ccts.domain.cdt.CD codedResult) {
        this.codedResult = codedResult;
    }


    /**
     * Gets the comment value for this ObservationResult.
     * 
     * @return comment The additional free text description of an ObservationResult.
 * 
 * For example, comments from the investigator regarding the condition
 * of the specimen or any other observation.
 * 
 * For example, comments in addition to the specimen condition from the
 * central or performing laboratory describing the specimen.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this ObservationResult.
     * 
     * @param comment The additional free text description of an ObservationResult.
 * 
 * For example, comments from the investigator regarding the condition
 * of the specimen or any other observation.
 * 
 * For example, comments in addition to the specimen condition from the
 * central or performing laboratory describing the specimen.
     */
    public void setComment(gov.nih.nci.cabig.ccts.domain.cdt.ST comment) {
        this.comment = comment;
    }


    /**
     * Gets the confidentiality value for this ObservationResult.
     * 
     * @return confidentiality A code for the degree of confidentiality applicable to an ObservationResult.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getConfidentiality() {
        return confidentiality;
    }


    /**
     * Sets the confidentiality value for this ObservationResult.
     * 
     * @param confidentiality A code for the degree of confidentiality applicable to an ObservationResult.
     */
    public void setConfidentiality(gov.nih.nci.cabig.ccts.domain.cdt.CD confidentiality) {
        this.confidentiality = confidentiality;
    }


    /**
     * Gets the numericResult value for this ObservationResult.
     * 
     * @return numericResult Numeric data or information that is determined by an act of observation.
 * 
 * For example, the result of a lab test, physical finding, self-reported
 * symptom.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.PQ getNumericResult() {
        return numericResult;
    }


    /**
     * Sets the numericResult value for this ObservationResult.
     * 
     * @param numericResult Numeric data or information that is determined by an act of observation.
 * 
 * For example, the result of a lab test, physical finding, self-reported
 * symptom.
     */
    public void setNumericResult(gov.nih.nci.cabig.ccts.domain.cdt.PQ numericResult) {
        this.numericResult = numericResult;
    }


    /**
     * Gets the reportedDate value for this ObservationResult.
     * 
     * @return reportedDate The date and time that the ObservationResult was reported.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.TS getReportedDate() {
        return reportedDate;
    }


    /**
     * Sets the reportedDate value for this ObservationResult.
     * 
     * @param reportedDate The date and time that the ObservationResult was reported.
     */
    public void setReportedDate(gov.nih.nci.cabig.ccts.domain.cdt.TS reportedDate) {
        this.reportedDate = reportedDate;
    }


    /**
     * Gets the targetSite value for this ObservationResult.
     * 
     * @return targetSite A code specifying detail about an anatomical site or system that
 * is the focus of the observation.
 * 
 * For example, left arm for skin rash
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getTargetSite() {
        return targetSite;
    }


    /**
     * Sets the targetSite value for this ObservationResult.
     * 
     * @param targetSite A code specifying detail about an anatomical site or system that
 * is the focus of the observation.
 * 
 * For example, left arm for skin rash
     */
    public void setTargetSite(gov.nih.nci.cabig.ccts.domain.cdt.CD targetSite) {
        this.targetSite = targetSite;
    }


    /**
     * Gets the textResult value for this ObservationResult.
     * 
     * @return textResult Textual data or information that is determined by an act of observation.
 * 
 * For example, the result of a lab test, physical finding, self-reported
 * symptom. For example, the result for a HIV test would be positive
 * or negative.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getTextResult() {
        return textResult;
    }


    /**
     * Sets the textResult value for this ObservationResult.
     * 
     * @param textResult Textual data or information that is determined by an act of observation.
 * 
 * For example, the result of a lab test, physical finding, self-reported
 * symptom. For example, the result for a HIV test would be positive
 * or negative.
     */
    public void setTextResult(gov.nih.nci.cabig.ccts.domain.cdt.ST textResult) {
        this.textResult = textResult;
    }


    /**
     * Gets the uncertainty value for this ObservationResult.
     * 
     * @return uncertainty A code indicating whether the ObservationResult, with its subordinate
 * components has been asserted to be uncertain in any way. 
 * 
 * For example, a patient might have had a cholecystectomy procedure
 * in the past (but isn't sure).
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getUncertainty() {
        return uncertainty;
    }


    /**
     * Sets the uncertainty value for this ObservationResult.
     * 
     * @param uncertainty A code indicating whether the ObservationResult, with its subordinate
 * components has been asserted to be uncertain in any way. 
 * 
 * For example, a patient might have had a cholecystectomy procedure
 * in the past (but isn't sure).
     */
    public void setUncertainty(gov.nih.nci.cabig.ccts.domain.cdt.CD uncertainty) {
        this.uncertainty = uncertainty;
    }


    /**
     * Gets the observationResultAssessmentRelationship value for this ObservationResult.
     * 
     * @return observationResultAssessmentRelationship
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.ObservationResultAssessmentRelationship[] getObservationResultAssessmentRelationship() {
        return observationResultAssessmentRelationship;
    }


    /**
     * Sets the observationResultAssessmentRelationship value for this ObservationResult.
     * 
     * @param observationResultAssessmentRelationship
     */
    public void setObservationResultAssessmentRelationship(gov.nih.nci.cabig.ccts.domain.bridg.ObservationResultAssessmentRelationship[] observationResultAssessmentRelationship) {
        this.observationResultAssessmentRelationship = observationResultAssessmentRelationship;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.ObservationResultAssessmentRelationship getObservationResultAssessmentRelationship(int i) {
        return this.observationResultAssessmentRelationship[i];
    }

    public void setObservationResultAssessmentRelationship(int i, gov.nih.nci.cabig.ccts.domain.bridg.ObservationResultAssessmentRelationship _value) {
        this.observationResultAssessmentRelationship[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObservationResult)) return false;
        ObservationResult other = (ObservationResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.baselineIndicator==null && other.getBaselineIndicator()==null) || 
             (this.baselineIndicator!=null &&
              this.baselineIndicator.equals(other.getBaselineIndicator()))) &&
            ((this.codedResult==null && other.getCodedResult()==null) || 
             (this.codedResult!=null &&
              this.codedResult.equals(other.getCodedResult()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.confidentiality==null && other.getConfidentiality()==null) || 
             (this.confidentiality!=null &&
              this.confidentiality.equals(other.getConfidentiality()))) &&
            ((this.numericResult==null && other.getNumericResult()==null) || 
             (this.numericResult!=null &&
              this.numericResult.equals(other.getNumericResult()))) &&
            ((this.reportedDate==null && other.getReportedDate()==null) || 
             (this.reportedDate!=null &&
              this.reportedDate.equals(other.getReportedDate()))) &&
            ((this.targetSite==null && other.getTargetSite()==null) || 
             (this.targetSite!=null &&
              this.targetSite.equals(other.getTargetSite()))) &&
            ((this.textResult==null && other.getTextResult()==null) || 
             (this.textResult!=null &&
              this.textResult.equals(other.getTextResult()))) &&
            ((this.uncertainty==null && other.getUncertainty()==null) || 
             (this.uncertainty!=null &&
              this.uncertainty.equals(other.getUncertainty()))) &&
            ((this.observationResultAssessmentRelationship==null && other.getObservationResultAssessmentRelationship()==null) || 
             (this.observationResultAssessmentRelationship!=null &&
              java.util.Arrays.equals(this.observationResultAssessmentRelationship, other.getObservationResultAssessmentRelationship())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBaselineIndicator() != null) {
            _hashCode += getBaselineIndicator().hashCode();
        }
        if (getCodedResult() != null) {
            _hashCode += getCodedResult().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getConfidentiality() != null) {
            _hashCode += getConfidentiality().hashCode();
        }
        if (getNumericResult() != null) {
            _hashCode += getNumericResult().hashCode();
        }
        if (getReportedDate() != null) {
            _hashCode += getReportedDate().hashCode();
        }
        if (getTargetSite() != null) {
            _hashCode += getTargetSite().hashCode();
        }
        if (getTextResult() != null) {
            _hashCode += getTextResult().hashCode();
        }
        if (getUncertainty() != null) {
            _hashCode += getUncertainty().hashCode();
        }
        if (getObservationResultAssessmentRelationship() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getObservationResultAssessmentRelationship());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getObservationResultAssessmentRelationship(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObservationResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ObservationResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baselineIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "baselineIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "BL"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codedResult");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "codedResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confidentiality");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "confidentiality"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numericResult");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "numericResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "PQ"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "reportedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "TS"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetSite");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "targetSite"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textResult");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "textResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uncertainty");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "uncertainty"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observationResultAssessmentRelationship");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ObservationResultAssessmentRelationship"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ObservationResultAssessmentRelationship"));
        elemField.setMinOccurs(0);
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
