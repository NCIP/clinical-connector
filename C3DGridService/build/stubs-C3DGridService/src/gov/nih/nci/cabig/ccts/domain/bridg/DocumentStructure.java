/**
 * DocumentStructure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * Syntactic structures that comprise a document.
 * 
 * For example, sections, subsections, paragraphs, subparagraphs, etc.
 */
public class DocumentStructure  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.DocumentStructureRelationship[] documentStructureRelationship;

    public DocumentStructure() {
    }

    public DocumentStructure(
           gov.nih.nci.cabig.ccts.domain.bridg.DocumentStructureRelationship[] documentStructureRelationship) {
           this.documentStructureRelationship = documentStructureRelationship;
    }


    /**
     * Gets the documentStructureRelationship value for this DocumentStructure.
     * 
     * @return documentStructureRelationship
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.DocumentStructureRelationship[] getDocumentStructureRelationship() {
        return documentStructureRelationship;
    }


    /**
     * Sets the documentStructureRelationship value for this DocumentStructure.
     * 
     * @param documentStructureRelationship
     */
    public void setDocumentStructureRelationship(gov.nih.nci.cabig.ccts.domain.bridg.DocumentStructureRelationship[] documentStructureRelationship) {
        this.documentStructureRelationship = documentStructureRelationship;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.DocumentStructureRelationship getDocumentStructureRelationship(int i) {
        return this.documentStructureRelationship[i];
    }

    public void setDocumentStructureRelationship(int i, gov.nih.nci.cabig.ccts.domain.bridg.DocumentStructureRelationship _value) {
        this.documentStructureRelationship[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentStructure)) return false;
        DocumentStructure other = (DocumentStructure) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentStructureRelationship==null && other.getDocumentStructureRelationship()==null) || 
             (this.documentStructureRelationship!=null &&
              java.util.Arrays.equals(this.documentStructureRelationship, other.getDocumentStructureRelationship())));
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
        if (getDocumentStructureRelationship() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentStructureRelationship());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentStructureRelationship(), i);
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
        new org.apache.axis.description.TypeDesc(DocumentStructure.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DocumentStructure"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentStructureRelationship");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DocumentStructureRelationship"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DocumentStructureRelationship"));
        elemField.setMinOccurs(0);
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
