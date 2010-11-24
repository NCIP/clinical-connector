/**
 * StudyAgent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A pharmaceutical product, vitamin, device, mineral, food supplement
 * or a combination that is being used or tested as part of a clinical
 * trial.
 */
public class StudyAgent  implements java.io.Serializable {
    /** Specifies whether this agent/drug is the lead agent in the study.
 * This is important to know in multi-agent studies. */
    private gov.nih.nci.cabig.ccts.domain.cdt.BL leadAgentIndicator;
    private gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol studyProtocol;
    private gov.nih.nci.cabig.ccts.domain.bridg.PerformedStudyAgentTransfer[] performedStudyAgentTransfer;

    public StudyAgent() {
    }

    public StudyAgent(
           gov.nih.nci.cabig.ccts.domain.cdt.BL leadAgentIndicator,
           gov.nih.nci.cabig.ccts.domain.bridg.PerformedStudyAgentTransfer[] performedStudyAgentTransfer,
           gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol studyProtocol) {
           this.leadAgentIndicator = leadAgentIndicator;
           this.studyProtocol = studyProtocol;
           this.performedStudyAgentTransfer = performedStudyAgentTransfer;
    }


    /**
     * Gets the leadAgentIndicator value for this StudyAgent.
     * 
     * @return leadAgentIndicator Specifies whether this agent/drug is the lead agent in the study.
 * This is important to know in multi-agent studies.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.BL getLeadAgentIndicator() {
        return leadAgentIndicator;
    }


    /**
     * Sets the leadAgentIndicator value for this StudyAgent.
     * 
     * @param leadAgentIndicator Specifies whether this agent/drug is the lead agent in the study.
 * This is important to know in multi-agent studies.
     */
    public void setLeadAgentIndicator(gov.nih.nci.cabig.ccts.domain.cdt.BL leadAgentIndicator) {
        this.leadAgentIndicator = leadAgentIndicator;
    }


    /**
     * Gets the studyProtocol value for this StudyAgent.
     * 
     * @return studyProtocol
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol getStudyProtocol() {
        return studyProtocol;
    }


    /**
     * Sets the studyProtocol value for this StudyAgent.
     * 
     * @param studyProtocol
     */
    public void setStudyProtocol(gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol studyProtocol) {
        this.studyProtocol = studyProtocol;
    }


    /**
     * Gets the performedStudyAgentTransfer value for this StudyAgent.
     * 
     * @return performedStudyAgentTransfer
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedStudyAgentTransfer[] getPerformedStudyAgentTransfer() {
        return performedStudyAgentTransfer;
    }


    /**
     * Sets the performedStudyAgentTransfer value for this StudyAgent.
     * 
     * @param performedStudyAgentTransfer
     */
    public void setPerformedStudyAgentTransfer(gov.nih.nci.cabig.ccts.domain.bridg.PerformedStudyAgentTransfer[] performedStudyAgentTransfer) {
        this.performedStudyAgentTransfer = performedStudyAgentTransfer;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedStudyAgentTransfer getPerformedStudyAgentTransfer(int i) {
        return this.performedStudyAgentTransfer[i];
    }

    public void setPerformedStudyAgentTransfer(int i, gov.nih.nci.cabig.ccts.domain.bridg.PerformedStudyAgentTransfer _value) {
        this.performedStudyAgentTransfer[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StudyAgent)) return false;
        StudyAgent other = (StudyAgent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.leadAgentIndicator==null && other.getLeadAgentIndicator()==null) || 
             (this.leadAgentIndicator!=null &&
              this.leadAgentIndicator.equals(other.getLeadAgentIndicator()))) &&
            ((this.studyProtocol==null && other.getStudyProtocol()==null) || 
             (this.studyProtocol!=null &&
              this.studyProtocol.equals(other.getStudyProtocol()))) &&
            ((this.performedStudyAgentTransfer==null && other.getPerformedStudyAgentTransfer()==null) || 
             (this.performedStudyAgentTransfer!=null &&
              java.util.Arrays.equals(this.performedStudyAgentTransfer, other.getPerformedStudyAgentTransfer())));
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
        if (getLeadAgentIndicator() != null) {
            _hashCode += getLeadAgentIndicator().hashCode();
        }
        if (getStudyProtocol() != null) {
            _hashCode += getStudyProtocol().hashCode();
        }
        if (getPerformedStudyAgentTransfer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPerformedStudyAgentTransfer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPerformedStudyAgentTransfer(), i);
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
        new org.apache.axis.description.TypeDesc(StudyAgent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudyAgent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadAgentIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "leadAgentIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "BL"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studyProtocol");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudyProtocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudyProtocol"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performedStudyAgentTransfer");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedStudyAgentTransfer"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedStudyAgentTransfer"));
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
