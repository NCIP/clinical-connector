/**
 * AD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.cdt;


/**
 * Mailing and home or office addresses. A sequence of address parts,
 * such as street or post office Box, city, postal code, country, etc.
 */
public class AD  implements java.io.Serializable {
    /** This can be a unit designator, such as apartment number, suite
 * number, or floor. There may be several unit designators in an address
 * (e.g., "3rd floor, Appt. 342"). This can also be a designator pointing
 * away from the location, rather than specifying a smaller location
 * within some larger one (e.g., Dutch "t.o." means "opposite to" for
 * house boats located across the street facing houses). */
    private java.lang.String additionalLocator;
    /** The number of a building, house or lot alongside the street. Also
 * known as "primary street number". This does not number the street
 * but rather the building. */
    private java.lang.String buildingNumber;
    /** The numeric portion of a building number */
    private java.lang.String buildingNumberNumeric;
    /** Any alphabetic character, fraction or other text that may appear
 * after the numeric portion of a building number */
    private java.lang.String buildingNumberSuffix;
    /** The name of the party who will take receipt at the specified address,
 * and will take on responsibility for ensuring delivery to the target
 * recipient. */
    private java.lang.String careOf;
    /** A geographic sub-unit delineated for demographic purposes. */
    private java.lang.String censusTract;
    /** The name of the city, town, village, or other community or delivery
 * center. */
    private java.lang.String cityOrMunicipality;
    /** A national entity.  
 * 
 * For example, Mexico, United Kingdom. */
    private java.lang.String country;
    /** A sub-unit of a state or province. (49 of the United States of
 * America use the term "county;" Louisiana uses the term "parish".) */
    private java.lang.String countyOfParish;
    /** Delimiters are printed without framing white space. If no value
 * component is provided, the delimiter appears as a line break. */
    private java.lang.String delimiter;
    /** A delivery address line is frequently used instead of breaking
 * out delivery mode, delivery installation, etc. An address generally
 * has only a delivery address line or a street address line, but not
 * both. */
    private java.lang.String deliveryAddressLine;
    /** The location of the delivery installation, usually a town or city,
 * and is only required if the area is different from the municipality.
 * Area to which mail delivery service is provided from any postal facility
 * or service such as an individual letter carrier, rural route, or postal
 * route. */
    private java.lang.String deliveryInstallationArea;
    /** A number, letter or name identifying a delivery installation.
 * 
 * For example., for Station A, the delivery installation qualifier would
 * be 'A'. */
    private java.lang.String deliveryInstallationQualifier;
    /** Indicates the type of delivery installation (the facility to which
 * the mail will be delivered prior to final shipping via the delivery
 * mode.) Example: post office, letter carrier depot, community mail
 * center, station, etc. */
    private java.lang.String deliveryInstallationType;
    /** Indicates the type of service offered, method of delivery. 
 * 
 * For example: post office box, rural route, general delivery, etc. */
    private java.lang.String deliveryMode;
    /** Represents the routing information such as a letter carrier route
 * number. It is the identifying number of the designator (the box number
 * or rural route number). */
    private java.lang.String deliveryModeIdentifier;
    /** The compass direction. 
 * 
 * For example, N, S, W, E. */
    private java.lang.String direction;
    /** A boolean value specifying whether the order of the address parts
 * is known or not. While the address parts are always a Sequence, the
 * order in which they are presented may or may not be known. Where this
 * matters, the isNotOrdered property can be used to convey this information. */
    private boolean isNotOrdered;
    /** A postal code designating a region defined by the postal service. */
    private java.lang.String postalCode;
    /** A numbered box located in a post station. */
    private java.lang.String postBox;
    /** A subsection of a municipality. */
    private java.lang.String precinct;
    /** A sub-unit of a country with limited sovereignty in a federally
 * organized country. */
    private java.lang.String stateOrProvince;
    /** Indicates the line for the street address. */
    private java.lang.String streetAddressLine;
    /** The text idenfifier for the street. */
    private java.lang.String streetName;
    /** The base name of a roadway or artery recognized by a municipality
 * (excluding street type and direction) */
    private java.lang.String streetNameBase;
    /** The designation given to the street. 
 * 
 * For example, Street, Avenue, Crescent, etc. */
    private java.lang.String streetType;
    /** Indicates the type of specific unit contained within a building
 * or complex.  
 * 
 * For example, Apartment, Floor. */
    private java.lang.String unitDesignator;
    /** The number or name of a specific unit contained within a building
 * or complex, as assigned by that building or complex. */
    private java.lang.String unitIdentifier;
    /** A set of codes advising a system or user which address in a set
 * of like addresses to select for a given purpose. */
    private java.lang.String use;
    /** A General Timing Specification (GTS) specifying the periods of
 * time during which the address can be used. This is used to specify
 * different addresses for different times of the week or year. */
    private gov.nih.nci.cabig.ccts.domain.cdt.IVLTS useablePeriod;

