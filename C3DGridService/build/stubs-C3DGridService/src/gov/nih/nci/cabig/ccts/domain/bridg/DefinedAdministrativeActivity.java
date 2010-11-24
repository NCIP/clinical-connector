/**
 * DefinedAdministrativeActivity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * The activity within the context of a given study that is not directly
 * related to the study’s overarching hypothesis evaluation or testing,
 * but is nonetheless essential to the efficient and/or effective coordination
 * and execution of the study.  It  frequently occurs in studies and
 * therefore is called out as a reusable template and may be used in
 * a study.
 * 
 * For example, assignment to a treatment arm, registration to a study,
 * start of on-study period, end of on-study period, obtain informed
 * consent, verify eligibility criteria, enroll, randomize, complete
 * study visits, exit trial, break treatment blind, protocol violation,
 * premature withdrawal, etc.
 */
public class DefinedAdministrativeActivity  extends gov.nih.nci.cabig.ccts.domain.bridg.DefinedActivity  implements java.io.Serializable {

    public DefinedAdministrativeActivity() {
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DefinedAdministrativeActivity)) return false;
        DefinedAdministrativeActivity other = (DefinedAdministrativeActivity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DefinedAdministrativeActivity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DefinedAdministrativeActivity"));
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
