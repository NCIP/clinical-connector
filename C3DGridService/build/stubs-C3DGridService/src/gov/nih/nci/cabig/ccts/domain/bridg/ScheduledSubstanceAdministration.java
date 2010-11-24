/**
 * ScheduledSubstanceAdministration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * The action of dispensing, applying or otherwise giving medications
 * or other substances to subjects at or during a designated time.
 * 
 * For example, a study subject who receives methotrexate as part of
 * chemotherapy.
 */
public class ScheduledSubstanceAdministration  extends gov.nih.nci.cabig.ccts.domain.bridg.ScheduledActivity  implements java.io.Serializable {
    /** Amount of a substance, agent or medication.
 * 
 * For example, 5 mg, 20 mg/kg. */
    private gov.nih.nci.cabig.ccts.domain.cdt.PQ dose;
    /** Dosing amounts or a range of dosing information collected in text
 * form.
 * 
 * For example, 200-400. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST doseDescription;
    /** The physical state in which a substance is produced for administration.
 * 
 * For example, tablet, capsule, ointment, gel, etc. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD doseForm;
    /** How often doses are administered. 
 * 
 * For example, BID, TID, QID. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD doseFrequency;
    /** Text description of the intended schedule for the ScheduledSubstanceAdministration.
 * 
 * 
 * For example, 2 weeks on, 2 weeks off.  
 * 
 * NOTE: This represents the dosing calendar in a text format. This is
 * a non-computational description that may need to be expanded as additional
 * use cases arise. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST doseRegimen;
    /** The sum of all doses within a day of treatment. */
    private gov.nih.nci.cabig.ccts.domain.cdt.PQ doseTotal;
    /** The detailed anatomical site where the substance enters or is applied
 * to the subject. 
 * 
 * For example, right forearm, left deltoid muscle, etc.
 * 
 * NOTE: This attribute is only needed if the routeOfAdministration requires
 * further specification. For example, if routeOfAdministration is oral,
 * locationOfDoseAdministration is not needed. However, if routeOfAdministration
 * is intravenous or intra-muscular, the precise site may be specified
 * in this attribute. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD locationOfDoseAdministration;
    /** The physiological path and/or method of introducing the substance
 * into or onto the subject.
 * 
 * For example, oral, intravenous, nasal, intradermal, intracardial,
 * etc. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD routeOfAdministration;
    /** The topic for the SubstanceAdministration, usually the verbatim
 * name of the treatment, drug, medicine, or therapy planned to be given
 * during the dosing period for the observation. 
 * 
 * NOTE: Because treatment is of datatype CD, it contains both a coded
 * and textual representation of the treatment. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD treatment;
    /** The material in which the substance is dissolved or suspended for
 * administration.
 * 
 * For example, saline, corn oil, glycerin, syrup, etc. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD treatmentVehicle;
    /** The quantity and units of treatmentVehicle.
 * 
 * For example, 10 miligrams, 2 mililiters, etc. */
    private gov.nih.nci.cabig.ccts.domain.cdt.PQ treatmentVehicleAmount;
    private gov.nih.nci.cabig.ccts.domain.bridg.StudyAgent studyAgent;

    public ScheduledSubstanceAdministration() {
    }

    public ScheduledSubstanceAdministration(
           gov.nih.nci.cabig.ccts.domain.cdt.PQ dose,
           gov.nih.nci.cabig.ccts.domain.cdt.ST doseDescription,
           gov.nih.nci.cabig.ccts.domain.cdt.CD doseForm,
           gov.nih.nci.cabig.ccts.domain.cdt.CD doseFrequency,
           gov.nih.nci.cabig.ccts.domain.cdt.ST doseRegimen,
           gov.nih.nci.cabig.ccts.domain.cdt.PQ doseTotal,
           gov.nih.nci.cabig.ccts.domain.cdt.CD locationOfDoseAdministration,
           gov.nih.nci.cabig.ccts.domain.cdt.CD routeOfAdministration,
           gov.nih.nci.cabig.ccts.domain.bridg.StudyAgent studyAgent,
           gov.nih.nci.cabig.ccts.domain.cdt.CD treatment,
           gov.nih.nci.cabig.ccts.domain.cdt.CD treatmentVehicle,
           gov.nih.nci.cabig.ccts.domain.cdt.PQ treatmentVehicleAmount) {
           this.dose = dose;
           this.doseDescription = doseDescription;
           this.doseForm = doseForm;
           this.doseFrequency = doseFrequency;
           this.doseRegimen = doseRegimen;
           this.doseTotal = doseTotal;
           this.locationOfDoseAdministration = locationOfDoseAdministration;
           this.routeOfAdministration = routeOfAdministration;
           this.treatment = treatment;
           this.treatmentVehicle = treatmentVehicle;
           this.treatmentVehicleAmount = treatmentVehicleAmount;
           this.studyAgent = studyAgent;
    }


