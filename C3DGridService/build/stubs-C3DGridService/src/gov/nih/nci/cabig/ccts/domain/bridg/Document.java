/**
 * Document.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A collection of data. A document can be either physical or logical.
 * In either case, it has the following characteristics: 1) Stewardship,
 * 2) Potential for authentication, 3) Wholeness, 4) Human readability,
 * 5) Persistence, 6) Global vs local context (the person that signs
 * it is the author of all sections unless otherwise noted).  This class
 * is an abstract concept that contains attributes common to all types
 * of study documents. 
 * 
 * For example, in the Regulated Product Submission (RPS) Model , regulatory
 * processes require the submission of documents from the Applicant to
 * the Regulatory Authority. These documents are varied in focus and
 * are often defined by the field of study or by the regulatory application
 * requirements of the region or Regulatory Authority (e.g., Integrated
 * Summary of Safety, Pharmacokinetics Written Summary).
 */
public class Document  implements java.io.Serializable {
    /** Text which is a full or comprehensive narrative/explanation. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST detailedDescription;
    /** A code that uniquely identifies a documentation. A particular documentation
 * can have one or more ID.
 * 
 * For example,  an identifier assigned by some organization in the context
 * of a study, for example, sponsor protocol number, national number,
 * cooperative group protocol number, CDISC protocol identifying number.
 * 
 * 
 * For example, in the Regulated Product Submission (RPS) message, this
 * identifies the file (with a Uniform Resource Identifier (URI)), which
 * is part of the documentation. A URI is a compact string of characters
 * used to identify or name a resource. The main purpose of this identification
 * is to enable interaction with representations of the resource over
 * a network, typically the World Wide Web, using specific protocols.
 * URIs are defined in schemes defining a specific syntax and associated
 * protocols. */
    private gov.nih.nci.cabig.ccts.domain.cdt.II[] identifier;
    /** For character based information the language property specifies
 * the human language of the text. This would be selected from a list
 * of possible languages. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD language;
    /** A string or code which identifies a given collection of content
 * of a documentation at a point in time. 
 * 
 * For example, over time, there may be multiple changes to a documentation,
 * and the revision allows an individual to capture relationships between
 * changes in the instances of a documentation over time. There can be
 * a new revision every time the content changes. 
 * 
 * For example, in RPS this could be operationalized as follows: The
 * version number would be an integer starting at '1' and incrementing
 * by 1. The first instance or original report should always be valued
 * as '1'. The version number value must be incremented by one when a
 * report is replaced, but can also be incremented more often to meet
 * local requirements. 
 * 
 * Different versions of the same document belong to the same documentation
 * group. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST revision;
    /** The status is an attribute that defines the various states that
 * a documentation can exist in. 
 * 
 * For example, in RPS, the status of the documentation is either active
 * or obsolete. This is used to determine if the documentation should
 * be considered as part of the regulatory decision.
 * 
 * Other documentations could have other status -- pending, under review,
 * signed, submitted, etc. These are specific to particular state diagrams
 * used to support a particular use case. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD status;
    /** The date range for when this particular status becomes active and
 * when it is no longer considered active, enforceable, relevant, etc..
 * 
 * For example, in protocol, the effective date may be the date of IRB
 * approval of the initial protocol version; the date the IRB Chair signs
 * off on a protocol and patient enrollment can begin. */
    private gov.nih.nci.cabig.ccts.domain.cdt.IVLTS statusDateRange;
    /** Contains name value pairs that are used within the context of an
 * application.  Each subtype/keyword is an item of information that
 * provides context for the documentation.  Keywords are used only to
 * further define the context of documentation, and the keywords, by
 * themselves, have no intrinsic value. 
 * 
 * Only certain types of documentation, as defined by the codes, can
 * be further defined by keywords.
 * 
 * Subtypes/keywords can also be defined in other coding systems. In
 * those cases a subtype/keyword would not have to be created, the logical
 * document would point directly to the other coding system.
 * 
 * For example, species, indication, manufacturer, biocompatibility,
 * facility, drug substance, drug product. Each one of these are associated
 * with a type code. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD[] subtype;
    /** Text which abstracts the salient information from the detailedDescription. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST summaryDescription;
    /** Text which abstracts the salient information from the summaryDescription. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST synopsis;
    /** The briefest description of the content of the documentation. 
 * 
 * For example, Descriptive text used to represent the long title or
 * name of a protocol.
 * 
 * For example, the title of a protocol limited to 30 characters in length.
 * 
 * For example, "protocol", "benchmark test" would be examples of titles
 * for documentation. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST title;
    /** A string or code that identifies a general class or category of
 * documents, for example, amendment, background material, guide, etc.
 * 
 * For example, in RPS, this is the code that specifies how the file
 * is to be used within the submission process (e.g. Protocol, Summary
 * Introduction).
 * 
 * For example, a RegulatoryRecord - A document that meets a record requirement
 * of a regulatory authority and must be retained in accordance with
 * that agency’s records retention requirements.  Example: Data Clarification
 * Form (DCF) */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD type;
    private gov.nih.nci.cabig.ccts.domain.bridg.DocumentRelationship[] documentRelationship;
    private gov.nih.nci.cabig.ccts.domain.bridg.DocumentFrame[] documentFrame;

