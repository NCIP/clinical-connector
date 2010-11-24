package gov.nih.nci.clinicalconnector.dao.c3d;

import gov.nih.nci.cdmsconnector.domain.CommonDataElement;
import gov.nih.nci.cdmsconnector.domain.DataCollectionInstrument;
import gov.nih.nci.cdmsconnector.domain.DataCollectionModule;
import gov.nih.nci.cdmsconnector.domain.Event;
import gov.nih.nci.cdmsconnector.domain.GetStudyCDEDataRequest;
import gov.nih.nci.cdmsconnector.domain.GetStudyCDEsRequest;
import gov.nih.nci.cdmsconnector.domain.Question;
import gov.nih.nci.cdmsconnector.domain.QuestionGroup;
import gov.nih.nci.cdmsconnector.domain.Study;
import gov.nih.nci.cdmsconnector.domain.StudySubject;
import gov.nih.nci.clinicalconnector.c3d.security.C3DUser;
import gov.nih.nci.clinicalconnector.c3d.security.CSMCDMSConnectorSecurityManagerImpl;
import gov.nih.nci.clinicalconnector.dao.BaseJDBCDAO;
import gov.nih.nci.clinicalconnector.dao.GetStudyCDEDataDAO;
import gov.nih.nci.clinicalconnector.manager.AccessPermissionException;
import gov.nih.nci.cdmsconnector.util.Constants;
import gov.nih.nci.security.AuthorizationManager;
import gov.nih.nci.security.SecurityServiceProvider;
import gov.nih.nci.security.exceptions.CSConfigurationException;
import gov.nih.nci.security.exceptions.CSException;
import gov.nih.nci.security.util.StringEncrypter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.apache.log4j.Logger;
import org.cagrid.gaards.websso.utils.WebSSOConstants;
import org.globus.gsi.GlobusCredential;
import org.jasig.cas.authentication.Authentication;
import org.jasig.cas.authentication.principal.UsernamePasswordCredentials;

import com.opensymphony.xwork2.ActionContext;

public class GetStudyCDEDataOracleDAOImpl extends OracleDAO implements GetStudyCDEDataDAO {

	private final static Logger log = Logger
			.getLogger(GetStudyCDEDataOracleDAOImpl.class.getName());
	
	private CSMCDMSConnectorSecurityManagerImpl securityManager;
	
	// prc added this string for v2.2 security - Is Study Accessible by User
	private final static String STUDY_ACCESSIBLE = "select STUDY " 
		+ "from C3D_ACCESSIBLE_STUDIES_VW "
		+ "where STUDY = ?";
	
	// prc added this string for v2.2 security - What is Study Security Level
	private final static String FIND_STUDY_ACCESS = "select ACCESS_METHOD " 
		+ "from STUDY_SECURITY_LEVEL "
		+ "where STUDY = ?";

	// prc added this string for v2.2 security - What is DEFAULT Study Security Level
	private final static String FIND_DEFAULT_STUDY_ACCESS = "select ACCESS_METHOD " 
		+ "from STUDY_SECURITY_LEVEL "
		+ "where STUDY = 'ALL'";
	
	// prc added this string for v2.2 security
    private final static String GET_C3D_CREDENTIALS = "select b.C3D_USERNAME, b.C3D_PASSWORD "
    	+ "FROM CSM_USER a, C3D_USER b "
    	+ "where a.user_id = b.user_id (+) "
    	+ "and login_name = ?";

	// the sql query for the case when no studyName is provided
	private final static String SQL1 = "select distinct s.study study_name,"
			+ "dci_modules dcim, q.name question_name, dq.DEFAULT_PROMPT default_prompt, d.name dcm_name, "
			+ "d.SHORT_NAME, dq.DCM_QUESTION_ID question_id, dq.DCM_ID dcm_id,  s.task_id study_id, dci.name DCI_NAME, dqg.NAME QUESTGRP_NAME "
			+ "from questions q, "
			+ "dcm_questions dq, "
			+ "dcms d, "
			+ "ocl_studies s,  dcis dci, dcm_question_groups dqg "
			+ "where  q.status_comment_text =  ? "
			+ "and  q.question_status_code = 'A' "
			+ "and  dq.question_id = q.question_id "
			+ "and  d.dcm_id       = dq.dcm_id "
			+ "and  d.dcm_subset_sn= dq.dcm_que_dcm_subset_sn "
			+ "and  d.dcm_layout_sn= dq.dcm_que_dcm_layout_sn "
			+ "and  d.dcm_status_code = 'A' "
			+ "and  s.TASK_ID = d.CLINICAL_STUDY_ID and dci.dci_id = dcim.dci_id AND d.dcm_id = dcim.dcm_id "
			+ "AND dqg.dcm_id = dcim.dcm_id "
			+ "AND dqg.dcm_que_grp_dcm_subset_sn = dcim.dcm_subset_sn "
			+ "AND dqg.dcm_que_grp_dcm_layout_sn = dcim.dcm_layout_sn "
			+ "AND dq.dcm_id = dqg.dcm_id "
			+ "AND dq.dcm_que_dcm_subset_sn = dqg.dcm_que_grp_dcm_subset_sn "
			+ "AND dq.dcm_que_dcm_layout_sn = dqg.dcm_que_grp_dcm_layout_sn "
			+ "AND dq.dcm_question_group_id = dqg.dcm_question_grp_id "
			+ "AND dq.occurrence_sn = 0 "
			+ "and  dq.collected_in_subset_flag = 'Y' " + "order by 1,2,3,4 ";

