/**
 * EnrollPatientResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.enrollpatient;

public class EnrollPatientResponse  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol studyProtocol;

    public EnrollPatientResponse() {
    }

    public EnrollPatientResponse(
           gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol studyProtocol) {
           this.studyProtocol = studyProtocol;
    }


    /**
     * Gets the studyProtocol value for this EnrollPatientResponse.
     * 
     * @return studyProtocol
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol getStudyProtocol() {
        return studyProtocol;
    }


    /**
     * Sets the studyProtocol value for this EnrollPatientResponse.
     * 
     * @param studyProtocol
     */
    public void setStudyProtocol(gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol studyProtocol) {
        this.studyProtocol = studyProtocol;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnrollPatientResponse)) return false;
        EnrollPatientResponse other = (EnrollPatientResponse) obj;
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
              this.studyProtocol.equals(other.getStudyProtocol())));
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
            _hashCode += getStudyProtocol().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnrollPatientResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.enrollPatient", "EnrollPatientResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studyProtocol");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.enrollPatient", "studyProtocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudyProtocol"));
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
