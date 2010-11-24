/**
 * PerformedSubjectMilestone.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * The completed activity which marks a subject-specific, protocol-defined
 * point in the course of a study.
 * 
 * For example, obtain informed consent, verify eligibility criteria,
 * enroll, registration to a study, randomize, assignment to a treatment
 * arm, start of on-study period, complete study visits, end of on-study
 * period, exit trial, break treatment blind, protocol violation, premature
 * withdrawal, etc.
 */
public class PerformedSubjectMilestone  extends gov.nih.nci.cabig.ccts.domain.bridg.PerformedAdministrativeActivity  implements java.io.Serializable {
    /** The date and time the StudySubject gives official consent by signing
 * the official consent form. */
    private gov.nih.nci.cabig.ccts.domain.cdt.TS informedConsentDate;
    /** The text provided by the patient when acknowledging participation
 * on the protocol usually by signing the informed consent document. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST informedConsentSignatureText;
    /** The date and time when the study subject is removed from the study.
 * 
 * For example, the subject is not being followed and will not be retreated. */
    private gov.nih.nci.cabig.ccts.domain.cdt.TS offStudyDate;
    /** The coded rationale why the subject is removed from a clinical
 * trial, */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD offStudyReason;
    /** The date and time the Subject has been registered to the Study
 * assuming they have finished screening and have been found eligible. */
    private gov.nih.nci.cabig.ccts.domain.cdt.TS registrationDate;
    /** The date and time range used to indicate the start and end of the
 * study for a subject.   
 * 
 * NOTE:  Reference start date is usually equivalent to date/time of
 * first intake of study agent. Required for all randomized subjects;
 * null for screen failures (if screen failures are submitted).  Reference
 * end date is usually equivalent to the date/time when subject was determined
 * to have ended the trial, and often equivalent to date/time of last
 * intake of drug.   Required for all randomized subjects; null for screen
 * failures (if screen failures are submitted). */
    private gov.nih.nci.cabig.ccts.domain.cdt.IVLTS studyReferenceDateRange;

    public PerformedSubjectMilestone() {
    }

    public PerformedSubjectMilestone(
           gov.nih.nci.cabig.ccts.domain.cdt.TS informedConsentDate,
           gov.nih.nci.cabig.ccts.domain.cdt.ST informedConsentSignatureText,
           gov.nih.nci.cabig.ccts.domain.cdt.TS offStudyDate,
           gov.nih.nci.cabig.ccts.domain.cdt.CD offStudyReason,
           gov.nih.nci.cabig.ccts.domain.cdt.TS registrationDate,
           gov.nih.nci.cabig.ccts.domain.cdt.IVLTS studyReferenceDateRange) {
           this.informedConsentDate = informedConsentDate;
           this.informedConsentSignatureText = informedConsentSignatureText;
           this.offStudyDate = offStudyDate;
           this.offStudyReason = offStudyReason;
           this.registrationDate = registrationDate;
           this.studyReferenceDateRange = studyReferenceDateRange;
    }


    /**
     * Gets the informedConsentDate value for this PerformedSubjectMilestone.
     * 
     * @return informedConsentDate The date and time the StudySubject gives official consent by signing
 * the official consent form.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.TS getInformedConsentDate() {
        return informedConsentDate;
    }


    /**
     * Sets the informedConsentDate value for this PerformedSubjectMilestone.
     * 
     * @param informedConsentDate The date and time the StudySubject gives official consent by signing
 * the official consent form.
     */
    public void setInformedConsentDate(gov.nih.nci.cabig.ccts.domain.cdt.TS informedConsentDate) {
        this.informedConsentDate = informedConsentDate;
    }


    /**
     * Gets the informedConsentSignatureText value for this PerformedSubjectMilestone.
     * 
     * @return informedConsentSignatureText The text provided by the patient when acknowledging participation
 * on the protocol usually by signing the informed consent document.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getInformedConsentSignatureText() {
        return informedConsentSignatureText;
    }


    /**
     * Sets the informedConsentSignatureText value for this PerformedSubjectMilestone.
     * 
     * @param informedConsentSignatureText The text provided by the patient when acknowledging participation
 * on the protocol usually by signing the informed consent document.
     */
    public void setInformedConsentSignatureText(gov.nih.nci.cabig.ccts.domain.cdt.ST informedConsentSignatureText) {
        this.informedConsentSignatureText = informedConsentSignatureText;
    }


    /**
     * Gets the offStudyDate value for this PerformedSubjectMilestone.
     * 
     * @return offStudyDate The date and time when the study subject is removed from the study.
 * 
 * For example, the subject is not being followed and will not be retreated.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.TS getOffStudyDate() {
        return offStudyDate;
    }


    /**
     * Sets the offStudyDate value for this PerformedSubjectMilestone.
     * 
     * @param offStudyDate The date and time when the study subject is removed from the study.
 * 
 * For example, the subject is not being followed and will not be retreated.
     */
    public void setOffStudyDate(gov.nih.nci.cabig.ccts.domain.cdt.TS offStudyDate) {
        this.offStudyDate = offStudyDate;
    }


