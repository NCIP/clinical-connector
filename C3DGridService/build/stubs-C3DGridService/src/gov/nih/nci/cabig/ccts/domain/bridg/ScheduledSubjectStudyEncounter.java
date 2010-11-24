/**
 * ScheduledSubjectStudyEncounter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A period of time (of non-zero duration) which is identified in
 * the study protocol as a time during which scheduled activities are
 * to take place.  
 * 
 * Examples of types of Subject Study Encounters (SSE) include: Clinic
 * visit, Hospital admission, Telephone contact, Period of time during
 * which a subject is to regularly self-administer medication, Period
 * of time during which a subject is to "monitor Adverse Events (AEs)",
 * i.e., to note changes in their health status for reporting to the
 * study investigator.
 * 
 * NOTE: Subject Study Encounters may overlap. For example:  A subject
 * might be fitted with a Holter monitoring device during one clinic
 * visit, then return to the clinic the next day to have the device removed.
 * Each clinic visit is a Subject Study Encounter, and the 24-hour period
 * during which the Holter monitor records data is another Subject Study
 * Contact.  The Holter monitoring SSE overlaps with the first clinic
 * visit SSE and may overlap with the second clinic visit SSE.
 * 
 * NOTE: Subject StudyEncounters are nested within each other.
 */
public class ScheduledSubjectStudyEncounter  implements java.io.Serializable {
    /** Text description typically specifying time offset of encounter
 * in relation to some significant timepoint (eg offset from start of
 * Treatment).  
 * 
 * For example,  Week 2  or Day 21. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST name;
    /** The point in, or interval of, time to which one or more activities
 * are associated. 
 * 
 * For example, 28 days after enrollment on the study. */
    private gov.nih.nci.cabig.ccts.domain.cdt.IVLTS scheduledTiming;
    /** The kind of interaction a subject has with this study for this
 * encounter.
 * 
 * For example, Visit, Telephone Contact, Inpatient Encounter, Dosing,
 * Patient Diary, AE Monitoring */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD type;
    private gov.nih.nci.cabig.ccts.domain.bridg.ScheduledSoACell[] scheduledSoACell;
    private gov.nih.nci.cabig.ccts.domain.bridg.ScheduledSubjectStudyEncounterRule[] scheduledSubjectStudyEncounterRule;
    private gov.nih.nci.cabig.ccts.domain.bridg.PerformedSubjectStudyEncounter performedSubjectStudyEncounter;

    public ScheduledSubjectStudyEncounter() {
    }

    public ScheduledSubjectStudyEncounter(
           gov.nih.nci.cabig.ccts.domain.cdt.ST name,
           gov.nih.nci.cabig.ccts.domain.bridg.PerformedSubjectStudyEncounter performedSubjectStudyEncounter,
           gov.nih.nci.cabig.ccts.domain.bridg.ScheduledSoACell[] scheduledSoACell,
           gov.nih.nci.cabig.ccts.domain.bridg.ScheduledSubjectStudyEncounterRule[] scheduledSubjectStudyEncounterRule,
           gov.nih.nci.cabig.ccts.domain.cdt.IVLTS scheduledTiming,
           gov.nih.nci.cabig.ccts.domain.cdt.CD type) {
           this.name = name;
           this.scheduledTiming = scheduledTiming;
           this.type = type;
           this.scheduledSoACell = scheduledSoACell;
           this.scheduledSubjectStudyEncounterRule = scheduledSubjectStudyEncounterRule;
           this.performedSubjectStudyEncounter = performedSubjectStudyEncounter;
    }


    /**
     * Gets the name value for this ScheduledSubjectStudyEncounter.
     * 
     * @return name Text description typically specifying time offset of encounter
 * in relation to some significant timepoint (eg offset from start of
 * Treatment).  
 * 
 * For example,  Week 2  or Day 21.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getName() {
        return name;
    }


    /**
     * Sets the name value for this ScheduledSubjectStudyEncounter.
     * 
     * @param name Text description typically specifying time offset of encounter
 * in relation to some significant timepoint (eg offset from start of
 * Treatment).  
 * 
 * For example,  Week 2  or Day 21.
     */
    public void setName(gov.nih.nci.cabig.ccts.domain.cdt.ST name) {
        this.name = name;
    }


    /**
     * Gets the scheduledTiming value for this ScheduledSubjectStudyEncounter.
     * 
     * @return scheduledTiming The point in, or interval of, time to which one or more activities
 * are associated. 
 * 
 * For example, 28 days after enrollment on the study.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.IVLTS getScheduledTiming() {
        return scheduledTiming;
    }


    /**
     * Sets the scheduledTiming value for this ScheduledSubjectStudyEncounter.
     * 
     * @param scheduledTiming The point in, or interval of, time to which one or more activities
 * are associated. 
 * 
 * For example, 28 days after enrollment on the study.
     */
    public void setScheduledTiming(gov.nih.nci.cabig.ccts.domain.cdt.IVLTS scheduledTiming) {
        this.scheduledTiming = scheduledTiming;
    }


