/**
 * Laboratory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * An organization with the capability and competency to perform investigations
 * or evaluations.
 */
public class Laboratory  implements java.io.Serializable {
    /** The unique identifier for the laboratory.
 * 
 * For example, the Clinical Laboratory Improvement Act/Amendment (CLIA)
 * ID. */
    private gov.nih.nci.cabig.ccts.domain.cdt.II identifier;
    private gov.nih.nci.cabig.ccts.domain.bridg.Assessor[] assessor;

    public Laboratory() {
    }

    public Laboratory(
           gov.nih.nci.cabig.ccts.domain.bridg.Assessor[] assessor,
           gov.nih.nci.cabig.ccts.domain.cdt.II identifier) {
           this.identifier = identifier;
           this.assessor = assessor;
    }


    /**
     * Gets the identifier value for this Laboratory.
     * 
     * @return identifier The unique identifier for the laboratory.
 * 
 * For example, the Clinical Laboratory Improvement Act/Amendment (CLIA)
 * ID.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.II getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this Laboratory.
     * 
     * @param identifier The unique identifier for the laboratory.
 * 
 * For example, the Clinical Laboratory Improvement Act/Amendment (CLIA)
 * ID.
     */
    public void setIdentifier(gov.nih.nci.cabig.ccts.domain.cdt.II identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the assessor value for this Laboratory.
     * 
     * @return assessor
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.Assessor[] getAssessor() {
        return assessor;
    }


    /**
     * Sets the assessor value for this Laboratory.
     * 
     * @param assessor
     */
    public void setAssessor(gov.nih.nci.cabig.ccts.domain.bridg.Assessor[] assessor) {
        this.assessor = assessor;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.Assessor getAssessor(int i) {
        return this.assessor[i];
    }

    public void setAssessor(int i, gov.nih.nci.cabig.ccts.domain.bridg.Assessor _value) {
        this.assessor[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Laboratory)) return false;
        Laboratory other = (Laboratory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier()))) &&
            ((this.assessor==null && other.getAssessor()==null) || 
             (this.assessor!=null &&
              java.util.Arrays.equals(this.assessor, other.getAssessor())));
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
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        if (getAssessor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssessor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssessor(), i);
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
        new org.apache.axis.description.TypeDesc(Laboratory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Laboratory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "II"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assessor");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Assessor"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Assessor"));
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
