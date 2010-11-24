/**
 * PQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.cdt;


/**
 * A dimensioned quantity expressing the result of measuring.
 * 
 * As a BRIDG Duration:  An integer quantification of an interval of
 * arbitrary length measured in arbitrary units.
 */
public class PQ  implements java.io.Serializable {
    /** The measurement scale of a given interval.
 * 
 * (For HL7:  The unit of measure specified in the Unified Code for Units
 * of Measure (UCUM).) */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD unit;
    /** The magnitude of the quantity measured in terms of the unit.
 * 
 * As a BRIDG Duration:  The integer quantity specifying the number of
 * units of measure in length of an interval. */
    private gov.nih.nci.cabig.ccts.domain.cdt.REAL value;

    public PQ() {
    }

    public PQ(
           gov.nih.nci.cabig.ccts.domain.cdt.CD unit,
           gov.nih.nci.cabig.ccts.domain.cdt.REAL value) {
           this.unit = unit;
           this.value = value;
    }


    /**
     * Gets the unit value for this PQ.
     * 
     * @return unit The measurement scale of a given interval.
 * 
 * (For HL7:  The unit of measure specified in the Unified Code for Units
 * of Measure (UCUM).)
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this PQ.
     * 
     * @param unit The measurement scale of a given interval.
 * 
 * (For HL7:  The unit of measure specified in the Unified Code for Units
 * of Measure (UCUM).)
     */
    public void setUnit(gov.nih.nci.cabig.ccts.domain.cdt.CD unit) {
        this.unit = unit;
    }


    /**
     * Gets the value value for this PQ.
     * 
     * @return value The magnitude of the quantity measured in terms of the unit.
 * 
 * As a BRIDG Duration:  The integer quantity specifying the number of
 * units of measure in length of an interval.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.REAL getValue() {
        return value;
    }


    /**
     * Sets the value value for this PQ.
     * 
     * @param value The magnitude of the quantity measured in terms of the unit.
 * 
 * As a BRIDG Duration:  The integer quantity specifying the number of
 * units of measure in length of an interval.
     */
    public void setValue(gov.nih.nci.cabig.ccts.domain.cdt.REAL value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PQ)) return false;
        PQ other = (PQ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "PQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "REAL"));
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
