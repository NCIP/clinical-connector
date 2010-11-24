/**
 * ClinicalResearchStaff.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * Individuals who are employed and/or involved in any aspect of clinical
 * research.
 * 
 * For example, administrators, clinical and data managers, clinical
 * research pharmacists, clinical research associates, clinical trials
 * compliance coordinators, clinical trials specialists, laboratory technologists,
 * nurses, research services consultants, study coordinators and others.
 */
public class ClinicalResearchStaff  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.DocumentAuthor[] documentAuthor;

    public ClinicalResearchStaff() {
    }

    public ClinicalResearchStaff(
           gov.nih.nci.cabig.ccts.domain.bridg.DocumentAuthor[] documentAuthor) {
           this.documentAuthor = documentAuthor;
    }


    /**
     * Gets the documentAuthor value for this ClinicalResearchStaff.
     * 
     * @return documentAuthor
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.DocumentAuthor[] getDocumentAuthor() {
        return documentAuthor;
    }


    /**
     * Sets the documentAuthor value for this ClinicalResearchStaff.
     * 
     * @param documentAuthor
     */
    public void setDocumentAuthor(gov.nih.nci.cabig.ccts.domain.bridg.DocumentAuthor[] documentAuthor) {
        this.documentAuthor = documentAuthor;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.DocumentAuthor getDocumentAuthor(int i) {
        return this.documentAuthor[i];
    }

    public void setDocumentAuthor(int i, gov.nih.nci.cabig.ccts.domain.bridg.DocumentAuthor _value) {
        this.documentAuthor[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClinicalResearchStaff)) return false;
        ClinicalResearchStaff other = (ClinicalResearchStaff) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentAuthor==null && other.getDocumentAuthor()==null) || 
             (this.documentAuthor!=null &&
              java.util.Arrays.equals(this.documentAuthor, other.getDocumentAuthor())));
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
        if (getDocumentAuthor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentAuthor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentAuthor(), i);
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
        new org.apache.axis.description.TypeDesc(ClinicalResearchStaff.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ClinicalResearchStaff"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentAuthor");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DocumentAuthor"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DocumentAuthor"));
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
