/**
 * SyncDescriptor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cagrid.syncgts.bean;

public class SyncDescriptor  implements java.io.Serializable {
    private java.lang.String gtsServiceURI;
    private gov.nih.nci.cagrid.syncgts.bean.Expiration expiration;
    private gov.nih.nci.cagrid.gts.bean.TrustedAuthorityFilter[] trustedAuthorityFilter;
    private boolean performAuthorization;
    private java.lang.String GTSIdentity;

    public SyncDescriptor() {
    }

    public SyncDescriptor(
           java.lang.String GTSIdentity,
           gov.nih.nci.cagrid.syncgts.bean.Expiration expiration,
           java.lang.String gtsServiceURI,
           boolean performAuthorization,
           gov.nih.nci.cagrid.gts.bean.TrustedAuthorityFilter[] trustedAuthorityFilter) {
           this.gtsServiceURI = gtsServiceURI;
           this.expiration = expiration;
           this.trustedAuthorityFilter = trustedAuthorityFilter;
           this.performAuthorization = performAuthorization;
           this.GTSIdentity = GTSIdentity;
    }


    /**
     * Gets the gtsServiceURI value for this SyncDescriptor.
     * 
     * @return gtsServiceURI
     */
    public java.lang.String getGtsServiceURI() {
        return gtsServiceURI;
    }


    /**
     * Sets the gtsServiceURI value for this SyncDescriptor.
     * 
     * @param gtsServiceURI
     */
    public void setGtsServiceURI(java.lang.String gtsServiceURI) {
        this.gtsServiceURI = gtsServiceURI;
    }


    /**
     * Gets the expiration value for this SyncDescriptor.
     * 
     * @return expiration
     */
    public gov.nih.nci.cagrid.syncgts.bean.Expiration getExpiration() {
        return expiration;
    }


    /**
     * Sets the expiration value for this SyncDescriptor.
     * 
     * @param expiration
     */
    public void setExpiration(gov.nih.nci.cagrid.syncgts.bean.Expiration expiration) {
        this.expiration = expiration;
    }


    /**
     * Gets the trustedAuthorityFilter value for this SyncDescriptor.
     * 
     * @return trustedAuthorityFilter
     */
    public gov.nih.nci.cagrid.gts.bean.TrustedAuthorityFilter[] getTrustedAuthorityFilter() {
        return trustedAuthorityFilter;
    }


    /**
     * Sets the trustedAuthorityFilter value for this SyncDescriptor.
     * 
     * @param trustedAuthorityFilter
     */
    public void setTrustedAuthorityFilter(gov.nih.nci.cagrid.gts.bean.TrustedAuthorityFilter[] trustedAuthorityFilter) {
        this.trustedAuthorityFilter = trustedAuthorityFilter;
    }

    public gov.nih.nci.cagrid.gts.bean.TrustedAuthorityFilter getTrustedAuthorityFilter(int i) {
        return this.trustedAuthorityFilter[i];
    }

    public void setTrustedAuthorityFilter(int i, gov.nih.nci.cagrid.gts.bean.TrustedAuthorityFilter _value) {
        this.trustedAuthorityFilter[i] = _value;
    }


    /**
     * Gets the performAuthorization value for this SyncDescriptor.
     * 
     * @return performAuthorization
     */
    public boolean isPerformAuthorization() {
        return performAuthorization;
    }


    /**
     * Sets the performAuthorization value for this SyncDescriptor.
     * 
     * @param performAuthorization
     */
    public void setPerformAuthorization(boolean performAuthorization) {
        this.performAuthorization = performAuthorization;
    }


    /**
     * Gets the GTSIdentity value for this SyncDescriptor.
     * 
     * @return GTSIdentity
     */
    public java.lang.String getGTSIdentity() {
        return GTSIdentity;
    }


    /**
     * Sets the GTSIdentity value for this SyncDescriptor.
     * 
     * @param GTSIdentity
     */
    public void setGTSIdentity(java.lang.String GTSIdentity) {
        this.GTSIdentity = GTSIdentity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SyncDescriptor)) return false;
        SyncDescriptor other = (SyncDescriptor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gtsServiceURI==null && other.getGtsServiceURI()==null) || 
             (this.gtsServiceURI!=null &&
              this.gtsServiceURI.equals(other.getGtsServiceURI()))) &&
            ((this.expiration==null && other.getExpiration()==null) || 
             (this.expiration!=null &&
              this.expiration.equals(other.getExpiration()))) &&
            ((this.trustedAuthorityFilter==null && other.getTrustedAuthorityFilter()==null) || 
             (this.trustedAuthorityFilter!=null &&
              java.util.Arrays.equals(this.trustedAuthorityFilter, other.getTrustedAuthorityFilter()))) &&
            this.performAuthorization == other.isPerformAuthorization() &&
            ((this.GTSIdentity==null && other.getGTSIdentity()==null) || 
             (this.GTSIdentity!=null &&
              this.GTSIdentity.equals(other.getGTSIdentity())));
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
        if (getGtsServiceURI() != null) {
            _hashCode += getGtsServiceURI().hashCode();
        }
        if (getExpiration() != null) {
            _hashCode += getExpiration().hashCode();
        }
        if (getTrustedAuthorityFilter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrustedAuthorityFilter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrustedAuthorityFilter(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isPerformAuthorization() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getGTSIdentity() != null) {
            _hashCode += getGTSIdentity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SyncDescriptor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "SyncDescriptor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gtsServiceURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "gtsServiceURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "Expiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "Expiration"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trustedAuthorityFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "TrustedAuthorityFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "TrustedAuthorityFilter"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performAuthorization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "PerformAuthorization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GTSIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "GTSIdentity"));
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
