/**
 * SubmissionUnit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * The collection of documentation's provided to the regulatory authority
 * at one time.
 * 
 * NOTE: A submission unit is made up of one to many documentation's.
 * Properly defined, the submission unit concept enables companies to
 * create new submission units from any combination of new and previously
 * submitted documentation.
 * 
 * NOTE: In the dynamic aspects of the model, a submission unit is one
 * message that may have a collection of many documentation's. There
 * are rules for how submission units are evaluated are described in
 * a state diagram, and the receipt date of the submission unit "starts
 * the clock" for the review of the contents of the submission unit.
 */
public class SubmissionUnit  implements java.io.Serializable {
    /** The date and time the submission unit was received by the regulatory
 * authority. 
 * 
 * NOTE: Typically, this date will start a review clock, if applicable.
 * The combination of the code and where the submission unit was received
 * will determine the deadline for the submission unit to be reviewed. */
    private gov.nih.nci.cabig.ccts.domain.cdt.TS receiptDate;
    /** Determined by the applicant -- a submitting organization can indicate
 * that a submissionUnit should be considered "inactive" for regulatory
 * assessments. This would be used if a submission unit was discovered
 * at a later date to be incorrect or inaccurate. 
 * 
 *  For example for the Regulated Product Submission (RPS), the status
 * could either be active or inactive */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD status;
    /** The date and time range when this particular status becomes active
 * and when it is no longer considered active, enforceable, relevant,
 * etc.
 * 
 * For example, in a study protocol, the effective date may be the date
 * of IRB approval of the initial protocol version; the date the Institutional
 * Review Board (IRB) Chair signs off on a protocol and patient enrollment
 * can begin. The effective end date may refer to the closing of a study
 * to enrollment. Patients enrolled on the study at the time of closure
 * will continue their treatment plan.. */
    private gov.nih.nci.cabig.ccts.domain.cdt.IVLTS statusDateRange;
    /** A coded value specifying the particular kind of submission unit.
 * 
 * For example, original, amendment, or supplement. 
 * 
 * NOTE: Typically each submission unit type would cause a different
 * regulatory request. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD type;
    private gov.nih.nci.cabig.ccts.domain.bridg.Document[] document;

    public SubmissionUnit() {
    }

    public SubmissionUnit(
           gov.nih.nci.cabig.ccts.domain.bridg.Document[] document,
           gov.nih.nci.cabig.ccts.domain.cdt.TS receiptDate,
           gov.nih.nci.cabig.ccts.domain.cdt.CD status,
           gov.nih.nci.cabig.ccts.domain.cdt.IVLTS statusDateRange,
           gov.nih.nci.cabig.ccts.domain.cdt.CD type) {
           this.receiptDate = receiptDate;
           this.status = status;
           this.statusDateRange = statusDateRange;
           this.type = type;
           this.document = document;
    }


    /**
     * Gets the receiptDate value for this SubmissionUnit.
     * 
     * @return receiptDate The date and time the submission unit was received by the regulatory
 * authority. 
 * 
 * NOTE: Typically, this date will start a review clock, if applicable.
 * The combination of the code and where the submission unit was received
 * will determine the deadline for the submission unit to be reviewed.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.TS getReceiptDate() {
        return receiptDate;
    }


    /**
     * Sets the receiptDate value for this SubmissionUnit.
     * 
     * @param receiptDate The date and time the submission unit was received by the regulatory
 * authority. 
 * 
 * NOTE: Typically, this date will start a review clock, if applicable.
 * The combination of the code and where the submission unit was received
 * will determine the deadline for the submission unit to be reviewed.
     */
    public void setReceiptDate(gov.nih.nci.cabig.ccts.domain.cdt.TS receiptDate) {
        this.receiptDate = receiptDate;
    }


