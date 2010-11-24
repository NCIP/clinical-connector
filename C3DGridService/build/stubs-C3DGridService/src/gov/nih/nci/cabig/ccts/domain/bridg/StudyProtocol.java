/**
 * StudyProtocol.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * An action plan for a pre-clinical or clinical trial which defines
 * all activities planned to test a particular hypothesis that is the
 * basis of the trial regarding the effectiveness of a particular treatment,
 * drug, device, procedure, or care plan. This includes prevention, observational,
 * therapeutic, and other types of trials that involve subjects. 
 * 
 * NOTE: The StudyProtocol class encapsulates the semantics of two 'views'
 * of the single concept 'study.'  The name 'StudyProtocol' was chosen
 * to both disambiguate the somewhat overloaded term 'protocol,' as well
 * as to emphasize that the class has two important relationships to
 * the Documentation class, each of which emphasizes a different aspect
 * of the overall semantics of the StudyProtocol class:
 * 1). StudyProtocol is a sub-class of the Documentation class:
 * StudyProtocol is a sub-class of Documentation and, as such, inherits
 * all of the basic characteristics of its parent.  In particular, an
 * instance can contain all of the definitions, specifications, and content
 * of the various (logical) documents which collectively define a study,
 * including (but not limited to) documents that describe the objective(s),
 * background, and/or plan (including the design, methodology, statistical
 * considerations, organization, or other supplemental materials that
 * describe the required information of a Study.
 * 2). StudyProtocol is a collector for Documentation instances:
 * StudyProtocol is a collector for all of various artifacts (including
 * the protocol itself) which collectively define a study, including
 * (but not limited to) specifications of planned, scheduled, or performed
 * Activities, ObservationResults, Assessments, Analyses and their various
 * inter-relationships.
 * 
 * NOTE:  A StudyProtocol can be either Primary or Correlative.  A StudyProtocol
 * is considered to be Primary if it has one or more Correlative studies
 * associated with it.  A Correlative study extends the objectives or
 * observations/conclusions of a Primary study, enrolling the same (or
 * a subset of the same) subjects as were enrolled in the Primary study.
 * (Correlative Studies are not modeled in BRIDG yet.)
 * 
 * NOTE: We are assuming that a document is a container, which may be
 * physical or logical, with the six characteristics listed in the definition
 * of the Document class.  This class is the container for the Plan.
 * 
 * 
 * NOTE: StudyProtocol describes the pre-study, study, and post-study
 * portions of the plan.
 */
