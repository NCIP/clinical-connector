/**
 * StudyRelationship.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * An abstract class whose subtypes are the specific rules governing
 * the protocol design.
 */
public class StudyRelationship  implements java.io.Serializable {
    /** A code specifying when in the course of an Activity a precondition
 * for the Activity is evaluated (e.g., before the Activity starts for
 * the first time, before every repetition, after each repetition but
 * not before the first, or throughout the entire time of the Activity).
 * 
 * For example, at the end of the cycle, evaluate disease response, and
 * decide whether to administer another cycle. 
 * Before administering the daily dose, check the conditions for continuing
 * treatment, and continue only if those conditions are meant. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD checkpoint;
    /** Additional description of the relationship. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST comment;
    /** A code specifying the logical conjunction of the criteria among
 * all the condition-links of Activities (e.g., and, or, exclusive-or).
 * 
 * For example, fill out the "Liver event" report if the subject has
 * an ALT value > 3 times the upper limit of normal and a bilirubin value
 * > 1.5 times the upper limit of normal. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD conjunction;
    /** If true, associations in the parent Activity are conducted across
 * the StudyRelationship to the child Activity.
 * 
 * For example, a blood sample is taken pre-dose, and the measurements
 * made on that blood sample are considered pre-dose measurements. */
    private gov.nih.nci.cabig.ccts.domain.cdt.BL contextConductionIndicator;
    /** A code that specifies how this StudyRelationship contributes to
 * the context of the current Activity, and whether it may be propagated
 * to descendent Activities whose association allows such propagation
 * (see StudyRelationship.contextConductionIndicator). 
 * 
 * For example, a blood sample is taken pre-dose, and the measurements
 * made on that blood sample are considered pre-dose measurements. (If
 * "pre-dose" is an association with the activity "take blood sample",
 * and the results of analyses on that blood sample are "descendent activities",
 * then the contextControl and contextCondutionIndicator would be used
 * to show that the "pre-dose" association also applies to the results.) */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD contextControl;
    /** The text naming or otherwise describing a given relationship. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST description;
    /** A computable logical expression that can involve temporal, clinical,
 * and other operands.  It can be composed of sub expressions to create
 * arbitrarily complex and recursive statements.
 * 
 * For example, (<2 weeks> since <last dose >)  and (SysBP[now] > 140
 * and DiaBP [now]> 90)
 * 
 * Note that the data type of this attribute is CD, reflecting the ability
 * of the attribute to support the semantics of one or more distinct
 * grammars for building evaluable expressions, as well as the consequent
 * requirement that a system sending such an expression must identify
 * the source grammar (including its’ version) to ensure that the receiving
 * system parses the expression with the proper parser.  Thus, for example,
 * an evaluable expression in the ‘TDM Markup Language' (TDML) with the
 * form "IF X > 12 THEN ~ EPOCH --TO +3 D ``PREVIOUS EPOCH" would be
 * carried in the CD data type properties as follows:
 * 
 * Coding System:  TDML
 * Version:  1.1
 * Original Text:   If X is less than 12, change the current Epoch to
 * begin 3 days after the end of the previous Epoch
 * Code:  IF X > 12 THEN ~ EPOCH --TO +3 D ``PREVIOUS EPOCH */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST evaluableExpression;
    /** Specifies whether the StudyRelationship.type should be interpreted
 * as if the roles of the source and target Activities were reversed.
 * The inversion indicator is used when the meaning of StudyRelationship.type
 * must be reversed. 
 * 
 * For example, a blood sample for population Pharmacokinetics (PK) analysis
 * is drawn at Visit 4.  The dates and times of the most recent dose
 * of study drug are to be recorded.  (This might use inversion code,
 * since the drug concentration will depend on the preceding dose (dose
 * is source, concentration is target), but the collection of the dose
 * date/time is initiated when the blood sample is taken.) */
    private gov.nih.nci.cabig.ccts.domain.cdt.BL inversionIndicator;
    /** A code specifying how concurrent Activities are resynchronized
 * in a parallel branch construct.
 * 
 * For example, if the subject completes the XYZ questionnaire before
 * the lab results arrive, the review of adverse events and concomitant
 * medications may be conducted, but the physical examination should
 * not take place until the subject has completed the XYZ questionnaire
 * and the lab results have arrived. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD join;
    /** An indicator that asserts that the meaning of the link is negated.
 * 
 * For example, do not administer further study drug if the subject experiences
 * shortness of breath. */
    private gov.nih.nci.cabig.ccts.domain.cdt.BL negationIndicator;
    /** A quantity of time that should elapse between when an Activity
 * is ready for execution and the actual beginning of the execution.
 * 
 * 
 * For example, take a blood sample 15 minutes after administration of
 * study drug or measure blood glucose 2 hours after each meal. */
    private gov.nih.nci.cabig.ccts.domain.cdt.PQ pauseQuantity;
    /** An integer specifying the relative preference for considering this
 * relationship before other like-typed relationships having the same
 * source Activity. Relationships with lower priorityNumber values are
 * considered before and above those with higher values. 
 * 
 * For example, for multiple criteria, this specifies which criteria
 * are considered before others. For components with the same sequence
 * number, it specifies which ones are considered before others. Among
 * alternatives or options that are being chosen by humans, the priorityNumber
 * specifies preference.
 * Actions triggered by occurrence of a serious Adverse Event (AE) take
 * precedence over actions in the normal schedule of assessments & interventions. */
    private int priorityNumber;
    /** This attribute indicates whether or not the source Activity is
 * intended to be interpreted independently of the target Activity. The
 * indicator cannot prevent an individual or application from separating
 * the Activities, but indicates the author's desire and willingness
 * to attest to the content of the source Activity if separated from
 * the target Activity. Note that the default for this attribute will
 * typically be "TRUE". Also note that this attribute is orthogonal and
 * unrelated to the RIM's context/inheritance mechanism. If the context
 * of an Activity is propagated to nested Activities, it is assumed that
 * those nested Activities are not intended to be interpreted without
 * the propagated context.
 * 
 * For example, fhe normal range for blood glucose depends on whether
 * a subject was fasting when the blood sample was taken. */
    private gov.nih.nci.cabig.ccts.domain.cdt.BL separableIndicator;
    /** An integer specifying the relative sequential or temporal ordering
 * of this relationship among other like-types relationships having the
 * same source.
 * 
 * For example, in a StudyCell that has a chemotherapy StudySegment and
 * a radiotherapy StudySegment, the sequence number indicates which StudySegment
 * precedes the other.
 * 
 *  For example, in the Regulated Product Submission (RPS) Model this
 * determines the order the submission unit should be processed. If a
 * submission unit is received by the regulatory authority out of order,
 * the sequence number tells the regulatory authority the order the submission
 * units should be read.
 * 
 * For example, a protocol document is submission in the original submission.
 * In the first amendment that protocol document is withdrawn and the
 * second amendment the protocol document is reactivated. We know that
 * the protocol document should still be considered since the second
 * amendment has a greater sequence number.
 * 
 * For example, "Walking one block" is the 9th item of the "Activities"
 * section of the SF-36 questionnaire */
    private int sequenceNumber;
    /** A code specifying how branches in an action plan are selected among
 * other branches.
 * 
 * For example, ask the subject to complete the XYZ questionnaire while
 * the lab results are being run. The review of adverse events and concomitant
 * medications may be conducted at any time after the XYZ questionnaire
 * has been completed. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD split;
    /** Indicates that the target of the relationship will be a filtered
 * subset of the total related set of targets.  Used when there is a
 * need to limit the number of components to the first, the last, the
 * next, the total, the average or some other filtered or calculated
 * subset.
 * 
 * For example, the follow-up epoch starts 48 hours after the last dose
 * of study drug. Take a blood sample for Pharmacokinetics (PK) analysis
 * immediately prior to the 5th daily dose. */
    private java.lang.String subset;
    /** A coded value specifying the meaning and purpose of every relationship
 * instance. Each of its values implies specific constraints to what
 * kinds of objects can be related and in which way.
 * 
 * For example, component, sequel, attribution (cause and effect) would
 * be types of relationships that could be coded. Neutrophil count is
 * a component of complete blood count. 
 * The IV bag is weighed before and after the infusion. (sequel) 
 * Injection site swelling and redness are attributed to the injection.
 * (attribution) */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD type;

