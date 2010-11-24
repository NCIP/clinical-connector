/**
 * NonTherapeuticAgent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A chemical or biological substance with specific characteristics
 * administered for other reasons than therapeutic intent.
 */
public class NonTherapeuticAgent  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.PerformedSubstanceAdministration[] performedSubstanceAdministration;

    public NonTherapeuticAgent() {
    }

    public NonTherapeuticAgent(
           gov.nih.nci.cabig.ccts.domain.bridg.PerformedSubstanceAdministration[] performedSubstanceAdministration) {
           this.performedSubstanceAdministration = performedSubstanceAdministration;
    }


    /**
     * Gets the performedSubstanceAdministration value for this NonTherapeuticAgent.
     * 
     * @return performedSubstanceAdministration
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedSubstanceAdministration[] getPerformedSubstanceAdministration() {
        return performedSubstanceAdministration;
    }


    /**
     * Sets the performedSubstanceAdministration value for this NonTherapeuticAgent.
     * 
     * @param performedSubstanceAdministration
     */
    public void setPerformedSubstanceAdministration(gov.nih.nci.cabig.ccts.domain.bridg.PerformedSubstanceAdministration[] performedSubstanceAdministration) {
        this.performedSubstanceAdministration = performedSubstanceAdministration;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedSubstanceAdministration getPerformedSubstanceAdministration(int i) {
        return this.performedSubstanceAdministration[i];
    }

    public void setPerformedSubstanceAdministration(int i, gov.nih.nci.cabig.ccts.domain.bridg.PerformedSubstanceAdministration _value) {
        this.performedSubstanceAdministration[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NonTherapeuticAgent)) return false;
        NonTherapeuticAgent other = (NonTherapeuticAgent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.performedSubstanceAdministration==null && other.getPerformedSubstanceAdministration()==null) || 
             (this.performedSubstanceAdministration!=null &&
              java.util.Arrays.equals(this.performedSubstanceAdministration, other.getPerformedSubstanceAdministration())));
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
        if (getPerformedSubstanceAdministration() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPerformedSubstanceAdministration());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPerformedSubstanceAdministration(), i);
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
        new org.apache.axis.description.TypeDesc(NonTherapeuticAgent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "NonTherapeuticAgent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performedSubstanceAdministration");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedSubstanceAdministration"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedSubstanceAdministration"));
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