    /**
     * Gets the type value for this ScheduledSubjectStudyEncounter.
     * 
     * @return type The kind of interaction a subject has with this study for this
 * encounter.
 * 
 * For example, Visit, Telephone Contact, Inpatient Encounter, Dosing,
 * Patient Diary, AE Monitoring
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getType() {
        return type;
    }


    /**
     * Sets the type value for this ScheduledSubjectStudyEncounter.
     * 
     * @param type The kind of interaction a subject has with this study for this
 * encounter.
 * 
 * For example, Visit, Telephone Contact, Inpatient Encounter, Dosing,
 * Patient Diary, AE Monitoring
     */
    public void setType(gov.nih.nci.cabig.ccts.domain.cdt.CD type) {
        this.type = type;
    }


    /**
     * Gets the scheduledSoACell value for this ScheduledSubjectStudyEncounter.
     * 
     * @return scheduledSoACell
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.ScheduledSoACell[] getScheduledSoACell() {
        return scheduledSoACell;
    }


    /**
     * Sets the scheduledSoACell value for this ScheduledSubjectStudyEncounter.
     * 
     * @param scheduledSoACell
     */
    public void setScheduledSoACell(gov.nih.nci.cabig.ccts.domain.bridg.ScheduledSoACell[] scheduledSoACell) {
        this.scheduledSoACell = scheduledSoACell;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.ScheduledSoACell getScheduledSoACell(int i) {
        return this.scheduledSoACell[i];
    }

    public void setScheduledSoACell(int i, gov.nih.nci.cabig.ccts.domain.bridg.ScheduledSoACell _value) {
        this.scheduledSoACell[i] = _value;
    }


    /**
     * Gets the scheduledSubjectStudyEncounterRule value for this ScheduledSubjectStudyEncounter.
     * 
     * @return scheduledSubjectStudyEncounterRule
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.ScheduledSubjectStudyEncounterRule[] getScheduledSubjectStudyEncounterRule() {
        return scheduledSubjectStudyEncounterRule;
    }


    /**
     * Sets the scheduledSubjectStudyEncounterRule value for this ScheduledSubjectStudyEncounter.
     * 
     * @param scheduledSubjectStudyEncounterRule
     */
    public void setScheduledSubjectStudyEncounterRule(gov.nih.nci.cabig.ccts.domain.bridg.ScheduledSubjectStudyEncounterRule[] scheduledSubjectStudyEncounterRule) {
        this.scheduledSubjectStudyEncounterRule = scheduledSubjectStudyEncounterRule;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.ScheduledSubjectStudyEncounterRule getScheduledSubjectStudyEncounterRule(int i) {
        return this.scheduledSubjectStudyEncounterRule[i];
    }

    public void setScheduledSubjectStudyEncounterRule(int i, gov.nih.nci.cabig.ccts.domain.bridg.ScheduledSubjectStudyEncounterRule _value) {
        this.scheduledSubjectStudyEncounterRule[i] = _value;
    }


    /**
     * Gets the performedSubjectStudyEncounter value for this ScheduledSubjectStudyEncounter.
     * 
     * @return performedSubjectStudyEncounter
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedSubjectStudyEncounter getPerformedSubjectStudyEncounter() {
        return performedSubjectStudyEncounter;
    }


    /**
     * Sets the performedSubjectStudyEncounter value for this ScheduledSubjectStudyEncounter.
     * 
     * @param performedSubjectStudyEncounter
     */
    public void setPerformedSubjectStudyEncounter(gov.nih.nci.cabig.ccts.domain.bridg.PerformedSubjectStudyEncounter performedSubjectStudyEncounter) {
        this.performedSubjectStudyEncounter = performedSubjectStudyEncounter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduledSubjectStudyEncounter)) return false;
        ScheduledSubjectStudyEncounter other = (ScheduledSubjectStudyEncounter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.scheduledTiming==null && other.getScheduledTiming()==null) || 
             (this.scheduledTiming!=null &&
              this.scheduledTiming.equals(other.getScheduledTiming()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.scheduledSoACell==null && other.getScheduledSoACell()==null) || 
             (this.scheduledSoACell!=null &&
              java.util.Arrays.equals(this.scheduledSoACell, other.getScheduledSoACell()))) &&
            ((this.scheduledSubjectStudyEncounterRule==null && other.getScheduledSubjectStudyEncounterRule()==null) || 
             (this.scheduledSubjectStudyEncounterRule!=null &&
              java.util.Arrays.equals(this.scheduledSubjectStudyEncounterRule, other.getScheduledSubjectStudyEncounterRule()))) &&
            ((this.performedSubjectStudyEncounter==null && other.getPerformedSubjectStudyEncounter()==null) || 
             (this.performedSubjectStudyEncounter!=null &&
              this.performedSubjectStudyEncounter.equals(other.getPerformedSubjectStudyEncounter())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getScheduledTiming() != null) {
            _hashCode += getScheduledTiming().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getScheduledSoACell() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScheduledSoACell());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScheduledSoACell(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScheduledSubjectStudyEncounterRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScheduledSubjectStudyEncounterRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScheduledSubjectStudyEncounterRule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPerformedSubjectStudyEncounter() != null) {
            _hashCode += getPerformedSubjectStudyEncounter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScheduledSubjectStudyEncounter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledSubjectStudyEncounter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledTiming");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "scheduledTiming"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "IVLTS"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledSoACell");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledSoACell"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledSoACell"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledSubjectStudyEncounterRule");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledSubjectStudyEncounterRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledSubjectStudyEncounterRule"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performedSubjectStudyEncounter");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedSubjectStudyEncounter"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedSubjectStudyEncounter"));
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
