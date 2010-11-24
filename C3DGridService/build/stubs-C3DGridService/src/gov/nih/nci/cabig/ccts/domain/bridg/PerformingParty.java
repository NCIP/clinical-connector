/**
 * PerformingParty.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * The individual who executes an Activity.
 */
public class PerformingParty  implements java.io.Serializable {
    /** Specifies whether this is a real party participating in some activity
 * rather than a placeholder indicating the type of party that would
 * participate. */
    private gov.nih.nci.cabig.ccts.domain.cdt.BL actualPartyIndicator;

    public PerformingParty() {
    }

    public PerformingParty(
           gov.nih.nci.cabig.ccts.domain.cdt.BL actualPartyIndicator) {
           this.actualPartyIndicator = actualPartyIndicator;
    }


    /**
     * Gets the actualPartyIndicator value for this PerformingParty.
     * 
     * @return actualPartyIndicator Specifies whether this is a real party participating in some activity
 * rather than a placeholder indicating the type of party that would
 * participate.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.BL getActualPartyIndicator() {
        return actualPartyIndicator;
    }


    /**
     * Sets the actualPartyIndicator value for this PerformingParty.
     * 
     * @param actualPartyIndicator Specifies whether this is a real party participating in some activity
 * rather than a placeholder indicating the type of party that would
 * participate.
     */
    public void setActualPartyIndicator(gov.nih.nci.cabig.ccts.domain.cdt.BL actualPartyIndicator) {
        this.actualPartyIndicator = actualPartyIndicator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformingParty)) return false;
        PerformingParty other = (PerformingParty) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actualPartyIndicator==null && other.getActualPartyIndicator()==null) || 
             (this.actualPartyIndicator!=null &&
              this.actualPartyIndicator.equals(other.getActualPartyIndicator())));
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
        if (getActualPartyIndicator() != null) {
            _hashCode += getActualPartyIndicator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PerformingParty.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformingParty"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualPartyIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "actualPartyIndicator"));
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
