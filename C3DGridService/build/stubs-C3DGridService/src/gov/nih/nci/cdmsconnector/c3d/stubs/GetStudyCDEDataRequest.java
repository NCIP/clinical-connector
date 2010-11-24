/**
 * GetStudyCDEDataRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cdmsconnector.c3d.stubs;

public class GetStudyCDEDataRequest  implements java.io.Serializable {
    private gov.nih.nci.cdmsconnector.c3d.stubs.GetStudyCDEDataRequestGetStudyCDEDataRequest getStudyCDEDataRequest;

    public GetStudyCDEDataRequest() {
    }

    public GetStudyCDEDataRequest(
           gov.nih.nci.cdmsconnector.c3d.stubs.GetStudyCDEDataRequestGetStudyCDEDataRequest getStudyCDEDataRequest) {
           this.getStudyCDEDataRequest = getStudyCDEDataRequest;
    }


    /**
     * Gets the getStudyCDEDataRequest value for this GetStudyCDEDataRequest.
     * 
     * @return getStudyCDEDataRequest
     */
    public gov.nih.nci.cdmsconnector.c3d.stubs.GetStudyCDEDataRequestGetStudyCDEDataRequest getGetStudyCDEDataRequest() {
        return getStudyCDEDataRequest;
    }


    /**
     * Sets the getStudyCDEDataRequest value for this GetStudyCDEDataRequest.
     * 
     * @param getStudyCDEDataRequest
     */
    public void setGetStudyCDEDataRequest(gov.nih.nci.cdmsconnector.c3d.stubs.GetStudyCDEDataRequestGetStudyCDEDataRequest getStudyCDEDataRequest) {
        this.getStudyCDEDataRequest = getStudyCDEDataRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetStudyCDEDataRequest)) return false;
        GetStudyCDEDataRequest other = (GetStudyCDEDataRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getStudyCDEDataRequest==null && other.getGetStudyCDEDataRequest()==null) || 
             (this.getStudyCDEDataRequest!=null &&
              this.getStudyCDEDataRequest.equals(other.getGetStudyCDEDataRequest())));
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
        if (getGetStudyCDEDataRequest() != null) {
            _hashCode += getGetStudyCDEDataRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetStudyCDEDataRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://c3d.cdmsconnector.nci.nih.gov/C3DGridService", ">GetStudyCDEDataRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getStudyCDEDataRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://c3d.cdmsconnector.nci.nih.gov/C3DGridService", "getStudyCDEDataRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://c3d.cdmsconnector.nci.nih.gov/C3DGridService", ">>GetStudyCDEDataRequest>getStudyCDEDataRequest"));
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