	// the sql query for the case when a studyName is provided
	private final static String SQL1_1 = "select distinct s.study study_name,"
			+ "dci.name DCI_NAME, q.name question_name, dq.DEFAULT_PROMPT default_prompt, "
			+ "d.SHORT_NAME, dq.DCM_QUESTION_ID question_id, dq.DCM_ID dcm_id, s.task_id study_id, d.name dcm_name, dci.name DCI_NAME, dqg.NAME QUESTGRP_NAME "
			+ "from questions q, "
			+ "dcm_questions dq, "
			+ "dcms d, "
			+ "ocl_studies s,  dcis dci,dci_modules dcim, dcm_question_groups dqg "
			+ "where NVL(DQ.HELPTEXT, q.status_comment_text) =  ? "
			+ "and q.question_status_code = 'A' "
			+ "and dq.question_id = q.question_id "
			+ "and d.dcm_id = dq.dcm_id "
			+ "and d.dcm_subset_sn= dq.dcm_que_dcm_subset_sn "
			+ "and d.dcm_layout_sn= dq.dcm_que_dcm_layout_sn "
			+ "and d.dcm_status_code = 'A' "
			+ "and s.TASK_ID = d.CLINICAL_STUDY_ID "
			+ "and dq.collected_in_subset_flag = 'Y' "
			+ "and s.study = ? and dci.dci_id = dcim.dci_id AND d.dcm_id = dcim.dcm_id "
			+ "AND dqg.dcm_id = dcim.dcm_id "
			+ "AND dqg.dcm_que_grp_dcm_subset_sn = dcim.dcm_subset_sn "
			+ "AND dqg.dcm_que_grp_dcm_layout_sn = dcim.dcm_layout_sn "
			+ "AND dq.dcm_id = dqg.dcm_id "
			+ "AND dq.dcm_que_dcm_subset_sn = dqg.dcm_que_grp_dcm_subset_sn "
			+ "AND dq.dcm_que_dcm_layout_sn = dqg.dcm_que_grp_dcm_layout_sn "
			+ "AND dq.dcm_question_group_id = dqg.dcm_question_grp_id "
			+ "AND dq.occurrence_sn = 0 " + "order by 1,2,3,4 ";

	// sql query for getting the patient data for a given studyName and CDE
	private final static String SQL2 = "SELECT ? STUDY, ? dcm_id, ? DCI_NAME, "
		    + "? QUESTGRP_NAME, ? dcm_name, ? def_prompt, ? study_name, " 
		    + "? dci_name2, ? question_name, ? default_prompt, rd.PATIENT patient_pos, "
		    + "rd.CLIN_PLAN_EVE_NAME event_name, rd.dcm_date dcm_date, rd.dcm_time, "
			+ "r.VALUE_TEXT question_value, r.dcm_question_id question_id "
			+ "FROM RECEIVED_DCMS RD, "
			+ "RESPONSES R "
			+ "where RD.CLINICAL_STUDY_ID = R.CLINICAL_STUDY_ID "
			+ "AND RD.DCM_ID = ? "
			+ "AND RD.END_TS = to_date(3000000, 'J') "
			+ "AND R.END_TS = to_date(3000000, 'J') "
			+ "and r.received_dcm_id = rd.received_dcm_id "
			+ "AND r.CLINICAL_STUDY_ID = ? "
			+ "and r.dcm_question_id = ? "
			+ "order by STUDY, rd.PATIENT, rd.CLIN_PLAN_EVE_NAME, DCI_NAME, " 
			+ "DCM_NAME, QUESTGRP_NAME, question_name";

