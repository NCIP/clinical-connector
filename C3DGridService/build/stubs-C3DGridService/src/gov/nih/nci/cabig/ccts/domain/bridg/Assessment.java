/**
 * Assessment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * An activity which involves processing of data to produce additional
 * data about that data which is distinguished from an Analysis Activity
 * by virtue of the fact that the primary data manipulation processes
 * are based on human judgment even though occasional machine/automated
 * data manipulation assistance may be invoked prior to the final judgment.
 * 
 * For example, a lab value is assessed (judged) to be an Adverse Event.
 * An Adverse Event is judged to be caused by another event.
 */
public abstract class Assessment  extends gov.nih.nci.cabig.ccts.domain.bridg.PerformedObservation  implements java.io.Serializable {
    /** Specifies whether the value associated with (e.g. observation)
 * or derived from (e.g. assessment) a specified Activity can/cannot
 * be used as the reference point against which subsequent observation/assessment
 * values may be compared in order to determine the outcome of a particular
 * process, procedure, or intervention. */
    private gov.nih.nci.cabig.ccts.domain.cdt.BL baselineIndicator;
    /** Coded data or information that is derived from the evaluation of
 * one or more pre-existing observations.
 * 
 * For example, determination that a lab panel or physical exam is "normal". */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD codedInterpretation;
    /** The additional free text description of an Assessment. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST comment;
    /** The date and time on which the Assessment was recorded. */
    private gov.nih.nci.cabig.ccts.domain.cdt.TS evaluationDate;
    /** Textual data or information that is derived from the results of
 * one or more pre-existing observations.
 * 
 * For example, determination that a lab panel or physical exam is "within
 * normal limits". */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST textInterpretation;

    public Assessment() {
    }

    public Assessment(
           gov.nih.nci.cabig.ccts.domain.cdt.BL baselineIndicator,
           gov.nih.nci.cabig.ccts.domain.cdt.CD codedInterpretation,
           gov.nih.nci.cabig.ccts.domain.cdt.ST comment,
           gov.nih.nci.cabig.ccts.domain.cdt.TS evaluationDate,
           gov.nih.nci.cabig.ccts.domain.cdt.ST textInterpretation) {
           this.baselineIndicator = baselineIndicator;
           this.codedInterpretation = codedInterpretation;
           this.comment = comment;
           this.evaluationDate = evaluationDate;
           this.textInterpretation = textInterpretation;
    }


    /**
     * Gets the baselineIndicator value for this Assessment.
     * 
     * @return baselineIndicator Specifies whether the value associated with (e.g. observation)
 * or derived from (e.g. assessment) a specified Activity can/cannot
 * be used as the reference point against which subsequent observation/assessment
 * values may be compared in order to determine the outcome of a particular
 * process, procedure, or intervention.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.BL getBaselineIndicator() {
        return baselineIndicator;
    }


    /**
     * Sets the baselineIndicator value for this Assessment.
     * 
     * @param baselineIndicator Specifies whether the value associated with (e.g. observation)
 * or derived from (e.g. assessment) a specified Activity can/cannot
 * be used as the reference point against which subsequent observation/assessment
 * values may be compared in order to determine the outcome of a particular
 * process, procedure, or intervention.
     */
    public void setBaselineIndicator(gov.nih.nci.cabig.ccts.domain.cdt.BL baselineIndicator) {
        this.baselineIndicator = baselineIndicator;
    }


    /**
     * Gets the codedInterpretation value for this Assessment.
     * 
     * @return codedInterpretation Coded data or information that is derived from the evaluation of
 * one or more pre-existing observations.
 * 
 * For example, determination that a lab panel or physical exam is "normal".
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getCodedInterpretation() {
        return codedInterpretation;
    }


    /**
     * Sets the codedInterpretation value for this Assessment.
     * 
     * @param codedInterpretation Coded data or information that is derived from the evaluation of
 * one or more pre-existing observations.
 * 
 * For example, determination that a lab panel or physical exam is "normal".
     */
    public void setCodedInterpretation(gov.nih.nci.cabig.ccts.domain.cdt.CD codedInterpretation) {
        this.codedInterpretation = codedInterpretation;
    }


    /**
     * Gets the comment value for this Assessment.
     * 
     * @return comment The additional free text description of an Assessment.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this Assessment.
     * 
     * @param comment The additional free text description of an Assessment.
     */
    public void setComment(gov.nih.nci.cabig.ccts.domain.cdt.ST comment) {
        this.comment = comment;
    }


    /**
     * Gets the evaluationDate value for this Assessment.
     * 
     * @return evaluationDate The date and time on which the Assessment was recorded.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.TS getEvaluationDate() {
        return evaluationDate;
    }


    /**
     * Sets the evaluationDate value for this Assessment.
     * 
     * @param evaluationDate The date and time on which the Assessment was recorded.
     */
    public void setEvaluationDate(gov.nih.nci.cabig.ccts.domain.cdt.TS evaluationDate) {
        this.evaluationDate = evaluationDate;
    }


    /**
     * Gets the textInterpretation value for this Assessment.
     * 
     * @return textInterpretation Textual data or information that is derived from the results of
 * one or more pre-existing observations.
 * 
 * For example, determination that a lab panel or physical exam is "within
 * normal limits".
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getTextInterpretation() {
        return textInterpretation;
    }


    /**
     * Sets the textInterpretation value for this Assessment.
     * 
     * @param textInterpretation Textual data or information that is derived from the results of
 * one or more pre-existing observations.
 * 
 * For example, determination that a lab panel or physical exam is "within
 * normal limits".
     */
    public void setTextInterpretation(gov.nih.nci.cabig.ccts.domain.cdt.ST textInterpretation) {
        this.textInterpretation = textInterpretation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Assessment)) return false;
        Assessment other = (Assessment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.baselineIndicator==null && other.getBaselineIndicator()==null) || 
             (this.baselineIndicator!=null &&
              this.baselineIndicator.equals(other.getBaselineIndicator()))) &&
            ((this.codedInterpretation==null && other.getCodedInterpretation()==null) || 
             (this.codedInterpretation!=null &&
              this.codedInterpretation.equals(other.getCodedInterpretation()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.evaluationDate==null && other.getEvaluationDate()==null) || 
             (this.evaluationDate!=null &&
              this.evaluationDate.equals(other.getEvaluationDate()))) &&
            ((this.textInterpretation==null && other.getTextInterpretation()==null) || 
             (this.textInterpretation!=null &&
              this.textInterpretation.equals(other.getTextInterpretation())));
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
        if (getBaselineIndicator() != null) {
            _hashCode += getBaselineIndicator().hashCode();
        }
        if (getCodedInterpretation() != null) {
            _hashCode += getCodedInterpretation().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getEvaluationDate() != null) {
            _hashCode += getEvaluationDate().hashCode();
        }
        if (getTextInterpretation() != null) {
            _hashCode += getTextInterpretation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Assessment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Assessment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baselineIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "baselineIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "BL"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codedInterpretation");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "codedInterpretation"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evaluationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "evaluationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "TS"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textInterpretation");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "textInterpretation"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
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
