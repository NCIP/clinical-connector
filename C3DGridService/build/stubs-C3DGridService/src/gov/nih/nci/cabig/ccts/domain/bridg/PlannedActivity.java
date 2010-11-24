/**
 * PlannedActivity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * An activity that is anticipated to occur at some time in the future.
 * 
 * 
 * For example, pregnancy tests are planned for study subjects who are
 * females of childbearing potential.  The pregnancy tests are in the
 * future, and the particular women who will be tested have not been
 * identified.
 * 
 * NOTE: A planned activity could also be thought of as an activity at
 * a particular stage in the business process in which the activities
 * occur.  I.e., in the "planned" stage rather than the "scheduled" stage
 * or the "performed" stage. An instance of a planned activity is not
 * assigned to a particular study subject, but to a "kind of" study subject.
 */
public class PlannedActivity  extends gov.nih.nci.cabig.ccts.domain.bridg.Activity  implements java.io.Serializable {
    /** Specifies whether an instance of an actiivty is an actual Activity
 * (actualtIndicator = Y) or placeholder for an Actiivty (actualIndicator
 * = N) . */
    private gov.nih.nci.cabig.ccts.domain.cdt.BL actualIndicator;
    /** Additional textual comment about the duration or the timing of
 * the activity, or its relationship to other events.
 * 
 * For example, post dose or 2 hours post dose per preference. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST additionalDurationDescription;
    /** Specifies whether a given activity is available to be made part
 * of a planned sequence should an activity associated be invoked.  The
 * one or more triggers invoking a contingent activity are associated
 * with the one or more PlannedActivities that can in fact invoke the
 * contingent activity.
 * 
 * Assumption:  ActivityRule defines the transition of one instance of
 * PlannedActivity to the next instance of PlannedActivity . */
    private gov.nih.nci.cabig.ccts.domain.cdt.BL contingentIndicator;
    /** A description of when an activity is executed once a PlannedStudySegment
 * substate is entered.
 * 
 * For example, on-entry, on-exit, or in-state. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD inStudySegmentPlannedActivityType;
    /** Intended duration of the activity as defined by the study. */
    private gov.nih.nci.cabig.ccts.domain.cdt.BRIDGRelativeTS plannedDuration;
    /** A range of integers specifying the minimum and maximum number of
 * repetitions of the PlannedActivity.  The number of repeats is additionally
 * constrained by time. The PlannedActivity will repeat at least the
 * minimum number of times and at most, the maximum number of times.
 * 
 * 
 * For example, some clinical trials will specify a minimum and maximum
 * number of chemotherapy cycles. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST plannedRangeOfRepetitions;
    private gov.nih.nci.cabig.ccts.domain.bridg.ScheduledActivity[] scheduledActivity;
    private gov.nih.nci.cabig.ccts.domain.bridg.PerformedActivity performedActivity;
    private gov.nih.nci.cabig.ccts.domain.bridg.PlannedActivityStudySegmentRule[] plannedActivityStudySegmentRule;
    private gov.nih.nci.cabig.ccts.domain.bridg.PlannedObservationResult[] plannedObservationResult;

    public PlannedActivity() {
    }

    public PlannedActivity(
           gov.nih.nci.cabig.ccts.domain.cdt.BL actualIndicator,
           gov.nih.nci.cabig.ccts.domain.cdt.ST additionalDurationDescription,
           gov.nih.nci.cabig.ccts.domain.cdt.BL contingentIndicator,
           gov.nih.nci.cabig.ccts.domain.cdt.CD inStudySegmentPlannedActivityType,
           gov.nih.nci.cabig.ccts.domain.bridg.PerformedActivity performedActivity,
           gov.nih.nci.cabig.ccts.domain.bridg.PlannedActivityStudySegmentRule[] plannedActivityStudySegmentRule,
           gov.nih.nci.cabig.ccts.domain.cdt.BRIDGRelativeTS plannedDuration,
           gov.nih.nci.cabig.ccts.domain.bridg.PlannedObservationResult[] plannedObservationResult,
           gov.nih.nci.cabig.ccts.domain.cdt.ST plannedRangeOfRepetitions,
           gov.nih.nci.cabig.ccts.domain.bridg.ScheduledActivity[] scheduledActivity) {
           this.actualIndicator = actualIndicator;
           this.additionalDurationDescription = additionalDurationDescription;
           this.contingentIndicator = contingentIndicator;
           this.inStudySegmentPlannedActivityType = inStudySegmentPlannedActivityType;
           this.plannedDuration = plannedDuration;
           this.plannedRangeOfRepetitions = plannedRangeOfRepetitions;
           this.scheduledActivity = scheduledActivity;
           this.performedActivity = performedActivity;
           this.plannedActivityStudySegmentRule = plannedActivityStudySegmentRule;
           this.plannedObservationResult = plannedObservationResult;
    }


    /**
     * Gets the actualIndicator value for this PlannedActivity.
     * 
     * @return actualIndicator Specifies whether an instance of an actiivty is an actual Activity
 * (actualtIndicator = Y) or placeholder for an Actiivty (actualIndicator
 * = N) .
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.BL getActualIndicator() {
        return actualIndicator;
    }


    /**
     * Sets the actualIndicator value for this PlannedActivity.
     * 
     * @param actualIndicator Specifies whether an instance of an actiivty is an actual Activity
 * (actualtIndicator = Y) or placeholder for an Actiivty (actualIndicator
 * = N) .
     */
    public void setActualIndicator(gov.nih.nci.cabig.ccts.domain.cdt.BL actualIndicator) {
        this.actualIndicator = actualIndicator;
    }


