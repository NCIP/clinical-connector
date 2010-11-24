/**
 * Organization.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A formalized group of persons or other organizations collected
 * together for a common purpose (such as administrative, legal, political)
 * and the infrastructure to carry out that purpose.
 */
public class Organization  implements java.io.Serializable {
    /** Text describing the organization. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST description;
    /** The unique identifier assigned to an organization by some assigning
 * body. 
 * 
 * For example, in cases of laboratories this is the Clinical Laboratory
 * Improvement Act/Amendment (CLIA) ID. */
    private gov.nih.nci.cabig.ccts.domain.cdt.II identifier;
    /** Name of the organization or an institution conducting the trial. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ON name;
    /** The location for where the organization can be found or the information
 * used to identify where to send physical items.. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST postalAddress;
    /** A value representing whether the information associated with the
 * Organization is currently active or inactive. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD status;
    /** The date and time range associated with the transition (or expected
 * transition) to and from a particular phase of an Organization’s lifecycle
 * as indicated by the value of Organization.status. */
    private gov.nih.nci.cabig.ccts.domain.cdt.IVLTS statusDateRange;
    /** The value for the particular address.  
 * 
 * For example, the set of digits that serves as the address for a telephone
 * device.  Included in the phone number are country, city, and area
 * codes needed to uniquely address the telephone.  A URL or e-mail would
 * be similarly described. */
    private gov.nih.nci.cabig.ccts.domain.cdt.TEL[] telecomAddress;
    private gov.nih.nci.cabig.ccts.domain.bridg.HealthCareSite healthCareSite;
    private gov.nih.nci.cabig.ccts.domain.bridg.Laboratory laboratory;
    private gov.nih.nci.cabig.ccts.domain.bridg.FundingSource fundingSource;
    private gov.nih.nci.cabig.ccts.domain.bridg.RegulatedIndustry regulatedIndustry;
    private gov.nih.nci.cabig.ccts.domain.bridg.StudyCommittee studyCommittee;

    public Organization() {
    }

    public Organization(
           gov.nih.nci.cabig.ccts.domain.cdt.ST description,
           gov.nih.nci.cabig.ccts.domain.bridg.FundingSource fundingSource,
           gov.nih.nci.cabig.ccts.domain.bridg.HealthCareSite healthCareSite,
           gov.nih.nci.cabig.ccts.domain.cdt.II identifier,
           gov.nih.nci.cabig.ccts.domain.bridg.Laboratory laboratory,
           gov.nih.nci.cabig.ccts.domain.cdt.ON name,
           gov.nih.nci.cabig.ccts.domain.cdt.ST postalAddress,
           gov.nih.nci.cabig.ccts.domain.bridg.RegulatedIndustry regulatedIndustry,
           gov.nih.nci.cabig.ccts.domain.cdt.CD status,
           gov.nih.nci.cabig.ccts.domain.cdt.IVLTS statusDateRange,
           gov.nih.nci.cabig.ccts.domain.bridg.StudyCommittee studyCommittee,
           gov.nih.nci.cabig.ccts.domain.cdt.TEL[] telecomAddress) {
           this.description = description;
           this.identifier = identifier;
           this.name = name;
           this.postalAddress = postalAddress;
           this.status = status;
           this.statusDateRange = statusDateRange;
           this.telecomAddress = telecomAddress;
           this.healthCareSite = healthCareSite;
           this.laboratory = laboratory;
           this.fundingSource = fundingSource;
           this.regulatedIndustry = regulatedIndustry;
           this.studyCommittee = studyCommittee;
    }


    /**
     * Gets the description value for this Organization.
     * 
     * @return description Text describing the organization.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Organization.
     * 
     * @param description Text describing the organization.
     */
    public void setDescription(gov.nih.nci.cabig.ccts.domain.cdt.ST description) {
        this.description = description;
    }


