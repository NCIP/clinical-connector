/**
 * TEL.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.cdt;


/**
 * A telephone number (voice or fax), e-mail address, or other locator
 * for a resource mediated by telecommunication equipment. The address
 * is specified as a Universal Resource Locator (URL) qualified by time
 * specification and use codes that help in deciding which address to
 * use for a given time and purpose.
 */
public class TEL  implements java.io.Serializable {
    /** The actual telephone number (voice or fax), e-mail address, or
 * other locator. */
    private java.lang.String address;
    /** Identifies the protocol used to interpret the address string and
 * to access the resource so addressed.
 * 
 * For example, fax, mailto, telephone */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD scheme;
    /** One or more codes advising a system or user which telecommunication
 * address in a set of like addresses to select for a given telecommunication
 * need. */
    private java.lang.String use;
    /** Specifies the periods of time during which the telecommunication
 * address can be used. For a telephone number, this can indicate the
 * time of day in which the party can be reached on that telephone. For
 * a web address, it may specify a time range in which the web content
 * is promised to be available under the given address. */
    private gov.nih.nci.cabig.ccts.domain.cdt.IVLTS useablePeriod;

    public TEL() {
    }

    public TEL(
           java.lang.String address,
           gov.nih.nci.cabig.ccts.domain.cdt.CD scheme,
           java.lang.String use,
           gov.nih.nci.cabig.ccts.domain.cdt.IVLTS useablePeriod) {
           this.address = address;
           this.scheme = scheme;
           this.use = use;
           this.useablePeriod = useablePeriod;
    }


    /**
     * Gets the address value for this TEL.
     * 
     * @return address The actual telephone number (voice or fax), e-mail address, or
 * other locator.
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this TEL.
     * 
     * @param address The actual telephone number (voice or fax), e-mail address, or
 * other locator.
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the scheme value for this TEL.
     * 
     * @return scheme Identifies the protocol used to interpret the address string and
 * to access the resource so addressed.
 * 
 * For example, fax, mailto, telephone
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getScheme() {
        return scheme;
    }


    /**
     * Sets the scheme value for this TEL.
     * 
     * @param scheme Identifies the protocol used to interpret the address string and
 * to access the resource so addressed.
 * 
 * For example, fax, mailto, telephone
     */
    public void setScheme(gov.nih.nci.cabig.ccts.domain.cdt.CD scheme) {
        this.scheme = scheme;
    }


    /**
     * Gets the use value for this TEL.
     * 
     * @return use One or more codes advising a system or user which telecommunication
 * address in a set of like addresses to select for a given telecommunication
 * need.
     */
    public java.lang.String getUse() {
        return use;
    }


    /**
     * Sets the use value for this TEL.
     * 
     * @param use One or more codes advising a system or user which telecommunication
 * address in a set of like addresses to select for a given telecommunication
 * need.
     */
    public void setUse(java.lang.String use) {
        this.use = use;
    }


    /**
     * Gets the useablePeriod value for this TEL.
     * 
     * @return useablePeriod Specifies the periods of time during which the telecommunication
 * address can be used. For a telephone number, this can indicate the
 * time of day in which the party can be reached on that telephone. For
 * a web address, it may specify a time range in which the web content
 * is promised to be available under the given address.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.IVLTS getUseablePeriod() {
        return useablePeriod;
    }


    /**
     * Sets the useablePeriod value for this TEL.
     * 
     * @param useablePeriod Specifies the periods of time during which the telecommunication
 * address can be used. For a telephone number, this can indicate the
 * time of day in which the party can be reached on that telephone. For
 * a web address, it may specify a time range in which the web content
 * is promised to be available under the given address.
     */
    public void setUseablePeriod(gov.nih.nci.cabig.ccts.domain.cdt.IVLTS useablePeriod) {
        this.useablePeriod = useablePeriod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TEL)) return false;
        TEL other = (TEL) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.scheme==null && other.getScheme()==null) || 
             (this.scheme!=null &&
              this.scheme.equals(other.getScheme()))) &&
            ((this.use==null && other.getUse()==null) || 
             (this.use!=null &&
              this.use.equals(other.getUse()))) &&
            ((this.useablePeriod==null && other.getUseablePeriod()==null) || 
             (this.useablePeriod!=null &&
              this.useablePeriod.equals(other.getUseablePeriod())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getScheme() != null) {
            _hashCode += getScheme().hashCode();
        }
        if (getUse() != null) {
            _hashCode += getUse().hashCode();
        }
        if (getUseablePeriod() != null) {
            _hashCode += getUseablePeriod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TEL.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "TEL"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheme");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "scheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("use");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "use"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useablePeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "useablePeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "IVLTS"));
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