	private final static String GET_STUDY_CDE_SQL = "SELECT cs.study STUDY,"
			+ "cpe.NAME EVENT_NAME,"
			+ "dci.name DCI_NAME,"
			+ "dcm.NAME DCM_NAME,"
			+ "dcm.DCM_ID dcm_id,"
			+ "dqg.NAME QUESTGRP_NAME,"
			+ "dq.question_name QUEST_NAME,"
			+ "dq.DCM_QUESTION_ID question_id, "
			+ "'' question_value,"
			+ "dq.default_prompt DEF_PROMPT,"
			+ "nvl(dq.help_text, q.STATUS_COMMENT_TEXT) CDE_FULL_TEXT,"
			+ "ltrim(substr(nvl(dq.help_text, q.STATUS_COMMENT_TEXT),1,instr(nvl(dq.help_text, q.STATUS_COMMENT_TEXT),'VERSION')-1),'CDE_ID:') CDE_ID,"
			+ "ltrim(substr(nvl(dq.help_text, q.STATUS_COMMENT_TEXT),instr(nvl(dq.help_text, q.STATUS_COMMENT_TEXT),'VERSION')),'VERSION:') VERSION "
			+ "FROM dcis dci,"
			+ "dci_modules dcim,"
			+ "dcms dcm,"
			+ "dcm_question_groups dqg,"
			+ "dcm_questions dq,"
			+ "questions q, "
			+ "dci_books db,"
			+ "dci_book_pages dcibp,"
			+ "clinical_planned_events cpe,"
			+ "clinical_studies cs "
			+ "WHERE dci.dci_id = dcim.dci_id "
			+ "AND dcm.dcm_id = dcim.dcm_id "
			+ "AND dcm.dcm_subset_sn = dcim.dcm_subset_sn "
			+ "AND dcm.dcm_layout_sn = dcim.dcm_layout_sn "
			+ "AND dqg.dcm_id = dcim.dcm_id "
			+ "AND dqg.dcm_que_grp_dcm_subset_sn = dcim.dcm_subset_sn "
			+ "AND dqg.dcm_que_grp_dcm_layout_sn = dcim.dcm_layout_sn "
			+ "AND dq.dcm_id = dqg.dcm_id "
			+ "AND dq.dcm_que_dcm_subset_sn = dqg.dcm_que_grp_dcm_subset_sn "
			+ "AND dq.dcm_que_dcm_layout_sn = dqg.dcm_que_grp_dcm_layout_sn "
			+ "AND dq.dcm_question_group_id = dqg.dcm_question_grp_id "
			+ "AND dq.occurrence_sn = 0 "
			+ "and q.QUESTION_STATUS_CODE = 'A' "
			+ "and dq.question_id = q.question_id " 
			+ "AND dcibp.dci_id = dci.dci_id "
			+ "AND dcibp.clin_plan_eve_id = cpe.clin_plan_eve_id "
			+ "AND dcibp.dci_book_id = db.dci_book_id "
			+ "AND cs.clinical_study_id = dci.clinical_study_id "
			+ "AND cs.clinical_study_id = dcim.clinical_study_id "
			+ "AND cs.clinical_study_id = dcm.clinical_study_id "
			+ "AND cs.clinical_study_id = dqg.clinical_study_id "
			+ "AND cs.clinical_study_id = dq.clinical_study_id "
			+ "AND cs.clinical_study_id = dcibp.clinical_study_id "
			+ "AND cs.clinical_study_id = db.clinical_study_id "
			+ "AND dci.dci_status_code = 'A' "
			+ "AND dcm.dcm_status_code = 'A' "
			+ "AND dq.collected_flag = 'Y' "
			+ "AND dq.collected_in_subset_flag = 'Y' "
			+ "and dqg.collected_flag = 'Y' "
			+ "AND db.dci_book_status_code = 'A' "
			+ "AND db.default_flag = 'Y' "
			+ "AND cs.study LIKE ? "
			+ "ORDER BY cs.study, cpe.CLIN_PLAN_EVE_SN, dci.name, dcm.NAME, dqg.display_sn, dq.display_sn";

