/**
 * ScheduledStudySoA.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A set of information that describes what activities are scheduled,
 * when, and for which subjects.  Much of this information can be visualized
 * as a table whose rows are ScheduledActivities, and whose columns are
 * ScheduledSubjectStudyEncounter.  The cells in such a table are instances
 * of Scheduled Schedule of Activities (SOA) Cells.  
 * 
 * Three critical features of a ScheduledStudySoA include:
 * 1. It is associated with a particular study.
 * 2. It represents absolute dates.    
 * 3. It is associated with study subjects.
 */
public class ScheduledStudySoA  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.ScheduledArmSoA[] scheduledArmSoA;

    public ScheduledStudySoA() {
    }

    public ScheduledStudySoA(
           gov.nih.nci.cabig.ccts.domain.bridg.ScheduledArmSoA[] scheduledArmSoA) {
           this.scheduledArmSoA = scheduledArmSoA;
    }


    /**
     * Gets the scheduledArmSoA value for this ScheduledStudySoA.
     * 
     * @return scheduledArmSoA
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.ScheduledArmSoA[] getScheduledArmSoA() {
        return scheduledArmSoA;
    }


    /**
     * Sets the scheduledArmSoA value for this ScheduledStudySoA.
     * 
     * @param scheduledArmSoA
     */
    public void setScheduledArmSoA(gov.nih.nci.cabig.ccts.domain.bridg.ScheduledArmSoA[] scheduledArmSoA) {
        this.scheduledArmSoA = scheduledArmSoA;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.ScheduledArmSoA getScheduledArmSoA(int i) {
        return this.scheduledArmSoA[i];
    }

    public void setScheduledArmSoA(int i, gov.nih.nci.cabig.ccts.domain.bridg.ScheduledArmSoA _value) {
        this.scheduledArmSoA[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduledStudySoA)) return false;
        ScheduledStudySoA other = (ScheduledStudySoA) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.scheduledArmSoA==null && other.getScheduledArmSoA()==null) || 
             (this.scheduledArmSoA!=null &&
              java.util.Arrays.equals(this.scheduledArmSoA, other.getScheduledArmSoA())));
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
        if (getScheduledArmSoA() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScheduledArmSoA());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScheduledArmSoA(), i);
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
        new org.apache.axis.description.TypeDesc(ScheduledStudySoA.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledStudySoA"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledArmSoA");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledArmSoA"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledArmSoA"));
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
