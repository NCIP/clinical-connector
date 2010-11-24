/**
 * Person.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A human being.
 */
public class Person  implements java.io.Serializable {
    /** Specifies whether the person is adopted. */
    private gov.nih.nci.cabig.ccts.domain.cdt.BL adoptedIndicator;
    /** The name of the country in which the person was born. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD birthCountry;
    /** The month, day and year on which the person was born. */
    private gov.nih.nci.cabig.ccts.domain.cdt.TS birthDate;
    /** Indicates the place of a child's birth in the family. */
    private int birthOrder;
    /** The actual date and time of a person's death. */
    private gov.nih.nci.cabig.ccts.domain.cdt.TS deathDate;
    /** Highest level of education completed. 
 * 
 * For example, Less than High School Diploma, High School Diploma, Some
 * College, etc. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD educationLevel;
    /** The person's self declared ethnic origination, independent of racial
 * origination. 
 * 
 * For example, for the NCI, these ethnic groups are based on OMB approved
 * categories. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD[] ethnicGroup;
    /** The hue of the optical organ of the person. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST eyeColor;
    /** The text that describes the assemblage of physical properties or
 * qualities by which male is distinguished from female; the physical
 * difference between male and female within a person. 
 * 
 * NOTE: Identification of sex is usually based upon self-report and
 * may come from a form, questionnaire, interview, etc. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD gender;
    /** A category to designate the total income of a household.  
 * 
 * For example, Less than $25,000, $25,000 to $50,000, etc. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD householdIncome;
    /** The first letters of the person's first name, middle name, and
 * last name. 
 * 
 * NOTE: If the person does not have a middle initial, the initials will
 * only be two characters. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST initials;
    /** A commonly used category used to describe the marital status of
 * a person.  
 * 
 * For example, Married, Widowed, Single, Separated, etc. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD maritalStatus;
    /** A non-unique textual identifier or moniker of a person. 
 * 
 * For example, proper names, nicknames, legal names of persons, etc. */
    private gov.nih.nci.cabig.ccts.domain.cdt.PN name;
    /** The postal and/or residential address of a person. */
    private gov.nih.nci.cabig.ccts.domain.cdt.AD postalAddress;
    /** A value representing a person's self declared racial origination,
 * independent of ethnic origination.
 * 
 * For example, for the National Cancer Institute (NCI), this code is
 * based on Office of Management &amp; Budget (OMB) approved categories. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD[] race;
    /** The value for the particular address.  
 * 
 * For example, the set of digits that serves as the address for a telephone
 * device.  Included in the phone number are country, city, and area
 * codes needed to uniquely address the telephone.  A URL or e-mail would
 * be similarly described. */
    private gov.nih.nci.cabig.ccts.domain.cdt.TEL[] telecomAddress;
    private gov.nih.nci.cabig.ccts.domain.bridg.HealthCareProvider healthCareProvider;
    private gov.nih.nci.cabig.ccts.domain.bridg.Participant[] participant;
    private gov.nih.nci.cabig.ccts.domain.bridg.AssociatedPerson associatedPerson;
    private gov.nih.nci.cabig.ccts.domain.bridg.ClinicalResearchCoordinator[] clinicalResearchCoordinator;
    private gov.nih.nci.cabig.ccts.domain.bridg.ClinicalResearchStaff clinicalResearchStaff;

    public Person() {
    }

