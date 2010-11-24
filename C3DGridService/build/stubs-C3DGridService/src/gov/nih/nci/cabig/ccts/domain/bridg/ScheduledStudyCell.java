/**
 * ScheduledStudyCell.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A study cell is associated with a particular arm and epoch.  It
 * describes that portion of a particular arm (a planned path through
 * the study) which describes, for a particular epoch (study state),
 * what activities the subject will be involved in.  The design of a
 * study can be visualized as a cell in a matrix whose columns are epochs
 * and whose rows are arms; each cell of such a matrix is a study cell.
 * A study cell contains one or more StudySegment instances, which serve
 * to describe a part of a particular arm during a particular epoch.
 * 
 * For example, in a crossover trial with two treatment epochs and three
 * arms, there are six "treatment" study cells, one for each of the 2
 * treatment epochs in each of the 3 arms.
 */
public class ScheduledStudyCell  implements java.io.Serializable {
    /** A description of the study cell from the point of view of a blinded
 * study subject. 
 * 
 * For example, during the second treatment epoch of a study, Arms A
 * and B are still blinded and Arm C is no longer blinded. So, Arm A
 * and B must have identical blindedDescriptions.
 * 
 * For example, in a study with 3 arms, Arm 1: standard vaccine given
 * in three shots at 2 months, 5 months, and 12 months of age; Arm 2:
 * new vaccine given in three shots at 2 months, 5 months, and 12 months
 * of age; Arm 3: new vaccine given in two shots at at 2 months and 5
 * months of age.
 * Subjects assigned to the third arm are unblinded at some point during
 * 5 months and 12 months. By the time of the Third Shot Epoch, the "Arm
 * 3/Third Shot" Study Cell can be called by this, its unblinded name.
 * However, the "Arm 1/Third Shot" and "Arm2/Third Shot" Study Cells
 * still need blinded names.  Both these study cells would have the blinded
 * name (something like) "3-shot Arm/Third Shot". */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST blindedDescription;
    /** The protocol-assigned human-readable name for a study cell, usually
 * a combination of the names of the epoch and arm with which it is associated. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST name;
    private gov.nih.nci.cabig.ccts.domain.bridg.ScheduledEpoch scheduledEpoch;
    private gov.nih.nci.cabig.ccts.domain.bridg.ScheduledArm scheduledArm;

    public ScheduledStudyCell() {
    }

    public ScheduledStudyCell(
           gov.nih.nci.cabig.ccts.domain.cdt.ST blindedDescription,
           gov.nih.nci.cabig.ccts.domain.cdt.ST name,
           gov.nih.nci.cabig.ccts.domain.bridg.ScheduledArm scheduledArm,
           gov.nih.nci.cabig.ccts.domain.bridg.ScheduledEpoch scheduledEpoch) {
           this.blindedDescription = blindedDescription;
           this.name = name;
           this.scheduledEpoch = scheduledEpoch;
           this.scheduledArm = scheduledArm;
    }


    /**
     * Gets the blindedDescription value for this ScheduledStudyCell.
     * 
     * @return blindedDescription A description of the study cell from the point of view of a blinded
 * study subject. 
 * 
 * For example, during the second treatment epoch of a study, Arms A
 * and B are still blinded and Arm C is no longer blinded. So, Arm A
 * and B must have identical blindedDescriptions.
 * 
 * For example, in a study with 3 arms, Arm 1: standard vaccine given
 * in three shots at 2 months, 5 months, and 12 months of age; Arm 2:
 * new vaccine given in three shots at 2 months, 5 months, and 12 months
 * of age; Arm 3: new vaccine given in two shots at at 2 months and 5
 * months of age.
 * Subjects assigned to the third arm are unblinded at some point during
 * 5 months and 12 months. By the time of the Third Shot Epoch, the "Arm
 * 3/Third Shot" Study Cell can be called by this, its unblinded name.
 * However, the "Arm 1/Third Shot" and "Arm2/Third Shot" Study Cells
 * still need blinded names.  Both these study cells would have the blinded
 * name (something like) "3-shot Arm/Third Shot".
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getBlindedDescription() {
        return blindedDescription;
    }


    /**
     * Sets the blindedDescription value for this ScheduledStudyCell.
     * 
     * @param blindedDescription A description of the study cell from the point of view of a blinded
 * study subject. 
 * 
 * For example, during the second treatment epoch of a study, Arms A
 * and B are still blinded and Arm C is no longer blinded. So, Arm A
 * and B must have identical blindedDescriptions.
 * 
 * For example, in a study with 3 arms, Arm 1: standard vaccine given
 * in three shots at 2 months, 5 months, and 12 months of age; Arm 2:
 * new vaccine given in three shots at 2 months, 5 months, and 12 months
 * of age; Arm 3: new vaccine given in two shots at at 2 months and 5
 * months of age.
 * Subjects assigned to the third arm are unblinded at some point during
 * 5 months and 12 months. By the time of the Third Shot Epoch, the "Arm
 * 3/Third Shot" Study Cell can be called by this, its unblinded name.
 * However, the "Arm 1/Third Shot" and "Arm2/Third Shot" Study Cells
 * still need blinded names.  Both these study cells would have the blinded
 * name (something like) "3-shot Arm/Third Shot".
     */
    public void setBlindedDescription(gov.nih.nci.cabig.ccts.domain.cdt.ST blindedDescription) {
        this.blindedDescription = blindedDescription;
    }


