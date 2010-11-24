/**
 * DefinedActivityStudySegmentRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A rule that governs the transition to a new DefinedStudySegment
 * based on the results of a DefinedActivity in the current DefinedStudySegment.
 */
public class DefinedActivityStudySegmentRule  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.DefinedStudySegment definedStudySegment;
    private gov.nih.nci.cabig.ccts.domain.bridg.DefinedActivity definedActivity;

    public DefinedActivityStudySegmentRule() {
    }

    public DefinedActivityStudySegmentRule(
           gov.nih.nci.cabig.ccts.domain.bridg.DefinedActivity definedActivity,
           gov.nih.nci.cabig.ccts.domain.bridg.DefinedStudySegment definedStudySegment) {
           this.definedStudySegment = definedStudySegment;
           this.definedActivity = definedActivity;
    }


    /**
     * Gets the definedStudySegment value for this DefinedActivityStudySegmentRule.
     * 
     * @return definedStudySegment
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.DefinedStudySegment getDefinedStudySegment() {
        return definedStudySegment;
    }


    /**
     * Sets the definedStudySegment value for this DefinedActivityStudySegmentRule.
     * 
     * @param definedStudySegment
     */
    public void setDefinedStudySegment(gov.nih.nci.cabig.ccts.domain.bridg.DefinedStudySegment definedStudySegment) {
        this.definedStudySegment = definedStudySegment;
    }


    /**
     * Gets the definedActivity value for this DefinedActivityStudySegmentRule.
     * 
     * @return definedActivity
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.DefinedActivity getDefinedActivity() {
        return definedActivity;
    }


    /**
     * Sets the definedActivity value for this DefinedActivityStudySegmentRule.
     * 
     * @param definedActivity
     */
    public void setDefinedActivity(gov.nih.nci.cabig.ccts.domain.bridg.DefinedActivity definedActivity) {
        this.definedActivity = definedActivity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DefinedActivityStudySegmentRule)) return false;
        DefinedActivityStudySegmentRule other = (DefinedActivityStudySegmentRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.definedStudySegment==null && other.getDefinedStudySegment()==null) || 
             (this.definedStudySegment!=null &&
              this.definedStudySegment.equals(other.getDefinedStudySegment()))) &&
            ((this.definedActivity==null && other.getDefinedActivity()==null) || 
             (this.definedActivity!=null &&
              this.definedActivity.equals(other.getDefinedActivity())));
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
        if (getDefinedStudySegment() != null) {
            _hashCode += getDefinedStudySegment().hashCode();
        }
        if (getDefinedActivity() != null) {
            _hashCode += getDefinedActivity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DefinedActivityStudySegmentRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DefinedActivityStudySegmentRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("definedStudySegment");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DefinedStudySegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DefinedStudySegment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("definedActivity");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DefinedActivity"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DefinedActivity"));
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
