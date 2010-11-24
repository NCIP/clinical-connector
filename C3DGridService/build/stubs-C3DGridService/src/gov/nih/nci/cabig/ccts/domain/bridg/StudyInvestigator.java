/**
 * StudyInvestigator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A researcher in a clinical trial or clinical study who oversees
 * all aspects of the trial, such as concept development, protocol writing,
 * protocol submission for IRB approval, participant recruitment, informed
 * consent, data collection, analysis, interpretation and presentation,
 * as primary investigator.
 */
public class StudyInvestigator  implements java.io.Serializable {
    /** The date and time on which an investigator's participation in a
 * specific study begins and ends. */
    private gov.nih.nci.cabig.ccts.domain.cdt.IVLTS dateRange;
    /** The unique identification given to a StudyInvestigator by a StudySponsor. */
    private gov.nih.nci.cabig.ccts.domain.cdt.II identifier;
    /** The responsibility of the investigator on a particular study.
 * 
 * For example, Primary Investigator, Co-Investigator, etc. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD role;
    /** The signed name of the investigator who is responsible for completing
 * a form or report for a clinical trial.
 * 
 * NOTE: The signatureIndicator (The indicator representing that the
 * investigator has signed the document.  This could be the investigator
 * signature for a 1572 form) is yes.
 * NOTE: A textual or multimedia depiction of the signature by which
 * the participant endorses his or her participation in the Act as a
 * specified role and that he or she agrees to assume the associated
 * accountability. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST signatureText;
    /** A value specifying whether the state of participation of an investigator
 * in the given study is pending, active, complete, or cancelled. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD status;
    /** The date and time when this particular status becomes active and
 * when it is no longer considered active, enforceable, relevant, etc..
 * 
 * For example, in a study protocol, the effective date may be the date
 * of IRB approval of the initial protocol version; the date the Institutional
 * Review Board (IRB) Chair signs off on a protocol and patient enrollment
 * can begin.  For a study protocol, the effective end date may refer
 * to the closing of a study to enrollment. Subjects enrolled on the
 * study at the time of closure will continue their treatment plan. */
    private gov.nih.nci.cabig.ccts.domain.cdt.IVLTS statusDateRange;
    private gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol studyProtocol;

    public StudyInvestigator() {
    }

    public StudyInvestigator(
           gov.nih.nci.cabig.ccts.domain.cdt.IVLTS dateRange,
           gov.nih.nci.cabig.ccts.domain.cdt.II identifier,
           gov.nih.nci.cabig.ccts.domain.cdt.CD role,
           gov.nih.nci.cabig.ccts.domain.cdt.ST signatureText,
           gov.nih.nci.cabig.ccts.domain.cdt.CD status,
           gov.nih.nci.cabig.ccts.domain.cdt.IVLTS statusDateRange,
           gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol studyProtocol) {
           this.dateRange = dateRange;
           this.identifier = identifier;
           this.role = role;
           this.signatureText = signatureText;
           this.status = status;
           this.statusDateRange = statusDateRange;
           this.studyProtocol = studyProtocol;
    }


    /**
     * Gets the dateRange value for this StudyInvestigator.
     * 
     * @return dateRange The date and time on which an investigator's participation in a
 * specific study begins and ends.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.IVLTS getDateRange() {
        return dateRange;
    }


    /**
     * Sets the dateRange value for this StudyInvestigator.
     * 
     * @param dateRange The date and time on which an investigator's participation in a
 * specific study begins and ends.
     */
    public void setDateRange(gov.nih.nci.cabig.ccts.domain.cdt.IVLTS dateRange) {
        this.dateRange = dateRange;
    }