	private final static String GET_STUDY_CDE_SQL_NO_STUDY = "SELECT cs.study STUDY,"
			+ "cpe.NAME EVENT_NAME,"
			+ "dci.name DCI_NAME,"
			+ "dcm.NAME DCM_NAME,"
			+ "dcm.DCM_ID dcm_id,"
			+ "dqg.NAME QUESTGRP_NAME,"
			+ "dq.question_name QUEST_NAME,"
			+ "dq.DCM_QUESTION_ID question_id, "
			+ "'' question_value,"
			+ "dq.default_prompt DEF_PROMPT,"
			+ "dq.help_text CDE_FULL_TEXT,"
			+ "ltrim(substr(dq.HELP_TEXT,1,instr(dq.help_text,'VERSION')-1),'CDE_ID:') CDE_ID,"
			+ "ltrim(substr(dq.HELP_TEXT,instr(dq.help_text,'VERSION')),'VERSION:') VERSION "
			+ "FROM dcis dci,"
			+ "dci_modules dcim,"
			+ "dcms dcm,"
			+ "dcm_question_groups dqg,"
			+ "dcm_questions dq,"
			+ "dci_books db,"
			+ "dci_book_pages dcibp,"
			+ "clinical_planned_events cpe,"
			+ "clinical_studies cs "
			+ "WHERE dci.dci_id = dcim.dci_id "
			+ "AND dcm.dcm_id = dcim.dcm_id "
			+ "AND dcm.dcm_subset_sn = dcim.dcm_subset_sn "
			+ "AND dcm.dcm_layout_sn = dcim.dcm_layout_sn "
			+ "AND dqg.dcm_id = dcim.dcm_id "
			+ "AND dqg.dcm_que_grp_dcm_subset_sn = dcim.dcm_subset_sn "
			+ "AND dqg.dcm_que_grp_dcm_layout_sn = dcim.dcm_layout_sn "
			+ "AND dq.dcm_id = dqg.dcm_id "
			+ "AND dq.dcm_que_dcm_subset_sn = dqg.dcm_que_grp_dcm_subset_sn "
			+ "AND dq.dcm_que_dcm_layout_sn = dqg.dcm_que_grp_dcm_layout_sn "
			+ "AND dq.dcm_question_group_id = dqg.dcm_question_grp_id "
			+ "AND dq.occurrence_sn = 0 "
			+ "AND dcibp.dci_id = dci.dci_id "
			+ "AND dcibp.clin_plan_eve_id = cpe.clin_plan_eve_id "
			+ "AND dcibp.dci_book_id = db.dci_book_id "
			+ "AND cs.clinical_study_id = dci.clinical_study_id "
			+ "AND cs.clinical_study_id = dcim.clinical_study_id "
			+ "AND cs.clinical_study_id = dcm.clinical_study_id "
			+ "AND cs.clinical_study_id = dqg.clinical_study_id "
			+ "AND cs.clinical_study_id = dq.clinical_study_id "
			+ "AND cs.clinical_study_id = dcibp.clinical_study_id "
			+ "AND cs.clinical_study_id = db.clinical_study_id "
			+ "AND dci.dci_status_code = 'A' "
			+ "AND dcm.dcm_status_code = 'A' "
			+ "AND dq.collected_flag = 'Y' "
			+ "AND dq.collected_in_subset_flag = 'Y' "
			+ "and dqg.collected_flag = 'Y' "
			+ "AND db.dci_book_status_code = 'A' "
			+ "AND db.default_flag = 'Y' "
			+ "ORDER BY cs.study, cpe.CLIN_PLAN_EVE_SN, dci.name, dcm.NAME, dqg.display_sn, dq.display_sn";

	protected static final String FIND_USER_QUERY = 
		"SELECT C3D_USERNAME, C3D_PASSWORD FROM C3D_USER " +
		"WHERE EXTRNL_LOGIN_NAME = ?";
	
	/**
	 * getData returns the data values and context for an entered CDE and C3D
	 * Study.
	 * 
	 * @param cde
	 *            the CDE from which the data is expected (cannot be null)
	 * @param studyName
	 *            name of the study for which the data is expected. If null data
	 *            for all the studies in the database is returned.
	 * @return
	 * @throws Exception
	 * 
	 */

