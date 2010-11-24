/**
 * PerformedStudy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A business process state of a study that is a collector of performed
 * activities in a study including a description of the actual number
 * of study subjects and the start and end dates of enrollment.
 * 
 * A performed study theoretically occurs after a planned study has been
 * approved for execution.
 */
public class PerformedStudy  extends gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol  implements java.io.Serializable {
    /** The actual number of subject who were accrued into the study. 
 * This includes all of the subjects that have been enrolled into the
 * study. */
    private int actualAccrualNumber;
    /** A range in time used as a reference start point and end point for
 * one or more subject-specific activities over the course of a study.
 * When reference start date is used in combination with the reference
 * end date, one can determine the overall subject-specific study duration. */
    private gov.nih.nci.cabig.ccts.domain.cdt.IVLTS referenceDateRange;
    private gov.nih.nci.cabig.ccts.domain.bridg.PerformedActivity[] performedActivity;
    private gov.nih.nci.cabig.ccts.domain.bridg.PlannedStudy plannedStudy;

    public PerformedStudy() {
    }

    public PerformedStudy(
           int actualAccrualNumber,
           gov.nih.nci.cabig.ccts.domain.bridg.PerformedActivity[] performedActivity,
           gov.nih.nci.cabig.ccts.domain.bridg.PlannedStudy plannedStudy,
           gov.nih.nci.cabig.ccts.domain.cdt.IVLTS referenceDateRange) {
           this.actualAccrualNumber = actualAccrualNumber;
           this.referenceDateRange = referenceDateRange;
           this.performedActivity = performedActivity;
           this.plannedStudy = plannedStudy;
    }


    /**
     * Gets the actualAccrualNumber value for this PerformedStudy.
     * 
     * @return actualAccrualNumber The actual number of subject who were accrued into the study. 
 * This includes all of the subjects that have been enrolled into the
 * study.
     */
    public int getActualAccrualNumber() {
        return actualAccrualNumber;
    }


    /**
     * Sets the actualAccrualNumber value for this PerformedStudy.
     * 
     * @param actualAccrualNumber The actual number of subject who were accrued into the study. 
 * This includes all of the subjects that have been enrolled into the
 * study.
     */
    public void setActualAccrualNumber(int actualAccrualNumber) {
        this.actualAccrualNumber = actualAccrualNumber;
    }


    /**
     * Gets the referenceDateRange value for this PerformedStudy.
     * 
     * @return referenceDateRange A range in time used as a reference start point and end point for
 * one or more subject-specific activities over the course of a study.
 * When reference start date is used in combination with the reference
 * end date, one can determine the overall subject-specific study duration.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.IVLTS getReferenceDateRange() {
        return referenceDateRange;
    }


    /**
     * Sets the referenceDateRange value for this PerformedStudy.
     * 
     * @param referenceDateRange A range in time used as a reference start point and end point for
 * one or more subject-specific activities over the course of a study.
 * When reference start date is used in combination with the reference
 * end date, one can determine the overall subject-specific study duration.
     */
    public void setReferenceDateRange(gov.nih.nci.cabig.ccts.domain.cdt.IVLTS referenceDateRange) {
        this.referenceDateRange = referenceDateRange;
    }


    /**
     * Gets the performedActivity value for this PerformedStudy.
     * 
     * @return performedActivity
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedActivity[] getPerformedActivity() {
        return performedActivity;
    }


    /**
     * Sets the performedActivity value for this PerformedStudy.
     * 
     * @param performedActivity
     */
    public void setPerformedActivity(gov.nih.nci.cabig.ccts.domain.bridg.PerformedActivity[] performedActivity) {
        this.performedActivity = performedActivity;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedActivity getPerformedActivity(int i) {
        return this.performedActivity[i];
    }

    public void setPerformedActivity(int i, gov.nih.nci.cabig.ccts.domain.bridg.PerformedActivity _value) {
        this.performedActivity[i] = _value;
    }


    /**
     * Gets the plannedStudy value for this PerformedStudy.
     * 
     * @return plannedStudy
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PlannedStudy getPlannedStudy() {
        return plannedStudy;
    }


    /**
     * Sets the plannedStudy value for this PerformedStudy.
     * 
     * @param plannedStudy
     */
    public void setPlannedStudy(gov.nih.nci.cabig.ccts.domain.bridg.PlannedStudy plannedStudy) {
        this.plannedStudy = plannedStudy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformedStudy)) return false;
        PerformedStudy other = (PerformedStudy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.actualAccrualNumber == other.getActualAccrualNumber() &&
            ((this.referenceDateRange==null && other.getReferenceDateRange()==null) || 
             (this.referenceDateRange!=null &&
              this.referenceDateRange.equals(other.getReferenceDateRange()))) &&
            ((this.performedActivity==null && other.getPerformedActivity()==null) || 
             (this.performedActivity!=null &&
              java.util.Arrays.equals(this.performedActivity, other.getPerformedActivity()))) &&
            ((this.plannedStudy==null && other.getPlannedStudy()==null) || 
             (this.plannedStudy!=null &&
              this.plannedStudy.equals(other.getPlannedStudy())));
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
        _hashCode += getActualAccrualNumber();
        if (getReferenceDateRange() != null) {
            _hashCode += getReferenceDateRange().hashCode();
        }
        if (getPerformedActivity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPerformedActivity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPerformedActivity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPlannedStudy() != null) {
            _hashCode += getPlannedStudy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PerformedStudy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedStudy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualAccrualNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "actualAccrualNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceDateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "referenceDateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "IVLTS"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performedActivity");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedActivity"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedActivity"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedStudy");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedStudy"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedStudy"));
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
