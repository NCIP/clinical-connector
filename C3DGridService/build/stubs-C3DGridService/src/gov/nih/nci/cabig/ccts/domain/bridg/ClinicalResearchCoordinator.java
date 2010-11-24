/**
 * ClinicalResearchCoordinator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * Person who handles the administrative responsibilities of a study
 * on behalf of the StudyInvestigator, acts as a liaison between StudySite
 * and StudySponsor, and reviews all data and records before a monitor's
 * visit. 
 * 
 * For example, trial coordinator, study coordinator, research coordinator,
 * clinical coordinator, research nurse, protocol nurse.
 * 
 * NOTE: At some sites (primarily in academic settings) Clinical Research
 * Coordinators are called (Clinical Research Associates) CRAs.
 */
public class ClinicalResearchCoordinator  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.PerformedStudyAgentTransfer[] performedStudyAgentTransfer;
    private gov.nih.nci.cabig.ccts.domain.bridg.ProtocolDeviation[] protocolDeviation;

    public ClinicalResearchCoordinator() {
    }

    public ClinicalResearchCoordinator(
           gov.nih.nci.cabig.ccts.domain.bridg.PerformedStudyAgentTransfer[] performedStudyAgentTransfer,
           gov.nih.nci.cabig.ccts.domain.bridg.ProtocolDeviation[] protocolDeviation) {
           this.performedStudyAgentTransfer = performedStudyAgentTransfer;
           this.protocolDeviation = protocolDeviation;
    }


    /**
     * Gets the performedStudyAgentTransfer value for this ClinicalResearchCoordinator.
     * 
     * @return performedStudyAgentTransfer
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedStudyAgentTransfer[] getPerformedStudyAgentTransfer() {
        return performedStudyAgentTransfer;
    }


    /**
     * Sets the performedStudyAgentTransfer value for this ClinicalResearchCoordinator.
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


    /**
     * Gets the protocolDeviation value for this ClinicalResearchCoordinator.
     * 
     * @return protocolDeviation
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.ProtocolDeviation[] getProtocolDeviation() {
        return protocolDeviation;
    }


    /**
     * Sets the protocolDeviation value for this ClinicalResearchCoordinator.
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
        if (!(obj instanceof ClinicalResearchCoordinator)) return false;
        ClinicalResearchCoordinator other = (ClinicalResearchCoordinator) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.performedStudyAgentTransfer==null && other.getPerformedStudyAgentTransfer()==null) || 
             (this.performedStudyAgentTransfer!=null &&
              java.util.Arrays.equals(this.performedStudyAgentTransfer, other.getPerformedStudyAgentTransfer()))) &&
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
        new org.apache.axis.description.TypeDesc(ClinicalResearchCoordinator.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ClinicalResearchCoordinator"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performedStudyAgentTransfer");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedStudyAgentTransfer"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedStudyAgentTransfer"));
        elemField.setMinOccurs(0);
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
