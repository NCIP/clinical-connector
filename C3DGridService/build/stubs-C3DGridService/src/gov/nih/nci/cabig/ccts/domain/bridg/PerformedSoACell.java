/**
 * PerformedSoACell.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * Relates a Performed Activity to a Performed Subject Study Encounter
 * (SSE).  It can be visualized as a single cell in the tabular representation
 * of the Performed Schedule of Activities (SOA), i.e., as an X in a
 * particular row and column of the Performed SOA table that indicates
 * that the scheduled activity represented by that row took place during
 * the SSE represented by that column.
 * 
 * For example, CBC --Row  :Week 2 -- Column;  StudySubject - Mr. Jones
 * in NCI 2122
 */
public class PerformedSoACell  implements java.io.Serializable {
    /** The point in, or interval of, time to which one or more activities
 * was performed. 
 * 
 * For example, 28 days after enrollment on the study. */
    private gov.nih.nci.cabig.ccts.domain.cdt.IVLTS performedTiming;
    private gov.nih.nci.cabig.ccts.domain.bridg.PerformedActivity performedActivity;

    public PerformedSoACell() {
    }

    public PerformedSoACell(
           gov.nih.nci.cabig.ccts.domain.bridg.PerformedActivity performedActivity,
           gov.nih.nci.cabig.ccts.domain.cdt.IVLTS performedTiming) {
           this.performedTiming = performedTiming;
           this.performedActivity = performedActivity;
    }


    /**
     * Gets the performedTiming value for this PerformedSoACell.
     * 
     * @return performedTiming The point in, or interval of, time to which one or more activities
 * was performed. 
 * 
 * For example, 28 days after enrollment on the study.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.IVLTS getPerformedTiming() {
        return performedTiming;
    }


    /**
     * Sets the performedTiming value for this PerformedSoACell.
     * 
     * @param performedTiming The point in, or interval of, time to which one or more activities
 * was performed. 
 * 
 * For example, 28 days after enrollment on the study.
     */
    public void setPerformedTiming(gov.nih.nci.cabig.ccts.domain.cdt.IVLTS performedTiming) {
        this.performedTiming = performedTiming;
    }


    /**
     * Gets the performedActivity value for this PerformedSoACell.
     * 
     * @return performedActivity
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedActivity getPerformedActivity() {
        return performedActivity;
    }


    /**
     * Sets the performedActivity value for this PerformedSoACell.
     * 
     * @param performedActivity
     */
    public void setPerformedActivity(gov.nih.nci.cabig.ccts.domain.bridg.PerformedActivity performedActivity) {
        this.performedActivity = performedActivity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformedSoACell)) return false;
        PerformedSoACell other = (PerformedSoACell) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.performedTiming==null && other.getPerformedTiming()==null) || 
             (this.performedTiming!=null &&
              this.performedTiming.equals(other.getPerformedTiming()))) &&
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
        if (getPerformedTiming() != null) {
            _hashCode += getPerformedTiming().hashCode();
        }
        if (getPerformedActivity() != null) {
            _hashCode += getPerformedActivity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PerformedSoACell.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedSoACell"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performedTiming");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "performedTiming"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "IVLTS"));
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