	public Set<Study> getStudyCDEData(GetStudyCDEDataRequest getStudyCDEDataRequest)
			throws Exception {
		// TODO Auto-generated method stub
		/*
		 * The method works by making two sql queries. The first one takes a cde
		 * and study(?) and returns ordered rows of study, question,
		 * default_prompt and dcm (in that order)
		 * 
		 * The second query takes in dcm_id, study_id and question_id from the
		 * above and returns back Patient Position and Event Name (ordered)
		 * 
		 * The ordered results from the queries actually groups the items which
		 * is easier to fit in the StudyProtocol data structure.
		 */

		Set<Study> studies = new TreeSet<Study>();
		// studies = new
		// ArrayList<gov.nih.nci.cabig.ccts.domain.StudyProtocol>();

		String studyName = getStudyCDEDataRequest.getStudyName();
		CommonDataElement cde = getStudyCDEDataRequest.getCommonDataElement();

		if (cde == null || cde.getPublicIdentifier() == null
				|| "".equals(cde.getPublicIdentifier())
				|| cde.getVersion() == null || "".equals(cde.getVersion())) {
			throw new Exception("Invalid CDE ID / Version");
		}

		// C3D database expects cde's in the following format
		String cdeStr = "CDE_ID:" + cde.getPublicIdentifier() + "VERSION:"
				+ cde.getVersion();

		//PRC study access checking
		Connection cn = null;
		PreparedStatement stmt1 = null;
		PreparedStatement stmt2 = null;
		boolean isPublic = false;
		boolean atLeastOne = false;

		GlobusCredential globusCredential;
		String delegatedReference = null;

		
		try {
			cn = getConnection();

			stmt1 = cn.prepareStatement(FIND_STUDY_ACCESS);
			stmt1.setString(1, studyName);

			ResultSet rs1 = stmt1.executeQuery();

			while (rs1.next()) {
				atLeastOne = true;
				isPublic = rs1.getString("ACCESS_METHOD").equals("PUBLIC");
			}
            
			if (!atLeastOne) {
				atLeastOne = false;
				stmt2 = cn.prepareStatement(FIND_DEFAULT_STUDY_ACCESS);

				ResultSet rs2 = stmt1.executeQuery();

				while (rs2.next()) {
					atLeastOne = true;
					isPublic = rs2.getString("ACCESS_METHOD").equals("PUBLIC");
				}
				
				if (!atLeastOne) {
					isPublic = false;
				}
				
				stmt2.close();
			}
			
		} finally {
			try {
				stmt1.close();
			} catch (Exception ex) {
			}
			try {
				cn.close();
			} catch (Exception ex) {
			}
		}

		cn = null;
		String c3dUserName = null, c3dPassword = null, userDN = null;
		// Use C3D Username for PRIVATE studies.
		if (!isPublic) {
			//throw new Exception("Study " + studyName + " is PRIVATE.");
			//Get and check C3D Credentials
				
			//C3DUser c3dUser = null;
			//String c3dUserName = null, c3dPassword = null, userDN = null;
			//CSMCDMSConnectorSecurityManagerImpl securityManager = null;
			//AuthorizationManager authManager;
			//C3DUser user=null;
			
			// get current caGrid Username
			userDN = gov.nih.nci.cagrid.introduce.servicetools.security.SecurityUtils.getCallerIdentity();
			// get authorization mananger for c3d application from CSM
			//authManager = SecurityServiceProvider.getAuthorizationManager("c3d");

			//prc new
			System.out.println("Grid Credentials:  getCallerIdentity()='" + userDN );

//			org.cagrid.gaards.websso.authentication.CaGridAuthenticationManager authManager = new org.cagrid.gaards.websso.authentication.CaGridAuthenticationManager();
//			delegatedReference = authManager.getSerializedDelegationEpr();
//			globusCredential = authManager.getCredentials();
//			userDN=globusCredential.getIdentity();
				
			// Find Record
			Boolean recordExists = false;
			try {
				cn = getConnection();

				// Find the Grid User 
				stmt1 = cn.prepareStatement(FIND_USER_QUERY);
				stmt1.setString(1, userDN);

				ResultSet rs1 = stmt1.executeQuery();

				while (rs1.next()) {
						
					recordExists = true;
					c3dUserName = rs1.getString("C3D_USERNAME");
					c3dPassword = rs1.getString("C3D_PASSWORD");

				}

				if (!recordExists) {
					throw new Exception("C3D Credentials Not Found!");
				}
				stmt1.close();
				// get C3D user record for the caGrid Identity 
				//user= (C3DUser) authManager.getUser(userDN);
				// breakout the username from C3D User record
				//c3dUserName = user.getC3dUserName();
				// breakout the password from C3D User record
				//c3dPassword = user.getC3dPassword();
				//gov.nih.nci.cdmsconnector.util.StringEncrypter encrypter = new gov.nih.nci.cdmsconnector.util.StringEncrypter();
				//c3dPassword = new encrypter().decrypt(c3dPassword);
				// decrypt the password
				//c3dPassword = encrypter.decrypt(c3dPassword);
				c3dPassword = new StringEncrypter().decrypt(c3dPassword.trim());

				}
			catch (Exception e1) {
				e1.printStackTrace();
				throw new AccessPermissionException(e1.toString());
			}

			System.out.println("C3D Credentials:  Username='" + c3dUserName +
					"'  Password='" + c3dPassword +"'");

			//log.fatal("FATAL - " + "c3dUserName='" + c3dUserName + "'");
			//log.fatal("FATAL - " + "c3dPassword='" + c3dPassword + "'");
			try {
				// connect to the defined database using C3D userid/password 
				BaseJDBCDAO.getConnection(c3dUserName, c3dPassword);
			} catch (Exception e) {
				e.printStackTrace();
				throw new AccessPermissionException("Bad C3D username or password.  Can not connect.");
			}
			cn = getConnection(c3dUserName, c3dPassword);
			
		    stmt1 = null;
				
			//get userId and password and connect
			// use query to get userid and password from a join of CSM_USER and C3D_USER
			// if it does not exist, send exception
			// if exist, try to connect
			// test access to study
			// if study cannot be queried, send exception
			// else let program continue and get data
		} else {
			// Use SUPER Username for PUBLIC studies.
			cn = getConnection();
		}
		
		PreparedStatement sa_stmt = null;
		boolean isAccessible = false;
		
		try {
			sa_stmt = cn.prepareStatement(STUDY_ACCESSIBLE);
			sa_stmt.setString(1, studyName);

			ResultSet rs1 = sa_stmt.executeQuery();

			while (rs1.next()) {
				atLeastOne = true;
				isAccessible = rs1.getString("STUDY").equals(studyName);
			}
			
		} finally {
			try {
				sa_stmt.close();
			} catch (Exception ex) {
			}
		}

		if (!isAccessible) {
			throw new Exception("User " + c3dUserName + 
					            " does not have access to Study " + studyName);
		}
		
		try {

			stmt2 = cn.prepareStatement(SQL2);

			if (studyName == null || "".equals(studyName)) {
				stmt1 = cn.prepareStatement(SQL1);
				stmt1.setString(1, cdeStr);
			} else {
				stmt1 = cn.prepareStatement(SQL1_1);
				stmt1.setString(1, cdeStr);
				stmt1.setString(2, studyName);
			}

			ResultSet rs1 = stmt1.executeQuery();
			ResultSet rs2 = null;

			boolean cdeExists = false;

			Map<String, Object> obs = new HashMap<String, Object>();

			while (rs1.next()) {
				// TODO Cut this down and REMOVE repeated columns

				cdeExists = true;
				stmt2.setString(1, rs1.getString("study_name"));
				stmt2.setString(2, rs1.getString("dcm_id"));
				stmt2.setString(3, rs1.getString("DCI_NAME"));
				stmt2.setString(4, rs1.getString("QUESTGRP_NAME"));
				stmt2.setString(5, rs1.getString("dcm_name"));
				stmt2.setString(6, rs1.getString("default_prompt"));

				stmt2.setString(7, rs1.getString(1));  //study_name
				stmt2.setString(8, rs1.getString(2));  //DCI_NAME
				stmt2.setString(9, rs1.getString(3));  //question_name
				stmt2.setString(10, rs1.getString(4)); //default_prompt
				stmt2.setInt(11, rs1.getInt(7));       //dcm_id
				stmt2.setInt(12, rs1.getInt(8));       //study_id  
				stmt2.setInt(13, rs1.getInt(6));       //question_id

				// make the second query with data from the first query
				rs2 = stmt2.executeQuery();

				studies.addAll(processData(studyName, cde, rs2, obs));
			}

			if (!cdeExists) {
				throw new Exception("CDE Id and Version not found");
			}

		} finally {
			try {
				stmt1.close();
			} catch (Exception ex) {
			}
			try {
				stmt2.close();
			} catch (Exception ex) {
			}
			try {
				cn.close();
			} catch (Exception ex) {
			}
		}

		return studies;

	}

