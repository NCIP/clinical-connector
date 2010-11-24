/**
 * PerformedSubstanceAdministration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * The completed action of applying, dispensing or otherwise giving
 * medications or other substances to subjects.
 * 
 *  For example, a study subject who receives methotrexate as part of
 * chemotherapy.
 */
public class PerformedSubstanceAdministration  extends gov.nih.nci.cabig.ccts.domain.bridg.PerformedActivity  implements java.io.Serializable {
    /** Dose level of a substance or medication, assigned to a protocol
 * patient/participant.
 * 
 * For example, 5 mg, 20 mg/kg. */
    private gov.nih.nci.cabig.ccts.domain.cdt.PQ dose;
    /** The rationale for changing the dose.
 * 
 * For example, dose reduced due to hematologic toxicity. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST doseChangeReason;
    /** Value to represent a change in the plan for treatment dosage. 
 * 
 * For example, Unknown, No, Yes Planned, Yes Unplanned. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD doseChangeType;
    /** Dosing amounts or a range of dosing information collected in text
 * form.
 * 
 * For example, 200-400. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST doseDescription;
    /** Dose form for the treatment. 
 * 
 * For example, tablet, capsule. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD doseForm;
    /** The number of doses given per a specific interval. 
 * 
 * For example, BID, TID, QID. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD doseFrequency;
    /** A description of the modification of the dose. 
 * 
 * For example, Agent Added, Agent Dose Decreased, Agent Dose Increased,
 * etc. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST doseModificationType;
    /** A text description of the intended schedule or regimen for the
 * intervention.  
 * 
 * For example, 2 weeks on, 2 weeks off.  
 * 
 * NOTE: This represents the dosing calendar in a text format. This is
 * a non-computational description that may need to be expanded as additional
 * use cases arise. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST doseRegimen;
    /** Total daily dose of treatment. */
    private gov.nih.nci.cabig.ccts.domain.cdt.PQ doseTotal;
    /** The anatomical location where a substance is administered, such
 * as an injection site.
 * 
 * For example, right arm for an injection. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD locationOfDoseAdministration;
    /** Route of administration for the substance. 
 * 
 * For example, oral, intravenous. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD routeOfAdministration;
    /** Identifies the end of substance use with respect to the sponsor-defined
 * reference period. This may be populated when a start date is not collected.
 * 
 * 
 * For example, before, during, during/after, after, etc.
 * 
 * NOTE: Sponsors should define the reference period in the study metadata. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD substanceUseEndRelativeToReference;
    /** Identifies the start of the substance use with respect to the sponsor-defined
 * reference period. This may be populated when a start date is not collected.
 * 
 * 
 * For example, medications that are ongoing at the end of the reference
 * period should have a value of "during/after" for this variable.
 * 
 * For example, before, during, during/after, after, etc.
 * 
 * NOTE: Sponsors should define the reference period in the study metadata. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD substanceUseStartRelativeToReference;
    /** The topic for the SubstanceAdministration, usually the verbatim
 * name of the treatment, drug, medicine, or therapy given during the
 * dosing period for the observation. 
 * 
 * NOTE: Because treatment is of datatype CD, it contains both a coded
 * and textual representation of the treatment. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD treatment;
    /** A character string that is a revision of originalText to enable
 * the coding of the text. 
 * 
 * For example, if the originalText is "hedache", the nameModifiedText
 * could be changed to "headache", so that the text can be successfully
 * coded.
 * 
 * NOTE: In the context of BRIDG, text modification occurs a single time
 * for agiven instance of OriginalText. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST treatmentModifiedText;
    /** The type of vehicle used for treatment.  
 * 
 * For example, saline. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD treatmentVehicle;
    /** The volume (and units) of treatment vehicle used.
 * 
 * For example, 10 miligrams, 2 mililiters, etc. */
    private gov.nih.nci.cabig.ccts.domain.cdt.PQ treatmentVehicleVolume;
    private gov.nih.nci.cabig.ccts.domain.bridg.StudyAgent studyAgent;

    public PerformedSubstanceAdministration() {
    }

