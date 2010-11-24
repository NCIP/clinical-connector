/**
 * AssociatedPerson.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A human being connected/linked to a Participant.
 * 
 * For example, family member, roommate, nursing home attendant, etc.
 */
public class AssociatedPerson  implements java.io.Serializable {
    /** Identifies the kind of connection/link to the Participant.
 * 
 * For example, family member, roommate, guardian, nursing home attendant,
 * etc. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD type;
    private gov.nih.nci.cabig.ccts.domain.bridg.Assessor[] assessor;

    public AssociatedPerson() {
    }

    public AssociatedPerson(
           gov.nih.nci.cabig.ccts.domain.bridg.Assessor[] assessor,
           gov.nih.nci.cabig.ccts.domain.cdt.CD type) {
           this.type = type;
           this.assessor = assessor;
    }


    /**
     * Gets the type value for this AssociatedPerson.
     * 
     * @return type Identifies the kind of connection/link to the Participant.
 * 
 * For example, family member, roommate, guardian, nursing home attendant,
 * etc.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getType() {
        return type;
    }


    /**
     * Sets the type value for this AssociatedPerson.
     * 
     * @param type Identifies the kind of connection/link to the Participant.
 * 
 * For example, family member, roommate, guardian, nursing home attendant,
 * etc.
     */
    public void setType(gov.nih.nci.cabig.ccts.domain.cdt.CD type) {
        this.type = type;
    }


    /**
     * Gets the assessor value for this AssociatedPerson.
     * 
     * @return assessor
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.Assessor[] getAssessor() {
        return assessor;
    }


    /**
     * Sets the assessor value for this AssociatedPerson.
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
        if (!(obj instanceof AssociatedPerson)) return false;
        AssociatedPerson other = (AssociatedPerson) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
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
        new org.apache.axis.description.TypeDesc(AssociatedPerson.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "AssociatedPerson"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assessor");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Assessor"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Assessor"));
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
