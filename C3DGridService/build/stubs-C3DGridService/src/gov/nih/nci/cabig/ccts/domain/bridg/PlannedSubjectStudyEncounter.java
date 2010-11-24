/**
 * PlannedSubjectStudyEncounter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A period of time (of non-zero duration) which is identified in
 * the study protocol as a time during which planned activities are to
 * take place.  
 * 
 * For example, Clinic visit, Hospital admission, Telephone contact,
 * Period of time during which a subject is to regularly self-administer
 * medication, Period of time during which a subject is to "monitor Adverse
 * Events (AEs)", i.e., to note changes in their health status for reporting
 * to the study investigator.
 * 
 * NOTE: Subject Study Encounters (SSE) may overlap. For example:  A
 * subject might be fitted with a Holter monitoring device during one
 * clinic visit, then return to the clinic the next day to have the device
 * removed.  Each clinic visit is a Subject Study Encounter, and the
 * 24-hour period during which the Holter monitor records data is another
 * Subject Study Encounter.  The Holter monitoring SSE overlaps with
 * the first clinic visit SSE and may overlap with the second clinic
 * visit SSE.
 * 
 * NOTE: Subject StudyEncounters are nested within each other.
 */
public class PlannedSubjectStudyEncounter  implements java.io.Serializable {
    /** Text description typically specifying time offset of encounter
 * in relation to some significant timepoint (eg offset from start of
 * Treatment).  
 * 
 * For example,  Week 2  or Day 21. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST name;
    /** The point in, or interval of, time to which one or more activities
 * may be associated. 
 * 
 * For example, 28 days after enrollment on the study. */
    private gov.nih.nci.cabig.ccts.domain.cdt.BRIDGRelativeTS plannedTiming;
    /** The kind of interaction a subject has with this study for this
 * encounter.
 * 
 * For example, Visit, Telephone Contact, Inpatient Encounter, Dosing,
 * Patient Diary, AE Monitoring */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD type;
    private gov.nih.nci.cabig.ccts.domain.bridg.PlannedSoACell[] plannedSoACell;
    private gov.nih.nci.cabig.ccts.domain.bridg.PlannedSubjectStudyEncounterRule[] plannedSubjectStudyEncounterRule;
    private gov.nih.nci.cabig.ccts.domain.bridg.ScheduledSubjectStudyEncounter[] scheduledSubjectStudyEncounter;

    public PlannedSubjectStudyEncounter() {
    }

    public PlannedSubjectStudyEncounter(
           gov.nih.nci.cabig.ccts.domain.cdt.ST name,
           gov.nih.nci.cabig.ccts.domain.bridg.PlannedSoACell[] plannedSoACell,
           gov.nih.nci.cabig.ccts.domain.bridg.PlannedSubjectStudyEncounterRule[] plannedSubjectStudyEncounterRule,
           gov.nih.nci.cabig.ccts.domain.cdt.BRIDGRelativeTS plannedTiming,
           gov.nih.nci.cabig.ccts.domain.bridg.ScheduledSubjectStudyEncounter[] scheduledSubjectStudyEncounter,
           gov.nih.nci.cabig.ccts.domain.cdt.CD type) {
           this.name = name;
           this.plannedTiming = plannedTiming;
           this.type = type;
           this.plannedSoACell = plannedSoACell;
           this.plannedSubjectStudyEncounterRule = plannedSubjectStudyEncounterRule;
           this.scheduledSubjectStudyEncounter = scheduledSubjectStudyEncounter;
    }


    /**
     * Gets the name value for this PlannedSubjectStudyEncounter.
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
     * Sets the name value for this PlannedSubjectStudyEncounter.
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
     * Gets the plannedTiming value for this PlannedSubjectStudyEncounter.
     * 
     * @return plannedTiming The point in, or interval of, time to which one or more activities
 * may be associated. 
 * 
 * For example, 28 days after enrollment on the study.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.BRIDGRelativeTS getPlannedTiming() {
        return plannedTiming;
    }


    /**
     * Sets the plannedTiming value for this PlannedSubjectStudyEncounter.
     * 
     * @param plannedTiming The point in, or interval of, time to which one or more activities
 * may be associated. 
 * 
 * For example, 28 days after enrollment on the study.
     */
    public void setPlannedTiming(gov.nih.nci.cabig.ccts.domain.cdt.BRIDGRelativeTS plannedTiming) {
        this.plannedTiming = plannedTiming;
    }