    /**
     * Gets the name value for this ScheduledStudyCell.
     * 
     * @return name The protocol-assigned human-readable name for a study cell, usually
 * a combination of the names of the epoch and arm with which it is associated.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getName() {
        return name;
    }


    /**
     * Sets the name value for this ScheduledStudyCell.
     * 
     * @param name The protocol-assigned human-readable name for a study cell, usually
 * a combination of the names of the epoch and arm with which it is associated.
     */
    public void setName(gov.nih.nci.cabig.ccts.domain.cdt.ST name) {
        this.name = name;
    }


    /**
     * Gets the scheduledEpoch value for this ScheduledStudyCell.
     * 
     * @return scheduledEpoch
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.ScheduledEpoch getScheduledEpoch() {
        return scheduledEpoch;
    }


    /**
     * Sets the scheduledEpoch value for this ScheduledStudyCell.
     * 
     * @param scheduledEpoch
     */
    public void setScheduledEpoch(gov.nih.nci.cabig.ccts.domain.bridg.ScheduledEpoch scheduledEpoch) {
        this.scheduledEpoch = scheduledEpoch;
    }


    /**
     * Gets the scheduledArm value for this ScheduledStudyCell.
     * 
     * @return scheduledArm
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.ScheduledArm getScheduledArm() {
        return scheduledArm;
    }


    /**
     * Sets the scheduledArm value for this ScheduledStudyCell.
     * 
     * @param scheduledArm
     */
    public void setScheduledArm(gov.nih.nci.cabig.ccts.domain.bridg.ScheduledArm scheduledArm) {
        this.scheduledArm = scheduledArm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduledStudyCell)) return false;
        ScheduledStudyCell other = (ScheduledStudyCell) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blindedDescription==null && other.getBlindedDescription()==null) || 
             (this.blindedDescription!=null &&
              this.blindedDescription.equals(other.getBlindedDescription()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.scheduledEpoch==null && other.getScheduledEpoch()==null) || 
             (this.scheduledEpoch!=null &&
              this.scheduledEpoch.equals(other.getScheduledEpoch()))) &&
            ((this.scheduledArm==null && other.getScheduledArm()==null) || 
             (this.scheduledArm!=null &&
              this.scheduledArm.equals(other.getScheduledArm())));
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
        if (getBlindedDescription() != null) {
            _hashCode += getBlindedDescription().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getScheduledEpoch() != null) {
            _hashCode += getScheduledEpoch().hashCode();
        }
        if (getScheduledArm() != null) {
            _hashCode += getScheduledArm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScheduledStudyCell.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledStudyCell"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blindedDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "blindedDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledEpoch");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledEpoch"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledEpoch"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledArm");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledArm"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledArm"));
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
