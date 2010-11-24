/**
 * PlannedStudy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A business process state of a study that is a collector of planned
 * activities in a study including a description of the planned number
 * of study subjects and the duration of their participation in the study.
 * 
 * A planned study theoretically occurs before a study starts and is
 * usually submitted to an Institutional Review Board (IRB) or sponsoring
 * organization for review and approval before the study is executed.
 * 
 * NOTE: This is a collector of planned activities. Study and StudyProtocol
 * include additional concepts including ( design, methodology, statistical
 * considerations and organization).
 */
public class PlannedStudy  extends gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol  implements java.io.Serializable {
    /** Defines the total length of time that a subject is expected to
 * participate in the study during the intervention duration. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST plannedSubjectInterventionDuration;
    /** Defines the total length of time that a subject is expected to
 * participate in the study including the intervention and follow-up
 * duration. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST plannedSubjectParticipationDuration;
    /** Total number of patients/subjects/participants needed for protocol
 * enrollment (accrual). 
 * 
 * NOTE: The number of subjects in a class or group including, the total
 * for the entire trial intended to be enrolled in a trial to reach the
 * planned sample size.  Target accruals are set so that statistical
 * and scientific objectives of a trial will have a likelihood of being
 * met as determined by agreement, algorithm or other specified process. */
    private int targetAccrual;
    private gov.nih.nci.cabig.ccts.domain.bridg.PlannedActivity[] plannedActivity;

    public PlannedStudy() {
    }

    public PlannedStudy(
           gov.nih.nci.cabig.ccts.domain.bridg.PlannedActivity[] plannedActivity,
           gov.nih.nci.cabig.ccts.domain.cdt.ST plannedSubjectInterventionDuration,
           gov.nih.nci.cabig.ccts.domain.cdt.ST plannedSubjectParticipationDuration,
           int targetAccrual) {
           this.plannedSubjectInterventionDuration = plannedSubjectInterventionDuration;
           this.plannedSubjectParticipationDuration = plannedSubjectParticipationDuration;
           this.targetAccrual = targetAccrual;
           this.plannedActivity = plannedActivity;
    }


    /**
     * Gets the plannedSubjectInterventionDuration value for this PlannedStudy.
     * 
     * @return plannedSubjectInterventionDuration Defines the total length of time that a subject is expected to
 * participate in the study during the intervention duration.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getPlannedSubjectInterventionDuration() {
        return plannedSubjectInterventionDuration;
    }


    /**
     * Sets the plannedSubjectInterventionDuration value for this PlannedStudy.
     * 
     * @param plannedSubjectInterventionDuration Defines the total length of time that a subject is expected to
 * participate in the study during the intervention duration.
     */
    public void setPlannedSubjectInterventionDuration(gov.nih.nci.cabig.ccts.domain.cdt.ST plannedSubjectInterventionDuration) {
        this.plannedSubjectInterventionDuration = plannedSubjectInterventionDuration;
    }


    /**
     * Gets the plannedSubjectParticipationDuration value for this PlannedStudy.
     * 
     * @return plannedSubjectParticipationDuration Defines the total length of time that a subject is expected to
 * participate in the study including the intervention and follow-up
 * duration.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getPlannedSubjectParticipationDuration() {
        return plannedSubjectParticipationDuration;
    }


    /**
     * Sets the plannedSubjectParticipationDuration value for this PlannedStudy.
     * 
     * @param plannedSubjectParticipationDuration Defines the total length of time that a subject is expected to
 * participate in the study including the intervention and follow-up
 * duration.
     */
    public void setPlannedSubjectParticipationDuration(gov.nih.nci.cabig.ccts.domain.cdt.ST plannedSubjectParticipationDuration) {
        this.plannedSubjectParticipationDuration = plannedSubjectParticipationDuration;
    }


    /**
     * Gets the targetAccrual value for this PlannedStudy.
     * 
     * @return targetAccrual Total number of patients/subjects/participants needed for protocol
 * enrollment (accrual). 
 * 
 * NOTE: The number of subjects in a class or group including, the total
 * for the entire trial intended to be enrolled in a trial to reach the
 * planned sample size.  Target accruals are set so that statistical
 * and scientific objectives of a trial will have a likelihood of being
 * met as determined by agreement, algorithm or other specified process.
     */
    public int getTargetAccrual() {
        return targetAccrual;
    }


    /**
     * Sets the targetAccrual value for this PlannedStudy.
     * 
     * @param targetAccrual Total number of patients/subjects/participants needed for protocol
 * enrollment (accrual). 
 * 
 * NOTE: The number of subjects in a class or group including, the total
 * for the entire trial intended to be enrolled in a trial to reach the
 * planned sample size.  Target accruals are set so that statistical
 * and scientific objectives of a trial will have a likelihood of being
 * met as determined by agreement, algorithm or other specified process.
     */
    public void setTargetAccrual(int targetAccrual) {
        this.targetAccrual = targetAccrual;
    }


    /**
     * Gets the plannedActivity value for this PlannedStudy.
     * 
     * @return plannedActivity
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PlannedActivity[] getPlannedActivity() {
        return plannedActivity;
    }


    /**
     * Sets the plannedActivity value for this PlannedStudy.
     * 
     * @param plannedActivity
     */
    public void setPlannedActivity(gov.nih.nci.cabig.ccts.domain.bridg.PlannedActivity[] plannedActivity) {
        this.plannedActivity = plannedActivity;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.PlannedActivity getPlannedActivity(int i) {
        return this.plannedActivity[i];
    }

    public void setPlannedActivity(int i, gov.nih.nci.cabig.ccts.domain.bridg.PlannedActivity _value) {
        this.plannedActivity[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlannedStudy)) return false;
        PlannedStudy other = (PlannedStudy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.plannedSubjectInterventionDuration==null && other.getPlannedSubjectInterventionDuration()==null) || 
             (this.plannedSubjectInterventionDuration!=null &&
              this.plannedSubjectInterventionDuration.equals(other.getPlannedSubjectInterventionDuration()))) &&
            ((this.plannedSubjectParticipationDuration==null && other.getPlannedSubjectParticipationDuration()==null) || 
             (this.plannedSubjectParticipationDuration!=null &&
              this.plannedSubjectParticipationDuration.equals(other.getPlannedSubjectParticipationDuration()))) &&
            this.targetAccrual == other.getTargetAccrual() &&
            ((this.plannedActivity==null && other.getPlannedActivity()==null) || 
             (this.plannedActivity!=null &&
              java.util.Arrays.equals(this.plannedActivity, other.getPlannedActivity())));
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
        if (getPlannedSubjectInterventionDuration() != null) {
            _hashCode += getPlannedSubjectInterventionDuration().hashCode();
        }
        if (getPlannedSubjectParticipationDuration() != null) {
            _hashCode += getPlannedSubjectParticipationDuration().hashCode();
        }
        _hashCode += getTargetAccrual();
        if (getPlannedActivity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlannedActivity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlannedActivity(), i);
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
        new org.apache.axis.description.TypeDesc(PlannedStudy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedStudy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedSubjectInterventionDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "plannedSubjectInterventionDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedSubjectParticipationDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "plannedSubjectParticipationDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetAccrual");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "targetAccrual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedActivity");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedActivity"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedActivity"));
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
