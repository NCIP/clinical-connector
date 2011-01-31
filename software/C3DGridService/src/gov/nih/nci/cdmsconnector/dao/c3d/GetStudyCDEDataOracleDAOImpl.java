package gov.nih.nci.cdmsconnector.dao.c3d;

import gov.nih.nci.cdmsconnector.dao.GetStudyCDEDataDAO;
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
import gov.nih.nci.cdmsconnector.dao.c3d.OracleDAOConstants;
import gov.nih.nci.cdmsconnector.manager.AccessPermissionException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.apache.log4j.Logger;

public class GetStudyCDEDataOracleDAOImpl extends OracleDAO implements GetStudyCDEDataDAO {

	private final static Logger log = Logger
			.getLogger(GetStudyCDEDataOracleDAOImpl.class.getName());
	
	//private CSMCDMSConnectorSecurityManagerImpl securityManager;
	
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
		String studyName = getStudyCDEDataRequest.getStudyName();
		CommonDataElement cde = getStudyCDEDataRequest.getCommonDataElement();
        boolean redactExists = false;
		Connection cn = null;
		PreparedStatement stmt1 = null;
		PreparedStatement stmt2 = null;

		if (cde == null || cde.getPublicIdentifier() == null
				|| "".equals(cde.getPublicIdentifier())
				|| cde.getVersion() == null || "".equals(cde.getVersion())) {
			throw new Exception("Missing CDE Id or Version");
		}

