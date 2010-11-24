/**
 * ManufacturedMaterial.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A material or collection of materials transformed for a particular
 * purpose by processes external to the end-result material itself. 
 * Such processes may be - but are not required to be -- non-biologic
 * in nature.  
 * 
 * For example, both steel and beer are manufactured materials
 * 
 * For example, pharmaceutical substances (including active vaccines
 * containing retarded virus), disposable supplies, durable equipment,
 * implantable devices, food items (including meat or plant products),
 * waste, traded goods, etc.
 */
public class ManufacturedMaterial  extends gov.nih.nci.cabig.ccts.domain.bridg.Material  implements java.io.Serializable {
    /** The date and time the manufacturer no longer ensures the safety,
 * quality, and/or proper functioning of the material. */
    private gov.nih.nci.cabig.ccts.domain.cdt.TS expirationDate;
    /** An alphanumeric string used to identify a particular batch of manufactured
 * material. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST lotNumberText;
    /** The time at which the material is considered useable after it is
 * activated. */
    private gov.nih.nci.cabig.ccts.domain.cdt.TS stabilityDate;
    private gov.nih.nci.cabig.ccts.domain.bridg.TherapeuticAgent therapeuticAgent;
    private gov.nih.nci.cabig.ccts.domain.bridg.NonTherapeuticAgent nonTherapeuticAgent;

    public ManufacturedMaterial() {
    }

    public ManufacturedMaterial(
           gov.nih.nci.cabig.ccts.domain.cdt.TS expirationDate,
           gov.nih.nci.cabig.ccts.domain.cdt.ST lotNumberText,
           gov.nih.nci.cabig.ccts.domain.bridg.NonTherapeuticAgent nonTherapeuticAgent,
           gov.nih.nci.cabig.ccts.domain.cdt.TS stabilityDate,
           gov.nih.nci.cabig.ccts.domain.bridg.TherapeuticAgent therapeuticAgent) {
           this.expirationDate = expirationDate;
           this.lotNumberText = lotNumberText;
           this.stabilityDate = stabilityDate;
           this.therapeuticAgent = therapeuticAgent;
           this.nonTherapeuticAgent = nonTherapeuticAgent;
    }


    /**
     * Gets the expirationDate value for this ManufacturedMaterial.
     * 
     * @return expirationDate The date and time the manufacturer no longer ensures the safety,
 * quality, and/or proper functioning of the material.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.TS getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this ManufacturedMaterial.
     * 
     * @param expirationDate The date and time the manufacturer no longer ensures the safety,
 * quality, and/or proper functioning of the material.
     */
    public void setExpirationDate(gov.nih.nci.cabig.ccts.domain.cdt.TS expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the lotNumberText value for this ManufacturedMaterial.
     * 
     * @return lotNumberText An alphanumeric string used to identify a particular batch of manufactured
 * material.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getLotNumberText() {
        return lotNumberText;
    }


    /**
     * Sets the lotNumberText value for this ManufacturedMaterial.
     * 
     * @param lotNumberText An alphanumeric string used to identify a particular batch of manufactured
 * material.
     */
    public void setLotNumberText(gov.nih.nci.cabig.ccts.domain.cdt.ST lotNumberText) {
        this.lotNumberText = lotNumberText;
    }


    /**
     * Gets the stabilityDate value for this ManufacturedMaterial.
     * 
     * @return stabilityDate The time at which the material is considered useable after it is
 * activated.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.TS getStabilityDate() {
        return stabilityDate;
    }


    /**
     * Sets the stabilityDate value for this ManufacturedMaterial.
     * 
     * @param stabilityDate The time at which the material is considered useable after it is
 * activated.
     */
    public void setStabilityDate(gov.nih.nci.cabig.ccts.domain.cdt.TS stabilityDate) {
        this.stabilityDate = stabilityDate;
    }


    /**
     * Gets the therapeuticAgent value for this ManufacturedMaterial.
     * 
     * @return therapeuticAgent
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.TherapeuticAgent getTherapeuticAgent() {
        return therapeuticAgent;
    }


    /**
     * Sets the therapeuticAgent value for this ManufacturedMaterial.
     * 
     * @param therapeuticAgent
     */
    public void setTherapeuticAgent(gov.nih.nci.cabig.ccts.domain.bridg.TherapeuticAgent therapeuticAgent) {
        this.therapeuticAgent = therapeuticAgent;
    }


    /**
     * Gets the nonTherapeuticAgent value for this ManufacturedMaterial.
     * 
     * @return nonTherapeuticAgent
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.NonTherapeuticAgent getNonTherapeuticAgent() {
        return nonTherapeuticAgent;
    }


    /**
     * Sets the nonTherapeuticAgent value for this ManufacturedMaterial.
     * 
     * @param nonTherapeuticAgent
     */
    public void setNonTherapeuticAgent(gov.nih.nci.cabig.ccts.domain.bridg.NonTherapeuticAgent nonTherapeuticAgent) {
        this.nonTherapeuticAgent = nonTherapeuticAgent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManufacturedMaterial)) return false;
        ManufacturedMaterial other = (ManufacturedMaterial) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.lotNumberText==null && other.getLotNumberText()==null) || 
             (this.lotNumberText!=null &&
              this.lotNumberText.equals(other.getLotNumberText()))) &&
            ((this.stabilityDate==null && other.getStabilityDate()==null) || 
             (this.stabilityDate!=null &&
              this.stabilityDate.equals(other.getStabilityDate()))) &&
            ((this.therapeuticAgent==null && other.getTherapeuticAgent()==null) || 
             (this.therapeuticAgent!=null &&
              this.therapeuticAgent.equals(other.getTherapeuticAgent()))) &&
            ((this.nonTherapeuticAgent==null && other.getNonTherapeuticAgent()==null) || 
             (this.nonTherapeuticAgent!=null &&
              this.nonTherapeuticAgent.equals(other.getNonTherapeuticAgent())));
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
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getLotNumberText() != null) {
            _hashCode += getLotNumberText().hashCode();
        }
        if (getStabilityDate() != null) {
            _hashCode += getStabilityDate().hashCode();
        }
        if (getTherapeuticAgent() != null) {
            _hashCode += getTherapeuticAgent().hashCode();
        }
        if (getNonTherapeuticAgent() != null) {
            _hashCode += getNonTherapeuticAgent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManufacturedMaterial.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ManufacturedMaterial"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "TS"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lotNumberText");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "lotNumberText"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stabilityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "stabilityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "TS"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("therapeuticAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "TherapeuticAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "TherapeuticAgent"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonTherapeuticAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "NonTherapeuticAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "NonTherapeuticAgent"));
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
