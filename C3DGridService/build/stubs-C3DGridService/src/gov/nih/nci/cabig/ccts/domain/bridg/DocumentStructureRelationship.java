/**
 * DocumentStructureRelationship.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * Specifies the meaning (or semantics) of the relationship of one
 * piece of document  structure (or section) to another.
 */
public class DocumentStructureRelationship  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.DocumentStructure documentStructure;

    public DocumentStructureRelationship() {
    }

    public DocumentStructureRelationship(
           gov.nih.nci.cabig.ccts.domain.bridg.DocumentStructure documentStructure) {
           this.documentStructure = documentStructure;
    }


    /**
     * Gets the documentStructure value for this DocumentStructureRelationship.
     * 
     * @return documentStructure
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.DocumentStructure getDocumentStructure() {
        return documentStructure;
    }


    /**
     * Sets the documentStructure value for this DocumentStructureRelationship.
     * 
     * @param documentStructure
     */
    public void setDocumentStructure(gov.nih.nci.cabig.ccts.domain.bridg.DocumentStructure documentStructure) {
        this.documentStructure = documentStructure;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentStructureRelationship)) return false;
        DocumentStructureRelationship other = (DocumentStructureRelationship) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentStructure==null && other.getDocumentStructure()==null) || 
             (this.documentStructure!=null &&
              this.documentStructure.equals(other.getDocumentStructure())));
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
        if (getDocumentStructure() != null) {
            _hashCode += getDocumentStructure().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentStructureRelationship.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DocumentStructureRelationship"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentStructure");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DocumentStructure"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DocumentStructure"));
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
