/**
 * AssessmentRelationship.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * The semantic link between assessments.  
 * 
 * For example, it may be necessary to assess an x-ray to determine whether
 * or not a lesion represents metastatic disease before you can determine
 * the stage of a patient's cancer.
 */
public class AssessmentRelationship  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.Assessment assessment;
    private gov.nih.nci.cabig.ccts.domain.bridg.Assessment assessment2;

    public AssessmentRelationship() {
    }

    public AssessmentRelationship(
           gov.nih.nci.cabig.ccts.domain.bridg.Assessment assessment,
           gov.nih.nci.cabig.ccts.domain.bridg.Assessment assessment2) {
           this.assessment = assessment;
           this.assessment2 = assessment2;
    }


    /**
     * Gets the assessment value for this AssessmentRelationship.
     * 
     * @return assessment
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.Assessment getAssessment() {
        return assessment;
    }


    /**
     * Sets the assessment value for this AssessmentRelationship.
     * 
     * @param assessment
     */
    public void setAssessment(gov.nih.nci.cabig.ccts.domain.bridg.Assessment assessment) {
        this.assessment = assessment;
    }


    /**
     * Gets the assessment2 value for this AssessmentRelationship.
     * 
     * @return assessment2
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.Assessment getAssessment2() {
        return assessment2;
    }


    /**
     * Sets the assessment2 value for this AssessmentRelationship.
     * 
     * @param assessment2
     */
    public void setAssessment2(gov.nih.nci.cabig.ccts.domain.bridg.Assessment assessment2) {
        this.assessment2 = assessment2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssessmentRelationship)) return false;
        AssessmentRelationship other = (AssessmentRelationship) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assessment==null && other.getAssessment()==null) || 
             (this.assessment!=null &&
              this.assessment.equals(other.getAssessment()))) &&
            ((this.assessment2==null && other.getAssessment2()==null) || 
             (this.assessment2!=null &&
              this.assessment2.equals(other.getAssessment2())));
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
        if (getAssessment() != null) {
            _hashCode += getAssessment().hashCode();
        }
        if (getAssessment2() != null) {
            _hashCode += getAssessment2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssessmentRelationship.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "AssessmentRelationship"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assessment");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Assessment"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Assessment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assessment");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Assessment"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Assessment"));
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
