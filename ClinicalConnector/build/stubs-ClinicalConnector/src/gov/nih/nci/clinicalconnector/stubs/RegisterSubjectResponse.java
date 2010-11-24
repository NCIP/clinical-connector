/**
 * RegisterSubjectResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.clinicalconnector.stubs;

public class RegisterSubjectResponse  implements java.io.Serializable {
    private clinicalconnector.nci.nih.gov.RegisterSubjectResponse registerSubjectResponse;

    public RegisterSubjectResponse() {
    }

    public RegisterSubjectResponse(
           clinicalconnector.nci.nih.gov.RegisterSubjectResponse registerSubjectResponse) {
           this.registerSubjectResponse = registerSubjectResponse;
    }


    /**
     * Gets the registerSubjectResponse value for this RegisterSubjectResponse.
     * 
     * @return registerSubjectResponse
     */
    public clinicalconnector.nci.nih.gov.RegisterSubjectResponse getRegisterSubjectResponse() {
        return registerSubjectResponse;
    }


    /**
     * Sets the registerSubjectResponse value for this RegisterSubjectResponse.
     * 
     * @param registerSubjectResponse
     */
    public void setRegisterSubjectResponse(clinicalconnector.nci.nih.gov.RegisterSubjectResponse registerSubjectResponse) {
        this.registerSubjectResponse = registerSubjectResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegisterSubjectResponse)) return false;
        RegisterSubjectResponse other = (RegisterSubjectResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registerSubjectResponse==null && other.getRegisterSubjectResponse()==null) || 
             (this.registerSubjectResponse!=null &&
              this.registerSubjectResponse.equals(other.getRegisterSubjectResponse())));
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
        if (getRegisterSubjectResponse() != null) {
            _hashCode += getRegisterSubjectResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegisterSubjectResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gov.nci.nih.clinicalconnector/ClinicalConnector", ">RegisterSubjectResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerSubjectResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://clinicalconnector.nci.nih.gov", "RegisterSubjectResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://clinicalconnector.nci.nih.gov", ">RegisterSubjectResponse"));
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