public class StudyProtocol  extends gov.nih.nci.cabig.ccts.domain.bridg.Document  implements java.io.Serializable {
    /** Specifies whether a protocol is blinded. */
    private gov.nih.nci.cabig.ccts.domain.cdt.BL blindedIndicator;
    /** The type of masking used on a trial to ensure that the results
 * are not biased by the subjects or investigators.
 * 
 * For example, double-blinded would indicate that both the investigator
 * and the participant would not know whether the intervention was a
 * placebo or an active therapeutic intervention. This will be drawn
 * from a coded list of terms that define the blinding type. 
 * 
 * For example, Open Label, Double Blind, Single Blind, etc.. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD blindingSchema;
    /** A code that controls the disclosure of information about this Document.
 * 
 * 
 * NOTE: This can be interpreted on a role-specific basis and therefore
 * can facilitate role-based access control strategies.  However it does
 * not specify them.  Likewise it does not specify masking or related
 * strategies but can be used to facilitate their implementation. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD confidentiality;
    /** Code to represent the condition that is the focus of the study.
 * 
 * 
 * For example, in a study to examine risk factors for Lupus, might have
 * as an inclusion criterion "healthy volunteer", but the target condition
 * code would be a Lupus SNOMED code. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD disease;
    /** Code to identify a type of protocol based upon its intent.
 * 
 * For example, treatment trials test new treatments, new combinations
 * of drugs, or new approaches to surgery or radiation therapy. Prevention
 * trials look for better ways to prevent disease in people who have
 * never had the disease or to prevent a disease from returning. These
 * approaches may include medicines, vitamins, vaccines, minerals, or
 * lifestyle changes. Diagnostic trials are conducted to find better
 * tests or procedures for diagnosing a particular disease or condition.
 * Screening trials test the best way to detect certain diseases or health
 * conditions. Quality of Life trials (or Supportive Care trials) explore
 * ways to improve comfort and the quality of life for individuals with
 * a chronic illness. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD intent;
    /** A coded value to represent the monitor for a protocol. 
 * 
 * For example,  Cancer Therapy Evaluation Program (CTEP), CTEP- Clinical
 * Trial Management System (CTMS) , CTEP- Clinical Data Update System
 * (CDUS) Complete, etc. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD monitor;
    /** Specifies whether a protocol is being conducted at more than one
 * site concurrently. */
    private gov.nih.nci.cabig.ccts.domain.cdt.BL multiInstitutionIndicator;
    /** Coded designation of phase for a clinical trial. 
 * 
 * For example, I, I/II, II, III, NA.
 * 
 * NOTE: Clinical trials are generally categorized into four (sometimes
 * five) phases described separately herein. An investigational medicine
 * or product may be evaluated in two or more phases simultaneously in
 * different trials, and some trials may overlap two different phases.
 * 
 * Phase 1: The initial introduction of an investigational new drug into
 * humans. Phase 1 studies are typically closely monitored and may be
 * conducted in patients or normal volunteer subjects.  
 * Phase 2: Controlled clinical studies conducted to evaluate the effectiveness
 * of the drug for a particular indication or indications in patients
 * with the disease or condition under study and to determine the common
 * short-term side effects and risks associated with the drug.
 * Phase 3: Studies are expanded controlled and uncontrolled trials.
 * They are performed after preliminary evidence suggesting effectiveness
 * of the drug has been obtained, and are intended to gather the additional
 * information about effectiveness and safety that is needed to evaluate
 * the overall benefit-risk relationship of the drug and to provide an
 * adequate basis for physician labeling. 
 * Phase 3b: Phase 3b studies are a sub category of phase 3 trials near
 * the time of approval to elicit additional findings.
 * Phase 4:  Concurrent with marketing approval, the Food and Drug Administration
 * (FDA) may seek agreement from the sponsor to conduct certain post-marketing
 * (phase 4) studies to delineate additional information about the drug's
 * risks, benefits, and optimal use. 
 * Phase 5: Post-marketing surveillance is sometimes referred to as Phase
 * 5. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD phase;
    /** A text summary of subject characteristics, including inclusion
 * and exclusion criteria and describes the population for which the
 * study may be generalized. 
 * 
 * NOTE: This would include all subgroups as well. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST populationDescription;
    /** Specifies whether a study is randomized. */
    private gov.nih.nci.cabig.ccts.domain.cdt.BL randomizedIndicator;
    /** The target entity of the study of investigation. 
 * 
 * For example, in a clinical trial, the subject type would be "human".
 * Other studies could involve animals (rats, mice). */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD subjectType;
    private gov.nih.nci.cabig.ccts.domain.bridg.Document[] document;
    private gov.nih.nci.cabig.ccts.domain.bridg.Event[] event;
    private gov.nih.nci.cabig.ccts.domain.bridg.StudySubject[] studySubject;

    public StudyProtocol() {
    }