    public StudyRelationship() {
    }

    public StudyRelationship(
           gov.nih.nci.cabig.ccts.domain.cdt.CD checkpoint,
           gov.nih.nci.cabig.ccts.domain.cdt.ST comment,
           gov.nih.nci.cabig.ccts.domain.cdt.CD conjunction,
           gov.nih.nci.cabig.ccts.domain.cdt.BL contextConductionIndicator,
           gov.nih.nci.cabig.ccts.domain.cdt.CD contextControl,
           gov.nih.nci.cabig.ccts.domain.cdt.ST description,
           gov.nih.nci.cabig.ccts.domain.cdt.ST evaluableExpression,
           gov.nih.nci.cabig.ccts.domain.cdt.BL inversionIndicator,
           gov.nih.nci.cabig.ccts.domain.cdt.CD join,
           gov.nih.nci.cabig.ccts.domain.cdt.BL negationIndicator,
           gov.nih.nci.cabig.ccts.domain.cdt.PQ pauseQuantity,
           int priorityNumber,
           gov.nih.nci.cabig.ccts.domain.cdt.BL separableIndicator,
           int sequenceNumber,
           gov.nih.nci.cabig.ccts.domain.cdt.CD split,
           java.lang.String subset,
           gov.nih.nci.cabig.ccts.domain.cdt.CD type) {
           this.checkpoint = checkpoint;
           this.comment = comment;
           this.conjunction = conjunction;
           this.contextConductionIndicator = contextConductionIndicator;
           this.contextControl = contextControl;
           this.description = description;
           this.evaluableExpression = evaluableExpression;
           this.inversionIndicator = inversionIndicator;
           this.join = join;
           this.negationIndicator = negationIndicator;
           this.pauseQuantity = pauseQuantity;
           this.priorityNumber = priorityNumber;
           this.separableIndicator = separableIndicator;
           this.sequenceNumber = sequenceNumber;
           this.split = split;
           this.subset = subset;
           this.type = type;
    }


