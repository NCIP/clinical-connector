/**
 * NPPD_SC.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package _21090.org.iso;

public class NPPD_SC  extends _21090.org.iso.ANY  implements java.io.Serializable {
    private _21090.org.iso.UVP_SC[] item;

    public NPPD_SC() {
    }

    public NPPD_SC(
           _21090.org.iso.UVP_SC[] item) {
           this.item = item;
    }


    /**
     * Gets the item value for this NPPD_SC.
     * 
     * @return item
     */
    public _21090.org.iso.UVP_SC[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this NPPD_SC.
     * 
     * @param item
     */
    public void setItem(_21090.org.iso.UVP_SC[] item) {
        this.item = item;
    }

    public _21090.org.iso.UVP_SC getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, _21090.org.iso.UVP_SC _value) {
        this.item[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NPPD_SC)) return false;
        NPPD_SC other = (NPPD_SC) obj;
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
        new org.apache.axis.description.TypeDesc(NPPD_SC.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "NPPD_SC"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iso.org:21090", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "UVP_SC"));
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
