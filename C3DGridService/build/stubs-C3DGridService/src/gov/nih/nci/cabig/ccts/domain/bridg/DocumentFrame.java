/**
 * DocumentFrame.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * The ID, name, type, attribution, etc. information necessary to
 * manage the document in a document repository.
 */
public class DocumentFrame  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.DocumentStructure[] documentStructure;

    public DocumentFrame() {
    }

    public DocumentFrame(
           gov.nih.nci.cabig.ccts.domain.bridg.DocumentStructure[] documentStructure) {
           this.documentStructure = documentStructure;
    }


    /**
     * Gets the documentStructure value for this DocumentFrame.
     * 
     * @return documentStructure
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.DocumentStructure[] getDocumentStructure() {
        return documentStructure;
    }


    /**
     * Sets the documentStructure value for this DocumentFrame.
     * 
     * @param documentStructure
     */
    public void setDocumentStructure(gov.nih.nci.cabig.ccts.domain.bridg.DocumentStructure[] documentStructure) {
        this.documentStructure = documentStructure;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.DocumentStructure getDocumentStructure(int i) {
        return this.documentStructure[i];
    }

    public void setDocumentStructure(int i, gov.nih.nci.cabig.ccts.domain.bridg.DocumentStructure _value) {
        this.documentStructure[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentFrame)) return false;
        DocumentFrame other = (DocumentFrame) obj;
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
              java.util.Arrays.equals(this.documentStructure, other.getDocumentStructure())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentStructure());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentStructure(), i);
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
        new org.apache.axis.description.TypeDesc(DocumentFrame.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DocumentFrame"));
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
