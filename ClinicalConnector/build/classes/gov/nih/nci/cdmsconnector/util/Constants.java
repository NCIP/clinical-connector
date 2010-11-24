package gov.nih.nci.cdmsconnector.util;

public class Constants {
	public Constants(){
		
	}
	
	// C3D Credential properties
	 public static final String SYSTEM_ID= "C3D";
	 public static final String DRIVER_CLASS_NAME= "oracle.jdbc.OracleDriver";
	 public static final String URL = "jdbc:oracle:thin:@cbiodb2-d.nci.nih.gov:1521:cccdev";
	
	// Messages
	 public static final String VALID_USER_CREDENTIALS_MESSAGE = "Valid User Credentials.";
	 public static final String INVALID_USER_CREDENTIALS_MESSAGE = "Invalid User Credentials.";
	 public static final String UNABLE_TO_VERIFY_USER_CREDENTIALS_MESSAGE = "Unable to verify User Credentials.";
	 public static final String UNAME = "UNAME";
	 public static final String PWORD = "PWORD";
	 public static final String C3D_TNS_ENTRY = "C3D_TNS_ENTRY";
	 public static final String STATUS = "STATUS";
	 public static final String STUDY = "STUDY";
	 
     public static final String OFF_STUDY_REASON_CDE = "OFF_STUDY_REASON_CDE";
     public static final String OFF_STUDY_DATE_CDE = "OFF_STUDY_DATE_CDE";
     public static final String OFF_TREATMENT_REASON_CDE = "OFF_TREATMENT_REASON_CDE";
     public static final String OFF_TREATMENT_DATE_CDE = "OFF_TREATMENT_DATE_CDE";
     public static final String REFERENCE_CODE = "REFERENCE_CODE";
     public static final String CDE = "CDE";
     public static final String PT_ID_CDE = "PT_ID_CDE";
     public static final String NCI_INST_CODE_CDE = "NCI_INST_CODE_CDE";
     /* PRC new for v2.2*/
     public static final String CONSENT_DATE    = "CONSENT_DATE";	
     public static final String CONSENT_VERSION	= "CONSENT_VERSION";
     public static final String PT_INITS	    = "PT_INITS";
     public static final String PT_DOB  	    = "PT_DOB";
     public static final String PT_GENDER  	    = "PT_GENDER";
     public static final String REG_DATE  	    = "REG_DATE";

	 
	 // C3D Properties from c3ds.properties file.
	 public static final String C3DDS_URL= "c3dds.dburl";
	 public static final String C3DDS_DRIVERCLASSNAME= "c3dds.dbdriverClassName";
	 public static final String C3DDS_USERNAME= "c3dds.dbusername";
	 public static final String C3DDS_PASSWORD= "c3dds.dbpassword";
	 public static final String NCI_INST_CD_CDE = "NCI_INST_CD_CDE";
	 public static final String C3D_HOT_LINK_URL = "c3d.hotLink.url";
	 // PRC Added Properties
	 public static final String ClinConCSMAppName = "csm.application.name";
	 public static final String ClinConCSMRegRole = "csm.enroll.role";
	 public static final String ClinConCSMLabRole = "csm.lab.role";
	 public static final String ClinConCSMCDERole = "csm.CDE.role";
	 public static final String ClinConCSMCDEDATARole = "csm.CDEData.role";
	 
	 
	

     
     
     
}
