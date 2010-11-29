/**
 * QSU_PQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package _21090.org.iso;

public class QSU_PQ  extends _21090.org.iso.QSET_PQ  implements java.io.Serializable {
    private _21090.org.iso.QSET_PQ[] term;

    public QSU_PQ() {
    }

    public QSU_PQ(
           _21090.org.iso.QSET_PQ[] term) {
           this.term = term;
    }


    /**
     * Gets the term value for this QSU_PQ.
     * 
     * @return term
     */
    public _21090.org.iso.QSET_PQ[] getTerm() {
        return term;
    }


    /**
     * Sets the term value for this QSU_PQ.
     * 
     * @param term
     */
    public void setTerm(_21090.org.iso.QSET_PQ[] term) {
        this.term = term;
    }

    public _21090.org.iso.QSET_PQ getTerm(int i) {
        return this.term[i];
    }

    public void setTerm(int i, _21090.org.iso.QSET_PQ _value) {
        this.term[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QSU_PQ)) return false;
        QSU_PQ other = (QSU_PQ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.term==null && other.getTerm()==null) || 
             (this.term!=null &&
              java.util.Arrays.equals(this.term, other.getTerm())));
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
        if (getTerm() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTerm());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTerm(), i);
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
        new org.apache.axis.description.TypeDesc(QSU_PQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "QSU_PQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("term");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iso.org:21090", "term"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "QSET_PQ"));
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