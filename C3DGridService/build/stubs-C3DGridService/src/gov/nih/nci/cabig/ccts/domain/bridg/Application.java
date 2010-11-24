/**
 * Application.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A collection of submissions that are grouped together for regulatory
 * purposes, and are usually specific to a particular device, food or
 * feed additive or biopharmaceutical substance.
 * 
 * For example, over time, an application will typically consist of multiple
 * submissions and regulatory assessments. 
 * 
 * For example, the marketing application for a drug product can generate
 * multiple regulatory decisions. The first decision may support the
 * initial marketing approval of the product for a specific indication.
 * Subsequent regulatory decisions may approve or deny additional indications
 * for the drug product. The application thus contains multiple submissions,
 * each with their own regulatory action.
 */
public class Application  implements java.io.Serializable {
    /** A unique identifier that is assigned by regulatory authority to
 * an application. */
    private gov.nih.nci.cabig.ccts.domain.cdt.II identifier;
    /** The particular kind of application. Each product type will be supported
 * by a different application type.
 * 
 * For example, New Drug Application, 510k, Veterinary New Drug Submission,
 * Biologic License Application (BLA), Investigational Device Exemption
 * (IDE), etc. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD type;
    private gov.nih.nci.cabig.ccts.domain.bridg.Submission[] submission;

    public Application() {
    }

    public Application(
           gov.nih.nci.cabig.ccts.domain.cdt.II identifier,
           gov.nih.nci.cabig.ccts.domain.bridg.Submission[] submission,
           gov.nih.nci.cabig.ccts.domain.cdt.CD type) {
           this.identifier = identifier;
           this.type = type;
           this.submission = submission;
    }


    /**
     * Gets the identifier value for this Application.
     * 
     * @return identifier A unique identifier that is assigned by regulatory authority to
 * an application.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.II getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this Application.
     * 
     * @param identifier A unique identifier that is assigned by regulatory authority to
 * an application.
     */
    public void setIdentifier(gov.nih.nci.cabig.ccts.domain.cdt.II identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the type value for this Application.
     * 
     * @return type The particular kind of application. Each product type will be supported
 * by a different application type.
 * 
 * For example, New Drug Application, 510k, Veterinary New Drug Submission,
 * Biologic License Application (BLA), Investigational Device Exemption
 * (IDE), etc.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getType() {
        return type;
    }


    /**
     * Sets the type value for this Application.
     * 
     * @param type The particular kind of application. Each product type will be supported
 * by a different application type.
 * 
 * For example, New Drug Application, 510k, Veterinary New Drug Submission,
 * Biologic License Application (BLA), Investigational Device Exemption
 * (IDE), etc.
     */
    public void setType(gov.nih.nci.cabig.ccts.domain.cdt.CD type) {
        this.type = type;
    }


    /**
     * Gets the submission value for this Application.
     * 
     * @return submission
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.Submission[] getSubmission() {
        return submission;
    }


    /**
     * Sets the submission value for this Application.
     * 
     * @param submission
     */
    public void setSubmission(gov.nih.nci.cabig.ccts.domain.bridg.Submission[] submission) {
        this.submission = submission;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.Submission getSubmission(int i) {
        return this.submission[i];
    }

    public void setSubmission(int i, gov.nih.nci.cabig.ccts.domain.bridg.Submission _value) {
        this.submission[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Application)) return false;
        Application other = (Application) obj;
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
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.submission==null && other.getSubmission()==null) || 
             (this.submission!=null &&
              java.util.Arrays.equals(this.submission, other.getSubmission())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getSubmission() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubmission());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubmission(), i);
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
        new org.apache.axis.description.TypeDesc(Application.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Application"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "II"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submission");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Submission"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Submission"));
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
