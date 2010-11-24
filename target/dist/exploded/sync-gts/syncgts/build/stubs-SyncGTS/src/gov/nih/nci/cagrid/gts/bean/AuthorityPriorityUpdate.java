/**
 * AuthorityPriorityUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cagrid.gts.bean;

public class AuthorityPriorityUpdate  implements java.io.Serializable {
    private gov.nih.nci.cagrid.gts.bean.AuthorityPrioritySpecification[] authorityPrioritySpecification;

    public AuthorityPriorityUpdate() {
    }

    public AuthorityPriorityUpdate(
           gov.nih.nci.cagrid.gts.bean.AuthorityPrioritySpecification[] authorityPrioritySpecification) {
           this.authorityPrioritySpecification = authorityPrioritySpecification;
    }


    /**
     * Gets the authorityPrioritySpecification value for this AuthorityPriorityUpdate.
     * 
     * @return authorityPrioritySpecification
     */
    public gov.nih.nci.cagrid.gts.bean.AuthorityPrioritySpecification[] getAuthorityPrioritySpecification() {
        return authorityPrioritySpecification;
    }


    /**
     * Sets the authorityPrioritySpecification value for this AuthorityPriorityUpdate.
     * 
     * @param authorityPrioritySpecification
     */
    public void setAuthorityPrioritySpecification(gov.nih.nci.cagrid.gts.bean.AuthorityPrioritySpecification[] authorityPrioritySpecification) {
        this.authorityPrioritySpecification = authorityPrioritySpecification;
    }

    public gov.nih.nci.cagrid.gts.bean.AuthorityPrioritySpecification getAuthorityPrioritySpecification(int i) {
        return this.authorityPrioritySpecification[i];
    }

    public void setAuthorityPrioritySpecification(int i, gov.nih.nci.cagrid.gts.bean.AuthorityPrioritySpecification _value) {
        this.authorityPrioritySpecification[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthorityPriorityUpdate)) return false;
        AuthorityPriorityUpdate other = (AuthorityPriorityUpdate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authorityPrioritySpecification==null && other.getAuthorityPrioritySpecification()==null) || 
             (this.authorityPrioritySpecification!=null &&
              java.util.Arrays.equals(this.authorityPrioritySpecification, other.getAuthorityPrioritySpecification())));
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
        if (getAuthorityPrioritySpecification() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthorityPrioritySpecification());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthorityPrioritySpecification(), i);
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
        new org.apache.axis.description.TypeDesc(AuthorityPriorityUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "AuthorityPriorityUpdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorityPrioritySpecification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "AuthorityPrioritySpecification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "AuthorityPrioritySpecification"));
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
