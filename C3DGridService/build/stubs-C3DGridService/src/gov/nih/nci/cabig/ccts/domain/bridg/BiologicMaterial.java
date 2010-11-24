/**
 * BiologicMaterial.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A material or collection of materials produced by a biologic process.
 * 
 * For example, a biopsy or tissue specimen would be considered a biologic
 * material.
 */
public class BiologicMaterial  extends gov.nih.nci.cabig.ccts.domain.bridg.Material  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.Specimen specimen;

    public BiologicMaterial() {
    }

    public BiologicMaterial(
           gov.nih.nci.cabig.ccts.domain.bridg.Specimen specimen) {
           this.specimen = specimen;
    }


    /**
     * Gets the specimen value for this BiologicMaterial.
     * 
     * @return specimen
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.Specimen getSpecimen() {
        return specimen;
    }


    /**
     * Sets the specimen value for this BiologicMaterial.
     * 
     * @param specimen
     */
    public void setSpecimen(gov.nih.nci.cabig.ccts.domain.bridg.Specimen specimen) {
        this.specimen = specimen;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiologicMaterial)) return false;
        BiologicMaterial other = (BiologicMaterial) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.specimen==null && other.getSpecimen()==null) || 
             (this.specimen!=null &&
              this.specimen.equals(other.getSpecimen())));
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
        if (getSpecimen() != null) {
            _hashCode += getSpecimen().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiologicMaterial.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "BiologicMaterial"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specimen");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Specimen"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Specimen"));
        elemField.setMinOccurs(0);
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
