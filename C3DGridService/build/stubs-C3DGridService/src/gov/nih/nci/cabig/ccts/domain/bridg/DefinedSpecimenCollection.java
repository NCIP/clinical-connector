/**
 * DefinedSpecimenCollection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * An action of gathering samples that may be used for subsequent
 * analysis.   It  is an activity that  frequently occurs in studies
 * (e.g. more than one time in more than one arm) and therefore is called
 * out as a reusable template and may be used in a study.
 * 
 * For example, a blood draw.
 */
public class DefinedSpecimenCollection  extends gov.nih.nci.cabig.ccts.domain.bridg.DefinedProcedure  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.Specimen[] specimen;

    public DefinedSpecimenCollection() {
    }

    public DefinedSpecimenCollection(
           gov.nih.nci.cabig.ccts.domain.bridg.Specimen[] specimen) {
           this.specimen = specimen;
    }


    /**
     * Gets the specimen value for this DefinedSpecimenCollection.
     * 
     * @return specimen
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.Specimen[] getSpecimen() {
        return specimen;
    }


    /**
     * Sets the specimen value for this DefinedSpecimenCollection.
     * 
     * @param specimen
     */
    public void setSpecimen(gov.nih.nci.cabig.ccts.domain.bridg.Specimen[] specimen) {
        this.specimen = specimen;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.Specimen getSpecimen(int i) {
        return this.specimen[i];
    }

    public void setSpecimen(int i, gov.nih.nci.cabig.ccts.domain.bridg.Specimen _value) {
        this.specimen[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DefinedSpecimenCollection)) return false;
        DefinedSpecimenCollection other = (DefinedSpecimenCollection) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.specimen==null && other.getSpecimen()==null) || 
             (this.specimen!=null &&
              java.util.Arrays.equals(this.specimen, other.getSpecimen())));
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
        if (getSpecimen() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpecimen());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpecimen(), i);
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
        new org.apache.axis.description.TypeDesc(DefinedSpecimenCollection.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DefinedSpecimenCollection"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specimen");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Specimen"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Specimen"));
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
