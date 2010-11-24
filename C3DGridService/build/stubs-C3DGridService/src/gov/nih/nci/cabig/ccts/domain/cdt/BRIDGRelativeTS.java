/**
 * BRIDGRelativeTS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.cdt;


/**
 * A data type that allows for the specification of relative rather
 * than absolute times in terms of a user-definable off-set.  Differs
 * from an EIVL_TS in that the reference point or event is user-define-able
 * and name-able rather than being restricted to the HL7-identified events.
 * 
 * For example, 5 days after the start of the study or 3 days before
 * bone marrow transplantation.
 */
public class BRIDGRelativeTS  implements java.io.Serializable {
    /** The number of timeOffsetUnits from the timeOffsetReferencePoint.
 * 
 * For example, in the statement "draw CBC 5 days after TreatmentStartDate",
 * the number 5 is the timeOffset. */
    private int endTimeOffset;
    /** The number of timeOffsetUnits from the timeOffsetReferencePoint.
 * 
 * For example, in the statement "draw CBC 5 days after TreatmentStartDate",
 * the number 5 is the timeOffset. */
    private int startTimeOffset;
    /** Identifies a value to further define the timeOffset in relationship
 * to a timeOffsetReferencePoint.
 * 
 * For example, in the statement "draw CBC 5 days after TreatmentStartDate",
 * the word "after" is the timeOffsetDescriptor. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD timeOffsetDescriptor;
    /** The starting point for the relative timing specification which
 * is typically an explicitly defined milestone or other administrative
 * point on the study timeline.
 * 
 * For example, TreatmentStartDate might be defined as the first day
 * of chemotherapy administration. Additional activities would use the
 * TreatmentStartDate as the timeOffsetReferencePoint (e.g. draw CBC
 * 5 days after TreatmentStartDate). */
    private java.lang.String timeOffsetReferencePoint;
    /** The unit of measurement (e.g. minutes, hours, days, weeks) that
 * the timeOffset occurs from the timeOffsetReferencePoint.
 * 
 * For example, in the statement "draw CBC 5 days after TreatmentStartDate",
 * the word "days" is the timeOffsetUnit. */
    private java.lang.String timeOffsetUnit;

    public BRIDGRelativeTS() {
    }

    public BRIDGRelativeTS(
           int endTimeOffset,
           int startTimeOffset,
           gov.nih.nci.cabig.ccts.domain.cdt.CD timeOffsetDescriptor,
           java.lang.String timeOffsetReferencePoint,
           java.lang.String timeOffsetUnit) {
           this.endTimeOffset = endTimeOffset;
           this.startTimeOffset = startTimeOffset;
           this.timeOffsetDescriptor = timeOffsetDescriptor;
           this.timeOffsetReferencePoint = timeOffsetReferencePoint;
           this.timeOffsetUnit = timeOffsetUnit;
    }


    /**
     * Gets the endTimeOffset value for this BRIDGRelativeTS.
     * 
     * @return endTimeOffset The number of timeOffsetUnits from the timeOffsetReferencePoint.
 * 
 * For example, in the statement "draw CBC 5 days after TreatmentStartDate",
 * the number 5 is the timeOffset.
     */
    public int getEndTimeOffset() {
        return endTimeOffset;
    }


    /**
     * Sets the endTimeOffset value for this BRIDGRelativeTS.
     * 
     * @param endTimeOffset The number of timeOffsetUnits from the timeOffsetReferencePoint.
 * 
 * For example, in the statement "draw CBC 5 days after TreatmentStartDate",
 * the number 5 is the timeOffset.
     */
    public void setEndTimeOffset(int endTimeOffset) {
        this.endTimeOffset = endTimeOffset;
    }


    /**
     * Gets the startTimeOffset value for this BRIDGRelativeTS.
     * 
     * @return startTimeOffset The number of timeOffsetUnits from the timeOffsetReferencePoint.
 * 
 * For example, in the statement "draw CBC 5 days after TreatmentStartDate",
 * the number 5 is the timeOffset.
     */
    public int getStartTimeOffset() {
        return startTimeOffset;
    }


    /**
     * Sets the startTimeOffset value for this BRIDGRelativeTS.
     * 
     * @param startTimeOffset The number of timeOffsetUnits from the timeOffsetReferencePoint.
 * 
 * For example, in the statement "draw CBC 5 days after TreatmentStartDate",
 * the number 5 is the timeOffset.
     */
    public void setStartTimeOffset(int startTimeOffset) {
        this.startTimeOffset = startTimeOffset;
    }


