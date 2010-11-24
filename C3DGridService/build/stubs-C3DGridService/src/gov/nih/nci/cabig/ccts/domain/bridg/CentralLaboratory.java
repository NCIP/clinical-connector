/**
 * CentralLaboratory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * The laboratory that delivers the data.
 */
public class CentralLaboratory  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.PerformedSpecimenCollection[] performedSpecimenCollection;
    private gov.nih.nci.cabig.ccts.domain.bridg.Laboratory laboratory;

    public CentralLaboratory() {
    }

    public CentralLaboratory(
           gov.nih.nci.cabig.ccts.domain.bridg.Laboratory laboratory,
           gov.nih.nci.cabig.ccts.domain.bridg.PerformedSpecimenCollection[] performedSpecimenCollection) {
           this.performedSpecimenCollection = performedSpecimenCollection;
           this.laboratory = laboratory;
    }


    /**
     * Gets the performedSpecimenCollection value for this CentralLaboratory.
     * 
     * @return performedSpecimenCollection
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedSpecimenCollection[] getPerformedSpecimenCollection() {
        return performedSpecimenCollection;
    }


    /**
     * Sets the performedSpecimenCollection value for this CentralLaboratory.
     * 
     * @param performedSpecimenCollection
     */
    public void setPerformedSpecimenCollection(gov.nih.nci.cabig.ccts.domain.bridg.PerformedSpecimenCollection[] performedSpecimenCollection) {
        this.performedSpecimenCollection = performedSpecimenCollection;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedSpecimenCollection getPerformedSpecimenCollection(int i) {
        return this.performedSpecimenCollection[i];
    }

    public void setPerformedSpecimenCollection(int i, gov.nih.nci.cabig.ccts.domain.bridg.PerformedSpecimenCollection _value) {
        this.performedSpecimenCollection[i] = _value;
    }


    /**
     * Gets the laboratory value for this CentralLaboratory.
     * 
     * @return laboratory
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.Laboratory getLaboratory() {
        return laboratory;
    }


    /**
     * Sets the laboratory value for this CentralLaboratory.
     * 
     * @param laboratory
     */
    public void setLaboratory(gov.nih.nci.cabig.ccts.domain.bridg.Laboratory laboratory) {
        this.laboratory = laboratory;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CentralLaboratory)) return false;
        CentralLaboratory other = (CentralLaboratory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.performedSpecimenCollection==null && other.getPerformedSpecimenCollection()==null) || 
             (this.performedSpecimenCollection!=null &&
              java.util.Arrays.equals(this.performedSpecimenCollection, other.getPerformedSpecimenCollection()))) &&
            ((this.laboratory==null && other.getLaboratory()==null) || 
             (this.laboratory!=null &&
              this.laboratory.equals(other.getLaboratory())));
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
        if (getPerformedSpecimenCollection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPerformedSpecimenCollection());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPerformedSpecimenCollection(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLaboratory() != null) {
            _hashCode += getLaboratory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CentralLaboratory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "CentralLaboratory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performedSpecimenCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedSpecimenCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedSpecimenCollection"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("laboratory");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Laboratory"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Laboratory"));
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