    public Person(
           gov.nih.nci.cabig.ccts.domain.cdt.BL adoptedIndicator,
           gov.nih.nci.cabig.ccts.domain.bridg.AssociatedPerson associatedPerson,
           gov.nih.nci.cabig.ccts.domain.cdt.CD birthCountry,
           gov.nih.nci.cabig.ccts.domain.cdt.TS birthDate,
           int birthOrder,
           gov.nih.nci.cabig.ccts.domain.bridg.ClinicalResearchCoordinator[] clinicalResearchCoordinator,
           gov.nih.nci.cabig.ccts.domain.bridg.ClinicalResearchStaff clinicalResearchStaff,
           gov.nih.nci.cabig.ccts.domain.cdt.TS deathDate,
           gov.nih.nci.cabig.ccts.domain.cdt.CD educationLevel,
           gov.nih.nci.cabig.ccts.domain.cdt.CD[] ethnicGroup,
           gov.nih.nci.cabig.ccts.domain.cdt.ST eyeColor,
           gov.nih.nci.cabig.ccts.domain.cdt.CD gender,
           gov.nih.nci.cabig.ccts.domain.bridg.HealthCareProvider healthCareProvider,
           gov.nih.nci.cabig.ccts.domain.cdt.CD householdIncome,
           gov.nih.nci.cabig.ccts.domain.cdt.ST initials,
           gov.nih.nci.cabig.ccts.domain.cdt.CD maritalStatus,
           gov.nih.nci.cabig.ccts.domain.cdt.PN name,
           gov.nih.nci.cabig.ccts.domain.bridg.Participant[] participant,
           gov.nih.nci.cabig.ccts.domain.cdt.AD postalAddress,
           gov.nih.nci.cabig.ccts.domain.cdt.CD[] race,
           gov.nih.nci.cabig.ccts.domain.cdt.TEL[] telecomAddress) {
           this.adoptedIndicator = adoptedIndicator;
           this.birthCountry = birthCountry;
           this.birthDate = birthDate;
           this.birthOrder = birthOrder;
           this.deathDate = deathDate;
           this.educationLevel = educationLevel;
           this.ethnicGroup = ethnicGroup;
           this.eyeColor = eyeColor;
           this.gender = gender;
           this.householdIncome = householdIncome;
           this.initials = initials;
           this.maritalStatus = maritalStatus;
           this.name = name;
           this.postalAddress = postalAddress;
           this.race = race;
           this.telecomAddress = telecomAddress;
           this.healthCareProvider = healthCareProvider;
           this.participant = participant;
           this.associatedPerson = associatedPerson;
           this.clinicalResearchCoordinator = clinicalResearchCoordinator;
           this.clinicalResearchStaff = clinicalResearchStaff;
    }


    /**
     * Gets the adoptedIndicator value for this Person.
     * 
     * @return adoptedIndicator Specifies whether the person is adopted.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.BL getAdoptedIndicator() {
        return adoptedIndicator;
    }


    /**
     * Sets the adoptedIndicator value for this Person.
     * 
     * @param adoptedIndicator Specifies whether the person is adopted.
     */
    public void setAdoptedIndicator(gov.nih.nci.cabig.ccts.domain.cdt.BL adoptedIndicator) {
        this.adoptedIndicator = adoptedIndicator;
    }


    /**
     * Gets the birthCountry value for this Person.
     * 
     * @return birthCountry The name of the country in which the person was born.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getBirthCountry() {
        return birthCountry;
    }


    /**
     * Sets the birthCountry value for this Person.
     * 
     * @param birthCountry The name of the country in which the person was born.
     */
    public void setBirthCountry(gov.nih.nci.cabig.ccts.domain.cdt.CD birthCountry) {
        this.birthCountry = birthCountry;
    }


    /**
     * Gets the birthDate value for this Person.
     * 
     * @return birthDate The month, day and year on which the person was born.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.TS getBirthDate() {
        return birthDate;
    }


    /**
     * Sets the birthDate value for this Person.
     * 
     * @param birthDate The month, day and year on which the person was born.
     */
    public void setBirthDate(gov.nih.nci.cabig.ccts.domain.cdt.TS birthDate) {
        this.birthDate = birthDate;
    }


    /**
     * Gets the birthOrder value for this Person.
     * 
     * @return birthOrder Indicates the place of a child's birth in the family.
     */
    public int getBirthOrder() {
        return birthOrder;
    }


    /**
     * Sets the birthOrder value for this Person.
     * 
     * @param birthOrder Indicates the place of a child's birth in the family.
     */
    public void setBirthOrder(int birthOrder) {
        this.birthOrder = birthOrder;
    }


    /**
     * Gets the deathDate value for this Person.
     * 
     * @return deathDate The actual date and time of a person's death.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.TS getDeathDate() {
        return deathDate;
    }


    /**
     * Sets the deathDate value for this Person.
     * 
     * @param deathDate The actual date and time of a person's death.
     */
    public void setDeathDate(gov.nih.nci.cabig.ccts.domain.cdt.TS deathDate) {
        this.deathDate = deathDate;
    }


