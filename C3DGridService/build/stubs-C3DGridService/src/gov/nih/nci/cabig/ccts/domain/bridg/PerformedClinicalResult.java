/**
 * PerformedClinicalResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * An observation with a result that can be measured and expressed
 * numerically or textually.  
 * 
 * For example, the performed observation of "WBC count" would be associated
 * to a clinical result called "WBC result" in which the results of the
 * observation (13,00 WBCs) would be stored.
 */
public class PerformedClinicalResult  extends gov.nih.nci.cabig.ccts.domain.bridg.PerformedObservationResult  implements java.io.Serializable {
    /** Specifies whether the observation is in the units or values as
 * originally collected.
 * 
 * For example, a performing lab may have completed the observation or
 * lab test using conventional units, but the sponsor may wish to have
 * the test reported in SI units. This flag will be set to TRUE on the
 * lab test that has the original units, and FALSE on the lab test in
 * which the units that are different than the lab test's original units.
 * 
 * NOTE: There is an association between the observation that has the
 * original data (and the original units) and the observation in which
 * the data elements have been converted into standardized units. */
    private gov.nih.nci.cabig.ccts.domain.cdt.BL asCollectedIndicator;
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
    /** The relationship of a value to a normal range or reference range
 * of values.
 * 
 * For example, high, low, within normal range, outside normal range. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD normalRangeComparison;
    /** An integer indicating the position of the rightmost significant
 * digit with positive numbers extending to the right of the decimal
 * point and with negative numbers extending to the left of the decimal
 * point. */
    private int numericPrecision;
    /** An optional textual description of the characteristics of the reference
 * range.
 * 
 * NOTE: May describe a special reference range for demographics. For
 * example:  "An age-related range has been applied."  May include the
 * specific instrument used to measure the value.
 * NOTE: Will map to appropriate field in HL7 V3 */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST referenceRangeComment;
    /** The upper limit of the reported reference range. */
    private gov.nih.nci.cabig.ccts.domain.cdt.REAL referenceRangeHigh;
    /** The lower limit of the reported reference range. */
    private gov.nih.nci.cabig.ccts.domain.cdt.REAL referenceRangeLow;
    /** One or more text values that represent a normal text result. 
 * 
 * For example, positive, negative, sensitive, or resistant in a bacterial
 * culture susceptibility test. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD referenceTextList;
    /** The status of the reported result. 
 * 
 * For example, preliminary, final, and corrected. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD reportedResultStatus;

    public PerformedClinicalResult() {
    }

    public PerformedClinicalResult(
           gov.nih.nci.cabig.ccts.domain.cdt.BL asCollectedIndicator,
           gov.nih.nci.cabig.ccts.domain.cdt.ST codedResultModifiedText,
           gov.nih.nci.cabig.ccts.domain.cdt.CD normalRangeComparison,
           int numericPrecision,
           gov.nih.nci.cabig.ccts.domain.cdt.ST referenceRangeComment,
           gov.nih.nci.cabig.ccts.domain.cdt.REAL referenceRangeHigh,
           gov.nih.nci.cabig.ccts.domain.cdt.REAL referenceRangeLow,
           gov.nih.nci.cabig.ccts.domain.cdt.CD referenceTextList,
           gov.nih.nci.cabig.ccts.domain.cdt.CD reportedResultStatus) {
           this.asCollectedIndicator = asCollectedIndicator;
           this.codedResultModifiedText = codedResultModifiedText;
           this.normalRangeComparison = normalRangeComparison;
           this.numericPrecision = numericPrecision;
           this.referenceRangeComment = referenceRangeComment;
           this.referenceRangeHigh = referenceRangeHigh;
           this.referenceRangeLow = referenceRangeLow;
           this.referenceTextList = referenceTextList;
           this.reportedResultStatus = reportedResultStatus;
    }


    /**
     * Gets the asCollectedIndicator value for this PerformedClinicalResult.
     * 
     * @return asCollectedIndicator Specifies whether the observation is in the units or values as
 * originally collected.
 * 
 * For example, a performing lab may have completed the observation or
 * lab test using conventional units, but the sponsor may wish to have
 * the test reported in SI units. This flag will be set to TRUE on the
 * lab test that has the original units, and FALSE on the lab test in
 * which the units that are different than the lab test's original units.
 * 
 * NOTE: There is an association between the observation that has the
 * original data (and the original units) and the observation in which
 * the data elements have been converted into standardized units.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.BL getAsCollectedIndicator() {
        return asCollectedIndicator;
    }


    /**
     * Sets the asCollectedIndicator value for this PerformedClinicalResult.
     * 
     * @param asCollectedIndicator Specifies whether the observation is in the units or values as
 * originally collected.
 * 
 * For example, a performing lab may have completed the observation or
 * lab test using conventional units, but the sponsor may wish to have
 * the test reported in SI units. This flag will be set to TRUE on the
 * lab test that has the original units, and FALSE on the lab test in
 * which the units that are different than the lab test's original units.
 * 
 * NOTE: There is an association between the observation that has the
 * original data (and the original units) and the observation in which
 * the data elements have been converted into standardized units.
     */
    public void setAsCollectedIndicator(gov.nih.nci.cabig.ccts.domain.cdt.BL asCollectedIndicator) {
        this.asCollectedIndicator = asCollectedIndicator;
    }