    /**
     * Gets the dose value for this ScheduledSubstanceAdministration.
     * 
     * @return dose Amount of a substance, agent or medication.
 * 
 * For example, 5 mg, 20 mg/kg.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.PQ getDose() {
        return dose;
    }


    /**
     * Sets the dose value for this ScheduledSubstanceAdministration.
     * 
     * @param dose Amount of a substance, agent or medication.
 * 
 * For example, 5 mg, 20 mg/kg.
     */
    public void setDose(gov.nih.nci.cabig.ccts.domain.cdt.PQ dose) {
        this.dose = dose;
    }


    /**
     * Gets the doseDescription value for this ScheduledSubstanceAdministration.
     * 
     * @return doseDescription Dosing amounts or a range of dosing information collected in text
 * form.
 * 
 * For example, 200-400.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getDoseDescription() {
        return doseDescription;
    }


    /**
     * Sets the doseDescription value for this ScheduledSubstanceAdministration.
     * 
     * @param doseDescription Dosing amounts or a range of dosing information collected in text
 * form.
 * 
 * For example, 200-400.
     */
    public void setDoseDescription(gov.nih.nci.cabig.ccts.domain.cdt.ST doseDescription) {
        this.doseDescription = doseDescription;
    }


    /**
     * Gets the doseForm value for this ScheduledSubstanceAdministration.
     * 
     * @return doseForm The physical state in which a substance is produced for administration.
 * 
 * For example, tablet, capsule, ointment, gel, etc.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getDoseForm() {
        return doseForm;
    }


    /**
     * Sets the doseForm value for this ScheduledSubstanceAdministration.
     * 
     * @param doseForm The physical state in which a substance is produced for administration.
 * 
 * For example, tablet, capsule, ointment, gel, etc.
     */
    public void setDoseForm(gov.nih.nci.cabig.ccts.domain.cdt.CD doseForm) {
        this.doseForm = doseForm;
    }


    /**
     * Gets the doseFrequency value for this ScheduledSubstanceAdministration.
     * 
     * @return doseFrequency How often doses are administered. 
 * 
 * For example, BID, TID, QID.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getDoseFrequency() {
        return doseFrequency;
    }


    /**
     * Sets the doseFrequency value for this ScheduledSubstanceAdministration.
     * 
     * @param doseFrequency How often doses are administered. 
 * 
 * For example, BID, TID, QID.
     */
    public void setDoseFrequency(gov.nih.nci.cabig.ccts.domain.cdt.CD doseFrequency) {
        this.doseFrequency = doseFrequency;
    }


    /**
     * Gets the doseRegimen value for this ScheduledSubstanceAdministration.
     * 
     * @return doseRegimen Text description of the intended schedule for the ScheduledSubstanceAdministration.
 * 
 * 
 * For example, 2 weeks on, 2 weeks off.  
 * 
 * NOTE: This represents the dosing calendar in a text format. This is
 * a non-computational description that may need to be expanded as additional
 * use cases arise.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getDoseRegimen() {
        return doseRegimen;
    }


    /**
     * Sets the doseRegimen value for this ScheduledSubstanceAdministration.
     * 
     * @param doseRegimen Text description of the intended schedule for the ScheduledSubstanceAdministration.
 * 
 * 
 * For example, 2 weeks on, 2 weeks off.  
 * 
 * NOTE: This represents the dosing calendar in a text format. This is
 * a non-computational description that may need to be expanded as additional
 * use cases arise.
     */
    public void setDoseRegimen(gov.nih.nci.cabig.ccts.domain.cdt.ST doseRegimen) {
        this.doseRegimen = doseRegimen;
    }


    /**
     * Gets the doseTotal value for this ScheduledSubstanceAdministration.
     * 
     * @return doseTotal The sum of all doses within a day of treatment.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.PQ getDoseTotal() {
        return doseTotal;
    }


    /**
     * Sets the doseTotal value for this ScheduledSubstanceAdministration.
     * 
     * @param doseTotal The sum of all doses within a day of treatment.
     */
    public void setDoseTotal(gov.nih.nci.cabig.ccts.domain.cdt.PQ doseTotal) {
        this.doseTotal = doseTotal;
    }


