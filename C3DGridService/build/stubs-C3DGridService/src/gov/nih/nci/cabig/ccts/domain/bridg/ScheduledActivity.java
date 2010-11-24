/**
 * ScheduledActivity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A business process state of an activity which describes activities
 * which have been associated with a particular subject and assigned
 * a time or date when that activity is to be performed.
 * 
 * For example, an X-Ray scheduled for February 15 is in state "Scheduled."
 * If John is unable to have the X-Ray on that date, the X-Ray would
 * either be rescheduled (remain in "Scheduled" state, but "date" attribute
 * would change) or moved to state "Canceled."
 */
public class ScheduledActivity  extends gov.nih.nci.cabig.ccts.domain.bridg.Activity  implements java.io.Serializable {
    /** The date and time that the activity is scheduled to begin and end. */
    private gov.nih.nci.cabig.ccts.domain.cdt.IVLTS scheduledDateRange;
    /** Scheduled length of time of the activity performed. */
    private gov.nih.nci.cabig.ccts.domain.cdt.PQ scheduledDuration;
    /** A span of integers specifying the minimum and maximum number of
 * repetitions of the ScheduledActivity.  The number of repeats is additionally
 * constrained by time. 
 * 
 * NOTE: The ScheduledActivity will repeat at least the minimum number
 * of times and at most, the maximum number of times. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST scheduledRangeOfRepetitions;
    private gov.nih.nci.cabig.ccts.domain.bridg.ScheduledActivityStudySegmentRule[] scheduledActivityStudySegmentRule;

    public ScheduledActivity() {
    }

    public ScheduledActivity(
           gov.nih.nci.cabig.ccts.domain.bridg.ScheduledActivityStudySegmentRule[] scheduledActivityStudySegmentRule,
           gov.nih.nci.cabig.ccts.domain.cdt.IVLTS scheduledDateRange,
           gov.nih.nci.cabig.ccts.domain.cdt.PQ scheduledDuration,
           gov.nih.nci.cabig.ccts.domain.cdt.ST scheduledRangeOfRepetitions) {
           this.scheduledDateRange = scheduledDateRange;
           this.scheduledDuration = scheduledDuration;
           this.scheduledRangeOfRepetitions = scheduledRangeOfRepetitions;
           this.scheduledActivityStudySegmentRule = scheduledActivityStudySegmentRule;
    }


    /**
     * Gets the scheduledDateRange value for this ScheduledActivity.
     * 
     * @return scheduledDateRange The date and time that the activity is scheduled to begin and end.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.IVLTS getScheduledDateRange() {
        return scheduledDateRange;
    }


    /**
     * Sets the scheduledDateRange value for this ScheduledActivity.
     * 
     * @param scheduledDateRange The date and time that the activity is scheduled to begin and end.
     */
    public void setScheduledDateRange(gov.nih.nci.cabig.ccts.domain.cdt.IVLTS scheduledDateRange) {
        this.scheduledDateRange = scheduledDateRange;
    }


    /**
     * Gets the scheduledDuration value for this ScheduledActivity.
     * 
     * @return scheduledDuration Scheduled length of time of the activity performed.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.PQ getScheduledDuration() {
        return scheduledDuration;
    }


    /**
     * Sets the scheduledDuration value for this ScheduledActivity.
     * 
     * @param scheduledDuration Scheduled length of time of the activity performed.
     */
    public void setScheduledDuration(gov.nih.nci.cabig.ccts.domain.cdt.PQ scheduledDuration) {
        this.scheduledDuration = scheduledDuration;
    }


