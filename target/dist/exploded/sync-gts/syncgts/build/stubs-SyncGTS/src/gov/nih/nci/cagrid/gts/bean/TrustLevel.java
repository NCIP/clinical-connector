/**
 * TrustLevel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cagrid.gts.bean;

public class TrustLevel  implements java.io.Serializable {
    private java.lang.String name;
    private java.lang.String description;
    private java.lang.Boolean isAuthority;
    private java.lang.String authorityGTS;
    private java.lang.String sourceGTS;
    private long lastUpdated;

    public TrustLevel() {
    }

    public TrustLevel(
           java.lang.String authorityGTS,
           java.lang.String description,
           java.lang.Boolean isAuthority,
           long lastUpdated,
           java.lang.String name,
           java.lang.String sourceGTS) {
           this.name = name;
           this.description = description;
           this.isAuthority = isAuthority;
           this.authorityGTS = authorityGTS;
           this.sourceGTS = sourceGTS;
           this.lastUpdated = lastUpdated;
    }


    /**
     * Gets the name value for this TrustLevel.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TrustLevel.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this TrustLevel.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TrustLevel.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the isAuthority value for this TrustLevel.
     * 
     * @return isAuthority
     */
    public java.lang.Boolean getIsAuthority() {
        return isAuthority;
    }


    /**
     * Sets the isAuthority value for this TrustLevel.
     * 
     * @param isAuthority
     */
    public void setIsAuthority(java.lang.Boolean isAuthority) {
        this.isAuthority = isAuthority;
    }


    /**
     * Gets the authorityGTS value for this TrustLevel.
     * 
     * @return authorityGTS
     */
    public java.lang.String getAuthorityGTS() {
        return authorityGTS;
    }


    /**
     * Sets the authorityGTS value for this TrustLevel.
     * 
     * @param authorityGTS
     */
    public void setAuthorityGTS(java.lang.String authorityGTS) {
        this.authorityGTS = authorityGTS;
    }


    /**
     * Gets the sourceGTS value for this TrustLevel.
     * 
     * @return sourceGTS
     */
    public java.lang.String getSourceGTS() {
        return sourceGTS;
    }


    /**
     * Sets the sourceGTS value for this TrustLevel.
     * 
     * @param sourceGTS
     */
    public void setSourceGTS(java.lang.String sourceGTS) {
        this.sourceGTS = sourceGTS;
    }


    /**
     * Gets the lastUpdated value for this TrustLevel.
     * 
     * @return lastUpdated
     */
    public long getLastUpdated() {
        return lastUpdated;
    }


    /**
     * Sets the lastUpdated value for this TrustLevel.
     * 
     * @param lastUpdated
     */
    public void setLastUpdated(long lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrustLevel)) return false;
        TrustLevel other = (TrustLevel) obj;
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
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.isAuthority==null && other.getIsAuthority()==null) || 
             (this.isAuthority!=null &&
              this.isAuthority.equals(other.getIsAuthority()))) &&
            ((this.authorityGTS==null && other.getAuthorityGTS()==null) || 
             (this.authorityGTS!=null &&
              this.authorityGTS.equals(other.getAuthorityGTS()))) &&
            ((this.sourceGTS==null && other.getSourceGTS()==null) || 
             (this.sourceGTS!=null &&
              this.sourceGTS.equals(other.getSourceGTS()))) &&
            this.lastUpdated == other.getLastUpdated();
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
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
        _hashCode += new Long(getLastUpdated()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrustLevel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "TrustLevel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("lastUpdated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "LastUpdated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