    public StudyProtocol(
           gov.nih.nci.cabig.ccts.domain.cdt.BL blindedIndicator,
           gov.nih.nci.cabig.ccts.domain.cdt.CD blindingSchema,
           gov.nih.nci.cabig.ccts.domain.cdt.CD confidentiality,
           gov.nih.nci.cabig.ccts.domain.cdt.CD disease,
           gov.nih.nci.cabig.ccts.domain.bridg.Document[] document,
           gov.nih.nci.cabig.ccts.domain.bridg.Event[] event,
           gov.nih.nci.cabig.ccts.domain.cdt.CD intent,
           gov.nih.nci.cabig.ccts.domain.cdt.CD monitor,
           gov.nih.nci.cabig.ccts.domain.cdt.BL multiInstitutionIndicator,
           gov.nih.nci.cabig.ccts.domain.cdt.CD phase,
           gov.nih.nci.cabig.ccts.domain.cdt.ST populationDescription,
           gov.nih.nci.cabig.ccts.domain.cdt.BL randomizedIndicator,
           gov.nih.nci.cabig.ccts.domain.bridg.StudySubject[] studySubject,
           gov.nih.nci.cabig.ccts.domain.cdt.CD subjectType) {
           this.blindedIndicator = blindedIndicator;
           this.blindingSchema = blindingSchema;
           this.confidentiality = confidentiality;
           this.disease = disease;
           this.intent = intent;
           this.monitor = monitor;
           this.multiInstitutionIndicator = multiInstitutionIndicator;
           this.phase = phase;
           this.populationDescription = populationDescription;
           this.randomizedIndicator = randomizedIndicator;
           this.subjectType = subjectType;
           this.document = document;
           this.event = event;
           this.studySubject = studySubject;
    }


    /**
     * Gets the blindedIndicator value for this StudyProtocol.
     * 
     * @return blindedIndicator Specifies whether a protocol is blinded.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.BL getBlindedIndicator() {
        return blindedIndicator;
    }


    /**
     * Sets the blindedIndicator value for this StudyProtocol.
     * 
     * @param blindedIndicator Specifies whether a protocol is blinded.
     */
    public void setBlindedIndicator(gov.nih.nci.cabig.ccts.domain.cdt.BL blindedIndicator) {
        this.blindedIndicator = blindedIndicator;
    }


    /**
     * Gets the blindingSchema value for this StudyProtocol.
     * 
     * @return blindingSchema The type of masking used on a trial to ensure that the results
 * are not biased by the subjects or investigators.
 * 
 * For example, double-blinded would indicate that both the investigator
 * and the participant would not know whether the intervention was a
 * placebo or an active therapeutic intervention. This will be drawn
 * from a coded list of terms that define the blinding type. 
 * 
 * For example, Open Label, Double Blind, Single Blind, etc..
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getBlindingSchema() {
        return blindingSchema;
    }


    /**
     * Sets the blindingSchema value for this StudyProtocol.
     * 
     * @param blindingSchema The type of masking used on a trial to ensure that the results
 * are not biased by the subjects or investigators.
 * 
 * For example, double-blinded would indicate that both the investigator
 * and the participant would not know whether the intervention was a
 * placebo or an active therapeutic intervention. This will be drawn
 * from a coded list of terms that define the blinding type. 
 * 
 * For example, Open Label, Double Blind, Single Blind, etc..
     */
    public void setBlindingSchema(gov.nih.nci.cabig.ccts.domain.cdt.CD blindingSchema) {
        this.blindingSchema = blindingSchema;
    }


    /**
     * Gets the confidentiality value for this StudyProtocol.
     * 
     * @return confidentiality A code that controls the disclosure of information about this Document.
 * 
 * 
 * NOTE: This can be interpreted on a role-specific basis and therefore
 * can facilitate role-based access control strategies.  However it does
 * not specify them.  Likewise it does not specify masking or related
 * strategies but can be used to facilitate their implementation.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getConfidentiality() {
        return confidentiality;
    }


    /**
     * Sets the confidentiality value for this StudyProtocol.
     * 
     * @param confidentiality A code that controls the disclosure of information about this Document.
 * 
 * 
 * NOTE: This can be interpreted on a role-specific basis and therefore
 * can facilitate role-based access control strategies.  However it does
 * not specify them.  Likewise it does not specify masking or related
 * strategies but can be used to facilitate their implementation.
     */
    public void setConfidentiality(gov.nih.nci.cabig.ccts.domain.cdt.CD confidentiality) {
        this.confidentiality = confidentiality;
    }


