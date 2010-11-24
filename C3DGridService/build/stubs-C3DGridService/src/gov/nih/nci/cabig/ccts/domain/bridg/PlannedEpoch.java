/**
 * PlannedEpoch.java
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
public class PlannedEpoch  implements java.io.Serializable {
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
    /** A coded value which indicates the general scope of the activities
 * that occur in the various arms of the Epoch. 
 * 
 * For example, screening, treatment, follow-up, harvest, etc. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD type;
    private gov.nih.nci.cabig.ccts.domain.bridg.PlannedEpochRule[] plannedEpochRule;
    private gov.nih.nci.cabig.ccts.domain.bridg.ScheduledEpoch[] scheduledEpoch;

    public PlannedEpoch() {
    }

    public PlannedEpoch(
           gov.nih.nci.cabig.ccts.domain.cdt.ST description,
           gov.nih.nci.cabig.ccts.domain.cdt.BL firstEpochIndicator,
           gov.nih.nci.cabig.ccts.domain.cdt.ST name,
           gov.nih.nci.cabig.ccts.domain.bridg.PlannedEpochRule[] plannedEpochRule,
           gov.nih.nci.cabig.ccts.domain.bridg.ScheduledEpoch[] scheduledEpoch,
           gov.nih.nci.cabig.ccts.domain.cdt.CD type) {
           this.description = description;
           this.firstEpochIndicator = firstEpochIndicator;
           this.name = name;
           this.type = type;
           this.plannedEpochRule = plannedEpochRule;
           this.scheduledEpoch = scheduledEpoch;
    }


    /**
     * Gets the description value for this PlannedEpoch.
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
     * Sets the description value for this PlannedEpoch.
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
     * Gets the firstEpochIndicator value for this PlannedEpoch.
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
     * Sets the firstEpochIndicator value for this PlannedEpoch.
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
     * Gets the name value for this PlannedEpoch.
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
     * Sets the name value for this PlannedEpoch.
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
     * Gets the type value for this PlannedEpoch.
     * 
     * @return type A coded value which indicates the general scope of the activities
 * that occur in the various arms of the Epoch. 
 * 
 * For example, screening, treatment, follow-up, harvest, etc.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getType() {
        return type;
    }


    /**
     * Sets the type value for this PlannedEpoch.
     * 
     * @param type A coded value which indicates the general scope of the activities
 * that occur in the various arms of the Epoch. 
 * 
 * For example, screening, treatment, follow-up, harvest, etc.
     */
    public void setType(gov.nih.nci.cabig.ccts.domain.cdt.CD type) {
        this.type = type;
    }


    /**
     * Gets the plannedEpochRule value for this PlannedEpoch.
     * 
     * @return plannedEpochRule
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PlannedEpochRule[] getPlannedEpochRule() {
        return plannedEpochRule;
    }


    /**
     * Sets the plannedEpochRule value for this PlannedEpoch.
     * 
     * @param plannedEpochRule
     */
    public void setPlannedEpochRule(gov.nih.nci.cabig.ccts.domain.bridg.PlannedEpochRule[] plannedEpochRule) {
        this.plannedEpochRule = plannedEpochRule;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.PlannedEpochRule getPlannedEpochRule(int i) {
        return this.plannedEpochRule[i];
    }

    public void setPlannedEpochRule(int i, gov.nih.nci.cabig.ccts.domain.bridg.PlannedEpochRule _value) {
        this.plannedEpochRule[i] = _value;
    }


    /**
     * Gets the scheduledEpoch value for this PlannedEpoch.
     * 
     * @return scheduledEpoch
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.ScheduledEpoch[] getScheduledEpoch() {
        return scheduledEpoch;
    }


    /**
     * Sets the scheduledEpoch value for this PlannedEpoch.
     * 
     * @param scheduledEpoch
     */
    public void setScheduledEpoch(gov.nih.nci.cabig.ccts.domain.bridg.ScheduledEpoch[] scheduledEpoch) {
        this.scheduledEpoch = scheduledEpoch;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.ScheduledEpoch getScheduledEpoch(int i) {
        return this.scheduledEpoch[i];
    }

    public void setScheduledEpoch(int i, gov.nih.nci.cabig.ccts.domain.bridg.ScheduledEpoch _value) {
        this.scheduledEpoch[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlannedEpoch)) return false;
        PlannedEpoch other = (PlannedEpoch) obj;
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
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.plannedEpochRule==null && other.getPlannedEpochRule()==null) || 
             (this.plannedEpochRule!=null &&
              java.util.Arrays.equals(this.plannedEpochRule, other.getPlannedEpochRule()))) &&
            ((this.scheduledEpoch==null && other.getScheduledEpoch()==null) || 
             (this.scheduledEpoch!=null &&
              java.util.Arrays.equals(this.scheduledEpoch, other.getScheduledEpoch())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getPlannedEpochRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlannedEpochRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlannedEpochRule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScheduledEpoch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScheduledEpoch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScheduledEpoch(), i);
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
        new org.apache.axis.description.TypeDesc(PlannedEpoch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedEpoch"));
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
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedEpochRule");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedEpochRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedEpochRule"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledEpoch");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledEpoch"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledEpoch"));
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
