/**
 * IVL_INTPositive.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package _21090.org.iso;

public class IVL_INTPositive  extends _21090.org.iso.QSET_INTPositive  implements java.io.Serializable {
    private _21090.org.iso.INTPositive low;
    private _21090.org.iso.INTPositive high;
    private _21090.org.iso.QTY width;
    private java.lang.Boolean lowClosed;  // attribute
    private java.lang.Boolean highClosed;  // attribute

    public IVL_INTPositive() {
    }

    public IVL_INTPositive(
           _21090.org.iso.INTPositive high,
           java.lang.Boolean highClosed,
           _21090.org.iso.INTPositive low,
           java.lang.Boolean lowClosed,
           _21090.org.iso.QTY width) {
           this.low = low;
           this.high = high;
           this.width = width;
           this.lowClosed = lowClosed;
           this.highClosed = highClosed;
    }


    /**
     * Gets the low value for this IVL_INTPositive.
     * 
     * @return low
     */
    public _21090.org.iso.INTPositive getLow() {
        return low;
    }


    /**
     * Sets the low value for this IVL_INTPositive.
     * 
     * @param low
     */
    public void setLow(_21090.org.iso.INTPositive low) {
        this.low = low;
    }


    /**
     * Gets the high value for this IVL_INTPositive.
     * 
     * @return high
     */
    public _21090.org.iso.INTPositive getHigh() {
        return high;
    }


    /**
     * Sets the high value for this IVL_INTPositive.
     * 
     * @param high
     */
    public void setHigh(_21090.org.iso.INTPositive high) {
        this.high = high;
    }


    /**
     * Gets the width value for this IVL_INTPositive.
     * 
     * @return width
     */
    public _21090.org.iso.QTY getWidth() {
        return width;
    }


    /**
     * Sets the width value for this IVL_INTPositive.
     * 
     * @param width
     */
    public void setWidth(_21090.org.iso.QTY width) {
        this.width = width;
    }


    /**
     * Gets the lowClosed value for this IVL_INTPositive.
     * 
     * @return lowClosed
     */
    public java.lang.Boolean getLowClosed() {
        return lowClosed;
    }


    /**
     * Sets the lowClosed value for this IVL_INTPositive.
     * 
     * @param lowClosed
     */
    public void setLowClosed(java.lang.Boolean lowClosed) {
        this.lowClosed = lowClosed;
    }


    /**
     * Gets the highClosed value for this IVL_INTPositive.
     * 
     * @return highClosed
     */
    public java.lang.Boolean getHighClosed() {
        return highClosed;
    }


    /**
     * Sets the highClosed value for this IVL_INTPositive.
     * 
     * @param highClosed
     */
    public void setHighClosed(java.lang.Boolean highClosed) {
        this.highClosed = highClosed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IVL_INTPositive)) return false;
        IVL_INTPositive other = (IVL_INTPositive) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.low==null && other.getLow()==null) || 
             (this.low!=null &&
              this.low.equals(other.getLow()))) &&
            ((this.high==null && other.getHigh()==null) || 
             (this.high!=null &&
              this.high.equals(other.getHigh()))) &&
            ((this.width==null && other.getWidth()==null) || 
             (this.width!=null &&
              this.width.equals(other.getWidth()))) &&
            ((this.lowClosed==null && other.getLowClosed()==null) || 
             (this.lowClosed!=null &&
              this.lowClosed.equals(other.getLowClosed()))) &&
            ((this.highClosed==null && other.getHighClosed()==null) || 
             (this.highClosed!=null &&
              this.highClosed.equals(other.getHighClosed())));
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
        if (getLow() != null) {
            _hashCode += getLow().hashCode();
        }
        if (getHigh() != null) {
            _hashCode += getHigh().hashCode();
        }
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        if (getLowClosed() != null) {
            _hashCode += getLowClosed().hashCode();
        }
        if (getHighClosed() != null) {
            _hashCode += getHighClosed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IVL_INTPositive.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "IVL_INT.Positive"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("lowClosed");
        attrField.setXmlName(new javax.xml.namespace.QName("", "lowClosed"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("highClosed");
        attrField.setXmlName(new javax.xml.namespace.QName("", "highClosed"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("low");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iso.org:21090", "low"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "INT.Positive"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("high");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iso.org:21090", "high"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "INT.Positive"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iso.org:21090", "width"));
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
