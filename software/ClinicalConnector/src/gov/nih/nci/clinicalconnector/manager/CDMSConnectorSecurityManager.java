package gov.nih.nci.clinicalconnector.manager;

import gov.nih.nci.cabig.ctms.suite.authorization.SuiteRole;

public interface CDMSConnectorSecurityManager {
	
	public static final String ENROLLPATIENT_SERVICE="ENROLLPATIENT_SERVICE";
	public static final String LOADLABS_SERVICE="LOADLABS_SERVICE";
	public static final String GETSTUDYCDES_SERVICE="GETSTUDYCDES_SERVICE";
	public static final String GETSTUDYCDEDATA_SERVICE="GETSTUDYCDEDATA_SERVICE";
	public static final String ISVALIDSTUDY_SERVICE="ISVALIDSTUDY_SERVICE";
	
	public static final String ACCESS="ACCESS";
	
	public boolean canAccess(String userName, String serviceName, String privName);
	public void checkLabAuthorization(String callerId, String studyName, String siteName, SuiteRole checkRole) throws Exception;
    public void checkAuthorization(String callerId, String studyName, String siteName, SuiteRole checkRole) throws Exception;
    public SuiteRole getRole(String roleText);
}