    /**
     * Gets the educationLevel value for this Person.
     * 
     * @return educationLevel Highest level of education completed. 
 * 
 * For example, Less than High School Diploma, High School Diploma, Some
 * College, etc.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getEducationLevel() {
        return educationLevel;
    }


    /**
     * Sets the educationLevel value for this Person.
     * 
     * @param educationLevel Highest level of education completed. 
 * 
 * For example, Less than High School Diploma, High School Diploma, Some
 * College, etc.
     */
    public void setEducationLevel(gov.nih.nci.cabig.ccts.domain.cdt.CD educationLevel) {
        this.educationLevel = educationLevel;
    }


    /**
     * Gets the ethnicGroup value for this Person.
     * 
     * @return ethnicGroup The person's self declared ethnic origination, independent of racial
 * origination. 
 * 
 * For example, for the NCI, these ethnic groups are based on OMB approved
 * categories.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD[] getEthnicGroup() {
        return ethnicGroup;
    }


    /**
     * Sets the ethnicGroup value for this Person.
     * 
     * @param ethnicGroup The person's self declared ethnic origination, independent of racial
 * origination. 
 * 
 * For example, for the NCI, these ethnic groups are based on OMB approved
 * categories.
     */
    public void setEthnicGroup(gov.nih.nci.cabig.ccts.domain.cdt.CD[] ethnicGroup) {
        this.ethnicGroup = ethnicGroup;
    }

    public gov.nih.nci.cabig.ccts.domain.cdt.CD getEthnicGroup(int i) {
        return this.ethnicGroup[i];
    }

    public void setEthnicGroup(int i, gov.nih.nci.cabig.ccts.domain.cdt.CD _value) {
        this.ethnicGroup[i] = _value;
    }


    /**
     * Gets the eyeColor value for this Person.
     * 
     * @return eyeColor The hue of the optical organ of the person.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getEyeColor() {
        return eyeColor;
    }


    /**
     * Sets the eyeColor value for this Person.
     * 
     * @param eyeColor The hue of the optical organ of the person.
     */
    public void setEyeColor(gov.nih.nci.cabig.ccts.domain.cdt.ST eyeColor) {
        this.eyeColor = eyeColor;
    }


    /**
     * Gets the gender value for this Person.
     * 
     * @return gender The text that describes the assemblage of physical properties or
 * qualities by which male is distinguished from female; the physical
 * difference between male and female within a person. 
 * 
 * NOTE: Identification of sex is usually based upon self-report and
 * may come from a form, questionnaire, interview, etc.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this Person.
     * 
     * @param gender The text that describes the assemblage of physical properties or
 * qualities by which male is distinguished from female; the physical
 * difference between male and female within a person. 
 * 
 * NOTE: Identification of sex is usually based upon self-report and
 * may come from a form, questionnaire, interview, etc.
     */
    public void setGender(gov.nih.nci.cabig.ccts.domain.cdt.CD gender) {
        this.gender = gender;
    }


    /**
     * Gets the householdIncome value for this Person.
     * 
     * @return householdIncome A category to designate the total income of a household.  
 * 
 * For example, Less than $25,000, $25,000 to $50,000, etc.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getHouseholdIncome() {
        return householdIncome;
    }


    /**
     * Sets the householdIncome value for this Person.
     * 
     * @param householdIncome A category to designate the total income of a household.  
 * 
 * For example, Less than $25,000, $25,000 to $50,000, etc.
     */
    public void setHouseholdIncome(gov.nih.nci.cabig.ccts.domain.cdt.CD householdIncome) {
        this.householdIncome = householdIncome;
    }


    /**
     * Gets the initials value for this Person.
     * 
     * @return initials The first letters of the person's first name, middle name, and
 * last name. 
 * 
 * NOTE: If the person does not have a middle initial, the initials will
 * only be two characters.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getInitials() {
        return initials;
    }


    /**
     * Sets the initials value for this Person.
     * 
     * @param initials The first letters of the person's first name, middle name, and
 * last name. 
 * 
 * NOTE: If the person does not have a middle initial, the initials will
 * only be two characters.
     */
    public void setInitials(gov.nih.nci.cabig.ccts.domain.cdt.ST initials) {
        this.initials = initials;
    }


