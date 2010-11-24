/**
 * PerformingLaboratory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * The laboratory that actually performed the test and that is also
 * therefore the source of the data.  A laboratory providing analyses
 * of samples collected in clinical care or research.
 */
public class PerformingLaboratory  extends gov.nih.nci.cabig.ccts.domain.bridg.PerformingParty  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.PerformedClinicalResult[] performedClinicalResult;
    private gov.nih.nci.cabig.ccts.domain.bridg.Laboratory laboratory;
    private gov.nih.nci.cabig.ccts.domain.bridg.PerformedObservation[] performedObservation;

    public PerformingLaboratory() {
    }

    public PerformingLaboratory(
           gov.nih.nci.cabig.ccts.domain.bridg.Laboratory laboratory,
           gov.nih.nci.cabig.ccts.domain.bridg.PerformedClinicalResult[] performedClinicalResult,
           gov.nih.nci.cabig.ccts.domain.bridg.PerformedObservation[] performedObservation) {
           this.performedClinicalResult = performedClinicalResult;
           this.laboratory = laboratory;
           this.performedObservation = performedObservation;
    }


    /**
     * Gets the performedClinicalResult value for this PerformingLaboratory.
     * 
     * @return performedClinicalResult
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedClinicalResult[] getPerformedClinicalResult() {
        return performedClinicalResult;
    }


    /**
     * Sets the performedClinicalResult value for this PerformingLaboratory.
     * 
     * @param performedClinicalResult
     */
    public void setPerformedClinicalResult(gov.nih.nci.cabig.ccts.domain.bridg.PerformedClinicalResult[] performedClinicalResult) {
        this.performedClinicalResult = performedClinicalResult;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedClinicalResult getPerformedClinicalResult(int i) {
        return this.performedClinicalResult[i];
    }

    public void setPerformedClinicalResult(int i, gov.nih.nci.cabig.ccts.domain.bridg.PerformedClinicalResult _value) {
        this.performedClinicalResult[i] = _value;
    }


    /**
     * Gets the laboratory value for this PerformingLaboratory.
     * 
     * @return laboratory
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.Laboratory getLaboratory() {
        return laboratory;
    }


    /**
     * Sets the laboratory value for this PerformingLaboratory.
     * 
     * @param laboratory
     */
    public void setLaboratory(gov.nih.nci.cabig.ccts.domain.bridg.Laboratory laboratory) {
        this.laboratory = laboratory;
    }


    /**
     * Gets the performedObservation value for this PerformingLaboratory.
     * 
     * @return performedObservation
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedObservation[] getPerformedObservation() {
        return performedObservation;
    }


    /**
     * Sets the performedObservation value for this PerformingLaboratory.
     * 
     * @param performedObservation
     */
    public void setPerformedObservation(gov.nih.nci.cabig.ccts.domain.bridg.PerformedObservation[] performedObservation) {
        this.performedObservation = performedObservation;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedObservation getPerformedObservation(int i) {
        return this.performedObservation[i];
    }

    public void setPerformedObservation(int i, gov.nih.nci.cabig.ccts.domain.bridg.PerformedObservation _value) {
        this.performedObservation[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformingLaboratory)) return false;
        PerformingLaboratory other = (PerformingLaboratory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.performedClinicalResult==null && other.getPerformedClinicalResult()==null) || 
             (this.performedClinicalResult!=null &&
              java.util.Arrays.equals(this.performedClinicalResult, other.getPerformedClinicalResult()))) &&
            ((this.laboratory==null && other.getLaboratory()==null) || 
             (this.laboratory!=null &&
              this.laboratory.equals(other.getLaboratory()))) &&
            ((this.performedObservation==null && other.getPerformedObservation()==null) || 
             (this.performedObservation!=null &&
              java.util.Arrays.equals(this.performedObservation, other.getPerformedObservation())));
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
        if (getPerformedClinicalResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPerformedClinicalResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPerformedClinicalResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLaboratory() != null) {
            _hashCode += getLaboratory().hashCode();
        }
        if (getPerformedObservation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPerformedObservation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPerformedObservation(), i);
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
        new org.apache.axis.description.TypeDesc(PerformingLaboratory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformingLaboratory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performedClinicalResult");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedClinicalResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedClinicalResult"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("laboratory");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Laboratory"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Laboratory"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performedObservation");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedObservation"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedObservation"));
        elemField.setMinOccurs(0);
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
