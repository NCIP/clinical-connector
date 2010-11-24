/**
 * PerformedSpecimenCollection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * The completed action of gathering samples that may be used for
 * subsequent analysis.  
 * 
 * For example, a blood draw.
 */
public class PerformedSpecimenCollection  extends gov.nih.nci.cabig.ccts.domain.bridg.PerformedProcedure  implements java.io.Serializable {
    /** Specifies whether the participant was fasting when the specimen
 * was obtained. */
    private gov.nih.nci.cabig.ccts.domain.cdt.BL fastingStatusIndicator;

    public PerformedSpecimenCollection() {
    }

    public PerformedSpecimenCollection(
           gov.nih.nci.cabig.ccts.domain.cdt.BL fastingStatusIndicator) {
           this.fastingStatusIndicator = fastingStatusIndicator;
    }


    /**
     * Gets the fastingStatusIndicator value for this PerformedSpecimenCollection.
     * 
     * @return fastingStatusIndicator Specifies whether the participant was fasting when the specimen
 * was obtained.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.BL getFastingStatusIndicator() {
        return fastingStatusIndicator;
    }


    /**
     * Sets the fastingStatusIndicator value for this PerformedSpecimenCollection.
     * 
     * @param fastingStatusIndicator Specifies whether the participant was fasting when the specimen
 * was obtained.
     */
    public void setFastingStatusIndicator(gov.nih.nci.cabig.ccts.domain.cdt.BL fastingStatusIndicator) {
        this.fastingStatusIndicator = fastingStatusIndicator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformedSpecimenCollection)) return false;
        PerformedSpecimenCollection other = (PerformedSpecimenCollection) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.fastingStatusIndicator==null && other.getFastingStatusIndicator()==null) || 
             (this.fastingStatusIndicator!=null &&
              this.fastingStatusIndicator.equals(other.getFastingStatusIndicator())));
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
        if (getFastingStatusIndicator() != null) {
            _hashCode += getFastingStatusIndicator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PerformedSpecimenCollection.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedSpecimenCollection"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fastingStatusIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "fastingStatusIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "BL"));
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
