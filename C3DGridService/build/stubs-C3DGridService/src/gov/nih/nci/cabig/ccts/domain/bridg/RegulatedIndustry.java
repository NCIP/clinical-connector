/**
 * RegulatedIndustry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * An individual company, institution or organization that develops,
 * distributes or has responsibility for a regulated product.
 */
public class RegulatedIndustry  implements java.io.Serializable {
    /** The unique identifier for the Regulated Industry. */
    private gov.nih.nci.cabig.ccts.domain.cdt.II registrationNumber;
    private gov.nih.nci.cabig.ccts.domain.bridg.ApplicationSponsor[] applicationSponsor;

    public RegulatedIndustry() {
    }

    public RegulatedIndustry(
           gov.nih.nci.cabig.ccts.domain.bridg.ApplicationSponsor[] applicationSponsor,
           gov.nih.nci.cabig.ccts.domain.cdt.II registrationNumber) {
           this.registrationNumber = registrationNumber;
           this.applicationSponsor = applicationSponsor;
    }


    /**
     * Gets the registrationNumber value for this RegulatedIndustry.
     * 
     * @return registrationNumber The unique identifier for the Regulated Industry.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.II getRegistrationNumber() {
        return registrationNumber;
    }


    /**
     * Sets the registrationNumber value for this RegulatedIndustry.
     * 
     * @param registrationNumber The unique identifier for the Regulated Industry.
     */
    public void setRegistrationNumber(gov.nih.nci.cabig.ccts.domain.cdt.II registrationNumber) {
        this.registrationNumber = registrationNumber;
    }


    /**
     * Gets the applicationSponsor value for this RegulatedIndustry.
     * 
     * @return applicationSponsor
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.ApplicationSponsor[] getApplicationSponsor() {
        return applicationSponsor;
    }


    /**
     * Sets the applicationSponsor value for this RegulatedIndustry.
     * 
     * @param applicationSponsor
     */
    public void setApplicationSponsor(gov.nih.nci.cabig.ccts.domain.bridg.ApplicationSponsor[] applicationSponsor) {
        this.applicationSponsor = applicationSponsor;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.ApplicationSponsor getApplicationSponsor(int i) {
        return this.applicationSponsor[i];
    }

    public void setApplicationSponsor(int i, gov.nih.nci.cabig.ccts.domain.bridg.ApplicationSponsor _value) {
        this.applicationSponsor[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegulatedIndustry)) return false;
        RegulatedIndustry other = (RegulatedIndustry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registrationNumber==null && other.getRegistrationNumber()==null) || 
             (this.registrationNumber!=null &&
              this.registrationNumber.equals(other.getRegistrationNumber()))) &&
            ((this.applicationSponsor==null && other.getApplicationSponsor()==null) || 
             (this.applicationSponsor!=null &&
              java.util.Arrays.equals(this.applicationSponsor, other.getApplicationSponsor())));
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
        if (getRegistrationNumber() != null) {
            _hashCode += getRegistrationNumber().hashCode();
        }
        if (getApplicationSponsor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApplicationSponsor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApplicationSponsor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegulatedIndustry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "RegulatedIndustry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "registrationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "II"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationSponsor");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ApplicationSponsor"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ApplicationSponsor"));
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
