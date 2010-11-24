/**
 * PerformedEpochRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * Rule that governs the transition between two PerformedEpochs.
 * 
 * For example, If subject experiences a serious Adverse Event (AE) while
 * in the First Treatment Epoch, move to Follow-up Epoch.
 * 
 * For example, if there were entry and exit criteria that applied to
 * all Arms of a study.
 */
public class PerformedEpochRule  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.PerformedEpoch performedEpoch;
    private gov.nih.nci.cabig.ccts.domain.bridg.PerformedEpoch performedEpoch2;

    public PerformedEpochRule() {
    }

    public PerformedEpochRule(
           gov.nih.nci.cabig.ccts.domain.bridg.PerformedEpoch performedEpoch,
           gov.nih.nci.cabig.ccts.domain.bridg.PerformedEpoch performedEpoch2) {
           this.performedEpoch = performedEpoch;
           this.performedEpoch2 = performedEpoch2;
    }


    /**
     * Gets the performedEpoch value for this PerformedEpochRule.
     * 
     * @return performedEpoch
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedEpoch getPerformedEpoch() {
        return performedEpoch;
    }


    /**
     * Sets the performedEpoch value for this PerformedEpochRule.
     * 
     * @param performedEpoch
     */
    public void setPerformedEpoch(gov.nih.nci.cabig.ccts.domain.bridg.PerformedEpoch performedEpoch) {
        this.performedEpoch = performedEpoch;
    }


    /**
     * Gets the performedEpoch2 value for this PerformedEpochRule.
     * 
     * @return performedEpoch2
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedEpoch getPerformedEpoch2() {
        return performedEpoch2;
    }


    /**
     * Sets the performedEpoch2 value for this PerformedEpochRule.
     * 
     * @param performedEpoch2
     */
    public void setPerformedEpoch2(gov.nih.nci.cabig.ccts.domain.bridg.PerformedEpoch performedEpoch2) {
        this.performedEpoch2 = performedEpoch2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformedEpochRule)) return false;
        PerformedEpochRule other = (PerformedEpochRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.performedEpoch==null && other.getPerformedEpoch()==null) || 
             (this.performedEpoch!=null &&
              this.performedEpoch.equals(other.getPerformedEpoch()))) &&
            ((this.performedEpoch2==null && other.getPerformedEpoch2()==null) || 
             (this.performedEpoch2!=null &&
              this.performedEpoch2.equals(other.getPerformedEpoch2())));
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
        if (getPerformedEpoch() != null) {
            _hashCode += getPerformedEpoch().hashCode();
        }
        if (getPerformedEpoch2() != null) {
            _hashCode += getPerformedEpoch2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PerformedEpochRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedEpochRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performedEpoch");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedEpoch"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedEpoch"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performedEpoch");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedEpoch"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedEpoch"));
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