    /**
     * Gets the maritalStatus value for this Person.
     * 
     * @return maritalStatus A commonly used category used to describe the marital status of
 * a person.  
 * 
 * For example, Married, Widowed, Single, Separated, etc.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getMaritalStatus() {
        return maritalStatus;
    }


    /**
     * Sets the maritalStatus value for this Person.
     * 
     * @param maritalStatus A commonly used category used to describe the marital status of
 * a person.  
 * 
 * For example, Married, Widowed, Single, Separated, etc.
     */
    public void setMaritalStatus(gov.nih.nci.cabig.ccts.domain.cdt.CD maritalStatus) {
        this.maritalStatus = maritalStatus;
    }


    /**
     * Gets the name value for this Person.
     * 
     * @return name A non-unique textual identifier or moniker of a person. 
 * 
 * For example, proper names, nicknames, legal names of persons, etc.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.PN getName() {
        return name;
    }


    /**
     * Sets the name value for this Person.
     * 
     * @param name A non-unique textual identifier or moniker of a person. 
 * 
 * For example, proper names, nicknames, legal names of persons, etc.
     */
    public void setName(gov.nih.nci.cabig.ccts.domain.cdt.PN name) {
        this.name = name;
    }


    /**
     * Gets the postalAddress value for this Person.
     * 
     * @return postalAddress The postal and/or residential address of a person.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.AD getPostalAddress() {
        return postalAddress;
    }


    /**
     * Sets the postalAddress value for this Person.
     * 
     * @param postalAddress The postal and/or residential address of a person.
     */
    public void setPostalAddress(gov.nih.nci.cabig.ccts.domain.cdt.AD postalAddress) {
        this.postalAddress = postalAddress;
    }


    /**
     * Gets the race value for this Person.
     * 
     * @return race A value representing a person's self declared racial origination,
 * independent of ethnic origination.
 * 
 * For example, for the National Cancer Institute (NCI), this code is
 * based on Office of Management &amp; Budget (OMB) approved categories.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD[] getRace() {
        return race;
    }


    /**
     * Sets the race value for this Person.
     * 
     * @param race A value representing a person's self declared racial origination,
 * independent of ethnic origination.
 * 
 * For example, for the National Cancer Institute (NCI), this code is
 * based on Office of Management &amp; Budget (OMB) approved categories.
     */
    public void setRace(gov.nih.nci.cabig.ccts.domain.cdt.CD[] race) {
        this.race = race;
    }

    public gov.nih.nci.cabig.ccts.domain.cdt.CD getRace(int i) {
        return this.race[i];
    }

    public void setRace(int i, gov.nih.nci.cabig.ccts.domain.cdt.CD _value) {
        this.race[i] = _value;
    }


    /**
     * Gets the telecomAddress value for this Person.
     * 
     * @return telecomAddress The value for the particular address.  
 * 
 * For example, the set of digits that serves as the address for a telephone
 * device.  Included in the phone number are country, city, and area
 * codes needed to uniquely address the telephone.  A URL or e-mail would
 * be similarly described.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.TEL[] getTelecomAddress() {
        return telecomAddress;
    }


    /**
     * Sets the telecomAddress value for this Person.
     * 
     * @param telecomAddress The value for the particular address.  
 * 
 * For example, the set of digits that serves as the address for a telephone
 * device.  Included in the phone number are country, city, and area
 * codes needed to uniquely address the telephone.  A URL or e-mail would
 * be similarly described.
     */
    public void setTelecomAddress(gov.nih.nci.cabig.ccts.domain.cdt.TEL[] telecomAddress) {
        this.telecomAddress = telecomAddress;
    }

    public gov.nih.nci.cabig.ccts.domain.cdt.TEL getTelecomAddress(int i) {
        return this.telecomAddress[i];
    }

    public void setTelecomAddress(int i, gov.nih.nci.cabig.ccts.domain.cdt.TEL _value) {
        this.telecomAddress[i] = _value;
    }


    /**
     * Gets the healthCareProvider value for this Person.
     * 
     * @return healthCareProvider
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.HealthCareProvider getHealthCareProvider() {
        return healthCareProvider;
    }


    /**
     * Sets the healthCareProvider value for this Person.
     * 
     * @param healthCareProvider
     */
    public void setHealthCareProvider(gov.nih.nci.cabig.ccts.domain.bridg.HealthCareProvider healthCareProvider) {
        this.healthCareProvider = healthCareProvider;
    }