    /**
     * Gets the checkpoint value for this StudyRelationship.
     * 
     * @return checkpoint A code specifying when in the course of an Activity a precondition
 * for the Activity is evaluated (e.g., before the Activity starts for
 * the first time, before every repetition, after each repetition but
 * not before the first, or throughout the entire time of the Activity).
 * 
 * For example, at the end of the cycle, evaluate disease response, and
 * decide whether to administer another cycle. 
 * Before administering the daily dose, check the conditions for continuing
 * treatment, and continue only if those conditions are meant.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getCheckpoint() {
        return checkpoint;
    }


    /**
     * Sets the checkpoint value for this StudyRelationship.
     * 
     * @param checkpoint A code specifying when in the course of an Activity a precondition
 * for the Activity is evaluated (e.g., before the Activity starts for
 * the first time, before every repetition, after each repetition but
 * not before the first, or throughout the entire time of the Activity).
 * 
 * For example, at the end of the cycle, evaluate disease response, and
 * decide whether to administer another cycle. 
 * Before administering the daily dose, check the conditions for continuing
 * treatment, and continue only if those conditions are meant.
     */
    public void setCheckpoint(gov.nih.nci.cabig.ccts.domain.cdt.CD checkpoint) {
        this.checkpoint = checkpoint;
    }


    /**
     * Gets the comment value for this StudyRelationship.
     * 
     * @return comment Additional description of the relationship.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this StudyRelationship.
     * 
     * @param comment Additional description of the relationship.
     */
    public void setComment(gov.nih.nci.cabig.ccts.domain.cdt.ST comment) {
        this.comment = comment;
    }


    /**
     * Gets the conjunction value for this StudyRelationship.
     * 
     * @return conjunction A code specifying the logical conjunction of the criteria among
 * all the condition-links of Activities (e.g., and, or, exclusive-or).
 * 
 * For example, fill out the "Liver event" report if the subject has
 * an ALT value > 3 times the upper limit of normal and a bilirubin value
 * > 1.5 times the upper limit of normal.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getConjunction() {
        return conjunction;
    }


    /**
     * Sets the conjunction value for this StudyRelationship.
     * 
     * @param conjunction A code specifying the logical conjunction of the criteria among
 * all the condition-links of Activities (e.g., and, or, exclusive-or).
 * 
 * For example, fill out the "Liver event" report if the subject has
 * an ALT value > 3 times the upper limit of normal and a bilirubin value
 * > 1.5 times the upper limit of normal.
     */
    public void setConjunction(gov.nih.nci.cabig.ccts.domain.cdt.CD conjunction) {
        this.conjunction = conjunction;
    }


