/**
 * CD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.cdt;


/**
 * Represents any kind of concept usually by giving a code defined
 * in a code system. A concept descriptor can contain the original text
 * or phrase that served as the basis of the coding and one or more translations
 * into different coding systems. A concept descriptor can also contain
 * qualifiers to describe, e.g., the concept of a "left foot" as a post
 * coordinated term built from the primary code "FOOT" and the qualifier
 * "LEFT". In cases of an exceptional value, the concept descriptor need
 * not contain a code but only the original text describing that concept.
 * [HL7]
 */
public class CD  implements java.io.Serializable {
    /** The plain code symbol defined by the code system. 
 * 
 * For example, "784.0" is the code symbol of the ICD-9 code "784.0"
 * for headache. */
    private java.lang.String code;
    /** The codeSystem specifying the system of concepts that defines the
 * code. */
    private java.lang.String codeSystem;
    /** The common name of the coding system. */
    private java.lang.String codeSystemName;
    /** If applicable, a version descriptor defined specifically for the
 * given code system. */
    private java.lang.String codeSystemVersion;
    /** The standardized text associated with a code (i.e., decode) */
    private java.lang.String displayName;
    /** The text or phrase used as the basis of coding. */
    private java.lang.String originalText;
    /** Contains the value of the modified text when the original text
 * is modified for coding purposes.  
 * 
 * For example, spelling corrections, dropping of extraneous information,
 * splitting of compound verbatims like "nausea and vomiting" into separate
 * concepts when the coding scheme doesn't have a single code for the
 * text. */
    private java.lang.String qualifier;
    /** When going from one coding system to another.  need formal definition
 * here. */
    private java.lang.String translation;

    public CD() {
    }

    public CD(
           java.lang.String code,
           java.lang.String codeSystem,
           java.lang.String codeSystemName,
           java.lang.String codeSystemVersion,
           java.lang.String displayName,
           java.lang.String originalText,
           java.lang.String qualifier,
           java.lang.String translation) {
           this.code = code;
           this.codeSystem = codeSystem;
           this.codeSystemName = codeSystemName;
           this.codeSystemVersion = codeSystemVersion;
           this.displayName = displayName;
           this.originalText = originalText;
           this.qualifier = qualifier;
           this.translation = translation;
    }


    /**
     * Gets the code value for this CD.
     * 
     * @return code The plain code symbol defined by the code system. 
 * 
 * For example, "784.0" is the code symbol of the ICD-9 code "784.0"
 * for headache.
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this CD.
     * 
     * @param code The plain code symbol defined by the code system. 
 * 
 * For example, "784.0" is the code symbol of the ICD-9 code "784.0"
 * for headache.
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the codeSystem value for this CD.
     * 
     * @return codeSystem The codeSystem specifying the system of concepts that defines the
 * code.
     */
    public java.lang.String getCodeSystem() {
        return codeSystem;
    }


    /**
     * Sets the codeSystem value for this CD.
     * 
     * @param codeSystem The codeSystem specifying the system of concepts that defines the
 * code.
     */
    public void setCodeSystem(java.lang.String codeSystem) {
        this.codeSystem = codeSystem;
    }


    /**
     * Gets the codeSystemName value for this CD.
     * 
     * @return codeSystemName The common name of the coding system.
     */
    public java.lang.String getCodeSystemName() {
        return codeSystemName;
    }


    /**
     * Sets the codeSystemName value for this CD.
     * 
     * @param codeSystemName The common name of the coding system.
     */
    public void setCodeSystemName(java.lang.String codeSystemName) {
        this.codeSystemName = codeSystemName;
    }


    /**
     * Gets the codeSystemVersion value for this CD.
     * 
     * @return codeSystemVersion If applicable, a version descriptor defined specifically for the
 * given code system.
     */
    public java.lang.String getCodeSystemVersion() {
        return codeSystemVersion;
    }