    public PerformedSubstanceAdministration(
           gov.nih.nci.cabig.ccts.domain.cdt.PQ dose,
           gov.nih.nci.cabig.ccts.domain.cdt.ST doseChangeReason,
           gov.nih.nci.cabig.ccts.domain.cdt.CD doseChangeType,
           gov.nih.nci.cabig.ccts.domain.cdt.ST doseDescription,
           gov.nih.nci.cabig.ccts.domain.cdt.CD doseForm,
           gov.nih.nci.cabig.ccts.domain.cdt.CD doseFrequency,
           gov.nih.nci.cabig.ccts.domain.cdt.ST doseModificationType,
           gov.nih.nci.cabig.ccts.domain.cdt.ST doseRegimen,
           gov.nih.nci.cabig.ccts.domain.cdt.PQ doseTotal,
           gov.nih.nci.cabig.ccts.domain.cdt.CD locationOfDoseAdministration,
           gov.nih.nci.cabig.ccts.domain.cdt.CD routeOfAdministration,
           gov.nih.nci.cabig.ccts.domain.bridg.StudyAgent studyAgent,
           gov.nih.nci.cabig.ccts.domain.cdt.CD substanceUseEndRelativeToReference,
           gov.nih.nci.cabig.ccts.domain.cdt.CD substanceUseStartRelativeToReference,
           gov.nih.nci.cabig.ccts.domain.cdt.CD treatment,
           gov.nih.nci.cabig.ccts.domain.cdt.ST treatmentModifiedText,
           gov.nih.nci.cabig.ccts.domain.cdt.CD treatmentVehicle,
           gov.nih.nci.cabig.ccts.domain.cdt.PQ treatmentVehicleVolume) {
           this.dose = dose;
           this.doseChangeReason = doseChangeReason;
           this.doseChangeType = doseChangeType;
           this.doseDescription = doseDescription;
           this.doseForm = doseForm;
           this.doseFrequency = doseFrequency;
           this.doseModificationType = doseModificationType;
           this.doseRegimen = doseRegimen;
           this.doseTotal = doseTotal;
           this.locationOfDoseAdministration = locationOfDoseAdministration;
           this.routeOfAdministration = routeOfAdministration;
           this.substanceUseEndRelativeToReference = substanceUseEndRelativeToReference;
           this.substanceUseStartRelativeToReference = substanceUseStartRelativeToReference;
           this.treatment = treatment;
           this.treatmentModifiedText = treatmentModifiedText;
           this.treatmentVehicle = treatmentVehicle;
           this.treatmentVehicleVolume = treatmentVehicleVolume;
           this.studyAgent = studyAgent;
    }


    /**
     * Gets the dose value for this PerformedSubstanceAdministration.
     * 
     * @return dose Dose level of a substance or medication, assigned to a protocol
 * patient/participant.
 * 
 * For example, 5 mg, 20 mg/kg.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.PQ getDose() {
        return dose;
    }


    /**
     * Sets the dose value for this PerformedSubstanceAdministration.
     * 
     * @param dose Dose level of a substance or medication, assigned to a protocol
 * patient/participant.
 * 
 * For example, 5 mg, 20 mg/kg.
     */
    public void setDose(gov.nih.nci.cabig.ccts.domain.cdt.PQ dose) {
        this.dose = dose;
    }


    /**
     * Gets the doseChangeReason value for this PerformedSubstanceAdministration.
     * 
     * @return doseChangeReason The rationale for changing the dose.
 * 
 * For example, dose reduced due to hematologic toxicity.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getDoseChangeReason() {
        return doseChangeReason;
    }


    /**
     * Sets the doseChangeReason value for this PerformedSubstanceAdministration.
     * 
     * @param doseChangeReason The rationale for changing the dose.
 * 
 * For example, dose reduced due to hematologic toxicity.
     */
    public void setDoseChangeReason(gov.nih.nci.cabig.ccts.domain.cdt.ST doseChangeReason) {
        this.doseChangeReason = doseChangeReason;
    }


