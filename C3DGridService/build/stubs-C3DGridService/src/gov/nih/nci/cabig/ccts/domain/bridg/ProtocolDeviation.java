/**
 * ProtocolDeviation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A variation from process or procedures defined in a study.
 * 
 * NOTE: Deviations usually do not preclude the overall evaluability
 * of subject data for either efficacy or safety, and are often acknowledged
 * and accepted by a sponsor.
 */
public class ProtocolDeviation  extends gov.nih.nci.cabig.ccts.domain.bridg.Assessment  implements java.io.Serializable {
    /** The classification of protocol deviations.
 * 
 * For example, major, minor. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD category;
    /** The date and time when the protocol deviation began and ended. */
    private gov.nih.nci.cabig.ccts.domain.cdt.IVLTS dateRange;
    /** The verbatim text of the protocol deviation.
 * 
 * For example, scheduled visit was more than 3 days outside the prescribed
 * window, subject was given the wrong treatment or dose. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST description;
    /** Standardized representation of the description for the protocol
 * deviation.
 * 
 * For example, treatment deviation, visit outside window. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD name;

    public ProtocolDeviation() {
    }

    public ProtocolDeviation(
           gov.nih.nci.cabig.ccts.domain.cdt.CD category,
           gov.nih.nci.cabig.ccts.domain.cdt.IVLTS dateRange,
           gov.nih.nci.cabig.ccts.domain.cdt.ST description,
           gov.nih.nci.cabig.ccts.domain.cdt.CD name) {
           this.category = category;
           this.dateRange = dateRange;
           this.description = description;
           this.name = name;
    }


    /**
     * Gets the category value for this ProtocolDeviation.
     * 
     * @return category The classification of protocol deviations.
 * 
 * For example, major, minor.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getCategory() {
        return category;
    }


    /**
     * Sets the category value for this ProtocolDeviation.
     * 
     * @param category The classification of protocol deviations.
 * 
 * For example, major, minor.
     */
    public void setCategory(gov.nih.nci.cabig.ccts.domain.cdt.CD category) {
        this.category = category;
    }


    /**
     * Gets the dateRange value for this ProtocolDeviation.
     * 
     * @return dateRange The date and time when the protocol deviation began and ended.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.IVLTS getDateRange() {
        return dateRange;
    }


    /**
     * Sets the dateRange value for this ProtocolDeviation.
     * 
     * @param dateRange The date and time when the protocol deviation began and ended.
     */
    public void setDateRange(gov.nih.nci.cabig.ccts.domain.cdt.IVLTS dateRange) {
        this.dateRange = dateRange;
    }


    /**
     * Gets the description value for this ProtocolDeviation.
     * 
     * @return description The verbatim text of the protocol deviation.
 * 
 * For example, scheduled visit was more than 3 days outside the prescribed
 * window, subject was given the wrong treatment or dose.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ProtocolDeviation.
     * 
     * @param description The verbatim text of the protocol deviation.
 * 
 * For example, scheduled visit was more than 3 days outside the prescribed
 * window, subject was given the wrong treatment or dose.
     */
    public void setDescription(gov.nih.nci.cabig.ccts.domain.cdt.ST description) {
        this.description = description;
    }


    /**
     * Gets the name value for this ProtocolDeviation.
     * 
     * @return name Standardized representation of the description for the protocol
 * deviation.
 * 
 * For example, treatment deviation, visit outside window.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getName() {
        return name;
    }


    /**
     * Sets the name value for this ProtocolDeviation.
     * 
     * @param name Standardized representation of the description for the protocol
 * deviation.
 * 
 * For example, treatment deviation, visit outside window.
     */
    public void setName(gov.nih.nci.cabig.ccts.domain.cdt.CD name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProtocolDeviation)) return false;
        ProtocolDeviation other = (ProtocolDeviation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.dateRange==null && other.getDateRange()==null) || 
             (this.dateRange!=null &&
              this.dateRange.equals(other.getDateRange()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getDateRange() != null) {
            _hashCode += getDateRange().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProtocolDeviation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ProtocolDeviation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "dateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "IVLTS"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "name"));
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
