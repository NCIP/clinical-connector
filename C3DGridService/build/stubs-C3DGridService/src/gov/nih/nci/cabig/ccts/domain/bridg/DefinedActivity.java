/**
 * DefinedActivity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * An activity that  frequently occurs in studies (e.g. more than
 * one time in more than one arm) and therefore is called out as a reusable
 * template and may be used in the composition of a defined study segment.
 * A defined activity is a "kind of" activity rather than an "instance
 * of" an activity.  (A defined activity is represented here as a subtype
 * of Activity, but could also be thought of as an activity at a particular
 * stage in the business process in which the activities occur, i.e.,
 * in the "defined" stage rather than the "planned" stage, the "scheduled"
 * stage or the "performed" stage.)
 * 
 * An instance of a defined activity is not assigned to a particular
 * study subject, but may be assigned to a "kind of" study subject.
 * 
 * For example, standard blood chemistries are frequently included in
 * studies, also activities that are study-specific and recur more than
 * one time in more than one arm may be defined, such as a SubstanceAdministration
 * activity involving X amount of drug Y.
 */
public class DefinedActivity  extends gov.nih.nci.cabig.ccts.domain.bridg.Activity  implements java.io.Serializable {

    public DefinedActivity() {
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DefinedActivity)) return false;
        DefinedActivity other = (DefinedActivity) obj;
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
        new org.apache.axis.description.TypeDesc(DefinedActivity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DefinedActivity"));
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