    /**
     * Gets the offStudyReason value for this PerformedSubjectMilestone.
     * 
     * @return offStudyReason The coded rationale why the subject is removed from a clinical
 * trial,
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getOffStudyReason() {
        return offStudyReason;
    }


    /**
     * Sets the offStudyReason value for this PerformedSubjectMilestone.
     * 
     * @param offStudyReason The coded rationale why the subject is removed from a clinical
 * trial,
     */
    public void setOffStudyReason(gov.nih.nci.cabig.ccts.domain.cdt.CD offStudyReason) {
        this.offStudyReason = offStudyReason;
    }


    /**
     * Gets the registrationDate value for this PerformedSubjectMilestone.
     * 
     * @return registrationDate The date and time the Subject has been registered to the Study
 * assuming they have finished screening and have been found eligible.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.TS getRegistrationDate() {
        return registrationDate;
    }


    /**
     * Sets the registrationDate value for this PerformedSubjectMilestone.
     * 
     * @param registrationDate The date and time the Subject has been registered to the Study
 * assuming they have finished screening and have been found eligible.
     */
    public void setRegistrationDate(gov.nih.nci.cabig.ccts.domain.cdt.TS registrationDate) {
        this.registrationDate = registrationDate;
    }


    /**
     * Gets the studyReferenceDateRange value for this PerformedSubjectMilestone.
     * 
     * @return studyReferenceDateRange The date and time range used to indicate the start and end of the
 * study for a subject.   
 * 
 * NOTE:  Reference start date is usually equivalent to date/time of
 * first intake of study agent. Required for all randomized subjects;
 * null for screen failures (if screen failures are submitted).  Reference
 * end date is usually equivalent to the date/time when subject was determined
 * to have ended the trial, and often equivalent to date/time of last
 * intake of drug.   Required for all randomized subjects; null for screen
 * failures (if screen failures are submitted).
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.IVLTS getStudyReferenceDateRange() {
        return studyReferenceDateRange;
    }


    /**
     * Sets the studyReferenceDateRange value for this PerformedSubjectMilestone.
     * 
     * @param studyReferenceDateRange The date and time range used to indicate the start and end of the
 * study for a subject.   
 * 
 * NOTE:  Reference start date is usually equivalent to date/time of
 * first intake of study agent. Required for all randomized subjects;
 * null for screen failures (if screen failures are submitted).  Reference
 * end date is usually equivalent to the date/time when subject was determined
 * to have ended the trial, and often equivalent to date/time of last
 * intake of drug.   Required for all randomized subjects; null for screen
 * failures (if screen failures are submitted).
     */
    public void setStudyReferenceDateRange(gov.nih.nci.cabig.ccts.domain.cdt.IVLTS studyReferenceDateRange) {
        this.studyReferenceDateRange = studyReferenceDateRange;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformedSubjectMilestone)) return false;
        PerformedSubjectMilestone other = (PerformedSubjectMilestone) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.informedConsentDate==null && other.getInformedConsentDate()==null) || 
             (this.informedConsentDate!=null &&
              this.informedConsentDate.equals(other.getInformedConsentDate()))) &&
            ((this.informedConsentSignatureText==null && other.getInformedConsentSignatureText()==null) || 
             (this.informedConsentSignatureText!=null &&
              this.informedConsentSignatureText.equals(other.getInformedConsentSignatureText()))) &&
            ((this.offStudyDate==null && other.getOffStudyDate()==null) || 
             (this.offStudyDate!=null &&
              this.offStudyDate.equals(other.getOffStudyDate()))) &&
            ((this.offStudyReason==null && other.getOffStudyReason()==null) || 
             (this.offStudyReason!=null &&
              this.offStudyReason.equals(other.getOffStudyReason()))) &&
            ((this.registrationDate==null && other.getRegistrationDate()==null) || 
             (this.registrationDate!=null &&
              this.registrationDate.equals(other.getRegistrationDate()))) &&
            ((this.studyReferenceDateRange==null && other.getStudyReferenceDateRange()==null) || 
             (this.studyReferenceDateRange!=null &&
              this.studyReferenceDateRange.equals(other.getStudyReferenceDateRange())));
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
        if (getInformedConsentDate() != null) {
            _hashCode += getInformedConsentDate().hashCode();
        }
        if (getInformedConsentSignatureText() != null) {
            _hashCode += getInformedConsentSignatureText().hashCode();
        }
        if (getOffStudyDate() != null) {
            _hashCode += getOffStudyDate().hashCode();
        }
        if (getOffStudyReason() != null) {
            _hashCode += getOffStudyReason().hashCode();
        }
        if (getRegistrationDate() != null) {
            _hashCode += getRegistrationDate().hashCode();
        }
        if (getStudyReferenceDateRange() != null) {
            _hashCode += getStudyReferenceDateRange().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PerformedSubjectMilestone.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedSubjectMilestone"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informedConsentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "informedConsentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "TS"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informedConsentSignatureText");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "informedConsentSignatureText"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offStudyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "offStudyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "TS"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offStudyReason");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "offStudyReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "registrationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "TS"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studyReferenceDateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "studyReferenceDateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "IVLTS"));
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
