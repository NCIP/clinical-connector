/**
 * StudySubject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * An actual or potential individual who participates in a clinical
 * trial either as a recipient of the investigational product or as a
 * control.  May also include individuals who are being screened for
 * clinical trials, or individuals participating in observational or
 * other studies.
 * 
 * For example, when designing a clinical trial we would use the StudySubject
 * as a placeholder (indicated by the placeholder code) to describe the
 * act committees in which the potential subject would participate. 
 * Once a subject was identified, that StudySubject would be linked to
 * the actual person in the study.
 */
public class StudySubject  implements java.io.Serializable {
    /** Specifies whether an instance of an StudySubject is an actual StudySubject
 * (actualSubjectIndicator = Y) or placeholder for a StudySubject (actualSubjectIndicator
 * = N) . */
    private gov.nih.nci.cabig.ccts.domain.cdt.BL actualSubjectIndicator;
    /** The designation assigned to a person to uniquely identify them
 * as a subject within a protocol. */
    private gov.nih.nci.cabig.ccts.domain.cdt.II[] identifier;
    /** A value specifying whether the state of participation of a person
 * in the given Study is screening, enrolled, terminated, completed,
 * etc. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST state;
    /** A value drawn from an enumerated value set which describes the
 * lifecycle (e.g., new, active, inactive, nullified, normal, completed,
 * suspended, draft, retired, terminated, pending approval, held, cancelled,
 * aborted) of a subject.
 * 
 * For example, the status change of a study protocol to 'suspended',
 * requiring that subject accrual be halted until the study protocol
 * is restored to fully active status. This refers to codes to represent
 * the status of a study protocol in relation to the ability to enroll
 * participants/subjects. 
 * 
 * For example, in a StudyProtocol, some of the values may be include
 * things like: closed, open, suspended,terminated. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD status;
    /** The date and time range when this particular status becomes active
 * and is no longer considered active, enforceable, relevant, etc..
 * 
 * For example, in protocol, the effective date may be the date of  Institutional
 * Review Board (IRB) approval of the initial protocol version; the date
 * the IRB Chair signs off on a protocol and patient enrollment can begin.
 * The effective end date may refer to the closing of a study to enrollment.
 * Subjects enrolled on the study at the time of closure will continue
 * their treatment plan. */
    private gov.nih.nci.cabig.ccts.domain.cdt.IVLTS statusDateRange;
    /** A unique code for identification of uniform groups of patients
 * for separate analysis or treatment.
 * 
 * For example, in the National Cancer Institute (NCI) this is the Clinical
 * Data Update System (CDUS) Reporting. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD subgroup;
    private gov.nih.nci.cabig.ccts.domain.bridg.StudySite studySite;
    private gov.nih.nci.cabig.ccts.domain.bridg.Participant participant;
    private gov.nih.nci.cabig.ccts.domain.bridg.PerformedObservation[] performedObservation;
    private gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol studyProtocol;

    public StudySubject() {
    }

    public StudySubject(
           gov.nih.nci.cabig.ccts.domain.cdt.BL actualSubjectIndicator,
           gov.nih.nci.cabig.ccts.domain.cdt.II[] identifier,
           gov.nih.nci.cabig.ccts.domain.bridg.Participant participant,
           gov.nih.nci.cabig.ccts.domain.bridg.PerformedObservation[] performedObservation,
           gov.nih.nci.cabig.ccts.domain.cdt.ST state,
           gov.nih.nci.cabig.ccts.domain.cdt.CD status,
           gov.nih.nci.cabig.ccts.domain.cdt.IVLTS statusDateRange,
           gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol studyProtocol,
           gov.nih.nci.cabig.ccts.domain.bridg.StudySite studySite,
           gov.nih.nci.cabig.ccts.domain.cdt.CD subgroup) {
           this.actualSubjectIndicator = actualSubjectIndicator;
           this.identifier = identifier;
           this.state = state;
           this.status = status;
           this.statusDateRange = statusDateRange;
           this.subgroup = subgroup;
           this.studySite = studySite;
           this.participant = participant;
           this.performedObservation = performedObservation;
           this.studyProtocol = studyProtocol;
    }


    /**
     * Gets the actualSubjectIndicator value for this StudySubject.
     * 
     * @return actualSubjectIndicator Specifies whether an instance of an StudySubject is an actual StudySubject
 * (actualSubjectIndicator = Y) or placeholder for a StudySubject (actualSubjectIndicator
 * = N) .
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.BL getActualSubjectIndicator() {
        return actualSubjectIndicator;
    }


    /**
     * Sets the actualSubjectIndicator value for this StudySubject.
     * 
     * @param actualSubjectIndicator Specifies whether an instance of an StudySubject is an actual StudySubject
 * (actualSubjectIndicator = Y) or placeholder for a StudySubject (actualSubjectIndicator
 * = N) .
     */
    public void setActualSubjectIndicator(gov.nih.nci.cabig.ccts.domain.cdt.BL actualSubjectIndicator) {
        this.actualSubjectIndicator = actualSubjectIndicator;
    }


