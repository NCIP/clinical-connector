/**
 * TrustedAuthority.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cagrid.gts.bean;

public class TrustedAuthority  implements java.io.Serializable {
    private java.lang.String name;
    private gov.nih.nci.cagrid.gts.bean.TrustLevels trustLevels;
    private gov.nih.nci.cagrid.gts.bean.Status status;
    private java.lang.Boolean isAuthority;
    private java.lang.String authorityGTS;
    private java.lang.String sourceGTS;
    private long expires;
    private long lastUpdated;
    private gov.nih.nci.cagrid.gts.bean.X509Certificate certificate;
    private gov.nih.nci.cagrid.gts.bean.X509CRL CRL;

    public TrustedAuthority() {
    }

    public TrustedAuthority(
           gov.nih.nci.cagrid.gts.bean.X509CRL CRL,
           java.lang.String authorityGTS,
           gov.nih.nci.cagrid.gts.bean.X509Certificate certificate,
           long expires,
           java.lang.Boolean isAuthority,
           long lastUpdated,
           java.lang.String name,
           java.lang.String sourceGTS,
           gov.nih.nci.cagrid.gts.bean.Status status,
           gov.nih.nci.cagrid.gts.bean.TrustLevels trustLevels) {
           this.name = name;
           this.trustLevels = trustLevels;
           this.status = status;
           this.isAuthority = isAuthority;
           this.authorityGTS = authorityGTS;
           this.sourceGTS = sourceGTS;
           this.expires = expires;
           this.lastUpdated = lastUpdated;
           this.certificate = certificate;
           this.CRL = CRL;
    }


    /**
     * Gets the name value for this TrustedAuthority.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TrustedAuthority.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the trustLevels value for this TrustedAuthority.
     * 
     * @return trustLevels
     */
    public gov.nih.nci.cagrid.gts.bean.TrustLevels getTrustLevels() {
        return trustLevels;
    }


    /**
     * Sets the trustLevels value for this TrustedAuthority.
     * 
     * @param trustLevels
     */
    public void setTrustLevels(gov.nih.nci.cagrid.gts.bean.TrustLevels trustLevels) {
        this.trustLevels = trustLevels;
    }


    /**
     * Gets the status value for this TrustedAuthority.
     * 
     * @return status
     */
    public gov.nih.nci.cagrid.gts.bean.Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TrustedAuthority.
     * 
     * @param status
     */
    public void setStatus(gov.nih.nci.cagrid.gts.bean.Status status) {
        this.status = status;
    }


    /**
     * Gets the isAuthority value for this TrustedAuthority.
     * 
     * @return isAuthority
     */
    public java.lang.Boolean getIsAuthority() {
        return isAuthority;
    }


    /**
     * Sets the isAuthority value for this TrustedAuthority.
     * 
     * @param isAuthority
     */
    public void setIsAuthority(java.lang.Boolean isAuthority) {
        this.isAuthority = isAuthority;
    }


    /**
     * Gets the authorityGTS value for this TrustedAuthority.
     * 
     * @return authorityGTS
     */
    public java.lang.String getAuthorityGTS() {
        return authorityGTS;
    }


    /**
     * Sets the authorityGTS value for this TrustedAuthority.
     * 
     * @param authorityGTS
     */
    public void setAuthorityGTS(java.lang.String authorityGTS) {
        this.authorityGTS = authorityGTS;
    }


    /**
     * Gets the sourceGTS value for this TrustedAuthority.
     * 
     * @return sourceGTS
     */
    public java.lang.String getSourceGTS() {
        return sourceGTS;
    }


    /**
     * Sets the sourceGTS value for this TrustedAuthority.
     * 
     * @param sourceGTS
     */
    public void setSourceGTS(java.lang.String sourceGTS) {
        this.sourceGTS = sourceGTS;
    }


    /**
     * Gets the expires value for this TrustedAuthority.
     * 
     * @return expires
     */
    public long getExpires() {
        return expires;
    }


    /**
     * Sets the expires value for this TrustedAuthority.
     * 
     * @param expires
     */
    public void setExpires(long expires) {
        this.expires = expires;
    }


    /**
     * Gets the lastUpdated value for this TrustedAuthority.
     * 
     * @return lastUpdated
     */
    public long getLastUpdated() {
        return lastUpdated;
    }


    /**
     * Sets the lastUpdated value for this TrustedAuthority.
     * 
     * @param lastUpdated
     */
    public void setLastUpdated(long lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


    /**
     * Gets the certificate value for this TrustedAuthority.
     * 
     * @return certificate
     */
    public gov.nih.nci.cagrid.gts.bean.X509Certificate getCertificate() {
        return certificate;
    }


    /**
     * Sets the certificate value for this TrustedAuthority.
     * 
     * @param certificate
     */
    public void setCertificate(gov.nih.nci.cagrid.gts.bean.X509Certificate certificate) {
        this.certificate = certificate;
    }


    /**
     * Gets the CRL value for this TrustedAuthority.
     * 
     * @return CRL
     */
    public gov.nih.nci.cagrid.gts.bean.X509CRL getCRL() {
        return CRL;
    }


    /**
     * Sets the CRL value for this TrustedAuthority.
     * 
     * @param CRL
     */
    public void setCRL(gov.nih.nci.cagrid.gts.bean.X509CRL CRL) {
        this.CRL = CRL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrustedAuthority)) return false;
        TrustedAuthority other = (TrustedAuthority) obj;
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
            ((this.trustLevels==null && other.getTrustLevels()==null) || 
             (this.trustLevels!=null &&
              this.trustLevels.equals(other.getTrustLevels()))) &&
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
              this.sourceGTS.equals(other.getSourceGTS()))) &&
            this.expires == other.getExpires() &&
            this.lastUpdated == other.getLastUpdated() &&
            ((this.certificate==null && other.getCertificate()==null) || 
             (this.certificate!=null &&
              this.certificate.equals(other.getCertificate()))) &&
            ((this.CRL==null && other.getCRL()==null) || 
             (this.CRL!=null &&
              this.CRL.equals(other.getCRL())));
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
        if (getTrustLevels() != null) {
            _hashCode += getTrustLevels().hashCode();
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
        _hashCode += new Long(getExpires()).hashCode();
        _hashCode += new Long(getLastUpdated()).hashCode();
        if (getCertificate() != null) {
            _hashCode += getCertificate().hashCode();
        }
        if (getCRL() != null) {
            _hashCode += getCRL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrustedAuthority.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "TrustedAuthority"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trustLevels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "TrustLevels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "TrustLevels"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "Status"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expires");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "Expires"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "LastUpdated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "Certificate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "X509Certificate"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CRL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "CRL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "X509CRL"));
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
