/**
 * ObservationResultRelationship.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * The semantic link between Observation Results.
 * 
 * For example, a particular test may be a component of a larger panel
 * of tests, so the relationship between the individual test and the
 * panel is that one is a component of the other.
 */
public class ObservationResultRelationship  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.ObservationResult observationResult;

    public ObservationResultRelationship() {
    }

    public ObservationResultRelationship(
           gov.nih.nci.cabig.ccts.domain.bridg.ObservationResult observationResult) {
           this.observationResult = observationResult;
    }


    /**
     * Gets the observationResult value for this ObservationResultRelationship.
     * 
     * @return observationResult
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.ObservationResult getObservationResult() {
        return observationResult;
    }


    /**
     * Sets the observationResult value for this ObservationResultRelationship.
     * 
     * @param observationResult
     */
    public void setObservationResult(gov.nih.nci.cabig.ccts.domain.bridg.ObservationResult observationResult) {
        this.observationResult = observationResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObservationResultRelationship)) return false;
        ObservationResultRelationship other = (ObservationResultRelationship) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.observationResult==null && other.getObservationResult()==null) || 
             (this.observationResult!=null &&
              this.observationResult.equals(other.getObservationResult())));
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
        if (getObservationResult() != null) {
            _hashCode += getObservationResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObservationResultRelationship.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ObservationResultRelationship"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observationResult");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ObservationResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ObservationResult"));
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
