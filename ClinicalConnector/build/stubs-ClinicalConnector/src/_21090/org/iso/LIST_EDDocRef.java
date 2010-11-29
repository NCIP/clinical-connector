/**
 * LIST_EDDocRef.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package _21090.org.iso;

public class LIST_EDDocRef  extends _21090.org.iso.ANY  implements java.io.Serializable {
    private _21090.org.iso.EDDocRef[] item;

    public LIST_EDDocRef() {
    }

    public LIST_EDDocRef(
           _21090.org.iso.EDDocRef[] item) {
           this.item = item;
    }


    /**
     * Gets the item value for this LIST_EDDocRef.
     * 
     * @return item
     */
    public _21090.org.iso.EDDocRef[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this LIST_EDDocRef.
     * 
     * @param item
     */
    public void setItem(_21090.org.iso.EDDocRef[] item) {
        this.item = item;
    }

    public _21090.org.iso.EDDocRef getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, _21090.org.iso.EDDocRef _value) {
        this.item[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LIST_EDDocRef)) return false;
        LIST_EDDocRef other = (LIST_EDDocRef) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem())));
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
        if (getItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItem(), i);
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
        new org.apache.axis.description.TypeDesc(LIST_EDDocRef.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "LIST_ED.Doc.Ref"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iso.org:21090", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "ED.Doc.Ref"));
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