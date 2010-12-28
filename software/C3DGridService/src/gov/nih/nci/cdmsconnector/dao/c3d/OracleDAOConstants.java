package gov.nih.nci.cdmsconnector.dao.c3d;

public class OracleDAOConstants {
	public OracleDAOConstants(){
		
	}
	// prc added this string for v2.2 security - Is Study Accessible by User
	public final static String STUDY_ACCESSIBLE = "select STUDY " 
		+ "from C3D_ACCESSIBLE_STUDIES_VW "
		+ "where STUDY = ?";
	
	// prc added this string for v2.2 security - What is Study Security Level
	public final static String FIND_STUDY_ACCESS = "select ACCESS_METHOD " 
		+ "from STUDY_SECURITY_LEVEL "
		+ "where STUDY = ?";

	// prc added this string for v2.2 security - What is DEFAULT Study Security Level
	public final static String FIND_DEFAULT_STUDY_ACCESS = "select ACCESS_METHOD " 
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
			+ "where (DQ.HELP_TEXT =  ? "
			+ "  OR q.status_comment_text =  ? ) "
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
			+ "where (DQ.HELP_TEXT =  ? "
			+ "  OR q.status_comment_text =  ? ) "
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

	public final static String GET_STUDY_CDE_SQL = "SELECT cs.study STUDY,"
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
			+ "AND cs.study = ? "
			+ "ORDER BY cs.study, cpe.CLIN_PLAN_EVE_SN, dci.name, dcm.NAME, dqg.display_sn, dq.display_sn";

		public final static String GET_STUDY_CDE_SQL_NO_STUDY = "SELECT cs.study STUDY,"
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
	
	public static final String GET_STUDY_CRFS = 
		"SELECT DISTINCT S.STUDY STUDY, DCI.NAME DCI_NAME, DCI.DCI_ID DCI_ID" + 
		"  FROM OCL_STUDIES S, " +
		"       DCIS DCI " +
		" WHERE S.STUDY = ? " +
		"   AND DCI.CLINICAL_STUDY_ID = S.TASK_ID " +
		"   AND DCI.DCI_STATUS_CODE = 'A' " +
		" ORDER BY DCI.NAME ";
	
	public static final String GET_STUDY_DEFAULT_BOOK_CRFS = 
		"SELECT DISTINCT S.STUDY STUDY, DCI.NAME DCI_NAME, DCI.DCI_ID DCI_ID " + 
		"  FROM OCL_STUDIES S,  " +
		"       DCIS DCI,  " +
		"       DCI_BOOKS DCIB, " +
		"       DCI_BOOK_PAGES DCIBP " +
		" WHERE S.STUDY = ?  " +
		"   and DCIB.CLINICAL_STUDY_ID =  S.TASK_ID " + 
		"   AND DCIB.DEFAULT_FLAG = 'Y' " +
		"   AND DCIB.DCI_BOOK_STATUS_CODE = 'A' " +
		"   AND DCIBP.DCI_BOOK_ID = DCIB.DCI_BOOK_ID " +
		"   AND DCI.DCI_ID = DCIBP.DCI_ID " +
		"   AND DCI.CLINICAL_STUDY_ID =  S.TASK_ID " +
		"   AND DCI.DCI_STATUS_CODE = 'A'  " +
		" ORDER BY DCI.NAME ";
	