    public Document() {
    }

    public Document(
           gov.nih.nci.cabig.ccts.domain.cdt.ST detailedDescription,
           gov.nih.nci.cabig.ccts.domain.bridg.DocumentFrame[] documentFrame,
           gov.nih.nci.cabig.ccts.domain.bridg.DocumentRelationship[] documentRelationship,
           gov.nih.nci.cabig.ccts.domain.cdt.II[] identifier,
           gov.nih.nci.cabig.ccts.domain.cdt.CD language,
           gov.nih.nci.cabig.ccts.domain.cdt.ST revision,
           gov.nih.nci.cabig.ccts.domain.cdt.CD status,
           gov.nih.nci.cabig.ccts.domain.cdt.IVLTS statusDateRange,
           gov.nih.nci.cabig.ccts.domain.cdt.CD[] subtype,
           gov.nih.nci.cabig.ccts.domain.cdt.ST summaryDescription,
           gov.nih.nci.cabig.ccts.domain.cdt.ST synopsis,
           gov.nih.nci.cabig.ccts.domain.cdt.ST title,
           gov.nih.nci.cabig.ccts.domain.cdt.CD type) {
           this.detailedDescription = detailedDescription;
           this.identifier = identifier;
           this.language = language;
           this.revision = revision;
           this.status = status;
           this.statusDateRange = statusDateRange;
           this.subtype = subtype;
           this.summaryDescription = summaryDescription;
           this.synopsis = synopsis;
           this.title = title;
           this.type = type;
           this.documentRelationship = documentRelationship;
           this.documentFrame = documentFrame;
    }


    /**
     * Gets the detailedDescription value for this Document.
     * 
     * @return detailedDescription Text which is a full or comprehensive narrative/explanation.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getDetailedDescription() {
        return detailedDescription;
    }


    /**
     * Sets the detailedDescription value for this Document.
     * 
     * @param detailedDescription Text which is a full or comprehensive narrative/explanation.
     */
    public void setDetailedDescription(gov.nih.nci.cabig.ccts.domain.cdt.ST detailedDescription) {
        this.detailedDescription = detailedDescription;
    }


    /**
     * Gets the identifier value for this Document.
     * 
     * @return identifier A code that uniquely identifies a documentation. A particular documentation
 * can have one or more ID.
 * 
 * For example,  an identifier assigned by some organization in the context
 * of a study, for example, sponsor protocol number, national number,
 * cooperative group protocol number, CDISC protocol identifying number.
 * 
 * 
 * For example, in the Regulated Product Submission (RPS) message, this
 * identifies the file (with a Uniform Resource Identifier (URI)), which
 * is part of the documentation. A URI is a compact string of characters
 * used to identify or name a resource. The main purpose of this identification
 * is to enable interaction with representations of the resource over
 * a network, typically the World Wide Web, using specific protocols.
 * URIs are defined in schemes defining a specific syntax and associated
 * protocols.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.II[] getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this Document.
     * 
     * @param identifier A code that uniquely identifies a documentation. A particular documentation
 * can have one or more ID.
 * 
 * For example,  an identifier assigned by some organization in the context
 * of a study, for example, sponsor protocol number, national number,
 * cooperative group protocol number, CDISC protocol identifying number.
 * 
 * 
 * For example, in the Regulated Product Submission (RPS) message, this
 * identifies the file (with a Uniform Resource Identifier (URI)), which
 * is part of the documentation. A URI is a compact string of characters
 * used to identify or name a resource. The main purpose of this identification
 * is to enable interaction with representations of the resource over
 * a network, typically the World Wide Web, using specific protocols.
 * URIs are defined in schemes defining a specific syntax and associated
 * protocols.
     */
    public void setIdentifier(gov.nih.nci.cabig.ccts.domain.cdt.II[] identifier) {
        this.identifier = identifier;
    }

