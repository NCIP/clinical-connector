/**
 * TherapeuticAgent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A chemical or biological substance with specific characteristics
 * used in a study for treatment of cancer or another disease as specified
 * by the study.
 * 
 * For example, methotrexate could be considered a therapeutic agent
 * in a cancer clinical trial.
 */
public class TherapeuticAgent  implements java.io.Serializable {
    /** The unique identifier for the therapeutic agent.
 * 
 * For example, National Safety Council (NSC) number, Investigational
 * New Drug (IND) number, etc. */
    private gov.nih.nci.cabig.ccts.domain.cdt.II identifier;
    /** Specifies whether this agent is an Investigational New Drug. */
    private gov.nih.nci.cabig.ccts.domain.cdt.BL indIndicator;
    private gov.nih.nci.cabig.ccts.domain.bridg.ConcomitantAgent[] concomitantAgent;
    private gov.nih.nci.cabig.ccts.domain.bridg.StudyAgent[] studyAgent;

    public TherapeuticAgent() {
    }

    public TherapeuticAgent(
           gov.nih.nci.cabig.ccts.domain.bridg.ConcomitantAgent[] concomitantAgent,
           gov.nih.nci.cabig.ccts.domain.cdt.II identifier,
           gov.nih.nci.cabig.ccts.domain.cdt.BL indIndicator,
           gov.nih.nci.cabig.ccts.domain.bridg.StudyAgent[] studyAgent) {
           this.identifier = identifier;
           this.indIndicator = indIndicator;
           this.concomitantAgent = concomitantAgent;
           this.studyAgent = studyAgent;
    }


    /**
     * Gets the identifier value for this TherapeuticAgent.
     * 
     * @return identifier The unique identifier for the therapeutic agent.
 * 
 * For example, National Safety Council (NSC) number, Investigational
 * New Drug (IND) number, etc.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.II getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this TherapeuticAgent.
     * 
     * @param identifier The unique identifier for the therapeutic agent.
 * 
 * For example, National Safety Council (NSC) number, Investigational
 * New Drug (IND) number, etc.
     */
    public void setIdentifier(gov.nih.nci.cabig.ccts.domain.cdt.II identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the indIndicator value for this TherapeuticAgent.
     * 
     * @return indIndicator Specifies whether this agent is an Investigational New Drug.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.BL getIndIndicator() {
        return indIndicator;
    }


    /**
     * Sets the indIndicator value for this TherapeuticAgent.
     * 
     * @param indIndicator Specifies whether this agent is an Investigational New Drug.
     */
    public void setIndIndicator(gov.nih.nci.cabig.ccts.domain.cdt.BL indIndicator) {
        this.indIndicator = indIndicator;
    }


    /**
     * Gets the concomitantAgent value for this TherapeuticAgent.
     * 
     * @return concomitantAgent
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.ConcomitantAgent[] getConcomitantAgent() {
        return concomitantAgent;
    }


    /**
     * Sets the concomitantAgent value for this TherapeuticAgent.
     * 
     * @param concomitantAgent
     */
    public void setConcomitantAgent(gov.nih.nci.cabig.ccts.domain.bridg.ConcomitantAgent[] concomitantAgent) {
        this.concomitantAgent = concomitantAgent;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.ConcomitantAgent getConcomitantAgent(int i) {
        return this.concomitantAgent[i];
    }

    public void setConcomitantAgent(int i, gov.nih.nci.cabig.ccts.domain.bridg.ConcomitantAgent _value) {
        this.concomitantAgent[i] = _value;
    }


    /**
     * Gets the studyAgent value for this TherapeuticAgent.
     * 
     * @return studyAgent
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.StudyAgent[] getStudyAgent() {
        return studyAgent;
    }


    /**
     * Sets the studyAgent value for this TherapeuticAgent.
     * 
     * @param studyAgent
     */
    public void setStudyAgent(gov.nih.nci.cabig.ccts.domain.bridg.StudyAgent[] studyAgent) {
        this.studyAgent = studyAgent;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.StudyAgent getStudyAgent(int i) {
        return this.studyAgent[i];
    }

    public void setStudyAgent(int i, gov.nih.nci.cabig.ccts.domain.bridg.StudyAgent _value) {
        this.studyAgent[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TherapeuticAgent)) return false;
        TherapeuticAgent other = (TherapeuticAgent) obj;
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
            ((this.indIndicator==null && other.getIndIndicator()==null) || 
             (this.indIndicator!=null &&
              this.indIndicator.equals(other.getIndIndicator()))) &&
            ((this.concomitantAgent==null && other.getConcomitantAgent()==null) || 
             (this.concomitantAgent!=null &&
              java.util.Arrays.equals(this.concomitantAgent, other.getConcomitantAgent()))) &&
            ((this.studyAgent==null && other.getStudyAgent()==null) || 
             (this.studyAgent!=null &&
              java.util.Arrays.equals(this.studyAgent, other.getStudyAgent())));
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
        if (getIndIndicator() != null) {
            _hashCode += getIndIndicator().hashCode();
        }
        if (getConcomitantAgent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConcomitantAgent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConcomitantAgent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStudyAgent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStudyAgent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStudyAgent(), i);
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
        new org.apache.axis.description.TypeDesc(TherapeuticAgent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "TherapeuticAgent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "II"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "indIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "BL"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concomitantAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ConcomitantAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ConcomitantAgent"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studyAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudyAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudyAgent"));
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
