/**
 * ReviewableUnit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A way to organize a submission into discrete units. The reviewable
 * unit is used to receive agreement on one unit. Once agreement is reached
 * on all units within the submission the submission can then be approved.
 * 
 * For example, in a Modular pre-marketing application (PMA) several
 * modules will be sent to the Food and Drug Administration (FDA). Each
 * module will be agreed upon independently of other modules. The FDA
 * then approves the submission based on compilation of all of the modules.
 * These modules are reviewable units.
 * 
 * For example, a veterinary medicine New Animal Drug Application (NADA)
 * is constructed from the Investigational New Animal Drug Application
 * (INADA). In the INADA process the sponsor creates reviewable units.
 * These reviewable units are then compiled to be used as documentation
 * for the marketing application.
 */
public class ReviewableUnit  extends gov.nih.nci.cabig.ccts.domain.bridg.Submission  implements java.io.Serializable {

    public ReviewableUnit() {
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReviewableUnit)) return false;
        ReviewableUnit other = (ReviewableUnit) obj;
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
        new org.apache.axis.description.TypeDesc(ReviewableUnit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ReviewableUnit"));
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
