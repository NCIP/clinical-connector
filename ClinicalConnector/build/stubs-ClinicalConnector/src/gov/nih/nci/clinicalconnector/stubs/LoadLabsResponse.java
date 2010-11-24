/**
 * LoadLabsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.clinicalconnector.stubs;

public class LoadLabsResponse  implements java.io.Serializable {
    private clinicalconnector.nci.nih.gov.LoadLabsResponse loadLabsResponse;

    public LoadLabsResponse() {
    }

    public LoadLabsResponse(
           clinicalconnector.nci.nih.gov.LoadLabsResponse loadLabsResponse) {
           this.loadLabsResponse = loadLabsResponse;
    }


    /**
     * Gets the loadLabsResponse value for this LoadLabsResponse.
     * 
     * @return loadLabsResponse
     */
    public clinicalconnector.nci.nih.gov.LoadLabsResponse getLoadLabsResponse() {
        return loadLabsResponse;
    }


    /**
     * Sets the loadLabsResponse value for this LoadLabsResponse.
     * 
     * @param loadLabsResponse
     */
    public void setLoadLabsResponse(clinicalconnector.nci.nih.gov.LoadLabsResponse loadLabsResponse) {
        this.loadLabsResponse = loadLabsResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoadLabsResponse)) return false;
        LoadLabsResponse other = (LoadLabsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.loadLabsResponse==null && other.getLoadLabsResponse()==null) || 
             (this.loadLabsResponse!=null &&
              this.loadLabsResponse.equals(other.getLoadLabsResponse())));
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
        if (getLoadLabsResponse() != null) {
            _hashCode += getLoadLabsResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoadLabsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gov.nci.nih.clinicalconnector/ClinicalConnector", ">LoadLabsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadLabsResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://clinicalconnector.nci.nih.gov", "LoadLabsResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://clinicalconnector.nci.nih.gov", ">LoadLabsResponse"));
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
