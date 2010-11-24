/**
 * PerformedStudySoA.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A set of information that describes what activities were performed,
 * when, and for which subjects.  Much of this information can be visualized
 * as a table whose rows are Performed Activities, and whose columns
 * are Performed Subject Study Contacts.  The cells in such a table are
 * instances of PerformedSoACells.  
 * 
 * Three critical features of a PerformedStudySoA include:
 * 1. It is associated with a particular study.
 * 2. It represents absolute dates.    
 * 3. It is associated with study subjects.
 */
public class PerformedStudySoA  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.PerformedArmSoA[] performedArmSoA;

    public PerformedStudySoA() {
    }

    public PerformedStudySoA(
           gov.nih.nci.cabig.ccts.domain.bridg.PerformedArmSoA[] performedArmSoA) {
           this.performedArmSoA = performedArmSoA;
    }


    /**
     * Gets the performedArmSoA value for this PerformedStudySoA.
     * 
     * @return performedArmSoA
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedArmSoA[] getPerformedArmSoA() {
        return performedArmSoA;
    }


    /**
     * Sets the performedArmSoA value for this PerformedStudySoA.
     * 
     * @param performedArmSoA
     */
    public void setPerformedArmSoA(gov.nih.nci.cabig.ccts.domain.bridg.PerformedArmSoA[] performedArmSoA) {
        this.performedArmSoA = performedArmSoA;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedArmSoA getPerformedArmSoA(int i) {
        return this.performedArmSoA[i];
    }

    public void setPerformedArmSoA(int i, gov.nih.nci.cabig.ccts.domain.bridg.PerformedArmSoA _value) {
        this.performedArmSoA[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformedStudySoA)) return false;
        PerformedStudySoA other = (PerformedStudySoA) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.performedArmSoA==null && other.getPerformedArmSoA()==null) || 
             (this.performedArmSoA!=null &&
              java.util.Arrays.equals(this.performedArmSoA, other.getPerformedArmSoA())));
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
        if (getPerformedArmSoA() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPerformedArmSoA());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPerformedArmSoA(), i);
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
        new org.apache.axis.description.TypeDesc(PerformedStudySoA.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedStudySoA"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performedArmSoA");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedArmSoA"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedArmSoA"));
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
