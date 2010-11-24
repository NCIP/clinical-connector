/**
 * PerformedActivityStudySegmentRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A rule that governs the transition to a new study segment based
 * on the results of a PerformedActivity in the current study segment.
 * 
 * For example, if a subject is not in study segment A, then receiving
 * a dose of study agent A is the activity that marks/defines their transition
 * into study segment A.  
 * 
 * For example, start the radiation study segment 2-4 weeks after surgery.
 */
public class PerformedActivityStudySegmentRule  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.PerformedStudySegment performedStudySegment;
    private gov.nih.nci.cabig.ccts.domain.bridg.PerformedActivity performedActivity;

    public PerformedActivityStudySegmentRule() {
    }

    public PerformedActivityStudySegmentRule(
           gov.nih.nci.cabig.ccts.domain.bridg.PerformedActivity performedActivity,
           gov.nih.nci.cabig.ccts.domain.bridg.PerformedStudySegment performedStudySegment) {
           this.performedStudySegment = performedStudySegment;
           this.performedActivity = performedActivity;
    }


    /**
     * Gets the performedStudySegment value for this PerformedActivityStudySegmentRule.
     * 
     * @return performedStudySegment
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedStudySegment getPerformedStudySegment() {
        return performedStudySegment;
    }


    /**
     * Sets the performedStudySegment value for this PerformedActivityStudySegmentRule.
     * 
     * @param performedStudySegment
     */
    public void setPerformedStudySegment(gov.nih.nci.cabig.ccts.domain.bridg.PerformedStudySegment performedStudySegment) {
        this.performedStudySegment = performedStudySegment;
    }


    /**
     * Gets the performedActivity value for this PerformedActivityStudySegmentRule.
     * 
     * @return performedActivity
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedActivity getPerformedActivity() {
        return performedActivity;
    }


    /**
     * Sets the performedActivity value for this PerformedActivityStudySegmentRule.
     * 
     * @param performedActivity
     */
    public void setPerformedActivity(gov.nih.nci.cabig.ccts.domain.bridg.PerformedActivity performedActivity) {
        this.performedActivity = performedActivity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformedActivityStudySegmentRule)) return false;
        PerformedActivityStudySegmentRule other = (PerformedActivityStudySegmentRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.performedStudySegment==null && other.getPerformedStudySegment()==null) || 
             (this.performedStudySegment!=null &&
              this.performedStudySegment.equals(other.getPerformedStudySegment()))) &&
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
        int _hashCode = 1;
        if (getPerformedStudySegment() != null) {
            _hashCode += getPerformedStudySegment().hashCode();
        }
        if (getPerformedActivity() != null) {
            _hashCode += getPerformedActivity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PerformedActivityStudySegmentRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedActivityStudySegmentRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performedStudySegment");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedStudySegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedStudySegment"));
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
