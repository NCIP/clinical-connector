/**
 * StudySponsor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * An individual company, institution, or organization that takes
 * responsibility for the initiation, management, and/or financing of
 * a study.  
 * 
 * For example, Abbott Labs, US National Cancer Institute (NCI), Alkermes,
 * Inc., Angiotech, Amgen, etc.
 * 
 * NOTE: Study sponsor can be primary or secondary.
 */
public class StudySponsor  implements java.io.Serializable {
    /** A coded value specifying the particular kind of sponsor for the
 * study. 
 * 
 * For example, primary or secondary sponsor. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD type;
    private gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol studyProtocol;
    private gov.nih.nci.cabig.ccts.domain.bridg.ProtocolDeviation[] protocolDeviation;

    public StudySponsor() {
    }

    public StudySponsor(
           gov.nih.nci.cabig.ccts.domain.bridg.ProtocolDeviation[] protocolDeviation,
           gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol studyProtocol,
           gov.nih.nci.cabig.ccts.domain.cdt.CD type) {
           this.type = type;
           this.studyProtocol = studyProtocol;
           this.protocolDeviation = protocolDeviation;
    }


    /**
     * Gets the type value for this StudySponsor.
     * 
     * @return type A coded value specifying the particular kind of sponsor for the
 * study. 
 * 
 * For example, primary or secondary sponsor.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getType() {
        return type;
    }


    /**
     * Sets the type value for this StudySponsor.
     * 
     * @param type A coded value specifying the particular kind of sponsor for the
 * study. 
 * 
 * For example, primary or secondary sponsor.
     */
    public void setType(gov.nih.nci.cabig.ccts.domain.cdt.CD type) {
        this.type = type;
    }


    /**
     * Gets the studyProtocol value for this StudySponsor.
     * 
     * @return studyProtocol
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol getStudyProtocol() {
        return studyProtocol;
    }


    /**
     * Sets the studyProtocol value for this StudySponsor.
     * 
     * @param studyProtocol
     */
    public void setStudyProtocol(gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol studyProtocol) {
        this.studyProtocol = studyProtocol;
    }


    /**
     * Gets the protocolDeviation value for this StudySponsor.
     * 
     * @return protocolDeviation
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.ProtocolDeviation[] getProtocolDeviation() {
        return protocolDeviation;
    }


    /**
     * Sets the protocolDeviation value for this StudySponsor.
     * 
     * @param protocolDeviation
     */
    public void setProtocolDeviation(gov.nih.nci.cabig.ccts.domain.bridg.ProtocolDeviation[] protocolDeviation) {
        this.protocolDeviation = protocolDeviation;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.ProtocolDeviation getProtocolDeviation(int i) {
        return this.protocolDeviation[i];
    }

    public void setProtocolDeviation(int i, gov.nih.nci.cabig.ccts.domain.bridg.ProtocolDeviation _value) {
        this.protocolDeviation[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StudySponsor)) return false;
        StudySponsor other = (StudySponsor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.studyProtocol==null && other.getStudyProtocol()==null) || 
             (this.studyProtocol!=null &&
              this.studyProtocol.equals(other.getStudyProtocol()))) &&
            ((this.protocolDeviation==null && other.getProtocolDeviation()==null) || 
             (this.protocolDeviation!=null &&
              java.util.Arrays.equals(this.protocolDeviation, other.getProtocolDeviation())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getStudyProtocol() != null) {
            _hashCode += getStudyProtocol().hashCode();
        }
        if (getProtocolDeviation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProtocolDeviation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProtocolDeviation(), i);
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
        new org.apache.axis.description.TypeDesc(StudySponsor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudySponsor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studyProtocol");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudyProtocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudyProtocol"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocolDeviation");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ProtocolDeviation"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ProtocolDeviation"));
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