    /**
     * Gets the disease value for this StudyProtocol.
     * 
     * @return disease Code to represent the condition that is the focus of the study.
 * 
 * 
 * For example, in a study to examine risk factors for Lupus, might have
 * as an inclusion criterion "healthy volunteer", but the target condition
 * code would be a Lupus SNOMED code.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getDisease() {
        return disease;
    }


    /**
     * Sets the disease value for this StudyProtocol.
     * 
     * @param disease Code to represent the condition that is the focus of the study.
 * 
 * 
 * For example, in a study to examine risk factors for Lupus, might have
 * as an inclusion criterion "healthy volunteer", but the target condition
 * code would be a Lupus SNOMED code.
     */
    public void setDisease(gov.nih.nci.cabig.ccts.domain.cdt.CD disease) {
        this.disease = disease;
    }


    /**
     * Gets the intent value for this StudyProtocol.
     * 
     * @return intent Code to identify a type of protocol based upon its intent.
 * 
 * For example, treatment trials test new treatments, new combinations
 * of drugs, or new approaches to surgery or radiation therapy. Prevention
 * trials look for better ways to prevent disease in people who have
 * never had the disease or to prevent a disease from returning. These
 * approaches may include medicines, vitamins, vaccines, minerals, or
 * lifestyle changes. Diagnostic trials are conducted to find better
 * tests or procedures for diagnosing a particular disease or condition.
 * Screening trials test the best way to detect certain diseases or health
 * conditions. Quality of Life trials (or Supportive Care trials) explore
 * ways to improve comfort and the quality of life for individuals with
 * a chronic illness.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getIntent() {
        return intent;
    }


    /**
     * Sets the intent value for this StudyProtocol.
     * 
     * @param intent Code to identify a type of protocol based upon its intent.
 * 
 * For example, treatment trials test new treatments, new combinations
 * of drugs, or new approaches to surgery or radiation therapy. Prevention
 * trials look for better ways to prevent disease in people who have
 * never had the disease or to prevent a disease from returning. These
 * approaches may include medicines, vitamins, vaccines, minerals, or
 * lifestyle changes. Diagnostic trials are conducted to find better
 * tests or procedures for diagnosing a particular disease or condition.
 * Screening trials test the best way to detect certain diseases or health
 * conditions. Quality of Life trials (or Supportive Care trials) explore
 * ways to improve comfort and the quality of life for individuals with
 * a chronic illness.
     */
    public void setIntent(gov.nih.nci.cabig.ccts.domain.cdt.CD intent) {
        this.intent = intent;
    }


    /**
     * Gets the monitor value for this StudyProtocol.
     * 
     * @return monitor A coded value to represent the monitor for a protocol. 
 * 
 * For example,  Cancer Therapy Evaluation Program (CTEP), CTEP- Clinical
 * Trial Management System (CTMS) , CTEP- Clinical Data Update System
 * (CDUS) Complete, etc.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getMonitor() {
        return monitor;
    }


    /**
     * Sets the monitor value for this StudyProtocol.
     * 
     * @param monitor A coded value to represent the monitor for a protocol. 
 * 
 * For example,  Cancer Therapy Evaluation Program (CTEP), CTEP- Clinical
 * Trial Management System (CTMS) , CTEP- Clinical Data Update System
 * (CDUS) Complete, etc.
     */
    public void setMonitor(gov.nih.nci.cabig.ccts.domain.cdt.CD monitor) {
        this.monitor = monitor;
    }


