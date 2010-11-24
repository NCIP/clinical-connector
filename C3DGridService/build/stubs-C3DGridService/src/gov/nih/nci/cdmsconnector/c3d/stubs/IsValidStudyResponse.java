/**
 * IsValidStudyResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cdmsconnector.c3d.stubs;

public class IsValidStudyResponse  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.studydata.IsValidStudyResponse isValidStudyResponse;

    public IsValidStudyResponse() {
    }

    public IsValidStudyResponse(
           gov.nih.nci.cabig.ccts.domain.studydata.IsValidStudyResponse isValidStudyResponse) {
           this.isValidStudyResponse = isValidStudyResponse;
    }


    /**
     * Gets the isValidStudyResponse value for this IsValidStudyResponse.
     * 
     * @return isValidStudyResponse
     */
    public gov.nih.nci.cabig.ccts.domain.studydata.IsValidStudyResponse getIsValidStudyResponse() {
        return isValidStudyResponse;
    }


    /**
     * Sets the isValidStudyResponse value for this IsValidStudyResponse.
     * 
     * @param isValidStudyResponse
     */
    public void setIsValidStudyResponse(gov.nih.nci.cabig.ccts.domain.studydata.IsValidStudyResponse isValidStudyResponse) {
        this.isValidStudyResponse = isValidStudyResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsValidStudyResponse)) return false;
        IsValidStudyResponse other = (IsValidStudyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isValidStudyResponse==null && other.getIsValidStudyResponse()==null) || 
             (this.isValidStudyResponse!=null &&
              this.isValidStudyResponse.equals(other.getIsValidStudyResponse())));
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
        if (getIsValidStudyResponse() != null) {
            _hashCode += getIsValidStudyResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IsValidStudyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://c3d.cdmsconnector.nci.nih.gov/C3DGridService", ">IsValidStudyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isValidStudyResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.studyData", "IsValidStudyResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.studyData", "IsValidStudyResponse"));
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