    /**
     * Gets the doseChangeType value for this PerformedSubstanceAdministration.
     * 
     * @return doseChangeType Value to represent a change in the plan for treatment dosage. 
 * 
 * For example, Unknown, No, Yes Planned, Yes Unplanned.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getDoseChangeType() {
        return doseChangeType;
    }


    /**
     * Sets the doseChangeType value for this PerformedSubstanceAdministration.
     * 
     * @param doseChangeType Value to represent a change in the plan for treatment dosage. 
 * 
 * For example, Unknown, No, Yes Planned, Yes Unplanned.
     */
    public void setDoseChangeType(gov.nih.nci.cabig.ccts.domain.cdt.CD doseChangeType) {
        this.doseChangeType = doseChangeType;
    }


    /**
     * Gets the doseDescription value for this PerformedSubstanceAdministration.
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
     * Sets the doseDescription value for this PerformedSubstanceAdministration.
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
     * Gets the doseForm value for this PerformedSubstanceAdministration.
     * 
     * @return doseForm Dose form for the treatment. 
 * 
 * For example, tablet, capsule.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getDoseForm() {
        return doseForm;
    }


    /**
     * Sets the doseForm value for this PerformedSubstanceAdministration.
     * 
     * @param doseForm Dose form for the treatment. 
 * 
 * For example, tablet, capsule.
     */
    public void setDoseForm(gov.nih.nci.cabig.ccts.domain.cdt.CD doseForm) {
        this.doseForm = doseForm;
    }


    /**
     * Gets the doseFrequency value for this PerformedSubstanceAdministration.
     * 
     * @return doseFrequency The number of doses given per a specific interval. 
 * 
 * For example, BID, TID, QID.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getDoseFrequency() {
        return doseFrequency;
    }


    /**
     * Sets the doseFrequency value for this PerformedSubstanceAdministration.
     * 
     * @param doseFrequency The number of doses given per a specific interval. 
 * 
 * For example, BID, TID, QID.
     */
    public void setDoseFrequency(gov.nih.nci.cabig.ccts.domain.cdt.CD doseFrequency) {
        this.doseFrequency = doseFrequency;
    }


    /**
     * Gets the doseModificationType value for this PerformedSubstanceAdministration.
     * 
     * @return doseModificationType A description of the modification of the dose. 
 * 
 * For example, Agent Added, Agent Dose Decreased, Agent Dose Increased,
 * etc.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getDoseModificationType() {
        return doseModificationType;
    }


    /**
     * Sets the doseModificationType value for this PerformedSubstanceAdministration.
     * 
     * @param doseModificationType A description of the modification of the dose. 
 * 
 * For example, Agent Added, Agent Dose Decreased, Agent Dose Increased,
 * etc.
     */
    public void setDoseModificationType(gov.nih.nci.cabig.ccts.domain.cdt.ST doseModificationType) {
        this.doseModificationType = doseModificationType;
    }


    /**
     * Gets the doseRegimen value for this PerformedSubstanceAdministration.
     * 
     * @return doseRegimen A text description of the intended schedule or regimen for the
 * intervention.  
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
     * Sets the doseRegimen value for this PerformedSubstanceAdministration.
     * 
     * @param doseRegimen A text description of the intended schedule or regimen for the
 * intervention.  
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
     * Gets the doseTotal value for this PerformedSubstanceAdministration.
     * 
     * @return doseTotal Total daily dose of treatment.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.PQ getDoseTotal() {
        return doseTotal;
    }


    /**
     * Sets the doseTotal value for this PerformedSubstanceAdministration.
     * 
     * @param doseTotal Total daily dose of treatment.
     */
    public void setDoseTotal(gov.nih.nci.cabig.ccts.domain.cdt.PQ doseTotal) {
        this.doseTotal = doseTotal;
    }


    /**
     * Gets the locationOfDoseAdministration value for this PerformedSubstanceAdministration.
     * 
     * @return locationOfDoseAdministration The anatomical location where a substance is administered, such
 * as an injection site.
 * 
 * For example, right arm for an injection.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getLocationOfDoseAdministration() {
        return locationOfDoseAdministration;
    }


    /**
     * Sets the locationOfDoseAdministration value for this PerformedSubstanceAdministration.
     * 
     * @param locationOfDoseAdministration The anatomical location where a substance is administered, such
 * as an injection site.
 * 
 * For example, right arm for an injection.
     */
    public void setLocationOfDoseAdministration(gov.nih.nci.cabig.ccts.domain.cdt.CD locationOfDoseAdministration) {
        this.locationOfDoseAdministration = locationOfDoseAdministration;
    }


