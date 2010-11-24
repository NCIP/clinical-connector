/**
 * FundingSource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * An Organization who typically funds a study. 
 * 
 * For example, federal agencies (National Cancer Institute (NCI), National
 * Institutes of Health (NIH) and private industry (pharmaceutical companies)
 */
public class FundingSource  implements java.io.Serializable {
    /** The unique identifier for the FundingSource. */
    private gov.nih.nci.cabig.ccts.domain.cdt.II identifier;
    private gov.nih.nci.cabig.ccts.domain.bridg.StudySponsor[] studySponsor;

    public FundingSource() {
    }

    public FundingSource(
           gov.nih.nci.cabig.ccts.domain.cdt.II identifier,
           gov.nih.nci.cabig.ccts.domain.bridg.StudySponsor[] studySponsor) {
           this.identifier = identifier;
           this.studySponsor = studySponsor;
    }


    /**
     * Gets the identifier value for this FundingSource.
     * 
     * @return identifier The unique identifier for the FundingSource.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.II getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this FundingSource.
     * 
     * @param identifier The unique identifier for the FundingSource.
     */
    public void setIdentifier(gov.nih.nci.cabig.ccts.domain.cdt.II identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the studySponsor value for this FundingSource.
     * 
     * @return studySponsor
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.StudySponsor[] getStudySponsor() {
        return studySponsor;
    }


    /**
     * Sets the studySponsor value for this FundingSource.
     * 
     * @param studySponsor
     */
    public void setStudySponsor(gov.nih.nci.cabig.ccts.domain.bridg.StudySponsor[] studySponsor) {
        this.studySponsor = studySponsor;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.StudySponsor getStudySponsor(int i) {
        return this.studySponsor[i];
    }

    public void setStudySponsor(int i, gov.nih.nci.cabig.ccts.domain.bridg.StudySponsor _value) {
        this.studySponsor[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FundingSource)) return false;
        FundingSource other = (FundingSource) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier()))) &&
            ((this.studySponsor==null && other.getStudySponsor()==null) || 
             (this.studySponsor!=null &&
              java.util.Arrays.equals(this.studySponsor, other.getStudySponsor())));
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
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        if (getStudySponsor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStudySponsor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStudySponsor(), i);
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
        new org.apache.axis.description.TypeDesc(FundingSource.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "FundingSource"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "II"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studySponsor");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudySponsor"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudySponsor"));
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