    /**
     * Gets the locationOfDoseAdministration value for this ScheduledSubstanceAdministration.
     * 
     * @return locationOfDoseAdministration The detailed anatomical site where the substance enters or is applied
 * to the subject. 
 * 
 * For example, right forearm, left deltoid muscle, etc.
 * 
 * NOTE: This attribute is only needed if the routeOfAdministration requires
 * further specification. For example, if routeOfAdministration is oral,
 * locationOfDoseAdministration is not needed. However, if routeOfAdministration
 * is intravenous or intra-muscular, the precise site may be specified
 * in this attribute.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getLocationOfDoseAdministration() {
        return locationOfDoseAdministration;
    }


    /**
     * Sets the locationOfDoseAdministration value for this ScheduledSubstanceAdministration.
     * 
     * @param locationOfDoseAdministration The detailed anatomical site where the substance enters or is applied
 * to the subject. 
 * 
 * For example, right forearm, left deltoid muscle, etc.
 * 
 * NOTE: This attribute is only needed if the routeOfAdministration requires
 * further specification. For example, if routeOfAdministration is oral,
 * locationOfDoseAdministration is not needed. However, if routeOfAdministration
 * is intravenous or intra-muscular, the precise site may be specified
 * in this attribute.
     */
    public void setLocationOfDoseAdministration(gov.nih.nci.cabig.ccts.domain.cdt.CD locationOfDoseAdministration) {
        this.locationOfDoseAdministration = locationOfDoseAdministration;
    }


    /**
     * Gets the routeOfAdministration value for this ScheduledSubstanceAdministration.
     * 
     * @return routeOfAdministration The physiological path and/or method of introducing the substance
 * into or onto the subject.
 * 
 * For example, oral, intravenous, nasal, intradermal, intracardial,
 * etc.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getRouteOfAdministration() {
        return routeOfAdministration;
    }


    /**
     * Sets the routeOfAdministration value for this ScheduledSubstanceAdministration.
     * 
     * @param routeOfAdministration The physiological path and/or method of introducing the substance
 * into or onto the subject.
 * 
 * For example, oral, intravenous, nasal, intradermal, intracardial,
 * etc.
     */
    public void setRouteOfAdministration(gov.nih.nci.cabig.ccts.domain.cdt.CD routeOfAdministration) {
        this.routeOfAdministration = routeOfAdministration;
    }


    /**
     * Gets the treatment value for this ScheduledSubstanceAdministration.
     * 
     * @return treatment The topic for the SubstanceAdministration, usually the verbatim
 * name of the treatment, drug, medicine, or therapy planned to be given
 * during the dosing period for the observation. 
 * 
 * NOTE: Because treatment is of datatype CD, it contains both a coded
 * and textual representation of the treatment.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getTreatment() {
        return treatment;
    }


    /**
     * Sets the treatment value for this ScheduledSubstanceAdministration.
     * 
     * @param treatment The topic for the SubstanceAdministration, usually the verbatim
 * name of the treatment, drug, medicine, or therapy planned to be given
 * during the dosing period for the observation. 
 * 
 * NOTE: Because treatment is of datatype CD, it contains both a coded
 * and textual representation of the treatment.
     */
    public void setTreatment(gov.nih.nci.cabig.ccts.domain.cdt.CD treatment) {
        this.treatment = treatment;
    }


    /**
     * Gets the treatmentVehicle value for this ScheduledSubstanceAdministration.
     * 
     * @return treatmentVehicle The material in which the substance is dissolved or suspended for
 * administration.
 * 
 * For example, saline, corn oil, glycerin, syrup, etc.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getTreatmentVehicle() {
        return treatmentVehicle;
    }


    /**
     * Sets the treatmentVehicle value for this ScheduledSubstanceAdministration.
     * 
     * @param treatmentVehicle The material in which the substance is dissolved or suspended for
 * administration.
 * 
 * For example, saline, corn oil, glycerin, syrup, etc.
     */
    public void setTreatmentVehicle(gov.nih.nci.cabig.ccts.domain.cdt.CD treatmentVehicle) {
        this.treatmentVehicle = treatmentVehicle;
    }


    /**
     * Gets the treatmentVehicleAmount value for this ScheduledSubstanceAdministration.
     * 
     * @return treatmentVehicleAmount The quantity and units of treatmentVehicle.
 * 
 * For example, 10 miligrams, 2 mililiters, etc.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.PQ getTreatmentVehicleAmount() {
        return treatmentVehicleAmount;
    }


    /**
     * Sets the treatmentVehicleAmount value for this ScheduledSubstanceAdministration.
     * 
     * @param treatmentVehicleAmount The quantity and units of treatmentVehicle.
 * 
 * For example, 10 miligrams, 2 mililiters, etc.
     */
    public void setTreatmentVehicleAmount(gov.nih.nci.cabig.ccts.domain.cdt.PQ treatmentVehicleAmount) {
        this.treatmentVehicleAmount = treatmentVehicleAmount;
    }


