/**
 * ScheduledSoACell.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A Scheduled Schedule of Activities (SOA) Cell relates a Scheduled
 * Activity to a Scheduled Subject Study Encounter (SSE).  It can be
 * visualized as a single cell in the tabular representation of the Scheduled
 * SOA, i.e., as an X in a particular row and column of the Scheduled
 * SOA table that indicates that the scheduled activity represented by
 * that row is to take place during the SSE represented by that column.
 * 
 * For example, CBC --Row  :Week 2 -- Column;  StudySubject - Mr. Jones
 * in NCI 2122
 */
public class ScheduledSoACell  implements java.io.Serializable {
    /** A comment, reminder, note of something to watch for, etc.  The
 * content of this attribute will be implementation-driven and defined
 * by the user who creates the SoA. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST note;
    /** The point in, or interval of, time to which one or more activities
 * are associated. 
 * 
 * For example, 28 days after enrollment on the study. */
    private gov.nih.nci.cabig.ccts.domain.cdt.IVLTS scheduledTiming;
    private gov.nih.nci.cabig.ccts.domain.bridg.ScheduledActivity scheduledActivity;

    public ScheduledSoACell() {
    }

    public ScheduledSoACell(
           gov.nih.nci.cabig.ccts.domain.cdt.ST note,
           gov.nih.nci.cabig.ccts.domain.bridg.ScheduledActivity scheduledActivity,
           gov.nih.nci.cabig.ccts.domain.cdt.IVLTS scheduledTiming) {
           this.note = note;
           this.scheduledTiming = scheduledTiming;
           this.scheduledActivity = scheduledActivity;
    }


    /**
     * Gets the note value for this ScheduledSoACell.
     * 
     * @return note A comment, reminder, note of something to watch for, etc.  The
 * content of this attribute will be implementation-driven and defined
 * by the user who creates the SoA.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getNote() {
        return note;
    }


    /**
     * Sets the note value for this ScheduledSoACell.
     * 
     * @param note A comment, reminder, note of something to watch for, etc.  The
 * content of this attribute will be implementation-driven and defined
 * by the user who creates the SoA.
     */
    public void setNote(gov.nih.nci.cabig.ccts.domain.cdt.ST note) {
        this.note = note;
    }


    /**
     * Gets the scheduledTiming value for this ScheduledSoACell.
     * 
     * @return scheduledTiming The point in, or interval of, time to which one or more activities
 * are associated. 
 * 
 * For example, 28 days after enrollment on the study.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.IVLTS getScheduledTiming() {
        return scheduledTiming;
    }


    /**
     * Sets the scheduledTiming value for this ScheduledSoACell.
     * 
     * @param scheduledTiming The point in, or interval of, time to which one or more activities
 * are associated. 
 * 
 * For example, 28 days after enrollment on the study.
     */
    public void setScheduledTiming(gov.nih.nci.cabig.ccts.domain.cdt.IVLTS scheduledTiming) {
        this.scheduledTiming = scheduledTiming;
    }


    /**
     * Gets the scheduledActivity value for this ScheduledSoACell.
     * 
     * @return scheduledActivity
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.ScheduledActivity getScheduledActivity() {
        return scheduledActivity;
    }


    /**
     * Sets the scheduledActivity value for this ScheduledSoACell.
     * 
     * @param scheduledActivity
     */
    public void setScheduledActivity(gov.nih.nci.cabig.ccts.domain.bridg.ScheduledActivity scheduledActivity) {
        this.scheduledActivity = scheduledActivity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduledSoACell)) return false;
        ScheduledSoACell other = (ScheduledSoACell) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            ((this.scheduledTiming==null && other.getScheduledTiming()==null) || 
             (this.scheduledTiming!=null &&
              this.scheduledTiming.equals(other.getScheduledTiming()))) &&
            ((this.scheduledActivity==null && other.getScheduledActivity()==null) || 
             (this.scheduledActivity!=null &&
              this.scheduledActivity.equals(other.getScheduledActivity())));
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
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getScheduledTiming() != null) {
            _hashCode += getScheduledTiming().hashCode();
        }
        if (getScheduledActivity() != null) {
            _hashCode += getScheduledActivity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScheduledSoACell.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledSoACell"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "note"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledTiming");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "scheduledTiming"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "IVLTS"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledActivity");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledActivity"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledActivity"));
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