    /**
     * Gets the identifier value for this StudySubject.
     * 
     * @return identifier The designation assigned to a person to uniquely identify them
 * as a subject within a protocol.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.II[] getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this StudySubject.
     * 
     * @param identifier The designation assigned to a person to uniquely identify them
 * as a subject within a protocol.
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
     * Gets the state value for this StudySubject.
     * 
     * @return state A value specifying whether the state of participation of a person
 * in the given Study is screening, enrolled, terminated, completed,
 * etc.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getState() {
        return state;
    }


    /**
     * Sets the state value for this StudySubject.
     * 
     * @param state A value specifying whether the state of participation of a person
 * in the given Study is screening, enrolled, terminated, completed,
 * etc.
     */
    public void setState(gov.nih.nci.cabig.ccts.domain.cdt.ST state) {
        this.state = state;
    }


    /**
     * Gets the status value for this StudySubject.
     * 
     * @return status A value drawn from an enumerated value set which describes the
 * lifecycle (e.g., new, active, inactive, nullified, normal, completed,
 * suspended, draft, retired, terminated, pending approval, held, cancelled,
 * aborted) of a subject.
 * 
 * For example, the status change of a study protocol to 'suspended',
 * requiring that subject accrual be halted until the study protocol
 * is restored to fully active status. This refers to codes to represent
 * the status of a study protocol in relation to the ability to enroll
 * participants/subjects. 
 * 
 * For example, in a StudyProtocol, some of the values may be include
 * things like: closed, open, suspended,terminated.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getStatus() {
        return status;
    }


    /**
     * Sets the status value for this StudySubject.
     * 
     * @param status A value drawn from an enumerated value set which describes the
 * lifecycle (e.g., new, active, inactive, nullified, normal, completed,
 * suspended, draft, retired, terminated, pending approval, held, cancelled,
 * aborted) of a subject.
 * 
 * For example, the status change of a study protocol to 'suspended',
 * requiring that subject accrual be halted until the study protocol
 * is restored to fully active status. This refers to codes to represent
 * the status of a study protocol in relation to the ability to enroll
 * participants/subjects. 
 * 
 * For example, in a StudyProtocol, some of the values may be include
 * things like: closed, open, suspended,terminated.
     */
    public void setStatus(gov.nih.nci.cabig.ccts.domain.cdt.CD status) {
        this.status = status;
    }


    /**
     * Gets the statusDateRange value for this StudySubject.
     * 
     * @return statusDateRange The date and time range when this particular status becomes active
 * and is no longer considered active, enforceable, relevant, etc..
 * 
 * For example, in protocol, the effective date may be the date of  Institutional
 * Review Board (IRB) approval of the initial protocol version; the date
 * the IRB Chair signs off on a protocol and patient enrollment can begin.
 * The effective end date may refer to the closing of a study to enrollment.
 * Subjects enrolled on the study at the time of closure will continue
 * their treatment plan.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.IVLTS getStatusDateRange() {
        return statusDateRange;
    }


    /**
     * Sets the statusDateRange value for this StudySubject.
     * 
     * @param statusDateRange The date and time range when this particular status becomes active
 * and is no longer considered active, enforceable, relevant, etc..
 * 
 * For example, in protocol, the effective date may be the date of  Institutional
 * Review Board (IRB) approval of the initial protocol version; the date
 * the IRB Chair signs off on a protocol and patient enrollment can begin.
 * The effective end date may refer to the closing of a study to enrollment.
 * Subjects enrolled on the study at the time of closure will continue
 * their treatment plan.
     */
    public void setStatusDateRange(gov.nih.nci.cabig.ccts.domain.cdt.IVLTS statusDateRange) {
        this.statusDateRange = statusDateRange;
    }


    /**
     * Gets the subgroup value for this StudySubject.
     * 
     * @return subgroup A unique code for identification of uniform groups of patients
 * for separate analysis or treatment.
 * 
 * For example, in the National Cancer Institute (NCI) this is the Clinical
 * Data Update System (CDUS) Reporting.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getSubgroup() {
        return subgroup;
    }


    /**
     * Sets the subgroup value for this StudySubject.
     * 
     * @param subgroup A unique code for identification of uniform groups of patients
 * for separate analysis or treatment.
 * 
 * For example, in the National Cancer Institute (NCI) this is the Clinical
 * Data Update System (CDUS) Reporting.
     */
    public void setSubgroup(gov.nih.nci.cabig.ccts.domain.cdt.CD subgroup) {
        this.subgroup = subgroup;
    }