    public AD() {
    }

    public AD(
           java.lang.String additionalLocator,
           java.lang.String buildingNumber,
           java.lang.String buildingNumberNumeric,
           java.lang.String buildingNumberSuffix,
           java.lang.String careOf,
           java.lang.String censusTract,
           java.lang.String cityOrMunicipality,
           java.lang.String country,
           java.lang.String countyOfParish,
           java.lang.String delimiter,
           java.lang.String deliveryAddressLine,
           java.lang.String deliveryInstallationArea,
           java.lang.String deliveryInstallationQualifier,
           java.lang.String deliveryInstallationType,
           java.lang.String deliveryMode,
           java.lang.String deliveryModeIdentifier,
           java.lang.String direction,
           boolean isNotOrdered,
           java.lang.String postBox,
           java.lang.String postalCode,
           java.lang.String precinct,
           java.lang.String stateOrProvince,
           java.lang.String streetAddressLine,
           java.lang.String streetName,
           java.lang.String streetNameBase,
           java.lang.String streetType,
           java.lang.String unitDesignator,
           java.lang.String unitIdentifier,
           java.lang.String use,
           gov.nih.nci.cabig.ccts.domain.cdt.IVLTS useablePeriod) {
           this.additionalLocator = additionalLocator;
           this.buildingNumber = buildingNumber;
           this.buildingNumberNumeric = buildingNumberNumeric;
           this.buildingNumberSuffix = buildingNumberSuffix;
           this.careOf = careOf;
           this.censusTract = censusTract;
           this.cityOrMunicipality = cityOrMunicipality;
           this.country = country;
           this.countyOfParish = countyOfParish;
           this.delimiter = delimiter;
           this.deliveryAddressLine = deliveryAddressLine;
           this.deliveryInstallationArea = deliveryInstallationArea;
           this.deliveryInstallationQualifier = deliveryInstallationQualifier;
           this.deliveryInstallationType = deliveryInstallationType;
           this.deliveryMode = deliveryMode;
           this.deliveryModeIdentifier = deliveryModeIdentifier;
           this.direction = direction;
           this.isNotOrdered = isNotOrdered;
           this.postalCode = postalCode;
           this.postBox = postBox;
           this.precinct = precinct;
           this.stateOrProvince = stateOrProvince;
           this.streetAddressLine = streetAddressLine;
           this.streetName = streetName;
           this.streetNameBase = streetNameBase;
           this.streetType = streetType;
           this.unitDesignator = unitDesignator;
           this.unitIdentifier = unitIdentifier;
           this.use = use;
           this.useablePeriod = useablePeriod;
    }


    /**
     * Gets the additionalLocator value for this AD.
     * 
     * @return additionalLocator This can be a unit designator, such as apartment number, suite
 * number, or floor. There may be several unit designators in an address
 * (e.g., "3rd floor, Appt. 342"). This can also be a designator pointing
 * away from the location, rather than specifying a smaller location
 * within some larger one (e.g., Dutch "t.o." means "opposite to" for
 * house boats located across the street facing houses).
     */
    public java.lang.String getAdditionalLocator() {
        return additionalLocator;
    }


    /**
     * Sets the additionalLocator value for this AD.
     * 
     * @param additionalLocator This can be a unit designator, such as apartment number, suite
 * number, or floor. There may be several unit designators in an address
 * (e.g., "3rd floor, Appt. 342"). This can also be a designator pointing
 * away from the location, rather than specifying a smaller location
 * within some larger one (e.g., Dutch "t.o." means "opposite to" for
 * house boats located across the street facing houses).
     */
    public void setAdditionalLocator(java.lang.String additionalLocator) {
        this.additionalLocator = additionalLocator;
    }