    /**
     * Gets the codedResultModifiedText value for this PerformedClinicalResult.
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
     * Sets the codedResultModifiedText value for this PerformedClinicalResult.
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
     * Gets the normalRangeComparison value for this PerformedClinicalResult.
     * 
     * @return normalRangeComparison The relationship of a value to a normal range or reference range
 * of values.
 * 
 * For example, high, low, within normal range, outside normal range.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getNormalRangeComparison() {
        return normalRangeComparison;
    }


    /**
     * Sets the normalRangeComparison value for this PerformedClinicalResult.
     * 
     * @param normalRangeComparison The relationship of a value to a normal range or reference range
 * of values.
 * 
 * For example, high, low, within normal range, outside normal range.
     */
    public void setNormalRangeComparison(gov.nih.nci.cabig.ccts.domain.cdt.CD normalRangeComparison) {
        this.normalRangeComparison = normalRangeComparison;
    }


    /**
     * Gets the numericPrecision value for this PerformedClinicalResult.
     * 
     * @return numericPrecision An integer indicating the position of the rightmost significant
 * digit with positive numbers extending to the right of the decimal
 * point and with negative numbers extending to the left of the decimal
 * point.
     */
    public int getNumericPrecision() {
        return numericPrecision;
    }


    /**
     * Sets the numericPrecision value for this PerformedClinicalResult.
     * 
     * @param numericPrecision An integer indicating the position of the rightmost significant
 * digit with positive numbers extending to the right of the decimal
 * point and with negative numbers extending to the left of the decimal
 * point.
     */
    public void setNumericPrecision(int numericPrecision) {
        this.numericPrecision = numericPrecision;
    }


    /**
     * Gets the referenceRangeComment value for this PerformedClinicalResult.
     * 
     * @return referenceRangeComment An optional textual description of the characteristics of the reference
 * range.
 * 
 * NOTE: May describe a special reference range for demographics. For
 * example:  "An age-related range has been applied."  May include the
 * specific instrument used to measure the value.
 * NOTE: Will map to appropriate field in HL7 V3
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getReferenceRangeComment() {
        return referenceRangeComment;
    }


    /**
     * Sets the referenceRangeComment value for this PerformedClinicalResult.
     * 
     * @param referenceRangeComment An optional textual description of the characteristics of the reference
 * range.
 * 
 * NOTE: May describe a special reference range for demographics. For
 * example:  "An age-related range has been applied."  May include the
 * specific instrument used to measure the value.
 * NOTE: Will map to appropriate field in HL7 V3
     */
    public void setReferenceRangeComment(gov.nih.nci.cabig.ccts.domain.cdt.ST referenceRangeComment) {
        this.referenceRangeComment = referenceRangeComment;
    }


    /**
     * Gets the referenceRangeHigh value for this PerformedClinicalResult.
     * 
     * @return referenceRangeHigh The upper limit of the reported reference range.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.REAL getReferenceRangeHigh() {
        return referenceRangeHigh;
    }


    /**
     * Sets the referenceRangeHigh value for this PerformedClinicalResult.
     * 
     * @param referenceRangeHigh The upper limit of the reported reference range.
     */
    public void setReferenceRangeHigh(gov.nih.nci.cabig.ccts.domain.cdt.REAL referenceRangeHigh) {
        this.referenceRangeHigh = referenceRangeHigh;
    }


    /**
     * Gets the referenceRangeLow value for this PerformedClinicalResult.
     * 
     * @return referenceRangeLow The lower limit of the reported reference range.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.REAL getReferenceRangeLow() {
        return referenceRangeLow;
    }


    /**
     * Sets the referenceRangeLow value for this PerformedClinicalResult.
     * 
     * @param referenceRangeLow The lower limit of the reported reference range.
     */
    public void setReferenceRangeLow(gov.nih.nci.cabig.ccts.domain.cdt.REAL referenceRangeLow) {
        this.referenceRangeLow = referenceRangeLow;
    }


