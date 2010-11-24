/**
 * DefinedStudySegment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A template for a state that a subject might pass through when used
 * in the context of a study.  A DefinedStudySegment is a reusable collection
 * of DefinedActivities that are grouped and repeatedly instantiated
 * in studies.  A DefinedStudySegment is a "kind-of" study segment rather
 * than an "instance-of" study segment.
 * 
 * For example, a treatment study segment might be defined as the collection
 * of a drug administration activity lasting 1 week followed by a blood
 * cheminstry activity.  This study segment might be instantiated in
 * the cotnext of a PlannedStudy that uses this definition in combination
 * with others several times across several different arms.
 */
public class DefinedStudySegment  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.DefinedActivity[] definedActivity;
    private gov.nih.nci.cabig.ccts.domain.bridg.PlannedStudySegment plannedStudySegment;

    public DefinedStudySegment() {
    }

    public DefinedStudySegment(
           gov.nih.nci.cabig.ccts.domain.bridg.DefinedActivity[] definedActivity,
           gov.nih.nci.cabig.ccts.domain.bridg.PlannedStudySegment plannedStudySegment) {
           this.definedActivity = definedActivity;
           this.plannedStudySegment = plannedStudySegment;
    }


    /**
     * Gets the definedActivity value for this DefinedStudySegment.
     * 
     * @return definedActivity
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.DefinedActivity[] getDefinedActivity() {
        return definedActivity;
    }


    /**
     * Sets the definedActivity value for this DefinedStudySegment.
     * 
     * @param definedActivity
     */
    public void setDefinedActivity(gov.nih.nci.cabig.ccts.domain.bridg.DefinedActivity[] definedActivity) {
        this.definedActivity = definedActivity;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.DefinedActivity getDefinedActivity(int i) {
        return this.definedActivity[i];
    }

    public void setDefinedActivity(int i, gov.nih.nci.cabig.ccts.domain.bridg.DefinedActivity _value) {
        this.definedActivity[i] = _value;
    }


    /**
     * Gets the plannedStudySegment value for this DefinedStudySegment.
     * 
     * @return plannedStudySegment
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PlannedStudySegment getPlannedStudySegment() {
        return plannedStudySegment;
    }


    /**
     * Sets the plannedStudySegment value for this DefinedStudySegment.
     * 
     * @param plannedStudySegment
     */
    public void setPlannedStudySegment(gov.nih.nci.cabig.ccts.domain.bridg.PlannedStudySegment plannedStudySegment) {
        this.plannedStudySegment = plannedStudySegment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DefinedStudySegment)) return false;
        DefinedStudySegment other = (DefinedStudySegment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.definedActivity==null && other.getDefinedActivity()==null) || 
             (this.definedActivity!=null &&
              java.util.Arrays.equals(this.definedActivity, other.getDefinedActivity()))) &&
            ((this.plannedStudySegment==null && other.getPlannedStudySegment()==null) || 
             (this.plannedStudySegment!=null &&
              this.plannedStudySegment.equals(other.getPlannedStudySegment())));
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
        if (getDefinedActivity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefinedActivity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDefinedActivity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPlannedStudySegment() != null) {
            _hashCode += getPlannedStudySegment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DefinedStudySegment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DefinedStudySegment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("definedActivity");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DefinedActivity"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DefinedActivity"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedStudySegment");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedStudySegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedStudySegment"));
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
