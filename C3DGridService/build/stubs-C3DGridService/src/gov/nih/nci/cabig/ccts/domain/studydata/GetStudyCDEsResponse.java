/**
 * GetStudyCDEsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.studydata;

public class GetStudyCDEsResponse  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol[] studyProtocol;

    public GetStudyCDEsResponse() {
    }

    public GetStudyCDEsResponse(
           gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol[] studyProtocol) {
           this.studyProtocol = studyProtocol;
    }


    /**
     * Gets the studyProtocol value for this GetStudyCDEsResponse.
     * 
     * @return studyProtocol
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol[] getStudyProtocol() {
        return studyProtocol;
    }


    /**
     * Sets the studyProtocol value for this GetStudyCDEsResponse.
     * 
     * @param studyProtocol
     */
    public void setStudyProtocol(gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol[] studyProtocol) {
        this.studyProtocol = studyProtocol;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol getStudyProtocol(int i) {
        return this.studyProtocol[i];
    }

    public void setStudyProtocol(int i, gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol _value) {
        this.studyProtocol[i] = _value;
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
            ((this.studyProtocol==null && other.getStudyProtocol()==null) || 
             (this.studyProtocol!=null &&
              java.util.Arrays.equals(this.studyProtocol, other.getStudyProtocol())));
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
        if (getStudyProtocol() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStudyProtocol());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStudyProtocol(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetStudyCDEsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.studyData", "GetStudyCDEsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studyProtocol");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.studyData", "studyProtocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudyProtocol"));
        elemField.setMinOccurs(0);
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
