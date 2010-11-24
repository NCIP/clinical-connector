/**
 * PlannedSoACell.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A Planned Schedule of Activities (SOA) Cell relates a Planned Activity
 * to a Planned Subject Study Encounter (SSE).  It can be visualized
 * as a single cell in the tabular representation of the Planned SOA,
 * i.e., as an X in a particular row and column of the Planned SOA table
 * that indicates that the planned activity represented by that row is
 * to take place during the SSE represented by that column.
 * 
 * For example, CBC --Row  :Week 2 -- Column
 */
public class PlannedSoACell  implements java.io.Serializable {
    /** The point in, or interval of, time to which one or more activities
 * may be associated. 
 * 
 * For example, 28 days after enrollment on the study. */
    private gov.nih.nci.cabig.ccts.domain.cdt.BRIDGRelativeTS plannedTiming;
    private gov.nih.nci.cabig.ccts.domain.bridg.PlannedActivity plannedActivity;

    public PlannedSoACell() {
    }

    public PlannedSoACell(
           gov.nih.nci.cabig.ccts.domain.bridg.PlannedActivity plannedActivity,
           gov.nih.nci.cabig.ccts.domain.cdt.BRIDGRelativeTS plannedTiming) {
           this.plannedTiming = plannedTiming;
           this.plannedActivity = plannedActivity;
    }


    /**
     * Gets the plannedTiming value for this PlannedSoACell.
     * 
     * @return plannedTiming The point in, or interval of, time to which one or more activities
 * may be associated. 
 * 
 * For example, 28 days after enrollment on the study.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.BRIDGRelativeTS getPlannedTiming() {
        return plannedTiming;
    }


    /**
     * Sets the plannedTiming value for this PlannedSoACell.
     * 
     * @param plannedTiming The point in, or interval of, time to which one or more activities
 * may be associated. 
 * 
 * For example, 28 days after enrollment on the study.
     */
    public void setPlannedTiming(gov.nih.nci.cabig.ccts.domain.cdt.BRIDGRelativeTS plannedTiming) {
        this.plannedTiming = plannedTiming;
    }


    /**
     * Gets the plannedActivity value for this PlannedSoACell.
     * 
     * @return plannedActivity
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PlannedActivity getPlannedActivity() {
        return plannedActivity;
    }


    /**
     * Sets the plannedActivity value for this PlannedSoACell.
     * 
     * @param plannedActivity
     */
    public void setPlannedActivity(gov.nih.nci.cabig.ccts.domain.bridg.PlannedActivity plannedActivity) {
        this.plannedActivity = plannedActivity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlannedSoACell)) return false;
        PlannedSoACell other = (PlannedSoACell) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.plannedTiming==null && other.getPlannedTiming()==null) || 
             (this.plannedTiming!=null &&
              this.plannedTiming.equals(other.getPlannedTiming()))) &&
            ((this.plannedActivity==null && other.getPlannedActivity()==null) || 
             (this.plannedActivity!=null &&
              this.plannedActivity.equals(other.getPlannedActivity())));
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
        if (getPlannedTiming() != null) {
            _hashCode += getPlannedTiming().hashCode();
        }
        if (getPlannedActivity() != null) {
            _hashCode += getPlannedActivity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlannedSoACell.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedSoACell"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedTiming");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "plannedTiming"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "BRIDGRelativeTS"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedActivity");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedActivity"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedActivity"));
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