    public gov.nih.nci.cabig.ccts.domain.cdt.II getIdentifier(int i) {
        return this.identifier[i];
    }

    public void setIdentifier(int i, gov.nih.nci.cabig.ccts.domain.cdt.II _value) {
        this.identifier[i] = _value;
    }


    /**
     * Gets the language value for this Document.
     * 
     * @return language For character based information the language property specifies
 * the human language of the text. This would be selected from a list
 * of possible languages.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this Document.
     * 
     * @param language For character based information the language property specifies
 * the human language of the text. This would be selected from a list
 * of possible languages.
     */
    public void setLanguage(gov.nih.nci.cabig.ccts.domain.cdt.CD language) {
        this.language = language;
    }


    /**
     * Gets the revision value for this Document.
     * 
     * @return revision A string or code which identifies a given collection of content
 * of a documentation at a point in time. 
 * 
 * For example, over time, there may be multiple changes to a documentation,
 * and the revision allows an individual to capture relationships between
 * changes in the instances of a documentation over time. There can be
 * a new revision every time the content changes. 
 * 
 * For example, in RPS this could be operationalized as follows: The
 * version number would be an integer starting at '1' and incrementing
 * by 1. The first instance or original report should always be valued
 * as '1'. The version number value must be incremented by one when a
 * report is replaced, but can also be incremented more often to meet
 * local requirements. 
 * 
 * Different versions of the same document belong to the same documentation
 * group.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getRevision() {
        return revision;
    }


    /**
     * Sets the revision value for this Document.
     * 
     * @param revision A string or code which identifies a given collection of content
 * of a documentation at a point in time. 
 * 
 * For example, over time, there may be multiple changes to a documentation,
 * and the revision allows an individual to capture relationships between
 * changes in the instances of a documentation over time. There can be
 * a new revision every time the content changes. 
 * 
 * For example, in RPS this could be operationalized as follows: The
 * version number would be an integer starting at '1' and incrementing
 * by 1. The first instance or original report should always be valued
 * as '1'. The version number value must be incremented by one when a
 * report is replaced, but can also be incremented more often to meet
 * local requirements. 
 * 
 * Different versions of the same document belong to the same documentation
 * group.
     */
    public void setRevision(gov.nih.nci.cabig.ccts.domain.cdt.ST revision) {
        this.revision = revision;
    }


    /**
     * Gets the status value for this Document.
     * 
     * @return status The status is an attribute that defines the various states that
 * a documentation can exist in. 
 * 
 * For example, in RPS, the status of the documentation is either active
 * or obsolete. This is used to determine if the documentation should
 * be considered as part of the regulatory decision.
 * 
 * Other documentations could have other status -- pending, under review,
 * signed, submitted, etc. These are specific to particular state diagrams
 * used to support a particular use case.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Document.
     * 
     * @param status The status is an attribute that defines the various states that
 * a documentation can exist in. 
 * 
 * For example, in RPS, the status of the documentation is either active
 * or obsolete. This is used to determine if the documentation should
 * be considered as part of the regulatory decision.
 * 
 * Other documentations could have other status -- pending, under review,
 * signed, submitted, etc. These are specific to particular state diagrams
 * used to support a particular use case.
     */
    public void setStatus(gov.nih.nci.cabig.ccts.domain.cdt.CD status) {
        this.status = status;
    }


    /**
     * Gets the statusDateRange value for this Document.
     * 
     * @return statusDateRange The date range for when this particular status becomes active and
 * when it is no longer considered active, enforceable, relevant, etc..
 * 
 * For example, in protocol, the effective date may be the date of IRB
 * approval of the initial protocol version; the date the IRB Chair signs
 * off on a protocol and patient enrollment can begin.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.IVLTS getStatusDateRange() {
        return statusDateRange;
    }


    /**
     * Sets the statusDateRange value for this Document.
     * 
     * @param statusDateRange The date range for when this particular status becomes active and
 * when it is no longer considered active, enforceable, relevant, etc..
 * 
 * For example, in protocol, the effective date may be the date of IRB
 * approval of the initial protocol version; the date the IRB Chair signs
 * off on a protocol and patient enrollment can begin.
     */
    public void setStatusDateRange(gov.nih.nci.cabig.ccts.domain.cdt.IVLTS statusDateRange) {
        this.statusDateRange = statusDateRange;
    }