    /**
     * Gets the contextConductionIndicator value for this StudyRelationship.
     * 
     * @return contextConductionIndicator If true, associations in the parent Activity are conducted across
 * the StudyRelationship to the child Activity.
 * 
 * For example, a blood sample is taken pre-dose, and the measurements
 * made on that blood sample are considered pre-dose measurements.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.BL getContextConductionIndicator() {
        return contextConductionIndicator;
    }


    /**
     * Sets the contextConductionIndicator value for this StudyRelationship.
     * 
     * @param contextConductionIndicator If true, associations in the parent Activity are conducted across
 * the StudyRelationship to the child Activity.
 * 
 * For example, a blood sample is taken pre-dose, and the measurements
 * made on that blood sample are considered pre-dose measurements.
     */
    public void setContextConductionIndicator(gov.nih.nci.cabig.ccts.domain.cdt.BL contextConductionIndicator) {
        this.contextConductionIndicator = contextConductionIndicator;
    }


    /**
     * Gets the contextControl value for this StudyRelationship.
     * 
     * @return contextControl A code that specifies how this StudyRelationship contributes to
 * the context of the current Activity, and whether it may be propagated
 * to descendent Activities whose association allows such propagation
 * (see StudyRelationship.contextConductionIndicator). 
 * 
 * For example, a blood sample is taken pre-dose, and the measurements
 * made on that blood sample are considered pre-dose measurements. (If
 * "pre-dose" is an association with the activity "take blood sample",
 * and the results of analyses on that blood sample are "descendent activities",
 * then the contextControl and contextCondutionIndicator would be used
 * to show that the "pre-dose" association also applies to the results.)
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getContextControl() {
        return contextControl;
    }


    /**
     * Sets the contextControl value for this StudyRelationship.
     * 
     * @param contextControl A code that specifies how this StudyRelationship contributes to
 * the context of the current Activity, and whether it may be propagated
 * to descendent Activities whose association allows such propagation
 * (see StudyRelationship.contextConductionIndicator). 
 * 
 * For example, a blood sample is taken pre-dose, and the measurements
 * made on that blood sample are considered pre-dose measurements. (If
 * "pre-dose" is an association with the activity "take blood sample",
 * and the results of analyses on that blood sample are "descendent activities",
 * then the contextControl and contextCondutionIndicator would be used
 * to show that the "pre-dose" association also applies to the results.)
     */
    public void setContextControl(gov.nih.nci.cabig.ccts.domain.cdt.CD contextControl) {
        this.contextControl = contextControl;
    }


    /**
     * Gets the description value for this StudyRelationship.
     * 
     * @return description The text naming or otherwise describing a given relationship.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getDescription() {
        return description;
    }


    /**
     * Sets the description value for this StudyRelationship.
     * 
     * @param description The text naming or otherwise describing a given relationship.
     */
    public void setDescription(gov.nih.nci.cabig.ccts.domain.cdt.ST description) {
        this.description = description;
    }


    /**
     * Gets the evaluableExpression value for this StudyRelationship.
     * 
     * @return evaluableExpression A computable logical expression that can involve temporal, clinical,
 * and other operands.  It can be composed of sub expressions to create
 * arbitrarily complex and recursive statements.
 * 
 * For example, (<2 weeks> since <last dose >)  and (SysBP[now] > 140
 * and DiaBP [now]> 90)
 * 
 * Note that the data type of this attribute is CD, reflecting the ability
 * of the attribute to support the semantics of one or more distinct
 * grammars for building evaluable expressions, as well as the consequent
 * requirement that a system sending such an expression must identify
 * the source grammar (including its’ version) to ensure that the receiving
 * system parses the expression with the proper parser.  Thus, for example,
 * an evaluable expression in the ‘TDM Markup Language' (TDML) with the
 * form "IF X > 12 THEN ~ EPOCH --TO +3 D ``PREVIOUS EPOCH" would be
 * carried in the CD data type properties as follows:
 * 
 * Coding System:  TDML
 * Version:  1.1
 * Original Text:   If X is less than 12, change the current Epoch to
 * begin 3 days after the end of the previous Epoch
 * Code:  IF X > 12 THEN ~ EPOCH --TO +3 D ``PREVIOUS EPOCH
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getEvaluableExpression() {
        return evaluableExpression;
    }


    /**
     * Sets the evaluableExpression value for this StudyRelationship.
     * 
     * @param evaluableExpression A computable logical expression that can involve temporal, clinical,
 * and other operands.  It can be composed of sub expressions to create
 * arbitrarily complex and recursive statements.
 * 
 * For example, (<2 weeks> since <last dose >)  and (SysBP[now] > 140
 * and DiaBP [now]> 90)
 * 
 * Note that the data type of this attribute is CD, reflecting the ability
 * of the attribute to support the semantics of one or more distinct
 * grammars for building evaluable expressions, as well as the consequent
 * requirement that a system sending such an expression must identify
 * the source grammar (including its’ version) to ensure that the receiving
 * system parses the expression with the proper parser.  Thus, for example,
 * an evaluable expression in the ‘TDM Markup Language' (TDML) with the
 * form "IF X > 12 THEN ~ EPOCH --TO +3 D ``PREVIOUS EPOCH" would be
 * carried in the CD data type properties as follows:
 * 
 * Coding System:  TDML
 * Version:  1.1
 * Original Text:   If X is less than 12, change the current Epoch to
 * begin 3 days after the end of the previous Epoch
 * Code:  IF X > 12 THEN ~ EPOCH --TO +3 D ``PREVIOUS EPOCH
     */
    public void setEvaluableExpression(gov.nih.nci.cabig.ccts.domain.cdt.ST evaluableExpression) {
        this.evaluableExpression = evaluableExpression;
    }