    /**
     * Gets the studySite value for this StudySubject.
     * 
     * @return studySite
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.StudySite getStudySite() {
        return studySite;
    }


    /**
     * Sets the studySite value for this StudySubject.
     * 
     * @param studySite
     */
    public void setStudySite(gov.nih.nci.cabig.ccts.domain.bridg.StudySite studySite) {
        this.studySite = studySite;
    }


    /**
     * Gets the participant value for this StudySubject.
     * 
     * @return participant
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.Participant getParticipant() {
        return participant;
    }


    /**
     * Sets the participant value for this StudySubject.
     * 
     * @param participant
     */
    public void setParticipant(gov.nih.nci.cabig.ccts.domain.bridg.Participant participant) {
        this.participant = participant;
    }


    /**
     * Gets the performedObservation value for this StudySubject.
     * 
     * @return performedObservation
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedObservation[] getPerformedObservation() {
        return performedObservation;
    }


    /**
     * Sets the performedObservation value for this StudySubject.
     * 
     * @param performedObservation
     */
    public void setPerformedObservation(gov.nih.nci.cabig.ccts.domain.bridg.PerformedObservation[] performedObservation) {
        this.performedObservation = performedObservation;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedObservation getPerformedObservation(int i) {
        return this.performedObservation[i];
    }

    public void setPerformedObservation(int i, gov.nih.nci.cabig.ccts.domain.bridg.PerformedObservation _value) {
        this.performedObservation[i] = _value;
    }


    /**
     * Gets the studyProtocol value for this StudySubject.
     * 
     * @return studyProtocol
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol getStudyProtocol() {
        return studyProtocol;
    }


    /**
     * Sets the studyProtocol value for this StudySubject.
     * 
     * @param studyProtocol
     */
    public void setStudyProtocol(gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol studyProtocol) {
        this.studyProtocol = studyProtocol;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StudySubject)) return false;
        StudySubject other = (StudySubject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actualSubjectIndicator==null && other.getActualSubjectIndicator()==null) || 
             (this.actualSubjectIndicator!=null &&
              this.actualSubjectIndicator.equals(other.getActualSubjectIndicator()))) &&
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              java.util.Arrays.equals(this.identifier, other.getIdentifier()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.statusDateRange==null && other.getStatusDateRange()==null) || 
             (this.statusDateRange!=null &&
              this.statusDateRange.equals(other.getStatusDateRange()))) &&
            ((this.subgroup==null && other.getSubgroup()==null) || 
             (this.subgroup!=null &&
              this.subgroup.equals(other.getSubgroup()))) &&
            ((this.studySite==null && other.getStudySite()==null) || 
             (this.studySite!=null &&
              this.studySite.equals(other.getStudySite()))) &&
            ((this.participant==null && other.getParticipant()==null) || 
             (this.participant!=null &&
              this.participant.equals(other.getParticipant()))) &&
            ((this.performedObservation==null && other.getPerformedObservation()==null) || 
             (this.performedObservation!=null &&
              java.util.Arrays.equals(this.performedObservation, other.getPerformedObservation()))) &&
            ((this.studyProtocol==null && other.getStudyProtocol()==null) || 
             (this.studyProtocol!=null &&
              this.studyProtocol.equals(other.getStudyProtocol())));
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
        if (getActualSubjectIndicator() != null) {
            _hashCode += getActualSubjectIndicator().hashCode();
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
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatusDateRange() != null) {
            _hashCode += getStatusDateRange().hashCode();
        }
        if (getSubgroup() != null) {
            _hashCode += getSubgroup().hashCode();
        }
        if (getStudySite() != null) {
            _hashCode += getStudySite().hashCode();
        }
        if (getParticipant() != null) {
            _hashCode += getParticipant().hashCode();
        }
        if (getPerformedObservation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPerformedObservation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPerformedObservation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStudyProtocol() != null) {
            _hashCode += getStudyProtocol().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StudySubject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudySubject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualSubjectIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "actualSubjectIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "BL"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "II"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "statusDateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "IVLTS"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subgroup");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "subgroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studySite");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudySite"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudySite"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("participant");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Participant"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Participant"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performedObservation");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedObservation"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedObservation"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studyProtocol");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudyProtocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudyProtocol"));
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
