/**
 * PerformedSubjectStudyEncounterRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * Defines how to transition between PerformedSubjectStudyEncounters.
 * 
 * For example, If the result of activity A at Visit 2 is observation
 * X, then the subject should return to the clinic three days after Visit
 * 2 for a repeat of activity A.
 * 
 * For example,  Visit 4 should take place 5-9 days after Visit 3.
 */
public class PerformedSubjectStudyEncounterRule  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.PerformedSubjectStudyEncounter performedSubjectStudyEncounter;
    private gov.nih.nci.cabig.ccts.domain.bridg.PerformedSubjectStudyEncounter performedSubjectStudyEncounter2;

    public PerformedSubjectStudyEncounterRule() {
    }

    public PerformedSubjectStudyEncounterRule(
           gov.nih.nci.cabig.ccts.domain.bridg.PerformedSubjectStudyEncounter performedSubjectStudyEncounter,
           gov.nih.nci.cabig.ccts.domain.bridg.PerformedSubjectStudyEncounter performedSubjectStudyEncounter2) {
           this.performedSubjectStudyEncounter = performedSubjectStudyEncounter;
           this.performedSubjectStudyEncounter2 = performedSubjectStudyEncounter2;
    }


    /**
     * Gets the performedSubjectStudyEncounter value for this PerformedSubjectStudyEncounterRule.
     * 
     * @return performedSubjectStudyEncounter
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedSubjectStudyEncounter getPerformedSubjectStudyEncounter() {
        return performedSubjectStudyEncounter;
    }


    /**
     * Sets the performedSubjectStudyEncounter value for this PerformedSubjectStudyEncounterRule.
     * 
     * @param performedSubjectStudyEncounter
     */
    public void setPerformedSubjectStudyEncounter(gov.nih.nci.cabig.ccts.domain.bridg.PerformedSubjectStudyEncounter performedSubjectStudyEncounter) {
        this.performedSubjectStudyEncounter = performedSubjectStudyEncounter;
    }


    /**
     * Gets the performedSubjectStudyEncounter2 value for this PerformedSubjectStudyEncounterRule.
     * 
     * @return performedSubjectStudyEncounter2
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedSubjectStudyEncounter getPerformedSubjectStudyEncounter2() {
        return performedSubjectStudyEncounter2;
    }


    /**
     * Sets the performedSubjectStudyEncounter2 value for this PerformedSubjectStudyEncounterRule.
     * 
     * @param performedSubjectStudyEncounter2
     */
    public void setPerformedSubjectStudyEncounter2(gov.nih.nci.cabig.ccts.domain.bridg.PerformedSubjectStudyEncounter performedSubjectStudyEncounter2) {
        this.performedSubjectStudyEncounter2 = performedSubjectStudyEncounter2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformedSubjectStudyEncounterRule)) return false;
        PerformedSubjectStudyEncounterRule other = (PerformedSubjectStudyEncounterRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.performedSubjectStudyEncounter==null && other.getPerformedSubjectStudyEncounter()==null) || 
             (this.performedSubjectStudyEncounter!=null &&
              this.performedSubjectStudyEncounter.equals(other.getPerformedSubjectStudyEncounter()))) &&
            ((this.performedSubjectStudyEncounter2==null && other.getPerformedSubjectStudyEncounter2()==null) || 
             (this.performedSubjectStudyEncounter2!=null &&
              this.performedSubjectStudyEncounter2.equals(other.getPerformedSubjectStudyEncounter2())));
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
        if (getPerformedSubjectStudyEncounter() != null) {
            _hashCode += getPerformedSubjectStudyEncounter().hashCode();
        }
        if (getPerformedSubjectStudyEncounter2() != null) {
            _hashCode += getPerformedSubjectStudyEncounter2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PerformedSubjectStudyEncounterRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedSubjectStudyEncounterRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performedSubjectStudyEncounter");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedSubjectStudyEncounter"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedSubjectStudyEncounter"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performedSubjectStudyEncounter");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedSubjectStudyEncounter"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedSubjectStudyEncounter"));
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