    /**
     * Gets the scheduledRangeOfRepetitions value for this ScheduledActivity.
     * 
     * @return scheduledRangeOfRepetitions A span of integers specifying the minimum and maximum number of
 * repetitions of the ScheduledActivity.  The number of repeats is additionally
 * constrained by time. 
 * 
 * NOTE: The ScheduledActivity will repeat at least the minimum number
 * of times and at most, the maximum number of times.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getScheduledRangeOfRepetitions() {
        return scheduledRangeOfRepetitions;
    }


    /**
     * Sets the scheduledRangeOfRepetitions value for this ScheduledActivity.
     * 
     * @param scheduledRangeOfRepetitions A span of integers specifying the minimum and maximum number of
 * repetitions of the ScheduledActivity.  The number of repeats is additionally
 * constrained by time. 
 * 
 * NOTE: The ScheduledActivity will repeat at least the minimum number
 * of times and at most, the maximum number of times.
     */
    public void setScheduledRangeOfRepetitions(gov.nih.nci.cabig.ccts.domain.cdt.ST scheduledRangeOfRepetitions) {
        this.scheduledRangeOfRepetitions = scheduledRangeOfRepetitions;
    }


    /**
     * Gets the scheduledActivityStudySegmentRule value for this ScheduledActivity.
     * 
     * @return scheduledActivityStudySegmentRule
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.ScheduledActivityStudySegmentRule[] getScheduledActivityStudySegmentRule() {
        return scheduledActivityStudySegmentRule;
    }


    /**
     * Sets the scheduledActivityStudySegmentRule value for this ScheduledActivity.
     * 
     * @param scheduledActivityStudySegmentRule
     */
    public void setScheduledActivityStudySegmentRule(gov.nih.nci.cabig.ccts.domain.bridg.ScheduledActivityStudySegmentRule[] scheduledActivityStudySegmentRule) {
        this.scheduledActivityStudySegmentRule = scheduledActivityStudySegmentRule;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.ScheduledActivityStudySegmentRule getScheduledActivityStudySegmentRule(int i) {
        return this.scheduledActivityStudySegmentRule[i];
    }

    public void setScheduledActivityStudySegmentRule(int i, gov.nih.nci.cabig.ccts.domain.bridg.ScheduledActivityStudySegmentRule _value) {
        this.scheduledActivityStudySegmentRule[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduledActivity)) return false;
        ScheduledActivity other = (ScheduledActivity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.scheduledDateRange==null && other.getScheduledDateRange()==null) || 
             (this.scheduledDateRange!=null &&
              this.scheduledDateRange.equals(other.getScheduledDateRange()))) &&
            ((this.scheduledDuration==null && other.getScheduledDuration()==null) || 
             (this.scheduledDuration!=null &&
              this.scheduledDuration.equals(other.getScheduledDuration()))) &&
            ((this.scheduledRangeOfRepetitions==null && other.getScheduledRangeOfRepetitions()==null) || 
             (this.scheduledRangeOfRepetitions!=null &&
              this.scheduledRangeOfRepetitions.equals(other.getScheduledRangeOfRepetitions()))) &&
            ((this.scheduledActivityStudySegmentRule==null && other.getScheduledActivityStudySegmentRule()==null) || 
             (this.scheduledActivityStudySegmentRule!=null &&
              java.util.Arrays.equals(this.scheduledActivityStudySegmentRule, other.getScheduledActivityStudySegmentRule())));
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
        if (getScheduledDateRange() != null) {
            _hashCode += getScheduledDateRange().hashCode();
        }
        if (getScheduledDuration() != null) {
            _hashCode += getScheduledDuration().hashCode();
        }
        if (getScheduledRangeOfRepetitions() != null) {
            _hashCode += getScheduledRangeOfRepetitions().hashCode();
        }
        if (getScheduledActivityStudySegmentRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScheduledActivityStudySegmentRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScheduledActivityStudySegmentRule(), i);
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
        new org.apache.axis.description.TypeDesc(ScheduledActivity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledActivity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledDateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "scheduledDateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "IVLTS"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "scheduledDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "PQ"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledRangeOfRepetitions");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "scheduledRangeOfRepetitions"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledActivityStudySegmentRule");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledActivityStudySegmentRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledActivityStudySegmentRule"));
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
