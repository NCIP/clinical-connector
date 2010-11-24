/**
 * PerformedActivity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A business process state of an activity which describes activities
 * which have been successfully or unsuccessfully completed.
 */
public class PerformedActivity  extends gov.nih.nci.cabig.ccts.domain.bridg.Activity  implements java.io.Serializable {
    /** The date and time when this activity began and ended.
 * 
 * For example, the date and time when a sample was taken from the subject.
 * 
 * 
 * For example, a dose of chemotherapy was given on June 12th starting
 * at 9am and finishing at 12pm. */
    private gov.nih.nci.cabig.ccts.domain.cdt.IVLTS actualDateRange;
    /** Actual length of time of the activity performed. */
    private gov.nih.nci.cabig.ccts.domain.cdt.PQ actualDuration;
    /** The start and end date and time of the interval over which the
 * activity is focused.
 * 
 * For example, for clinical observations, this is the time at which
 * the observation holds (is effective) for the subject. For subject
 * encounters, this is the "administrative time" that is the encounter's
 * start and end date required to be chosen by business rules, as opposed
 * to the actual time the healthcare encounter-related work is performed.
 * 
 * NOTE: In many situations one only needs to record the "actual times".
 * "Effective times" are recorded in addition to "actual times" when
 * there is a requirement to separate 2 different perspectives on time
 * for the same activity. */
    private gov.nih.nci.cabig.ccts.domain.cdt.IVLTS effectiveDateRange;
    /** A time expression specifying the focal or operative time of the
 * Act,ivity the primary time for which the Activity holds, the time
 * of interest from the perspective of the Activity's intention.
 * 
 * For example,  -P2M to represent a period of the past 2 months as the
 * evaluation interval for a question from a questionnaire such as SF-36. */
    private gov.nih.nci.cabig.ccts.domain.cdt.PQ effectiveDuration;
    /** Specifies whether an activity was not done. 
 * 
 * For example, Y designates that the PerformedActivity was missed. */
    private gov.nih.nci.cabig.ccts.domain.cdt.BL missedIndicator;
    /** The text and/or code that describes the rationale behind why an
 * activity is not done.
 * 
 * NOTE: This captures the Study Data Tabulation Model's (SDTM) reason
 * not done (REASND) Variable. At present there is no coded set of values.
 * In HL7, there is a list of permissible missing value types, and we
 * need to ensure that HL7's list is a superset of what is needed by
 * SDTM. */
    private java.lang.String missedReason;
    private gov.nih.nci.cabig.ccts.domain.bridg.ScheduledActivity scheduledActivity;
    private gov.nih.nci.cabig.ccts.domain.bridg.AssessmentPerformedActivityRelationship[] assessmentPerformedActivityRelationship;

    public PerformedActivity() {
    }

    public PerformedActivity(
           gov.nih.nci.cabig.ccts.domain.cdt.IVLTS actualDateRange,
           gov.nih.nci.cabig.ccts.domain.cdt.PQ actualDuration,
           gov.nih.nci.cabig.ccts.domain.bridg.AssessmentPerformedActivityRelationship[] assessmentPerformedActivityRelationship,
           gov.nih.nci.cabig.ccts.domain.cdt.IVLTS effectiveDateRange,
           gov.nih.nci.cabig.ccts.domain.cdt.PQ effectiveDuration,
           gov.nih.nci.cabig.ccts.domain.cdt.BL missedIndicator,
           java.lang.String missedReason,
           gov.nih.nci.cabig.ccts.domain.bridg.ScheduledActivity scheduledActivity) {
           this.actualDateRange = actualDateRange;
           this.actualDuration = actualDuration;
           this.effectiveDateRange = effectiveDateRange;
           this.effectiveDuration = effectiveDuration;
           this.missedIndicator = missedIndicator;
           this.missedReason = missedReason;
           this.scheduledActivity = scheduledActivity;
           this.assessmentPerformedActivityRelationship = assessmentPerformedActivityRelationship;
    }


    /**
     * Gets the actualDateRange value for this PerformedActivity.
     * 
     * @return actualDateRange The date and time when this activity began and ended.
 * 
 * For example, the date and time when a sample was taken from the subject.
 * 
 * 
 * For example, a dose of chemotherapy was given on June 12th starting
 * at 9am and finishing at 12pm.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.IVLTS getActualDateRange() {
        return actualDateRange;
    }


    /**
     * Sets the actualDateRange value for this PerformedActivity.
     * 
     * @param actualDateRange The date and time when this activity began and ended.
 * 
 * For example, the date and time when a sample was taken from the subject.
 * 
 * 
 * For example, a dose of chemotherapy was given on June 12th starting
 * at 9am and finishing at 12pm.
     */
    public void setActualDateRange(gov.nih.nci.cabig.ccts.domain.cdt.IVLTS actualDateRange) {
        this.actualDateRange = actualDateRange;
    }


