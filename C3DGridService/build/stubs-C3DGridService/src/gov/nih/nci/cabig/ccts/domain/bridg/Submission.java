/**
 * Submission.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A compilation of the contents of one or more submission units that
 * supports a specific regulatory purpose or decision. In most cases,
 * the compilation of the submission units is used to assess a product's
 * quality, safety and effectiveness.
 * 
 * For example, a request for approval to either market a product or
 * to allow the applicant to start testing of a proposed product.
 * 
 * NOTE: Submissions are always associated with some regulatory action
 * (or inaction). Each submission contains their own regulatory action.
 * Submissions (e.g., initial marketing application, supplemental marketing
 * application) would generally be comprised of multiple submissions
 * units.
 * 
 * NOTE: Most typically the submission will be used to organize information
 * based on a review clock. Receipt date from the regulatory authority
 * is important for a submission. 
 * 
 * NOTE: Submissions can be the "complete" submission, or some portion
 * of a "reviewable unit". In this setting the kind of regulatory decision
 * is different.
 */
public class Submission  implements java.io.Serializable {
    /** The date and time when this particular assessment/status becomes
 * active and when it becomes inactive.
 * 
 * For example, for a study protocol, the effective date may be the date
 * of IRB approval of the initial protocol version; the date the IRB
 * Chair signs off on a protocol and patient enrollment can begin. */
    private gov.nih.nci.cabig.ccts.domain.cdt.IVLTS assessmentDateRange;
    /** The date and time the submission unit was received by the regulatory
 * authority. 
 * 
 * NOTE: Typically, this date will start a review clock, if applicable.
 * The combination of the type and when the submission unit was received
 * will determine the deadline for the submission unit to be reviewed. */
    private gov.nih.nci.cabig.ccts.domain.cdt.TS receiptDate;
    /** A regulatory action (or inaction) made by the regulatory authority.
 * 
 * 
 * For example, the submission can either be active, withdrawn, approved,
 * not approvable, approvable, complete response or cleared.
 * 
 * NOTE: For some submissions, there are business processes that will
 * make "default" action based on timelines --i.e., if no action is taken,
 * then the submission is "approved". 
 * 
 * NOTE: For a submission, there may be multiple regulatory assessments
 * that correspond to the state transitions for a submission, but only
 * one regulatory assessment is true at a given time.  A submission can
 * first be "approvable" and then when the data is complete, a new regulatory
 * assessment can be made that is "approved". */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD regulatoryAssessment;
    /** A coded value specifying the particular kind of submission.
 * 
 * For example, original, supplement, or annual report. 
 * 
 * NOTE: For a reviewable unit, the type is a code specifying the particular
 * kind of reviewable unit (e.g. toxicology, safety, manufacturing, administrative,
 * etc). */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD type;
    private gov.nih.nci.cabig.ccts.domain.bridg.ReviewableUnit[] reviewableUnit;
    private gov.nih.nci.cabig.ccts.domain.bridg.SubmissionUnitRelationship[] submissionUnitRelationship;

    public Submission() {
    }

    public Submission(
           gov.nih.nci.cabig.ccts.domain.cdt.IVLTS assessmentDateRange,
           gov.nih.nci.cabig.ccts.domain.cdt.TS receiptDate,
           gov.nih.nci.cabig.ccts.domain.cdt.CD regulatoryAssessment,
           gov.nih.nci.cabig.ccts.domain.bridg.ReviewableUnit[] reviewableUnit,
           gov.nih.nci.cabig.ccts.domain.bridg.SubmissionUnitRelationship[] submissionUnitRelationship,
           gov.nih.nci.cabig.ccts.domain.cdt.CD type) {
           this.assessmentDateRange = assessmentDateRange;
           this.receiptDate = receiptDate;
           this.regulatoryAssessment = regulatoryAssessment;
           this.type = type;
           this.reviewableUnit = reviewableUnit;
           this.submissionUnitRelationship = submissionUnitRelationship;
    }


