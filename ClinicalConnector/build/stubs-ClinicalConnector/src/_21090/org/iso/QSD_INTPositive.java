/**
 * QSD_INTPositive.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package _21090.org.iso;

public class QSD_INTPositive  extends _21090.org.iso.QSET_INTPositive  implements java.io.Serializable {
    private _21090.org.iso.QSET_INTPositive first;
    private _21090.org.iso.QSET_INTPositive second;

    public QSD_INTPositive() {
    }

    public QSD_INTPositive(
           _21090.org.iso.QSET_INTPositive first,
           _21090.org.iso.QSET_INTPositive second) {
           this.first = first;
           this.second = second;
    }


    /**
     * Gets the first value for this QSD_INTPositive.
     * 
     * @return first
     */
    public _21090.org.iso.QSET_INTPositive getFirst() {
        return first;
    }


    /**
     * Sets the first value for this QSD_INTPositive.
     * 
     * @param first
     */
    public void setFirst(_21090.org.iso.QSET_INTPositive first) {
        this.first = first;
    }


    /**
     * Gets the second value for this QSD_INTPositive.
     * 
     * @return second
     */
    public _21090.org.iso.QSET_INTPositive getSecond() {
        return second;
    }


    /**
     * Sets the second value for this QSD_INTPositive.
     * 
     * @param second
     */
    public void setSecond(_21090.org.iso.QSET_INTPositive second) {
        this.second = second;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QSD_INTPositive)) return false;
        QSD_INTPositive other = (QSD_INTPositive) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.first==null && other.getFirst()==null) || 
             (this.first!=null &&
              this.first.equals(other.getFirst()))) &&
            ((this.second==null && other.getSecond()==null) || 
             (this.second!=null &&
              this.second.equals(other.getSecond())));
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
        if (getFirst() != null) {
            _hashCode += getFirst().hashCode();
        }
        if (getSecond() != null) {
            _hashCode += getSecond().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QSD_INTPositive.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "QSD_INT.Positive"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("first");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iso.org:21090", "first"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "QSET_INT.Positive"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("second");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iso.org:21090", "second"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "QSET_INT.Positive"));
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