	public static final String GET_STUDY_CRF_DATA = 
		"SELECT STUDY, TASK_ID, SITE, PATIENT, CLIN_PLAN_EVE_NAME, DCI_NAME, DCM_NAME, QUEST_GRP_NAME, A.QUESTION_ID, QUESTION_NAME,  A.DEFAULT_PROMPT QUESTION_PROMPT, VALUE_TEXT QUESTION_VALUE, " +
	    "       DQG_DISPLAY_SN,   DQ_DISPLAY_SN, DCM_MODULE_SN, 'N' MISSING_RESPONSE, " +
        "       LTRIM(SUBSTR(NVL(A.HELP_TEXT, Q.STATUS_COMMENT_TEXT),1,INSTR(NVL(A.HELP_TEXT, Q.STATUS_COMMENT_TEXT),'VERSION')-1),'CDE_ID:') CDE_ID, " +
		"       LTRIM(SUBSTR(NVL(A.HELP_TEXT, Q.STATUS_COMMENT_TEXT),INSTR(NVL(A.HELP_TEXT, Q.STATUS_COMMENT_TEXT),'VERSION')),'VERSION:') CDE_VERSION, " +
	    "       REDACT(STUDY, LTRIM(SUBSTR(NVL(A.HELP_TEXT, Q.STATUS_COMMENT_TEXT),1,INSTR(NVL(A.HELP_TEXT, Q.STATUS_COMMENT_TEXT),'VERSION')-1),'CDE_ID:'), " +
	    "              LTRIM(SUBSTR(NVL(A.HELP_TEXT, Q.STATUS_COMMENT_TEXT),INSTR(NVL(A.HELP_TEXT, Q.STATUS_COMMENT_TEXT),'VERSION')),'VERSION:') ) REDACT  " +
		"  FROM (SELECT S.STUDY, S.TASK_ID, RD.SITE, RD.PATIENT, RD.CLIN_PLAN_EVE_NAME, DCI.NAME DCI_NAME, DCM.NAME DCM_NAME, DQG.NAME QUEST_GRP_NAME, DQ.QUESTION_ID QUESTION_ID, " +
        "               DQ.QUESTION_NAME,  DQ.DEFAULT_PROMPT DEFAULT_PROMPT, DQ.HELP_TEXT HELP_TEXT, R.VALUE_TEXT, DQG.DISPLAY_SN DQG_DISPLAY_SN,   DQ.DISPLAY_SN DQ_DISPLAY_SN, DCM_MODULE_SN, 'N' MISSING_RESPONSE " + 
        "          FROM RECEIVED_DCIS RD,  " +
		"               RECEIVED_DCMS RM,  " +
		"               RESPONSES R,  " +
		"               DCM_QUESTION_GROUPS DQG, " +
		"               DCM_QUESTIONS DQ,  " +
		"               DCI_MODULES DM, " +
		"               DCIS DCI, " +
		"               DCMS DCM, " +
		"               OCL_STUDIES S " +
		"         WHERE RD.CLINICAL_STUDY_ID = S.TASK_ID " +
		"           AND RD.DCI_ID = DCI.DCI_ID " +
		"           AND RD.END_TS = TO_DATE(3000000, 'J') " +
		"           AND RM.CLINICAL_STUDY_ID = S.TASK_ID " +
		"           AND RM.RECEIVED_DCI_ID = RD.RECEIVED_DCI_ID " +
		"           AND RM.END_TS = TO_DATE(3000000, 'J') " +
		"           AND R.CLINICAL_STUDY_ID     = DQ.CLINICAL_STUDY_ID " +
		"           AND R.RECEIVED_DCM_ID       = RM.RECEIVED_DCM_ID " +
		"           AND R.DCM_QUESTION_GROUP_ID = DQ.DCM_QUESTION_GROUP_ID " +
		"           AND R.DCM_QUESTION_ID       = DQ.DCM_QUESTION_ID " +
		"           AND R.END_TS  = TO_DATE(3000000, 'J') " +
		"           AND DQ.CLINICAL_STUDY_ID  = S.TASK_ID " +
		"           AND DQ.DCM_ID = RM.DCM_ID " +
		"           AND DQ.DCM_QUE_DCM_SUBSET_SN = RM.DCM_SUBSET_SN " +
		"           AND DQ.DCM_QUE_DCM_LAYOUT_SN = RM.DCM_LAYOUT_SN " +
		"           AND DQ.DCM_QUESTION_GROUP_ID = R.DCM_QUESTION_GROUP_ID " +
		"           AND DQ.DCM_QUESTION_ID       = R.DCM_QUESTION_ID " +
		"           AND DM.CLINICAL_STUDY_ID   = S.TASK_ID " +
		"           AND DM.DCI_ID  = RD.DCI_ID " +
		"           AND DM.DCM_ID  = RM.DCM_ID " +
		"           AND DM.DCM_LAYOUT_SN = RM.DCM_LAYOUT_SN " +
		"           AND DM.DCM_SUBSET_SN = RM.DCM_SUBSET_SN " +
		"           AND DCI.CLINICAL_STUDY_ID   = S.TASK_ID " +
		"           AND DCI.DCI_ID = DM.DCI_ID " +
		"           AND DCM.CLINICAL_STUDY_ID   = S.TASK_ID " +
		"           AND DCM.DCM_ID = DM.DCM_ID " +
		"           AND DCM.DCM_LAYOUT_SN = RM.DCM_LAYOUT_SN " +
		"           AND DCM.DCM_SUBSET_SN = RM.DCM_SUBSET_SN " +
		"           AND DQG.DCM_QUESTION_GRP_ID = DQ.DCM_QUESTION_GROUP_ID " +
		"           AND DQG.DCM_QUE_GRP_DCM_LAYOUT_SN = RM.DCM_LAYOUT_SN " +
		"           AND DQG.DCM_QUE_GRP_DCM_SUBSET_SN = RM.DCM_SUBSET_SN " +
		"           AND S.STUDY = ? " +
		"           AND DCI.NAME = ? " +
		"           UNION " +
		"           SELECT S.STUDY, S.TASK_ID, RD.SITE, RD.PATIENT, RD.CLIN_PLAN_EVE_NAME, DCI.NAME DCI_NAME, DCM.NAME DCM_NAME, DQG.NAME QUEST_GRP_NAME, DQ.QUESTION_ID QUESTION_ID, " +
		"           DQ.QUESTION_NAME,  DQ.DEFAULT_PROMPT DEFAULT_PROMPT, DQ.HELP_TEXT HELP_TEXT, '' VALUE_TEXT, DQG.DISPLAY_SN,   DQ.DISPLAY_SN, DM.DCM_MODULE_SN, 'Y' MISSING_RESPONSE  " +
		"           FROM RECEIVED_DCIS RD,  " +
		"           RECEIVED_DCMS RM,  " +
		"           DCM_QUESTION_GROUPS DQG, " +
		"           DCM_QUESTIONS DQ,  " +
		"           DCI_MODULES DM, " +
		"           DCIS DCI, " +
		"           DCMS DCM, " +
		"           OCL_STUDIES S " +
		"           WHERE RD.CLINICAL_STUDY_ID = S.TASK_ID " +
		"           AND RD.DCI_ID = DCI.DCI_ID " +
		"           AND RD.END_TS = TO_DATE(3000000, 'J') " +
		"           AND RM.CLINICAL_STUDY_ID = S.TASK_ID " +
		"           AND RM.RECEIVED_DCI_ID = RD.RECEIVED_DCI_ID " +
		"           AND RM.END_TS = TO_DATE(3000000, 'J') " +
		"           AND DQ.CLINICAL_STUDY_ID  = S.TASK_ID " +
		"           AND DQ.DCM_ID = RM.DCM_ID " +
		"           AND DQ.DCM_QUE_DCM_SUBSET_SN = RM.DCM_SUBSET_SN " +
		"           AND DQ.DCM_QUE_DCM_LAYOUT_SN = RM.DCM_LAYOUT_SN " +
		"           AND DM.CLINICAL_STUDY_ID   = S.TASK_ID " +
		"           AND DM.DCI_ID  = RD.DCI_ID " +
		"           AND DM.DCM_ID  = RM.DCM_ID " +
		"           AND DM.DCM_LAYOUT_SN = RM.DCM_LAYOUT_SN " +
		"           AND DM.DCM_SUBSET_SN = RM.DCM_SUBSET_SN " +
		"           AND DCI.CLINICAL_STUDY_ID   = S.TASK_ID " +
		"           AND DCI.DCI_ID = DM.DCI_ID " +
		"           AND DCM.CLINICAL_STUDY_ID   =  S.TASK_ID " +
		"           AND DCM.DCM_ID = DM.DCM_ID " +
		"           AND DCM.DCM_LAYOUT_SN = RM.DCM_LAYOUT_SN " +
		"           AND DCM.DCM_SUBSET_SN = RM.DCM_SUBSET_SN " +
		"           AND DQG.DCM_QUESTION_GRP_ID = DQ.DCM_QUESTION_GROUP_ID " +
		"           AND DQG.DCM_QUE_GRP_DCM_LAYOUT_SN = RM.DCM_LAYOUT_SN " +
		"           AND DQG.DCM_QUE_GRP_DCM_SUBSET_SN = RM.DCM_SUBSET_SN " +
		"           AND NOT EXISTS (SELECT 'X' FROM RESPONSES R " +
		"                            WHERE R.CLINICAL_STUDY_ID     = DQ.CLINICAL_STUDY_ID " +
		"                              AND R.RECEIVED_DCM_ID       = RM.RECEIVED_DCM_ID " +
		"                              AND R.DCM_QUESTION_GROUP_ID = DQ.DCM_QUESTION_GROUP_ID " +
		"                              AND R.DCM_QUESTION_ID       = DQ.DCM_QUESTION_ID " +
		"                              AND R.END_TS  = TO_DATE(3000000, 'J')) " +
		"           AND S.STUDY = ? " +
		"           AND DCI.NAME = ?) A, " +
        "  QUESTIONS Q " +
        " WHERE Q.QUESTION_STATUS_CODE = 'A' " + 
        "   AND Q.QUESTION_ID = A.QUESTION_ID   " +
        " ORDER BY STUDY, SITE, PATIENT, CLIN_PLAN_EVE_NAME, DCI_NAME, DCM_MODULE_SN, DQG_DISPLAY_SN, DQ_DISPLAY_SN ";
		
	public static final String FIND_USER_QUERY = 
		"SELECT C3D_USERNAME, C3D_PASSWORD FROM C3D_USER " +
		"WHERE EXTRNL_LOGIN_NAME = ?";	
	
	public static final String  BAD_DCAPI_CRENTIALS = 
		"Unable to get DCAPIUserCredentials. Please Contact C3D Grid Service Administrator";
}
