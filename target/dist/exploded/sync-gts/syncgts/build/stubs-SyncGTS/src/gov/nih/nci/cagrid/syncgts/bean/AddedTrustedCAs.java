/**
 * AddedTrustedCAs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cagrid.syncgts.bean;

public class AddedTrustedCAs  implements java.io.Serializable {
    private gov.nih.nci.cagrid.syncgts.bean.TrustedCA[] trustedCA;

    public AddedTrustedCAs() {
    }

    public AddedTrustedCAs(
           gov.nih.nci.cagrid.syncgts.bean.TrustedCA[] trustedCA) {
           this.trustedCA = trustedCA;
    }


    /**
     * Gets the trustedCA value for this AddedTrustedCAs.
     * 
     * @return trustedCA
     */
    public gov.nih.nci.cagrid.syncgts.bean.TrustedCA[] getTrustedCA() {
        return trustedCA;
    }


    /**
     * Sets the trustedCA value for this AddedTrustedCAs.
     * 
     * @param trustedCA
     */
    public void setTrustedCA(gov.nih.nci.cagrid.syncgts.bean.TrustedCA[] trustedCA) {
        this.trustedCA = trustedCA;
    }

    public gov.nih.nci.cagrid.syncgts.bean.TrustedCA getTrustedCA(int i) {
        return this.trustedCA[i];
    }

    public void setTrustedCA(int i, gov.nih.nci.cagrid.syncgts.bean.TrustedCA _value) {
        this.trustedCA[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddedTrustedCAs)) return false;
        AddedTrustedCAs other = (AddedTrustedCAs) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.trustedCA==null && other.getTrustedCA()==null) || 
             (this.trustedCA!=null &&
              java.util.Arrays.equals(this.trustedCA, other.getTrustedCA())));
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
        if (getTrustedCA() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrustedCA());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrustedCA(), i);
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
        new org.apache.axis.description.TypeDesc(AddedTrustedCAs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "AddedTrustedCAs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trustedCA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "TrustedCA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "TrustedCA"));
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