    /**
     * Gets the buildingNumber value for this AD.
     * 
     * @return buildingNumber The number of a building, house or lot alongside the street. Also
 * known as "primary street number". This does not number the street
 * but rather the building.
     */
    public java.lang.String getBuildingNumber() {
        return buildingNumber;
    }


    /**
     * Sets the buildingNumber value for this AD.
     * 
     * @param buildingNumber The number of a building, house or lot alongside the street. Also
 * known as "primary street number". This does not number the street
 * but rather the building.
     */
    public void setBuildingNumber(java.lang.String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }


    /**
     * Gets the buildingNumberNumeric value for this AD.
     * 
     * @return buildingNumberNumeric The numeric portion of a building number
     */
    public java.lang.String getBuildingNumberNumeric() {
        return buildingNumberNumeric;
    }


    /**
     * Sets the buildingNumberNumeric value for this AD.
     * 
     * @param buildingNumberNumeric The numeric portion of a building number
     */
    public void setBuildingNumberNumeric(java.lang.String buildingNumberNumeric) {
        this.buildingNumberNumeric = buildingNumberNumeric;
    }


    /**
     * Gets the buildingNumberSuffix value for this AD.
     * 
     * @return buildingNumberSuffix Any alphabetic character, fraction or other text that may appear
 * after the numeric portion of a building number
     */
    public java.lang.String getBuildingNumberSuffix() {
        return buildingNumberSuffix;
    }


    /**
     * Sets the buildingNumberSuffix value for this AD.
     * 
     * @param buildingNumberSuffix Any alphabetic character, fraction or other text that may appear
 * after the numeric portion of a building number
     */
    public void setBuildingNumberSuffix(java.lang.String buildingNumberSuffix) {
        this.buildingNumberSuffix = buildingNumberSuffix;
    }


    /**
     * Gets the careOf value for this AD.
     * 
     * @return careOf The name of the party who will take receipt at the specified address,
 * and will take on responsibility for ensuring delivery to the target
 * recipient.
     */
    public java.lang.String getCareOf() {
        return careOf;
    }


    /**
     * Sets the careOf value for this AD.
     * 
     * @param careOf The name of the party who will take receipt at the specified address,
 * and will take on responsibility for ensuring delivery to the target
 * recipient.
     */
    public void setCareOf(java.lang.String careOf) {
        this.careOf = careOf;
    }


    /**
     * Gets the censusTract value for this AD.
     * 
     * @return censusTract A geographic sub-unit delineated for demographic purposes.
     */
    public java.lang.String getCensusTract() {
        return censusTract;
    }


    /**
     * Sets the censusTract value for this AD.
     * 
     * @param censusTract A geographic sub-unit delineated for demographic purposes.
     */
    public void setCensusTract(java.lang.String censusTract) {
        this.censusTract = censusTract;
    }


    /**
     * Gets the cityOrMunicipality value for this AD.
     * 
     * @return cityOrMunicipality The name of the city, town, village, or other community or delivery
 * center.
     */
    public java.lang.String getCityOrMunicipality() {
        return cityOrMunicipality;
    }


    /**
     * Sets the cityOrMunicipality value for this AD.
     * 
     * @param cityOrMunicipality The name of the city, town, village, or other community or delivery
 * center.
     */
    public void setCityOrMunicipality(java.lang.String cityOrMunicipality) {
        this.cityOrMunicipality = cityOrMunicipality;
    }


    /**
     * Gets the country value for this AD.
     * 
     * @return country A national entity.  
 * 
 * For example, Mexico, United Kingdom.
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this AD.
     * 
     * @param country A national entity.  
 * 
 * For example, Mexico, United Kingdom.
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the countyOfParish value for this AD.
     * 
     * @return countyOfParish A sub-unit of a state or province. (49 of the United States of
 * America use the term "county;" Louisiana uses the term "parish".)
     */
    public java.lang.String getCountyOfParish() {
        return countyOfParish;
    }


    /**
     * Sets the countyOfParish value for this AD.
     * 
     * @param countyOfParish A sub-unit of a state or province. (49 of the United States of
 * America use the term "county;" Louisiana uses the term "parish".)
     */
    public void setCountyOfParish(java.lang.String countyOfParish) {
        this.countyOfParish = countyOfParish;
    }


