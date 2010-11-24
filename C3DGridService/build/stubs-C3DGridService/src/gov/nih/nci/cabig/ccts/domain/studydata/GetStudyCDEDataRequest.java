/**
 * GetStudyCDEDataRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.studydata;

public class GetStudyCDEDataRequest  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.CommonDataElement commonDataElement;
    private java.lang.String studyName;

    public GetStudyCDEDataRequest() {
    }

    public GetStudyCDEDataRequest(
           gov.nih.nci.cabig.ccts.domain.bridg.CommonDataElement commonDataElement,
           java.lang.String studyName) {
           this.commonDataElement = commonDataElement;
           this.studyName = studyName;
    }


    /**
     * Gets the commonDataElement value for this GetStudyCDEDataRequest.
     * 
     * @return commonDataElement
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.CommonDataElement getCommonDataElement() {
        return commonDataElement;
    }


    /**
     * Sets the commonDataElement value for this GetStudyCDEDataRequest.
     * 
     * @param commonDataElement
     */
    public void setCommonDataElement(gov.nih.nci.cabig.ccts.domain.bridg.CommonDataElement commonDataElement) {
        this.commonDataElement = commonDataElement;
    }


    /**
     * Gets the studyName value for this GetStudyCDEDataRequest.
     * 
     * @return studyName
     */
    public java.lang.String getStudyName() {
        return studyName;
    }


    /**
     * Sets the studyName value for this GetStudyCDEDataRequest.
     * 
     * @param studyName
     */
    public void setStudyName(java.lang.String studyName) {
        this.studyName = studyName;
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
            ((this.commonDataElement==null && other.getCommonDataElement()==null) || 
             (this.commonDataElement!=null &&
              this.commonDataElement.equals(other.getCommonDataElement()))) &&
            ((this.studyName==null && other.getStudyName()==null) || 
             (this.studyName!=null &&
              this.studyName.equals(other.getStudyName())));
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
        if (getCommonDataElement() != null) {
            _hashCode += getCommonDataElement().hashCode();
        }
        if (getStudyName() != null) {
            _hashCode += getStudyName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetStudyCDEDataRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.studyData", "GetStudyCDEDataRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commonDataElement");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.studyData", "commonDataElement"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "CommonDataElement"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studyName");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.studyData", "studyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
