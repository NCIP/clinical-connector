/**
 * PlannedStudySoA.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A set of information that describes what activities will be performed,
 * when, and for which subjects.  Much of this information can be visualized
 * as a table whose rows are PlannedActivities, and whose columns are
 * PlannedSubjectStudyEncounters.  The cells in such a table are instances
 * of PlannedSoACells.  
 * 
 * Tabular representations of all or part of a Planned Schedule of Activities
 * (SOA) are often included in protocol documents, and are sometimes
 * called Schedules of Activities, Schedules of Events, or  Time and
 * Events Tables.
 * 
 * For example, a Planned SOA might include information about tests planned
 * to take place at particular clinic visits, the order of tests within
 * visits, study drug the subject is to take and diary data they are
 * to record while in a treatment StudySegment, and conditions under
 * which study drug should be stopped.
 */
public class PlannedStudySoA  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.PlannedArmSoA[] plannedArmSoA;

    public PlannedStudySoA() {
    }

    public PlannedStudySoA(
           gov.nih.nci.cabig.ccts.domain.bridg.PlannedArmSoA[] plannedArmSoA) {
           this.plannedArmSoA = plannedArmSoA;
    }


    /**
     * Gets the plannedArmSoA value for this PlannedStudySoA.
     * 
     * @return plannedArmSoA
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PlannedArmSoA[] getPlannedArmSoA() {
        return plannedArmSoA;
    }


    /**
     * Sets the plannedArmSoA value for this PlannedStudySoA.
     * 
     * @param plannedArmSoA
     */
    public void setPlannedArmSoA(gov.nih.nci.cabig.ccts.domain.bridg.PlannedArmSoA[] plannedArmSoA) {
        this.plannedArmSoA = plannedArmSoA;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.PlannedArmSoA getPlannedArmSoA(int i) {
        return this.plannedArmSoA[i];
    }

    public void setPlannedArmSoA(int i, gov.nih.nci.cabig.ccts.domain.bridg.PlannedArmSoA _value) {
        this.plannedArmSoA[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlannedStudySoA)) return false;
        PlannedStudySoA other = (PlannedStudySoA) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.plannedArmSoA==null && other.getPlannedArmSoA()==null) || 
             (this.plannedArmSoA!=null &&
              java.util.Arrays.equals(this.plannedArmSoA, other.getPlannedArmSoA())));
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
        if (getPlannedArmSoA() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlannedArmSoA());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlannedArmSoA(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlannedStudySoA.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedStudySoA"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedArmSoA");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedArmSoA"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedArmSoA"));
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
