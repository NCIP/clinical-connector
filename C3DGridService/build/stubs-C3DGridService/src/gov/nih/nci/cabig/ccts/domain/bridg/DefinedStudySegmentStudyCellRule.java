/**
 * DefinedStudySegmentStudyCellRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * Specifies how a StudyCell is related to one of the PlannedStudySegments
 * instances it contains.  A concept that  frequently occurs in studies
 * and therefore is called out as a reusable template and may be used
 * in a defined study
 */
public class DefinedStudySegmentStudyCellRule  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.DefinedStudySegment definedStudySegment;

    public DefinedStudySegmentStudyCellRule() {
    }

    public DefinedStudySegmentStudyCellRule(
           gov.nih.nci.cabig.ccts.domain.bridg.DefinedStudySegment definedStudySegment) {
           this.definedStudySegment = definedStudySegment;
    }


    /**
     * Gets the definedStudySegment value for this DefinedStudySegmentStudyCellRule.
     * 
     * @return definedStudySegment
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.DefinedStudySegment getDefinedStudySegment() {
        return definedStudySegment;
    }


    /**
     * Sets the definedStudySegment value for this DefinedStudySegmentStudyCellRule.
     * 
     * @param definedStudySegment
     */
    public void setDefinedStudySegment(gov.nih.nci.cabig.ccts.domain.bridg.DefinedStudySegment definedStudySegment) {
        this.definedStudySegment = definedStudySegment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DefinedStudySegmentStudyCellRule)) return false;
        DefinedStudySegmentStudyCellRule other = (DefinedStudySegmentStudyCellRule) obj;
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
              this.definedStudySegment.equals(other.getDefinedStudySegment())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DefinedStudySegmentStudyCellRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DefinedStudySegmentStudyCellRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("definedStudySegment");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DefinedStudySegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DefinedStudySegment"));
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