	public Set<Study> getStudyCDEs(GetStudyCDEsRequest getStudyCDEsRequest) {
		Connection cn = null;
		String studyName = getStudyCDEsRequest.getStudyName();
		Set<Study> studies = new TreeSet<Study>();
		try {
			cn = getConnection();

			PreparedStatement stmt = null;

			if (studyName == null || "".equals(studyName)) {
				stmt = cn.prepareStatement(GET_STUDY_CDE_SQL_NO_STUDY);
			} else {
				stmt = cn.prepareStatement(GET_STUDY_CDE_SQL);
				stmt.setString(1, studyName);
			}

			Map<String, Object> obs = new HashMap<String, Object>();

			ResultSet rs = stmt.executeQuery();
			studies.addAll(processCDEs(studyName, rs, obs));
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return studies;

	}

	private Set<Study> processData(String studyName, CommonDataElement cde, ResultSet rs,
			Map<String, Object> obs) throws Exception {
		Set<Study> studies = new TreeSet<Study>();
		Study study = null;
		List<StudySubject> studySubjects = null;
		StudySubject studySubject = null;
		List<Event> events = null;
		Event event = null;
		List<DataCollectionInstrument> dcis = null;
		DataCollectionInstrument dci = null;
		List<DataCollectionModule> dcms = null;
		DataCollectionModule dcm = null;
		List<QuestionGroup> qgs = null;
		QuestionGroup qg = null;
		List<Question> qs = null;
		Question q = null;
		
		
		// prc added this string for v2.2 security
		String GET_FILTER = 
			"select 'X' RESULT from STUDY_PRIVATE_CDE " +
			" where (study = ? and cde_id = ? and cde_version = ?)" +
			"    OR (study = 'ALL' and cde_id = ? and cde_version = ?)";

		//PRC Redaction Checking 
		String Redact = "##########";
		boolean redactExists = false;
		Connection cn = null;
		PreparedStatement stmt1 = null;

		try {
			cn = getConnection();
			stmt1 = cn.prepareStatement(GET_FILTER);

			stmt1.setString(1, studyName);
			stmt1.setString(2, cde.getPublicIdentifier());
			stmt1.setString(3, cde.getVersion());
			stmt1.setString(4, cde.getPublicIdentifier());
			stmt1.setString(5, cde.getVersion());

			ResultSet rs1 = stmt1.executeQuery();

			while (rs1.next()) {
				redactExists = true;
			}

		} finally {
			try {
				stmt1.close();
			} catch (Exception ex) {
			}			
			try {
				cn.close();
			} catch (Exception ex) {
			}
		}
		
		while (rs.next()) {
			try {
				String studyId = rs.getString("STUDY");
				int dcmId = rs.getInt("dcm_id");
				String dciName = rs.getString("DCI_NAME");
				String questionGroupName = rs.getString("QUESTGRP_NAME");
				String patientPos = rs.getString("patient_pos");
				String eventName = rs.getString("event_name");
				int qId = rs.getInt("question_id");
				String defaultPrompt = rs.getString("def_prompt");
				String qValue = rs.getString("question_value");
				String qName  = rs.getString("question_name");

				StringBuffer key = new StringBuffer(studyId);

				if (studyId == null || "".equals(studyId)) {
					continue;
				}

				if (obs.containsKey(key.toString())) {
					study = (Study) obs.get(key.toString());
				} else {
					study = new Study();
					study.setStudyIdentifier(studyId);
					studies.add(study);
					obs.put(key.toString(), study);
				}
				studySubjects = study.getStudySubjects();

				if (patientPos == null || "".equals(patientPos)) {
					continue;
				}

				key.append(':').append(patientPos);

				if (obs.containsKey(key.toString())) {
					studySubject = (StudySubject) obs.get(key.toString());
				} else {
					studySubject = new StudySubject();
					studySubject.setPatientPosition(patientPos);
					studySubjects.add(studySubject);
					obs.put(key.toString(), studySubject);
				}
				events = studySubject.getEvents();

				if (eventName == null || "".equals(eventName)) {
					continue;
				}

				key.append(':').append(eventName);

				if (obs.containsKey(key.toString())) {
					event = (Event) obs.get(key.toString());
				} else {
					event = new Event();
					event.setName(eventName);
					events.add(event);
					obs.put(key.toString(), event);
				}
				dcis = event.getDcis();

				if (dciName == null || "".equals(dciName)) {
					continue;
				}

				key.append(':').append(dciName);

				if (obs.containsKey(key.toString())) {
					dci = (DataCollectionInstrument) obs.get(key.toString());
				} else {
					dci = new DataCollectionInstrument();
					dcis.add(dci);
					dci.setName(dciName);
					obs.put(key.toString(), dci);
				}
				dcms = dci.getDcms();

				key.append(':').append(dcmId);

				if (obs.containsKey(key.toString())) {
					dcm = (DataCollectionModule) obs.get(key.toString());
				} else {
					dcm = new DataCollectionModule();
					dcms.add(dcm);
					dcm.setId(dcmId);
					obs.put(key.toString(), dcm);
				}
				qgs = dcm.getQuestionGroups();

				if (questionGroupName == null || "".equals(questionGroupName)) {
					continue;
				}

				key.append(':').append(questionGroupName);

				if (obs.containsKey(key.toString())) {
					qg = (QuestionGroup) obs.get(key.toString());
				} else {
					qg = new QuestionGroup();
					qgs.add(qg);
					qg.setName(questionGroupName);
					obs.put(key.toString(), qg);
				}
				qs = qg.getQuestions();

				q = new Question();
				qs.add(q);
				q.setId(qId);
				q.setDefaultPrompt(defaultPrompt);
				q.setName(qName);

				//prc Set the value here
				if (!redactExists) {
					q.setValue(qValue);
				} else {
					q.setValue(Redact);					
				}
				
				if(cde==null){
					CommonDataElement tempCDE = new CommonDataElement();
					tempCDE.setPublicIdentifier(rs.getString("CDE_ID"));
					tempCDE.setVersion(rs.getString("VERSION"));
					q.setCde(tempCDE);
				}else{
					q.setCde(cde);
				}

			} catch (RuntimeException e) {
				e.printStackTrace();
			}

		}
		return studies;

	}

	private Set<Study> processCDEs(String studyName, ResultSet rs,
			Map<String, Object> obs) throws Exception {
		Set<Study> studies = new TreeSet<Study>();
		Study study = null;
		List<Event> events = null;
		Event event = null;
		List<DataCollectionInstrument> dcis = null;
		DataCollectionInstrument dci = null;
		List<DataCollectionModule> dcms = null;
		DataCollectionModule dcm = null;
		List<QuestionGroup> qgs = null;
		QuestionGroup qg = null;
		List<Question> qs = null;
		Question q = null;
		
		while (rs.next()) {
			try {
				String studyId = rs.getString("STUDY");
				int dcmId = rs.getInt("dcm_id");
				String dciName = rs.getString("DCI_NAME");
				String questionGroupName = rs.getString("QUESTGRP_NAME");
				// String patientPos = rs.getString("patient_pos");
				String eventName = rs.getString("event_name");
				int qId = rs.getInt("question_id");
				String defaultPrompt = rs.getString("def_prompt");
				String qName = rs.getString("QUEST_NAME");
				
				StringBuffer key = new StringBuffer(studyId);

				if (studyId == null || "".equals(studyId)) {
					continue;
				}

				if (obs.containsKey(key.toString())) {
					study = (Study) obs.get(key.toString());
				} else {
					study = new Study();
					study.setStudyIdentifier(studyId);
					studies.add(study);
					obs.put(key.toString(), study);
				}
				events = study.getEvents();

				if (eventName == null || "".equals(eventName)) {
					continue;
				}

				key.append(':').append(eventName);

				if (obs.containsKey(key.toString())) {
					event = (Event) obs.get(key.toString());
				} else {
					event = new Event();
					event.setName(eventName);
					events.add(event);
					obs.put(key.toString(), event);
				}
				dcis = event.getDcis();

				if (dciName == null || "".equals(dciName)) {
					continue;
				}

				key.append(':').append(dciName);

				if (obs.containsKey(key.toString())) {
					dci = (DataCollectionInstrument) obs.get(key.toString());
				} else {
					dci = new DataCollectionInstrument();
					dcis.add(dci);
					dci.setName(dciName);
					obs.put(key.toString(), dci);
				}
				dcms = dci.getDcms();

				key.append(':').append(dcmId);

				if (obs.containsKey(key.toString())) {
					dcm = (DataCollectionModule) obs.get(key.toString());
				} else {
					dcm = new DataCollectionModule();
					dcms.add(dcm);
					dcm.setId(dcmId);
					obs.put(key.toString(), dcm);
				}
				qgs = dcm.getQuestionGroups();

				if (questionGroupName == null || "".equals(questionGroupName)) {
					continue;
				}

				key.append(':').append(questionGroupName);

				if (obs.containsKey(key.toString())) {
					qg = (QuestionGroup) obs.get(key.toString());
				} else {
					qg = new QuestionGroup();
					qgs.add(qg);
					qg.setName(questionGroupName);
					obs.put(key.toString(), qg);
				}
				qs = qg.getQuestions();

				q = new Question();
				qs.add(q);
				q.setId(qId);
				q.setDefaultPrompt(defaultPrompt);
				q.setName(qName);
				
				CommonDataElement tempCDE = new CommonDataElement();
				tempCDE.setPublicIdentifier(rs.getString("CDE_ID"));
				tempCDE.setVersion(rs.getString("VERSION"));
				q.setCde(tempCDE);

			} catch (RuntimeException e) {
				e.printStackTrace();
			}

		}
		return studies;

	}
}