    /**
     * Gets the multiInstitutionIndicator value for this StudyProtocol.
     * 
     * @return multiInstitutionIndicator Specifies whether a protocol is being conducted at more than one
 * site concurrently.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.BL getMultiInstitutionIndicator() {
        return multiInstitutionIndicator;
    }


    /**
     * Sets the multiInstitutionIndicator value for this StudyProtocol.
     * 
     * @param multiInstitutionIndicator Specifies whether a protocol is being conducted at more than one
 * site concurrently.
     */
    public void setMultiInstitutionIndicator(gov.nih.nci.cabig.ccts.domain.cdt.BL multiInstitutionIndicator) {
        this.multiInstitutionIndicator = multiInstitutionIndicator;
    }


    /**
     * Gets the phase value for this StudyProtocol.
     * 
     * @return phase Coded designation of phase for a clinical trial. 
 * 
 * For example, I, I/II, II, III, NA.
 * 
 * NOTE: Clinical trials are generally categorized into four (sometimes
 * five) phases described separately herein. An investigational medicine
 * or product may be evaluated in two or more phases simultaneously in
 * different trials, and some trials may overlap two different phases.
 * 
 * Phase 1: The initial introduction of an investigational new drug into
 * humans. Phase 1 studies are typically closely monitored and may be
 * conducted in patients or normal volunteer subjects.  
 * Phase 2: Controlled clinical studies conducted to evaluate the effectiveness
 * of the drug for a particular indication or indications in patients
 * with the disease or condition under study and to determine the common
 * short-term side effects and risks associated with the drug.
 * Phase 3: Studies are expanded controlled and uncontrolled trials.
 * They are performed after preliminary evidence suggesting effectiveness
 * of the drug has been obtained, and are intended to gather the additional
 * information about effectiveness and safety that is needed to evaluate
 * the overall benefit-risk relationship of the drug and to provide an
 * adequate basis for physician labeling. 
 * Phase 3b: Phase 3b studies are a sub category of phase 3 trials near
 * the time of approval to elicit additional findings.
 * Phase 4:  Concurrent with marketing approval, the Food and Drug Administration
 * (FDA) may seek agreement from the sponsor to conduct certain post-marketing
 * (phase 4) studies to delineate additional information about the drug's
 * risks, benefits, and optimal use. 
 * Phase 5: Post-marketing surveillance is sometimes referred to as Phase
 * 5.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getPhase() {
        return phase;
    }


    /**
     * Sets the phase value for this StudyProtocol.
     * 
     * @param phase Coded designation of phase for a clinical trial. 
 * 
 * For example, I, I/II, II, III, NA.
 * 
 * NOTE: Clinical trials are generally categorized into four (sometimes
 * five) phases described separately herein. An investigational medicine
 * or product may be evaluated in two or more phases simultaneously in
 * different trials, and some trials may overlap two different phases.
 * 
 * Phase 1: The initial introduction of an investigational new drug into
 * humans. Phase 1 studies are typically closely monitored and may be
 * conducted in patients or normal volunteer subjects.  
 * Phase 2: Controlled clinical studies conducted to evaluate the effectiveness
 * of the drug for a particular indication or indications in patients
 * with the disease or condition under study and to determine the common
 * short-term side effects and risks associated with the drug.
 * Phase 3: Studies are expanded controlled and uncontrolled trials.
 * They are performed after preliminary evidence suggesting effectiveness
 * of the drug has been obtained, and are intended to gather the additional
 * information about effectiveness and safety that is needed to evaluate
 * the overall benefit-risk relationship of the drug and to provide an
 * adequate basis for physician labeling. 
 * Phase 3b: Phase 3b studies are a sub category of phase 3 trials near
 * the time of approval to elicit additional findings.
 * Phase 4:  Concurrent with marketing approval, the Food and Drug Administration
 * (FDA) may seek agreement from the sponsor to conduct certain post-marketing
 * (phase 4) studies to delineate additional information about the drug's
 * risks, benefits, and optimal use. 
 * Phase 5: Post-marketing surveillance is sometimes referred to as Phase
 * 5.
     */
    public void setPhase(gov.nih.nci.cabig.ccts.domain.cdt.CD phase) {
        this.phase = phase;
    }


