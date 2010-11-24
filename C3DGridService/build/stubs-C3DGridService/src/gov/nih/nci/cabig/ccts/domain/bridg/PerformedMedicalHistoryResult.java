/**
 * PerformedMedicalHistoryResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * The case history of a subject as recalled by the subject.
 */
public class PerformedMedicalHistoryResult  extends gov.nih.nci.cabig.ccts.domain.bridg.PerformedObservationResult  implements java.io.Serializable {
    /** A character string that is a revision of originalText to enable
 * the coding of the text. 
 * 
 * For example, if the originalText is "hedache", the nameModifiedText
 * could be changed to "headache", so that the text can be successfully
 * coded.
 * 
 * NOTE: In the context of BRIDG, text modification occurs a single time
 * for agiven instance of OriginalText. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST codedResultModifiedText;
    /** The verbatim text of the MedicalHistoryResult.
 * 
 * For example, stroke, asthma, etc. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST description;
    /** Identifies the end of the medical history event with respect to
 * the sponsor-defined reference period. This may be populated when a
 * start date is not collected.  
 * 
 * For example, before, during, during/after, after, etc.
 * 
 * NOTE: Sponsors should define the reference period in the study metadata. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD endRelativeToReference;
    /** The date and time range that the MedicalHistoryResult began and
 * ended.
 * 
 * NOTE: These may be partial dates. */
    private gov.nih.nci.cabig.ccts.domain.cdt.IVLTS occurrenceDateRange;
    /** Identifies the start of the medical history event with respect
 * to the sponsor-defined reference period. This may be populated when
 * a start date is not collected.  
 * 
 * For example, before, during, during/after, after, etc.
 * 
 * NOTE: Sponsors should define the reference period in the study metadata. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD startRelativeToReference;

    public PerformedMedicalHistoryResult() {
    }

    public PerformedMedicalHistoryResult(
           gov.nih.nci.cabig.ccts.domain.cdt.ST codedResultModifiedText,
           gov.nih.nci.cabig.ccts.domain.cdt.ST description,
           gov.nih.nci.cabig.ccts.domain.cdt.CD endRelativeToReference,
           gov.nih.nci.cabig.ccts.domain.cdt.IVLTS occurrenceDateRange,
           gov.nih.nci.cabig.ccts.domain.cdt.CD startRelativeToReference) {
           this.codedResultModifiedText = codedResultModifiedText;
           this.description = description;
           this.endRelativeToReference = endRelativeToReference;
           this.occurrenceDateRange = occurrenceDateRange;
           this.startRelativeToReference = startRelativeToReference;
    }


    /**
     * Gets the codedResultModifiedText value for this PerformedMedicalHistoryResult.
     * 
     * @return codedResultModifiedText A character string that is a revision of originalText to enable
 * the coding of the text. 
 * 
 * For example, if the originalText is "hedache", the nameModifiedText
 * could be changed to "headache", so that the text can be successfully
 * coded.
 * 
 * NOTE: In the context of BRIDG, text modification occurs a single time
 * for agiven instance of OriginalText.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getCodedResultModifiedText() {
        return codedResultModifiedText;
    }


    /**
     * Sets the codedResultModifiedText value for this PerformedMedicalHistoryResult.
     * 
     * @param codedResultModifiedText A character string that is a revision of originalText to enable
 * the coding of the text. 
 * 
 * For example, if the originalText is "hedache", the nameModifiedText
 * could be changed to "headache", so that the text can be successfully
 * coded.
 * 
 * NOTE: In the context of BRIDG, text modification occurs a single time
 * for agiven instance of OriginalText.
     */
    public void setCodedResultModifiedText(gov.nih.nci.cabig.ccts.domain.cdt.ST codedResultModifiedText) {
        this.codedResultModifiedText = codedResultModifiedText;
    }


    /**
     * Gets the description value for this PerformedMedicalHistoryResult.
     * 
     * @return description The verbatim text of the MedicalHistoryResult.
 * 
 * For example, stroke, asthma, etc.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PerformedMedicalHistoryResult.
     * 
     * @param description The verbatim text of the MedicalHistoryResult.
 * 
 * For example, stroke, asthma, etc.
     */
    public void setDescription(gov.nih.nci.cabig.ccts.domain.cdt.ST description) {
        this.description = description;
    }


