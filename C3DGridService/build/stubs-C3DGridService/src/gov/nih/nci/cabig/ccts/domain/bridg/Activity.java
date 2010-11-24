/**
 * Activity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * An abstract class that defines actions that can, in the context
 * of a study, be planned, scheduled or performed.  An activity may be
 * related to other activities in arbitrarily complex ways using instances
 * of ActivityRelationship.
 * 
 * For example, a surgical procedure, a laboratory test, or the administration
 * of the drug.
 */
public abstract class Activity  implements java.io.Serializable {
    /** Identifies the kind of activity drawn from a controlled list of
 * possible values (groups like activities).
 * 
 * For example, anti-cancer medication or general conmed. In the case
 * where category = anti-cancer medication, the subcategory = radiotherapy
 * and the name = full brain radiation.
 * 
 * For example, in Procedure, the category would support "abdominal surgeries".
 * 
 * For example, in AdministrativeActivity, the category would support
 * 3 types: Disposition (off study, epoch completion), Milestone (informed
 * consent, enrollment, registry, randomization) and Other (unblinding)
 * activities. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD category;
    /** Describes the activity using coded terminology.  
 * 
 * For example, a surgical procedure might be described with CPT4 or
 * SNOMED term.
 * 
 * For example, in a lab test, this coded value would be associated with
 * a single analytic procedure (and the property of the results).  the
 * textual description of the analytic test is captured in the complex
 * data type CD. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD codedDescription;
    /** Additional description about the Activity. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST comment;
    /** The unique identifier assigned to an Activity by some assigning
 * body. 
 * 
 * For example,  UUID for external ECG Waveform File. */
    private gov.nih.nci.cabig.ccts.domain.cdt.II identifier;
    /** A code or free text specifying the motivation, cause, or rationale
 * of an Activity. 
 * 
 * For example, routine requirement, drug reaction, infectious disease
 * reporting requirement, on patient request, etc.
 * 
 * NOTE: One can use Activity.reason when the Activity is occurring in
 * isolation or the reason is relatively straightforward. Or if the reason
 * is more complex (described in context of why the Activity was performed),
 * one can use ActivityRelationship.type linking 2 or more Activities
 * to another. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD[] reason;
    /** A code specifying the state of the Activity.  A state is a named
 * phase (or potential phase) of an instance of a concept in its lifecycle.
 * 
 * 
 * For example, for a lab test, this would be the condition or stage
 * in the lifecycle of the test. For example: ordered, performed, etc.
 * 
 * For example, for the patient study calendar, the status attribute
 * captures the states of a scheduled activity. These states can be scheduled,
 * cancelled, and performed.
 * 
 * NOTE: We are assuming that the state machine for the Act class in
 * the HL7 v3 RIM is sufficient to describe the lifecycle of all model
 * activities. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD status;
    /** The date time range associated with the transition (or expected
 * transition) to and from a particular phase of an Activity’s lifecycle
 * as indicated by the value of Activity.status. */
    private gov.nih.nci.cabig.ccts.domain.cdt.IVLTS statusDateRange;
    /** A further classification of category.
 * 
 * For example, chemotherapy, radiotherapy, hormonal therapy, alternative
 * therapy. In the case where category = anti-cancer medication, the
 * subcategory = radiotherapy and the name = full brain radiation. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD subcategory;
    /** A free text description of the activity.  This may contain more
 * detail than the description present in the text part of a coded concept. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST textDescription;

    public Activity() {
    }

    public Activity(
           gov.nih.nci.cabig.ccts.domain.cdt.CD category,
           gov.nih.nci.cabig.ccts.domain.cdt.CD codedDescription,
           gov.nih.nci.cabig.ccts.domain.cdt.ST comment,
           gov.nih.nci.cabig.ccts.domain.cdt.II identifier,
           gov.nih.nci.cabig.ccts.domain.cdt.CD[] reason,
           gov.nih.nci.cabig.ccts.domain.cdt.CD status,
           gov.nih.nci.cabig.ccts.domain.cdt.IVLTS statusDateRange,
           gov.nih.nci.cabig.ccts.domain.cdt.CD subcategory,
           gov.nih.nci.cabig.ccts.domain.cdt.ST textDescription) {
           this.category = category;
           this.codedDescription = codedDescription;
           this.comment = comment;
           this.identifier = identifier;
           this.reason = reason;
           this.status = status;
           this.statusDateRange = statusDateRange;
           this.subcategory = subcategory;
           this.textDescription = textDescription;
    }


    /**
     * Gets the category value for this Activity.
     * 
     * @return category Identifies the kind of activity drawn from a controlled list of
 * possible values (groups like activities).
 * 
 * For example, anti-cancer medication or general conmed. In the case
 * where category = anti-cancer medication, the subcategory = radiotherapy
 * and the name = full brain radiation.
 * 
 * For example, in Procedure, the category would support "abdominal surgeries".
 * 
 * For example, in AdministrativeActivity, the category would support
 * 3 types: Disposition (off study, epoch completion), Milestone (informed
 * consent, enrollment, registry, randomization) and Other (unblinding)
 * activities.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getCategory() {
        return category;
    }


    /**
     * Sets the category value for this Activity.
     * 
     * @param category Identifies the kind of activity drawn from a controlled list of
 * possible values (groups like activities).
 * 
 * For example, anti-cancer medication or general conmed. In the case
 * where category = anti-cancer medication, the subcategory = radiotherapy
 * and the name = full brain radiation.
 * 
 * For example, in Procedure, the category would support "abdominal surgeries".
 * 
 * For example, in AdministrativeActivity, the category would support
 * 3 types: Disposition (off study, epoch completion), Milestone (informed
 * consent, enrollment, registry, randomization) and Other (unblinding)
 * activities.
     */
    public void setCategory(gov.nih.nci.cabig.ccts.domain.cdt.CD category) {
        this.category = category;
    }


