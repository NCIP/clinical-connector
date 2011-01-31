package gov.nih.nci.cdmsconnector.dao.c3d;

import gov.nih.nci.cdmsconnector.dao.GetStudyCRFDAO;

import gov.nih.nci.cdmsconnector.domain.StudySite;
import gov.nih.nci.cdmsconnector.domain.StudySubject;
import gov.nih.nci.cdmsconnector.domain.Event;
import gov.nih.nci.cdmsconnector.domain.DataCollectionInstrument;
import gov.nih.nci.cdmsconnector.domain.DataCollectionModule;
import gov.nih.nci.cdmsconnector.domain.QuestionGroup;
import gov.nih.nci.cdmsconnector.domain.Question;
import gov.nih.nci.cdmsconnector.domain.CommonDataElement;
import gov.nih.nci.cdmsconnector.manager.AccessPermissionException;

import gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCRFDataRequest;
import gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCRFsRequest;
import gov.nih.nci.cabig.ccts.domain.bridg.QuestionValue;
import gov.nih.nci.cabig.ccts.domain.c3dstudydatametadata.StudyDataMetadata;
import gov.nih.nci.cabig.ccts.domain.c3dstudydatametadata.CRFMetadata;
import gov.nih.nci.cabig.ccts.domain.c3dstudydatametadata.StudyMetadata;
import gov.nih.nci.cabig.ccts.domain.c3dstudydatametadata.StudyData;
import gov.nih.nci.cabig.ccts.domain.c3dstudydatametadata.CRFData;
import gov.nih.nci.cabig.ccts.domain.cdt.II;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;

import org.apache.log4j.Logger;

public class GetStudyCRFDataOracleDAOImpl extends OracleDAO implements GetStudyCRFDAO {

	private final static Logger log = Logger
			.getLogger(GetStudyCDEDataOracleDAOImpl.class.getName());
	
	/*
	 * See OracleDAOConstants for Queries
	 */
	