    /**
     * Gets the endRelativeToReference value for this PerformedMedicalHistoryResult.
     * 
     * @return endRelativeToReference Identifies the end of the medical history event with respect to
 * the sponsor-defined reference period. This may be populated when a
 * start date is not collected.  
 * 
 * For example, before, during, during/after, after, etc.
 * 
 * NOTE: Sponsors should define the reference period in the study metadata.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getEndRelativeToReference() {
        return endRelativeToReference;
    }


    /**
     * Sets the endRelativeToReference value for this PerformedMedicalHistoryResult.
     * 
     * @param endRelativeToReference Identifies the end of the medical history event with respect to
 * the sponsor-defined reference period. This may be populated when a
 * start date is not collected.  
 * 
 * For example, before, during, during/after, after, etc.
 * 
 * NOTE: Sponsors should define the reference period in the study metadata.
     */
    public void setEndRelativeToReference(gov.nih.nci.cabig.ccts.domain.cdt.CD endRelativeToReference) {
        this.endRelativeToReference = endRelativeToReference;
    }


    /**
     * Gets the occurrenceDateRange value for this PerformedMedicalHistoryResult.
     * 
     * @return occurrenceDateRange The date and time range that the MedicalHistoryResult began and
 * ended.
 * 
 * NOTE: These may be partial dates.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.IVLTS getOccurrenceDateRange() {
        return occurrenceDateRange;
    }


    /**
     * Sets the occurrenceDateRange value for this PerformedMedicalHistoryResult.
     * 
     * @param occurrenceDateRange The date and time range that the MedicalHistoryResult began and
 * ended.
 * 
 * NOTE: These may be partial dates.
     */
    public void setOccurrenceDateRange(gov.nih.nci.cabig.ccts.domain.cdt.IVLTS occurrenceDateRange) {
        this.occurrenceDateRange = occurrenceDateRange;
    }


    /**
     * Gets the startRelativeToReference value for this PerformedMedicalHistoryResult.
     * 
     * @return startRelativeToReference Identifies the start of the medical history event with respect
 * to the sponsor-defined reference period. This may be populated when
 * a start date is not collected.  
 * 
 * For example, before, during, during/after, after, etc.
 * 
 * NOTE: Sponsors should define the reference period in the study metadata.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getStartRelativeToReference() {
        return startRelativeToReference;
    }


    /**
     * Sets the startRelativeToReference value for this PerformedMedicalHistoryResult.
     * 
     * @param startRelativeToReference Identifies the start of the medical history event with respect
 * to the sponsor-defined reference period. This may be populated when
 * a start date is not collected.  
 * 
 * For example, before, during, during/after, after, etc.
 * 
 * NOTE: Sponsors should define the reference period in the study metadata.
     */
    public void setStartRelativeToReference(gov.nih.nci.cabig.ccts.domain.cdt.CD startRelativeToReference) {
        this.startRelativeToReference = startRelativeToReference;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformedMedicalHistoryResult)) return false;
        PerformedMedicalHistoryResult other = (PerformedMedicalHistoryResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.codedResultModifiedText==null && other.getCodedResultModifiedText()==null) || 
             (this.codedResultModifiedText!=null &&
              this.codedResultModifiedText.equals(other.getCodedResultModifiedText()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.endRelativeToReference==null && other.getEndRelativeToReference()==null) || 
             (this.endRelativeToReference!=null &&
              this.endRelativeToReference.equals(other.getEndRelativeToReference()))) &&
            ((this.occurrenceDateRange==null && other.getOccurrenceDateRange()==null) || 
             (this.occurrenceDateRange!=null &&
              this.occurrenceDateRange.equals(other.getOccurrenceDateRange()))) &&
            ((this.startRelativeToReference==null && other.getStartRelativeToReference()==null) || 
             (this.startRelativeToReference!=null &&
              this.startRelativeToReference.equals(other.getStartRelativeToReference())));
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
        if (getCodedResultModifiedText() != null) {
            _hashCode += getCodedResultModifiedText().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEndRelativeToReference() != null) {
            _hashCode += getEndRelativeToReference().hashCode();
        }
        if (getOccurrenceDateRange() != null) {
            _hashCode += getOccurrenceDateRange().hashCode();
        }
        if (getStartRelativeToReference() != null) {
            _hashCode += getStartRelativeToReference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PerformedMedicalHistoryResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedMedicalHistoryResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codedResultModifiedText");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "codedResultModifiedText"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endRelativeToReference");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "endRelativeToReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("occurrenceDateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "occurrenceDateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "IVLTS"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startRelativeToReference");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "startRelativeToReference"));
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
