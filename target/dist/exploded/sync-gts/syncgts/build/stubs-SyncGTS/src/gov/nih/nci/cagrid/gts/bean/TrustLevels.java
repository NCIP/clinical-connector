/**
 * TrustLevels.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cagrid.gts.bean;

public class TrustLevels  implements java.io.Serializable {
    private java.lang.String[] trustLevel;

    public TrustLevels() {
    }

    public TrustLevels(
           java.lang.String[] trustLevel) {
           this.trustLevel = trustLevel;
    }


    /**
     * Gets the trustLevel value for this TrustLevels.
     * 
     * @return trustLevel
     */
    public java.lang.String[] getTrustLevel() {
        return trustLevel;
    }


    /**
     * Sets the trustLevel value for this TrustLevels.
     * 
     * @param trustLevel
     */
    public void setTrustLevel(java.lang.String[] trustLevel) {
        this.trustLevel = trustLevel;
    }

    public java.lang.String getTrustLevel(int i) {
        return this.trustLevel[i];
    }

    public void setTrustLevel(int i, java.lang.String _value) {
        this.trustLevel[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrustLevels)) return false;
        TrustLevels other = (TrustLevels) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.trustLevel==null && other.getTrustLevel()==null) || 
             (this.trustLevel!=null &&
              java.util.Arrays.equals(this.trustLevel, other.getTrustLevel())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTrustLevel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrustLevel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrustLevel(), i);
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
        new org.apache.axis.description.TypeDesc(TrustLevels.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "TrustLevels"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trustLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "TrustLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
