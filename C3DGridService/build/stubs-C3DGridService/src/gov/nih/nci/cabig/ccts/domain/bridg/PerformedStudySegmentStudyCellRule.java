/**
 * PerformedStudySegmentStudyCellRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * Specifies how a study cell is related to one of the PlannedStudySegments
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
public class PerformedStudySegmentStudyCellRule  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.PerformedStudyCell performedStudyCell;
    private gov.nih.nci.cabig.ccts.domain.bridg.PerformedStudySegment performedStudySegment;

    public PerformedStudySegmentStudyCellRule() {
    }

    public PerformedStudySegmentStudyCellRule(
           gov.nih.nci.cabig.ccts.domain.bridg.PerformedStudyCell performedStudyCell,
           gov.nih.nci.cabig.ccts.domain.bridg.PerformedStudySegment performedStudySegment) {
           this.performedStudyCell = performedStudyCell;
           this.performedStudySegment = performedStudySegment;
    }


    /**
     * Gets the performedStudyCell value for this PerformedStudySegmentStudyCellRule.
     * 
     * @return performedStudyCell
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedStudyCell getPerformedStudyCell() {
        return performedStudyCell;
    }


    /**
     * Sets the performedStudyCell value for this PerformedStudySegmentStudyCellRule.
     * 
     * @param performedStudyCell
     */
    public void setPerformedStudyCell(gov.nih.nci.cabig.ccts.domain.bridg.PerformedStudyCell performedStudyCell) {
        this.performedStudyCell = performedStudyCell;
    }


    /**
     * Gets the performedStudySegment value for this PerformedStudySegmentStudyCellRule.
     * 
     * @return performedStudySegment
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedStudySegment getPerformedStudySegment() {
        return performedStudySegment;
    }


    /**
     * Sets the performedStudySegment value for this PerformedStudySegmentStudyCellRule.
     * 
     * @param performedStudySegment
     */
    public void setPerformedStudySegment(gov.nih.nci.cabig.ccts.domain.bridg.PerformedStudySegment performedStudySegment) {
        this.performedStudySegment = performedStudySegment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformedStudySegmentStudyCellRule)) return false;
        PerformedStudySegmentStudyCellRule other = (PerformedStudySegmentStudyCellRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.performedStudyCell==null && other.getPerformedStudyCell()==null) || 
             (this.performedStudyCell!=null &&
              this.performedStudyCell.equals(other.getPerformedStudyCell()))) &&
            ((this.performedStudySegment==null && other.getPerformedStudySegment()==null) || 
             (this.performedStudySegment!=null &&
              this.performedStudySegment.equals(other.getPerformedStudySegment())));
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
        if (getPerformedStudyCell() != null) {
            _hashCode += getPerformedStudyCell().hashCode();
        }
        if (getPerformedStudySegment() != null) {
            _hashCode += getPerformedStudySegment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PerformedStudySegmentStudyCellRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedStudySegmentStudyCellRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performedStudyCell");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedStudyCell"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedStudyCell"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performedStudySegment");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedStudySegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedStudySegment"));
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
