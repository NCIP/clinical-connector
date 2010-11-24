/**
 * GLIST_TS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package _21090.org.iso;

public class GLIST_TS  extends _21090.org.iso.ANY  implements java.io.Serializable {
    private _21090.org.iso.TS head;
    private _21090.org.iso.QTY increment;
    private java.lang.Integer denominator;  // attribute
    private java.lang.Integer period;  // attribute

    public GLIST_TS() {
    }

    public GLIST_TS(
           java.lang.Integer denominator,
           _21090.org.iso.TS head,
           _21090.org.iso.QTY increment,
           java.lang.Integer period) {
           this.head = head;
           this.increment = increment;
           this.denominator = denominator;
           this.period = period;
    }


    /**
     * Gets the head value for this GLIST_TS.
     * 
     * @return head
     */
    public _21090.org.iso.TS getHead() {
        return head;
    }


    /**
     * Sets the head value for this GLIST_TS.
     * 
     * @param head
     */
    public void setHead(_21090.org.iso.TS head) {
        this.head = head;
    }


    /**
     * Gets the increment value for this GLIST_TS.
     * 
     * @return increment
     */
    public _21090.org.iso.QTY getIncrement() {
        return increment;
    }


    /**
     * Sets the increment value for this GLIST_TS.
     * 
     * @param increment
     */
    public void setIncrement(_21090.org.iso.QTY increment) {
        this.increment = increment;
    }


    /**
     * Gets the denominator value for this GLIST_TS.
     * 
     * @return denominator
     */
    public java.lang.Integer getDenominator() {
        return denominator;
    }


    /**
     * Sets the denominator value for this GLIST_TS.
     * 
     * @param denominator
     */
    public void setDenominator(java.lang.Integer denominator) {
        this.denominator = denominator;
    }


    /**
     * Gets the period value for this GLIST_TS.
     * 
     * @return period
     */
    public java.lang.Integer getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this GLIST_TS.
     * 
     * @param period
     */
    public void setPeriod(java.lang.Integer period) {
        this.period = period;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GLIST_TS)) return false;
        GLIST_TS other = (GLIST_TS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.head==null && other.getHead()==null) || 
             (this.head!=null &&
              this.head.equals(other.getHead()))) &&
            ((this.increment==null && other.getIncrement()==null) || 
             (this.increment!=null &&
              this.increment.equals(other.getIncrement()))) &&
            ((this.denominator==null && other.getDenominator()==null) || 
             (this.denominator!=null &&
              this.denominator.equals(other.getDenominator()))) &&
            ((this.period==null && other.getPeriod()==null) || 
             (this.period!=null &&
              this.period.equals(other.getPeriod())));
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
        if (getHead() != null) {
            _hashCode += getHead().hashCode();
        }
        if (getIncrement() != null) {
            _hashCode += getIncrement().hashCode();
        }
        if (getDenominator() != null) {
            _hashCode += getDenominator().hashCode();
        }
        if (getPeriod() != null) {
            _hashCode += getPeriod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GLIST_TS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "GLIST_TS"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("denominator");
        attrField.setXmlName(new javax.xml.namespace.QName("", "denominator"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("period");
        attrField.setXmlName(new javax.xml.namespace.QName("", "period"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("head");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iso.org:21090", "head"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "TS"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("increment");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iso.org:21090", "increment"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "QTY"));
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
