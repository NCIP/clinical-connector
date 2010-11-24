/**
 * TrustedCA.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cagrid.syncgts.bean;

public class TrustedCA  implements java.io.Serializable {
    private java.lang.String name;
    private java.lang.String gts;
    private long discovered;
    private long expiration;
    private java.lang.String metadataFile;
    private java.lang.String certificateFile;
    private java.lang.String CRLFile;
    private java.lang.String signingPolicyFile;

    public TrustedCA() {
    }

    public TrustedCA(
           java.lang.String CRLFile,
           java.lang.String certificateFile,
           long discovered,
           long expiration,
           java.lang.String gts,
           java.lang.String metadataFile,
           java.lang.String name,
           java.lang.String signingPolicyFile) {
           this.name = name;
           this.gts = gts;
           this.discovered = discovered;
           this.expiration = expiration;
           this.metadataFile = metadataFile;
           this.certificateFile = certificateFile;
           this.CRLFile = CRLFile;
           this.signingPolicyFile = signingPolicyFile;
    }


    /**
     * Gets the name value for this TrustedCA.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TrustedCA.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the gts value for this TrustedCA.
     * 
     * @return gts
     */
    public java.lang.String getGts() {
        return gts;
    }


    /**
     * Sets the gts value for this TrustedCA.
     * 
     * @param gts
     */
    public void setGts(java.lang.String gts) {
        this.gts = gts;
    }


    /**
     * Gets the discovered value for this TrustedCA.
     * 
     * @return discovered
     */
    public long getDiscovered() {
        return discovered;
    }


    /**
     * Sets the discovered value for this TrustedCA.
     * 
     * @param discovered
     */
    public void setDiscovered(long discovered) {
        this.discovered = discovered;
    }


    /**
     * Gets the expiration value for this TrustedCA.
     * 
     * @return expiration
     */
    public long getExpiration() {
        return expiration;
    }


    /**
     * Sets the expiration value for this TrustedCA.
     * 
     * @param expiration
     */
    public void setExpiration(long expiration) {
        this.expiration = expiration;
    }


    /**
     * Gets the metadataFile value for this TrustedCA.
     * 
     * @return metadataFile
     */
    public java.lang.String getMetadataFile() {
        return metadataFile;
    }


    /**
     * Sets the metadataFile value for this TrustedCA.
     * 
     * @param metadataFile
     */
    public void setMetadataFile(java.lang.String metadataFile) {
        this.metadataFile = metadataFile;
    }


    /**
     * Gets the certificateFile value for this TrustedCA.
     * 
     * @return certificateFile
     */
    public java.lang.String getCertificateFile() {
        return certificateFile;
    }


    /**
     * Sets the certificateFile value for this TrustedCA.
     * 
     * @param certificateFile
     */
    public void setCertificateFile(java.lang.String certificateFile) {
        this.certificateFile = certificateFile;
    }


    /**
     * Gets the CRLFile value for this TrustedCA.
     * 
     * @return CRLFile
     */
    public java.lang.String getCRLFile() {
        return CRLFile;
    }


    /**
     * Sets the CRLFile value for this TrustedCA.
     * 
     * @param CRLFile
     */
    public void setCRLFile(java.lang.String CRLFile) {
        this.CRLFile = CRLFile;
    }


    /**
     * Gets the signingPolicyFile value for this TrustedCA.
     * 
     * @return signingPolicyFile
     */
    public java.lang.String getSigningPolicyFile() {
        return signingPolicyFile;
    }


    /**
     * Sets the signingPolicyFile value for this TrustedCA.
     * 
     * @param signingPolicyFile
     */
    public void setSigningPolicyFile(java.lang.String signingPolicyFile) {
        this.signingPolicyFile = signingPolicyFile;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrustedCA)) return false;
        TrustedCA other = (TrustedCA) obj;
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
            ((this.gts==null && other.getGts()==null) || 
             (this.gts!=null &&
              this.gts.equals(other.getGts()))) &&
            this.discovered == other.getDiscovered() &&
            this.expiration == other.getExpiration() &&
            ((this.metadataFile==null && other.getMetadataFile()==null) || 
             (this.metadataFile!=null &&
              this.metadataFile.equals(other.getMetadataFile()))) &&
            ((this.certificateFile==null && other.getCertificateFile()==null) || 
             (this.certificateFile!=null &&
              this.certificateFile.equals(other.getCertificateFile()))) &&
            ((this.CRLFile==null && other.getCRLFile()==null) || 
             (this.CRLFile!=null &&
              this.CRLFile.equals(other.getCRLFile()))) &&
            ((this.signingPolicyFile==null && other.getSigningPolicyFile()==null) || 
             (this.signingPolicyFile!=null &&
              this.signingPolicyFile.equals(other.getSigningPolicyFile())));
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
        if (getGts() != null) {
            _hashCode += getGts().hashCode();
        }
        _hashCode += new Long(getDiscovered()).hashCode();
        _hashCode += new Long(getExpiration()).hashCode();
        if (getMetadataFile() != null) {
            _hashCode += getMetadataFile().hashCode();
        }
        if (getCertificateFile() != null) {
            _hashCode += getCertificateFile().hashCode();
        }
        if (getCRLFile() != null) {
            _hashCode += getCRLFile().hashCode();
        }
        if (getSigningPolicyFile() != null) {
            _hashCode += getSigningPolicyFile().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrustedCA.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "TrustedCA"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "gts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discovered");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "discovered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "expiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metadataFile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "MetadataFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateFile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "CertificateFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CRLFile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "CRLFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signingPolicyFile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "SigningPolicyFile"));
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
