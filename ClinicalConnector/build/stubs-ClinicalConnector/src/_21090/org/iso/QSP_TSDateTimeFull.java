/**
 * QSP_TSDateTimeFull.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package _21090.org.iso;

public class QSP_TSDateTimeFull  extends _21090.org.iso.QSET_TSDateTimeFull  implements java.io.Serializable {
    private _21090.org.iso.QSET_TSDateTimeFull first;
    private _21090.org.iso.QSET_TSDateTimeFull second;

    public QSP_TSDateTimeFull() {
    }

    public QSP_TSDateTimeFull(
           _21090.org.iso.QSET_TSDateTimeFull first,
           _21090.org.iso.QSET_TSDateTimeFull second) {
           this.first = first;
           this.second = second;
    }


    /**
     * Gets the first value for this QSP_TSDateTimeFull.
     * 
     * @return first
     */
    public _21090.org.iso.QSET_TSDateTimeFull getFirst() {
        return first;
    }


    /**
     * Sets the first value for this QSP_TSDateTimeFull.
     * 
     * @param first
     */
    public void setFirst(_21090.org.iso.QSET_TSDateTimeFull first) {
        this.first = first;
    }


    /**
     * Gets the second value for this QSP_TSDateTimeFull.
     * 
     * @return second
     */
    public _21090.org.iso.QSET_TSDateTimeFull getSecond() {
        return second;
    }


    /**
     * Sets the second value for this QSP_TSDateTimeFull.
     * 
     * @param second
     */
    public void setSecond(_21090.org.iso.QSET_TSDateTimeFull second) {
        this.second = second;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QSP_TSDateTimeFull)) return false;
        QSP_TSDateTimeFull other = (QSP_TSDateTimeFull) obj;
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
        new org.apache.axis.description.TypeDesc(QSP_TSDateTimeFull.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "QSP_TS.DateTime.Full"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("first");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iso.org:21090", "first"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "QSET_TS.DateTime.Full"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("second");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iso.org:21090", "second"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "QSET_TS.DateTime.Full"));
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