    /**
     * Gets the populationDescription value for this StudyProtocol.
     * 
     * @return populationDescription A text summary of subject characteristics, including inclusion
 * and exclusion criteria and describes the population for which the
 * study may be generalized. 
 * 
 * NOTE: This would include all subgroups as well.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getPopulationDescription() {
        return populationDescription;
    }


    /**
     * Sets the populationDescription value for this StudyProtocol.
     * 
     * @param populationDescription A text summary of subject characteristics, including inclusion
 * and exclusion criteria and describes the population for which the
 * study may be generalized. 
 * 
 * NOTE: This would include all subgroups as well.
     */
    public void setPopulationDescription(gov.nih.nci.cabig.ccts.domain.cdt.ST populationDescription) {
        this.populationDescription = populationDescription;
    }


    /**
     * Gets the randomizedIndicator value for this StudyProtocol.
     * 
     * @return randomizedIndicator Specifies whether a study is randomized.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.BL getRandomizedIndicator() {
        return randomizedIndicator;
    }


    /**
     * Sets the randomizedIndicator value for this StudyProtocol.
     * 
     * @param randomizedIndicator Specifies whether a study is randomized.
     */
    public void setRandomizedIndicator(gov.nih.nci.cabig.ccts.domain.cdt.BL randomizedIndicator) {
        this.randomizedIndicator = randomizedIndicator;
    }


    /**
     * Gets the subjectType value for this StudyProtocol.
     * 
     * @return subjectType The target entity of the study of investigation. 
 * 
 * For example, in a clinical trial, the subject type would be "human".
 * Other studies could involve animals (rats, mice).
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getSubjectType() {
        return subjectType;
    }


    /**
     * Sets the subjectType value for this StudyProtocol.
     * 
     * @param subjectType The target entity of the study of investigation. 
 * 
 * For example, in a clinical trial, the subject type would be "human".
 * Other studies could involve animals (rats, mice).
     */
    public void setSubjectType(gov.nih.nci.cabig.ccts.domain.cdt.CD subjectType) {
        this.subjectType = subjectType;
    }


