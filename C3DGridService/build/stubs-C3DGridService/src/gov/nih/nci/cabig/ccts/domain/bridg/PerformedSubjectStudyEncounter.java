/**
 * PerformedSubjectStudyEncounter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A period of time (of non-zero duration) which is identified in
 * the study protocol as a time during which performed activities took
 * place.  
 * 
 * For example, types of PerformedSubjectStudyEncounters (SSE) include:
 * Clinic visit, Hospital admission, Telephone contact, Period of time
 * during which a subject is to regularly self-administer medication,
 * Period of time during which a subject is to "monitor Adverse Event
 * (AE)", i.e., to note changes in their health status for reporting
 * to the study investigator.
 * 
 * NOTE: Subject Study Encounters may overlap. For example:  A subject
 * might be fitted with a Holter monitoring device during one clinic
 * visit, then return to the clinic the next day to have the device removed.
 * Each clinic visit is a Subject Study Encounter, and the 24-hour period
 * during which the Holter monitor records data is another Subject Study
 * Encounter.  The Holter monitoring SSE overlaps with the first clinic
 * visit SSE and may overlap with the second clinic visit SSE.
 * 
 * NOTE: PerformedSubject StudyEncounters are nested within each other.
 */
public class PerformedSubjectStudyEncounter  implements java.io.Serializable {
    /** A free text description identifying the encounter. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST name;
    /** The point in, or interval of, time to which one or more activities
 * were performed. 
 * 
 * For example, 28 days after enrollment on the study. */
    private gov.nih.nci.cabig.ccts.domain.cdt.IVLTS performedTiming;
    /** The kind of interaction a subject has with this study for this
 * encounter.
 * 
 * For example, Visit, Telephone Contact, Inpatient Encounter, Dosing,
 * Patient Diary, Adverse Event (AE) Monitoring */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD type;
    private gov.nih.nci.cabig.ccts.domain.bridg.PerformedSoACell[] performedSoACell;

    public PerformedSubjectStudyEncounter() {
    }

    public PerformedSubjectStudyEncounter(
           gov.nih.nci.cabig.ccts.domain.cdt.ST name,
           gov.nih.nci.cabig.ccts.domain.bridg.PerformedSoACell[] performedSoACell,
           gov.nih.nci.cabig.ccts.domain.cdt.IVLTS performedTiming,
           gov.nih.nci.cabig.ccts.domain.cdt.CD type) {
           this.name = name;
           this.performedTiming = performedTiming;
           this.type = type;
           this.performedSoACell = performedSoACell;
    }


    /**
     * Gets the name value for this PerformedSubjectStudyEncounter.
     * 
     * @return name A free text description identifying the encounter.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getName() {
        return name;
    }


    /**
     * Sets the name value for this PerformedSubjectStudyEncounter.
     * 
     * @param name A free text description identifying the encounter.
     */
    public void setName(gov.nih.nci.cabig.ccts.domain.cdt.ST name) {
        this.name = name;
    }


    /**
     * Gets the performedTiming value for this PerformedSubjectStudyEncounter.
     * 
     * @return performedTiming The point in, or interval of, time to which one or more activities
 * were performed. 
 * 
 * For example, 28 days after enrollment on the study.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.IVLTS getPerformedTiming() {
        return performedTiming;
    }


    /**
     * Sets the performedTiming value for this PerformedSubjectStudyEncounter.
     * 
     * @param performedTiming The point in, or interval of, time to which one or more activities
 * were performed. 
 * 
 * For example, 28 days after enrollment on the study.
     */
    public void setPerformedTiming(gov.nih.nci.cabig.ccts.domain.cdt.IVLTS performedTiming) {
        this.performedTiming = performedTiming;
    }


    /**
     * Gets the type value for this PerformedSubjectStudyEncounter.
     * 
     * @return type The kind of interaction a subject has with this study for this
 * encounter.
 * 
 * For example, Visit, Telephone Contact, Inpatient Encounter, Dosing,
 * Patient Diary, Adverse Event (AE) Monitoring
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getType() {
        return type;
    }


    /**
     * Sets the type value for this PerformedSubjectStudyEncounter.
     * 
     * @param type The kind of interaction a subject has with this study for this
 * encounter.
 * 
 * For example, Visit, Telephone Contact, Inpatient Encounter, Dosing,
 * Patient Diary, Adverse Event (AE) Monitoring
     */
    public void setType(gov.nih.nci.cabig.ccts.domain.cdt.CD type) {
        this.type = type;
    }


    /**
     * Gets the performedSoACell value for this PerformedSubjectStudyEncounter.
     * 
     * @return performedSoACell
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedSoACell[] getPerformedSoACell() {
        return performedSoACell;
    }


    /**
     * Sets the performedSoACell value for this PerformedSubjectStudyEncounter.
     * 
     * @param performedSoACell
     */
    public void setPerformedSoACell(gov.nih.nci.cabig.ccts.domain.bridg.PerformedSoACell[] performedSoACell) {
        this.performedSoACell = performedSoACell;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedSoACell getPerformedSoACell(int i) {
        return this.performedSoACell[i];
    }

    public void setPerformedSoACell(int i, gov.nih.nci.cabig.ccts.domain.bridg.PerformedSoACell _value) {
        this.performedSoACell[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformedSubjectStudyEncounter)) return false;
        PerformedSubjectStudyEncounter other = (PerformedSubjectStudyEncounter) obj;
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
            ((this.performedTiming==null && other.getPerformedTiming()==null) || 
             (this.performedTiming!=null &&
              this.performedTiming.equals(other.getPerformedTiming()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.performedSoACell==null && other.getPerformedSoACell()==null) || 
             (this.performedSoACell!=null &&
              java.util.Arrays.equals(this.performedSoACell, other.getPerformedSoACell())));
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
        if (getPerformedTiming() != null) {
            _hashCode += getPerformedTiming().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getPerformedSoACell() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPerformedSoACell());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPerformedSoACell(), i);
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
        new org.apache.axis.description.TypeDesc(PerformedSubjectStudyEncounter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedSubjectStudyEncounter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performedTiming");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "performedTiming"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "IVLTS"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performedSoACell");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedSoACell"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedSoACell"));
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