    /**
     * Gets the assessmentDateRange value for this Submission.
     * 
     * @return assessmentDateRange The date and time when this particular assessment/status becomes
 * active and when it becomes inactive.
 * 
 * For example, for a study protocol, the effective date may be the date
 * of IRB approval of the initial protocol version; the date the IRB
 * Chair signs off on a protocol and patient enrollment can begin.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.IVLTS getAssessmentDateRange() {
        return assessmentDateRange;
    }


    /**
     * Sets the assessmentDateRange value for this Submission.
     * 
     * @param assessmentDateRange The date and time when this particular assessment/status becomes
 * active and when it becomes inactive.
 * 
 * For example, for a study protocol, the effective date may be the date
 * of IRB approval of the initial protocol version; the date the IRB
 * Chair signs off on a protocol and patient enrollment can begin.
     */
    public void setAssessmentDateRange(gov.nih.nci.cabig.ccts.domain.cdt.IVLTS assessmentDateRange) {
        this.assessmentDateRange = assessmentDateRange;
    }


    /**
     * Gets the receiptDate value for this Submission.
     * 
     * @return receiptDate The date and time the submission unit was received by the regulatory
 * authority. 
 * 
 * NOTE: Typically, this date will start a review clock, if applicable.
 * The combination of the type and when the submission unit was received
 * will determine the deadline for the submission unit to be reviewed.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.TS getReceiptDate() {
        return receiptDate;
    }


    /**
     * Sets the receiptDate value for this Submission.
     * 
     * @param receiptDate The date and time the submission unit was received by the regulatory
 * authority. 
 * 
 * NOTE: Typically, this date will start a review clock, if applicable.
 * The combination of the type and when the submission unit was received
 * will determine the deadline for the submission unit to be reviewed.
     */
    public void setReceiptDate(gov.nih.nci.cabig.ccts.domain.cdt.TS receiptDate) {
        this.receiptDate = receiptDate;
    }


    /**
     * Gets the regulatoryAssessment value for this Submission.
     * 
     * @return regulatoryAssessment A regulatory action (or inaction) made by the regulatory authority.
 * 
 * 
 * For example, the submission can either be active, withdrawn, approved,
 * not approvable, approvable, complete response or cleared.
 * 
 * NOTE: For some submissions, there are business processes that will
 * make "default" action based on timelines --i.e., if no action is taken,
 * then the submission is "approved". 
 * 
 * NOTE: For a submission, there may be multiple regulatory assessments
 * that correspond to the state transitions for a submission, but only
 * one regulatory assessment is true at a given time.  A submission can
 * first be "approvable" and then when the data is complete, a new regulatory
 * assessment can be made that is "approved".
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getRegulatoryAssessment() {
        return regulatoryAssessment;
    }


    /**
     * Sets the regulatoryAssessment value for this Submission.
     * 
     * @param regulatoryAssessment A regulatory action (or inaction) made by the regulatory authority.
 * 
 * 
 * For example, the submission can either be active, withdrawn, approved,
 * not approvable, approvable, complete response or cleared.
 * 
 * NOTE: For some submissions, there are business processes that will
 * make "default" action based on timelines --i.e., if no action is taken,
 * then the submission is "approved". 
 * 
 * NOTE: For a submission, there may be multiple regulatory assessments
 * that correspond to the state transitions for a submission, but only
 * one regulatory assessment is true at a given time.  A submission can
 * first be "approvable" and then when the data is complete, a new regulatory
 * assessment can be made that is "approved".
     */
    public void setRegulatoryAssessment(gov.nih.nci.cabig.ccts.domain.cdt.CD regulatoryAssessment) {
        this.regulatoryAssessment = regulatoryAssessment;
    }


    /**
     * Gets the type value for this Submission.
     * 
     * @return type A coded value specifying the particular kind of submission.
 * 
 * For example, original, supplement, or annual report. 
 * 
 * NOTE: For a reviewable unit, the type is a code specifying the particular
 * kind of reviewable unit (e.g. toxicology, safety, manufacturing, administrative,
 * etc).
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getType() {
        return type;
    }


    /**
     * Sets the type value for this Submission.
     * 
     * @param type A coded value specifying the particular kind of submission.
 * 
 * For example, original, supplement, or annual report. 
 * 
 * NOTE: For a reviewable unit, the type is a code specifying the particular
 * kind of reviewable unit (e.g. toxicology, safety, manufacturing, administrative,
 * etc).
     */
    public void setType(gov.nih.nci.cabig.ccts.domain.cdt.CD type) {
        this.type = type;
    }


