/**
 * ScheduledStudySegmentStudyCellRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * Specifies how a study cell is related to one of the StudySegments
 * instances it contains.
 * 
 * For example, if the plan for the Surgery Arm/Treatment Epoch study
 * cell is that subjects should go through the three StudySegments, Pre-Op,
 * Surgery, and Post-Op in that order, then that sequence is defined
 * using StudySegment Study Cell Relationship instances.
 * 
 * For example, A StudyCell "Arm A/Treatment Epoch" may have StudySegments
 * "A1", "A2", etc..  The sequence in which the different StudySegments
 * will occur in StudyCell "Arm A/Treatment Epoch" will be defined by
 * the semantics of the StudySegmentStudyCellRule class.
 * 
 * For example, go from surgery StudySegment to post-op StudySegment
 * in StudyCell "Surgery Arm/Treatment Epoch".
 */
public class ScheduledStudySegmentStudyCellRule  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.ScheduledStudySegment scheduledStudySegment;
    private gov.nih.nci.cabig.ccts.domain.bridg.ScheduledStudyCell scheduledStudyCell;

    public ScheduledStudySegmentStudyCellRule() {
    }

    public ScheduledStudySegmentStudyCellRule(
           gov.nih.nci.cabig.ccts.domain.bridg.ScheduledStudyCell scheduledStudyCell,
           gov.nih.nci.cabig.ccts.domain.bridg.ScheduledStudySegment scheduledStudySegment) {
           this.scheduledStudySegment = scheduledStudySegment;
           this.scheduledStudyCell = scheduledStudyCell;
    }


    /**
     * Gets the scheduledStudySegment value for this ScheduledStudySegmentStudyCellRule.
     * 
     * @return scheduledStudySegment
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.ScheduledStudySegment getScheduledStudySegment() {
        return scheduledStudySegment;
    }


    /**
     * Sets the scheduledStudySegment value for this ScheduledStudySegmentStudyCellRule.
     * 
     * @param scheduledStudySegment
     */
    public void setScheduledStudySegment(gov.nih.nci.cabig.ccts.domain.bridg.ScheduledStudySegment scheduledStudySegment) {
        this.scheduledStudySegment = scheduledStudySegment;
    }


    /**
     * Gets the scheduledStudyCell value for this ScheduledStudySegmentStudyCellRule.
     * 
     * @return scheduledStudyCell
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.ScheduledStudyCell getScheduledStudyCell() {
        return scheduledStudyCell;
    }


    /**
     * Sets the scheduledStudyCell value for this ScheduledStudySegmentStudyCellRule.
     * 
     * @param scheduledStudyCell
     */
    public void setScheduledStudyCell(gov.nih.nci.cabig.ccts.domain.bridg.ScheduledStudyCell scheduledStudyCell) {
        this.scheduledStudyCell = scheduledStudyCell;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduledStudySegmentStudyCellRule)) return false;
        ScheduledStudySegmentStudyCellRule other = (ScheduledStudySegmentStudyCellRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.scheduledStudySegment==null && other.getScheduledStudySegment()==null) || 
             (this.scheduledStudySegment!=null &&
              this.scheduledStudySegment.equals(other.getScheduledStudySegment()))) &&
            ((this.scheduledStudyCell==null && other.getScheduledStudyCell()==null) || 
             (this.scheduledStudyCell!=null &&
              this.scheduledStudyCell.equals(other.getScheduledStudyCell())));
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
        if (getScheduledStudySegment() != null) {
            _hashCode += getScheduledStudySegment().hashCode();
        }
        if (getScheduledStudyCell() != null) {
            _hashCode += getScheduledStudyCell().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScheduledStudySegmentStudyCellRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledStudySegmentStudyCellRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledStudySegment");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledStudySegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledStudySegment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledStudyCell");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledStudyCell"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledStudyCell"));
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