    /**
     * Gets the additionalDurationDescription value for this PlannedActivity.
     * 
     * @return additionalDurationDescription Additional textual comment about the duration or the timing of
 * the activity, or its relationship to other events.
 * 
 * For example, post dose or 2 hours post dose per preference.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getAdditionalDurationDescription() {
        return additionalDurationDescription;
    }


    /**
     * Sets the additionalDurationDescription value for this PlannedActivity.
     * 
     * @param additionalDurationDescription Additional textual comment about the duration or the timing of
 * the activity, or its relationship to other events.
 * 
 * For example, post dose or 2 hours post dose per preference.
     */
    public void setAdditionalDurationDescription(gov.nih.nci.cabig.ccts.domain.cdt.ST additionalDurationDescription) {
        this.additionalDurationDescription = additionalDurationDescription;
    }


    /**
     * Gets the contingentIndicator value for this PlannedActivity.
     * 
     * @return contingentIndicator Specifies whether a given activity is available to be made part
 * of a planned sequence should an activity associated be invoked.  The
 * one or more triggers invoking a contingent activity are associated
 * with the one or more PlannedActivities that can in fact invoke the
 * contingent activity.
 * 
 * Assumption:  ActivityRule defines the transition of one instance of
 * PlannedActivity to the next instance of PlannedActivity .
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.BL getContingentIndicator() {
        return contingentIndicator;
    }


    /**
     * Sets the contingentIndicator value for this PlannedActivity.
     * 
     * @param contingentIndicator Specifies whether a given activity is available to be made part
 * of a planned sequence should an activity associated be invoked.  The
 * one or more triggers invoking a contingent activity are associated
 * with the one or more PlannedActivities that can in fact invoke the
 * contingent activity.
 * 
 * Assumption:  ActivityRule defines the transition of one instance of
 * PlannedActivity to the next instance of PlannedActivity .
     */
    public void setContingentIndicator(gov.nih.nci.cabig.ccts.domain.cdt.BL contingentIndicator) {
        this.contingentIndicator = contingentIndicator;
    }


    /**
     * Gets the inStudySegmentPlannedActivityType value for this PlannedActivity.
     * 
     * @return inStudySegmentPlannedActivityType A description of when an activity is executed once a PlannedStudySegment
 * substate is entered.
 * 
 * For example, on-entry, on-exit, or in-state.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getInStudySegmentPlannedActivityType() {
        return inStudySegmentPlannedActivityType;
    }


    /**
     * Sets the inStudySegmentPlannedActivityType value for this PlannedActivity.
     * 
     * @param inStudySegmentPlannedActivityType A description of when an activity is executed once a PlannedStudySegment
 * substate is entered.
 * 
 * For example, on-entry, on-exit, or in-state.
     */
    public void setInStudySegmentPlannedActivityType(gov.nih.nci.cabig.ccts.domain.cdt.CD inStudySegmentPlannedActivityType) {
        this.inStudySegmentPlannedActivityType = inStudySegmentPlannedActivityType;
    }


    /**
     * Gets the plannedDuration value for this PlannedActivity.
     * 
     * @return plannedDuration Intended duration of the activity as defined by the study.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.BRIDGRelativeTS getPlannedDuration() {
        return plannedDuration;
    }


    /**
     * Sets the plannedDuration value for this PlannedActivity.
     * 
     * @param plannedDuration Intended duration of the activity as defined by the study.
     */
    public void setPlannedDuration(gov.nih.nci.cabig.ccts.domain.cdt.BRIDGRelativeTS plannedDuration) {
        this.plannedDuration = plannedDuration;
    }


