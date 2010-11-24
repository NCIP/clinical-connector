/**
 * HealthCareProvider.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * One who directly or indirectly administers interventions that are
 * designed to improve the physical or emotional status of patients.
 * A person licensed, certified or otherwise authorized or permitted
 * by law to administer health care in the ordinary course of business
 * or practice of a profession, including a health care facility.
 */
public class HealthCareProvider  implements java.io.Serializable {
    /** A free text description of the investigator's credentials. 
 * 
 * For example, board certified, etc. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST certificateLicenseText;
    /** The unique identifier for the healthcare provider.
 * 
 * For example, the identifier assigned in the NCI investigator registry
 * (National Cancer Institute Principal Investigator Identifier Number)
 * to a physician approved for conducting a clinical trial. */
    private gov.nih.nci.cabig.ccts.domain.cdt.II identifier;
    private gov.nih.nci.cabig.ccts.domain.bridg.StudyAuthor[] studyAuthor;
    private gov.nih.nci.cabig.ccts.domain.bridg.StudySite[] studySite;
    private gov.nih.nci.cabig.ccts.domain.bridg.StudyInvestigator[] studyInvestigator;
    private gov.nih.nci.cabig.ccts.domain.bridg.Assessor[] assessor;
    private gov.nih.nci.cabig.ccts.domain.bridg.StudyCommittee[] studyCommittee;
    private gov.nih.nci.cabig.ccts.domain.bridg.FundingSource fundingSource;

    public HealthCareProvider() {
    }

    public HealthCareProvider(
           gov.nih.nci.cabig.ccts.domain.bridg.Assessor[] assessor,
           gov.nih.nci.cabig.ccts.domain.cdt.ST certificateLicenseText,
           gov.nih.nci.cabig.ccts.domain.bridg.FundingSource fundingSource,
           gov.nih.nci.cabig.ccts.domain.cdt.II identifier,
           gov.nih.nci.cabig.ccts.domain.bridg.StudyAuthor[] studyAuthor,
           gov.nih.nci.cabig.ccts.domain.bridg.StudyCommittee[] studyCommittee,
           gov.nih.nci.cabig.ccts.domain.bridg.StudyInvestigator[] studyInvestigator,
           gov.nih.nci.cabig.ccts.domain.bridg.StudySite[] studySite) {
           this.certificateLicenseText = certificateLicenseText;
           this.identifier = identifier;
           this.studyAuthor = studyAuthor;
           this.studySite = studySite;
           this.studyInvestigator = studyInvestigator;
           this.assessor = assessor;
           this.studyCommittee = studyCommittee;
           this.fundingSource = fundingSource;
    }


    /**
     * Gets the certificateLicenseText value for this HealthCareProvider.
     * 
     * @return certificateLicenseText A free text description of the investigator's credentials. 
 * 
 * For example, board certified, etc.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getCertificateLicenseText() {
        return certificateLicenseText;
    }


    /**
     * Sets the certificateLicenseText value for this HealthCareProvider.
     * 
     * @param certificateLicenseText A free text description of the investigator's credentials. 
 * 
 * For example, board certified, etc.
     */
    public void setCertificateLicenseText(gov.nih.nci.cabig.ccts.domain.cdt.ST certificateLicenseText) {
        this.certificateLicenseText = certificateLicenseText;
    }


