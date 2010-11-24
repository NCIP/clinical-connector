/**
 * SyncDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cagrid.syncgts.bean;

public class SyncDescription  implements java.io.Serializable {
    private gov.nih.nci.cagrid.syncgts.bean.SyncDescriptor[] syncDescriptor;
    private gov.nih.nci.cagrid.syncgts.bean.ExcludedCAs excludedCAs;
    private boolean deleteInvalidFiles;
    private java.math.BigInteger nextSync;
    private gov.nih.nci.cagrid.syncgts.bean.DateFilter cacheSize;

    public SyncDescription() {
    }

    public SyncDescription(
           gov.nih.nci.cagrid.syncgts.bean.DateFilter cacheSize,
           boolean deleteInvalidFiles,
           gov.nih.nci.cagrid.syncgts.bean.ExcludedCAs excludedCAs,
           java.math.BigInteger nextSync,
           gov.nih.nci.cagrid.syncgts.bean.SyncDescriptor[] syncDescriptor) {
           this.syncDescriptor = syncDescriptor;
           this.excludedCAs = excludedCAs;
           this.deleteInvalidFiles = deleteInvalidFiles;
           this.nextSync = nextSync;
           this.cacheSize = cacheSize;
    }


    /**
     * Gets the syncDescriptor value for this SyncDescription.
     * 
     * @return syncDescriptor
     */
    public gov.nih.nci.cagrid.syncgts.bean.SyncDescriptor[] getSyncDescriptor() {
        return syncDescriptor;
    }


    /**
     * Sets the syncDescriptor value for this SyncDescription.
     * 
     * @param syncDescriptor
     */
    public void setSyncDescriptor(gov.nih.nci.cagrid.syncgts.bean.SyncDescriptor[] syncDescriptor) {
        this.syncDescriptor = syncDescriptor;
    }

    public gov.nih.nci.cagrid.syncgts.bean.SyncDescriptor getSyncDescriptor(int i) {
        return this.syncDescriptor[i];
    }

    public void setSyncDescriptor(int i, gov.nih.nci.cagrid.syncgts.bean.SyncDescriptor _value) {
        this.syncDescriptor[i] = _value;
    }


    /**
     * Gets the excludedCAs value for this SyncDescription.
     * 
     * @return excludedCAs
     */
    public gov.nih.nci.cagrid.syncgts.bean.ExcludedCAs getExcludedCAs() {
        return excludedCAs;
    }


    /**
     * Sets the excludedCAs value for this SyncDescription.
     * 
     * @param excludedCAs
     */
    public void setExcludedCAs(gov.nih.nci.cagrid.syncgts.bean.ExcludedCAs excludedCAs) {
        this.excludedCAs = excludedCAs;
    }


    /**
     * Gets the deleteInvalidFiles value for this SyncDescription.
     * 
     * @return deleteInvalidFiles
     */
    public boolean isDeleteInvalidFiles() {
        return deleteInvalidFiles;
    }


    /**
     * Sets the deleteInvalidFiles value for this SyncDescription.
     * 
     * @param deleteInvalidFiles
     */
    public void setDeleteInvalidFiles(boolean deleteInvalidFiles) {
        this.deleteInvalidFiles = deleteInvalidFiles;
    }


    /**
     * Gets the nextSync value for this SyncDescription.
     * 
     * @return nextSync
     */
    public java.math.BigInteger getNextSync() {
        return nextSync;
    }


    /**
     * Sets the nextSync value for this SyncDescription.
     * 
     * @param nextSync
     */
    public void setNextSync(java.math.BigInteger nextSync) {
        this.nextSync = nextSync;
    }


    /**
     * Gets the cacheSize value for this SyncDescription.
     * 
     * @return cacheSize
     */
    public gov.nih.nci.cagrid.syncgts.bean.DateFilter getCacheSize() {
        return cacheSize;
    }


    /**
     * Sets the cacheSize value for this SyncDescription.
     * 
     * @param cacheSize
     */
    public void setCacheSize(gov.nih.nci.cagrid.syncgts.bean.DateFilter cacheSize) {
        this.cacheSize = cacheSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SyncDescription)) return false;
        SyncDescription other = (SyncDescription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.syncDescriptor==null && other.getSyncDescriptor()==null) || 
             (this.syncDescriptor!=null &&
              java.util.Arrays.equals(this.syncDescriptor, other.getSyncDescriptor()))) &&
            ((this.excludedCAs==null && other.getExcludedCAs()==null) || 
             (this.excludedCAs!=null &&
              this.excludedCAs.equals(other.getExcludedCAs()))) &&
            this.deleteInvalidFiles == other.isDeleteInvalidFiles() &&
            ((this.nextSync==null && other.getNextSync()==null) || 
             (this.nextSync!=null &&
              this.nextSync.equals(other.getNextSync()))) &&
            ((this.cacheSize==null && other.getCacheSize()==null) || 
             (this.cacheSize!=null &&
              this.cacheSize.equals(other.getCacheSize())));
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
        if (getSyncDescriptor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSyncDescriptor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSyncDescriptor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludedCAs() != null) {
            _hashCode += getExcludedCAs().hashCode();
        }
        _hashCode += (isDeleteInvalidFiles() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNextSync() != null) {
            _hashCode += getNextSync().hashCode();
        }
        if (getCacheSize() != null) {
            _hashCode += getCacheSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SyncDescription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "SyncDescription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syncDescriptor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "SyncDescriptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "SyncDescriptor"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludedCAs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "ExcludedCAs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "ExcludedCAs"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteInvalidFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "DeleteInvalidFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextSync");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "NextSync"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cacheSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "CacheSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "DateFilter"));
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
