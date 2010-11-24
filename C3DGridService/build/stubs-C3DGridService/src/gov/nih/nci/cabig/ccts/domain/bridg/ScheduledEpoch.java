/**
 * ScheduledEpoch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A subject passes through a series of states called Epochs in the
 * course of their participation in a study.  Each Epoch serves a purpose
 * in the trial as a whole, typically exposing the subject to a treatment
 * or preparing them for a treatment, or gathering post-treatment data.
 * Epoch-specific (state) transition rules control the subject's movement
 * from one Epoch to another.
 * 
 * For example, a trial designed to assess the effects of treatments
 * might have 3 epochs, a Screening epoch in which subjects' eligibility
 * is determined and baseline measurements are made, a Treatment epoch
 * during which treatments are given and effects of treatment are assessed,
 * and a Follow-up epoch during which post-treatment assessments are
 * conducted.
 */
public class ScheduledEpoch  implements java.io.Serializable {
    /** Human readable text describes what happens to the subject during
 * the state (Epoch). 
 * 
 * For example for "Screening" Epoch, description could be determine
 * whether subject is eligible and obtain baseline measurements. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST description;
    /** Specifies whether the identification of a single Epoch among a
 * collection of Epochs as the ‘start state.’  This implies the existence
 * business rule that in a given collection of Epochs (states), there
 * can be one-and-only-one Epoch instance with the value of its firstEpochIndicator
 * set to Y.
 * 
 * For example, the very first epoch in a study would be set to Y. */
    private gov.nih.nci.cabig.ccts.domain.cdt.BL firstEpochIndicator;
    /** The protocol-assigned name for a state that may happen to a subject
 * in the course of the study.
 * 
 * For example, "Screening" or "Treatment"  is a particular state. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST name;
    /** The date and time on which the subject is expected to start this
 * epoch. */
    private gov.nih.nci.cabig.ccts.domain.cdt.TS scheduledStartDate;
    /** A coded value which indicates the general scope of the activities
 * that occur in the various arms of the Epoch. 
 * 
 * For example, screening, treatment, follow-up, etc. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD type;
    private gov.nih.nci.cabig.ccts.domain.bridg.PerformedEpoch performedEpoch;

    public ScheduledEpoch() {
    }

    public ScheduledEpoch(
           gov.nih.nci.cabig.ccts.domain.cdt.ST description,
           gov.nih.nci.cabig.ccts.domain.cdt.BL firstEpochIndicator,
           gov.nih.nci.cabig.ccts.domain.cdt.ST name,
           gov.nih.nci.cabig.ccts.domain.bridg.PerformedEpoch performedEpoch,
           gov.nih.nci.cabig.ccts.domain.cdt.TS scheduledStartDate,
           gov.nih.nci.cabig.ccts.domain.cdt.CD type) {
           this.description = description;
           this.firstEpochIndicator = firstEpochIndicator;
           this.name = name;
           this.scheduledStartDate = scheduledStartDate;
           this.type = type;
           this.performedEpoch = performedEpoch;
    }


    /**
     * Gets the description value for this ScheduledEpoch.
     * 
     * @return description Human readable text describes what happens to the subject during
 * the state (Epoch). 
 * 
 * For example for "Screening" Epoch, description could be determine
 * whether subject is eligible and obtain baseline measurements.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ScheduledEpoch.
     * 
     * @param description Human readable text describes what happens to the subject during
 * the state (Epoch). 
 * 
 * For example for "Screening" Epoch, description could be determine
 * whether subject is eligible and obtain baseline measurements.
     */
    public void setDescription(gov.nih.nci.cabig.ccts.domain.cdt.ST description) {
        this.description = description;
    }


