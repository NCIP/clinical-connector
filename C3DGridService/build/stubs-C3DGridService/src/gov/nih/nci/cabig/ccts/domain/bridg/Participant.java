/**
 * Participant.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * An individual who participates in a clinical trial, either as recipient
 * of the investigational product(s) or as a control.
 * 
 * For example, a participant can include a patient in an interventional
 * Clinical Trial (CT), however in Quality of LIfe (QOL) trials the people
 * in the trial are not receiving health care, but are participating
 * in the observational study.  
 * 
 * NOTE: Participant is a role not a participation, and is similar to
 * the notion of a patient. This includes potential patients to a clinical
 * trial.
 */
public class Participant  implements java.io.Serializable {
    /** Specifies whether the patient, or the patient's legally acceptable
 * representative, provided written authorization to allow the use and
 * disclosure of their protected health information. */
    private gov.nih.nci.cabig.ccts.domain.cdt.BL confidentialityIndicator;
    /** Unique identifier for a participant.
 * 
 * For example, medical record number. 
 * 
 * NOTE: This is different from the StudySubject.identifier. */
    private gov.nih.nci.cabig.ccts.domain.cdt.II[] identifier;
    /** The primary payer/insurance carrier information at the time of
 * treatment on a protocol. 
 * 
 * For example, Private Insurance, Medicare, Medicare And Private Insurance,
 * Medicaid, etc. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD paymentMethod;
    private gov.nih.nci.cabig.ccts.domain.bridg.Assessor[] assessor;
    private gov.nih.nci.cabig.ccts.domain.bridg.Person person;

    public Participant() {
    }

    public Participant(
           gov.nih.nci.cabig.ccts.domain.bridg.Assessor[] assessor,
           gov.nih.nci.cabig.ccts.domain.cdt.BL confidentialityIndicator,
           gov.nih.nci.cabig.ccts.domain.cdt.II[] identifier,
           gov.nih.nci.cabig.ccts.domain.cdt.CD paymentMethod,
           gov.nih.nci.cabig.ccts.domain.bridg.Person person) {
           this.confidentialityIndicator = confidentialityIndicator;
           this.identifier = identifier;
           this.paymentMethod = paymentMethod;
           this.assessor = assessor;
           this.person = person;
    }


    /**
     * Gets the confidentialityIndicator value for this Participant.
     * 
     * @return confidentialityIndicator Specifies whether the patient, or the patient's legally acceptable
 * representative, provided written authorization to allow the use and
 * disclosure of their protected health information.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.BL getConfidentialityIndicator() {
        return confidentialityIndicator;
    }


    /**
     * Sets the confidentialityIndicator value for this Participant.
     * 
     * @param confidentialityIndicator Specifies whether the patient, or the patient's legally acceptable
 * representative, provided written authorization to allow the use and
 * disclosure of their protected health information.
     */
    public void setConfidentialityIndicator(gov.nih.nci.cabig.ccts.domain.cdt.BL confidentialityIndicator) {
        this.confidentialityIndicator = confidentialityIndicator;
    }


    /**
     * Gets the identifier value for this Participant.
     * 
     * @return identifier Unique identifier for a participant.
 * 
 * For example, medical record number. 
 * 
 * NOTE: This is different from the StudySubject.identifier.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.II[] getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this Participant.
     * 
     * @param identifier Unique identifier for a participant.
 * 
 * For example, medical record number. 
 * 
 * NOTE: This is different from the StudySubject.identifier.
     */
    public void setIdentifier(gov.nih.nci.cabig.ccts.domain.cdt.II[] identifier) {
        this.identifier = identifier;
    }

    public gov.nih.nci.cabig.ccts.domain.cdt.II getIdentifier(int i) {
        return this.identifier[i];
    }

    public void setIdentifier(int i, gov.nih.nci.cabig.ccts.domain.cdt.II _value) {
        this.identifier[i] = _value;
    }


    /**
     * Gets the paymentMethod value for this Participant.
     * 
     * @return paymentMethod The primary payer/insurance carrier information at the time of
 * treatment on a protocol. 
 * 
 * For example, Private Insurance, Medicare, Medicare And Private Insurance,
 * Medicaid, etc.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this Participant.
     * 
     * @param paymentMethod The primary payer/insurance carrier information at the time of
 * treatment on a protocol. 
 * 
 * For example, Private Insurance, Medicare, Medicare And Private Insurance,
 * Medicaid, etc.
     */
    public void setPaymentMethod(gov.nih.nci.cabig.ccts.domain.cdt.CD paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the assessor value for this Participant.
     * 
     * @return assessor
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.Assessor[] getAssessor() {
        return assessor;
    }


    /**
     * Sets the assessor value for this Participant.
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


    /**
     * Gets the person value for this Participant.
     * 
     * @return person
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.Person getPerson() {
        return person;
    }


    /**
     * Sets the person value for this Participant.
     * 
     * @param person
     */
    public void setPerson(gov.nih.nci.cabig.ccts.domain.bridg.Person person) {
        this.person = person;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Participant)) return false;
        Participant other = (Participant) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.confidentialityIndicator==null && other.getConfidentialityIndicator()==null) || 
             (this.confidentialityIndicator!=null &&
              this.confidentialityIndicator.equals(other.getConfidentialityIndicator()))) &&
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              java.util.Arrays.equals(this.identifier, other.getIdentifier()))) &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              this.paymentMethod.equals(other.getPaymentMethod()))) &&
            ((this.assessor==null && other.getAssessor()==null) || 
             (this.assessor!=null &&
              java.util.Arrays.equals(this.assessor, other.getAssessor()))) &&
            ((this.person==null && other.getPerson()==null) || 
             (this.person!=null &&
              this.person.equals(other.getPerson())));
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
        if (getConfidentialityIndicator() != null) {
            _hashCode += getConfidentialityIndicator().hashCode();
        }
        if (getIdentifier() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIdentifier());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIdentifier(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentMethod() != null) {
            _hashCode += getPaymentMethod().hashCode();
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
        if (getPerson() != null) {
            _hashCode += getPerson().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Participant.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Participant"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confidentialityIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "confidentialityIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "BL"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "II"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "paymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assessor");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Assessor"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Assessor"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("person");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Person"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Person"));
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