    /**
     * Gets the identifier value for this HealthCareProvider.
     * 
     * @return identifier The unique identifier for the healthcare provider.
 * 
 * For example, the identifier assigned in the NCI investigator registry
 * (National Cancer Institute Principal Investigator Identifier Number)
 * to a physician approved for conducting a clinical trial.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.II getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this HealthCareProvider.
     * 
     * @param identifier The unique identifier for the healthcare provider.
 * 
 * For example, the identifier assigned in the NCI investigator registry
 * (National Cancer Institute Principal Investigator Identifier Number)
 * to a physician approved for conducting a clinical trial.
     */
    public void setIdentifier(gov.nih.nci.cabig.ccts.domain.cdt.II identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the studyAuthor value for this HealthCareProvider.
     * 
     * @return studyAuthor
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.StudyAuthor[] getStudyAuthor() {
        return studyAuthor;
    }


    /**
     * Sets the studyAuthor value for this HealthCareProvider.
     * 
     * @param studyAuthor
     */
    public void setStudyAuthor(gov.nih.nci.cabig.ccts.domain.bridg.StudyAuthor[] studyAuthor) {
        this.studyAuthor = studyAuthor;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.StudyAuthor getStudyAuthor(int i) {
        return this.studyAuthor[i];
    }

    public void setStudyAuthor(int i, gov.nih.nci.cabig.ccts.domain.bridg.StudyAuthor _value) {
        this.studyAuthor[i] = _value;
    }


    /**
     * Gets the studySite value for this HealthCareProvider.
     * 
     * @return studySite
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.StudySite[] getStudySite() {
        return studySite;
    }


    /**
     * Sets the studySite value for this HealthCareProvider.
     * 
     * @param studySite
     */
    public void setStudySite(gov.nih.nci.cabig.ccts.domain.bridg.StudySite[] studySite) {
        this.studySite = studySite;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.StudySite getStudySite(int i) {
        return this.studySite[i];
    }

    public void setStudySite(int i, gov.nih.nci.cabig.ccts.domain.bridg.StudySite _value) {
        this.studySite[i] = _value;
    }


    /**
     * Gets the studyInvestigator value for this HealthCareProvider.
     * 
     * @return studyInvestigator
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.StudyInvestigator[] getStudyInvestigator() {
        return studyInvestigator;
    }


    /**
     * Sets the studyInvestigator value for this HealthCareProvider.
     * 
     * @param studyInvestigator
     */
    public void setStudyInvestigator(gov.nih.nci.cabig.ccts.domain.bridg.StudyInvestigator[] studyInvestigator) {
        this.studyInvestigator = studyInvestigator;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.StudyInvestigator getStudyInvestigator(int i) {
        return this.studyInvestigator[i];
    }

    public void setStudyInvestigator(int i, gov.nih.nci.cabig.ccts.domain.bridg.StudyInvestigator _value) {
        this.studyInvestigator[i] = _value;
    }


    /**
     * Gets the assessor value for this HealthCareProvider.
     * 
     * @return assessor
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.Assessor[] getAssessor() {
        return assessor;
    }


    /**
     * Sets the assessor value for this HealthCareProvider.
     * 
     * @param assessor
     */
    public void setAssessor(gov.nih.nci.cabig.ccts.domain.bridg.Assessor[] assessor) {
        this.assessor = assessor;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.Assessor getAssessor(int i) {
        return this.assessor[i];
    }

    public void setAssessor(int i, gov.nih.nci.cabig.ccts.domain.bridg.Assessor _value) {
        this.assessor[i] = _value;
    }


    /**
     * Gets the studyCommittee value for this HealthCareProvider.
     * 
     * @return studyCommittee
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.StudyCommittee[] getStudyCommittee() {
        return studyCommittee;
    }


    /**
     * Sets the studyCommittee value for this HealthCareProvider.
     * 
     * @param studyCommittee
     */
    public void setStudyCommittee(gov.nih.nci.cabig.ccts.domain.bridg.StudyCommittee[] studyCommittee) {
        this.studyCommittee = studyCommittee;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.StudyCommittee getStudyCommittee(int i) {
        return this.studyCommittee[i];
    }

    public void setStudyCommittee(int i, gov.nih.nci.cabig.ccts.domain.bridg.StudyCommittee _value) {
        this.studyCommittee[i] = _value;
    }


    /**
     * Gets the fundingSource value for this HealthCareProvider.
     * 
     * @return fundingSource
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.FundingSource getFundingSource() {
        return fundingSource;
    }


    /**
     * Sets the fundingSource value for this HealthCareProvider.
     * 
     * @param fundingSource
     */
    public void setFundingSource(gov.nih.nci.cabig.ccts.domain.bridg.FundingSource fundingSource) {
        this.fundingSource = fundingSource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HealthCareProvider)) return false;
        HealthCareProvider other = (HealthCareProvider) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.certificateLicenseText==null && other.getCertificateLicenseText()==null) || 
             (this.certificateLicenseText!=null &&
              this.certificateLicenseText.equals(other.getCertificateLicenseText()))) &&
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier()))) &&
            ((this.studyAuthor==null && other.getStudyAuthor()==null) || 
             (this.studyAuthor!=null &&
              java.util.Arrays.equals(this.studyAuthor, other.getStudyAuthor()))) &&
            ((this.studySite==null && other.getStudySite()==null) || 
             (this.studySite!=null &&
              java.util.Arrays.equals(this.studySite, other.getStudySite()))) &&
            ((this.studyInvestigator==null && other.getStudyInvestigator()==null) || 
             (this.studyInvestigator!=null &&
              java.util.Arrays.equals(this.studyInvestigator, other.getStudyInvestigator()))) &&
            ((this.assessor==null && other.getAssessor()==null) || 
             (this.assessor!=null &&
              java.util.Arrays.equals(this.assessor, other.getAssessor()))) &&
            ((this.studyCommittee==null && other.getStudyCommittee()==null) || 
             (this.studyCommittee!=null &&
              java.util.Arrays.equals(this.studyCommittee, other.getStudyCommittee()))) &&
            ((this.fundingSource==null && other.getFundingSource()==null) || 
             (this.fundingSource!=null &&
              this.fundingSource.equals(other.getFundingSource())));
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
        if (getCertificateLicenseText() != null) {
            _hashCode += getCertificateLicenseText().hashCode();
        }
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        if (getStudyAuthor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStudyAuthor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStudyAuthor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStudySite() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStudySite());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStudySite(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStudyInvestigator() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStudyInvestigator());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStudyInvestigator(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssessor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssessor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssessor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStudyCommittee() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStudyCommittee());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStudyCommittee(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFundingSource() != null) {
            _hashCode += getFundingSource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HealthCareProvider.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "HealthCareProvider"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateLicenseText");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "certificateLicenseText"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "II"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studyAuthor");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudyAuthor"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudyAuthor"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studySite");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudySite"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudySite"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studyInvestigator");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudyInvestigator"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudyInvestigator"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assessor");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Assessor"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Assessor"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studyCommittee");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudyCommittee"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudyCommittee"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fundingSource");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "FundingSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "FundingSource"));
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
