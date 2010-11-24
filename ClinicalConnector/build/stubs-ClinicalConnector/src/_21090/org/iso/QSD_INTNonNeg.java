/**
 * QSD_INTNonNeg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package _21090.org.iso;

public class QSD_INTNonNeg  extends _21090.org.iso.QSET_INTNonNeg  implements java.io.Serializable {
    private _21090.org.iso.QSET_INTNonNeg first;
    private _21090.org.iso.QSET_INTNonNeg second;

    public QSD_INTNonNeg() {
    }

    public QSD_INTNonNeg(
           _21090.org.iso.QSET_INTNonNeg first,
           _21090.org.iso.QSET_INTNonNeg second) {
           this.first = first;
           this.second = second;
    }


    /**
     * Gets the first value for this QSD_INTNonNeg.
     * 
     * @return first
     */
    public _21090.org.iso.QSET_INTNonNeg getFirst() {
        return first;
    }


    /**
     * Sets the first value for this QSD_INTNonNeg.
     * 
     * @param first
     */
    public void setFirst(_21090.org.iso.QSET_INTNonNeg first) {
        this.first = first;
    }


    /**
     * Gets the second value for this QSD_INTNonNeg.
     * 
     * @return second
     */
    public _21090.org.iso.QSET_INTNonNeg getSecond() {
        return second;
    }


    /**
     * Sets the second value for this QSD_INTNonNeg.
     * 
     * @param second
     */
    public void setSecond(_21090.org.iso.QSET_INTNonNeg second) {
        this.second = second;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QSD_INTNonNeg)) return false;
        QSD_INTNonNeg other = (QSD_INTNonNeg) obj;
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
        new org.apache.axis.description.TypeDesc(QSD_INTNonNeg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "QSD_INT.NonNeg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("first");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iso.org:21090", "first"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "QSET_INT.NonNeg"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("second");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iso.org:21090", "second"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "QSET_INT.NonNeg"));
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