    /**
     * Gets the plannedRangeOfRepetitions value for this PlannedActivity.
     * 
     * @return plannedRangeOfRepetitions A range of integers specifying the minimum and maximum number of
 * repetitions of the PlannedActivity.  The number of repeats is additionally
 * constrained by time. The PlannedActivity will repeat at least the
 * minimum number of times and at most, the maximum number of times.
 * 
 * 
 * For example, some clinical trials will specify a minimum and maximum
 * number of chemotherapy cycles.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getPlannedRangeOfRepetitions() {
        return plannedRangeOfRepetitions;
    }


    /**
     * Sets the plannedRangeOfRepetitions value for this PlannedActivity.
     * 
     * @param plannedRangeOfRepetitions A range of integers specifying the minimum and maximum number of
 * repetitions of the PlannedActivity.  The number of repeats is additionally
 * constrained by time. The PlannedActivity will repeat at least the
 * minimum number of times and at most, the maximum number of times.
 * 
 * 
 * For example, some clinical trials will specify a minimum and maximum
 * number of chemotherapy cycles.
     */
    public void setPlannedRangeOfRepetitions(gov.nih.nci.cabig.ccts.domain.cdt.ST plannedRangeOfRepetitions) {
        this.plannedRangeOfRepetitions = plannedRangeOfRepetitions;
    }


