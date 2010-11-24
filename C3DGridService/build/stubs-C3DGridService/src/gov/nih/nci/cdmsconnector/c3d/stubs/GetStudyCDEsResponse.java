/**
 * GetStudyCDEsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cdmsconnector.c3d.stubs;

public class GetStudyCDEsResponse  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCDEsResponse getStudyCDEsResponse;

    public GetStudyCDEsResponse() {
    }

    public GetStudyCDEsResponse(
           gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCDEsResponse getStudyCDEsResponse) {
           this.getStudyCDEsResponse = getStudyCDEsResponse;
    }


    /**
     * Gets the getStudyCDEsResponse value for this GetStudyCDEsResponse.
     * 
     * @return getStudyCDEsResponse
     */
    public gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCDEsResponse getGetStudyCDEsResponse() {
        return getStudyCDEsResponse;
    }


    /**
     * Sets the getStudyCDEsResponse value for this GetStudyCDEsResponse.
     * 
     * @param getStudyCDEsResponse
     */
    public void setGetStudyCDEsResponse(gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCDEsResponse getStudyCDEsResponse) {
        this.getStudyCDEsResponse = getStudyCDEsResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetStudyCDEsResponse)) return false;
        GetStudyCDEsResponse other = (GetStudyCDEsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getStudyCDEsResponse==null && other.getGetStudyCDEsResponse()==null) || 
             (this.getStudyCDEsResponse!=null &&
              this.getStudyCDEsResponse.equals(other.getGetStudyCDEsResponse())));
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
        if (getGetStudyCDEsResponse() != null) {
            _hashCode += getGetStudyCDEsResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetStudyCDEsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://c3d.cdmsconnector.nci.nih.gov/C3DGridService", ">GetStudyCDEsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getStudyCDEsResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.studyData", "GetStudyCDEsResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.studyData", "GetStudyCDEsResponse"));
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