    /**
     * Gets the participant value for this Person.
     * 
     * @return participant
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.Participant[] getParticipant() {
        return participant;
    }


    /**
     * Sets the participant value for this Person.
     * 
     * @param participant
     */
    public void setParticipant(gov.nih.nci.cabig.ccts.domain.bridg.Participant[] participant) {
        this.participant = participant;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.Participant getParticipant(int i) {
        return this.participant[i];
    }

    public void setParticipant(int i, gov.nih.nci.cabig.ccts.domain.bridg.Participant _value) {
        this.participant[i] = _value;
    }


    /**
     * Gets the associatedPerson value for this Person.
     * 
     * @return associatedPerson
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.AssociatedPerson getAssociatedPerson() {
        return associatedPerson;
    }


    /**
     * Sets the associatedPerson value for this Person.
     * 
     * @param associatedPerson
     */
    public void setAssociatedPerson(gov.nih.nci.cabig.ccts.domain.bridg.AssociatedPerson associatedPerson) {
        this.associatedPerson = associatedPerson;
    }


    /**
     * Gets the clinicalResearchCoordinator value for this Person.
     * 
     * @return clinicalResearchCoordinator
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.ClinicalResearchCoordinator[] getClinicalResearchCoordinator() {
        return clinicalResearchCoordinator;
    }


    /**
     * Sets the clinicalResearchCoordinator value for this Person.
     * 
     * @param clinicalResearchCoordinator
     */
    public void setClinicalResearchCoordinator(gov.nih.nci.cabig.ccts.domain.bridg.ClinicalResearchCoordinator[] clinicalResearchCoordinator) {
        this.clinicalResearchCoordinator = clinicalResearchCoordinator;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.ClinicalResearchCoordinator getClinicalResearchCoordinator(int i) {
        return this.clinicalResearchCoordinator[i];
    }

    public void setClinicalResearchCoordinator(int i, gov.nih.nci.cabig.ccts.domain.bridg.ClinicalResearchCoordinator _value) {
        this.clinicalResearchCoordinator[i] = _value;
    }


    /**
     * Gets the clinicalResearchStaff value for this Person.
     * 
     * @return clinicalResearchStaff
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.ClinicalResearchStaff getClinicalResearchStaff() {
        return clinicalResearchStaff;
    }


    /**
     * Sets the clinicalResearchStaff value for this Person.
     * 
     * @param clinicalResearchStaff
     */
    public void setClinicalResearchStaff(gov.nih.nci.cabig.ccts.domain.bridg.ClinicalResearchStaff clinicalResearchStaff) {
        this.clinicalResearchStaff = clinicalResearchStaff;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adoptedIndicator==null && other.getAdoptedIndicator()==null) || 
             (this.adoptedIndicator!=null &&
              this.adoptedIndicator.equals(other.getAdoptedIndicator()))) &&
            ((this.birthCountry==null && other.getBirthCountry()==null) || 
             (this.birthCountry!=null &&
              this.birthCountry.equals(other.getBirthCountry()))) &&
            ((this.birthDate==null && other.getBirthDate()==null) || 
             (this.birthDate!=null &&
              this.birthDate.equals(other.getBirthDate()))) &&
            this.birthOrder == other.getBirthOrder() &&
            ((this.deathDate==null && other.getDeathDate()==null) || 
             (this.deathDate!=null &&
              this.deathDate.equals(other.getDeathDate()))) &&
            ((this.educationLevel==null && other.getEducationLevel()==null) || 
             (this.educationLevel!=null &&
              this.educationLevel.equals(other.getEducationLevel()))) &&
            ((this.ethnicGroup==null && other.getEthnicGroup()==null) || 
             (this.ethnicGroup!=null &&
              java.util.Arrays.equals(this.ethnicGroup, other.getEthnicGroup()))) &&
            ((this.eyeColor==null && other.getEyeColor()==null) || 
             (this.eyeColor!=null &&
              this.eyeColor.equals(other.getEyeColor()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.householdIncome==null && other.getHouseholdIncome()==null) || 
             (this.householdIncome!=null &&
              this.householdIncome.equals(other.getHouseholdIncome()))) &&
            ((this.initials==null && other.getInitials()==null) || 
             (this.initials!=null &&
              this.initials.equals(other.getInitials()))) &&
            ((this.maritalStatus==null && other.getMaritalStatus()==null) || 
             (this.maritalStatus!=null &&
              this.maritalStatus.equals(other.getMaritalStatus()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.postalAddress==null && other.getPostalAddress()==null) || 
             (this.postalAddress!=null &&
              this.postalAddress.equals(other.getPostalAddress()))) &&
            ((this.race==null && other.getRace()==null) || 
             (this.race!=null &&
              java.util.Arrays.equals(this.race, other.getRace()))) &&
            ((this.telecomAddress==null && other.getTelecomAddress()==null) || 
             (this.telecomAddress!=null &&
              java.util.Arrays.equals(this.telecomAddress, other.getTelecomAddress()))) &&
            ((this.healthCareProvider==null && other.getHealthCareProvider()==null) || 
             (this.healthCareProvider!=null &&
              this.healthCareProvider.equals(other.getHealthCareProvider()))) &&
            ((this.participant==null && other.getParticipant()==null) || 
             (this.participant!=null &&
              java.util.Arrays.equals(this.participant, other.getParticipant()))) &&
            ((this.associatedPerson==null && other.getAssociatedPerson()==null) || 
             (this.associatedPerson!=null &&
              this.associatedPerson.equals(other.getAssociatedPerson()))) &&
            ((this.clinicalResearchCoordinator==null && other.getClinicalResearchCoordinator()==null) || 
             (this.clinicalResearchCoordinator!=null &&
              java.util.Arrays.equals(this.clinicalResearchCoordinator, other.getClinicalResearchCoordinator()))) &&
            ((this.clinicalResearchStaff==null && other.getClinicalResearchStaff()==null) || 
             (this.clinicalResearchStaff!=null &&
              this.clinicalResearchStaff.equals(other.getClinicalResearchStaff())));
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
        if (getAdoptedIndicator() != null) {
            _hashCode += getAdoptedIndicator().hashCode();
        }
        if (getBirthCountry() != null) {
            _hashCode += getBirthCountry().hashCode();
        }
        if (getBirthDate() != null) {
            _hashCode += getBirthDate().hashCode();
        }
        _hashCode += getBirthOrder();
        if (getDeathDate() != null) {
            _hashCode += getDeathDate().hashCode();
        }
        if (getEducationLevel() != null) {
            _hashCode += getEducationLevel().hashCode();
        }
        if (getEthnicGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEthnicGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEthnicGroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEyeColor() != null) {
            _hashCode += getEyeColor().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getHouseholdIncome() != null) {
            _hashCode += getHouseholdIncome().hashCode();
        }
        if (getInitials() != null) {
            _hashCode += getInitials().hashCode();
        }
        if (getMaritalStatus() != null) {
            _hashCode += getMaritalStatus().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPostalAddress() != null) {
            _hashCode += getPostalAddress().hashCode();
        }
        if (getRace() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRace());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRace(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTelecomAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTelecomAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTelecomAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHealthCareProvider() != null) {
            _hashCode += getHealthCareProvider().hashCode();
        }
        if (getParticipant() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParticipant());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParticipant(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssociatedPerson() != null) {
            _hashCode += getAssociatedPerson().hashCode();
        }
        if (getClinicalResearchCoordinator() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClinicalResearchCoordinator());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClinicalResearchCoordinator(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClinicalResearchStaff() != null) {
            _hashCode += getClinicalResearchStaff().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Person.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Person"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adoptedIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "adoptedIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "BL"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "birthCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthDate");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "birthDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "TS"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "birthOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deathDate");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "deathDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "TS"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("educationLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "educationLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ethnicGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ethnicGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eyeColor");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "eyeColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("householdIncome");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "householdIncome"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initials");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "initials"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maritalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "maritalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "PN"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "postalAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "AD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("race");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "race"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telecomAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "telecomAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "TEL"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("healthCareProvider");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "HealthCareProvider"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "HealthCareProvider"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("participant");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Participant"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Participant"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associatedPerson");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "AssociatedPerson"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "AssociatedPerson"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clinicalResearchCoordinator");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ClinicalResearchCoordinator"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ClinicalResearchCoordinator"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clinicalResearchStaff");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ClinicalResearchStaff"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ClinicalResearchStaff"));
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
