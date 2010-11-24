/**
 * AdverseEventData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * An observation of a change in the state of a subject that is assessed
 * as being untoward by one or more interested parties within the context
 * of protocol-driven research or public health.
 * 
 * For example, a severe headache could be assessed to as AdverseEventData.
 * 
 * Specifically: 
 * An observation is an act of recognizing and noting a fact or an occurrence
 * of an event of interest. An observation may involve examination, interviews,
 * or measurement with devices.  Observations are not intended to alter
 * the state of the subject. 
 * 
 * An assessment is a process by which an interested party (or parties)
 * arrives at a judgment as to whether an observation is relevant based
 * on asserting a temporal, spatial, or causal relationship between the
 * observation and some other factor.
 *  
 * An interested party is an individual or group with the authority and/or
 * expertise to assess the relevance of an observation (e.g., investigators,
 * health care providers, subjects). 
 * 
 * A context is defined by a set of principles, processes, constraints,
 * rules, and data organized to achieve one or more goals.
 */
public class AdverseEventData  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.AEIdentification AEIdentification;

    public AdverseEventData() {
    }

    public AdverseEventData(
           gov.nih.nci.cabig.ccts.domain.bridg.AEIdentification AEIdentification) {
           this.AEIdentification = AEIdentification;
    }


    /**
     * Gets the AEIdentification value for this AdverseEventData.
     * 
     * @return AEIdentification
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.AEIdentification getAEIdentification() {
        return AEIdentification;
    }


    /**
     * Sets the AEIdentification value for this AdverseEventData.
     * 
     * @param AEIdentification
     */
    public void setAEIdentification(gov.nih.nci.cabig.ccts.domain.bridg.AEIdentification AEIdentification) {
        this.AEIdentification = AEIdentification;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdverseEventData)) return false;
        AdverseEventData other = (AdverseEventData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.AEIdentification==null && other.getAEIdentification()==null) || 
             (this.AEIdentification!=null &&
              this.AEIdentification.equals(other.getAEIdentification())));
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
        if (getAEIdentification() != null) {
            _hashCode += getAEIdentification().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdverseEventData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "AdverseEventData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AEIdentification");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "AEIdentification"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "AEIdentification"));
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
