/**
 * PerformedStudyAgentTransfer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * The completed action in which an authorized party at a designated
 * StudySite dispenses or receives a StudyAgent to/from a StudySubject.
 * 
 * For example, a StudySubject receives a bottle of pills.
 */
public class PerformedStudyAgentTransfer  extends gov.nih.nci.cabig.ccts.domain.bridg.PerformedAdministrativeActivity  implements java.io.Serializable {
    /** The amount and unit of StudyAgent transferred in original units. */
    private java.lang.String originalQuantity;
    /** The amount and unit of StudyAgent transferred in standard or canonical
 * units. */
    private java.lang.String quantity;

    public PerformedStudyAgentTransfer() {
    }

    public PerformedStudyAgentTransfer(
           java.lang.String originalQuantity,
           java.lang.String quantity) {
           this.originalQuantity = originalQuantity;
           this.quantity = quantity;
    }


    /**
     * Gets the originalQuantity value for this PerformedStudyAgentTransfer.
     * 
     * @return originalQuantity The amount and unit of StudyAgent transferred in original units.
     */
    public java.lang.String getOriginalQuantity() {
        return originalQuantity;
    }


    /**
     * Sets the originalQuantity value for this PerformedStudyAgentTransfer.
     * 
     * @param originalQuantity The amount and unit of StudyAgent transferred in original units.
     */
    public void setOriginalQuantity(java.lang.String originalQuantity) {
        this.originalQuantity = originalQuantity;
    }


    /**
     * Gets the quantity value for this PerformedStudyAgentTransfer.
     * 
     * @return quantity The amount and unit of StudyAgent transferred in standard or canonical
 * units.
     */
    public java.lang.String getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this PerformedStudyAgentTransfer.
     * 
     * @param quantity The amount and unit of StudyAgent transferred in standard or canonical
 * units.
     */
    public void setQuantity(java.lang.String quantity) {
        this.quantity = quantity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformedStudyAgentTransfer)) return false;
        PerformedStudyAgentTransfer other = (PerformedStudyAgentTransfer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.originalQuantity==null && other.getOriginalQuantity()==null) || 
             (this.originalQuantity!=null &&
              this.originalQuantity.equals(other.getOriginalQuantity()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity())));
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
        if (getOriginalQuantity() != null) {
            _hashCode += getOriginalQuantity().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PerformedStudyAgentTransfer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedStudyAgentTransfer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "originalQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
