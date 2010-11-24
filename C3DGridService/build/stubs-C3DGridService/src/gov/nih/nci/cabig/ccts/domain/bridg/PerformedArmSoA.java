/**
 * PerformedArmSoA.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A portion of the Performed Schedule of Activities (SOA) that is
 * applicable to subjects in a particular arm.  If a study has multiple
 * arms, the Arm-Specific Performed SOAs may be nearly identical (e.g.,
 * in a blinded controlled trial) or may be quite different (e.g., in
 * a study that compares different modes of treatment).
 */
public class PerformedArmSoA  implements java.io.Serializable {
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
 * In the Study Data Tabulation Model (SDTM) (element DM.RFSTDTC), day
 * 1 might be the first day that a specific subject gets a particular
 * drug. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST referenceTimePoint;
    private gov.nih.nci.cabig.ccts.domain.bridg.PerformedSoACell[] performedSoACell;
    private gov.nih.nci.cabig.ccts.domain.bridg.PerformedArm performedArm;
    private gov.nih.nci.cabig.ccts.domain.bridg.StudySubject studySubject;

    public PerformedArmSoA() {
    }

    public PerformedArmSoA(
           gov.nih.nci.cabig.ccts.domain.bridg.PerformedArm performedArm,
           gov.nih.nci.cabig.ccts.domain.bridg.PerformedSoACell[] performedSoACell,
           gov.nih.nci.cabig.ccts.domain.cdt.ST referenceTimePoint,
           gov.nih.nci.cabig.ccts.domain.bridg.StudySubject studySubject) {
           this.referenceTimePoint = referenceTimePoint;
           this.performedSoACell = performedSoACell;
           this.performedArm = performedArm;
           this.studySubject = studySubject;
    }


    /**
     * Gets the referenceTimePoint value for this PerformedArmSoA.
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
 * In the Study Data Tabulation Model (SDTM) (element DM.RFSTDTC), day
 * 1 might be the first day that a specific subject gets a particular
 * drug.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getReferenceTimePoint() {
        return referenceTimePoint;
    }


    /**
     * Sets the referenceTimePoint value for this PerformedArmSoA.
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
 * In the Study Data Tabulation Model (SDTM) (element DM.RFSTDTC), day
 * 1 might be the first day that a specific subject gets a particular
 * drug.
     */
    public void setReferenceTimePoint(gov.nih.nci.cabig.ccts.domain.cdt.ST referenceTimePoint) {
        this.referenceTimePoint = referenceTimePoint;
    }


    /**
     * Gets the performedSoACell value for this PerformedArmSoA.
     * 
     * @return performedSoACell
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedSoACell[] getPerformedSoACell() {
        return performedSoACell;
    }


    /**
     * Sets the performedSoACell value for this PerformedArmSoA.
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


    /**
     * Gets the performedArm value for this PerformedArmSoA.
     * 
     * @return performedArm
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedArm getPerformedArm() {
        return performedArm;
    }


    /**
     * Sets the performedArm value for this PerformedArmSoA.
     * 
     * @param performedArm
     */
    public void setPerformedArm(gov.nih.nci.cabig.ccts.domain.bridg.PerformedArm performedArm) {
        this.performedArm = performedArm;
    }


    /**
     * Gets the studySubject value for this PerformedArmSoA.
     * 
     * @return studySubject
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.StudySubject getStudySubject() {
        return studySubject;
    }


    /**
     * Sets the studySubject value for this PerformedArmSoA.
     * 
     * @param studySubject
     */
    public void setStudySubject(gov.nih.nci.cabig.ccts.domain.bridg.StudySubject studySubject) {
        this.studySubject = studySubject;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformedArmSoA)) return false;
        PerformedArmSoA other = (PerformedArmSoA) obj;
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
            ((this.performedSoACell==null && other.getPerformedSoACell()==null) || 
             (this.performedSoACell!=null &&
              java.util.Arrays.equals(this.performedSoACell, other.getPerformedSoACell()))) &&
            ((this.performedArm==null && other.getPerformedArm()==null) || 
             (this.performedArm!=null &&
              this.performedArm.equals(other.getPerformedArm()))) &&
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
        if (getPerformedArm() != null) {
            _hashCode += getPerformedArm().hashCode();
        }
        if (getStudySubject() != null) {
            _hashCode += getStudySubject().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PerformedArmSoA.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedArmSoA"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceTimePoint");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "referenceTimePoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performedSoACell");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedSoACell"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedSoACell"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performedArm");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedArm"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedArm"));
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