    /**
     * Gets the identifier value for this Organization.
     * 
     * @return identifier The unique identifier assigned to an organization by some assigning
 * body. 
 * 
 * For example, in cases of laboratories this is the Clinical Laboratory
 * Improvement Act/Amendment (CLIA) ID.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.II getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this Organization.
     * 
     * @param identifier The unique identifier assigned to an organization by some assigning
 * body. 
 * 
 * For example, in cases of laboratories this is the Clinical Laboratory
 * Improvement Act/Amendment (CLIA) ID.
     */
    public void setIdentifier(gov.nih.nci.cabig.ccts.domain.cdt.II identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the name value for this Organization.
     * 
     * @return name Name of the organization or an institution conducting the trial.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ON getName() {
        return name;
    }


    /**
     * Sets the name value for this Organization.
     * 
     * @param name Name of the organization or an institution conducting the trial.
     */
    public void setName(gov.nih.nci.cabig.ccts.domain.cdt.ON name) {
        this.name = name;
    }


    /**
     * Gets the postalAddress value for this Organization.
     * 
     * @return postalAddress The location for where the organization can be found or the information
 * used to identify where to send physical items..
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getPostalAddress() {
        return postalAddress;
    }


    /**
     * Sets the postalAddress value for this Organization.
     * 
     * @param postalAddress The location for where the organization can be found or the information
 * used to identify where to send physical items..
     */
    public void setPostalAddress(gov.nih.nci.cabig.ccts.domain.cdt.ST postalAddress) {
        this.postalAddress = postalAddress;
    }


    /**
     * Gets the status value for this Organization.
     * 
     * @return status A value representing whether the information associated with the
 * Organization is currently active or inactive.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Organization.
     * 
     * @param status A value representing whether the information associated with the
 * Organization is currently active or inactive.
     */
    public void setStatus(gov.nih.nci.cabig.ccts.domain.cdt.CD status) {
        this.status = status;
    }


    /**
     * Gets the statusDateRange value for this Organization.
     * 
     * @return statusDateRange The date and time range associated with the transition (or expected
 * transition) to and from a particular phase of an Organization’s lifecycle
 * as indicated by the value of Organization.status.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.IVLTS getStatusDateRange() {
        return statusDateRange;
    }


    /**
     * Sets the statusDateRange value for this Organization.
     * 
     * @param statusDateRange The date and time range associated with the transition (or expected
 * transition) to and from a particular phase of an Organization’s lifecycle
 * as indicated by the value of Organization.status.
     */
    public void setStatusDateRange(gov.nih.nci.cabig.ccts.domain.cdt.IVLTS statusDateRange) {
        this.statusDateRange = statusDateRange;
    }


    /**
     * Gets the telecomAddress value for this Organization.
     * 
     * @return telecomAddress The value for the particular address.  
 * 
 * For example, the set of digits that serves as the address for a telephone
 * device.  Included in the phone number are country, city, and area
 * codes needed to uniquely address the telephone.  A URL or e-mail would
 * be similarly described.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.TEL[] getTelecomAddress() {
        return telecomAddress;
    }


    /**
     * Sets the telecomAddress value for this Organization.
     * 
     * @param telecomAddress The value for the particular address.  
 * 
 * For example, the set of digits that serves as the address for a telephone
 * device.  Included in the phone number are country, city, and area
 * codes needed to uniquely address the telephone.  A URL or e-mail would
 * be similarly described.
     */
    public void setTelecomAddress(gov.nih.nci.cabig.ccts.domain.cdt.TEL[] telecomAddress) {
        this.telecomAddress = telecomAddress;
    }

    public gov.nih.nci.cabig.ccts.domain.cdt.TEL getTelecomAddress(int i) {
        return this.telecomAddress[i];
    }

    public void setTelecomAddress(int i, gov.nih.nci.cabig.ccts.domain.cdt.TEL _value) {
        this.telecomAddress[i] = _value;
    }


    /**
     * Gets the healthCareSite value for this Organization.
     * 
     * @return healthCareSite
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.HealthCareSite getHealthCareSite() {
        return healthCareSite;
    }


    /**
     * Sets the healthCareSite value for this Organization.
     * 
     * @param healthCareSite
     */
    public void setHealthCareSite(gov.nih.nci.cabig.ccts.domain.bridg.HealthCareSite healthCareSite) {
        this.healthCareSite = healthCareSite;
    }


    /**
     * Gets the laboratory value for this Organization.
     * 
     * @return laboratory
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.Laboratory getLaboratory() {
        return laboratory;
    }


    /**
     * Sets the laboratory value for this Organization.
     * 
     * @param laboratory
     */
    public void setLaboratory(gov.nih.nci.cabig.ccts.domain.bridg.Laboratory laboratory) {
        this.laboratory = laboratory;
    }


    /**
     * Gets the fundingSource value for this Organization.
     * 
     * @return fundingSource
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.FundingSource getFundingSource() {
        return fundingSource;
    }


    /**
     * Sets the fundingSource value for this Organization.
     * 
     * @param fundingSource
     */
    public void setFundingSource(gov.nih.nci.cabig.ccts.domain.bridg.FundingSource fundingSource) {
        this.fundingSource = fundingSource;
    }


    /**
     * Gets the regulatedIndustry value for this Organization.
     * 
     * @return regulatedIndustry
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.RegulatedIndustry getRegulatedIndustry() {
        return regulatedIndustry;
    }


    /**
     * Sets the regulatedIndustry value for this Organization.
     * 
     * @param regulatedIndustry
     */
    public void setRegulatedIndustry(gov.nih.nci.cabig.ccts.domain.bridg.RegulatedIndustry regulatedIndustry) {
        this.regulatedIndustry = regulatedIndustry;
    }


    /**
     * Gets the studyCommittee value for this Organization.
     * 
     * @return studyCommittee
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.StudyCommittee getStudyCommittee() {
        return studyCommittee;
    }


    /**
     * Sets the studyCommittee value for this Organization.
     * 
     * @param studyCommittee
     */
    public void setStudyCommittee(gov.nih.nci.cabig.ccts.domain.bridg.StudyCommittee studyCommittee) {
        this.studyCommittee = studyCommittee;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Organization)) return false;
        Organization other = (Organization) obj;
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
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.postalAddress==null && other.getPostalAddress()==null) || 
             (this.postalAddress!=null &&
              this.postalAddress.equals(other.getPostalAddress()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.statusDateRange==null && other.getStatusDateRange()==null) || 
             (this.statusDateRange!=null &&
              this.statusDateRange.equals(other.getStatusDateRange()))) &&
            ((this.telecomAddress==null && other.getTelecomAddress()==null) || 
             (this.telecomAddress!=null &&
              java.util.Arrays.equals(this.telecomAddress, other.getTelecomAddress()))) &&
            ((this.healthCareSite==null && other.getHealthCareSite()==null) || 
             (this.healthCareSite!=null &&
              this.healthCareSite.equals(other.getHealthCareSite()))) &&
            ((this.laboratory==null && other.getLaboratory()==null) || 
             (this.laboratory!=null &&
              this.laboratory.equals(other.getLaboratory()))) &&
            ((this.fundingSource==null && other.getFundingSource()==null) || 
             (this.fundingSource!=null &&
              this.fundingSource.equals(other.getFundingSource()))) &&
            ((this.regulatedIndustry==null && other.getRegulatedIndustry()==null) || 
             (this.regulatedIndustry!=null &&
              this.regulatedIndustry.equals(other.getRegulatedIndustry()))) &&
            ((this.studyCommittee==null && other.getStudyCommittee()==null) || 
             (this.studyCommittee!=null &&
              this.studyCommittee.equals(other.getStudyCommittee())));
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
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPostalAddress() != null) {
            _hashCode += getPostalAddress().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatusDateRange() != null) {
            _hashCode += getStatusDateRange().hashCode();
        }
        if (getTelecomAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTelecomAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTelecomAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHealthCareSite() != null) {
            _hashCode += getHealthCareSite().hashCode();
        }
        if (getLaboratory() != null) {
            _hashCode += getLaboratory().hashCode();
        }
        if (getFundingSource() != null) {
            _hashCode += getFundingSource().hashCode();
        }
        if (getRegulatedIndustry() != null) {
            _hashCode += getRegulatedIndustry().hashCode();
        }
        if (getStudyCommittee() != null) {
            _hashCode += getStudyCommittee().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Organization.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Organization"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "II"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ON"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "postalAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "statusDateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "IVLTS"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telecomAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "telecomAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "TEL"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("healthCareSite");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "HealthCareSite"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "HealthCareSite"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("laboratory");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Laboratory"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Laboratory"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fundingSource");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "FundingSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "FundingSource"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regulatedIndustry");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "RegulatedIndustry"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "RegulatedIndustry"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studyCommittee");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudyCommittee"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudyCommittee"));
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