    /**
     * Gets the codedDescription value for this Activity.
     * 
     * @return codedDescription Describes the activity using coded terminology.  
 * 
 * For example, a surgical procedure might be described with CPT4 or
 * SNOMED term.
 * 
 * For example, in a lab test, this coded value would be associated with
 * a single analytic procedure (and the property of the results).  the
 * textual description of the analytic test is captured in the complex
 * data type CD.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getCodedDescription() {
        return codedDescription;
    }


    /**
     * Sets the codedDescription value for this Activity.
     * 
     * @param codedDescription Describes the activity using coded terminology.  
 * 
 * For example, a surgical procedure might be described with CPT4 or
 * SNOMED term.
 * 
 * For example, in a lab test, this coded value would be associated with
 * a single analytic procedure (and the property of the results).  the
 * textual description of the analytic test is captured in the complex
 * data type CD.
     */
    public void setCodedDescription(gov.nih.nci.cabig.ccts.domain.cdt.CD codedDescription) {
        this.codedDescription = codedDescription;
    }


    /**
     * Gets the comment value for this Activity.
     * 
     * @return comment Additional description about the Activity.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this Activity.
     * 
     * @param comment Additional description about the Activity.
     */
    public void setComment(gov.nih.nci.cabig.ccts.domain.cdt.ST comment) {
        this.comment = comment;
    }


