/**
 * StudySite.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A health care site in which clinical trial activities are conducted.
 * 
 * 
 * For example, the site where the subject encounter occurs, or the site
 * of the Investigator.
 * 
 * NOTE: Account for hierarchy in sites and relation to Study ID.
 */
public class StudySite  implements java.io.Serializable {
    /** Defines the status of the trial at the site.
 * 
 * For example, open to accrual, closed to accrual, temporarily closed
 * to accrual, and pending accrual. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD accrualStatus;
    /** The date and time range specifying the start of the site's participation
 * in a clinical trial or study and the end of the participation. */
    private gov.nih.nci.cabig.ccts.domain.cdt.IVLTS dateRange;
    /** The unique identification assigned to a StudySite by a StudySponsor. */
    private gov.nih.nci.cabig.ccts.domain.cdt.II identifier;
    /** The date and time the Institutional Review Board (IRB) approved
 * this study protocol for execution at this site. */
    private gov.nih.nci.cabig.ccts.domain.cdt.TS irbApprovalDate;
    /** The responsibility assumed by a site for a study. This is a coded
 * list of kinds of participation. 
 * 
 * For example, for an organization, this could include: lead organization,
 * participating organization, primary sponsor, secondary sponsor etc. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD role;
    /** A value specifying whether the state of participation of a site
 * in the given study is pending, active, complete, or cancelled. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD status;
    /** The date and time when this particular status becomes active and
 * is no longer considered active, enforceable, relevant, etc.
 * 
 * For example, for a study protocol, the effective date may be the date
 * of IRB approval of the initial protocol version; the date the Institutional
 * Review Board (IRB) Chair signs off on a protocol and patient enrollment
 * can begin.  The effective end date may refer to the closing of a study
 * to enrollment. Subjects enrolled on the study at the time of closure
 * will continue their treatment plan. */
    private gov.nih.nci.cabig.ccts.domain.cdt.IVLTS statusDateRange;
    /** Total number of patients/subjects/participants needed for protocol
 * enrollment at this site */
    private int targetAccrualNumber;
    private gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol studyProtocol;
    private gov.nih.nci.cabig.ccts.domain.bridg.HealthCareSite healthCareSite;

    public StudySite() {
    }

    public StudySite(
           gov.nih.nci.cabig.ccts.domain.cdt.CD accrualStatus,
           gov.nih.nci.cabig.ccts.domain.cdt.IVLTS dateRange,
           gov.nih.nci.cabig.ccts.domain.bridg.HealthCareSite healthCareSite,
           gov.nih.nci.cabig.ccts.domain.cdt.II identifier,
           gov.nih.nci.cabig.ccts.domain.cdt.TS irbApprovalDate,
           gov.nih.nci.cabig.ccts.domain.cdt.CD role,
           gov.nih.nci.cabig.ccts.domain.cdt.CD status,
           gov.nih.nci.cabig.ccts.domain.cdt.IVLTS statusDateRange,
           gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol studyProtocol,
           int targetAccrualNumber) {
           this.accrualStatus = accrualStatus;
           this.dateRange = dateRange;
           this.identifier = identifier;
           this.irbApprovalDate = irbApprovalDate;
           this.role = role;
           this.status = status;
           this.statusDateRange = statusDateRange;
           this.targetAccrualNumber = targetAccrualNumber;
           this.studyProtocol = studyProtocol;
           this.healthCareSite = healthCareSite;
    }


    /**
     * Gets the accrualStatus value for this StudySite.
     * 
     * @return accrualStatus Defines the status of the trial at the site.
 * 
 * For example, open to accrual, closed to accrual, temporarily closed
 * to accrual, and pending accrual.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getAccrualStatus() {
        return accrualStatus;
    }


    /**
     * Sets the accrualStatus value for this StudySite.
     * 
     * @param accrualStatus Defines the status of the trial at the site.
 * 
 * For example, open to accrual, closed to accrual, temporarily closed
 * to accrual, and pending accrual.
     */
    public void setAccrualStatus(gov.nih.nci.cabig.ccts.domain.cdt.CD accrualStatus) {
        this.accrualStatus = accrualStatus;
    }


