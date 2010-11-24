/**
 * PlannedEpochRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * Rule that governs the transition between two PlannedEpochs.
 * 
 * For example, If subject experiences a serious Adverse Event (AE) while
 * in the First Treatment Epoch, move to Follow-up Epoch.
 * 
 * For example, if there were entry and exit criteria that applied to
 * all Arms of a study.
 */
public class PlannedEpochRule  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.PlannedEpoch plannedEpoch;

    public PlannedEpochRule() {
    }

    public PlannedEpochRule(
           gov.nih.nci.cabig.ccts.domain.bridg.PlannedEpoch plannedEpoch) {
           this.plannedEpoch = plannedEpoch;
    }


    /**
     * Gets the plannedEpoch value for this PlannedEpochRule.
     * 
     * @return plannedEpoch
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PlannedEpoch getPlannedEpoch() {
        return plannedEpoch;
    }


    /**
     * Sets the plannedEpoch value for this PlannedEpochRule.
     * 
     * @param plannedEpoch
     */
    public void setPlannedEpoch(gov.nih.nci.cabig.ccts.domain.bridg.PlannedEpoch plannedEpoch) {
        this.plannedEpoch = plannedEpoch;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlannedEpochRule)) return false;
        PlannedEpochRule other = (PlannedEpochRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.plannedEpoch==null && other.getPlannedEpoch()==null) || 
             (this.plannedEpoch!=null &&
              this.plannedEpoch.equals(other.getPlannedEpoch())));
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
        if (getPlannedEpoch() != null) {
            _hashCode += getPlannedEpoch().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlannedEpochRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedEpochRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedEpoch");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedEpoch"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PlannedEpoch"));
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