    /**
     * Gets the identifier value for this Activity.
     * 
     * @return identifier The unique identifier assigned to an Activity by some assigning
 * body. 
 * 
 * For example,  UUID for external ECG Waveform File.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.II getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this Activity.
     * 
     * @param identifier The unique identifier assigned to an Activity by some assigning
 * body. 
 * 
 * For example,  UUID for external ECG Waveform File.
     */
    public void setIdentifier(gov.nih.nci.cabig.ccts.domain.cdt.II identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the reason value for this Activity.
     * 
     * @return reason A code or free text specifying the motivation, cause, or rationale
 * of an Activity. 
 * 
 * For example, routine requirement, drug reaction, infectious disease
 * reporting requirement, on patient request, etc.
 * 
 * NOTE: One can use Activity.reason when the Activity is occurring in
 * isolation or the reason is relatively straightforward. Or if the reason
 * is more complex (described in context of why the Activity was performed),
 * one can use ActivityRelationship.type linking 2 or more Activities
 * to another.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD[] getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this Activity.
     * 
     * @param reason A code or free text specifying the motivation, cause, or rationale
 * of an Activity. 
 * 
 * For example, routine requirement, drug reaction, infectious disease
 * reporting requirement, on patient request, etc.
 * 
 * NOTE: One can use Activity.reason when the Activity is occurring in
 * isolation or the reason is relatively straightforward. Or if the reason
 * is more complex (described in context of why the Activity was performed),
 * one can use ActivityRelationship.type linking 2 or more Activities
 * to another.
     */
    public void setReason(gov.nih.nci.cabig.ccts.domain.cdt.CD[] reason) {
        this.reason = reason;
    }

    public gov.nih.nci.cabig.ccts.domain.cdt.CD getReason(int i) {
        return this.reason[i];
    }

    public void setReason(int i, gov.nih.nci.cabig.ccts.domain.cdt.CD _value) {
        this.reason[i] = _value;
    }


    /**
     * Gets the status value for this Activity.
     * 
     * @return status A code specifying the state of the Activity.  A state is a named
 * phase (or potential phase) of an instance of a concept in its lifecycle.
 * 
 * 
 * For example, for a lab test, this would be the condition or stage
 * in the lifecycle of the test. For example: ordered, performed, etc.
 * 
 * For example, for the patient study calendar, the status attribute
 * captures the states of a scheduled activity. These states can be scheduled,
 * cancelled, and performed.
 * 
 * NOTE: We are assuming that the state machine for the Act class in
 * the HL7 v3 RIM is sufficient to describe the lifecycle of all model
 * activities.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Activity.
     * 
     * @param status A code specifying the state of the Activity.  A state is a named
 * phase (or potential phase) of an instance of a concept in its lifecycle.
 * 
 * 
 * For example, for a lab test, this would be the condition or stage
 * in the lifecycle of the test. For example: ordered, performed, etc.
 * 
 * For example, for the patient study calendar, the status attribute
 * captures the states of a scheduled activity. These states can be scheduled,
 * cancelled, and performed.
 * 
 * NOTE: We are assuming that the state machine for the Act class in
 * the HL7 v3 RIM is sufficient to describe the lifecycle of all model
 * activities.
     */
    public void setStatus(gov.nih.nci.cabig.ccts.domain.cdt.CD status) {
        this.status = status;
    }


    /**
     * Gets the statusDateRange value for this Activity.
     * 
     * @return statusDateRange The date time range associated with the transition (or expected
 * transition) to and from a particular phase of an Activity’s lifecycle
 * as indicated by the value of Activity.status.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.IVLTS getStatusDateRange() {
        return statusDateRange;
    }


    /**
     * Sets the statusDateRange value for this Activity.
     * 
     * @param statusDateRange The date time range associated with the transition (or expected
 * transition) to and from a particular phase of an Activity’s lifecycle
 * as indicated by the value of Activity.status.
     */
    public void setStatusDateRange(gov.nih.nci.cabig.ccts.domain.cdt.IVLTS statusDateRange) {
        this.statusDateRange = statusDateRange;
    }


    /**
     * Gets the subcategory value for this Activity.
     * 
     * @return subcategory A further classification of category.
 * 
 * For example, chemotherapy, radiotherapy, hormonal therapy, alternative
 * therapy. In the case where category = anti-cancer medication, the
 * subcategory = radiotherapy and the name = full brain radiation.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getSubcategory() {
        return subcategory;
    }


    /**
     * Sets the subcategory value for this Activity.
     * 
     * @param subcategory A further classification of category.
 * 
 * For example, chemotherapy, radiotherapy, hormonal therapy, alternative
 * therapy. In the case where category = anti-cancer medication, the
 * subcategory = radiotherapy and the name = full brain radiation.
     */
    public void setSubcategory(gov.nih.nci.cabig.ccts.domain.cdt.CD subcategory) {
        this.subcategory = subcategory;
    }


    /**
     * Gets the textDescription value for this Activity.
     * 
     * @return textDescription A free text description of the activity.  This may contain more
 * detail than the description present in the text part of a coded concept.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getTextDescription() {
        return textDescription;
    }


    /**
     * Sets the textDescription value for this Activity.
     * 
     * @param textDescription A free text description of the activity.  This may contain more
 * detail than the description present in the text part of a coded concept.
     */
    public void setTextDescription(gov.nih.nci.cabig.ccts.domain.cdt.ST textDescription) {
        this.textDescription = textDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Activity)) return false;
        Activity other = (Activity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.codedDescription==null && other.getCodedDescription()==null) || 
             (this.codedDescription!=null &&
              this.codedDescription.equals(other.getCodedDescription()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              java.util.Arrays.equals(this.reason, other.getReason()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.statusDateRange==null && other.getStatusDateRange()==null) || 
             (this.statusDateRange!=null &&
              this.statusDateRange.equals(other.getStatusDateRange()))) &&
            ((this.subcategory==null && other.getSubcategory()==null) || 
             (this.subcategory!=null &&
              this.subcategory.equals(other.getSubcategory()))) &&
            ((this.textDescription==null && other.getTextDescription()==null) || 
             (this.textDescription!=null &&
              this.textDescription.equals(other.getTextDescription())));
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
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getCodedDescription() != null) {
            _hashCode += getCodedDescription().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        if (getReason() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReason());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReason(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatusDateRange() != null) {
            _hashCode += getStatusDateRange().hashCode();
        }
        if (getSubcategory() != null) {
            _hashCode += getSubcategory().hashCode();
        }
        if (getTextDescription() != null) {
            _hashCode += getTextDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Activity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Activity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codedDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "codedDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "II"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("subcategory");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "subcategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "textDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
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