    /**
     * Gets the type value for this PlannedSubjectStudyEncounter.
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
     * Sets the type value for this PlannedSubjectStudyEncounter.
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
     * Gets the plannedSoACell value for this PlannedSubjectStudyEncounter.
     * 
     * @return plannedSoACell
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PlannedSoACell[] getPlannedSoACell() {
        return plannedSoACell;
    }


    /**
     * Sets the plannedSoACell value for this PlannedSubjectStudyEncounter.
     * 
     * @param plannedSoACell
     */
    public void setPlannedSoACell(gov.nih.nci.cabig.ccts.domain.bridg.PlannedSoACell[] plannedSoACell) {
        this.plannedSoACell = plannedSoACell;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.PlannedSoACell getPlannedSoACell(int i) {
        return this.plannedSoACell[i];
    }

    public void setPlannedSoACell(int i, gov.nih.nci.cabig.ccts.domain.bridg.PlannedSoACell _value) {
        this.plannedSoACell[i] = _value;
    }


    /**
     * Gets the plannedSubjectStudyEncounterRule value for this PlannedSubjectStudyEncounter.
     * 
     * @return plannedSubjectStudyEncounterRule
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PlannedSubjectStudyEncounterRule[] getPlannedSubjectStudyEncounterRule() {
        return plannedSubjectStudyEncounterRule;
    }


    /**
     * Sets the plannedSubjectStudyEncounterRule value for this PlannedSubjectStudyEncounter.
     * 
     * @param plannedSubjectStudyEncounterRule
     */
    public void setPlannedSubjectStudyEncounterRule(gov.nih.nci.cabig.ccts.domain.bridg.PlannedSubjectStudyEncounterRule[] plannedSubjectStudyEncounterRule) {
        this.plannedSubjectStudyEncounterRule = plannedSubjectStudyEncounterRule;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.PlannedSubjectStudyEncounterRule getPlannedSubjectStudyEncounterRule(int i) {
        return this.plannedSubjectStudyEncounterRule[i];
    }

    public void setPlannedSubjectStudyEncounterRule(int i, gov.nih.nci.cabig.ccts.domain.bridg.PlannedSubjectStudyEncounterRule _value) {
        this.plannedSubjectStudyEncounterRule[i] = _value;
    }


    /**
     * Gets the scheduledSubjectStudyEncounter value for this PlannedSubjectStudyEncounter.
     * 
     * @return scheduledSubjectStudyEncounter
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.ScheduledSubjectStudyEncounter[] getScheduledSubjectStudyEncounter() {
        return scheduledSubjectStudyEncounter;
    }


    /**
     * Sets the scheduledSubjectStudyEncounter value for this PlannedSubjectStudyEncounter.
     * 
     * @param scheduledSubjectStudyEncounter
     */
    public void setScheduledSubjectStudyEncounter(gov.nih.nci.cabig.ccts.domain.bridg.ScheduledSubjectStudyEncounter[] scheduledSubjectStudyEncounter) {
        this.scheduledSubjectStudyEncounter = scheduledSubjectStudyEncounter;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.ScheduledSubjectStudyEncounter getScheduledSubjectStudyEncounter(int i) {
        return this.scheduledSubjectStudyEncounter[i];
    }

    public void setScheduledSubjectStudyEncounter(int i, gov.nih.nci.cabig.ccts.domain.bridg.ScheduledSubjectStudyEncounter _value) {
        this.scheduledSubjectStudyEncounter[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlannedSubjectStudyEncounter)) return false;
        PlannedSubjectStudyEncounter other = (PlannedSubjectStudyEncounter) obj;
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
            ((this.plannedTiming==null && other.getPlannedTiming()==null) || 
             (this.plannedTiming!=null &&
              this.plannedTiming.equals(other.getPlannedTiming()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.plannedSoACell==null && other.getPlannedSoACell()==null) || 
             (this.plannedSoACell!=null &&
              java.util.Arrays.equals(this.plannedSoACell, other.getPlannedSoACell()))) &&
            ((this.plannedSubjectStudyEncounterRule==null && other.getPlannedSubjectStudyEncounterRule()==null) || 
             (this.plannedSubjectStudyEncounterRule!=null &&
              java.util.Arrays.equals(this.plannedSubjectStudyEncounterRule, other.getPlannedSubjectStudyEncounterRule()))) &&
            ((this.scheduledSubjectStudyEncounter==null && other.getScheduledSubjectStudyEncounter()==null) || 
             (this.scheduledSubjectStudyEncounter!=null &&
              java.util.Arrays.equals(this.scheduledSubjectStudyEncounter, other.getScheduledSubjectStudyEncounter())));
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
        if (getPlannedTiming() != null) {
            _hashCode += getPlannedTiming().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getPlannedSoACell() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlannedSoACell());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlannedSoACell(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPlannedSubjectStudyEncounterRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlannedSubjectStudyEncounterRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlannedSubjectStudyEncounterRule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScheduledSubjectStudyEncounter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScheduledSubjectStudyEncounter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScheduledSubjectStudyEncounter(), i);
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
        new org.apache.axis.description.TypeDesc(PlannedSubjectStudyEncounter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedSubjectStudyEncounter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedTiming");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "plannedTiming"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "BRIDGRelativeTS"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedSoACell");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedSoACell"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedSoACell"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedSubjectStudyEncounterRule");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedSubjectStudyEncounterRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedSubjectStudyEncounterRule"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledSubjectStudyEncounter");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledSubjectStudyEncounter"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledSubjectStudyEncounter"));
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