	public StudyDataMetadata getStudyCRFData(GetStudyCRFDataRequest getStudyCRFDataRequest)
			throws Exception {

		StudyDataMetadata studyDataMetadata = new StudyDataMetadata();

		String studyName = getStudyCRFDataRequest.getStudyName();
		String crfName   = getStudyCRFDataRequest.getCrfName();

		if (crfName == null || "".equals(crfName)){
			throw new Exception("CRF Name cannot be blank.");
		}

		//PRC study access checking
		Connection cn = null;
		PreparedStatement stmt1 = null;
		
		cn = getStudySecurityBasedConnection(studyName);
		
		PreparedStatement sa_stmt = null;
		boolean isAccessible = false;
		//boolean atLeastOne = false;
		
		try {
			sa_stmt = cn.prepareStatement(OracleDAOConstants.STUDY_ACCESSIBLE);
			sa_stmt.setString(1, studyName);

			ResultSet rs1 = sa_stmt.executeQuery();

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
		
		 stmt1 = null;
		 try {

			stmt1 = cn.prepareStatement(OracleDAOConstants.GET_STUDY_CRF_DATA);
			stmt1.setString(1, studyName);
			stmt1.setString(2, crfName);
			stmt1.setString(3, studyName);
			stmt1.setString(4, crfName);

			ResultSet rs1 = stmt1.executeQuery();

			Map<String, Object> obs = new HashMap<String, Object>();

			StudyData studyData = new StudyData();
			
			studyData = processCRFData(studyName, rs1, obs);
			
			studyDataMetadata.setStudyName(studyName);
			studyDataMetadata.setStudyData(studyData);
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
		
		return studyDataMetadata;
	}

	public StudyDataMetadata getStudyCRFs(GetStudyCRFsRequest getStudyCRFsRequest) throws Exception {
		Connection cn = null;
		String studyName = getStudyCRFsRequest.getStudyName();
		StudyDataMetadata studyDesign = new StudyDataMetadata();

		try {
			cn = getStudySecurityBasedConnection(studyName);
		}
		catch (Exception e1) {
			e1.printStackTrace();
			throw new Exception(e1.toString());
		}
		
		try {
			
			PreparedStatement sa_stmt = null;
			boolean isAccessible = false;
			
			try {
				sa_stmt = cn.prepareStatement(OracleDAOConstants.STUDY_ACCESSIBLE);
				sa_stmt.setString(1, studyName);

				ResultSet rs1 = sa_stmt.executeQuery();

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

			stmt = cn.prepareStatement(OracleDAOConstants.GET_STUDY_DEFAULT_BOOK_CRFS);

			stmt.setString(1, studyName);
			
			ResultSet rs = stmt.executeQuery();
			
			StudyMetadata smd = new StudyMetadata();
			smd = processCRFs(studyName, rs);
			
			studyDesign.setStudyName(studyName);
			studyDesign.setStudyMetadata(smd);
			
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
		return studyDesign;
	}

	private StudyMetadata processCRFs(String studyName, ResultSet rs) throws Exception {
		
		List<CRFMetadata> crfs = new ArrayList<CRFMetadata>();
  
		while (rs.next()) {
			try {
				CRFMetadata crf = new CRFMetadata();

				//String studyId = rs.getString("STUDY");
				String dciName = rs.getString("DCI_NAME");
				int dciId = rs.getInt("DCI_ID");

				crf.setCrfName(dciName);
				crf.setDciId(dciId);
				crf.setDciName(dciName);
				crfs.add(crf);
				
			} catch (RuntimeException e) {
				e.printStackTrace();
			}
		}

		CRFMetadata[] crfArr = new CRFMetadata[crfs.size()];
		int i = 0;
		Iterator<CRFMetadata> iterator = crfs.iterator();
		while (iterator.hasNext()){ 
			CRFMetadata icrf = (CRFMetadata) iterator.next();
			crfArr[i] = new CRFMetadata();
			crfArr[i] = icrf;
			i++;
		}
		StudyMetadata smd = new StudyMetadata();
		smd.setCRFMetadata(crfArr);
				
		return smd;
	}

	private StudyData processCRFData(String studyName, ResultSet rs,
			Map<String, Object> obs) 
	        throws Exception {

		StudySite studySite = null;
		List<StudySite> studySites = new LinkedList<StudySite>();
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
		
		while (rs.next()) {
			try {

				String siteName   = rs.getString("SITE");
				String patient   = rs.getString("PATIENT");
				String eventName = rs.getString("CLIN_PLAN_EVE_NAME");
				String dciName   = rs.getString("DCI_NAME");
				String dcmName   = rs.getString("DCM_NAME");
				String questionGroupName = rs.getString("QUEST_GRP_NAME");
				String questionName   = rs.getString("QUESTION_NAME");
				int    questionId     = rs.getInt("QUESTION_ID");
				String questionPrompt = rs.getString("QUESTION_PROMPT");
				String questionValue  = rs.getString("QUESTION_VALUE");
				String questionCdeId       = rs.getString("CDE_ID");
				String questionCdeVersion  = rs.getString("CDE_VERSION");
				String redact = rs.getString("REDACT");
				
				StringBuffer key = new StringBuffer(siteName);
				 
				if (obs.containsKey(key.toString())) {
					studySite = (StudySite) obs.get(key.toString());
				} else {
					studySite = new StudySite();
					studySite.setStudySiteName(siteName);
					
					studySites.add(studySite);
					obs.put(key.toString(), studySite);
				}
				
				studySubjects = studySite.getStudySubjects();
				
				if (patient == null || "".equals(patient)) {
					continue;
				}

				key.append(':').append(patient);

				if (obs.containsKey(key.toString())) {
					studySubject = (StudySubject) obs.get(key.toString());
				} else {
					studySubject = new StudySubject();
					studySubject.setPatientPosition(patient);
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

				key.append(':').append(dcmName);

				if (obs.containsKey(key.toString())) {
					dcm = (DataCollectionModule) obs.get(key.toString());
				} else {
					dcm = new DataCollectionModule();
					dcms.add(dcm);
					dcm.setName(dcmName);
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
				q.setId(questionId);
				q.setDefaultPrompt(questionPrompt);
				q.setName(questionName);
				
				if (redact.compareTo("Y") == 0 ) {
					q.setValue(OracleDAOConstants.REDACT);
				} else {
					q.setValue(questionValue);
				}
				
				CommonDataElement CDE = new CommonDataElement();
				
				CDE.setPublicIdentifier(questionCdeId);
				CDE.setVersion(questionCdeVersion);
				q.setCde(CDE);
            
			} catch (RuntimeException e) {
				e.printStackTrace();
			}
            
		}
		
		gov.nih.nci.cabig.ccts.domain.c3dstudydatametadata.StudySite[] studySiteArr = new gov.nih.nci.cabig.ccts.domain.c3dstudydatametadata.StudySite[studySites.size()];
		for (int i = 0; i < studySites.size(); i++) {
			//System.out.println("Doing Question: '" + studySite.getStudySiteName() + "'." );
			studySiteArr[i] = new gov.nih.nci.cabig.ccts.domain.c3dstudydatametadata.StudySite();
			studySiteArr[i].setStudySubject(getStudySubjects(studySites.get(i).getStudySubjects()));
		}
		
		StudyData studyData = new StudyData();
		CRFData[] crfData = new CRFData[1];
		crfData[0] = new CRFData();
		crfData[0].setStudySite(studySiteArr);		
		studyData.setCRFData(crfData);
		return studyData;
	} 

	protected gov.nih.nci.cabig.ccts.domain.c3dstudydatametadata.StudySubject[] getStudySubjects(List<gov.nih.nci.cdmsconnector.domain.StudySubject> studySubjects) {
		gov.nih.nci.cabig.ccts.domain.c3dstudydatametadata.StudySubject[] bStudySubjects = new gov.nih.nci.cabig.ccts.domain.c3dstudydatametadata.StudySubject[studySubjects.size()];
		for (int i = 0; i < studySubjects.size(); i++) {
			bStudySubjects[i] = new gov.nih.nci.cabig.ccts.domain.c3dstudydatametadata.StudySubject();
			II[] idArr = new II[1];
			idArr[0] = new II();
			idArr[0].setExtension("PATIENTPOSITION");
			idArr[0].setRoot(studySubjects.get(i).getPatientPosition());
			bStudySubjects[i].setII(idArr);
			bStudySubjects[i].setEvent(getPatientEvents(studySubjects.get(i).getEvents()));
		}
		return bStudySubjects;
	}

	protected gov.nih.nci.cabig.ccts.domain.bridg.Event[] getPatientEvents(List<Event> patientEvents) {
		gov.nih.nci.cabig.ccts.domain.bridg.Event[] patientEventArr = new gov.nih.nci.cabig.ccts.domain.bridg.Event[patientEvents.size()];
		int i = 0;
		Iterator<Event> iPatientEvents = patientEvents.iterator();
		while (iPatientEvents.hasNext()) {
			Event pEvent = (Event) iPatientEvents.next();
			patientEventArr[i] = new gov.nih.nci.cabig.ccts.domain.bridg.Event();
			patientEventArr[i].setName(pEvent.getName());
			patientEventArr[i].setDataCollectionInstrument(getPatientDCIs(pEvent.getDcis()));
			i++;
		}
		return patientEventArr;
	}
		
	protected gov.nih.nci.cabig.ccts.domain.bridg.DataCollectionInstrument[] getPatientDCIs(
				List<DataCollectionInstrument> dcis) {
		gov.nih.nci.cabig.ccts.domain.bridg.DataCollectionInstrument[] bDCIs = 
			 new gov.nih.nci.cabig.ccts.domain.bridg.DataCollectionInstrument[dcis.size()];
		for (int i = 0; i < dcis.size(); i++) {
			bDCIs[i] = new gov.nih.nci.cabig.ccts.domain.bridg.DataCollectionInstrument();
			bDCIs[i].setDate(dcis.get(i).getDate());
			bDCIs[i].setId(dcis.get(i).getId());
			bDCIs[i].setName(dcis.get(i).getName());
			bDCIs[i].setDataCollectionModule(getPatientDCMs(dcis.get(i).getDcms()));
		}
		return bDCIs;
	}	

	protected gov.nih.nci.cabig.ccts.domain.bridg.DataCollectionModule[] getPatientDCMs(
			List<DataCollectionModule> dcms) {
		gov.nih.nci.cabig.ccts.domain.bridg.DataCollectionModule[] bDCMs = new gov.nih.nci.cabig.ccts.domain.bridg.DataCollectionModule[dcms.size()];
		for (int i = 0; i < dcms.size(); i++) {
			bDCMs[i] = new gov.nih.nci.cabig.ccts.domain.bridg.DataCollectionModule();
			bDCMs[i].setDate(dcms.get(i).getDate());
			bDCMs[i].setEventsubsetNumber(dcms.get(i).getEventSubsetNumber());
			bDCMs[i].setId(dcms.get(i).getId());
			bDCMs[i].setName(dcms.get(i).getName());
			bDCMs[i].setQuestionGroup(getPatientQuestionGroups(dcms.get(i)
					.getQuestionGroups()));
		}
		return bDCMs;
	}

	protected gov.nih.nci.cabig.ccts.domain.bridg.QuestionGroup[] getPatientQuestionGroups(
			List<QuestionGroup> questionGroups) {
		gov.nih.nci.cabig.ccts.domain.bridg.QuestionGroup[] bQuestionGroups = new gov.nih.nci.cabig.ccts.domain.bridg.QuestionGroup[questionGroups
				.size()];
		for (int i = 0; i < questionGroups.size(); i++) {
			bQuestionGroups[i] = new gov.nih.nci.cabig.ccts.domain.bridg.QuestionGroup();
			bQuestionGroups[i].setId(questionGroups.get(i).getId());
			bQuestionGroups[i].setName(questionGroups.get(i).getName());
			bQuestionGroups[i].setQuestion(getPatientQuestions(questionGroups
					.get(i).getQuestions()));
		}
		return bQuestionGroups;
	}

	protected gov.nih.nci.cabig.ccts.domain.bridg.Question[] getPatientQuestions(
			List<Question> questions) {
		gov.nih.nci.cabig.ccts.domain.bridg.Question[] bQuestions = new gov.nih.nci.cabig.ccts.domain.bridg.Question[questions.size()];
		for (int i = 0; i < questions.size(); i++) {
			bQuestions[i] = new gov.nih.nci.cabig.ccts.domain.bridg.Question();
			bQuestions[i].setDefaultPrompt(questions.get(i).getDefaultPrompt());
			bQuestions[i].setId(questions.get(i).getId());
			bQuestions[i].setName(questions.get(i).getName());
			bQuestions[i].setRepeatSequence(questions.get(i).getRepeatSequence());

			gov.nih.nci.cabig.ccts.domain.bridg.CommonDataElement cde = new gov.nih.nci.cabig.ccts.domain.bridg.CommonDataElement();
			cde.setPublicIdentifier(questions.get(i).getCde().getPublicIdentifier());
			cde.setVersion(questions.get(i).getCde().getVersion());
			bQuestions[i].setCommonDataElement(cde);

			QuestionValue qv = new QuestionValue();
			qv.setValue(questions.get(i).getValue());

			bQuestions[i].setQuestionValue(qv);
		}
		return bQuestions;
	}
	
}