    /**
     * Gets the referenceTextList value for this PerformedClinicalResult.
     * 
     * @return referenceTextList One or more text values that represent a normal text result. 
 * 
 * For example, positive, negative, sensitive, or resistant in a bacterial
 * culture susceptibility test.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getReferenceTextList() {
        return referenceTextList;
    }


    /**
     * Sets the referenceTextList value for this PerformedClinicalResult.
     * 
     * @param referenceTextList One or more text values that represent a normal text result. 
 * 
 * For example, positive, negative, sensitive, or resistant in a bacterial
 * culture susceptibility test.
     */
    public void setReferenceTextList(gov.nih.nci.cabig.ccts.domain.cdt.CD referenceTextList) {
        this.referenceTextList = referenceTextList;
    }


    /**
     * Gets the reportedResultStatus value for this PerformedClinicalResult.
     * 
     * @return reportedResultStatus The status of the reported result. 
 * 
 * For example, preliminary, final, and corrected.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getReportedResultStatus() {
        return reportedResultStatus;
    }


    /**
     * Sets the reportedResultStatus value for this PerformedClinicalResult.
     * 
     * @param reportedResultStatus The status of the reported result. 
 * 
 * For example, preliminary, final, and corrected.
     */
    public void setReportedResultStatus(gov.nih.nci.cabig.ccts.domain.cdt.CD reportedResultStatus) {
        this.reportedResultStatus = reportedResultStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformedClinicalResult)) return false;
        PerformedClinicalResult other = (PerformedClinicalResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.asCollectedIndicator==null && other.getAsCollectedIndicator()==null) || 
             (this.asCollectedIndicator!=null &&
              this.asCollectedIndicator.equals(other.getAsCollectedIndicator()))) &&
            ((this.codedResultModifiedText==null && other.getCodedResultModifiedText()==null) || 
             (this.codedResultModifiedText!=null &&
              this.codedResultModifiedText.equals(other.getCodedResultModifiedText()))) &&
            ((this.normalRangeComparison==null && other.getNormalRangeComparison()==null) || 
             (this.normalRangeComparison!=null &&
              this.normalRangeComparison.equals(other.getNormalRangeComparison()))) &&
            this.numericPrecision == other.getNumericPrecision() &&
            ((this.referenceRangeComment==null && other.getReferenceRangeComment()==null) || 
             (this.referenceRangeComment!=null &&
              this.referenceRangeComment.equals(other.getReferenceRangeComment()))) &&
            ((this.referenceRangeHigh==null && other.getReferenceRangeHigh()==null) || 
             (this.referenceRangeHigh!=null &&
              this.referenceRangeHigh.equals(other.getReferenceRangeHigh()))) &&
            ((this.referenceRangeLow==null && other.getReferenceRangeLow()==null) || 
             (this.referenceRangeLow!=null &&
              this.referenceRangeLow.equals(other.getReferenceRangeLow()))) &&
            ((this.referenceTextList==null && other.getReferenceTextList()==null) || 
             (this.referenceTextList!=null &&
              this.referenceTextList.equals(other.getReferenceTextList()))) &&
            ((this.reportedResultStatus==null && other.getReportedResultStatus()==null) || 
             (this.reportedResultStatus!=null &&
              this.reportedResultStatus.equals(other.getReportedResultStatus())));
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
        if (getAsCollectedIndicator() != null) {
            _hashCode += getAsCollectedIndicator().hashCode();
        }
        if (getCodedResultModifiedText() != null) {
            _hashCode += getCodedResultModifiedText().hashCode();
        }
        if (getNormalRangeComparison() != null) {
            _hashCode += getNormalRangeComparison().hashCode();
        }
        _hashCode += getNumericPrecision();
        if (getReferenceRangeComment() != null) {
            _hashCode += getReferenceRangeComment().hashCode();
        }
        if (getReferenceRangeHigh() != null) {
            _hashCode += getReferenceRangeHigh().hashCode();
        }
        if (getReferenceRangeLow() != null) {
            _hashCode += getReferenceRangeLow().hashCode();
        }
        if (getReferenceTextList() != null) {
            _hashCode += getReferenceTextList().hashCode();
        }
        if (getReportedResultStatus() != null) {
            _hashCode += getReportedResultStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PerformedClinicalResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedClinicalResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asCollectedIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "asCollectedIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "BL"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codedResultModifiedText");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "codedResultModifiedText"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("normalRangeComparison");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "normalRangeComparison"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numericPrecision");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "numericPrecision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceRangeComment");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "referenceRangeComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceRangeHigh");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "referenceRangeHigh"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "REAL"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceRangeLow");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "referenceRangeLow"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "REAL"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceTextList");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "referenceTextList"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportedResultStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "reportedResultStatus"));
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