    /**
     * Gets the inversionIndicator value for this StudyRelationship.
     * 
     * @return inversionIndicator Specifies whether the StudyRelationship.type should be interpreted
 * as if the roles of the source and target Activities were reversed.
 * The inversion indicator is used when the meaning of StudyRelationship.type
 * must be reversed. 
 * 
 * For example, a blood sample for population Pharmacokinetics (PK) analysis
 * is drawn at Visit 4.  The dates and times of the most recent dose
 * of study drug are to be recorded.  (This might use inversion code,
 * since the drug concentration will depend on the preceding dose (dose
 * is source, concentration is target), but the collection of the dose
 * date/time is initiated when the blood sample is taken.)
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.BL getInversionIndicator() {
        return inversionIndicator;
    }


    /**
     * Sets the inversionIndicator value for this StudyRelationship.
     * 
     * @param inversionIndicator Specifies whether the StudyRelationship.type should be interpreted
 * as if the roles of the source and target Activities were reversed.
 * The inversion indicator is used when the meaning of StudyRelationship.type
 * must be reversed. 
 * 
 * For example, a blood sample for population Pharmacokinetics (PK) analysis
 * is drawn at Visit 4.  The dates and times of the most recent dose
 * of study drug are to be recorded.  (This might use inversion code,
 * since the drug concentration will depend on the preceding dose (dose
 * is source, concentration is target), but the collection of the dose
 * date/time is initiated when the blood sample is taken.)
     */
    public void setInversionIndicator(gov.nih.nci.cabig.ccts.domain.cdt.BL inversionIndicator) {
        this.inversionIndicator = inversionIndicator;
    }


    /**
     * Gets the join value for this StudyRelationship.
     * 
     * @return join A code specifying how concurrent Activities are resynchronized
 * in a parallel branch construct.
 * 
 * For example, if the subject completes the XYZ questionnaire before
 * the lab results arrive, the review of adverse events and concomitant
 * medications may be conducted, but the physical examination should
 * not take place until the subject has completed the XYZ questionnaire
 * and the lab results have arrived.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getJoin() {
        return join;
    }


    /**
     * Sets the join value for this StudyRelationship.
     * 
     * @param join A code specifying how concurrent Activities are resynchronized
 * in a parallel branch construct.
 * 
 * For example, if the subject completes the XYZ questionnaire before
 * the lab results arrive, the review of adverse events and concomitant
 * medications may be conducted, but the physical examination should
 * not take place until the subject has completed the XYZ questionnaire
 * and the lab results have arrived.
     */
    public void setJoin(gov.nih.nci.cabig.ccts.domain.cdt.CD join) {
        this.join = join;
    }


    /**
     * Gets the negationIndicator value for this StudyRelationship.
     * 
     * @return negationIndicator An indicator that asserts that the meaning of the link is negated.
 * 
 * For example, do not administer further study drug if the subject experiences
 * shortness of breath.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.BL getNegationIndicator() {
        return negationIndicator;
    }


    /**
     * Sets the negationIndicator value for this StudyRelationship.
     * 
     * @param negationIndicator An indicator that asserts that the meaning of the link is negated.
 * 
 * For example, do not administer further study drug if the subject experiences
 * shortness of breath.
     */
    public void setNegationIndicator(gov.nih.nci.cabig.ccts.domain.cdt.BL negationIndicator) {
        this.negationIndicator = negationIndicator;
    }


