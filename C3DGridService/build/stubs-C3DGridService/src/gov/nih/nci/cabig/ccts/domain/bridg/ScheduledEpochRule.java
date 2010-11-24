/**
 * ScheduledEpochRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * Rule that governs the transition between two Epochs.
 * 
 * For example, If subject experiences a serious Adverse Event (AE) while
 * in the First Treatment Epoch, move to Follow-up Epoch.
 * 
 * For example, if there were entry and exit criteria that applied to
 * all Arms of a study.
 */
public class ScheduledEpochRule  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.ScheduledEpoch scheduledEpoch;
    private gov.nih.nci.cabig.ccts.domain.bridg.ScheduledEpoch scheduledEpoch2;

    public ScheduledEpochRule() {
    }

    public ScheduledEpochRule(
           gov.nih.nci.cabig.ccts.domain.bridg.ScheduledEpoch scheduledEpoch,
           gov.nih.nci.cabig.ccts.domain.bridg.ScheduledEpoch scheduledEpoch2) {
           this.scheduledEpoch = scheduledEpoch;
           this.scheduledEpoch2 = scheduledEpoch2;
    }


    /**
     * Gets the scheduledEpoch value for this ScheduledEpochRule.
     * 
     * @return scheduledEpoch
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.ScheduledEpoch getScheduledEpoch() {
        return scheduledEpoch;
    }


    /**
     * Sets the scheduledEpoch value for this ScheduledEpochRule.
     * 
     * @param scheduledEpoch
     */
    public void setScheduledEpoch(gov.nih.nci.cabig.ccts.domain.bridg.ScheduledEpoch scheduledEpoch) {
        this.scheduledEpoch = scheduledEpoch;
    }


    /**
     * Gets the scheduledEpoch2 value for this ScheduledEpochRule.
     * 
     * @return scheduledEpoch2
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.ScheduledEpoch getScheduledEpoch2() {
        return scheduledEpoch2;
    }


    /**
     * Sets the scheduledEpoch2 value for this ScheduledEpochRule.
     * 
     * @param scheduledEpoch2
     */
    public void setScheduledEpoch2(gov.nih.nci.cabig.ccts.domain.bridg.ScheduledEpoch scheduledEpoch2) {
        this.scheduledEpoch2 = scheduledEpoch2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduledEpochRule)) return false;
        ScheduledEpochRule other = (ScheduledEpochRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.scheduledEpoch==null && other.getScheduledEpoch()==null) || 
             (this.scheduledEpoch!=null &&
              this.scheduledEpoch.equals(other.getScheduledEpoch()))) &&
            ((this.scheduledEpoch2==null && other.getScheduledEpoch2()==null) || 
             (this.scheduledEpoch2!=null &&
              this.scheduledEpoch2.equals(other.getScheduledEpoch2())));
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
        if (getScheduledEpoch() != null) {
            _hashCode += getScheduledEpoch().hashCode();
        }
        if (getScheduledEpoch2() != null) {
            _hashCode += getScheduledEpoch2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScheduledEpochRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledEpochRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledEpoch");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledEpoch"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledEpoch"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledEpoch");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledEpoch"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledEpoch"));
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