    /**
     * Gets the dateRange value for this StudySite.
     * 
     * @return dateRange The date and time range specifying the start of the site's participation
 * in a clinical trial or study and the end of the participation.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.IVLTS getDateRange() {
        return dateRange;
    }


    /**
     * Sets the dateRange value for this StudySite.
     * 
     * @param dateRange The date and time range specifying the start of the site's participation
 * in a clinical trial or study and the end of the participation.
     */
    public void setDateRange(gov.nih.nci.cabig.ccts.domain.cdt.IVLTS dateRange) {
        this.dateRange = dateRange;
    }


    /**
     * Gets the identifier value for this StudySite.
     * 
     * @return identifier The unique identification assigned to a StudySite by a StudySponsor.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.II getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this StudySite.
     * 
     * @param identifier The unique identification assigned to a StudySite by a StudySponsor.
     */
    public void setIdentifier(gov.nih.nci.cabig.ccts.domain.cdt.II identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the irbApprovalDate value for this StudySite.
     * 
     * @return irbApprovalDate The date and time the Institutional Review Board (IRB) approved
 * this study protocol for execution at this site.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.TS getIrbApprovalDate() {
        return irbApprovalDate;
    }


    /**
     * Sets the irbApprovalDate value for this StudySite.
     * 
     * @param irbApprovalDate The date and time the Institutional Review Board (IRB) approved
 * this study protocol for execution at this site.
     */
    public void setIrbApprovalDate(gov.nih.nci.cabig.ccts.domain.cdt.TS irbApprovalDate) {
        this.irbApprovalDate = irbApprovalDate;
    }


    /**
     * Gets the role value for this StudySite.
     * 
     * @return role The responsibility assumed by a site for a study. This is a coded
 * list of kinds of participation. 
 * 
 * For example, for an organization, this could include: lead organization,
 * participating organization, primary sponsor, secondary sponsor etc.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getRole() {
        return role;
    }


    /**
     * Sets the role value for this StudySite.
     * 
     * @param role The responsibility assumed by a site for a study. This is a coded
 * list of kinds of participation. 
 * 
 * For example, for an organization, this could include: lead organization,
 * participating organization, primary sponsor, secondary sponsor etc.
     */
    public void setRole(gov.nih.nci.cabig.ccts.domain.cdt.CD role) {
        this.role = role;
    }


    /**
     * Gets the status value for this StudySite.
     * 
     * @return status A value specifying whether the state of participation of a site
 * in the given study is pending, active, complete, or cancelled.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getStatus() {
        return status;
    }


    /**
     * Sets the status value for this StudySite.
     * 
     * @param status A value specifying whether the state of participation of a site
 * in the given study is pending, active, complete, or cancelled.
     */
    public void setStatus(gov.nih.nci.cabig.ccts.domain.cdt.CD status) {
        this.status = status;
    }


    /**
     * Gets the statusDateRange value for this StudySite.
     * 
     * @return statusDateRange The date and time when this particular status becomes active and
 * is no longer considered active, enforceable, relevant, etc.
 * 
 * For example, for a study protocol, the effective date may be the date
 * of IRB approval of the initial protocol version; the date the Institutional
 * Review Board (IRB) Chair signs off on a protocol and patient enrollment
 * can begin.  The effective end date may refer to the closing of a study
 * to enrollment. Subjects enrolled on the study at the time of closure
 * will continue their treatment plan.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.IVLTS getStatusDateRange() {
        return statusDateRange;
    }


    /**
     * Sets the statusDateRange value for this StudySite.
     * 
     * @param statusDateRange The date and time when this particular status becomes active and
 * is no longer considered active, enforceable, relevant, etc.
 * 
 * For example, for a study protocol, the effective date may be the date
 * of IRB approval of the initial protocol version; the date the Institutional
 * Review Board (IRB) Chair signs off on a protocol and patient enrollment
 * can begin.  The effective end date may refer to the closing of a study
 * to enrollment. Subjects enrolled on the study at the time of closure
 * will continue their treatment plan.
     */
    public void setStatusDateRange(gov.nih.nci.cabig.ccts.domain.cdt.IVLTS statusDateRange) {
        this.statusDateRange = statusDateRange;
    }


    /**
     * Gets the targetAccrualNumber value for this StudySite.
     * 
     * @return targetAccrualNumber Total number of patients/subjects/participants needed for protocol
 * enrollment at this site
     */
    public int getTargetAccrualNumber() {
        return targetAccrualNumber;
    }


    /**
     * Sets the targetAccrualNumber value for this StudySite.
     * 
     * @param targetAccrualNumber Total number of patients/subjects/participants needed for protocol
 * enrollment at this site
     */
    public void setTargetAccrualNumber(int targetAccrualNumber) {
        this.targetAccrualNumber = targetAccrualNumber;
    }


    /**
     * Gets the studyProtocol value for this StudySite.
     * 
     * @return studyProtocol
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol getStudyProtocol() {
        return studyProtocol;
    }


    /**
     * Sets the studyProtocol value for this StudySite.
     * 
     * @param studyProtocol
     */
    public void setStudyProtocol(gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol studyProtocol) {
        this.studyProtocol = studyProtocol;
    }


    /**
     * Gets the healthCareSite value for this StudySite.
     * 
     * @return healthCareSite
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.HealthCareSite getHealthCareSite() {
        return healthCareSite;
    }


    /**
     * Sets the healthCareSite value for this StudySite.
     * 
     * @param healthCareSite
     */
    public void setHealthCareSite(gov.nih.nci.cabig.ccts.domain.bridg.HealthCareSite healthCareSite) {
        this.healthCareSite = healthCareSite;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StudySite)) return false;
        StudySite other = (StudySite) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accrualStatus==null && other.getAccrualStatus()==null) || 
             (this.accrualStatus!=null &&
              this.accrualStatus.equals(other.getAccrualStatus()))) &&
            ((this.dateRange==null && other.getDateRange()==null) || 
             (this.dateRange!=null &&
              this.dateRange.equals(other.getDateRange()))) &&
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier()))) &&
            ((this.irbApprovalDate==null && other.getIrbApprovalDate()==null) || 
             (this.irbApprovalDate!=null &&
              this.irbApprovalDate.equals(other.getIrbApprovalDate()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.statusDateRange==null && other.getStatusDateRange()==null) || 
             (this.statusDateRange!=null &&
              this.statusDateRange.equals(other.getStatusDateRange()))) &&
            this.targetAccrualNumber == other.getTargetAccrualNumber() &&
            ((this.studyProtocol==null && other.getStudyProtocol()==null) || 
             (this.studyProtocol!=null &&
              this.studyProtocol.equals(other.getStudyProtocol()))) &&
            ((this.healthCareSite==null && other.getHealthCareSite()==null) || 
             (this.healthCareSite!=null &&
              this.healthCareSite.equals(other.getHealthCareSite())));
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
        if (getAccrualStatus() != null) {
            _hashCode += getAccrualStatus().hashCode();
        }
        if (getDateRange() != null) {
            _hashCode += getDateRange().hashCode();
        }
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        if (getIrbApprovalDate() != null) {
            _hashCode += getIrbApprovalDate().hashCode();
        }
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatusDateRange() != null) {
            _hashCode += getStatusDateRange().hashCode();
        }
        _hashCode += getTargetAccrualNumber();
        if (getStudyProtocol() != null) {
            _hashCode += getStudyProtocol().hashCode();
        }
        if (getHealthCareSite() != null) {
            _hashCode += getHealthCareSite().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StudySite.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudySite"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accrualStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "accrualStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "dateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "IVLTS"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "II"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("irbApprovalDate");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "irbApprovalDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "TS"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
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
        elemField.setFieldName("targetAccrualNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "targetAccrualNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studyProtocol");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudyProtocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudyProtocol"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("healthCareSite");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "HealthCareSite"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "HealthCareSite"));
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
