/**
 * Assessor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * The person or organization making the assessment.
 * 
 * For example, healthcare provider, adjudication committee, family member,
 * radiologist, vendor (may provide a uniform assessment for all sites
 * participating in a study).
 */
public class Assessor  extends gov.nih.nci.cabig.ccts.domain.bridg.PerformingParty  implements java.io.Serializable {
    /** A coded value specfiying the particular kind of person who provided
 * the evaluation. Used only for results that are subjective (e.g., assigned
 * by a person or a group). 
 * 
 * For example, investigator, adjudication committee, vendor, etc. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD type;
    private gov.nih.nci.cabig.ccts.domain.bridg.Assessment[] assessment;
    private gov.nih.nci.cabig.ccts.domain.bridg.PerformedActivity performedActivity;

    public Assessor() {
    }

    public Assessor(
           gov.nih.nci.cabig.ccts.domain.bridg.Assessment[] assessment,
           gov.nih.nci.cabig.ccts.domain.bridg.PerformedActivity performedActivity,
           gov.nih.nci.cabig.ccts.domain.cdt.CD type) {
           this.type = type;
           this.assessment = assessment;
           this.performedActivity = performedActivity;
    }


    /**
     * Gets the type value for this Assessor.
     * 
     * @return type A coded value specfiying the particular kind of person who provided
 * the evaluation. Used only for results that are subjective (e.g., assigned
 * by a person or a group). 
 * 
 * For example, investigator, adjudication committee, vendor, etc.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getType() {
        return type;
    }


    /**
     * Sets the type value for this Assessor.
     * 
     * @param type A coded value specfiying the particular kind of person who provided
 * the evaluation. Used only for results that are subjective (e.g., assigned
 * by a person or a group). 
 * 
 * For example, investigator, adjudication committee, vendor, etc.
     */
    public void setType(gov.nih.nci.cabig.ccts.domain.cdt.CD type) {
        this.type = type;
    }


    /**
     * Gets the assessment value for this Assessor.
     * 
     * @return assessment
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.Assessment[] getAssessment() {
        return assessment;
    }


    /**
     * Sets the assessment value for this Assessor.
     * 
     * @param assessment
     */
    public void setAssessment(gov.nih.nci.cabig.ccts.domain.bridg.Assessment[] assessment) {
        this.assessment = assessment;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.Assessment getAssessment(int i) {
        return this.assessment[i];
    }

    public void setAssessment(int i, gov.nih.nci.cabig.ccts.domain.bridg.Assessment _value) {
        this.assessment[i] = _value;
    }


    /**
     * Gets the performedActivity value for this Assessor.
     * 
     * @return performedActivity
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedActivity getPerformedActivity() {
        return performedActivity;
    }


    /**
     * Sets the performedActivity value for this Assessor.
     * 
     * @param performedActivity
     */
    public void setPerformedActivity(gov.nih.nci.cabig.ccts.domain.bridg.PerformedActivity performedActivity) {
        this.performedActivity = performedActivity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Assessor)) return false;
        Assessor other = (Assessor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.assessment==null && other.getAssessment()==null) || 
             (this.assessment!=null &&
              java.util.Arrays.equals(this.assessment, other.getAssessment()))) &&
            ((this.performedActivity==null && other.getPerformedActivity()==null) || 
             (this.performedActivity!=null &&
              this.performedActivity.equals(other.getPerformedActivity())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getAssessment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssessment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssessment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPerformedActivity() != null) {
            _hashCode += getPerformedActivity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Assessor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Assessor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assessment");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Assessment"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Assessment"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performedActivity");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedActivity"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedActivity"));
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
