/**
 * DocumentContent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * Specific data (structured, non-structured, coded, non-coded, standardized,
 * non-standardized) that forms the content of the document.
 */
public class DocumentContent  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.DocumentStructure documentStructure;
    private gov.nih.nci.cabig.ccts.domain.bridg.Activity[] activity;

    public DocumentContent() {
    }

    public DocumentContent(
           gov.nih.nci.cabig.ccts.domain.bridg.Activity[] activity,
           gov.nih.nci.cabig.ccts.domain.bridg.DocumentStructure documentStructure) {
           this.documentStructure = documentStructure;
           this.activity = activity;
    }


    /**
     * Gets the documentStructure value for this DocumentContent.
     * 
     * @return documentStructure
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.DocumentStructure getDocumentStructure() {
        return documentStructure;
    }


    /**
     * Sets the documentStructure value for this DocumentContent.
     * 
     * @param documentStructure
     */
    public void setDocumentStructure(gov.nih.nci.cabig.ccts.domain.bridg.DocumentStructure documentStructure) {
        this.documentStructure = documentStructure;
    }


    /**
     * Gets the activity value for this DocumentContent.
     * 
     * @return activity
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.Activity[] getActivity() {
        return activity;
    }


    /**
     * Sets the activity value for this DocumentContent.
     * 
     * @param activity
     */
    public void setActivity(gov.nih.nci.cabig.ccts.domain.bridg.Activity[] activity) {
        this.activity = activity;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.Activity getActivity(int i) {
        return this.activity[i];
    }

    public void setActivity(int i, gov.nih.nci.cabig.ccts.domain.bridg.Activity _value) {
        this.activity[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentContent)) return false;
        DocumentContent other = (DocumentContent) obj;
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
              this.documentStructure.equals(other.getDocumentStructure()))) &&
            ((this.activity==null && other.getActivity()==null) || 
             (this.activity!=null &&
              java.util.Arrays.equals(this.activity, other.getActivity())));
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
        if (getActivity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActivity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActivity(), i);
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
        new org.apache.axis.description.TypeDesc(DocumentContent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DocumentContent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentStructure");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DocumentStructure"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DocumentStructure"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activity");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Activity"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Activity"));
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
