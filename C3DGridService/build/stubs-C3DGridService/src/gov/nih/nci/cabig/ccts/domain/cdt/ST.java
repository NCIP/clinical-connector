/**
 * ST.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.cdt;


/**
 * The character string data type stands for text data, primarily
 * intended for machine processing (e.g., sorting, querying, indexing,
 * etc.) Used for names, symbols, and formal expressions.
 */
public class ST  implements java.io.Serializable {
    /** For character-based encoding types, this property specifies the
 * character set and character encoding used. The charset shall be identified
 * by an Internet Assigned Numbers Authority (IANA) Charset Registration
 * [http://www.iana.org/assignments/character-sets] in accordance with
 * RFC 2978 [http://www.ietf.org/rfc/rfc2978.txt]. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD characterSet;
    /** For character based information the language property specifies
 * the human language of the text. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD language;
    /** The actual text that forms the character string. */
    private java.lang.String value;

    public ST() {
    }

    public ST(
           gov.nih.nci.cabig.ccts.domain.cdt.CD characterSet,
           gov.nih.nci.cabig.ccts.domain.cdt.CD language,
           java.lang.String value) {
           this.characterSet = characterSet;
           this.language = language;
           this.value = value;
    }


    /**
     * Gets the characterSet value for this ST.
     * 
     * @return characterSet For character-based encoding types, this property specifies the
 * character set and character encoding used. The charset shall be identified
 * by an Internet Assigned Numbers Authority (IANA) Charset Registration
 * [http://www.iana.org/assignments/character-sets] in accordance with
 * RFC 2978 [http://www.ietf.org/rfc/rfc2978.txt].
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getCharacterSet() {
        return characterSet;
    }


    /**
     * Sets the characterSet value for this ST.
     * 
     * @param characterSet For character-based encoding types, this property specifies the
 * character set and character encoding used. The charset shall be identified
 * by an Internet Assigned Numbers Authority (IANA) Charset Registration
 * [http://www.iana.org/assignments/character-sets] in accordance with
 * RFC 2978 [http://www.ietf.org/rfc/rfc2978.txt].
     */
    public void setCharacterSet(gov.nih.nci.cabig.ccts.domain.cdt.CD characterSet) {
        this.characterSet = characterSet;
    }


    /**
     * Gets the language value for this ST.
     * 
     * @return language For character based information the language property specifies
 * the human language of the text.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this ST.
     * 
     * @param language For character based information the language property specifies
 * the human language of the text.
     */
    public void setLanguage(gov.nih.nci.cabig.ccts.domain.cdt.CD language) {
        this.language = language;
    }


    /**
     * Gets the value value for this ST.
     * 
     * @return value The actual text that forms the character string.
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this ST.
     * 
     * @param value The actual text that forms the character string.
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ST)) return false;
        ST other = (ST) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.characterSet==null && other.getCharacterSet()==null) || 
             (this.characterSet!=null &&
              this.characterSet.equals(other.getCharacterSet()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
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
        if (getCharacterSet() != null) {
            _hashCode += getCharacterSet().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ST.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("characterSet");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "characterSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
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