    /**
     * Gets the delimiter value for this AD.
     * 
     * @return delimiter Delimiters are printed without framing white space. If no value
 * component is provided, the delimiter appears as a line break.
     */
    public java.lang.String getDelimiter() {
        return delimiter;
    }


    /**
     * Sets the delimiter value for this AD.
     * 
     * @param delimiter Delimiters are printed without framing white space. If no value
 * component is provided, the delimiter appears as a line break.
     */
    public void setDelimiter(java.lang.String delimiter) {
        this.delimiter = delimiter;
    }


    /**
     * Gets the deliveryAddressLine value for this AD.
     * 
     * @return deliveryAddressLine A delivery address line is frequently used instead of breaking
 * out delivery mode, delivery installation, etc. An address generally
 * has only a delivery address line or a street address line, but not
 * both.
     */
    public java.lang.String getDeliveryAddressLine() {
        return deliveryAddressLine;
    }


    /**
     * Sets the deliveryAddressLine value for this AD.
     * 
     * @param deliveryAddressLine A delivery address line is frequently used instead of breaking
 * out delivery mode, delivery installation, etc. An address generally
 * has only a delivery address line or a street address line, but not
 * both.
     */
    public void setDeliveryAddressLine(java.lang.String deliveryAddressLine) {
        this.deliveryAddressLine = deliveryAddressLine;
    }


    /**
     * Gets the deliveryInstallationArea value for this AD.
     * 
     * @return deliveryInstallationArea The location of the delivery installation, usually a town or city,
 * and is only required if the area is different from the municipality.
 * Area to which mail delivery service is provided from any postal facility
 * or service such as an individual letter carrier, rural route, or postal
 * route.
     */
    public java.lang.String getDeliveryInstallationArea() {
        return deliveryInstallationArea;
    }


    /**
     * Sets the deliveryInstallationArea value for this AD.
     * 
     * @param deliveryInstallationArea The location of the delivery installation, usually a town or city,
 * and is only required if the area is different from the municipality.
 * Area to which mail delivery service is provided from any postal facility
 * or service such as an individual letter carrier, rural route, or postal
 * route.
     */
    public void setDeliveryInstallationArea(java.lang.String deliveryInstallationArea) {
        this.deliveryInstallationArea = deliveryInstallationArea;
    }


    /**
     * Gets the deliveryInstallationQualifier value for this AD.
     * 
     * @return deliveryInstallationQualifier A number, letter or name identifying a delivery installation.
 * 
 * For example., for Station A, the delivery installation qualifier would
 * be 'A'.
     */
    public java.lang.String getDeliveryInstallationQualifier() {
        return deliveryInstallationQualifier;
    }


    /**
     * Sets the deliveryInstallationQualifier value for this AD.
     * 
     * @param deliveryInstallationQualifier A number, letter or name identifying a delivery installation.
 * 
 * For example., for Station A, the delivery installation qualifier would
 * be 'A'.
     */
    public void setDeliveryInstallationQualifier(java.lang.String deliveryInstallationQualifier) {
        this.deliveryInstallationQualifier = deliveryInstallationQualifier;
    }


    /**
     * Gets the deliveryInstallationType value for this AD.
     * 
     * @return deliveryInstallationType Indicates the type of delivery installation (the facility to which
 * the mail will be delivered prior to final shipping via the delivery
 * mode.) Example: post office, letter carrier depot, community mail
 * center, station, etc.
     */
    public java.lang.String getDeliveryInstallationType() {
        return deliveryInstallationType;
    }


    /**
     * Sets the deliveryInstallationType value for this AD.
     * 
     * @param deliveryInstallationType Indicates the type of delivery installation (the facility to which
 * the mail will be delivered prior to final shipping via the delivery
 * mode.) Example: post office, letter carrier depot, community mail
 * center, station, etc.
     */
    public void setDeliveryInstallationType(java.lang.String deliveryInstallationType) {
        this.deliveryInstallationType = deliveryInstallationType;
    }


    /**
     * Gets the deliveryMode value for this AD.
     * 
     * @return deliveryMode Indicates the type of service offered, method of delivery. 
 * 
 * For example: post office box, rural route, general delivery, etc.
     */
    public java.lang.String getDeliveryMode() {
        return deliveryMode;
    }


