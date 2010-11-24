/**
 * Permission.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cagrid.gts.bean;

public class Permission  implements java.io.Serializable {
    private java.lang.String gridIdentity;
    private gov.nih.nci.cagrid.gts.bean.Role role;
    private java.lang.String trustedAuthorityName;

    public Permission() {
    }

    public Permission(
           java.lang.String gridIdentity,
           gov.nih.nci.cagrid.gts.bean.Role role,
           java.lang.String trustedAuthorityName) {
           this.gridIdentity = gridIdentity;
           this.role = role;
           this.trustedAuthorityName = trustedAuthorityName;
    }


    /**
     * Gets the gridIdentity value for this Permission.
     * 
     * @return gridIdentity
     */
    public java.lang.String getGridIdentity() {
        return gridIdentity;
    }


    /**
     * Sets the gridIdentity value for this Permission.
     * 
     * @param gridIdentity
     */
    public void setGridIdentity(java.lang.String gridIdentity) {
        this.gridIdentity = gridIdentity;
    }


    /**
     * Gets the role value for this Permission.
     * 
     * @return role
     */
    public gov.nih.nci.cagrid.gts.bean.Role getRole() {
        return role;
    }


    /**
     * Sets the role value for this Permission.
     * 
     * @param role
     */
    public void setRole(gov.nih.nci.cagrid.gts.bean.Role role) {
        this.role = role;
    }


    /**
     * Gets the trustedAuthorityName value for this Permission.
     * 
     * @return trustedAuthorityName
     */
    public java.lang.String getTrustedAuthorityName() {
        return trustedAuthorityName;
    }


    /**
     * Sets the trustedAuthorityName value for this Permission.
     * 
     * @param trustedAuthorityName
     */
    public void setTrustedAuthorityName(java.lang.String trustedAuthorityName) {
        this.trustedAuthorityName = trustedAuthorityName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Permission)) return false;
        Permission other = (Permission) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gridIdentity==null && other.getGridIdentity()==null) || 
             (this.gridIdentity!=null &&
              this.gridIdentity.equals(other.getGridIdentity()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole()))) &&
            ((this.trustedAuthorityName==null && other.getTrustedAuthorityName()==null) || 
             (this.trustedAuthorityName!=null &&
              this.trustedAuthorityName.equals(other.getTrustedAuthorityName())));
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
        if (getGridIdentity() != null) {
            _hashCode += getGridIdentity().hashCode();
        }
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        if (getTrustedAuthorityName() != null) {
            _hashCode += getTrustedAuthorityName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Permission.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "Permission"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gridIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "GridIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "Role"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "Role"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trustedAuthorityName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "TrustedAuthorityName"));
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
