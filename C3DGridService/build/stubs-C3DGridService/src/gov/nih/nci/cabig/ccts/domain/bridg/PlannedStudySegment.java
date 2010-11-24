/**
 * PlannedStudySegment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * States that subjects pass through in the course of a study.  They
 * involve some planned intervention (possibly "no treatment") and an
 * instance of a PlannedStudySegment serves all or part of the purpose
 * of a PlannedEpoch.  PlannedStudySegments are sub-states of epochs
 * in the sense that PlannedStudySegments never cross epoch boundaries;
 * when a subject transitions from one epoch to another they must also
 * transition from one StudySegment to another. 
 *  
 * For example, the purpose of a treatment epoch might be accomplished
 * by means of a single StudySegment (e.g., one which involves administering
 * drug daily for 6 weeks) or by a complex pattern of StudySegments (e.g.,
 * a subject is to pass through StudySegment A, which involves daily
 * self-administration of drug X, then StudySegment B, which involves
 * a single infusion of Drug Y, then StudySegment C, a 3-week "rest"
 * period; the ABC sequence is repeated until disease progression or
 * Serious Adverse Event (SAE) X occurs.  If X occurs, B is dropped and
 * AC is repeated until disease progression).
 */
public class PlannedStudySegment  implements java.io.Serializable {
    /** The human-readable text describing a state that may happen to a
 * subject in the course of the study.
 * 
 * For example, "Wait for genital herpes episode" is a description of
 * a particular state.
 * 
 * For example for StudySegment, in a migraine trial, the Wait StudySegment
 * may have a description of "Wait until first grade 2 or 3 migraine". */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST description;
    /** Specifies whether the identification of a single study segment
 * among a collection of study segments as the ‘start state.’  This implies
 * the existence business rule that in a given collection of study segments,
 * there can be one-and-only-one study segment instance with the value
 * of its firstStudySegmentIndicator set to TRUE. */
    private gov.nih.nci.cabig.ccts.domain.cdt.BL firstStudySegmentIndicator;
    /** The protocol-assigned name for a state that may happen to a subject
 * in the course of the study.
 * 
 * For example, "Wait" is a particular state. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST name;
    /** Intended duration of the study segment as defined by the study.
 * 
 * For example, 6 weeks. */
    private gov.nih.nci.cabig.ccts.domain.cdt.PQ plannedDuration;
    private gov.nih.nci.cabig.ccts.domain.bridg.PlannedActivity[] plannedActivity;

    public PlannedStudySegment() {
    }

    public PlannedStudySegment(
           gov.nih.nci.cabig.ccts.domain.cdt.ST description,
           gov.nih.nci.cabig.ccts.domain.cdt.BL firstStudySegmentIndicator,
           gov.nih.nci.cabig.ccts.domain.cdt.ST name,
           gov.nih.nci.cabig.ccts.domain.bridg.PlannedActivity[] plannedActivity,
           gov.nih.nci.cabig.ccts.domain.cdt.PQ plannedDuration) {
           this.description = description;
           this.firstStudySegmentIndicator = firstStudySegmentIndicator;
           this.name = name;
           this.plannedDuration = plannedDuration;
           this.plannedActivity = plannedActivity;
    }


    /**
     * Gets the description value for this PlannedStudySegment.
     * 
     * @return description The human-readable text describing a state that may happen to a
 * subject in the course of the study.
 * 
 * For example, "Wait for genital herpes episode" is a description of
 * a particular state.
 * 
 * For example for StudySegment, in a migraine trial, the Wait StudySegment
 * may have a description of "Wait until first grade 2 or 3 migraine".
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PlannedStudySegment.
     * 
     * @param description The human-readable text describing a state that may happen to a
 * subject in the course of the study.
 * 
 * For example, "Wait for genital herpes episode" is a description of
 * a particular state.
 * 
 * For example for StudySegment, in a migraine trial, the Wait StudySegment
 * may have a description of "Wait until first grade 2 or 3 migraine".
     */
    public void setDescription(gov.nih.nci.cabig.ccts.domain.cdt.ST description) {
        this.description = description;
    }


    /**
     * Gets the firstStudySegmentIndicator value for this PlannedStudySegment.
     * 
     * @return firstStudySegmentIndicator Specifies whether the identification of a single study segment
 * among a collection of study segments as the ‘start state.’  This implies
 * the existence business rule that in a given collection of study segments,
 * there can be one-and-only-one study segment instance with the value
 * of its firstStudySegmentIndicator set to TRUE.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.BL getFirstStudySegmentIndicator() {
        return firstStudySegmentIndicator;
    }


    /**
     * Sets the firstStudySegmentIndicator value for this PlannedStudySegment.
     * 
     * @param firstStudySegmentIndicator Specifies whether the identification of a single study segment
 * among a collection of study segments as the ‘start state.’  This implies
 * the existence business rule that in a given collection of study segments,
 * there can be one-and-only-one study segment instance with the value
 * of its firstStudySegmentIndicator set to TRUE.
     */
    public void setFirstStudySegmentIndicator(gov.nih.nci.cabig.ccts.domain.cdt.BL firstStudySegmentIndicator) {
        this.firstStudySegmentIndicator = firstStudySegmentIndicator;
    }


    /**
     * Gets the name value for this PlannedStudySegment.
     * 
     * @return name The protocol-assigned name for a state that may happen to a subject
 * in the course of the study.
 * 
 * For example, "Wait" is a particular state.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getName() {
        return name;
    }


    /**
     * Sets the name value for this PlannedStudySegment.
     * 
     * @param name The protocol-assigned name for a state that may happen to a subject
 * in the course of the study.
 * 
 * For example, "Wait" is a particular state.
     */
    public void setName(gov.nih.nci.cabig.ccts.domain.cdt.ST name) {
        this.name = name;
    }


    /**
     * Gets the plannedDuration value for this PlannedStudySegment.
     * 
     * @return plannedDuration Intended duration of the study segment as defined by the study.
 * 
 * For example, 6 weeks.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.PQ getPlannedDuration() {
        return plannedDuration;
    }


    /**
     * Sets the plannedDuration value for this PlannedStudySegment.
     * 
     * @param plannedDuration Intended duration of the study segment as defined by the study.
 * 
 * For example, 6 weeks.
     */
    public void setPlannedDuration(gov.nih.nci.cabig.ccts.domain.cdt.PQ plannedDuration) {
        this.plannedDuration = plannedDuration;
    }


    /**
     * Gets the plannedActivity value for this PlannedStudySegment.
     * 
     * @return plannedActivity
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PlannedActivity[] getPlannedActivity() {
        return plannedActivity;
    }


    /**
     * Sets the plannedActivity value for this PlannedStudySegment.
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
        if (!(obj instanceof PlannedStudySegment)) return false;
        PlannedStudySegment other = (PlannedStudySegment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.firstStudySegmentIndicator==null && other.getFirstStudySegmentIndicator()==null) || 
             (this.firstStudySegmentIndicator!=null &&
              this.firstStudySegmentIndicator.equals(other.getFirstStudySegmentIndicator()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.plannedDuration==null && other.getPlannedDuration()==null) || 
             (this.plannedDuration!=null &&
              this.plannedDuration.equals(other.getPlannedDuration()))) &&
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
        int _hashCode = 1;
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFirstStudySegmentIndicator() != null) {
            _hashCode += getFirstStudySegmentIndicator().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPlannedDuration() != null) {
            _hashCode += getPlannedDuration().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(PlannedStudySegment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedStudySegment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstStudySegmentIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "firstStudySegmentIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "BL"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "plannedDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "PQ"));
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