    /**
     * Gets the status value for this SubmissionUnit.
     * 
     * @return status Determined by the applicant -- a submitting organization can indicate
 * that a submissionUnit should be considered "inactive" for regulatory
 * assessments. This would be used if a submission unit was discovered
 * at a later date to be incorrect or inaccurate. 
 * 
 *  For example for the Regulated Product Submission (RPS), the status
 * could either be active or inactive
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SubmissionUnit.
     * 
     * @param status Determined by the applicant -- a submitting organization can indicate
 * that a submissionUnit should be considered "inactive" for regulatory
 * assessments. This would be used if a submission unit was discovered
 * at a later date to be incorrect or inaccurate. 
 * 
 *  For example for the Regulated Product Submission (RPS), the status
 * could either be active or inactive
     */
    public void setStatus(gov.nih.nci.cabig.ccts.domain.cdt.CD status) {
        this.status = status;
    }


    /**
     * Gets the statusDateRange value for this SubmissionUnit.
     * 
     * @return statusDateRange The date and time range when this particular status becomes active
 * and when it is no longer considered active, enforceable, relevant,
 * etc.
 * 
 * For example, in a study protocol, the effective date may be the date
 * of IRB approval of the initial protocol version; the date the Institutional
 * Review Board (IRB) Chair signs off on a protocol and patient enrollment
 * can begin. The effective end date may refer to the closing of a study
 * to enrollment. Patients enrolled on the study at the time of closure
 * will continue their treatment plan..
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.IVLTS getStatusDateRange() {
        return statusDateRange;
    }


    /**
     * Sets the statusDateRange value for this SubmissionUnit.
     * 
     * @param statusDateRange The date and time range when this particular status becomes active
 * and when it is no longer considered active, enforceable, relevant,
 * etc.
 * 
 * For example, in a study protocol, the effective date may be the date
 * of IRB approval of the initial protocol version; the date the Institutional
 * Review Board (IRB) Chair signs off on a protocol and patient enrollment
 * can begin. The effective end date may refer to the closing of a study
 * to enrollment. Patients enrolled on the study at the time of closure
 * will continue their treatment plan..
     */
    public void setStatusDateRange(gov.nih.nci.cabig.ccts.domain.cdt.IVLTS statusDateRange) {
        this.statusDateRange = statusDateRange;
    }


    /**
     * Gets the type value for this SubmissionUnit.
     * 
     * @return type A coded value specifying the particular kind of submission unit.
 * 
 * For example, original, amendment, or supplement. 
 * 
 * NOTE: Typically each submission unit type would cause a different
 * regulatory request.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getType() {
        return type;
    }


    /**
     * Sets the type value for this SubmissionUnit.
     * 
     * @param type A coded value specifying the particular kind of submission unit.
 * 
 * For example, original, amendment, or supplement. 
 * 
 * NOTE: Typically each submission unit type would cause a different
 * regulatory request.
     */
    public void setType(gov.nih.nci.cabig.ccts.domain.cdt.CD type) {
        this.type = type;
    }


    /**
     * Gets the document value for this SubmissionUnit.
     * 
     * @return document
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.Document[] getDocument() {
        return document;
    }


    /**
     * Sets the document value for this SubmissionUnit.
     * 
     * @param document
     */
    public void setDocument(gov.nih.nci.cabig.ccts.domain.bridg.Document[] document) {
        this.document = document;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.Document getDocument(int i) {
        return this.document[i];
    }

    public void setDocument(int i, gov.nih.nci.cabig.ccts.domain.bridg.Document _value) {
        this.document[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmissionUnit)) return false;
        SubmissionUnit other = (SubmissionUnit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.receiptDate==null && other.getReceiptDate()==null) || 
             (this.receiptDate!=null &&
              this.receiptDate.equals(other.getReceiptDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.statusDateRange==null && other.getStatusDateRange()==null) || 
             (this.statusDateRange!=null &&
              this.statusDateRange.equals(other.getStatusDateRange()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.document==null && other.getDocument()==null) || 
             (this.document!=null &&
              java.util.Arrays.equals(this.document, other.getDocument())));
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
        if (getReceiptDate() != null) {
            _hashCode += getReceiptDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatusDateRange() != null) {
            _hashCode += getStatusDateRange().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getDocument() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocument());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocument(), i);
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
        new org.apache.axis.description.TypeDesc(SubmissionUnit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "SubmissionUnit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptDate");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "receiptDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "TS"));
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
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("document");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Document"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Document"));
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