    /**
     * Sets the deliveryMode value for this AD.
     * 
     * @param deliveryMode Indicates the type of service offered, method of delivery. 
 * 
 * For example: post office box, rural route, general delivery, etc.
     */
    public void setDeliveryMode(java.lang.String deliveryMode) {
        this.deliveryMode = deliveryMode;
    }


    /**
     * Gets the deliveryModeIdentifier value for this AD.
     * 
     * @return deliveryModeIdentifier Represents the routing information such as a letter carrier route
 * number. It is the identifying number of the designator (the box number
 * or rural route number).
     */
    public java.lang.String getDeliveryModeIdentifier() {
        return deliveryModeIdentifier;
    }


    /**
     * Sets the deliveryModeIdentifier value for this AD.
     * 
     * @param deliveryModeIdentifier Represents the routing information such as a letter carrier route
 * number. It is the identifying number of the designator (the box number
 * or rural route number).
     */
    public void setDeliveryModeIdentifier(java.lang.String deliveryModeIdentifier) {
        this.deliveryModeIdentifier = deliveryModeIdentifier;
    }


    /**
     * Gets the direction value for this AD.
     * 
     * @return direction The compass direction. 
 * 
 * For example, N, S, W, E.
     */
    public java.lang.String getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this AD.
     * 
     * @param direction The compass direction. 
 * 
 * For example, N, S, W, E.
     */
    public void setDirection(java.lang.String direction) {
        this.direction = direction;
    }


    /**
     * Gets the isNotOrdered value for this AD.
     * 
     * @return isNotOrdered A boolean value specifying whether the order of the address parts
 * is known or not. While the address parts are always a Sequence, the
 * order in which they are presented may or may not be known. Where this
 * matters, the isNotOrdered property can be used to convey this information.
     */
    public boolean isIsNotOrdered() {
        return isNotOrdered;
    }


    /**
     * Sets the isNotOrdered value for this AD.
     * 
     * @param isNotOrdered A boolean value specifying whether the order of the address parts
 * is known or not. While the address parts are always a Sequence, the
 * order in which they are presented may or may not be known. Where this
 * matters, the isNotOrdered property can be used to convey this information.
     */
    public void setIsNotOrdered(boolean isNotOrdered) {
        this.isNotOrdered = isNotOrdered;
    }


    /**
     * Gets the postalCode value for this AD.
     * 
     * @return postalCode A postal code designating a region defined by the postal service.
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this AD.
     * 
     * @param postalCode A postal code designating a region defined by the postal service.
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the postBox value for this AD.
     * 
     * @return postBox A numbered box located in a post station.
     */
    public java.lang.String getPostBox() {
        return postBox;
    }


    /**
     * Sets the postBox value for this AD.
     * 
     * @param postBox A numbered box located in a post station.
     */
    public void setPostBox(java.lang.String postBox) {
        this.postBox = postBox;
    }


    /**
     * Gets the precinct value for this AD.
     * 
     * @return precinct A subsection of a municipality.
     */
    public java.lang.String getPrecinct() {
        return precinct;
    }


    /**
     * Sets the precinct value for this AD.
     * 
     * @param precinct A subsection of a municipality.
     */
    public void setPrecinct(java.lang.String precinct) {
        this.precinct = precinct;
    }


    /**
     * Gets the stateOrProvince value for this AD.
     * 
     * @return stateOrProvince A sub-unit of a country with limited sovereignty in a federally
 * organized country.
     */
    public java.lang.String getStateOrProvince() {
        return stateOrProvince;
    }


    /**
     * Sets the stateOrProvince value for this AD.
     * 
     * @param stateOrProvince A sub-unit of a country with limited sovereignty in a federally
 * organized country.
     */
    public void setStateOrProvince(java.lang.String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }


    /**
     * Gets the streetAddressLine value for this AD.
     * 
     * @return streetAddressLine Indicates the line for the street address.
     */
    public java.lang.String getStreetAddressLine() {
        return streetAddressLine;
    }


    /**
     * Sets the streetAddressLine value for this AD.
     * 
     * @param streetAddressLine Indicates the line for the street address.
     */
    public void setStreetAddressLine(java.lang.String streetAddressLine) {
        this.streetAddressLine = streetAddressLine;
    }


    /**
     * Gets the streetName value for this AD.
     * 
     * @return streetName The text idenfifier for the street.
     */
    public java.lang.String getStreetName() {
        return streetName;
    }


