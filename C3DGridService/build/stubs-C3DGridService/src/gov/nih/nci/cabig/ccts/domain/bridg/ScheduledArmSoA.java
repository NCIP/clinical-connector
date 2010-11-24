/**
 * ScheduledArmSoA.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A portion of the Scheduled Schedule of Activities (SOA) that is
 * applicable to subjects in a particular arm.  If a study has multiple
 * arms, the Arm-Specific Scheduled SOAs may be nearly identical (e.g.,
 * in a blinded controlled trial) or may be quite different (e.g., in
 * a study that compares different modes of treatment).
 */
public class ScheduledArmSoA  implements java.io.Serializable {
    /** The reference point that is used to calculate when planned subject
 * activities are planned to occur. 
 * 
 * For example, in bone marrow transplantation clinical trials, the reference
 * time point might be the day that the transplantation occurs. In other
 * clinical trials, the reference point might be the point at which informed
 * consent is obtained, or the point at which a patient is defined to
 * have entered or started the trial. In the patient study calendar project,
 * this is the earliest activity described in the patient calendar. 
 * This would be "day 1".  This is not an absolute calendar date (December
 * 18, 2006), but a reference day (Day 1 is the first day of chemotherapy).
 * 
 * 
 * For example, In the Study Data Tabulation Model (SDTM) (the element
 * DM.RFSTDTC), day 1 might be the first day that a specific subject
 * gets a particular drug. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST referenceTimePoint;
    private gov.nih.nci.cabig.ccts.domain.bridg.ScheduledSoACell[] scheduledSoACell;
    private gov.nih.nci.cabig.ccts.domain.bridg.ScheduledArm scheduledArm;
    private gov.nih.nci.cabig.ccts.domain.bridg.StudySubject studySubject;

    public ScheduledArmSoA() {
    }

    public ScheduledArmSoA(
           gov.nih.nci.cabig.ccts.domain.cdt.ST referenceTimePoint,
           gov.nih.nci.cabig.ccts.domain.bridg.ScheduledArm scheduledArm,
           gov.nih.nci.cabig.ccts.domain.bridg.ScheduledSoACell[] scheduledSoACell,
           gov.nih.nci.cabig.ccts.domain.bridg.StudySubject studySubject) {
           this.referenceTimePoint = referenceTimePoint;
           this.scheduledSoACell = scheduledSoACell;
           this.scheduledArm = scheduledArm;
           this.studySubject = studySubject;
    }


    /**
     * Gets the referenceTimePoint value for this ScheduledArmSoA.
     * 
     * @return referenceTimePoint The reference point that is used to calculate when planned subject
 * activities are planned to occur. 
 * 
 * For example, in bone marrow transplantation clinical trials, the reference
 * time point might be the day that the transplantation occurs. In other
 * clinical trials, the reference point might be the point at which informed
 * consent is obtained, or the point at which a patient is defined to
 * have entered or started the trial. In the patient study calendar project,
 * this is the earliest activity described in the patient calendar. 
 * This would be "day 1".  This is not an absolute calendar date (December
 * 18, 2006), but a reference day (Day 1 is the first day of chemotherapy).
 * 
 * 
 * For example, In the Study Data Tabulation Model (SDTM) (the element
 * DM.RFSTDTC), day 1 might be the first day that a specific subject
 * gets a particular drug.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getReferenceTimePoint() {
        return referenceTimePoint;
    }


    /**
     * Sets the referenceTimePoint value for this ScheduledArmSoA.
     * 
     * @param referenceTimePoint The reference point that is used to calculate when planned subject
 * activities are planned to occur. 
 * 
 * For example, in bone marrow transplantation clinical trials, the reference
 * time point might be the day that the transplantation occurs. In other
 * clinical trials, the reference point might be the point at which informed
 * consent is obtained, or the point at which a patient is defined to
 * have entered or started the trial. In the patient study calendar project,
 * this is the earliest activity described in the patient calendar. 
 * This would be "day 1".  This is not an absolute calendar date (December
 * 18, 2006), but a reference day (Day 1 is the first day of chemotherapy).
 * 
 * 
 * For example, In the Study Data Tabulation Model (SDTM) (the element
 * DM.RFSTDTC), day 1 might be the first day that a specific subject
 * gets a particular drug.
     */
    public void setReferenceTimePoint(gov.nih.nci.cabig.ccts.domain.cdt.ST referenceTimePoint) {
        this.referenceTimePoint = referenceTimePoint;
    }


    /**
     * Gets the scheduledSoACell value for this ScheduledArmSoA.
     * 
     * @return scheduledSoACell
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.ScheduledSoACell[] getScheduledSoACell() {
        return scheduledSoACell;
    }


    /**
     * Sets the scheduledSoACell value for this ScheduledArmSoA.
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
     * Gets the scheduledArm value for this ScheduledArmSoA.
     * 
     * @return scheduledArm
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.ScheduledArm getScheduledArm() {
        return scheduledArm;
    }


    /**
     * Sets the scheduledArm value for this ScheduledArmSoA.
     * 
     * @param scheduledArm
     */
    public void setScheduledArm(gov.nih.nci.cabig.ccts.domain.bridg.ScheduledArm scheduledArm) {
        this.scheduledArm = scheduledArm;
    }


    /**
     * Gets the studySubject value for this ScheduledArmSoA.
     * 
     * @return studySubject
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.StudySubject getStudySubject() {
        return studySubject;
    }


    /**
     * Sets the studySubject value for this ScheduledArmSoA.
     * 
     * @param studySubject
     */
    public void setStudySubject(gov.nih.nci.cabig.ccts.domain.bridg.StudySubject studySubject) {
        this.studySubject = studySubject;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduledArmSoA)) return false;
        ScheduledArmSoA other = (ScheduledArmSoA) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.referenceTimePoint==null && other.getReferenceTimePoint()==null) || 
             (this.referenceTimePoint!=null &&
              this.referenceTimePoint.equals(other.getReferenceTimePoint()))) &&
            ((this.scheduledSoACell==null && other.getScheduledSoACell()==null) || 
             (this.scheduledSoACell!=null &&
              java.util.Arrays.equals(this.scheduledSoACell, other.getScheduledSoACell()))) &&
            ((this.scheduledArm==null && other.getScheduledArm()==null) || 
             (this.scheduledArm!=null &&
              this.scheduledArm.equals(other.getScheduledArm()))) &&
            ((this.studySubject==null && other.getStudySubject()==null) || 
             (this.studySubject!=null &&
              this.studySubject.equals(other.getStudySubject())));
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
        if (getReferenceTimePoint() != null) {
            _hashCode += getReferenceTimePoint().hashCode();
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
        if (getScheduledArm() != null) {
            _hashCode += getScheduledArm().hashCode();
        }
        if (getStudySubject() != null) {
            _hashCode += getStudySubject().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScheduledArmSoA.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledArmSoA"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceTimePoint");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "referenceTimePoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledSoACell");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledSoACell"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledSoACell"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledArm");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledArm"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledArm"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studySubject");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudySubject"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudySubject"));
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