    /**
     * Gets the subtype value for this Document.
     * 
     * @return subtype Contains name value pairs that are used within the context of an
 * application.  Each subtype/keyword is an item of information that
 * provides context for the documentation.  Keywords are used only to
 * further define the context of documentation, and the keywords, by
 * themselves, have no intrinsic value. 
 * 
 * Only certain types of documentation, as defined by the codes, can
 * be further defined by keywords.
 * 
 * Subtypes/keywords can also be defined in other coding systems. In
 * those cases a subtype/keyword would not have to be created, the logical
 * document would point directly to the other coding system.
 * 
 * For example, species, indication, manufacturer, biocompatibility,
 * facility, drug substance, drug product. Each one of these are associated
 * with a type code.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD[] getSubtype() {
        return subtype;
    }


    /**
     * Sets the subtype value for this Document.
     * 
     * @param subtype Contains name value pairs that are used within the context of an
 * application.  Each subtype/keyword is an item of information that
 * provides context for the documentation.  Keywords are used only to
 * further define the context of documentation, and the keywords, by
 * themselves, have no intrinsic value. 
 * 
 * Only certain types of documentation, as defined by the codes, can
 * be further defined by keywords.
 * 
 * Subtypes/keywords can also be defined in other coding systems. In
 * those cases a subtype/keyword would not have to be created, the logical
 * document would point directly to the other coding system.
 * 
 * For example, species, indication, manufacturer, biocompatibility,
 * facility, drug substance, drug product. Each one of these are associated
 * with a type code.
     */
    public void setSubtype(gov.nih.nci.cabig.ccts.domain.cdt.CD[] subtype) {
        this.subtype = subtype;
    }

    public gov.nih.nci.cabig.ccts.domain.cdt.CD getSubtype(int i) {
        return this.subtype[i];
    }

    public void setSubtype(int i, gov.nih.nci.cabig.ccts.domain.cdt.CD _value) {
        this.subtype[i] = _value;
    }


    /**
     * Gets the summaryDescription value for this Document.
     * 
     * @return summaryDescription Text which abstracts the salient information from the detailedDescription.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getSummaryDescription() {
        return summaryDescription;
    }


    /**
     * Sets the summaryDescription value for this Document.
     * 
     * @param summaryDescription Text which abstracts the salient information from the detailedDescription.
     */
    public void setSummaryDescription(gov.nih.nci.cabig.ccts.domain.cdt.ST summaryDescription) {
        this.summaryDescription = summaryDescription;
    }


    /**
     * Gets the synopsis value for this Document.
     * 
     * @return synopsis Text which abstracts the salient information from the summaryDescription.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getSynopsis() {
        return synopsis;
    }


    /**
     * Sets the synopsis value for this Document.
     * 
     * @param synopsis Text which abstracts the salient information from the summaryDescription.
     */
    public void setSynopsis(gov.nih.nci.cabig.ccts.domain.cdt.ST synopsis) {
        this.synopsis = synopsis;
    }


    /**
     * Gets the title value for this Document.
     * 
     * @return title The briefest description of the content of the documentation. 
 * 
 * For example, Descriptive text used to represent the long title or
 * name of a protocol.
 * 
 * For example, the title of a protocol limited to 30 characters in length.
 * 
 * For example, "protocol", "benchmark test" would be examples of titles
 * for documentation.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Document.
     * 
     * @param title The briefest description of the content of the documentation. 
 * 
 * For example, Descriptive text used to represent the long title or
 * name of a protocol.
 * 
 * For example, the title of a protocol limited to 30 characters in length.
 * 
 * For example, "protocol", "benchmark test" would be examples of titles
 * for documentation.
     */
    public void setTitle(gov.nih.nci.cabig.ccts.domain.cdt.ST title) {
        this.title = title;
    }


    /**
     * Gets the type value for this Document.
     * 
     * @return type A string or code that identifies a general class or category of
 * documents, for example, amendment, background material, guide, etc.
 * 
 * For example, in RPS, this is the code that specifies how the file
 * is to be used within the submission process (e.g. Protocol, Summary
 * Introduction).
 * 
 * For example, a RegulatoryRecord - A document that meets a record requirement
 * of a regulatory authority and must be retained in accordance with
 * that agency’s records retention requirements.  Example: Data Clarification
 * Form (DCF)
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getType() {
        return type;
    }


    /**
     * Sets the type value for this Document.
     * 
     * @param type A string or code that identifies a general class or category of
 * documents, for example, amendment, background material, guide, etc.
 * 
 * For example, in RPS, this is the code that specifies how the file
 * is to be used within the submission process (e.g. Protocol, Summary
 * Introduction).
 * 
 * For example, a RegulatoryRecord - A document that meets a record requirement
 * of a regulatory authority and must be retained in accordance with
 * that agency’s records retention requirements.  Example: Data Clarification
 * Form (DCF)
     */
    public void setType(gov.nih.nci.cabig.ccts.domain.cdt.CD type) {
        this.type = type;
    }


