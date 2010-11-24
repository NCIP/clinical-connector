/**
 * PlannedArmSoA.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A portion of the Planned Schedule of Activities (SOA) that is applicable
 * to subjects in a particular arm.  If a study has multiple arms, the
 * Arm-Specific Planned SOAs may be nearly identical (e.g., in a blinded
 * controlled trial) or may be quite different (e.g., in a study that
 * compares different modes of treatment).
 * [NOTE:  One could have other subsets of the Planned SOA that are applicable
 * to other groups of subjects.  Some examples:  Subjects who are or
 * are not part of a correlative study, male subjects/female subjects,
 * subjects in different strata if the stratum membership affects the
 * SOA.]
 * 
 * For example, most studies contain one or more PlannedSoAs, (i.e. one
 * PlannedSoA for each treatment arm) each in the form of a matrix of
 * time (horizontal axis) and activities (vertical axis).  (((This matrix
 * is therefore made up of individual cells and a PlannedSoA is defined
 * by checking a cell, thereby associating a specific activity to a specific
 * time))).
 */
public class PlannedArmSoA  implements java.io.Serializable {
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
 * In the Study Data Tabulation Model (SDTM) (the element, DM.RFSTDTC),
 * day 1 might be the first day that a specific subject gets a particular
 * drug. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST referenceTimePoint;
    private gov.nih.nci.cabig.ccts.domain.bridg.PlannedSoACell[] plannedSoACell;
    private gov.nih.nci.cabig.ccts.domain.bridg.StudySubject studySubject;

    public PlannedArmSoA() {
    }

    public PlannedArmSoA(
           gov.nih.nci.cabig.ccts.domain.bridg.PlannedSoACell[] plannedSoACell,
           gov.nih.nci.cabig.ccts.domain.cdt.ST referenceTimePoint,
           gov.nih.nci.cabig.ccts.domain.bridg.StudySubject studySubject) {
           this.referenceTimePoint = referenceTimePoint;
           this.plannedSoACell = plannedSoACell;
           this.studySubject = studySubject;
    }


    /**
     * Gets the referenceTimePoint value for this PlannedArmSoA.
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
 * In the Study Data Tabulation Model (SDTM) (the element, DM.RFSTDTC),
 * day 1 might be the first day that a specific subject gets a particular
 * drug.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getReferenceTimePoint() {
        return referenceTimePoint;
    }


    /**
     * Sets the referenceTimePoint value for this PlannedArmSoA.
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
 * In the Study Data Tabulation Model (SDTM) (the element, DM.RFSTDTC),
 * day 1 might be the first day that a specific subject gets a particular
 * drug.
     */
    public void setReferenceTimePoint(gov.nih.nci.cabig.ccts.domain.cdt.ST referenceTimePoint) {
        this.referenceTimePoint = referenceTimePoint;
    }


    /**
     * Gets the plannedSoACell value for this PlannedArmSoA.
     * 
     * @return plannedSoACell
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PlannedSoACell[] getPlannedSoACell() {
        return plannedSoACell;
    }


    /**
     * Sets the plannedSoACell value for this PlannedArmSoA.
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
     * Gets the studySubject value for this PlannedArmSoA.
     * 
     * @return studySubject
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.StudySubject getStudySubject() {
        return studySubject;
    }


    /**
     * Sets the studySubject value for this PlannedArmSoA.
     * 
     * @param studySubject
     */
    public void setStudySubject(gov.nih.nci.cabig.ccts.domain.bridg.StudySubject studySubject) {
        this.studySubject = studySubject;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlannedArmSoA)) return false;
        PlannedArmSoA other = (PlannedArmSoA) obj;
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
            ((this.plannedSoACell==null && other.getPlannedSoACell()==null) || 
             (this.plannedSoACell!=null &&
              java.util.Arrays.equals(this.plannedSoACell, other.getPlannedSoACell()))) &&
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
        if (getStudySubject() != null) {
            _hashCode += getStudySubject().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlannedArmSoA.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedArmSoA"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceTimePoint");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "referenceTimePoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedSoACell");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedSoACell"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedSoACell"));
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
