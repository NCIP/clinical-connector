/**
 * AdverseEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;

public class AdverseEvent  extends gov.nih.nci.cabig.ccts.domain.bridg.PerformedObservationResult  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.cdt.CD expected;
    private gov.nih.nci.cabig.ccts.domain.cdt.CD grade;
    private gov.nih.nci.cabig.ccts.domain.cdt.BL hospitalizationRequired;
    private gov.nih.nci.cabig.ccts.domain.cdt.CD seriousness;
    private gov.nih.nci.cabig.ccts.domain.bridg.AEIdentification AEIdentification;

    public AdverseEvent() {
    }

    public AdverseEvent(
           gov.nih.nci.cabig.ccts.domain.bridg.AEIdentification AEIdentification,
           gov.nih.nci.cabig.ccts.domain.cdt.CD expected,
           gov.nih.nci.cabig.ccts.domain.cdt.CD grade,
           gov.nih.nci.cabig.ccts.domain.cdt.BL hospitalizationRequired,
           gov.nih.nci.cabig.ccts.domain.cdt.CD seriousness) {
           this.expected = expected;
           this.grade = grade;
           this.hospitalizationRequired = hospitalizationRequired;
           this.seriousness = seriousness;
           this.AEIdentification = AEIdentification;
    }


    /**
     * Gets the expected value for this AdverseEvent.
     * 
     * @return expected
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getExpected() {
        return expected;
    }


    /**
     * Sets the expected value for this AdverseEvent.
     * 
     * @param expected
     */
    public void setExpected(gov.nih.nci.cabig.ccts.domain.cdt.CD expected) {
        this.expected = expected;
    }


    /**
     * Gets the grade value for this AdverseEvent.
     * 
     * @return grade
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getGrade() {
        return grade;
    }


    /**
     * Sets the grade value for this AdverseEvent.
     * 
     * @param grade
     */
    public void setGrade(gov.nih.nci.cabig.ccts.domain.cdt.CD grade) {
        this.grade = grade;
    }


    /**
     * Gets the hospitalizationRequired value for this AdverseEvent.
     * 
     * @return hospitalizationRequired
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.BL getHospitalizationRequired() {
        return hospitalizationRequired;
    }


    /**
     * Sets the hospitalizationRequired value for this AdverseEvent.
     * 
     * @param hospitalizationRequired
     */
    public void setHospitalizationRequired(gov.nih.nci.cabig.ccts.domain.cdt.BL hospitalizationRequired) {
        this.hospitalizationRequired = hospitalizationRequired;
    }


    /**
     * Gets the seriousness value for this AdverseEvent.
     * 
     * @return seriousness
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getSeriousness() {
        return seriousness;
    }


    /**
     * Sets the seriousness value for this AdverseEvent.
     * 
     * @param seriousness
     */
    public void setSeriousness(gov.nih.nci.cabig.ccts.domain.cdt.CD seriousness) {
        this.seriousness = seriousness;
    }


    /**
     * Gets the AEIdentification value for this AdverseEvent.
     * 
     * @return AEIdentification
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.AEIdentification getAEIdentification() {
        return AEIdentification;
    }


    /**
     * Sets the AEIdentification value for this AdverseEvent.
     * 
     * @param AEIdentification
     */
    public void setAEIdentification(gov.nih.nci.cabig.ccts.domain.bridg.AEIdentification AEIdentification) {
        this.AEIdentification = AEIdentification;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdverseEvent)) return false;
        AdverseEvent other = (AdverseEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.expected==null && other.getExpected()==null) || 
             (this.expected!=null &&
              this.expected.equals(other.getExpected()))) &&
            ((this.grade==null && other.getGrade()==null) || 
             (this.grade!=null &&
              this.grade.equals(other.getGrade()))) &&
            ((this.hospitalizationRequired==null && other.getHospitalizationRequired()==null) || 
             (this.hospitalizationRequired!=null &&
              this.hospitalizationRequired.equals(other.getHospitalizationRequired()))) &&
            ((this.seriousness==null && other.getSeriousness()==null) || 
             (this.seriousness!=null &&
              this.seriousness.equals(other.getSeriousness()))) &&
            ((this.AEIdentification==null && other.getAEIdentification()==null) || 
             (this.AEIdentification!=null &&
              this.AEIdentification.equals(other.getAEIdentification())));
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
        if (getExpected() != null) {
            _hashCode += getExpected().hashCode();
        }
        if (getGrade() != null) {
            _hashCode += getGrade().hashCode();
        }
        if (getHospitalizationRequired() != null) {
            _hashCode += getHospitalizationRequired().hashCode();
        }
        if (getSeriousness() != null) {
            _hashCode += getSeriousness().hashCode();
        }
        if (getAEIdentification() != null) {
            _hashCode += getAEIdentification().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdverseEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "AdverseEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expected");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "expected"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grade");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "grade"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hospitalizationRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "hospitalizationRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "BL"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seriousness");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "seriousness"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AEIdentification");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "AEIdentification"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "AEIdentification"));
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