    /**
     * Gets the pauseQuantity value for this StudyRelationship.
     * 
     * @return pauseQuantity A quantity of time that should elapse between when an Activity
 * is ready for execution and the actual beginning of the execution.
 * 
 * 
 * For example, take a blood sample 15 minutes after administration of
 * study drug or measure blood glucose 2 hours after each meal.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.PQ getPauseQuantity() {
        return pauseQuantity;
    }


    /**
     * Sets the pauseQuantity value for this StudyRelationship.
     * 
     * @param pauseQuantity A quantity of time that should elapse between when an Activity
 * is ready for execution and the actual beginning of the execution.
 * 
 * 
 * For example, take a blood sample 15 minutes after administration of
 * study drug or measure blood glucose 2 hours after each meal.
     */
    public void setPauseQuantity(gov.nih.nci.cabig.ccts.domain.cdt.PQ pauseQuantity) {
        this.pauseQuantity = pauseQuantity;
    }


    /**
     * Gets the priorityNumber value for this StudyRelationship.
     * 
     * @return priorityNumber An integer specifying the relative preference for considering this
 * relationship before other like-typed relationships having the same
 * source Activity. Relationships with lower priorityNumber values are
 * considered before and above those with higher values. 
 * 
 * For example, for multiple criteria, this specifies which criteria
 * are considered before others. For components with the same sequence
 * number, it specifies which ones are considered before others. Among
 * alternatives or options that are being chosen by humans, the priorityNumber
 * specifies preference.
 * Actions triggered by occurrence of a serious Adverse Event (AE) take
 * precedence over actions in the normal schedule of assessments & interventions.
     */
    public int getPriorityNumber() {
        return priorityNumber;
    }


    /**
     * Sets the priorityNumber value for this StudyRelationship.
     * 
     * @param priorityNumber An integer specifying the relative preference for considering this
 * relationship before other like-typed relationships having the same
 * source Activity. Relationships with lower priorityNumber values are
 * considered before and above those with higher values. 
 * 
 * For example, for multiple criteria, this specifies which criteria
 * are considered before others. For components with the same sequence
 * number, it specifies which ones are considered before others. Among
 * alternatives or options that are being chosen by humans, the priorityNumber
 * specifies preference.
 * Actions triggered by occurrence of a serious Adverse Event (AE) take
 * precedence over actions in the normal schedule of assessments & interventions.
     */
    public void setPriorityNumber(int priorityNumber) {
        this.priorityNumber = priorityNumber;
    }


    /**
     * Gets the separableIndicator value for this StudyRelationship.
     * 
     * @return separableIndicator This attribute indicates whether or not the source Activity is
 * intended to be interpreted independently of the target Activity. The
 * indicator cannot prevent an individual or application from separating
 * the Activities, but indicates the author's desire and willingness
 * to attest to the content of the source Activity if separated from
 * the target Activity. Note that the default for this attribute will
 * typically be "TRUE". Also note that this attribute is orthogonal and
 * unrelated to the RIM's context/inheritance mechanism. If the context
 * of an Activity is propagated to nested Activities, it is assumed that
 * those nested Activities are not intended to be interpreted without
 * the propagated context.
 * 
 * For example, fhe normal range for blood glucose depends on whether
 * a subject was fasting when the blood sample was taken.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.BL getSeparableIndicator() {
        return separableIndicator;
    }


    /**
     * Sets the separableIndicator value for this StudyRelationship.
     * 
     * @param separableIndicator This attribute indicates whether or not the source Activity is
 * intended to be interpreted independently of the target Activity. The
 * indicator cannot prevent an individual or application from separating
 * the Activities, but indicates the author's desire and willingness
 * to attest to the content of the source Activity if separated from
 * the target Activity. Note that the default for this attribute will
 * typically be "TRUE". Also note that this attribute is orthogonal and
 * unrelated to the RIM's context/inheritance mechanism. If the context
 * of an Activity is propagated to nested Activities, it is assumed that
 * those nested Activities are not intended to be interpreted without
 * the propagated context.
 * 
 * For example, fhe normal range for blood glucose depends on whether
 * a subject was fasting when the blood sample was taken.
     */
    public void setSeparableIndicator(gov.nih.nci.cabig.ccts.domain.cdt.BL separableIndicator) {
        this.separableIndicator = separableIndicator;
    }


