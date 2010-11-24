/**
 * SLIST_TSDateFull.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package _21090.org.iso;

public class SLIST_TSDateFull  extends _21090.org.iso.ANY  implements java.io.Serializable {
    private _21090.org.iso.TSDateFull origin;
    private _21090.org.iso.QTY scale;
    private _21090.org.iso.INT[] digit;

    public SLIST_TSDateFull() {
    }

    public SLIST_TSDateFull(
           _21090.org.iso.INT[] digit,
           _21090.org.iso.TSDateFull origin,
           _21090.org.iso.QTY scale) {
           this.origin = origin;
           this.scale = scale;
           this.digit = digit;
    }


    /**
     * Gets the origin value for this SLIST_TSDateFull.
     * 
     * @return origin
     */
    public _21090.org.iso.TSDateFull getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this SLIST_TSDateFull.
     * 
     * @param origin
     */
    public void setOrigin(_21090.org.iso.TSDateFull origin) {
        this.origin = origin;
    }


    /**
     * Gets the scale value for this SLIST_TSDateFull.
     * 
     * @return scale
     */
    public _21090.org.iso.QTY getScale() {
        return scale;
    }


    /**
     * Sets the scale value for this SLIST_TSDateFull.
     * 
     * @param scale
     */
    public void setScale(_21090.org.iso.QTY scale) {
        this.scale = scale;
    }


    /**
     * Gets the digit value for this SLIST_TSDateFull.
     * 
     * @return digit
     */
    public _21090.org.iso.INT[] getDigit() {
        return digit;
    }


    /**
     * Sets the digit value for this SLIST_TSDateFull.
     * 
     * @param digit
     */
    public void setDigit(_21090.org.iso.INT[] digit) {
        this.digit = digit;
    }

    public _21090.org.iso.INT getDigit(int i) {
        return this.digit[i];
    }

    public void setDigit(int i, _21090.org.iso.INT _value) {
        this.digit[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SLIST_TSDateFull)) return false;
        SLIST_TSDateFull other = (SLIST_TSDateFull) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.scale==null && other.getScale()==null) || 
             (this.scale!=null &&
              this.scale.equals(other.getScale()))) &&
            ((this.digit==null && other.getDigit()==null) || 
             (this.digit!=null &&
              java.util.Arrays.equals(this.digit, other.getDigit())));
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
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getScale() != null) {
            _hashCode += getScale().hashCode();
        }
        if (getDigit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDigit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDigit(), i);
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
        new org.apache.axis.description.TypeDesc(SLIST_TSDateFull.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "SLIST_TS.Date.Full"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iso.org:21090", "origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "TS.Date.Full"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scale");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iso.org:21090", "scale"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "QTY"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digit");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iso.org:21090", "digit"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "INT"));
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
