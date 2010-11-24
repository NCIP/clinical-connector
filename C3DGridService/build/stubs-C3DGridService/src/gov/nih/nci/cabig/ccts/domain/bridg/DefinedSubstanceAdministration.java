/**
 * DefinedSubstanceAdministration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * Set of actions of applying, dispensing or otherwise giving  medications
 * or other substances to subjects.  An activity that  frequently occurs
 * in studies and therefore is called out as a reusable template and
 * may be used a defined study.  
 * 
 * For example, a study subject who receives methotrexate as part of
 * chemotherapy.
 */
public class DefinedSubstanceAdministration  extends gov.nih.nci.cabig.ccts.domain.bridg.DefinedActivity  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.StudyAgent studyAgent;

    public DefinedSubstanceAdministration() {
    }

    public DefinedSubstanceAdministration(
           gov.nih.nci.cabig.ccts.domain.bridg.StudyAgent studyAgent) {
           this.studyAgent = studyAgent;
    }


    /**
     * Gets the studyAgent value for this DefinedSubstanceAdministration.
     * 
     * @return studyAgent
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.StudyAgent getStudyAgent() {
        return studyAgent;
    }


    /**
     * Sets the studyAgent value for this DefinedSubstanceAdministration.
     * 
     * @param studyAgent
     */
    public void setStudyAgent(gov.nih.nci.cabig.ccts.domain.bridg.StudyAgent studyAgent) {
        this.studyAgent = studyAgent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DefinedSubstanceAdministration)) return false;
        DefinedSubstanceAdministration other = (DefinedSubstanceAdministration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.studyAgent==null && other.getStudyAgent()==null) || 
             (this.studyAgent!=null &&
              this.studyAgent.equals(other.getStudyAgent())));
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
        if (getStudyAgent() != null) {
            _hashCode += getStudyAgent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DefinedSubstanceAdministration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DefinedSubstanceAdministration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studyAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudyAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudyAgent"));
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
