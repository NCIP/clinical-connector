/**
 * PerformedArm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A performed path through the study which describes, epoch by epoch,
 * what activities the subject was involved in as they passed through
 * the study.  The group of subjects assigned to an Arm is often called
 * a treatment group.
 * 
 * For example, a study could have 2 arms named IV-Oral and Oral-IV.
 * The name IV-Oral reflects a path that passes through IV treatment,
 * then Oral treatment.
 */
public class PerformedArm  implements java.io.Serializable {
    /** The human-readable text that describes what happens to the subject
 * during the arm.
 * 
 * For example, in a particular treatment regimen, this is a description
 * of the pathway followed by all subjects. 
 * 
 * For example, "Subjects receive Drug X" or "Subjects receive Placebo."
 * 
 * For example, "Subjects receive IV in firstperiod, Oral in second period."
 * 
 * NOTE: This description should point out what is different between
 * the Arms, if there is more than one Arm. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST description;
    /** The protocol-assigned human-readable name for an arm in a study
 * design. 
 * 
 * For example, Treatment A. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST name;
    /** The relative proportion of subjects to be randomized to the arm.
 * 
 * 
 * For example, if 1/3 of subjects are to be randomized to Arm A and
 * 2/3 to Arm B, then the values of randomizationWeightForArm for Arms
 * A and B, respectively, could be expressed as 1 and 2 or as 1/3 and
 * 2/3. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST randomizationWeight;
    private gov.nih.nci.cabig.ccts.domain.bridg.PerformedStudy performedStudy;

    public PerformedArm() {
    }

    public PerformedArm(
           gov.nih.nci.cabig.ccts.domain.cdt.ST description,
           gov.nih.nci.cabig.ccts.domain.cdt.ST name,
           gov.nih.nci.cabig.ccts.domain.bridg.PerformedStudy performedStudy,
           gov.nih.nci.cabig.ccts.domain.cdt.ST randomizationWeight) {
           this.description = description;
           this.name = name;
           this.randomizationWeight = randomizationWeight;
           this.performedStudy = performedStudy;
    }


    /**
     * Gets the description value for this PerformedArm.
     * 
     * @return description The human-readable text that describes what happens to the subject
 * during the arm.
 * 
 * For example, in a particular treatment regimen, this is a description
 * of the pathway followed by all subjects. 
 * 
 * For example, "Subjects receive Drug X" or "Subjects receive Placebo."
 * 
 * For example, "Subjects receive IV in firstperiod, Oral in second period."
 * 
 * NOTE: This description should point out what is different between
 * the Arms, if there is more than one Arm.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PerformedArm.
     * 
     * @param description The human-readable text that describes what happens to the subject
 * during the arm.
 * 
 * For example, in a particular treatment regimen, this is a description
 * of the pathway followed by all subjects. 
 * 
 * For example, "Subjects receive Drug X" or "Subjects receive Placebo."
 * 
 * For example, "Subjects receive IV in firstperiod, Oral in second period."
 * 
 * NOTE: This description should point out what is different between
 * the Arms, if there is more than one Arm.
     */
    public void setDescription(gov.nih.nci.cabig.ccts.domain.cdt.ST description) {
        this.description = description;
    }


    /**
     * Gets the name value for this PerformedArm.
     * 
     * @return name The protocol-assigned human-readable name for an arm in a study
 * design. 
 * 
 * For example, Treatment A.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getName() {
        return name;
    }


    /**
     * Sets the name value for this PerformedArm.
     * 
     * @param name The protocol-assigned human-readable name for an arm in a study
 * design. 
 * 
 * For example, Treatment A.
     */
    public void setName(gov.nih.nci.cabig.ccts.domain.cdt.ST name) {
        this.name = name;
    }


    /**
     * Gets the randomizationWeight value for this PerformedArm.
     * 
     * @return randomizationWeight The relative proportion of subjects to be randomized to the arm.
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
     * Sets the randomizationWeight value for this PerformedArm.
     * 
     * @param randomizationWeight The relative proportion of subjects to be randomized to the arm.
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
     * Gets the performedStudy value for this PerformedArm.
     * 
     * @return performedStudy
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedStudy getPerformedStudy() {
        return performedStudy;
    }


    /**
     * Sets the performedStudy value for this PerformedArm.
     * 
     * @param performedStudy
     */
    public void setPerformedStudy(gov.nih.nci.cabig.ccts.domain.bridg.PerformedStudy performedStudy) {
        this.performedStudy = performedStudy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformedArm)) return false;
        PerformedArm other = (PerformedArm) obj;
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
            ((this.performedStudy==null && other.getPerformedStudy()==null) || 
             (this.performedStudy!=null &&
              this.performedStudy.equals(other.getPerformedStudy())));
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
        if (getPerformedStudy() != null) {
            _hashCode += getPerformedStudy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PerformedArm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedArm"));
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
        elemField.setFieldName("performedStudy");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedStudy"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedStudy"));
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
