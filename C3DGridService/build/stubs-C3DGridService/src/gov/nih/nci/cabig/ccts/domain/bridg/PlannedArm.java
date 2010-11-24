/**
 * PlannedArm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A planned path through the study which describes, epoch by epoch,
 * what activities the subject will be involved in as they pass through
 * the study.  The group of subjects assigned to an Arm is often called
 * a treatment group.
 * 
 * For example, a study could have 2 arms named IV-Oral and Oral-IV.
 * The name IV-Oral reflects a path that passes through IV treatment,
 * then Oral treatment.
 */
public class PlannedArm  implements java.io.Serializable {
    /** Human readable text that describes what happens to the subject
 * during the Arm.
 * 
 * For example, in a particular treatment regimen, this is a description
 * of the pathway followed by all subjects. 
 * 
 * For example, "Subjects receive Drug X" or "Subjects receive Placebo."
 * 
 * For example, "Subjects receive IV in first arm, Oral in second arm."
 * 
 * NOTE: This description should point out what is different between
 * the Arms, if there is more than one Arm. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST description;
    /** The protocol-assigned human-readable name for an Arm in a study
 * design. 
 * 
 * For example, Treatment A. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST name;
    /** The relative proportion of subjects to be randomized to the Arm.
 * 
 * 
 * For example, if 1/3 of subjects are to be randomized to Arm A and
 * 2/3 to Arm B, then the values of randomizationWeightForArm for Arms
 * A and B, respectively, could be expressed as 1 and 2 or as 1/3 and
 * 2/3. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST randomizationWeight;
    /** The number of subjects planned for this Arm.
 * 
 * NOTE: This may represent the minimum number of subjects needed to
 * support data analysis. */
    private int targetAccrual;
    private gov.nih.nci.cabig.ccts.domain.bridg.PlannedArmSoA plannedArmSoA;
    private gov.nih.nci.cabig.ccts.domain.bridg.PlannedStudy plannedStudy;
    private gov.nih.nci.cabig.ccts.domain.bridg.ScheduledArm[] scheduledArm;

    public PlannedArm() {
    }

    public PlannedArm(
           gov.nih.nci.cabig.ccts.domain.cdt.ST description,
           gov.nih.nci.cabig.ccts.domain.cdt.ST name,
           gov.nih.nci.cabig.ccts.domain.bridg.PlannedArmSoA plannedArmSoA,
           gov.nih.nci.cabig.ccts.domain.bridg.PlannedStudy plannedStudy,
           gov.nih.nci.cabig.ccts.domain.cdt.ST randomizationWeight,
           gov.nih.nci.cabig.ccts.domain.bridg.ScheduledArm[] scheduledArm,
           int targetAccrual) {
           this.description = description;
           this.name = name;
           this.randomizationWeight = randomizationWeight;
           this.targetAccrual = targetAccrual;
           this.plannedArmSoA = plannedArmSoA;
           this.plannedStudy = plannedStudy;
           this.scheduledArm = scheduledArm;
    }


    /**
     * Gets the description value for this PlannedArm.
     * 
     * @return description Human readable text that describes what happens to the subject
 * during the Arm.
 * 
 * For example, in a particular treatment regimen, this is a description
 * of the pathway followed by all subjects. 
 * 
 * For example, "Subjects receive Drug X" or "Subjects receive Placebo."
 * 
 * For example, "Subjects receive IV in first arm, Oral in second arm."
 * 
 * NOTE: This description should point out what is different between
 * the Arms, if there is more than one Arm.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PlannedArm.
     * 
     * @param description Human readable text that describes what happens to the subject
 * during the Arm.
 * 
 * For example, in a particular treatment regimen, this is a description
 * of the pathway followed by all subjects. 
 * 
 * For example, "Subjects receive Drug X" or "Subjects receive Placebo."
 * 
 * For example, "Subjects receive IV in first arm, Oral in second arm."
 * 
 * NOTE: This description should point out what is different between
 * the Arms, if there is more than one Arm.
     */
    public void setDescription(gov.nih.nci.cabig.ccts.domain.cdt.ST description) {
        this.description = description;
    }


    /**
     * Gets the name value for this PlannedArm.
     * 
     * @return name The protocol-assigned human-readable name for an Arm in a study
 * design. 
 * 
 * For example, Treatment A.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getName() {
        return name;
    }


    /**
     * Sets the name value for this PlannedArm.
     * 
     * @param name The protocol-assigned human-readable name for an Arm in a study
 * design. 
 * 
 * For example, Treatment A.
     */
    public void setName(gov.nih.nci.cabig.ccts.domain.cdt.ST name) {
        this.name = name;
    }