    /**
     * Gets the scheduledActivity value for this PlannedActivity.
     * 
     * @return scheduledActivity
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.ScheduledActivity[] getScheduledActivity() {
        return scheduledActivity;
    }


    /**
     * Sets the scheduledActivity value for this PlannedActivity.
     * 
     * @param scheduledActivity
     */
    public void setScheduledActivity(gov.nih.nci.cabig.ccts.domain.bridg.ScheduledActivity[] scheduledActivity) {
        this.scheduledActivity = scheduledActivity;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.ScheduledActivity getScheduledActivity(int i) {
        return this.scheduledActivity[i];
    }

    public void setScheduledActivity(int i, gov.nih.nci.cabig.ccts.domain.bridg.ScheduledActivity _value) {
        this.scheduledActivity[i] = _value;
    }


    /**
     * Gets the performedActivity value for this PlannedActivity.
     * 
     * @return performedActivity
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedActivity getPerformedActivity() {
        return performedActivity;
    }


    /**
     * Sets the performedActivity value for this PlannedActivity.
     * 
     * @param performedActivity
     */
    public void setPerformedActivity(gov.nih.nci.cabig.ccts.domain.bridg.PerformedActivity performedActivity) {
        this.performedActivity = performedActivity;
    }


    /**
     * Gets the plannedActivityStudySegmentRule value for this PlannedActivity.
     * 
     * @return plannedActivityStudySegmentRule
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PlannedActivityStudySegmentRule[] getPlannedActivityStudySegmentRule() {
        return plannedActivityStudySegmentRule;
    }


    /**
     * Sets the plannedActivityStudySegmentRule value for this PlannedActivity.
     * 
     * @param plannedActivityStudySegmentRule
     */
    public void setPlannedActivityStudySegmentRule(gov.nih.nci.cabig.ccts.domain.bridg.PlannedActivityStudySegmentRule[] plannedActivityStudySegmentRule) {
        this.plannedActivityStudySegmentRule = plannedActivityStudySegmentRule;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.PlannedActivityStudySegmentRule getPlannedActivityStudySegmentRule(int i) {
        return this.plannedActivityStudySegmentRule[i];
    }

    public void setPlannedActivityStudySegmentRule(int i, gov.nih.nci.cabig.ccts.domain.bridg.PlannedActivityStudySegmentRule _value) {
        this.plannedActivityStudySegmentRule[i] = _value;
    }


    /**
     * Gets the plannedObservationResult value for this PlannedActivity.
     * 
     * @return plannedObservationResult
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PlannedObservationResult[] getPlannedObservationResult() {
        return plannedObservationResult;
    }


    /**
     * Sets the plannedObservationResult value for this PlannedActivity.
     * 
     * @param plannedObservationResult
     */
    public void setPlannedObservationResult(gov.nih.nci.cabig.ccts.domain.bridg.PlannedObservationResult[] plannedObservationResult) {
        this.plannedObservationResult = plannedObservationResult;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.PlannedObservationResult getPlannedObservationResult(int i) {
        return this.plannedObservationResult[i];
    }

    public void setPlannedObservationResult(int i, gov.nih.nci.cabig.ccts.domain.bridg.PlannedObservationResult _value) {
        this.plannedObservationResult[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlannedActivity)) return false;
        PlannedActivity other = (PlannedActivity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actualIndicator==null && other.getActualIndicator()==null) || 
             (this.actualIndicator!=null &&
              this.actualIndicator.equals(other.getActualIndicator()))) &&
            ((this.additionalDurationDescription==null && other.getAdditionalDurationDescription()==null) || 
             (this.additionalDurationDescription!=null &&
              this.additionalDurationDescription.equals(other.getAdditionalDurationDescription()))) &&
            ((this.contingentIndicator==null && other.getContingentIndicator()==null) || 
             (this.contingentIndicator!=null &&
              this.contingentIndicator.equals(other.getContingentIndicator()))) &&
            ((this.inStudySegmentPlannedActivityType==null && other.getInStudySegmentPlannedActivityType()==null) || 
             (this.inStudySegmentPlannedActivityType!=null &&
              this.inStudySegmentPlannedActivityType.equals(other.getInStudySegmentPlannedActivityType()))) &&
            ((this.plannedDuration==null && other.getPlannedDuration()==null) || 
             (this.plannedDuration!=null &&
              this.plannedDuration.equals(other.getPlannedDuration()))) &&
            ((this.plannedRangeOfRepetitions==null && other.getPlannedRangeOfRepetitions()==null) || 
             (this.plannedRangeOfRepetitions!=null &&
              this.plannedRangeOfRepetitions.equals(other.getPlannedRangeOfRepetitions()))) &&
            ((this.scheduledActivity==null && other.getScheduledActivity()==null) || 
             (this.scheduledActivity!=null &&
              java.util.Arrays.equals(this.scheduledActivity, other.getScheduledActivity()))) &&
            ((this.performedActivity==null && other.getPerformedActivity()==null) || 
             (this.performedActivity!=null &&
              this.performedActivity.equals(other.getPerformedActivity()))) &&
            ((this.plannedActivityStudySegmentRule==null && other.getPlannedActivityStudySegmentRule()==null) || 
             (this.plannedActivityStudySegmentRule!=null &&
              java.util.Arrays.equals(this.plannedActivityStudySegmentRule, other.getPlannedActivityStudySegmentRule()))) &&
            ((this.plannedObservationResult==null && other.getPlannedObservationResult()==null) || 
             (this.plannedObservationResult!=null &&
              java.util.Arrays.equals(this.plannedObservationResult, other.getPlannedObservationResult())));
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
        if (getActualIndicator() != null) {
            _hashCode += getActualIndicator().hashCode();
        }
        if (getAdditionalDurationDescription() != null) {
            _hashCode += getAdditionalDurationDescription().hashCode();
        }
        if (getContingentIndicator() != null) {
            _hashCode += getContingentIndicator().hashCode();
        }
        if (getInStudySegmentPlannedActivityType() != null) {
            _hashCode += getInStudySegmentPlannedActivityType().hashCode();
        }
        if (getPlannedDuration() != null) {
            _hashCode += getPlannedDuration().hashCode();
        }
        if (getPlannedRangeOfRepetitions() != null) {
            _hashCode += getPlannedRangeOfRepetitions().hashCode();
        }
        if (getScheduledActivity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScheduledActivity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScheduledActivity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPerformedActivity() != null) {
            _hashCode += getPerformedActivity().hashCode();
        }
        if (getPlannedActivityStudySegmentRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlannedActivityStudySegmentRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlannedActivityStudySegmentRule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPlannedObservationResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlannedObservationResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlannedObservationResult(), i);
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
        new org.apache.axis.description.TypeDesc(PlannedActivity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedActivity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "actualIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "BL"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalDurationDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "additionalDurationDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contingentIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "contingentIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "BL"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inStudySegmentPlannedActivityType");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "inStudySegmentPlannedActivityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "plannedDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "BRIDGRelativeTS"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedRangeOfRepetitions");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "plannedRangeOfRepetitions"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledActivity");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledActivity"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledActivity"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performedActivity");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedActivity"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedActivity"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedActivityStudySegmentRule");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedActivityStudySegmentRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedActivityStudySegmentRule"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedObservationResult");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedObservationResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedObservationResult"));
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