    /**
     * Gets the reviewableUnit value for this Submission.
     * 
     * @return reviewableUnit
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.ReviewableUnit[] getReviewableUnit() {
        return reviewableUnit;
    }


    /**
     * Sets the reviewableUnit value for this Submission.
     * 
     * @param reviewableUnit
     */
    public void setReviewableUnit(gov.nih.nci.cabig.ccts.domain.bridg.ReviewableUnit[] reviewableUnit) {
        this.reviewableUnit = reviewableUnit;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.ReviewableUnit getReviewableUnit(int i) {
        return this.reviewableUnit[i];
    }

    public void setReviewableUnit(int i, gov.nih.nci.cabig.ccts.domain.bridg.ReviewableUnit _value) {
        this.reviewableUnit[i] = _value;
    }


    /**
     * Gets the submissionUnitRelationship value for this Submission.
     * 
     * @return submissionUnitRelationship
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.SubmissionUnitRelationship[] getSubmissionUnitRelationship() {
        return submissionUnitRelationship;
    }


    /**
     * Sets the submissionUnitRelationship value for this Submission.
     * 
     * @param submissionUnitRelationship
     */
    public void setSubmissionUnitRelationship(gov.nih.nci.cabig.ccts.domain.bridg.SubmissionUnitRelationship[] submissionUnitRelationship) {
        this.submissionUnitRelationship = submissionUnitRelationship;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.SubmissionUnitRelationship getSubmissionUnitRelationship(int i) {
        return this.submissionUnitRelationship[i];
    }

    public void setSubmissionUnitRelationship(int i, gov.nih.nci.cabig.ccts.domain.bridg.SubmissionUnitRelationship _value) {
        this.submissionUnitRelationship[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Submission)) return false;
        Submission other = (Submission) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assessmentDateRange==null && other.getAssessmentDateRange()==null) || 
             (this.assessmentDateRange!=null &&
              this.assessmentDateRange.equals(other.getAssessmentDateRange()))) &&
            ((this.receiptDate==null && other.getReceiptDate()==null) || 
             (this.receiptDate!=null &&
              this.receiptDate.equals(other.getReceiptDate()))) &&
            ((this.regulatoryAssessment==null && other.getRegulatoryAssessment()==null) || 
             (this.regulatoryAssessment!=null &&
              this.regulatoryAssessment.equals(other.getRegulatoryAssessment()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.reviewableUnit==null && other.getReviewableUnit()==null) || 
             (this.reviewableUnit!=null &&
              java.util.Arrays.equals(this.reviewableUnit, other.getReviewableUnit()))) &&
            ((this.submissionUnitRelationship==null && other.getSubmissionUnitRelationship()==null) || 
             (this.submissionUnitRelationship!=null &&
              java.util.Arrays.equals(this.submissionUnitRelationship, other.getSubmissionUnitRelationship())));
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
        if (getAssessmentDateRange() != null) {
            _hashCode += getAssessmentDateRange().hashCode();
        }
        if (getReceiptDate() != null) {
            _hashCode += getReceiptDate().hashCode();
        }
        if (getRegulatoryAssessment() != null) {
            _hashCode += getRegulatoryAssessment().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getReviewableUnit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReviewableUnit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReviewableUnit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubmissionUnitRelationship() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubmissionUnitRelationship());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubmissionUnitRelationship(), i);
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
        new org.apache.axis.description.TypeDesc(Submission.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Submission"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assessmentDateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "assessmentDateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "IVLTS"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptDate");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "receiptDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "TS"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regulatoryAssessment");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "regulatoryAssessment"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewableUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ReviewableUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ReviewableUnit"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submissionUnitRelationship");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "SubmissionUnitRelationship"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "SubmissionUnitRelationship"));
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