    /**
     * Sets the streetName value for this AD.
     * 
     * @param streetName The text idenfifier for the street.
     */
    public void setStreetName(java.lang.String streetName) {
        this.streetName = streetName;
    }


    /**
     * Gets the streetNameBase value for this AD.
     * 
     * @return streetNameBase The base name of a roadway or artery recognized by a municipality
 * (excluding street type and direction)
     */
    public java.lang.String getStreetNameBase() {
        return streetNameBase;
    }


    /**
     * Sets the streetNameBase value for this AD.
     * 
     * @param streetNameBase The base name of a roadway or artery recognized by a municipality
 * (excluding street type and direction)
     */
    public void setStreetNameBase(java.lang.String streetNameBase) {
        this.streetNameBase = streetNameBase;
    }


    /**
     * Gets the streetType value for this AD.
     * 
     * @return streetType The designation given to the street. 
 * 
 * For example, Street, Avenue, Crescent, etc.
     */
    public java.lang.String getStreetType() {
        return streetType;
    }


    /**
     * Sets the streetType value for this AD.
     * 
     * @param streetType The designation given to the street. 
 * 
 * For example, Street, Avenue, Crescent, etc.
     */
    public void setStreetType(java.lang.String streetType) {
        this.streetType = streetType;
    }


    /**
     * Gets the unitDesignator value for this AD.
     * 
     * @return unitDesignator Indicates the type of specific unit contained within a building
 * or complex.  
 * 
 * For example, Apartment, Floor.
     */
    public java.lang.String getUnitDesignator() {
        return unitDesignator;
    }


    /**
     * Sets the unitDesignator value for this AD.
     * 
     * @param unitDesignator Indicates the type of specific unit contained within a building
 * or complex.  
 * 
 * For example, Apartment, Floor.
     */
    public void setUnitDesignator(java.lang.String unitDesignator) {
        this.unitDesignator = unitDesignator;
    }


    /**
     * Gets the unitIdentifier value for this AD.
     * 
     * @return unitIdentifier The number or name of a specific unit contained within a building
 * or complex, as assigned by that building or complex.
     */
    public java.lang.String getUnitIdentifier() {
        return unitIdentifier;
    }


    /**
     * Sets the unitIdentifier value for this AD.
     * 
     * @param unitIdentifier The number or name of a specific unit contained within a building
 * or complex, as assigned by that building or complex.
     */
    public void setUnitIdentifier(java.lang.String unitIdentifier) {
        this.unitIdentifier = unitIdentifier;
    }


    /**
     * Gets the use value for this AD.
     * 
     * @return use A set of codes advising a system or user which address in a set
 * of like addresses to select for a given purpose.
     */
    public java.lang.String getUse() {
        return use;
    }


    /**
     * Sets the use value for this AD.
     * 
     * @param use A set of codes advising a system or user which address in a set
 * of like addresses to select for a given purpose.
     */
    public void setUse(java.lang.String use) {
        this.use = use;
    }