    /**
     * Gets the sequenceNumber value for this StudyRelationship.
     * 
     * @return sequenceNumber An integer specifying the relative sequential or temporal ordering
 * of this relationship among other like-types relationships having the
 * same source.
 * 
 * For example, in a StudyCell that has a chemotherapy StudySegment and
 * a radiotherapy StudySegment, the sequence number indicates which StudySegment
 * precedes the other.
 * 
 *  For example, in the Regulated Product Submission (RPS) Model this
 * determines the order the submission unit should be processed. If a
 * submission unit is received by the regulatory authority out of order,
 * the sequence number tells the regulatory authority the order the submission
 * units should be read.
 * 
 * For example, a protocol document is submission in the original submission.
 * In the first amendment that protocol document is withdrawn and the
 * second amendment the protocol document is reactivated. We know that
 * the protocol document should still be considered since the second
 * amendment has a greater sequence number.
 * 
 * For example, "Walking one block" is the 9th item of the "Activities"
 * section of the SF-36 questionnaire
     */
    public int getSequenceNumber() {
        return sequenceNumber;
    }


    /**
     * Sets the sequenceNumber value for this StudyRelationship.
     * 
     * @param sequenceNumber An integer specifying the relative sequential or temporal ordering
 * of this relationship among other like-types relationships having the
 * same source.
 * 
 * For example, in a StudyCell that has a chemotherapy StudySegment and
 * a radiotherapy StudySegment, the sequence number indicates which StudySegment
 * precedes the other.
 * 
 *  For example, in the Regulated Product Submission (RPS) Model this
 * determines the order the submission unit should be processed. If a
 * submission unit is received by the regulatory authority out of order,
 * the sequence number tells the regulatory authority the order the submission
 * units should be read.
 * 
 * For example, a protocol document is submission in the original submission.
 * In the first amendment that protocol document is withdrawn and the
 * second amendment the protocol document is reactivated. We know that
 * the protocol document should still be considered since the second
 * amendment has a greater sequence number.
 * 
 * For example, "Walking one block" is the 9th item of the "Activities"
 * section of the SF-36 questionnaire
     */
    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }


    /**
     * Gets the split value for this StudyRelationship.
     * 
     * @return split A code specifying how branches in an action plan are selected among
 * other branches.
 * 
 * For example, ask the subject to complete the XYZ questionnaire while
 * the lab results are being run. The review of adverse events and concomitant
 * medications may be conducted at any time after the XYZ questionnaire
 * has been completed.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getSplit() {
        return split;
    }


    /**
     * Sets the split value for this StudyRelationship.
     * 
     * @param split A code specifying how branches in an action plan are selected among
 * other branches.
 * 
 * For example, ask the subject to complete the XYZ questionnaire while
 * the lab results are being run. The review of adverse events and concomitant
 * medications may be conducted at any time after the XYZ questionnaire
 * has been completed.
     */
    public void setSplit(gov.nih.nci.cabig.ccts.domain.cdt.CD split) {
        this.split = split;
    }


    /**
     * Gets the subset value for this StudyRelationship.
     * 
     * @return subset Indicates that the target of the relationship will be a filtered
 * subset of the total related set of targets.  Used when there is a
 * need to limit the number of components to the first, the last, the
 * next, the total, the average or some other filtered or calculated
 * subset.
 * 
 * For example, the follow-up epoch starts 48 hours after the last dose
 * of study drug. Take a blood sample for Pharmacokinetics (PK) analysis
 * immediately prior to the 5th daily dose.
     */
    public java.lang.String getSubset() {
        return subset;
    }


    /**
     * Sets the subset value for this StudyRelationship.
     * 
     * @param subset Indicates that the target of the relationship will be a filtered
 * subset of the total related set of targets.  Used when there is a
 * need to limit the number of components to the first, the last, the
 * next, the total, the average or some other filtered or calculated
 * subset.
 * 
 * For example, the follow-up epoch starts 48 hours after the last dose
 * of study drug. Take a blood sample for Pharmacokinetics (PK) analysis
 * immediately prior to the 5th daily dose.
     */
    public void setSubset(java.lang.String subset) {
        this.subset = subset;
    }


    /**
     * Gets the type value for this StudyRelationship.
     * 
     * @return type A coded value specifying the meaning and purpose of every relationship
 * instance. Each of its values implies specific constraints to what
 * kinds of objects can be related and in which way.
 * 
 * For example, component, sequel, attribution (cause and effect) would
 * be types of relationships that could be coded. Neutrophil count is
 * a component of complete blood count. 
 * The IV bag is weighed before and after the infusion. (sequel) 
 * Injection site swelling and redness are attributed to the injection.
 * (attribution)
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getType() {
        return type;
    }


    /**
     * Sets the type value for this StudyRelationship.
     * 
     * @param type A coded value specifying the meaning and purpose of every relationship
 * instance. Each of its values implies specific constraints to what
 * kinds of objects can be related and in which way.
 * 
 * For example, component, sequel, attribution (cause and effect) would
 * be types of relationships that could be coded. Neutrophil count is
 * a component of complete blood count. 
 * The IV bag is weighed before and after the infusion. (sequel) 
 * Injection site swelling and redness are attributed to the injection.
 * (attribution)
     */
    public void setType(gov.nih.nci.cabig.ccts.domain.cdt.CD type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StudyRelationship)) return false;
        StudyRelationship other = (StudyRelationship) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.checkpoint==null && other.getCheckpoint()==null) || 
             (this.checkpoint!=null &&
              this.checkpoint.equals(other.getCheckpoint()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.conjunction==null && other.getConjunction()==null) || 
             (this.conjunction!=null &&
              this.conjunction.equals(other.getConjunction()))) &&
            ((this.contextConductionIndicator==null && other.getContextConductionIndicator()==null) || 
             (this.contextConductionIndicator!=null &&
              this.contextConductionIndicator.equals(other.getContextConductionIndicator()))) &&
            ((this.contextControl==null && other.getContextControl()==null) || 
             (this.contextControl!=null &&
              this.contextControl.equals(other.getContextControl()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.evaluableExpression==null && other.getEvaluableExpression()==null) || 
             (this.evaluableExpression!=null &&
              this.evaluableExpression.equals(other.getEvaluableExpression()))) &&
            ((this.inversionIndicator==null && other.getInversionIndicator()==null) || 
             (this.inversionIndicator!=null &&
              this.inversionIndicator.equals(other.getInversionIndicator()))) &&
            ((this.join==null && other.getJoin()==null) || 
             (this.join!=null &&
              this.join.equals(other.getJoin()))) &&
            ((this.negationIndicator==null && other.getNegationIndicator()==null) || 
             (this.negationIndicator!=null &&
              this.negationIndicator.equals(other.getNegationIndicator()))) &&
            ((this.pauseQuantity==null && other.getPauseQuantity()==null) || 
             (this.pauseQuantity!=null &&
              this.pauseQuantity.equals(other.getPauseQuantity()))) &&
            this.priorityNumber == other.getPriorityNumber() &&
            ((this.separableIndicator==null && other.getSeparableIndicator()==null) || 
             (this.separableIndicator!=null &&
              this.separableIndicator.equals(other.getSeparableIndicator()))) &&
            this.sequenceNumber == other.getSequenceNumber() &&
            ((this.split==null && other.getSplit()==null) || 
             (this.split!=null &&
              this.split.equals(other.getSplit()))) &&
            ((this.subset==null && other.getSubset()==null) || 
             (this.subset!=null &&
              this.subset.equals(other.getSubset()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getCheckpoint() != null) {
            _hashCode += getCheckpoint().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getConjunction() != null) {
            _hashCode += getConjunction().hashCode();
        }
        if (getContextConductionIndicator() != null) {
            _hashCode += getContextConductionIndicator().hashCode();
        }
        if (getContextControl() != null) {
            _hashCode += getContextControl().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEvaluableExpression() != null) {
            _hashCode += getEvaluableExpression().hashCode();
        }
        if (getInversionIndicator() != null) {
            _hashCode += getInversionIndicator().hashCode();
        }
        if (getJoin() != null) {
            _hashCode += getJoin().hashCode();
        }
        if (getNegationIndicator() != null) {
            _hashCode += getNegationIndicator().hashCode();
        }
        if (getPauseQuantity() != null) {
            _hashCode += getPauseQuantity().hashCode();
        }
        _hashCode += getPriorityNumber();
        if (getSeparableIndicator() != null) {
            _hashCode += getSeparableIndicator().hashCode();
        }
        _hashCode += getSequenceNumber();
        if (getSplit() != null) {
            _hashCode += getSplit().hashCode();
        }
        if (getSubset() != null) {
            _hashCode += getSubset().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StudyRelationship.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "StudyRelationship"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "checkpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conjunction");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "conjunction"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contextConductionIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "contextConductionIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "BL"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contextControl");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "contextControl"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evaluableExpression");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "evaluableExpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inversionIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "inversionIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "BL"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("join");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "join"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negationIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "negationIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "BL"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pauseQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "pauseQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "PQ"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "priorityNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("separableIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "separableIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "BL"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "sequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("split");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "split"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subset");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "subset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
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
