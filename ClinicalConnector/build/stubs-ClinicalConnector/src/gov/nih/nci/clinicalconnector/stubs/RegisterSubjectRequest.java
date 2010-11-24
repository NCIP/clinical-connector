/**
 * RegisterSubjectRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.clinicalconnector.stubs;

public class RegisterSubjectRequest  implements java.io.Serializable {
    private gov.nih.nci.clinicalconnector.stubs.RegisterSubjectRequestRegisterSubjectRequest registerSubjectRequest;

    public RegisterSubjectRequest() {
    }

    public RegisterSubjectRequest(
           gov.nih.nci.clinicalconnector.stubs.RegisterSubjectRequestRegisterSubjectRequest registerSubjectRequest) {
           this.registerSubjectRequest = registerSubjectRequest;
    }


    /**
     * Gets the registerSubjectRequest value for this RegisterSubjectRequest.
     * 
     * @return registerSubjectRequest
     */
    public gov.nih.nci.clinicalconnector.stubs.RegisterSubjectRequestRegisterSubjectRequest getRegisterSubjectRequest() {
        return registerSubjectRequest;
    }


    /**
     * Sets the registerSubjectRequest value for this RegisterSubjectRequest.
     * 
     * @param registerSubjectRequest
     */
    public void setRegisterSubjectRequest(gov.nih.nci.clinicalconnector.stubs.RegisterSubjectRequestRegisterSubjectRequest registerSubjectRequest) {
        this.registerSubjectRequest = registerSubjectRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegisterSubjectRequest)) return false;
        RegisterSubjectRequest other = (RegisterSubjectRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registerSubjectRequest==null && other.getRegisterSubjectRequest()==null) || 
             (this.registerSubjectRequest!=null &&
              this.registerSubjectRequest.equals(other.getRegisterSubjectRequest())));
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
        if (getRegisterSubjectRequest() != null) {
            _hashCode += getRegisterSubjectRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegisterSubjectRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gov.nci.nih.clinicalconnector/ClinicalConnector", ">RegisterSubjectRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerSubjectRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gov.nci.nih.clinicalconnector/ClinicalConnector", "registerSubjectRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gov.nci.nih.clinicalconnector/ClinicalConnector", ">>RegisterSubjectRequest>registerSubjectRequest"));
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
