/**
 * LoadLabsRequestLoadLabsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.clinicalconnector.stubs;

public class LoadLabsRequestLoadLabsRequest  implements java.io.Serializable {
    private clinicalconnector.nci.nih.gov.LoadLabsRequest loadLabsRequest;

    public LoadLabsRequestLoadLabsRequest() {
    }

    public LoadLabsRequestLoadLabsRequest(
           clinicalconnector.nci.nih.gov.LoadLabsRequest loadLabsRequest) {
           this.loadLabsRequest = loadLabsRequest;
    }


    /**
     * Gets the loadLabsRequest value for this LoadLabsRequestLoadLabsRequest.
     * 
     * @return loadLabsRequest
     */
    public clinicalconnector.nci.nih.gov.LoadLabsRequest getLoadLabsRequest() {
        return loadLabsRequest;
    }


    /**
     * Sets the loadLabsRequest value for this LoadLabsRequestLoadLabsRequest.
     * 
     * @param loadLabsRequest
     */
    public void setLoadLabsRequest(clinicalconnector.nci.nih.gov.LoadLabsRequest loadLabsRequest) {
        this.loadLabsRequest = loadLabsRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoadLabsRequestLoadLabsRequest)) return false;
        LoadLabsRequestLoadLabsRequest other = (LoadLabsRequestLoadLabsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.loadLabsRequest==null && other.getLoadLabsRequest()==null) || 
             (this.loadLabsRequest!=null &&
              this.loadLabsRequest.equals(other.getLoadLabsRequest())));
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
        if (getLoadLabsRequest() != null) {
            _hashCode += getLoadLabsRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoadLabsRequestLoadLabsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gov.nci.nih.clinicalconnector/ClinicalConnector", ">>LoadLabsRequest>loadLabsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadLabsRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://clinicalconnector.nci.nih.gov", "LoadLabsRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://clinicalconnector.nci.nih.gov", ">LoadLabsRequest"));
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