    /**
     * Gets the actualDuration value for this PerformedActivity.
     * 
     * @return actualDuration Actual length of time of the activity performed.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.PQ getActualDuration() {
        return actualDuration;
    }


    /**
     * Sets the actualDuration value for this PerformedActivity.
     * 
     * @param actualDuration Actual length of time of the activity performed.
     */
    public void setActualDuration(gov.nih.nci.cabig.ccts.domain.cdt.PQ actualDuration) {
        this.actualDuration = actualDuration;
    }


    /**
     * Gets the effectiveDateRange value for this PerformedActivity.
     * 
     * @return effectiveDateRange The start and end date and time of the interval over which the
 * activity is focused.
 * 
 * For example, for clinical observations, this is the time at which
 * the observation holds (is effective) for the subject. For subject
 * encounters, this is the "administrative time" that is the encounter's
 * start and end date required to be chosen by business rules, as opposed
 * to the actual time the healthcare encounter-related work is performed.
 * 
 * NOTE: In many situations one only needs to record the "actual times".
 * "Effective times" are recorded in addition to "actual times" when
 * there is a requirement to separate 2 different perspectives on time
 * for the same activity.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.IVLTS getEffectiveDateRange() {
        return effectiveDateRange;
    }


    /**
     * Sets the effectiveDateRange value for this PerformedActivity.
     * 
     * @param effectiveDateRange The start and end date and time of the interval over which the
 * activity is focused.
 * 
 * For example, for clinical observations, this is the time at which
 * the observation holds (is effective) for the subject. For subject
 * encounters, this is the "administrative time" that is the encounter's
 * start and end date required to be chosen by business rules, as opposed
 * to the actual time the healthcare encounter-related work is performed.
 * 
 * NOTE: In many situations one only needs to record the "actual times".
 * "Effective times" are recorded in addition to "actual times" when
 * there is a requirement to separate 2 different perspectives on time
 * for the same activity.
     */
    public void setEffectiveDateRange(gov.nih.nci.cabig.ccts.domain.cdt.IVLTS effectiveDateRange) {
        this.effectiveDateRange = effectiveDateRange;
    }


    /**
     * Gets the effectiveDuration value for this PerformedActivity.
     * 
     * @return effectiveDuration A time expression specifying the focal or operative time of the
 * Act,ivity the primary time for which the Activity holds, the time
 * of interest from the perspective of the Activity's intention.
 * 
 * For example,  -P2M to represent a period of the past 2 months as the
 * evaluation interval for a question from a questionnaire such as SF-36.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.PQ getEffectiveDuration() {
        return effectiveDuration;
    }


    /**
     * Sets the effectiveDuration value for this PerformedActivity.
     * 
     * @param effectiveDuration A time expression specifying the focal or operative time of the
 * Act,ivity the primary time for which the Activity holds, the time
 * of interest from the perspective of the Activity's intention.
 * 
 * For example,  -P2M to represent a period of the past 2 months as the
 * evaluation interval for a question from a questionnaire such as SF-36.
     */
    public void setEffectiveDuration(gov.nih.nci.cabig.ccts.domain.cdt.PQ effectiveDuration) {
        this.effectiveDuration = effectiveDuration;
    }


    /**
     * Gets the missedIndicator value for this PerformedActivity.
     * 
     * @return missedIndicator Specifies whether an activity was not done. 
 * 
 * For example, Y designates that the PerformedActivity was missed.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.BL getMissedIndicator() {
        return missedIndicator;
    }


    /**
     * Sets the missedIndicator value for this PerformedActivity.
     * 
     * @param missedIndicator Specifies whether an activity was not done. 
 * 
 * For example, Y designates that the PerformedActivity was missed.
     */
    public void setMissedIndicator(gov.nih.nci.cabig.ccts.domain.cdt.BL missedIndicator) {
        this.missedIndicator = missedIndicator;
    }


    /**
     * Gets the missedReason value for this PerformedActivity.
     * 
     * @return missedReason The text and/or code that describes the rationale behind why an
 * activity is not done.
 * 
 * NOTE: This captures the Study Data Tabulation Model's (SDTM) reason
 * not done (REASND) Variable. At present there is no coded set of values.
 * In HL7, there is a list of permissible missing value types, and we
 * need to ensure that HL7's list is a superset of what is needed by
 * SDTM.
     */
    public java.lang.String getMissedReason() {
        return missedReason;
    }


    /**
     * Sets the missedReason value for this PerformedActivity.
     * 
     * @param missedReason The text and/or code that describes the rationale behind why an
 * activity is not done.
 * 
 * NOTE: This captures the Study Data Tabulation Model's (SDTM) reason
 * not done (REASND) Variable. At present there is no coded set of values.
 * In HL7, there is a list of permissible missing value types, and we
 * need to ensure that HL7's list is a superset of what is needed by
 * SDTM.
     */
    public void setMissedReason(java.lang.String missedReason) {
        this.missedReason = missedReason;
    }


