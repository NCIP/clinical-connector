/**
 * QSET_INTPositive.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package _21090.org.iso;

public abstract class QSET_INTPositive  extends _21090.org.iso.ANY  implements java.io.Serializable {
    private _21090.org.iso.EDText originalText;

    public QSET_INTPositive() {
    }

    public QSET_INTPositive(
           _21090.org.iso.EDText originalText) {
           this.originalText = originalText;
    }


    /**
     * Gets the originalText value for this QSET_INTPositive.
     * 
     * @return originalText
     */
    public _21090.org.iso.EDText getOriginalText() {
        return originalText;
    }


    /**
     * Sets the originalText value for this QSET_INTPositive.
     * 
     * @param originalText
     */
    public void setOriginalText(_21090.org.iso.EDText originalText) {
        this.originalText = originalText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QSET_INTPositive)) return false;
        QSET_INTPositive other = (QSET_INTPositive) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.originalText==null && other.getOriginalText()==null) || 
             (this.originalText!=null &&
              this.originalText.equals(other.getOriginalText())));
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
        if (getOriginalText() != null) {
            _hashCode += getOriginalText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QSET_INTPositive.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "QSET_INT.Positive"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalText");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iso.org:21090", "originalText"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "ED.Text"));
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