    /**
     * Gets the useablePeriod value for this AD.
     * 
     * @return useablePeriod A General Timing Specification (GTS) specifying the periods of
 * time during which the address can be used. This is used to specify
 * different addresses for different times of the week or year.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.IVLTS getUseablePeriod() {
        return useablePeriod;
    }


    /**
     * Sets the useablePeriod value for this AD.
     * 
     * @param useablePeriod A General Timing Specification (GTS) specifying the periods of
 * time during which the address can be used. This is used to specify
 * different addresses for different times of the week or year.
     */
    public void setUseablePeriod(gov.nih.nci.cabig.ccts.domain.cdt.IVLTS useablePeriod) {
        this.useablePeriod = useablePeriod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AD)) return false;
        AD other = (AD) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.additionalLocator==null && other.getAdditionalLocator()==null) || 
             (this.additionalLocator!=null &&
              this.additionalLocator.equals(other.getAdditionalLocator()))) &&
            ((this.buildingNumber==null && other.getBuildingNumber()==null) || 
             (this.buildingNumber!=null &&
              this.buildingNumber.equals(other.getBuildingNumber()))) &&
            ((this.buildingNumberNumeric==null && other.getBuildingNumberNumeric()==null) || 
             (this.buildingNumberNumeric!=null &&
              this.buildingNumberNumeric.equals(other.getBuildingNumberNumeric()))) &&
            ((this.buildingNumberSuffix==null && other.getBuildingNumberSuffix()==null) || 
             (this.buildingNumberSuffix!=null &&
              this.buildingNumberSuffix.equals(other.getBuildingNumberSuffix()))) &&
            ((this.careOf==null && other.getCareOf()==null) || 
             (this.careOf!=null &&
              this.careOf.equals(other.getCareOf()))) &&
            ((this.censusTract==null && other.getCensusTract()==null) || 
             (this.censusTract!=null &&
              this.censusTract.equals(other.getCensusTract()))) &&
            ((this.cityOrMunicipality==null && other.getCityOrMunicipality()==null) || 
             (this.cityOrMunicipality!=null &&
              this.cityOrMunicipality.equals(other.getCityOrMunicipality()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.countyOfParish==null && other.getCountyOfParish()==null) || 
             (this.countyOfParish!=null &&
              this.countyOfParish.equals(other.getCountyOfParish()))) &&
            ((this.delimiter==null && other.getDelimiter()==null) || 
             (this.delimiter!=null &&
              this.delimiter.equals(other.getDelimiter()))) &&
            ((this.deliveryAddressLine==null && other.getDeliveryAddressLine()==null) || 
             (this.deliveryAddressLine!=null &&
              this.deliveryAddressLine.equals(other.getDeliveryAddressLine()))) &&
            ((this.deliveryInstallationArea==null && other.getDeliveryInstallationArea()==null) || 
             (this.deliveryInstallationArea!=null &&
              this.deliveryInstallationArea.equals(other.getDeliveryInstallationArea()))) &&
            ((this.deliveryInstallationQualifier==null && other.getDeliveryInstallationQualifier()==null) || 
             (this.deliveryInstallationQualifier!=null &&
              this.deliveryInstallationQualifier.equals(other.getDeliveryInstallationQualifier()))) &&
            ((this.deliveryInstallationType==null && other.getDeliveryInstallationType()==null) || 
             (this.deliveryInstallationType!=null &&
              this.deliveryInstallationType.equals(other.getDeliveryInstallationType()))) &&
            ((this.deliveryMode==null && other.getDeliveryMode()==null) || 
             (this.deliveryMode!=null &&
              this.deliveryMode.equals(other.getDeliveryMode()))) &&
            ((this.deliveryModeIdentifier==null && other.getDeliveryModeIdentifier()==null) || 
             (this.deliveryModeIdentifier!=null &&
              this.deliveryModeIdentifier.equals(other.getDeliveryModeIdentifier()))) &&
            ((this.direction==null && other.getDirection()==null) || 
             (this.direction!=null &&
              this.direction.equals(other.getDirection()))) &&
            this.isNotOrdered == other.isIsNotOrdered() &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.postBox==null && other.getPostBox()==null) || 
             (this.postBox!=null &&
              this.postBox.equals(other.getPostBox()))) &&
            ((this.precinct==null && other.getPrecinct()==null) || 
             (this.precinct!=null &&
              this.precinct.equals(other.getPrecinct()))) &&
            ((this.stateOrProvince==null && other.getStateOrProvince()==null) || 
             (this.stateOrProvince!=null &&
              this.stateOrProvince.equals(other.getStateOrProvince()))) &&
            ((this.streetAddressLine==null && other.getStreetAddressLine()==null) || 
             (this.streetAddressLine!=null &&
              this.streetAddressLine.equals(other.getStreetAddressLine()))) &&
            ((this.streetName==null && other.getStreetName()==null) || 
             (this.streetName!=null &&
              this.streetName.equals(other.getStreetName()))) &&
            ((this.streetNameBase==null && other.getStreetNameBase()==null) || 
             (this.streetNameBase!=null &&
              this.streetNameBase.equals(other.getStreetNameBase()))) &&
            ((this.streetType==null && other.getStreetType()==null) || 
             (this.streetType!=null &&
              this.streetType.equals(other.getStreetType()))) &&
            ((this.unitDesignator==null && other.getUnitDesignator()==null) || 
             (this.unitDesignator!=null &&
              this.unitDesignator.equals(other.getUnitDesignator()))) &&
            ((this.unitIdentifier==null && other.getUnitIdentifier()==null) || 
             (this.unitIdentifier!=null &&
              this.unitIdentifier.equals(other.getUnitIdentifier()))) &&
            ((this.use==null && other.getUse()==null) || 
             (this.use!=null &&
              this.use.equals(other.getUse()))) &&
            ((this.useablePeriod==null && other.getUseablePeriod()==null) || 
             (this.useablePeriod!=null &&
              this.useablePeriod.equals(other.getUseablePeriod())));
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
        if (getAdditionalLocator() != null) {
            _hashCode += getAdditionalLocator().hashCode();
        }
        if (getBuildingNumber() != null) {
            _hashCode += getBuildingNumber().hashCode();
        }
        if (getBuildingNumberNumeric() != null) {
            _hashCode += getBuildingNumberNumeric().hashCode();
        }
        if (getBuildingNumberSuffix() != null) {
            _hashCode += getBuildingNumberSuffix().hashCode();
        }
        if (getCareOf() != null) {
            _hashCode += getCareOf().hashCode();
        }
        if (getCensusTract() != null) {
            _hashCode += getCensusTract().hashCode();
        }
        if (getCityOrMunicipality() != null) {
            _hashCode += getCityOrMunicipality().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getCountyOfParish() != null) {
            _hashCode += getCountyOfParish().hashCode();
        }
        if (getDelimiter() != null) {
            _hashCode += getDelimiter().hashCode();
        }
        if (getDeliveryAddressLine() != null) {
            _hashCode += getDeliveryAddressLine().hashCode();
        }
        if (getDeliveryInstallationArea() != null) {
            _hashCode += getDeliveryInstallationArea().hashCode();
        }
        if (getDeliveryInstallationQualifier() != null) {
            _hashCode += getDeliveryInstallationQualifier().hashCode();
        }
        if (getDeliveryInstallationType() != null) {
            _hashCode += getDeliveryInstallationType().hashCode();
        }
        if (getDeliveryMode() != null) {
            _hashCode += getDeliveryMode().hashCode();
        }
        if (getDeliveryModeIdentifier() != null) {
            _hashCode += getDeliveryModeIdentifier().hashCode();
        }
        if (getDirection() != null) {
            _hashCode += getDirection().hashCode();
        }
        _hashCode += (isIsNotOrdered() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getPostBox() != null) {
            _hashCode += getPostBox().hashCode();
        }
        if (getPrecinct() != null) {
            _hashCode += getPrecinct().hashCode();
        }
        if (getStateOrProvince() != null) {
            _hashCode += getStateOrProvince().hashCode();
        }
        if (getStreetAddressLine() != null) {
            _hashCode += getStreetAddressLine().hashCode();
        }
        if (getStreetName() != null) {
            _hashCode += getStreetName().hashCode();
        }
        if (getStreetNameBase() != null) {
            _hashCode += getStreetNameBase().hashCode();
        }
        if (getStreetType() != null) {
            _hashCode += getStreetType().hashCode();
        }
        if (getUnitDesignator() != null) {
            _hashCode += getUnitDesignator().hashCode();
        }
        if (getUnitIdentifier() != null) {
            _hashCode += getUnitIdentifier().hashCode();
        }
        if (getUse() != null) {
            _hashCode += getUse().hashCode();
        }
        if (getUseablePeriod() != null) {
            _hashCode += getUseablePeriod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "AD"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalLocator");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "additionalLocator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "buildingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildingNumberNumeric");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "buildingNumberNumeric"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildingNumberSuffix");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "buildingNumberSuffix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("careOf");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "careOf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("censusTract");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "censusTract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityOrMunicipality");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "cityOrMunicipality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countyOfParish");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "countyOfParish"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delimiter");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "delimiter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryAddressLine");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "deliveryAddressLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryInstallationArea");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "deliveryInstallationArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryInstallationQualifier");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "deliveryInstallationQualifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryInstallationType");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "deliveryInstallationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryMode");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "deliveryMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryModeIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "deliveryModeIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direction");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "direction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNotOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "isNotOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "postalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBox");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "postBox"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("precinct");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "precinct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateOrProvince");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "stateOrProvince"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetAddressLine");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "streetAddressLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetName");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "streetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetNameBase");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "streetNameBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetType");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "streetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitDesignator");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "unitDesignator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "unitIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("use");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "use"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useablePeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "useablePeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "IVLTS"));
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