    /**
     * Gets the firstEpochIndicator value for this ScheduledEpoch.
     * 
     * @return firstEpochIndicator Specifies whether the identification of a single Epoch among a
 * collection of Epochs as the ‘start state.’  This implies the existence
 * business rule that in a given collection of Epochs (states), there
 * can be one-and-only-one Epoch instance with the value of its firstEpochIndicator
 * set to Y.
 * 
 * For example, the very first epoch in a study would be set to Y.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.BL getFirstEpochIndicator() {
        return firstEpochIndicator;
    }


    /**
     * Sets the firstEpochIndicator value for this ScheduledEpoch.
     * 
     * @param firstEpochIndicator Specifies whether the identification of a single Epoch among a
 * collection of Epochs as the ‘start state.’  This implies the existence
 * business rule that in a given collection of Epochs (states), there
 * can be one-and-only-one Epoch instance with the value of its firstEpochIndicator
 * set to Y.
 * 
 * For example, the very first epoch in a study would be set to Y.
     */
    public void setFirstEpochIndicator(gov.nih.nci.cabig.ccts.domain.cdt.BL firstEpochIndicator) {
        this.firstEpochIndicator = firstEpochIndicator;
    }


    /**
     * Gets the name value for this ScheduledEpoch.
     * 
     * @return name The protocol-assigned name for a state that may happen to a subject
 * in the course of the study.
 * 
 * For example, "Screening" or "Treatment"  is a particular state.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getName() {
        return name;
    }


    /**
     * Sets the name value for this ScheduledEpoch.
     * 
     * @param name The protocol-assigned name for a state that may happen to a subject
 * in the course of the study.
 * 
 * For example, "Screening" or "Treatment"  is a particular state.
     */
    public void setName(gov.nih.nci.cabig.ccts.domain.cdt.ST name) {
        this.name = name;
    }


    /**
     * Gets the scheduledStartDate value for this ScheduledEpoch.
     * 
     * @return scheduledStartDate The date and time on which the subject is expected to start this
 * epoch.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.TS getScheduledStartDate() {
        return scheduledStartDate;
    }


    /**
     * Sets the scheduledStartDate value for this ScheduledEpoch.
     * 
     * @param scheduledStartDate The date and time on which the subject is expected to start this
 * epoch.
     */
    public void setScheduledStartDate(gov.nih.nci.cabig.ccts.domain.cdt.TS scheduledStartDate) {
        this.scheduledStartDate = scheduledStartDate;
    }


    /**
     * Gets the type value for this ScheduledEpoch.
     * 
     * @return type A coded value which indicates the general scope of the activities
 * that occur in the various arms of the Epoch. 
 * 
 * For example, screening, treatment, follow-up, etc.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getType() {
        return type;
    }


    /**
     * Sets the type value for this ScheduledEpoch.
     * 
     * @param type A coded value which indicates the general scope of the activities
 * that occur in the various arms of the Epoch. 
 * 
 * For example, screening, treatment, follow-up, etc.
     */
    public void setType(gov.nih.nci.cabig.ccts.domain.cdt.CD type) {
        this.type = type;
    }


    /**
     * Gets the performedEpoch value for this ScheduledEpoch.
     * 
     * @return performedEpoch
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedEpoch getPerformedEpoch() {
        return performedEpoch;
    }


    /**
     * Sets the performedEpoch value for this ScheduledEpoch.
     * 
     * @param performedEpoch
     */
    public void setPerformedEpoch(gov.nih.nci.cabig.ccts.domain.bridg.PerformedEpoch performedEpoch) {
        this.performedEpoch = performedEpoch;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduledEpoch)) return false;
        ScheduledEpoch other = (ScheduledEpoch) obj;
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
            ((this.firstEpochIndicator==null && other.getFirstEpochIndicator()==null) || 
             (this.firstEpochIndicator!=null &&
              this.firstEpochIndicator.equals(other.getFirstEpochIndicator()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.scheduledStartDate==null && other.getScheduledStartDate()==null) || 
             (this.scheduledStartDate!=null &&
              this.scheduledStartDate.equals(other.getScheduledStartDate()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.performedEpoch==null && other.getPerformedEpoch()==null) || 
             (this.performedEpoch!=null &&
              this.performedEpoch.equals(other.getPerformedEpoch())));
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
        if (getFirstEpochIndicator() != null) {
            _hashCode += getFirstEpochIndicator().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getScheduledStartDate() != null) {
            _hashCode += getScheduledStartDate().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getPerformedEpoch() != null) {
            _hashCode += getPerformedEpoch().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScheduledEpoch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledEpoch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstEpochIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "firstEpochIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "BL"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "scheduledStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "TS"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performedEpoch");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedEpoch"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedEpoch"));
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