    /**
     * Gets the routeOfAdministration value for this PerformedSubstanceAdministration.
     * 
     * @return routeOfAdministration Route of administration for the substance. 
 * 
 * For example, oral, intravenous.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getRouteOfAdministration() {
        return routeOfAdministration;
    }


    /**
     * Sets the routeOfAdministration value for this PerformedSubstanceAdministration.
     * 
     * @param routeOfAdministration Route of administration for the substance. 
 * 
 * For example, oral, intravenous.
     */
    public void setRouteOfAdministration(gov.nih.nci.cabig.ccts.domain.cdt.CD routeOfAdministration) {
        this.routeOfAdministration = routeOfAdministration;
    }


    /**
     * Gets the substanceUseEndRelativeToReference value for this PerformedSubstanceAdministration.
     * 
     * @return substanceUseEndRelativeToReference Identifies the end of substance use with respect to the sponsor-defined
 * reference period. This may be populated when a start date is not collected.
 * 
 * 
 * For example, before, during, during/after, after, etc.
 * 
 * NOTE: Sponsors should define the reference period in the study metadata.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getSubstanceUseEndRelativeToReference() {
        return substanceUseEndRelativeToReference;
    }


    /**
     * Sets the substanceUseEndRelativeToReference value for this PerformedSubstanceAdministration.
     * 
     * @param substanceUseEndRelativeToReference Identifies the end of substance use with respect to the sponsor-defined
 * reference period. This may be populated when a start date is not collected.
 * 
 * 
 * For example, before, during, during/after, after, etc.
 * 
 * NOTE: Sponsors should define the reference period in the study metadata.
     */
    public void setSubstanceUseEndRelativeToReference(gov.nih.nci.cabig.ccts.domain.cdt.CD substanceUseEndRelativeToReference) {
        this.substanceUseEndRelativeToReference = substanceUseEndRelativeToReference;
    }


    /**
     * Gets the substanceUseStartRelativeToReference value for this PerformedSubstanceAdministration.
     * 
     * @return substanceUseStartRelativeToReference Identifies the start of the substance use with respect to the sponsor-defined
 * reference period. This may be populated when a start date is not collected.
 * 
 * 
 * For example, medications that are ongoing at the end of the reference
 * period should have a value of "during/after" for this variable.
 * 
 * For example, before, during, during/after, after, etc.
 * 
 * NOTE: Sponsors should define the reference period in the study metadata.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getSubstanceUseStartRelativeToReference() {
        return substanceUseStartRelativeToReference;
    }


    /**
     * Sets the substanceUseStartRelativeToReference value for this PerformedSubstanceAdministration.
     * 
     * @param substanceUseStartRelativeToReference Identifies the start of the substance use with respect to the sponsor-defined
 * reference period. This may be populated when a start date is not collected.
 * 
 * 
 * For example, medications that are ongoing at the end of the reference
 * period should have a value of "during/after" for this variable.
 * 
 * For example, before, during, during/after, after, etc.
 * 
 * NOTE: Sponsors should define the reference period in the study metadata.
     */
    public void setSubstanceUseStartRelativeToReference(gov.nih.nci.cabig.ccts.domain.cdt.CD substanceUseStartRelativeToReference) {
        this.substanceUseStartRelativeToReference = substanceUseStartRelativeToReference;
    }


    /**
     * Gets the treatment value for this PerformedSubstanceAdministration.
     * 
     * @return treatment The topic for the SubstanceAdministration, usually the verbatim
 * name of the treatment, drug, medicine, or therapy given during the
 * dosing period for the observation. 
 * 
 * NOTE: Because treatment is of datatype CD, it contains both a coded
 * and textual representation of the treatment.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getTreatment() {
        return treatment;
    }


    /**
     * Sets the treatment value for this PerformedSubstanceAdministration.
     * 
     * @param treatment The topic for the SubstanceAdministration, usually the verbatim
 * name of the treatment, drug, medicine, or therapy given during the
 * dosing period for the observation. 
 * 
 * NOTE: Because treatment is of datatype CD, it contains both a coded
 * and textual representation of the treatment.
     */
    public void setTreatment(gov.nih.nci.cabig.ccts.domain.cdt.CD treatment) {
        this.treatment = treatment;
    }


