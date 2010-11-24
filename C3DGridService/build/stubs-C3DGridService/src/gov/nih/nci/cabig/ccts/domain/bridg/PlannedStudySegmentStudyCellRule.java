/**
 * PlannedStudySegmentStudyCellRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * Specifies how a StudyCell is related to one of the PlannedStudySegments
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
public class PlannedStudySegmentStudyCellRule  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.PlannedStudySegment plannedStudySegment;
    private gov.nih.nci.cabig.ccts.domain.bridg.PlannedStudyCell plannedStudyCell;

    public PlannedStudySegmentStudyCellRule() {
    }

    public PlannedStudySegmentStudyCellRule(
           gov.nih.nci.cabig.ccts.domain.bridg.PlannedStudyCell plannedStudyCell,
           gov.nih.nci.cabig.ccts.domain.bridg.PlannedStudySegment plannedStudySegment) {
           this.plannedStudySegment = plannedStudySegment;
           this.plannedStudyCell = plannedStudyCell;
    }


    /**
     * Gets the plannedStudySegment value for this PlannedStudySegmentStudyCellRule.
     * 
     * @return plannedStudySegment
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PlannedStudySegment getPlannedStudySegment() {
        return plannedStudySegment;
    }


    /**
     * Sets the plannedStudySegment value for this PlannedStudySegmentStudyCellRule.
     * 
     * @param plannedStudySegment
     */
    public void setPlannedStudySegment(gov.nih.nci.cabig.ccts.domain.bridg.PlannedStudySegment plannedStudySegment) {
        this.plannedStudySegment = plannedStudySegment;
    }


    /**
     * Gets the plannedStudyCell value for this PlannedStudySegmentStudyCellRule.
     * 
     * @return plannedStudyCell
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PlannedStudyCell getPlannedStudyCell() {
        return plannedStudyCell;
    }


    /**
     * Sets the plannedStudyCell value for this PlannedStudySegmentStudyCellRule.
     * 
     * @param plannedStudyCell
     */
    public void setPlannedStudyCell(gov.nih.nci.cabig.ccts.domain.bridg.PlannedStudyCell plannedStudyCell) {
        this.plannedStudyCell = plannedStudyCell;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlannedStudySegmentStudyCellRule)) return false;
        PlannedStudySegmentStudyCellRule other = (PlannedStudySegmentStudyCellRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.plannedStudySegment==null && other.getPlannedStudySegment()==null) || 
             (this.plannedStudySegment!=null &&
              this.plannedStudySegment.equals(other.getPlannedStudySegment()))) &&
            ((this.plannedStudyCell==null && other.getPlannedStudyCell()==null) || 
             (this.plannedStudyCell!=null &&
              this.plannedStudyCell.equals(other.getPlannedStudyCell())));
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
        if (getPlannedStudySegment() != null) {
            _hashCode += getPlannedStudySegment().hashCode();
        }
        if (getPlannedStudyCell() != null) {
            _hashCode += getPlannedStudyCell().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlannedStudySegmentStudyCellRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedStudySegmentStudyCellRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedStudySegment");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedStudySegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedStudySegment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedStudyCell");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedStudyCell"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedStudyCell"));
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
