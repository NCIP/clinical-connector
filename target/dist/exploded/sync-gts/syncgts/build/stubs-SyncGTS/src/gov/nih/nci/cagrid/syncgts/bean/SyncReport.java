/**
 * SyncReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cagrid.syncgts.bean;

public class SyncReport  implements java.io.Serializable {
    private java.lang.String timestamp;
    private gov.nih.nci.cagrid.syncgts.bean.SyncDescription syncDescription;
    private gov.nih.nci.cagrid.syncgts.bean.AddedTrustedCAs addedTrustedCAs;
    private gov.nih.nci.cagrid.syncgts.bean.RemovedTrustedCAs removedTrustedCAs;
    private gov.nih.nci.cagrid.syncgts.bean.Messages messages;

    public SyncReport() {
    }

    public SyncReport(
           gov.nih.nci.cagrid.syncgts.bean.AddedTrustedCAs addedTrustedCAs,
           gov.nih.nci.cagrid.syncgts.bean.Messages messages,
           gov.nih.nci.cagrid.syncgts.bean.RemovedTrustedCAs removedTrustedCAs,
           gov.nih.nci.cagrid.syncgts.bean.SyncDescription syncDescription,
           java.lang.String timestamp) {
           this.timestamp = timestamp;
           this.syncDescription = syncDescription;
           this.addedTrustedCAs = addedTrustedCAs;
           this.removedTrustedCAs = removedTrustedCAs;
           this.messages = messages;
    }


    /**
     * Gets the timestamp value for this SyncReport.
     * 
     * @return timestamp
     */
    public java.lang.String getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this SyncReport.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.lang.String timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the syncDescription value for this SyncReport.
     * 
     * @return syncDescription
     */
    public gov.nih.nci.cagrid.syncgts.bean.SyncDescription getSyncDescription() {
        return syncDescription;
    }


    /**
     * Sets the syncDescription value for this SyncReport.
     * 
     * @param syncDescription
     */
    public void setSyncDescription(gov.nih.nci.cagrid.syncgts.bean.SyncDescription syncDescription) {
        this.syncDescription = syncDescription;
    }


    /**
     * Gets the addedTrustedCAs value for this SyncReport.
     * 
     * @return addedTrustedCAs
     */
    public gov.nih.nci.cagrid.syncgts.bean.AddedTrustedCAs getAddedTrustedCAs() {
        return addedTrustedCAs;
    }


    /**
     * Sets the addedTrustedCAs value for this SyncReport.
     * 
     * @param addedTrustedCAs
     */
    public void setAddedTrustedCAs(gov.nih.nci.cagrid.syncgts.bean.AddedTrustedCAs addedTrustedCAs) {
        this.addedTrustedCAs = addedTrustedCAs;
    }


    /**
     * Gets the removedTrustedCAs value for this SyncReport.
     * 
     * @return removedTrustedCAs
     */
    public gov.nih.nci.cagrid.syncgts.bean.RemovedTrustedCAs getRemovedTrustedCAs() {
        return removedTrustedCAs;
    }


    /**
     * Sets the removedTrustedCAs value for this SyncReport.
     * 
     * @param removedTrustedCAs
     */
    public void setRemovedTrustedCAs(gov.nih.nci.cagrid.syncgts.bean.RemovedTrustedCAs removedTrustedCAs) {
        this.removedTrustedCAs = removedTrustedCAs;
    }


    /**
     * Gets the messages value for this SyncReport.
     * 
     * @return messages
     */
    public gov.nih.nci.cagrid.syncgts.bean.Messages getMessages() {
        return messages;
    }


    /**
     * Sets the messages value for this SyncReport.
     * 
     * @param messages
     */
    public void setMessages(gov.nih.nci.cagrid.syncgts.bean.Messages messages) {
        this.messages = messages;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SyncReport)) return false;
        SyncReport other = (SyncReport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp()))) &&
            ((this.syncDescription==null && other.getSyncDescription()==null) || 
             (this.syncDescription!=null &&
              this.syncDescription.equals(other.getSyncDescription()))) &&
            ((this.addedTrustedCAs==null && other.getAddedTrustedCAs()==null) || 
             (this.addedTrustedCAs!=null &&
              this.addedTrustedCAs.equals(other.getAddedTrustedCAs()))) &&
            ((this.removedTrustedCAs==null && other.getRemovedTrustedCAs()==null) || 
             (this.removedTrustedCAs!=null &&
              this.removedTrustedCAs.equals(other.getRemovedTrustedCAs()))) &&
            ((this.messages==null && other.getMessages()==null) || 
             (this.messages!=null &&
              this.messages.equals(other.getMessages())));
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
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        if (getSyncDescription() != null) {
            _hashCode += getSyncDescription().hashCode();
        }
        if (getAddedTrustedCAs() != null) {
            _hashCode += getAddedTrustedCAs().hashCode();
        }
        if (getRemovedTrustedCAs() != null) {
            _hashCode += getRemovedTrustedCAs().hashCode();
        }
        if (getMessages() != null) {
            _hashCode += getMessages().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SyncReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "SyncReport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "Timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syncDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "SyncDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "SyncDescription"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addedTrustedCAs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "AddedTrustedCAs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "AddedTrustedCAs"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removedTrustedCAs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "RemovedTrustedCAs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "RemovedTrustedCAs"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "Messages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/12/SyncGTS", "Messages"));
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