    /**
     * Gets the randomizationWeight value for this PlannedArm.
     * 
     * @return randomizationWeight The relative proportion of subjects to be randomized to the Arm.
 * 
 * 
 * For example, if 1/3 of subjects are to be randomized to Arm A and
 * 2/3 to Arm B, then the values of randomizationWeightForArm for Arms
 * A and B, respectively, could be expressed as 1 and 2 or as 1/3 and
 * 2/3.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getRandomizationWeight() {
        return randomizationWeight;
    }


    /**
     * Sets the randomizationWeight value for this PlannedArm.
     * 
     * @param randomizationWeight The relative proportion of subjects to be randomized to the Arm.
 * 
 * 
 * For example, if 1/3 of subjects are to be randomized to Arm A and
 * 2/3 to Arm B, then the values of randomizationWeightForArm for Arms
 * A and B, respectively, could be expressed as 1 and 2 or as 1/3 and
 * 2/3.
     */
    public void setRandomizationWeight(gov.nih.nci.cabig.ccts.domain.cdt.ST randomizationWeight) {
        this.randomizationWeight = randomizationWeight;
    }


    /**
     * Gets the targetAccrual value for this PlannedArm.
     * 
     * @return targetAccrual The number of subjects planned for this Arm.
 * 
 * NOTE: This may represent the minimum number of subjects needed to
 * support data analysis.
     */
    public int getTargetAccrual() {
        return targetAccrual;
    }


    /**
     * Sets the targetAccrual value for this PlannedArm.
     * 
     * @param targetAccrual The number of subjects planned for this Arm.
 * 
 * NOTE: This may represent the minimum number of subjects needed to
 * support data analysis.
     */
    public void setTargetAccrual(int targetAccrual) {
        this.targetAccrual = targetAccrual;
    }


    /**
     * Gets the plannedArmSoA value for this PlannedArm.
     * 
     * @return plannedArmSoA
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PlannedArmSoA getPlannedArmSoA() {
        return plannedArmSoA;
    }


    /**
     * Sets the plannedArmSoA value for this PlannedArm.
     * 
     * @param plannedArmSoA
     */
    public void setPlannedArmSoA(gov.nih.nci.cabig.ccts.domain.bridg.PlannedArmSoA plannedArmSoA) {
        this.plannedArmSoA = plannedArmSoA;
    }


    /**
     * Gets the plannedStudy value for this PlannedArm.
     * 
     * @return plannedStudy
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PlannedStudy getPlannedStudy() {
        return plannedStudy;
    }


    /**
     * Sets the plannedStudy value for this PlannedArm.
     * 
     * @param plannedStudy
     */
    public void setPlannedStudy(gov.nih.nci.cabig.ccts.domain.bridg.PlannedStudy plannedStudy) {
        this.plannedStudy = plannedStudy;
    }


    /**
     * Gets the scheduledArm value for this PlannedArm.
     * 
     * @return scheduledArm
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.ScheduledArm[] getScheduledArm() {
        return scheduledArm;
    }


    /**
     * Sets the scheduledArm value for this PlannedArm.
     * 
     * @param scheduledArm
     */
    public void setScheduledArm(gov.nih.nci.cabig.ccts.domain.bridg.ScheduledArm[] scheduledArm) {
        this.scheduledArm = scheduledArm;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.ScheduledArm getScheduledArm(int i) {
        return this.scheduledArm[i];
    }

    public void setScheduledArm(int i, gov.nih.nci.cabig.ccts.domain.bridg.ScheduledArm _value) {
        this.scheduledArm[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlannedArm)) return false;
        PlannedArm other = (PlannedArm) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.randomizationWeight==null && other.getRandomizationWeight()==null) || 
             (this.randomizationWeight!=null &&
              this.randomizationWeight.equals(other.getRandomizationWeight()))) &&
            this.targetAccrual == other.getTargetAccrual() &&
            ((this.plannedArmSoA==null && other.getPlannedArmSoA()==null) || 
             (this.plannedArmSoA!=null &&
              this.plannedArmSoA.equals(other.getPlannedArmSoA()))) &&
            ((this.plannedStudy==null && other.getPlannedStudy()==null) || 
             (this.plannedStudy!=null &&
              this.plannedStudy.equals(other.getPlannedStudy()))) &&
            ((this.scheduledArm==null && other.getScheduledArm()==null) || 
             (this.scheduledArm!=null &&
              java.util.Arrays.equals(this.scheduledArm, other.getScheduledArm())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRandomizationWeight() != null) {
            _hashCode += getRandomizationWeight().hashCode();
        }
        _hashCode += getTargetAccrual();
        if (getPlannedArmSoA() != null) {
            _hashCode += getPlannedArmSoA().hashCode();
        }
        if (getPlannedStudy() != null) {
            _hashCode += getPlannedStudy().hashCode();
        }
        if (getScheduledArm() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScheduledArm());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScheduledArm(), i);
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
        new org.apache.axis.description.TypeDesc(PlannedArm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedArm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("randomizationWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "randomizationWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetAccrual");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "targetAccrual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedArmSoA");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedArmSoA"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedArmSoA"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedStudy");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedStudy"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedStudy"));
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