    /**
     * Gets the timeOffsetDescriptor value for this BRIDGRelativeTS.
     * 
     * @return timeOffsetDescriptor Identifies a value to further define the timeOffset in relationship
 * to a timeOffsetReferencePoint.
 * 
 * For example, in the statement "draw CBC 5 days after TreatmentStartDate",
 * the word "after" is the timeOffsetDescriptor.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getTimeOffsetDescriptor() {
        return timeOffsetDescriptor;
    }


    /**
     * Sets the timeOffsetDescriptor value for this BRIDGRelativeTS.
     * 
     * @param timeOffsetDescriptor Identifies a value to further define the timeOffset in relationship
 * to a timeOffsetReferencePoint.
 * 
 * For example, in the statement "draw CBC 5 days after TreatmentStartDate",
 * the word "after" is the timeOffsetDescriptor.
     */
    public void setTimeOffsetDescriptor(gov.nih.nci.cabig.ccts.domain.cdt.CD timeOffsetDescriptor) {
        this.timeOffsetDescriptor = timeOffsetDescriptor;
    }


    /**
     * Gets the timeOffsetReferencePoint value for this BRIDGRelativeTS.
     * 
     * @return timeOffsetReferencePoint The starting point for the relative timing specification which
 * is typically an explicitly defined milestone or other administrative
 * point on the study timeline.
 * 
 * For example, TreatmentStartDate might be defined as the first day
 * of chemotherapy administration. Additional activities would use the
 * TreatmentStartDate as the timeOffsetReferencePoint (e.g. draw CBC
 * 5 days after TreatmentStartDate).
     */
    public java.lang.String getTimeOffsetReferencePoint() {
        return timeOffsetReferencePoint;
    }


    /**
     * Sets the timeOffsetReferencePoint value for this BRIDGRelativeTS.
     * 
     * @param timeOffsetReferencePoint The starting point for the relative timing specification which
 * is typically an explicitly defined milestone or other administrative
 * point on the study timeline.
 * 
 * For example, TreatmentStartDate might be defined as the first day
 * of chemotherapy administration. Additional activities would use the
 * TreatmentStartDate as the timeOffsetReferencePoint (e.g. draw CBC
 * 5 days after TreatmentStartDate).
     */
    public void setTimeOffsetReferencePoint(java.lang.String timeOffsetReferencePoint) {
        this.timeOffsetReferencePoint = timeOffsetReferencePoint;
    }


    /**
     * Gets the timeOffsetUnit value for this BRIDGRelativeTS.
     * 
     * @return timeOffsetUnit The unit of measurement (e.g. minutes, hours, days, weeks) that
 * the timeOffset occurs from the timeOffsetReferencePoint.
 * 
 * For example, in the statement "draw CBC 5 days after TreatmentStartDate",
 * the word "days" is the timeOffsetUnit.
     */
    public java.lang.String getTimeOffsetUnit() {
        return timeOffsetUnit;
    }


    /**
     * Sets the timeOffsetUnit value for this BRIDGRelativeTS.
     * 
     * @param timeOffsetUnit The unit of measurement (e.g. minutes, hours, days, weeks) that
 * the timeOffset occurs from the timeOffsetReferencePoint.
 * 
 * For example, in the statement "draw CBC 5 days after TreatmentStartDate",
 * the word "days" is the timeOffsetUnit.
     */
    public void setTimeOffsetUnit(java.lang.String timeOffsetUnit) {
        this.timeOffsetUnit = timeOffsetUnit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BRIDGRelativeTS)) return false;
        BRIDGRelativeTS other = (BRIDGRelativeTS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.endTimeOffset == other.getEndTimeOffset() &&
            this.startTimeOffset == other.getStartTimeOffset() &&
            ((this.timeOffsetDescriptor==null && other.getTimeOffsetDescriptor()==null) || 
             (this.timeOffsetDescriptor!=null &&
              this.timeOffsetDescriptor.equals(other.getTimeOffsetDescriptor()))) &&
            ((this.timeOffsetReferencePoint==null && other.getTimeOffsetReferencePoint()==null) || 
             (this.timeOffsetReferencePoint!=null &&
              this.timeOffsetReferencePoint.equals(other.getTimeOffsetReferencePoint()))) &&
            ((this.timeOffsetUnit==null && other.getTimeOffsetUnit()==null) || 
             (this.timeOffsetUnit!=null &&
              this.timeOffsetUnit.equals(other.getTimeOffsetUnit())));
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
        _hashCode += getEndTimeOffset();
        _hashCode += getStartTimeOffset();
        if (getTimeOffsetDescriptor() != null) {
            _hashCode += getTimeOffsetDescriptor().hashCode();
        }
        if (getTimeOffsetReferencePoint() != null) {
            _hashCode += getTimeOffsetReferencePoint().hashCode();
        }
        if (getTimeOffsetUnit() != null) {
            _hashCode += getTimeOffsetUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BRIDGRelativeTS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "BRIDGRelativeTS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTimeOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "endTimeOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTimeOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "startTimeOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeOffsetDescriptor");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "timeOffsetDescriptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeOffsetReferencePoint");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "timeOffsetReferencePoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeOffsetUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "timeOffsetUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