    /**
     * Gets the treatmentModifiedText value for this PerformedSubstanceAdministration.
     * 
     * @return treatmentModifiedText A character string that is a revision of originalText to enable
 * the coding of the text. 
 * 
 * For example, if the originalText is "hedache", the nameModifiedText
 * could be changed to "headache", so that the text can be successfully
 * coded.
 * 
 * NOTE: In the context of BRIDG, text modification occurs a single time
 * for agiven instance of OriginalText.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getTreatmentModifiedText() {
        return treatmentModifiedText;
    }


    /**
     * Sets the treatmentModifiedText value for this PerformedSubstanceAdministration.
     * 
     * @param treatmentModifiedText A character string that is a revision of originalText to enable
 * the coding of the text. 
 * 
 * For example, if the originalText is "hedache", the nameModifiedText
 * could be changed to "headache", so that the text can be successfully
 * coded.
 * 
 * NOTE: In the context of BRIDG, text modification occurs a single time
 * for agiven instance of OriginalText.
     */
    public void setTreatmentModifiedText(gov.nih.nci.cabig.ccts.domain.cdt.ST treatmentModifiedText) {
        this.treatmentModifiedText = treatmentModifiedText;
    }


    /**
     * Gets the treatmentVehicle value for this PerformedSubstanceAdministration.
     * 
     * @return treatmentVehicle The type of vehicle used for treatment.  
 * 
 * For example, saline.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getTreatmentVehicle() {
        return treatmentVehicle;
    }


    /**
     * Sets the treatmentVehicle value for this PerformedSubstanceAdministration.
     * 
     * @param treatmentVehicle The type of vehicle used for treatment.  
 * 
 * For example, saline.
     */
    public void setTreatmentVehicle(gov.nih.nci.cabig.ccts.domain.cdt.CD treatmentVehicle) {
        this.treatmentVehicle = treatmentVehicle;
    }


    /**
     * Gets the treatmentVehicleVolume value for this PerformedSubstanceAdministration.
     * 
     * @return treatmentVehicleVolume The volume (and units) of treatment vehicle used.
 * 
 * For example, 10 miligrams, 2 mililiters, etc.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.PQ getTreatmentVehicleVolume() {
        return treatmentVehicleVolume;
    }


    /**
     * Sets the treatmentVehicleVolume value for this PerformedSubstanceAdministration.
     * 
     * @param treatmentVehicleVolume The volume (and units) of treatment vehicle used.
 * 
 * For example, 10 miligrams, 2 mililiters, etc.
     */
    public void setTreatmentVehicleVolume(gov.nih.nci.cabig.ccts.domain.cdt.PQ treatmentVehicleVolume) {
        this.treatmentVehicleVolume = treatmentVehicleVolume;
    }


