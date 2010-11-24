/**
 * II.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.cdt;


/**
 * An identifier that uniquely identifies a thing or object. Examples
 * are object identifier for HL7 RIM objects, medical record number,
 * order id, service catalog item id, Vehicle Identification Number (VIN),
 * etc. 
 * 
 * For example: sponsor protocol number, site id, investigator id, subject
 * id, accession id, etc. 
 * 
 * NOTE: The assigningAuthorityName attribute is necessary to provide
 * a context on who set that id for the study id, investigator id, etc.
 * 
 * NOTE: Similar to InstanceIdentifier data type of HL7 v3.
 */
public class II  implements java.io.Serializable {
    /** A human readable name or mnemonic for the assigning authority.
 * The Assigning Authority Name has no computational value. The purpose
 * of a Assigning Authority Name is to assist an unaided human interpreter
 * of an II value to interpret the authority. 
 * 
 * For example, the name of the organization who issued the extension.
 * 
 * NOTE: No automated processing must depend on the assigning authority
 * name to be present in any form. */
    private java.lang.String assigningAuthorityName;
    /** Specifies if the identifier is intended for human display and data
 * entry (displayable = true) as opposed to pure machine interoperation
 * (displayable = false). */
    private boolean displayble;
    /** A character string as a unique identifier within the scope of the
 * identifier root. */
    private java.lang.String extension;
    /** An unique identifier that guarantees the global uniqueness of the
 * instance identifier. The root alone may be the entire instance identifier. */
    private java.lang.String root;

    public II() {
    }

    public II(
           java.lang.String assigningAuthorityName,
           boolean displayble,
           java.lang.String extension,
           java.lang.String root) {
           this.assigningAuthorityName = assigningAuthorityName;
           this.displayble = displayble;
           this.extension = extension;
           this.root = root;
    }


    /**
     * Gets the assigningAuthorityName value for this II.
     * 
     * @return assigningAuthorityName A human readable name or mnemonic for the assigning authority.
 * The Assigning Authority Name has no computational value. The purpose
 * of a Assigning Authority Name is to assist an unaided human interpreter
 * of an II value to interpret the authority. 
 * 
 * For example, the name of the organization who issued the extension.
 * 
 * NOTE: No automated processing must depend on the assigning authority
 * name to be present in any form.
     */
    public java.lang.String getAssigningAuthorityName() {
        return assigningAuthorityName;
    }


    /**
     * Sets the assigningAuthorityName value for this II.
     * 
     * @param assigningAuthorityName A human readable name or mnemonic for the assigning authority.
 * The Assigning Authority Name has no computational value. The purpose
 * of a Assigning Authority Name is to assist an unaided human interpreter
 * of an II value to interpret the authority. 
 * 
 * For example, the name of the organization who issued the extension.
 * 
 * NOTE: No automated processing must depend on the assigning authority
 * name to be present in any form.
     */
    public void setAssigningAuthorityName(java.lang.String assigningAuthorityName) {
        this.assigningAuthorityName = assigningAuthorityName;
    }


    /**
     * Gets the displayble value for this II.
     * 
     * @return displayble Specifies if the identifier is intended for human display and data
 * entry (displayable = true) as opposed to pure machine interoperation
 * (displayable = false).
     */
    public boolean isDisplayble() {
        return displayble;
    }


    /**
     * Sets the displayble value for this II.
     * 
     * @param displayble Specifies if the identifier is intended for human display and data
 * entry (displayable = true) as opposed to pure machine interoperation
 * (displayable = false).
     */
    public void setDisplayble(boolean displayble) {
        this.displayble = displayble;
    }


    /**
     * Gets the extension value for this II.
     * 
     * @return extension A character string as a unique identifier within the scope of the
 * identifier root.
     */
    public java.lang.String getExtension() {
        return extension;
    }


    /**
     * Sets the extension value for this II.
     * 
     * @param extension A character string as a unique identifier within the scope of the
 * identifier root.
     */
    public void setExtension(java.lang.String extension) {
        this.extension = extension;
    }


    /**
     * Gets the root value for this II.
     * 
     * @return root An unique identifier that guarantees the global uniqueness of the
 * instance identifier. The root alone may be the entire instance identifier.
     */
    public java.lang.String getRoot() {
        return root;
    }


    /**
     * Sets the root value for this II.
     * 
     * @param root An unique identifier that guarantees the global uniqueness of the
 * instance identifier. The root alone may be the entire instance identifier.
     */
    public void setRoot(java.lang.String root) {
        this.root = root;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof II)) return false;
        II other = (II) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assigningAuthorityName==null && other.getAssigningAuthorityName()==null) || 
             (this.assigningAuthorityName!=null &&
              this.assigningAuthorityName.equals(other.getAssigningAuthorityName()))) &&
            this.displayble == other.isDisplayble() &&
            ((this.extension==null && other.getExtension()==null) || 
             (this.extension!=null &&
              this.extension.equals(other.getExtension()))) &&
            ((this.root==null && other.getRoot()==null) || 
             (this.root!=null &&
              this.root.equals(other.getRoot())));
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
        if (getAssigningAuthorityName() != null) {
            _hashCode += getAssigningAuthorityName().hashCode();
        }
        _hashCode += (isDisplayble() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getExtension() != null) {
            _hashCode += getExtension().hashCode();
        }
        if (getRoot() != null) {
            _hashCode += getRoot().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(II.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "II"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigningAuthorityName");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "assigningAuthorityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayble");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "displayble"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extension");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "extension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("root");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "root"));
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
