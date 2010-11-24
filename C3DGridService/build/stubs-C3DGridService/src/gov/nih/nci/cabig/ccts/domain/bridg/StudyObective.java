/**
 * StudyObective.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * The reason for performing a study in terms of the scientific questions
 * to be answered by the analysis of data collected during the study.
 */
public class StudyObective  implements java.io.Serializable {
    /** The text that states the StudyObjective. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST description;
    /** Specifies whether this is the main question to be answered that
 * drives the statistical planning for the study. */
    private gov.nih.nci.cabig.ccts.domain.cdt.BL primaryIndicator;
    private gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol studyProtocol;

    public StudyObective() {
    }

    public StudyObective(
           gov.nih.nci.cabig.ccts.domain.cdt.ST description,
           gov.nih.nci.cabig.ccts.domain.cdt.BL primaryIndicator,
           gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol studyProtocol) {
           this.description = description;
           this.primaryIndicator = primaryIndicator;
           this.studyProtocol = studyProtocol;
    }


    /**
     * Gets the description value for this StudyObective.
     * 
     * @return description The text that states the StudyObjective.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getDescription() {
        return description;
    }


    /**
     * Sets the description value for this StudyObective.
     * 
     * @param description The text that states the StudyObjective.
     */
    public void setDescription(gov.nih.nci.cabig.ccts.domain.cdt.ST description) {
        this.description = description;
    }


    /**
     * Gets the primaryIndicator value for this StudyObective.
     * 
     * @return primaryIndicator Specifies whether this is the main question to be answered that
 * drives the statistical planning for the study.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.BL getPrimaryIndicator() {
        return primaryIndicator;
    }


    /**
     * Sets the primaryIndicator value for this StudyObective.
     * 
     * @param primaryIndicator Specifies whether this is the main question to be answered that
 * drives the statistical planning for the study.
     */
    public void setPrimaryIndicator(gov.nih.nci.cabig.ccts.domain.cdt.BL primaryIndicator) {
        this.primaryIndicator = primaryIndicator;
    }


    /**
     * Gets the studyProtocol value for this StudyObective.
     * 
     * @return studyProtocol
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol getStudyProtocol() {
        return studyProtocol;
    }


    /**
     * Sets the studyProtocol value for this StudyObective.
     * 
     * @param studyProtocol
     */
    public void setStudyProtocol(gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol studyProtocol) {
        this.studyProtocol = studyProtocol;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StudyObective)) return false;
        StudyObective other = (StudyObective) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.primaryIndicator==null && other.getPrimaryIndicator()==null) || 
             (this.primaryIndicator!=null &&
              this.primaryIndicator.equals(other.getPrimaryIndicator()))) &&
            ((this.studyProtocol==null && other.getStudyProtocol()==null) || 
             (this.studyProtocol!=null &&
              this.studyProtocol.equals(other.getStudyProtocol())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getPrimaryIndicator() != null) {
            _hashCode += getPrimaryIndicator().hashCode();
        }
        if (getStudyProtocol() != null) {
            _hashCode += getStudyProtocol().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StudyObective.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudyObective"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "primaryIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "BL"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studyProtocol");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudyProtocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudyProtocol"));
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
