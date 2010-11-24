/**
 * AuthorityGTS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cagrid.gts.bean;

public class AuthorityGTS  implements java.io.Serializable {
    private java.lang.String serviceURI;
    private int priority;
    private boolean syncTrustLevels;
    private gov.nih.nci.cagrid.gts.bean.TimeToLive timeToLive;
    private boolean performAuthorization;
    private java.lang.String serviceIdentity;

    public AuthorityGTS() {
    }

    public AuthorityGTS(
           boolean performAuthorization,
           int priority,
           java.lang.String serviceIdentity,
           java.lang.String serviceURI,
           boolean syncTrustLevels,
           gov.nih.nci.cagrid.gts.bean.TimeToLive timeToLive) {
           this.serviceURI = serviceURI;
           this.priority = priority;
           this.syncTrustLevels = syncTrustLevels;
           this.timeToLive = timeToLive;
           this.performAuthorization = performAuthorization;
           this.serviceIdentity = serviceIdentity;
    }


    /**
     * Gets the serviceURI value for this AuthorityGTS.
     * 
     * @return serviceURI
     */
    public java.lang.String getServiceURI() {
        return serviceURI;
    }


    /**
     * Sets the serviceURI value for this AuthorityGTS.
     * 
     * @param serviceURI
     */
    public void setServiceURI(java.lang.String serviceURI) {
        this.serviceURI = serviceURI;
    }


    /**
     * Gets the priority value for this AuthorityGTS.
     * 
     * @return priority
     */
    public int getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this AuthorityGTS.
     * 
     * @param priority
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }


    /**
     * Gets the syncTrustLevels value for this AuthorityGTS.
     * 
     * @return syncTrustLevels
     */
    public boolean isSyncTrustLevels() {
        return syncTrustLevels;
    }


    /**
     * Sets the syncTrustLevels value for this AuthorityGTS.
     * 
     * @param syncTrustLevels
     */
    public void setSyncTrustLevels(boolean syncTrustLevels) {
        this.syncTrustLevels = syncTrustLevels;
    }


    /**
     * Gets the timeToLive value for this AuthorityGTS.
     * 
     * @return timeToLive
     */
    public gov.nih.nci.cagrid.gts.bean.TimeToLive getTimeToLive() {
        return timeToLive;
    }


    /**
     * Sets the timeToLive value for this AuthorityGTS.
     * 
     * @param timeToLive
     */
    public void setTimeToLive(gov.nih.nci.cagrid.gts.bean.TimeToLive timeToLive) {
        this.timeToLive = timeToLive;
    }


    /**
     * Gets the performAuthorization value for this AuthorityGTS.
     * 
     * @return performAuthorization
     */
    public boolean isPerformAuthorization() {
        return performAuthorization;
    }


    /**
     * Sets the performAuthorization value for this AuthorityGTS.
     * 
     * @param performAuthorization
     */
    public void setPerformAuthorization(boolean performAuthorization) {
        this.performAuthorization = performAuthorization;
    }


    /**
     * Gets the serviceIdentity value for this AuthorityGTS.
     * 
     * @return serviceIdentity
     */
    public java.lang.String getServiceIdentity() {
        return serviceIdentity;
    }


    /**
     * Sets the serviceIdentity value for this AuthorityGTS.
     * 
     * @param serviceIdentity
     */
    public void setServiceIdentity(java.lang.String serviceIdentity) {
        this.serviceIdentity = serviceIdentity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthorityGTS)) return false;
        AuthorityGTS other = (AuthorityGTS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceURI==null && other.getServiceURI()==null) || 
             (this.serviceURI!=null &&
              this.serviceURI.equals(other.getServiceURI()))) &&
            this.priority == other.getPriority() &&
            this.syncTrustLevels == other.isSyncTrustLevels() &&
            ((this.timeToLive==null && other.getTimeToLive()==null) || 
             (this.timeToLive!=null &&
              this.timeToLive.equals(other.getTimeToLive()))) &&
            this.performAuthorization == other.isPerformAuthorization() &&
            ((this.serviceIdentity==null && other.getServiceIdentity()==null) || 
             (this.serviceIdentity!=null &&
              this.serviceIdentity.equals(other.getServiceIdentity())));
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
        if (getServiceURI() != null) {
            _hashCode += getServiceURI().hashCode();
        }
        _hashCode += getPriority();
        _hashCode += (isSyncTrustLevels() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTimeToLive() != null) {
            _hashCode += getTimeToLive().hashCode();
        }
        _hashCode += (isPerformAuthorization() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getServiceIdentity() != null) {
            _hashCode += getServiceIdentity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthorityGTS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "AuthorityGTS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "ServiceURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syncTrustLevels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "SyncTrustLevels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeToLive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "TimeToLive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "TimeToLive"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performAuthorization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "PerformAuthorization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "ServiceIdentity"));
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
