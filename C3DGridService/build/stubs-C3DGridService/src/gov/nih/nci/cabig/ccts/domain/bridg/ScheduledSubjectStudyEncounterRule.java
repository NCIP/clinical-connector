/**
 * ScheduledSubjectStudyEncounterRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * Defines how to transition between ScheduledSubjectStudyContacts.
 * 
 * For example, If the result of activity A at Visit 2 is observation
 * X, then the subject should return to the clinic three days after Visit
 * 2 for a repeat of activity A.
 * 
 * For example, Visit 4 should take place 5-9 days after Visit 3.
 */
public class ScheduledSubjectStudyEncounterRule  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.ScheduledSubjectStudyEncounter scheduledSubjectStudyEncounter;

    public ScheduledSubjectStudyEncounterRule() {
    }

    public ScheduledSubjectStudyEncounterRule(
           gov.nih.nci.cabig.ccts.domain.bridg.ScheduledSubjectStudyEncounter scheduledSubjectStudyEncounter) {
           this.scheduledSubjectStudyEncounter = scheduledSubjectStudyEncounter;
    }


    /**
     * Gets the scheduledSubjectStudyEncounter value for this ScheduledSubjectStudyEncounterRule.
     * 
     * @return scheduledSubjectStudyEncounter
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.ScheduledSubjectStudyEncounter getScheduledSubjectStudyEncounter() {
        return scheduledSubjectStudyEncounter;
    }


    /**
     * Sets the scheduledSubjectStudyEncounter value for this ScheduledSubjectStudyEncounterRule.
     * 
     * @param scheduledSubjectStudyEncounter
     */
    public void setScheduledSubjectStudyEncounter(gov.nih.nci.cabig.ccts.domain.bridg.ScheduledSubjectStudyEncounter scheduledSubjectStudyEncounter) {
        this.scheduledSubjectStudyEncounter = scheduledSubjectStudyEncounter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduledSubjectStudyEncounterRule)) return false;
        ScheduledSubjectStudyEncounterRule other = (ScheduledSubjectStudyEncounterRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.scheduledSubjectStudyEncounter==null && other.getScheduledSubjectStudyEncounter()==null) || 
             (this.scheduledSubjectStudyEncounter!=null &&
              this.scheduledSubjectStudyEncounter.equals(other.getScheduledSubjectStudyEncounter())));
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
        if (getScheduledSubjectStudyEncounter() != null) {
            _hashCode += getScheduledSubjectStudyEncounter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScheduledSubjectStudyEncounterRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledSubjectStudyEncounterRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledSubjectStudyEncounter");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledSubjectStudyEncounter"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledSubjectStudyEncounter"));
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