    /**
     * Gets the scheduledActivity value for this PerformedActivity.
     * 
     * @return scheduledActivity
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.ScheduledActivity getScheduledActivity() {
        return scheduledActivity;
    }


    /**
     * Sets the scheduledActivity value for this PerformedActivity.
     * 
     * @param scheduledActivity
     */
    public void setScheduledActivity(gov.nih.nci.cabig.ccts.domain.bridg.ScheduledActivity scheduledActivity) {
        this.scheduledActivity = scheduledActivity;
    }


    /**
     * Gets the assessmentPerformedActivityRelationship value for this PerformedActivity.
     * 
     * @return assessmentPerformedActivityRelationship
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.AssessmentPerformedActivityRelationship[] getAssessmentPerformedActivityRelationship() {
        return assessmentPerformedActivityRelationship;
    }


    /**
     * Sets the assessmentPerformedActivityRelationship value for this PerformedActivity.
     * 
     * @param assessmentPerformedActivityRelationship
     */
    public void setAssessmentPerformedActivityRelationship(gov.nih.nci.cabig.ccts.domain.bridg.AssessmentPerformedActivityRelationship[] assessmentPerformedActivityRelationship) {
        this.assessmentPerformedActivityRelationship = assessmentPerformedActivityRelationship;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.AssessmentPerformedActivityRelationship getAssessmentPerformedActivityRelationship(int i) {
        return this.assessmentPerformedActivityRelationship[i];
    }

    public void setAssessmentPerformedActivityRelationship(int i, gov.nih.nci.cabig.ccts.domain.bridg.AssessmentPerformedActivityRelationship _value) {
        this.assessmentPerformedActivityRelationship[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformedActivity)) return false;
        PerformedActivity other = (PerformedActivity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actualDateRange==null && other.getActualDateRange()==null) || 
             (this.actualDateRange!=null &&
              this.actualDateRange.equals(other.getActualDateRange()))) &&
            ((this.actualDuration==null && other.getActualDuration()==null) || 
             (this.actualDuration!=null &&
              this.actualDuration.equals(other.getActualDuration()))) &&
            ((this.effectiveDateRange==null && other.getEffectiveDateRange()==null) || 
             (this.effectiveDateRange!=null &&
              this.effectiveDateRange.equals(other.getEffectiveDateRange()))) &&
            ((this.effectiveDuration==null && other.getEffectiveDuration()==null) || 
             (this.effectiveDuration!=null &&
              this.effectiveDuration.equals(other.getEffectiveDuration()))) &&
            ((this.missedIndicator==null && other.getMissedIndicator()==null) || 
             (this.missedIndicator!=null &&
              this.missedIndicator.equals(other.getMissedIndicator()))) &&
            ((this.missedReason==null && other.getMissedReason()==null) || 
             (this.missedReason!=null &&
              this.missedReason.equals(other.getMissedReason()))) &&
            ((this.scheduledActivity==null && other.getScheduledActivity()==null) || 
             (this.scheduledActivity!=null &&
              this.scheduledActivity.equals(other.getScheduledActivity()))) &&
            ((this.assessmentPerformedActivityRelationship==null && other.getAssessmentPerformedActivityRelationship()==null) || 
             (this.assessmentPerformedActivityRelationship!=null &&
              java.util.Arrays.equals(this.assessmentPerformedActivityRelationship, other.getAssessmentPerformedActivityRelationship())));
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
        if (getActualDateRange() != null) {
            _hashCode += getActualDateRange().hashCode();
        }
        if (getActualDuration() != null) {
            _hashCode += getActualDuration().hashCode();
        }
        if (getEffectiveDateRange() != null) {
            _hashCode += getEffectiveDateRange().hashCode();
        }
        if (getEffectiveDuration() != null) {
            _hashCode += getEffectiveDuration().hashCode();
        }
        if (getMissedIndicator() != null) {
            _hashCode += getMissedIndicator().hashCode();
        }
        if (getMissedReason() != null) {
            _hashCode += getMissedReason().hashCode();
        }
        if (getScheduledActivity() != null) {
            _hashCode += getScheduledActivity().hashCode();
        }
        if (getAssessmentPerformedActivityRelationship() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssessmentPerformedActivityRelationship());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssessmentPerformedActivityRelationship(), i);
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
        new org.apache.axis.description.TypeDesc(PerformedActivity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedActivity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualDateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "actualDateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "IVLTS"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "actualDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "PQ"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "effectiveDateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "IVLTS"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "effectiveDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "PQ"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("missedIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "missedIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "BL"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("missedReason");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "missedReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledActivity");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledActivity"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledActivity"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assessmentPerformedActivityRelationship");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "AssessmentPerformedActivityRelationship"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "AssessmentPerformedActivityRelationship"));
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