    /**
     * Gets the documentRelationship value for this Document.
     * 
     * @return documentRelationship
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.DocumentRelationship[] getDocumentRelationship() {
        return documentRelationship;
    }


    /**
     * Sets the documentRelationship value for this Document.
     * 
     * @param documentRelationship
     */
    public void setDocumentRelationship(gov.nih.nci.cabig.ccts.domain.bridg.DocumentRelationship[] documentRelationship) {
        this.documentRelationship = documentRelationship;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.DocumentRelationship getDocumentRelationship(int i) {
        return this.documentRelationship[i];
    }

    public void setDocumentRelationship(int i, gov.nih.nci.cabig.ccts.domain.bridg.DocumentRelationship _value) {
        this.documentRelationship[i] = _value;
    }


    /**
     * Gets the documentFrame value for this Document.
     * 
     * @return documentFrame
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.DocumentFrame[] getDocumentFrame() {
        return documentFrame;
    }


    /**
     * Sets the documentFrame value for this Document.
     * 
     * @param documentFrame
     */
    public void setDocumentFrame(gov.nih.nci.cabig.ccts.domain.bridg.DocumentFrame[] documentFrame) {
        this.documentFrame = documentFrame;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.DocumentFrame getDocumentFrame(int i) {
        return this.documentFrame[i];
    }

    public void setDocumentFrame(int i, gov.nih.nci.cabig.ccts.domain.bridg.DocumentFrame _value) {
        this.documentFrame[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Document)) return false;
        Document other = (Document) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.detailedDescription==null && other.getDetailedDescription()==null) || 
             (this.detailedDescription!=null &&
              this.detailedDescription.equals(other.getDetailedDescription()))) &&
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              java.util.Arrays.equals(this.identifier, other.getIdentifier()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.revision==null && other.getRevision()==null) || 
             (this.revision!=null &&
              this.revision.equals(other.getRevision()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.statusDateRange==null && other.getStatusDateRange()==null) || 
             (this.statusDateRange!=null &&
              this.statusDateRange.equals(other.getStatusDateRange()))) &&
            ((this.subtype==null && other.getSubtype()==null) || 
             (this.subtype!=null &&
              java.util.Arrays.equals(this.subtype, other.getSubtype()))) &&
            ((this.summaryDescription==null && other.getSummaryDescription()==null) || 
             (this.summaryDescription!=null &&
              this.summaryDescription.equals(other.getSummaryDescription()))) &&
            ((this.synopsis==null && other.getSynopsis()==null) || 
             (this.synopsis!=null &&
              this.synopsis.equals(other.getSynopsis()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.documentRelationship==null && other.getDocumentRelationship()==null) || 
             (this.documentRelationship!=null &&
              java.util.Arrays.equals(this.documentRelationship, other.getDocumentRelationship()))) &&
            ((this.documentFrame==null && other.getDocumentFrame()==null) || 
             (this.documentFrame!=null &&
              java.util.Arrays.equals(this.documentFrame, other.getDocumentFrame())));
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
        if (getDetailedDescription() != null) {
            _hashCode += getDetailedDescription().hashCode();
        }
        if (getIdentifier() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIdentifier());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIdentifier(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getRevision() != null) {
            _hashCode += getRevision().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatusDateRange() != null) {
            _hashCode += getStatusDateRange().hashCode();
        }
        if (getSubtype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubtype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubtype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSummaryDescription() != null) {
            _hashCode += getSummaryDescription().hashCode();
        }
        if (getSynopsis() != null) {
            _hashCode += getSynopsis().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getDocumentRelationship() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentRelationship());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentRelationship(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDocumentFrame() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentFrame());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentFrame(), i);
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
        new org.apache.axis.description.TypeDesc(Document.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Document"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailedDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "detailedDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "II"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revision");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "revision"));
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
        elemField.setFieldName("subtype");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "subtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "summaryDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("synopsis");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "synopsis"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentRelationship");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DocumentRelationship"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DocumentRelationship"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentFrame");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DocumentFrame"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DocumentFrame"));
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