    /**
     * Gets the document value for this StudyProtocol.
     * 
     * @return document
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.Document[] getDocument() {
        return document;
    }


    /**
     * Sets the document value for this StudyProtocol.
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


    /**
     * Gets the event value for this StudyProtocol.
     * 
     * @return event
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.Event[] getEvent() {
        return event;
    }


    /**
     * Sets the event value for this StudyProtocol.
     * 
     * @param event
     */
    public void setEvent(gov.nih.nci.cabig.ccts.domain.bridg.Event[] event) {
        this.event = event;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.Event getEvent(int i) {
        return this.event[i];
    }

    public void setEvent(int i, gov.nih.nci.cabig.ccts.domain.bridg.Event _value) {
        this.event[i] = _value;
    }


    /**
     * Gets the studySubject value for this StudyProtocol.
     * 
     * @return studySubject
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.StudySubject[] getStudySubject() {
        return studySubject;
    }


    /**
     * Sets the studySubject value for this StudyProtocol.
     * 
     * @param studySubject
     */
    public void setStudySubject(gov.nih.nci.cabig.ccts.domain.bridg.StudySubject[] studySubject) {
        this.studySubject = studySubject;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.StudySubject getStudySubject(int i) {
        return this.studySubject[i];
    }

    public void setStudySubject(int i, gov.nih.nci.cabig.ccts.domain.bridg.StudySubject _value) {
        this.studySubject[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StudyProtocol)) return false;
        StudyProtocol other = (StudyProtocol) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.blindedIndicator==null && other.getBlindedIndicator()==null) || 
             (this.blindedIndicator!=null &&
              this.blindedIndicator.equals(other.getBlindedIndicator()))) &&
            ((this.blindingSchema==null && other.getBlindingSchema()==null) || 
             (this.blindingSchema!=null &&
              this.blindingSchema.equals(other.getBlindingSchema()))) &&
            ((this.confidentiality==null && other.getConfidentiality()==null) || 
             (this.confidentiality!=null &&
              this.confidentiality.equals(other.getConfidentiality()))) &&
            ((this.disease==null && other.getDisease()==null) || 
             (this.disease!=null &&
              this.disease.equals(other.getDisease()))) &&
            ((this.intent==null && other.getIntent()==null) || 
             (this.intent!=null &&
              this.intent.equals(other.getIntent()))) &&
            ((this.monitor==null && other.getMonitor()==null) || 
             (this.monitor!=null &&
              this.monitor.equals(other.getMonitor()))) &&
            ((this.multiInstitutionIndicator==null && other.getMultiInstitutionIndicator()==null) || 
             (this.multiInstitutionIndicator!=null &&
              this.multiInstitutionIndicator.equals(other.getMultiInstitutionIndicator()))) &&
            ((this.phase==null && other.getPhase()==null) || 
             (this.phase!=null &&
              this.phase.equals(other.getPhase()))) &&
            ((this.populationDescription==null && other.getPopulationDescription()==null) || 
             (this.populationDescription!=null &&
              this.populationDescription.equals(other.getPopulationDescription()))) &&
            ((this.randomizedIndicator==null && other.getRandomizedIndicator()==null) || 
             (this.randomizedIndicator!=null &&
              this.randomizedIndicator.equals(other.getRandomizedIndicator()))) &&
            ((this.subjectType==null && other.getSubjectType()==null) || 
             (this.subjectType!=null &&
              this.subjectType.equals(other.getSubjectType()))) &&
            ((this.document==null && other.getDocument()==null) || 
             (this.document!=null &&
              java.util.Arrays.equals(this.document, other.getDocument()))) &&
            ((this.event==null && other.getEvent()==null) || 
             (this.event!=null &&
              java.util.Arrays.equals(this.event, other.getEvent()))) &&
            ((this.studySubject==null && other.getStudySubject()==null) || 
             (this.studySubject!=null &&
              java.util.Arrays.equals(this.studySubject, other.getStudySubject())));
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
        if (getBlindedIndicator() != null) {
            _hashCode += getBlindedIndicator().hashCode();
        }
        if (getBlindingSchema() != null) {
            _hashCode += getBlindingSchema().hashCode();
        }
        if (getConfidentiality() != null) {
            _hashCode += getConfidentiality().hashCode();
        }
        if (getDisease() != null) {
            _hashCode += getDisease().hashCode();
        }
        if (getIntent() != null) {
            _hashCode += getIntent().hashCode();
        }
        if (getMonitor() != null) {
            _hashCode += getMonitor().hashCode();
        }
        if (getMultiInstitutionIndicator() != null) {
            _hashCode += getMultiInstitutionIndicator().hashCode();
        }
        if (getPhase() != null) {
            _hashCode += getPhase().hashCode();
        }
        if (getPopulationDescription() != null) {
            _hashCode += getPopulationDescription().hashCode();
        }
        if (getRandomizedIndicator() != null) {
            _hashCode += getRandomizedIndicator().hashCode();
        }
        if (getSubjectType() != null) {
            _hashCode += getSubjectType().hashCode();
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
        if (getEvent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEvent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEvent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStudySubject() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStudySubject());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStudySubject(), i);
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
        new org.apache.axis.description.TypeDesc(StudyProtocol.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudyProtocol"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blindedIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "blindedIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "BL"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blindingSchema");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "blindingSchema"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confidentiality");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "confidentiality"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disease");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "disease"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intent");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "intent"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monitor");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "monitor"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiInstitutionIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "multiInstitutionIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "BL"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phase");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "phase"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("populationDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "populationDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("randomizedIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "randomizedIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "BL"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjectType");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "subjectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("document");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Document"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Document"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("event");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Event"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Event"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studySubject");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudySubject"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudySubject"));
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