        // See if CDE Id/Version should be redacted 
		try {
			cn = getConnection();

			stmt1 = cn.prepareStatement(OracleDAOConstants.REDACT_CDE);
				
			stmt1.setString(1, studyName);
			stmt1.setString(2, cde.getPublicIdentifier());
			stmt1.setString(3, cde.getVersion());

			ResultSet rs1 = stmt1.executeQuery();

			while (rs1.next()) {
				String redact = rs1.getString("REDACT");
				if (redact.compareTo("Y") == 0 ) {
					redactExists = true;
				} else {
					redactExists = false;
				}
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
		
		// C3D database expects cde's in the following format
		String cdeStr = "CDE_ID:" + cde.getPublicIdentifier() + "VERSION:"
				+ cde.getVersion();

		//PRC study access checking
		cn = null;
		stmt1 = null;

		try {
			cn = getStudySecurityBasedConnection(studyName);
		}
		catch (Exception e1) {
			e1.printStackTrace();
			throw new AccessPermissionException(e1.toString());
		}		
		PreparedStatement sa_stmt = null;
		boolean isAccessible = false;
		
		try {
			sa_stmt = cn.prepareStatement(OracleDAOConstants.STUDY_ACCESSIBLE);
			sa_stmt.setString(1, studyName);

			ResultSet rs1 = sa_stmt.executeQuery();

			while (rs1.next()) {
				isAccessible = rs1.getString("STUDY").equals(studyName);
			}
			
		} finally {
			try {
				sa_stmt.close();
			} catch (Exception ex) {
			}
		}

		if (!isAccessible) {
			throw new Exception("User does not have access to Study '" + studyName + "'");
		}
		
		try {

			stmt2 = cn.prepareStatement(OracleDAOConstants.SQL2);

			stmt1 = cn.prepareStatement(OracleDAOConstants.SQL1_1);
			stmt1.setString(1, cdeStr);
			stmt1.setString(2, studyName);

			ResultSet rs1 = stmt1.executeQuery();
			ResultSet rs2 = null;

			boolean cdeExists = false;

			Map<String, Object> obs = new HashMap<String, Object>();

			while (rs1.next()) {
				// TODO Cut this down and REMOVE repeated columns
				//Cut this down and remove redundant fields

				cdeExists = true;
				stmt2.setString(1, rs1.getString("STUDY_NAME"));
				stmt2.setString(2, rs1.getString("DCM_ID"));
				stmt2.setString(3, rs1.getString("DCI_NAME"));
				stmt2.setString(4, rs1.getString("QUESTGRP_NAME"));
				stmt2.setString(5, rs1.getString("DCM_NAME"));
				stmt2.setString(6, rs1.getString("DEFAULT_PROMPT"));
				stmt2.setString(7, rs1.getString("QUESTION_NAME"));//question_name
				stmt2.setInt(8, rs1.getInt("DCM_ID"));             //dcm_id
				stmt2.setInt(9, rs1.getInt("STUDY_ID"));           //study_id  
				stmt2.setInt(10, rs1.getInt("QUESTION_ID"));       //question_id

				// make the second query with data from the first query
				rs2 = stmt2.executeQuery();

				studies.addAll(processData(studyName, cde, rs2, obs, redactExists));
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

	public Set<Study> getStudyCDEs(GetStudyCDEsRequest getStudyCDEsRequest) throws AccessPermissionException {
		Connection cn = null;
		String studyName = getStudyCDEsRequest.getStudyName();
		Set<Study> studies = new TreeSet<Study>();
		
		try {
			cn = getStudySecurityBasedConnection(studyName);
		}
		catch (Exception e1) {
			e1.printStackTrace();
			throw new AccessPermissionException(e1.toString());
		}
		try {
			
			PreparedStatement sa_stmt = null;
			boolean isAccessible = false;
			
			try {
				sa_stmt = cn.prepareStatement(OracleDAOConstants.STUDY_ACCESSIBLE);
				sa_stmt.setString(1, studyName);

				ResultSet rs1 = sa_stmt.executeQuery();
				//boolean atLeastOne = false;

				while (rs1.next()) {
					//atLeastOne = true;
					isAccessible = rs1.getString("STUDY").equals(studyName);
				}
				
			} finally {
				try {
					sa_stmt.close();
				} catch (Exception ex) {
				}
			}

			if (!isAccessible) {
				throw new Exception("User does not have access to Study '" + studyName + "'");
			}

			PreparedStatement stmt = null;

			//if (studyName == null || "".equals(studyName)) {
			//	stmt = cn.prepareStatement(GET_STUDY_CDE_SQL_NO_STUDY);
			//} else {
				stmt = cn.prepareStatement(OracleDAOConstants.GET_STUDY_CDE_SQL);
				stmt.setString(1, studyName);
			//}

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
			Map<String, Object> obs, Boolean redactExists) throws Exception {
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
		
		//Connection cn = null;
		//PreparedStatement stmt1 = null;
		
		while (rs.next()) {
			try {
				String studyId = rs.getString("STUDY");
				String dciName = rs.getString("DCI_NAME");
				int dcmId = rs.getInt("DCM_ID");
				String questionGroupName = rs.getString("QUESTGRP_NAME");
				String patientPos = rs.getString("PATIENT_POS");
				String eventName = rs.getString("EVENT_NAME");
				int qId = rs.getInt("QUESTION_ID");
				String defaultPrompt = rs.getString("DEFAULT_PROMPT");
				String qValue = rs.getString("QUESTION_VALUE");
				String qName  = rs.getString("QUESTION_NAME");

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
					q.setValue(OracleDAOConstants.REDACT);					
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
				String tempCDETEXT = rs.getString("CDE_FULL_TEXT");
				if (tempCDETEXT == null || "".equals(tempCDETEXT)) {
					tempCDE.setPublicIdentifier("");
					tempCDE.setVersion("");
				} else {
				   if (tempCDETEXT.startsWith("CDE_ID:") ){
				       tempCDE.setPublicIdentifier(rs.getString("CDE_ID"));
				       tempCDE.setVersion(rs.getString("VERSION"));
				   } else {
					   tempCDE.setPublicIdentifier("");
					   tempCDE.setVersion("");
				   }
				}
				q.setCde(tempCDE);	
				

			} catch (RuntimeException e) {
				e.printStackTrace();
			}

		}
		return studies;

	}
}
