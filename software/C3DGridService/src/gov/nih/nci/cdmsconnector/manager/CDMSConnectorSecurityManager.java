/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.cdmsconnector.manager;

public interface CDMSConnectorSecurityManager {
	
	public static final String ENROLLPATIENT_SERVICE="HealthcareSite";
	public static final String LOADLABS_SERVICE="LOADLABS_SERVICE";
	public static final String GETSTUDYCDES_SERVICE="GETSTUDYCDES_SERVICE";
	public static final String GETSTUDYCDEDATA_SERVICE="GETSTUDYCDEDATA_SERVICE";
	public static final String ISVALIDSTUDY_SERVICE="ISVALIDSTUDY_SERVICE";
	
	public static final String ACCESS="ACCESS";
	
	public boolean canAccess(String userName, String serviceName, String privName);

}
