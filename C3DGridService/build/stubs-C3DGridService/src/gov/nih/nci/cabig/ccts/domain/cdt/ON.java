/**
 * ON.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.cdt;


/**
 * A name for an organization. A sequence of name parts, such as value
 * (main name), prefix, suffix, and delimiter. Examples for organization
 * name values are "National Cancer Institute", "Acme Pharmaceuticals,
 * Ltd." and "Health Level Seven, Inc." An organization name may be as
 * simple as a character string or may consist of several entity name
 * parts, such as " Acme Pharmaceuticals" and "Ltd.".
 */
public class ON  implements java.io.Serializable {
    /** A delimiter has no meaning other than being literally printed in
 * this name representation. A delimiter has no implicit leading and
 * trailing white space.
 * 
 * For example, ", ". */
    private java.lang.String delimiter;
    /** A prefix has a strong association to the immediately following
 * name part. A prefix has no implicit trailing white space (it has implicit
 * leading white space though). Note that prefixes can be inverted.
 * 
 * For example, "Dr.", "Mr.", or "Ms." */
    private java.lang.String prefix;
    /** A suffix has a strong association to the immediately preceding
 * name part. A prefix has no implicit leading white space (it has implicit
 * trailing white space though). Suffices can not be inverted.
 * 
 * For example, "Jr.", MD.", or "Phd.". */
    private java.lang.String suffix;
    /** A set of codes advising a system or user which name in a set of
 * names to select for a given purpose. */
    private java.lang.String use;
    /** An interval of time specifying the time during which the name is
 * or was used for the entity. This accommodates the fact that people
 * change names for people, places and things. */
    private gov.nih.nci.cabig.ccts.domain.cdt.IVLTS validTime;
    /** The simple text string that is the name of the entity.
 * 
 * For example, "National Cancer Institute", "Acme Pharmaceuticals, Inc.",
 * or "Dr. John Smith, MD". */
    private java.lang.String value;

    public ON() {
    }

    public ON(
           java.lang.String delimiter,
           java.lang.String prefix,
           java.lang.String suffix,
           java.lang.String use,
           gov.nih.nci.cabig.ccts.domain.cdt.IVLTS validTime,
           java.lang.String value) {
           this.delimiter = delimiter;
           this.prefix = prefix;
           this.suffix = suffix;
           this.use = use;
           this.validTime = validTime;
           this.value = value;
    }


    /**
     * Gets the delimiter value for this ON.
     * 
     * @return delimiter A delimiter has no meaning other than being literally printed in
 * this name representation. A delimiter has no implicit leading and
 * trailing white space.
 * 
 * For example, ", ".
     */
    public java.lang.String getDelimiter() {
        return delimiter;
    }


    /**
     * Sets the delimiter value for this ON.
     * 
     * @param delimiter A delimiter has no meaning other than being literally printed in
 * this name representation. A delimiter has no implicit leading and
 * trailing white space.
 * 
 * For example, ", ".
     */
    public void setDelimiter(java.lang.String delimiter) {
        this.delimiter = delimiter;
    }


    /**
     * Gets the prefix value for this ON.
     * 
     * @return prefix A prefix has a strong association to the immediately following
 * name part. A prefix has no implicit trailing white space (it has implicit
 * leading white space though). Note that prefixes can be inverted.
 * 
 * For example, "Dr.", "Mr.", or "Ms."
     */
    public java.lang.String getPrefix() {
        return prefix;
    }


    /**
     * Sets the prefix value for this ON.
     * 
     * @param prefix A prefix has a strong association to the immediately following
 * name part. A prefix has no implicit trailing white space (it has implicit
 * leading white space though). Note that prefixes can be inverted.
 * 
 * For example, "Dr.", "Mr.", or "Ms."
     */
    public void setPrefix(java.lang.String prefix) {
        this.prefix = prefix;
    }


    /**
     * Gets the suffix value for this ON.
     * 
     * @return suffix A suffix has a strong association to the immediately preceding
 * name part. A prefix has no implicit leading white space (it has implicit
 * trailing white space though). Suffices can not be inverted.
 * 
 * For example, "Jr.", MD.", or "Phd.".
     */
    public java.lang.String getSuffix() {
        return suffix;
    }


    /**
     * Sets the suffix value for this ON.
     * 
     * @param suffix A suffix has a strong association to the immediately preceding
 * name part. A prefix has no implicit leading white space (it has implicit
 * trailing white space though). Suffices can not be inverted.
 * 
 * For example, "Jr.", MD.", or "Phd.".
     */
    public void setSuffix(java.lang.String suffix) {
        this.suffix = suffix;
    }


    /**
     * Gets the use value for this ON.
     * 
     * @return use A set of codes advising a system or user which name in a set of
 * names to select for a given purpose.
     */
    public java.lang.String getUse() {
        return use;
    }


    /**
     * Sets the use value for this ON.
     * 
     * @param use A set of codes advising a system or user which name in a set of
 * names to select for a given purpose.
     */
    public void setUse(java.lang.String use) {
        this.use = use;
    }


    /**
     * Gets the validTime value for this ON.
     * 
     * @return validTime An interval of time specifying the time during which the name is
 * or was used for the entity. This accommodates the fact that people
 * change names for people, places and things.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.IVLTS getValidTime() {
        return validTime;
    }


    /**
     * Sets the validTime value for this ON.
     * 
     * @param validTime An interval of time specifying the time during which the name is
 * or was used for the entity. This accommodates the fact that people
 * change names for people, places and things.
     */
    public void setValidTime(gov.nih.nci.cabig.ccts.domain.cdt.IVLTS validTime) {
        this.validTime = validTime;
    }


    /**
     * Gets the value value for this ON.
     * 
     * @return value The simple text string that is the name of the entity.
 * 
 * For example, "National Cancer Institute", "Acme Pharmaceuticals, Inc.",
 * or "Dr. John Smith, MD".
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this ON.
     * 
     * @param value The simple text string that is the name of the entity.
 * 
 * For example, "National Cancer Institute", "Acme Pharmaceuticals, Inc.",
 * or "Dr. John Smith, MD".
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ON)) return false;
        ON other = (ON) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.delimiter==null && other.getDelimiter()==null) || 
             (this.delimiter!=null &&
              this.delimiter.equals(other.getDelimiter()))) &&
            ((this.prefix==null && other.getPrefix()==null) || 
             (this.prefix!=null &&
              this.prefix.equals(other.getPrefix()))) &&
            ((this.suffix==null && other.getSuffix()==null) || 
             (this.suffix!=null &&
              this.suffix.equals(other.getSuffix()))) &&
            ((this.use==null && other.getUse()==null) || 
             (this.use!=null &&
              this.use.equals(other.getUse()))) &&
            ((this.validTime==null && other.getValidTime()==null) || 
             (this.validTime!=null &&
              this.validTime.equals(other.getValidTime()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getDelimiter() != null) {
            _hashCode += getDelimiter().hashCode();
        }
        if (getPrefix() != null) {
            _hashCode += getPrefix().hashCode();
        }
        if (getSuffix() != null) {
            _hashCode += getSuffix().hashCode();
        }
        if (getUse() != null) {
            _hashCode += getUse().hashCode();
        }
        if (getValidTime() != null) {
            _hashCode += getValidTime().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ON.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ON"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delimiter");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "delimiter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suffix");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "suffix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("use");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "use"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validTime");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "validTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "IVLTS"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
