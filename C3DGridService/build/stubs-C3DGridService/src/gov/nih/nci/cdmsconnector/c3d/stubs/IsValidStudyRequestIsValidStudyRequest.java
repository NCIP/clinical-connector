/**
 * IsValidStudyRequestIsValidStudyRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cdmsconnector.c3d.stubs;

public class IsValidStudyRequestIsValidStudyRequest  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.studydata.IsValidStudyRequest isValidStudyRequest;

    public IsValidStudyRequestIsValidStudyRequest() {
    }

    public IsValidStudyRequestIsValidStudyRequest(
           gov.nih.nci.cabig.ccts.domain.studydata.IsValidStudyRequest isValidStudyRequest) {
           this.isValidStudyRequest = isValidStudyRequest;
    }


    /**
     * Gets the isValidStudyRequest value for this IsValidStudyRequestIsValidStudyRequest.
     * 
     * @return isValidStudyRequest
     */
    public gov.nih.nci.cabig.ccts.domain.studydata.IsValidStudyRequest getIsValidStudyRequest() {
        return isValidStudyRequest;
    }


    /**
     * Sets the isValidStudyRequest value for this IsValidStudyRequestIsValidStudyRequest.
     * 
     * @param isValidStudyRequest
     */
    public void setIsValidStudyRequest(gov.nih.nci.cabig.ccts.domain.studydata.IsValidStudyRequest isValidStudyRequest) {
        this.isValidStudyRequest = isValidStudyRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsValidStudyRequestIsValidStudyRequest)) return false;
        IsValidStudyRequestIsValidStudyRequest other = (IsValidStudyRequestIsValidStudyRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isValidStudyRequest==null && other.getIsValidStudyRequest()==null) || 
             (this.isValidStudyRequest!=null &&
              this.isValidStudyRequest.equals(other.getIsValidStudyRequest())));
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
        if (getIsValidStudyRequest() != null) {
            _hashCode += getIsValidStudyRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IsValidStudyRequestIsValidStudyRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://c3d.cdmsconnector.nci.nih.gov/C3DGridService", ">>IsValidStudyRequest>isValidStudyRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isValidStudyRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.studyData", "IsValidStudyRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.studyData", "IsValidStudyRequest"));
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
