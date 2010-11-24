/**
 * HealthCareSite.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A physical location, typically a clinical research facility or
 * a sponsor's office that provides healthcare services.  
 * 
 * For example, Northwestern Memorial Hospital.
 */
public class HealthCareSite  implements java.io.Serializable {
    /** The unique identifier for the HealthcareSite.
 * 
 * For example, in the Cancer Therapy Evaluation Program (CTEP), every
 * site that interacts with the National Cancer Institute (NCI) gets
 * an NCI unique identifier. 
 * 
 * For example, hospitals get an American Hospital Association (AHA)
 * ID. */
    private gov.nih.nci.cabig.ccts.domain.cdt.II identifier;
    /** The location for where the healthcare site can be found or the
 * information used to identify where to send physical items.. */
    private gov.nih.nci.cabig.ccts.domain.cdt.AD postalAddress;

    public HealthCareSite() {
    }

    public HealthCareSite(
           gov.nih.nci.cabig.ccts.domain.cdt.II identifier,
           gov.nih.nci.cabig.ccts.domain.cdt.AD postalAddress) {
           this.identifier = identifier;
           this.postalAddress = postalAddress;
    }


    /**
     * Gets the identifier value for this HealthCareSite.
     * 
     * @return identifier The unique identifier for the HealthcareSite.
 * 
 * For example, in the Cancer Therapy Evaluation Program (CTEP), every
 * site that interacts with the National Cancer Institute (NCI) gets
 * an NCI unique identifier. 
 * 
 * For example, hospitals get an American Hospital Association (AHA)
 * ID.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.II getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this HealthCareSite.
     * 
     * @param identifier The unique identifier for the HealthcareSite.
 * 
 * For example, in the Cancer Therapy Evaluation Program (CTEP), every
 * site that interacts with the National Cancer Institute (NCI) gets
 * an NCI unique identifier. 
 * 
 * For example, hospitals get an American Hospital Association (AHA)
 * ID.
     */
    public void setIdentifier(gov.nih.nci.cabig.ccts.domain.cdt.II identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the postalAddress value for this HealthCareSite.
     * 
     * @return postalAddress The location for where the healthcare site can be found or the
 * information used to identify where to send physical items..
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.AD getPostalAddress() {
        return postalAddress;
    }


    /**
     * Sets the postalAddress value for this HealthCareSite.
     * 
     * @param postalAddress The location for where the healthcare site can be found or the
 * information used to identify where to send physical items..
     */
    public void setPostalAddress(gov.nih.nci.cabig.ccts.domain.cdt.AD postalAddress) {
        this.postalAddress = postalAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HealthCareSite)) return false;
        HealthCareSite other = (HealthCareSite) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier()))) &&
            ((this.postalAddress==null && other.getPostalAddress()==null) || 
             (this.postalAddress!=null &&
              this.postalAddress.equals(other.getPostalAddress())));
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
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        if (getPostalAddress() != null) {
            _hashCode += getPostalAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HealthCareSite.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "HealthCareSite"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "II"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "postalAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "AD"));
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
