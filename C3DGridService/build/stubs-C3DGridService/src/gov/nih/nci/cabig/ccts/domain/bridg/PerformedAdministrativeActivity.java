/**
 * PerformedAdministrativeActivity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * The completed activity within the context of a given study that
 * is not directly related to the study’s overarching hypothesis evaluation
 * or testing, but is nonetheless essential to the efficient and/or effective
 * coordination and execution of the study.
 * 
 * For example, assignment to a treatment arm, registration to a study,
 * start of on-study period, end of on-study period, obtain informed
 * consent, verify eligibility criteria, enroll, randomize, complete
 * study visits, exit trial, break treatment blind, protocol violation,
 * premature withdrawal, etc.
 */
public class PerformedAdministrativeActivity  extends gov.nih.nci.cabig.ccts.domain.bridg.PerformedActivity  implements java.io.Serializable {
    /** A free text and coded representation of the PerformedAdministrativeActivity.
 * 
 * NOTE: This is the class-specific analog of SubstanceAdministration.treatment.
 * BRIDG THC anticipates renaming this attribute to be more specific
 * for an AdministrativeActivity.
 * 
 * NOTE: Because this is of datatype CD, it contains both a coded and
 * textual representation of the name of the PerformedAdministrativeActivity. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD name;
    /** The text string describing why a given milestone is not associated
 * with a research subject as expected. Variances can be caused by actions
 * on the part of either the research subject themselves or another role
 * involved with the study.  
 * 
 * For example, from the perspective of the research subject, a participant
 * in the study dies before completion of the study and is therefore
 * OffStudy. 
 * 
 * For example, a participant may be assigned to the study in spite of
 * the fact that they do not fully meet the study's required inclusion
 * criteria. In this case, the variance is often referred to as Study
 * Eligibility Waiver.
 * 
 * 
 * For example, the reason that a subject is given a sponsor-approved
 * waiver for meeting protocol-defined eligibility requirements.
 * 
 * NOTE: If there is an exception to a planned milestone this is the
 * reason for exception. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST varianceReason;
    private gov.nih.nci.cabig.ccts.domain.bridg.StudySite studySite;

    public PerformedAdministrativeActivity() {
    }

    public PerformedAdministrativeActivity(
           gov.nih.nci.cabig.ccts.domain.cdt.CD name,
           gov.nih.nci.cabig.ccts.domain.bridg.StudySite studySite,
           gov.nih.nci.cabig.ccts.domain.cdt.ST varianceReason) {
           this.name = name;
           this.varianceReason = varianceReason;
           this.studySite = studySite;
    }


    /**
     * Gets the name value for this PerformedAdministrativeActivity.
     * 
     * @return name A free text and coded representation of the PerformedAdministrativeActivity.
 * 
 * NOTE: This is the class-specific analog of SubstanceAdministration.treatment.
 * BRIDG THC anticipates renaming this attribute to be more specific
 * for an AdministrativeActivity.
 * 
 * NOTE: Because this is of datatype CD, it contains both a coded and
 * textual representation of the name of the PerformedAdministrativeActivity.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getName() {
        return name;
    }


    /**
     * Sets the name value for this PerformedAdministrativeActivity.
     * 
     * @param name A free text and coded representation of the PerformedAdministrativeActivity.
 * 
 * NOTE: This is the class-specific analog of SubstanceAdministration.treatment.
 * BRIDG THC anticipates renaming this attribute to be more specific
 * for an AdministrativeActivity.
 * 
 * NOTE: Because this is of datatype CD, it contains both a coded and
 * textual representation of the name of the PerformedAdministrativeActivity.
     */
    public void setName(gov.nih.nci.cabig.ccts.domain.cdt.CD name) {
        this.name = name;
    }


    /**
     * Gets the varianceReason value for this PerformedAdministrativeActivity.
     * 
     * @return varianceReason The text string describing why a given milestone is not associated
 * with a research subject as expected. Variances can be caused by actions
 * on the part of either the research subject themselves or another role
 * involved with the study.  
 * 
 * For example, from the perspective of the research subject, a participant
 * in the study dies before completion of the study and is therefore
 * OffStudy. 
 * 
 * For example, a participant may be assigned to the study in spite of
 * the fact that they do not fully meet the study's required inclusion
 * criteria. In this case, the variance is often referred to as Study
 * Eligibility Waiver.
 * 
 * 
 * For example, the reason that a subject is given a sponsor-approved
 * waiver for meeting protocol-defined eligibility requirements.
 * 
 * NOTE: If there is an exception to a planned milestone this is the
 * reason for exception.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getVarianceReason() {
        return varianceReason;
    }


    /**
     * Sets the varianceReason value for this PerformedAdministrativeActivity.
     * 
     * @param varianceReason The text string describing why a given milestone is not associated
 * with a research subject as expected. Variances can be caused by actions
 * on the part of either the research subject themselves or another role
 * involved with the study.  
 * 
 * For example, from the perspective of the research subject, a participant
 * in the study dies before completion of the study and is therefore
 * OffStudy. 
 * 
 * For example, a participant may be assigned to the study in spite of
 * the fact that they do not fully meet the study's required inclusion
 * criteria. In this case, the variance is often referred to as Study
 * Eligibility Waiver.
 * 
 * 
 * For example, the reason that a subject is given a sponsor-approved
 * waiver for meeting protocol-defined eligibility requirements.
 * 
 * NOTE: If there is an exception to a planned milestone this is the
 * reason for exception.
     */
    public void setVarianceReason(gov.nih.nci.cabig.ccts.domain.cdt.ST varianceReason) {
        this.varianceReason = varianceReason;
    }


    /**
     * Gets the studySite value for this PerformedAdministrativeActivity.
     * 
     * @return studySite
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.StudySite getStudySite() {
        return studySite;
    }


    /**
     * Sets the studySite value for this PerformedAdministrativeActivity.
     * 
     * @param studySite
     */
    public void setStudySite(gov.nih.nci.cabig.ccts.domain.bridg.StudySite studySite) {
        this.studySite = studySite;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformedAdministrativeActivity)) return false;
        PerformedAdministrativeActivity other = (PerformedAdministrativeActivity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.varianceReason==null && other.getVarianceReason()==null) || 
             (this.varianceReason!=null &&
              this.varianceReason.equals(other.getVarianceReason()))) &&
            ((this.studySite==null && other.getStudySite()==null) || 
             (this.studySite!=null &&
              this.studySite.equals(other.getStudySite())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getVarianceReason() != null) {
            _hashCode += getVarianceReason().hashCode();
        }
        if (getStudySite() != null) {
            _hashCode += getStudySite().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PerformedAdministrativeActivity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedAdministrativeActivity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("varianceReason");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "varianceReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studySite");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudySite"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudySite"));
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