    /**
     * Gets the identifier value for this StudyInvestigator.
     * 
     * @return identifier The unique identification given to a StudyInvestigator by a StudySponsor.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.II getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this StudyInvestigator.
     * 
     * @param identifier The unique identification given to a StudyInvestigator by a StudySponsor.
     */
    public void setIdentifier(gov.nih.nci.cabig.ccts.domain.cdt.II identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the role value for this StudyInvestigator.
     * 
     * @return role The responsibility of the investigator on a particular study.
 * 
 * For example, Primary Investigator, Co-Investigator, etc.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getRole() {
        return role;
    }


    /**
     * Sets the role value for this StudyInvestigator.
     * 
     * @param role The responsibility of the investigator on a particular study.
 * 
 * For example, Primary Investigator, Co-Investigator, etc.
     */
    public void setRole(gov.nih.nci.cabig.ccts.domain.cdt.CD role) {
        this.role = role;
    }


    /**
     * Gets the signatureText value for this StudyInvestigator.
     * 
     * @return signatureText The signed name of the investigator who is responsible for completing
 * a form or report for a clinical trial.
 * 
 * NOTE: The signatureIndicator (The indicator representing that the
 * investigator has signed the document.  This could be the investigator
 * signature for a 1572 form) is yes.
 * NOTE: A textual or multimedia depiction of the signature by which
 * the participant endorses his or her participation in the Act as a
 * specified role and that he or she agrees to assume the associated
 * accountability.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getSignatureText() {
        return signatureText;
    }


    /**
     * Sets the signatureText value for this StudyInvestigator.
     * 
     * @param signatureText The signed name of the investigator who is responsible for completing
 * a form or report for a clinical trial.
 * 
 * NOTE: The signatureIndicator (The indicator representing that the
 * investigator has signed the document.  This could be the investigator
 * signature for a 1572 form) is yes.
 * NOTE: A textual or multimedia depiction of the signature by which
 * the participant endorses his or her participation in the Act as a
 * specified role and that he or she agrees to assume the associated
 * accountability.
     */
    public void setSignatureText(gov.nih.nci.cabig.ccts.domain.cdt.ST signatureText) {
        this.signatureText = signatureText;
    }


    /**
     * Gets the status value for this StudyInvestigator.
     * 
     * @return status A value specifying whether the state of participation of an investigator
 * in the given study is pending, active, complete, or cancelled.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getStatus() {
        return status;
    }


    /**
     * Sets the status value for this StudyInvestigator.
     * 
     * @param status A value specifying whether the state of participation of an investigator
 * in the given study is pending, active, complete, or cancelled.
     */
    public void setStatus(gov.nih.nci.cabig.ccts.domain.cdt.CD status) {
        this.status = status;
    }


    /**
     * Gets the statusDateRange value for this StudyInvestigator.
     * 
     * @return statusDateRange The date and time when this particular status becomes active and
 * when it is no longer considered active, enforceable, relevant, etc..
 * 
 * For example, in a study protocol, the effective date may be the date
 * of IRB approval of the initial protocol version; the date the Institutional
 * Review Board (IRB) Chair signs off on a protocol and patient enrollment
 * can begin.  For a study protocol, the effective end date may refer
 * to the closing of a study to enrollment. Subjects enrolled on the
 * study at the time of closure will continue their treatment plan.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.IVLTS getStatusDateRange() {
        return statusDateRange;
    }


    /**
     * Sets the statusDateRange value for this StudyInvestigator.
     * 
     * @param statusDateRange The date and time when this particular status becomes active and
 * when it is no longer considered active, enforceable, relevant, etc..
 * 
 * For example, in a study protocol, the effective date may be the date
 * of IRB approval of the initial protocol version; the date the Institutional
 * Review Board (IRB) Chair signs off on a protocol and patient enrollment
 * can begin.  For a study protocol, the effective end date may refer
 * to the closing of a study to enrollment. Subjects enrolled on the
 * study at the time of closure will continue their treatment plan.
     */
    public void setStatusDateRange(gov.nih.nci.cabig.ccts.domain.cdt.IVLTS statusDateRange) {
        this.statusDateRange = statusDateRange;
    }


    /**
     * Gets the studyProtocol value for this StudyInvestigator.
     * 
     * @return studyProtocol
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol getStudyProtocol() {
        return studyProtocol;
    }


    /**
     * Sets the studyProtocol value for this StudyInvestigator.
     * 
     * @param studyProtocol
     */
    public void setStudyProtocol(gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol studyProtocol) {
        this.studyProtocol = studyProtocol;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StudyInvestigator)) return false;
        StudyInvestigator other = (StudyInvestigator) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dateRange==null && other.getDateRange()==null) || 
             (this.dateRange!=null &&
              this.dateRange.equals(other.getDateRange()))) &&
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole()))) &&
            ((this.signatureText==null && other.getSignatureText()==null) || 
             (this.signatureText!=null &&
              this.signatureText.equals(other.getSignatureText()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.statusDateRange==null && other.getStatusDateRange()==null) || 
             (this.statusDateRange!=null &&
              this.statusDateRange.equals(other.getStatusDateRange()))) &&
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
        if (getDateRange() != null) {
            _hashCode += getDateRange().hashCode();
        }
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        if (getSignatureText() != null) {
            _hashCode += getSignatureText().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatusDateRange() != null) {
            _hashCode += getStatusDateRange().hashCode();
        }
        if (getStudyProtocol() != null) {
            _hashCode += getStudyProtocol().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StudyInvestigator.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudyInvestigator"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureText");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "signatureText"));
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
