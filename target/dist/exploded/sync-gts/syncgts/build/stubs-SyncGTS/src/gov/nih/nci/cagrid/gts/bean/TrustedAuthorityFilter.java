/**
 * TrustedAuthorityFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cagrid.gts.bean;

public class TrustedAuthorityFilter  implements java.io.Serializable {
    private java.lang.String name;
    private java.lang.String certificateDN;
    private gov.nih.nci.cagrid.gts.bean.TrustLevels trustLevels;
    private gov.nih.nci.cagrid.gts.bean.Lifetime lifetime;
    private gov.nih.nci.cagrid.gts.bean.Status status;
    private java.lang.Boolean isAuthority;
    private java.lang.String authorityGTS;
    private java.lang.String sourceGTS;

    public TrustedAuthorityFilter() {
    }

    public TrustedAuthorityFilter(
           java.lang.String authorityGTS,
           java.lang.String certificateDN,
           java.lang.Boolean isAuthority,
           gov.nih.nci.cagrid.gts.bean.Lifetime lifetime,
           java.lang.String name,
           java.lang.String sourceGTS,
           gov.nih.nci.cagrid.gts.bean.Status status,
           gov.nih.nci.cagrid.gts.bean.TrustLevels trustLevels) {
           this.name = name;
           this.certificateDN = certificateDN;
           this.trustLevels = trustLevels;
           this.lifetime = lifetime;
           this.status = status;
           this.isAuthority = isAuthority;
           this.authorityGTS = authorityGTS;
           this.sourceGTS = sourceGTS;
    }


    /**
     * Gets the name value for this TrustedAuthorityFilter.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TrustedAuthorityFilter.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the certificateDN value for this TrustedAuthorityFilter.
     * 
     * @return certificateDN
     */
    public java.lang.String getCertificateDN() {
        return certificateDN;
    }


    /**
     * Sets the certificateDN value for this TrustedAuthorityFilter.
     * 
     * @param certificateDN
     */
    public void setCertificateDN(java.lang.String certificateDN) {
        this.certificateDN = certificateDN;
    }


    /**
     * Gets the trustLevels value for this TrustedAuthorityFilter.
     * 
     * @return trustLevels
     */
    public gov.nih.nci.cagrid.gts.bean.TrustLevels getTrustLevels() {
        return trustLevels;
    }


    /**
     * Sets the trustLevels value for this TrustedAuthorityFilter.
     * 
     * @param trustLevels
     */
    public void setTrustLevels(gov.nih.nci.cagrid.gts.bean.TrustLevels trustLevels) {
        this.trustLevels = trustLevels;
    }


    /**
     * Gets the lifetime value for this TrustedAuthorityFilter.
     * 
     * @return lifetime
     */
    public gov.nih.nci.cagrid.gts.bean.Lifetime getLifetime() {
        return lifetime;
    }


    /**
     * Sets the lifetime value for this TrustedAuthorityFilter.
     * 
     * @param lifetime
     */
    public void setLifetime(gov.nih.nci.cagrid.gts.bean.Lifetime lifetime) {
        this.lifetime = lifetime;
    }


    /**
     * Gets the status value for this TrustedAuthorityFilter.
     * 
     * @return status
     */
    public gov.nih.nci.cagrid.gts.bean.Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TrustedAuthorityFilter.
     * 
     * @param status
     */
    public void setStatus(gov.nih.nci.cagrid.gts.bean.Status status) {
        this.status = status;
    }


    /**
     * Gets the isAuthority value for this TrustedAuthorityFilter.
     * 
     * @return isAuthority
     */
    public java.lang.Boolean getIsAuthority() {
        return isAuthority;
    }


    /**
     * Sets the isAuthority value for this TrustedAuthorityFilter.
     * 
     * @param isAuthority
     */
    public void setIsAuthority(java.lang.Boolean isAuthority) {
        this.isAuthority = isAuthority;
    }


    /**
     * Gets the authorityGTS value for this TrustedAuthorityFilter.
     * 
     * @return authorityGTS
     */
    public java.lang.String getAuthorityGTS() {
        return authorityGTS;
    }


    /**
     * Sets the authorityGTS value for this TrustedAuthorityFilter.
     * 
     * @param authorityGTS
     */
    public void setAuthorityGTS(java.lang.String authorityGTS) {
        this.authorityGTS = authorityGTS;
    }


    /**
     * Gets the sourceGTS value for this TrustedAuthorityFilter.
     * 
     * @return sourceGTS
     */
    public java.lang.String getSourceGTS() {
        return sourceGTS;
    }


    /**
     * Sets the sourceGTS value for this TrustedAuthorityFilter.
     * 
     * @param sourceGTS
     */
    public void setSourceGTS(java.lang.String sourceGTS) {
        this.sourceGTS = sourceGTS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrustedAuthorityFilter)) return false;
        TrustedAuthorityFilter other = (TrustedAuthorityFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.certificateDN==null && other.getCertificateDN()==null) || 
             (this.certificateDN!=null &&
              this.certificateDN.equals(other.getCertificateDN()))) &&
            ((this.trustLevels==null && other.getTrustLevels()==null) || 
             (this.trustLevels!=null &&
              this.trustLevels.equals(other.getTrustLevels()))) &&
            ((this.lifetime==null && other.getLifetime()==null) || 
             (this.lifetime!=null &&
              this.lifetime.equals(other.getLifetime()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.isAuthority==null && other.getIsAuthority()==null) || 
             (this.isAuthority!=null &&
              this.isAuthority.equals(other.getIsAuthority()))) &&
            ((this.authorityGTS==null && other.getAuthorityGTS()==null) || 
             (this.authorityGTS!=null &&
              this.authorityGTS.equals(other.getAuthorityGTS()))) &&
            ((this.sourceGTS==null && other.getSourceGTS()==null) || 
             (this.sourceGTS!=null &&
              this.sourceGTS.equals(other.getSourceGTS())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getCertificateDN() != null) {
            _hashCode += getCertificateDN().hashCode();
        }
        if (getTrustLevels() != null) {
            _hashCode += getTrustLevels().hashCode();
        }
        if (getLifetime() != null) {
            _hashCode += getLifetime().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getIsAuthority() != null) {
            _hashCode += getIsAuthority().hashCode();
        }
        if (getAuthorityGTS() != null) {
            _hashCode += getAuthorityGTS().hashCode();
        }
        if (getSourceGTS() != null) {
            _hashCode += getSourceGTS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrustedAuthorityFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "TrustedAuthorityFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "CertificateDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trustLevels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "TrustLevels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "TrustLevels"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifetime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "Lifetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "Lifetime"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "Status"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAuthority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "IsAuthority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorityGTS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "AuthorityGTS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceGTS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "SourceGTS"));
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