    /**
     * Gets the studyAgent value for this PerformedSubstanceAdministration.
     * 
     * @return studyAgent
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.StudyAgent getStudyAgent() {
        return studyAgent;
    }


    /**
     * Sets the studyAgent value for this PerformedSubstanceAdministration.
     * 
     * @param studyAgent
     */
    public void setStudyAgent(gov.nih.nci.cabig.ccts.domain.bridg.StudyAgent studyAgent) {
        this.studyAgent = studyAgent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformedSubstanceAdministration)) return false;
        PerformedSubstanceAdministration other = (PerformedSubstanceAdministration) obj;
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
            ((this.doseChangeReason==null && other.getDoseChangeReason()==null) || 
             (this.doseChangeReason!=null &&
              this.doseChangeReason.equals(other.getDoseChangeReason()))) &&
            ((this.doseChangeType==null && other.getDoseChangeType()==null) || 
             (this.doseChangeType!=null &&
              this.doseChangeType.equals(other.getDoseChangeType()))) &&
            ((this.doseDescription==null && other.getDoseDescription()==null) || 
             (this.doseDescription!=null &&
              this.doseDescription.equals(other.getDoseDescription()))) &&
            ((this.doseForm==null && other.getDoseForm()==null) || 
             (this.doseForm!=null &&
              this.doseForm.equals(other.getDoseForm()))) &&
            ((this.doseFrequency==null && other.getDoseFrequency()==null) || 
             (this.doseFrequency!=null &&
              this.doseFrequency.equals(other.getDoseFrequency()))) &&
            ((this.doseModificationType==null && other.getDoseModificationType()==null) || 
             (this.doseModificationType!=null &&
              this.doseModificationType.equals(other.getDoseModificationType()))) &&
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
            ((this.substanceUseEndRelativeToReference==null && other.getSubstanceUseEndRelativeToReference()==null) || 
             (this.substanceUseEndRelativeToReference!=null &&
              this.substanceUseEndRelativeToReference.equals(other.getSubstanceUseEndRelativeToReference()))) &&
            ((this.substanceUseStartRelativeToReference==null && other.getSubstanceUseStartRelativeToReference()==null) || 
             (this.substanceUseStartRelativeToReference!=null &&
              this.substanceUseStartRelativeToReference.equals(other.getSubstanceUseStartRelativeToReference()))) &&
            ((this.treatment==null && other.getTreatment()==null) || 
             (this.treatment!=null &&
              this.treatment.equals(other.getTreatment()))) &&
            ((this.treatmentModifiedText==null && other.getTreatmentModifiedText()==null) || 
             (this.treatmentModifiedText!=null &&
              this.treatmentModifiedText.equals(other.getTreatmentModifiedText()))) &&
            ((this.treatmentVehicle==null && other.getTreatmentVehicle()==null) || 
             (this.treatmentVehicle!=null &&
              this.treatmentVehicle.equals(other.getTreatmentVehicle()))) &&
            ((this.treatmentVehicleVolume==null && other.getTreatmentVehicleVolume()==null) || 
             (this.treatmentVehicleVolume!=null &&
              this.treatmentVehicleVolume.equals(other.getTreatmentVehicleVolume()))) &&
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
        if (getDoseChangeReason() != null) {
            _hashCode += getDoseChangeReason().hashCode();
        }
        if (getDoseChangeType() != null) {
            _hashCode += getDoseChangeType().hashCode();
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
        if (getDoseModificationType() != null) {
            _hashCode += getDoseModificationType().hashCode();
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
        if (getSubstanceUseEndRelativeToReference() != null) {
            _hashCode += getSubstanceUseEndRelativeToReference().hashCode();
        }
        if (getSubstanceUseStartRelativeToReference() != null) {
            _hashCode += getSubstanceUseStartRelativeToReference().hashCode();
        }
        if (getTreatment() != null) {
            _hashCode += getTreatment().hashCode();
        }
        if (getTreatmentModifiedText() != null) {
            _hashCode += getTreatmentModifiedText().hashCode();
        }
        if (getTreatmentVehicle() != null) {
            _hashCode += getTreatmentVehicle().hashCode();
        }
        if (getTreatmentVehicleVolume() != null) {
            _hashCode += getTreatmentVehicleVolume().hashCode();
        }
        if (getStudyAgent() != null) {
            _hashCode += getStudyAgent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PerformedSubstanceAdministration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedSubstanceAdministration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dose");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "dose"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "PQ"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doseChangeReason");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "doseChangeReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doseChangeType");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "doseChangeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
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
        elemField.setFieldName("doseModificationType");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "doseModificationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
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
        elemField.setFieldName("substanceUseEndRelativeToReference");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "substanceUseEndRelativeToReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("substanceUseStartRelativeToReference");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "substanceUseStartRelativeToReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("treatment");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "treatment"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("treatmentModifiedText");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "treatmentModifiedText"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("treatmentVehicle");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "treatmentVehicle"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("treatmentVehicleVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "treatmentVehicleVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "PQ"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studyAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudyAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudyAgent"));
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
