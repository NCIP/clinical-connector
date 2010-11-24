/**
 * ScheduledObservation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * The action of observing, monitoring, measuring or otherwise qualitatively
 * or quantitatively gathering data or information about one or more
 * aspects of a subject's physiologic or psychologic state at or during
 * a designated time.
 * 
 * For example, lab test, taking vital signs, physical exam, etc.
 */
public class ScheduledObservation  extends gov.nih.nci.cabig.ccts.domain.bridg.ScheduledActivity  implements java.io.Serializable {
    /** Provides additional detail about the means or technique used to
 * ascertain the ScheduledObservation. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD method;
    /** A free text and coded representation of the ScheduledObservation. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD name;
    /** Specifies detail about the anatomical site or system that is the
 * focus of the ScheduledObservation. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD targetSite;

    public ScheduledObservation() {
    }

    public ScheduledObservation(
           gov.nih.nci.cabig.ccts.domain.cdt.CD method,
           gov.nih.nci.cabig.ccts.domain.cdt.CD name,
           gov.nih.nci.cabig.ccts.domain.cdt.CD targetSite) {
           this.method = method;
           this.name = name;
           this.targetSite = targetSite;
    }


    /**
     * Gets the method value for this ScheduledObservation.
     * 
     * @return method Provides additional detail about the means or technique used to
 * ascertain the ScheduledObservation.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getMethod() {
        return method;
    }


    /**
     * Sets the method value for this ScheduledObservation.
     * 
     * @param method Provides additional detail about the means or technique used to
 * ascertain the ScheduledObservation.
     */
    public void setMethod(gov.nih.nci.cabig.ccts.domain.cdt.CD method) {
        this.method = method;
    }


    /**
     * Gets the name value for this ScheduledObservation.
     * 
     * @return name A free text and coded representation of the ScheduledObservation.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getName() {
        return name;
    }


    /**
     * Sets the name value for this ScheduledObservation.
     * 
     * @param name A free text and coded representation of the ScheduledObservation.
     */
    public void setName(gov.nih.nci.cabig.ccts.domain.cdt.CD name) {
        this.name = name;
    }


    /**
     * Gets the targetSite value for this ScheduledObservation.
     * 
     * @return targetSite Specifies detail about the anatomical site or system that is the
 * focus of the ScheduledObservation.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getTargetSite() {
        return targetSite;
    }


    /**
     * Sets the targetSite value for this ScheduledObservation.
     * 
     * @param targetSite Specifies detail about the anatomical site or system that is the
 * focus of the ScheduledObservation.
     */
    public void setTargetSite(gov.nih.nci.cabig.ccts.domain.cdt.CD targetSite) {
        this.targetSite = targetSite;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduledObservation)) return false;
        ScheduledObservation other = (ScheduledObservation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.method==null && other.getMethod()==null) || 
             (this.method!=null &&
              this.method.equals(other.getMethod()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.targetSite==null && other.getTargetSite()==null) || 
             (this.targetSite!=null &&
              this.targetSite.equals(other.getTargetSite())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getMethod() != null) {
            _hashCode += getMethod().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getTargetSite() != null) {
            _hashCode += getTargetSite().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScheduledObservation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledObservation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("method");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "method"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetSite");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "targetSite"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
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
