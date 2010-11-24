/**
 * SubmissionUnitRelationship.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * The relationship between a submission and the submission units.
 * 
 * 
 * For example, in RPS, many times the submissions units are transmitted
 * to the regulatory agency as the data is available, but the submission
 * unit may actually be evaluated in a different order than the order
 * that it was submitted.  This is particularly useful when a submission
 * unit is an amendment, or a revision to a previous submission. The
 * submission order helps to clarify which submission unit should be
 * evaluated next. 
 * 
 * NOTE: The dynamic aspects of the model are needed to help describe
 * the way in which the receipt dates and sequence numbers relate to
 * one another. It also means that we should link the activity diagrams
 * to the state diagrams to help describe the semantics that articulate
 * the regulatory timelines for evaluating the submission unit.
 */
public class SubmissionUnitRelationship  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.SubmissionUnit submissionUnit;

    public SubmissionUnitRelationship() {
    }

    public SubmissionUnitRelationship(
           gov.nih.nci.cabig.ccts.domain.bridg.SubmissionUnit submissionUnit) {
           this.submissionUnit = submissionUnit;
    }


    /**
     * Gets the submissionUnit value for this SubmissionUnitRelationship.
     * 
     * @return submissionUnit
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.SubmissionUnit getSubmissionUnit() {
        return submissionUnit;
    }


    /**
     * Sets the submissionUnit value for this SubmissionUnitRelationship.
     * 
     * @param submissionUnit
     */
    public void setSubmissionUnit(gov.nih.nci.cabig.ccts.domain.bridg.SubmissionUnit submissionUnit) {
        this.submissionUnit = submissionUnit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmissionUnitRelationship)) return false;
        SubmissionUnitRelationship other = (SubmissionUnitRelationship) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.submissionUnit==null && other.getSubmissionUnit()==null) || 
             (this.submissionUnit!=null &&
              this.submissionUnit.equals(other.getSubmissionUnit())));
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
        if (getSubmissionUnit() != null) {
            _hashCode += getSubmissionUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubmissionUnitRelationship.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "SubmissionUnitRelationship"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submissionUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "SubmissionUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "SubmissionUnit"));
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