    /**
     * Gets the studyAgent value for this ScheduledSubstanceAdministration.
     * 
     * @return studyAgent
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.StudyAgent getStudyAgent() {
        return studyAgent;
    }


    /**
     * Sets the studyAgent value for this ScheduledSubstanceAdministration.
     * 
     * @param studyAgent
     */
    public void setStudyAgent(gov.nih.nci.cabig.ccts.domain.bridg.StudyAgent studyAgent) {
        this.studyAgent = studyAgent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduledSubstanceAdministration)) return false;
        ScheduledSubstanceAdministration other = (ScheduledSubstanceAdministration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dose==null && other.getDose()==null) || 
             (this.dose!=null &&
              this.dose.equals(other.getDose()))) &&
            ((this.doseDescription==null && other.getDoseDescription()==null) || 
             (this.doseDescription!=null &&
              this.doseDescription.equals(other.getDoseDescription()))) &&
            ((this.doseForm==null && other.getDoseForm()==null) || 
             (this.doseForm!=null &&
              this.doseForm.equals(other.getDoseForm()))) &&
            ((this.doseFrequency==null && other.getDoseFrequency()==null) || 
             (this.doseFrequency!=null &&
              this.doseFrequency.equals(other.getDoseFrequency()))) &&
            ((this.doseRegimen==null && other.getDoseRegimen()==null) || 
             (this.doseRegimen!=null &&
              this.doseRegimen.equals(other.getDoseRegimen()))) &&
            ((this.doseTotal==null && other.getDoseTotal()==null) || 
             (this.doseTotal!=null &&
              this.doseTotal.equals(other.getDoseTotal()))) &&
            ((this.locationOfDoseAdministration==null && other.getLocationOfDoseAdministration()==null) || 
             (this.locationOfDoseAdministration!=null &&
              this.locationOfDoseAdministration.equals(other.getLocationOfDoseAdministration()))) &&
            ((this.routeOfAdministration==null && other.getRouteOfAdministration()==null) || 
             (this.routeOfAdministration!=null &&
              this.routeOfAdministration.equals(other.getRouteOfAdministration()))) &&
            ((this.treatment==null && other.getTreatment()==null) || 
             (this.treatment!=null &&
              this.treatment.equals(other.getTreatment()))) &&
            ((this.treatmentVehicle==null && other.getTreatmentVehicle()==null) || 
             (this.treatmentVehicle!=null &&
              this.treatmentVehicle.equals(other.getTreatmentVehicle()))) &&
            ((this.treatmentVehicleAmount==null && other.getTreatmentVehicleAmount()==null) || 
             (this.treatmentVehicleAmount!=null &&
              this.treatmentVehicleAmount.equals(other.getTreatmentVehicleAmount()))) &&
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
        if (getDose() != null) {
            _hashCode += getDose().hashCode();
        }
        if (getDoseDescription() != null) {
            _hashCode += getDoseDescription().hashCode();
        }
        if (getDoseForm() != null) {
            _hashCode += getDoseForm().hashCode();
        }
        if (getDoseFrequency() != null) {
            _hashCode += getDoseFrequency().hashCode();
        }
        if (getDoseRegimen() != null) {
            _hashCode += getDoseRegimen().hashCode();
        }
        if (getDoseTotal() != null) {
            _hashCode += getDoseTotal().hashCode();
        }
        if (getLocationOfDoseAdministration() != null) {
            _hashCode += getLocationOfDoseAdministration().hashCode();
        }
        if (getRouteOfAdministration() != null) {
            _hashCode += getRouteOfAdministration().hashCode();
        }
        if (getTreatment() != null) {
            _hashCode += getTreatment().hashCode();
        }
        if (getTreatmentVehicle() != null) {
            _hashCode += getTreatmentVehicle().hashCode();
        }
        if (getTreatmentVehicleAmount() != null) {
            _hashCode += getTreatmentVehicleAmount().hashCode();
        }
        if (getStudyAgent() != null) {
            _hashCode += getStudyAgent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScheduledSubstanceAdministration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ScheduledSubstanceAdministration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dose");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "dose"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "PQ"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doseDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "doseDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doseForm");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "doseForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doseFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "doseFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doseRegimen");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "doseRegimen"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doseTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "doseTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "PQ"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationOfDoseAdministration");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "locationOfDoseAdministration"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeOfAdministration");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "routeOfAdministration"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("treatment");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "treatment"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("treatmentVehicle");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "treatmentVehicle"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("treatmentVehicleAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "treatmentVehicleAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "PQ"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