    /**
     * Sets the codeSystemVersion value for this CD.
     * 
     * @param codeSystemVersion If applicable, a version descriptor defined specifically for the
 * given code system.
     */
    public void setCodeSystemVersion(java.lang.String codeSystemVersion) {
        this.codeSystemVersion = codeSystemVersion;
    }


    /**
     * Gets the displayName value for this CD.
     * 
     * @return displayName The standardized text associated with a code (i.e., decode)
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this CD.
     * 
     * @param displayName The standardized text associated with a code (i.e., decode)
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the originalText value for this CD.
     * 
     * @return originalText The text or phrase used as the basis of coding.
     */
    public java.lang.String getOriginalText() {
        return originalText;
    }


    /**
     * Sets the originalText value for this CD.
     * 
     * @param originalText The text or phrase used as the basis of coding.
     */
    public void setOriginalText(java.lang.String originalText) {
        this.originalText = originalText;
    }


    /**
     * Gets the qualifier value for this CD.
     * 
     * @return qualifier Contains the value of the modified text when the original text
 * is modified for coding purposes.  
 * 
 * For example, spelling corrections, dropping of extraneous information,
 * splitting of compound verbatims like "nausea and vomiting" into separate
 * concepts when the coding scheme doesn't have a single code for the
 * text.
     */
    public java.lang.String getQualifier() {
        return qualifier;
    }


    /**
     * Sets the qualifier value for this CD.
     * 
     * @param qualifier Contains the value of the modified text when the original text
 * is modified for coding purposes.  
 * 
 * For example, spelling corrections, dropping of extraneous information,
 * splitting of compound verbatims like "nausea and vomiting" into separate
 * concepts when the coding scheme doesn't have a single code for the
 * text.
     */
    public void setQualifier(java.lang.String qualifier) {
        this.qualifier = qualifier;
    }


    /**
     * Gets the translation value for this CD.
     * 
     * @return translation When going from one coding system to another.  need formal definition
 * here.
     */
    public java.lang.String getTranslation() {
        return translation;
    }


    /**
     * Sets the translation value for this CD.
     * 
     * @param translation When going from one coding system to another.  need formal definition
 * here.
     */
    public void setTranslation(java.lang.String translation) {
        this.translation = translation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CD)) return false;
        CD other = (CD) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.codeSystem==null && other.getCodeSystem()==null) || 
             (this.codeSystem!=null &&
              this.codeSystem.equals(other.getCodeSystem()))) &&
            ((this.codeSystemName==null && other.getCodeSystemName()==null) || 
             (this.codeSystemName!=null &&
              this.codeSystemName.equals(other.getCodeSystemName()))) &&
            ((this.codeSystemVersion==null && other.getCodeSystemVersion()==null) || 
             (this.codeSystemVersion!=null &&
              this.codeSystemVersion.equals(other.getCodeSystemVersion()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.originalText==null && other.getOriginalText()==null) || 
             (this.originalText!=null &&
              this.originalText.equals(other.getOriginalText()))) &&
            ((this.qualifier==null && other.getQualifier()==null) || 
             (this.qualifier!=null &&
              this.qualifier.equals(other.getQualifier()))) &&
            ((this.translation==null && other.getTranslation()==null) || 
             (this.translation!=null &&
              this.translation.equals(other.getTranslation())));
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
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getCodeSystem() != null) {
            _hashCode += getCodeSystem().hashCode();
        }
        if (getCodeSystemName() != null) {
            _hashCode += getCodeSystemName().hashCode();
        }
        if (getCodeSystemVersion() != null) {
            _hashCode += getCodeSystemVersion().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getOriginalText() != null) {
            _hashCode += getOriginalText().hashCode();
        }
        if (getQualifier() != null) {
            _hashCode += getQualifier().hashCode();
        }
        if (getTranslation() != null) {
            _hashCode += getTranslation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "codeSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeSystemName");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "codeSystemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeSystemVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "codeSystemVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalText");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "originalText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualifier");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "qualifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("translation");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "translation"));
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
