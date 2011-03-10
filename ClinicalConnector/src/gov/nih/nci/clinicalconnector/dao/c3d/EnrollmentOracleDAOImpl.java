package gov.nih.nci.clinicalconnector.dao.c3d;

import gov.nih.nci.c3d.study.EnrollPatient;
import gov.nih.nci.c3d.study.QuestionLoader;
import gov.nih.nci.cdmsconnector.domain.EnrollPatientRequest;
//import clinicalconnector.nci.nih.gov.RegisterSubjectRequest;
import gov.nih.nci.cdmsconnector.domain.StudySubject;
import gov.nih.nci.clinicalconnector.dao.EnrollmentDAO;
import gov.nih.nci.clinicalconnector.manager.InvalidStudyOrPatientException;
import gov.nih.nci.clinicalconnector.manager.StudyAccessException;
import gov.nih.nci.cdmsconnector.util.Constants;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import org.apache.log4j.Logger;

public class EnrollmentOracleDAOImpl extends OracleDAO implements EnrollmentDAO{
	private final static Logger log = Logger.getLogger(EnrollmentOracleDAOImpl.class
            .getName());
	
	public String enrollPatient(EnrollPatientRequest cdmsEnrollPatientRequest, 
                                boolean saveEDate, boolean saveGen, 
                                boolean saveInits, boolean saveBDate			  ) throws Exception {
		String pId = null;
		String uName = null;
		String pWord = null;
		String c3dTnsEntry = null;

		String studyIdentifier = null, patientPosition = null, organizationName = null, 
		       participantIdentifier = null, informedConsentVersion = "", consentDateStr = "",
		       enrollDateStr = "", birthDateStr = "", gender = "", 
		       ptLastName = "", ptFirstName = "", ptInitials = "";
		String ppenrollDateStr = "", ppbirthDateStr = "", ppgender = "",
		       ppptLastName = "", ppptFirstName = "", ppptInitials = "";
		Date enrollDate, birthDate, informedConsentDate;

		studyIdentifier       = cdmsEnrollPatientRequest.getStudy().getStudyIdentifier();
		patientPosition       = cdmsEnrollPatientRequest.getStudySubject().getPatientPosition();
		organizationName      = cdmsEnrollPatientRequest.getStudy().getStudySite().getOrganizationName();
		informedConsentDate   = cdmsEnrollPatientRequest.getStudySubject().getSubjectMilesStone().getConsentDate();
		informedConsentVersion= cdmsEnrollPatientRequest.getStudySubject().getSubjectMilesStone().getConsentVersion();

		participantIdentifier = cdmsEnrollPatientRequest.getStudySubject().getParticipantIdentifier();
		
		enrollDate = cdmsEnrollPatientRequest.getStudySubject().getEnrollDate();
		birthDate  = cdmsEnrollPatientRequest.getStudySubject().getBirthDate();
		
		StudySubject studySubject = cdmsEnrollPatientRequest.getStudySubject();

		if (studyIdentifier != null) {
			try {

				if (patientPosition != null) {
					// get the Internal Id of Patient Position using the
					// position
					// id, study and site
					pId = getStudyPosId(studyIdentifier, patientPosition,
							organizationName);
				} else {
					pId = getNextStudyPosId(studyIdentifier, organizationName);
				}
				if (pId == null) {
					throw new Exception("Can Not enroll the patient: Could not get new patient position for Study: " + 
							             studyIdentifier + " and Site: " + organizationName);
				}
				if (patientPosition == null) {
					patientPosition = getStudyPosId(pId);
				}

				// Enroll the patient
				// -----------------------------------------------------------------------------------------------
				log.debug("Enrolling patient");

				EnrollPatient qa = new EnrollPatient();
				Map<String, String> m = getDCAPIUserCredentials();
				if (m != null && m.containsKey(Constants.UNAME)
						&& m.containsKey(Constants.PWORD)
						&& m.containsKey(Constants.C3D_TNS_ENTRY)) {
					uName = (String) m.get(Constants.UNAME);
					pWord = (String) m.get(Constants.PWORD);
					c3dTnsEntry = (String) m.get(Constants.C3D_TNS_ENTRY);
				} else {
					// Throw Exception
					String eMessage = "Unable to get DCAPIUserCredentials. Please Contact Clinical Connector Administrator";
					log.error(eMessage,	new StudyAccessException(eMessage));
				}

				log.debug("Study name : " + studyIdentifier);

				SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
				enrollDateStr=fmt.format(new Date());
				birthDateStr=fmt.format(new Date());
				consentDateStr=fmt.format(new Date());
				
				if(enrollDate!=null){
					enrollDateStr=fmt.format(enrollDate);
				} else {
					Calendar cal = Calendar.getInstance();
					enrollDateStr= fmt.format(cal.getTime());
				}

				if(birthDate!=null){
					birthDateStr=fmt.format(birthDate);
				} else {
					birthDateStr="";
				}

				if(informedConsentDate!=null){
					consentDateStr=fmt.format(informedConsentDate);
				} else {
					consentDateStr="";
				}
				gender = studySubject.getGender();
				if (gender == null) {
					gender = "";
				}
				
				ptLastName = studySubject.getLastName();
				ptLastName = ""; // Last Name is ALWAYS BLANK 
				ptFirstName = studySubject.getFirstName(); 
				ptFirstName =  ""; // First Name is ALWAYS BLANK 
				
				ptInitials = studySubject.getInitials();
				if (ptInitials == null) {
					ptInitials = "";
				}
				
				log.debug("uName         : '" + uName + "'");
				log.debug("c3dTnsEntry   : '" + c3dTnsEntry + "'");
				log.debug("studyName     : '" + studyIdentifier + "'");
				log.debug("patientId     : '" + pId + "'");
				log.debug("studysiteName : '" + organizationName + "'");
				log.debug("enrollDateStr : '" + enrollDateStr + "'");
				log.debug("consentDateStr: '" + consentDateStr + "'");
				log.debug("BirthDateStr  : '" + birthDateStr + "'");
				log.debug("GenderStr     : '" + gender + "'");
				log.debug("InitialsStr   : '" + ptInitials + "'");

     			String res = null;

                // Check the Patient Position Save Flags and set values accordingly
				if (saveBDate) {
					ppbirthDateStr = birthDateStr;
				} else {
					ppbirthDateStr = "";
				}

				/* Enrollment date MUST ALWAYS be included when ENROLLING
				 if (saveEDate) {
				 
					ppenrollDateStr = enrollDateStr;
				} else {
					ppenrollDateStr = "";
				}
				*/
				ppenrollDateStr = enrollDateStr;

				if (saveGen) {
					ppgender = gender;
				} else {
					ppgender = "";
				}
				
				if (saveInits) {
					ppptInitials = ptInitials;
				} else {
					ppptInitials = "";
				}
                /* Patient Name is NEVER saved */
				ppptLastName = "";
				ppptFirstName = "";
				
				res = qa.enrollPWrapper(uName, pWord, c3dTnsEntry,
						studyIdentifier, pId, organizationName, "AB",
						ppenrollDateStr, ppbirthDateStr, ppgender,
						ppptLastName, ppptFirstName, ppptInitials);

				System.out.println("After qa.enrollPWrapperWrapper.");
				log.debug("After qa.enrollPWrapperWrapper : ");
				
				setDataFlag(pId);
				
				log.debug("HAS_DATA_FLAG set to Y");

				try {
					//setPatientMRN(studySubject, studyIdentifier + "",
					setPatientMRN(organizationName, studyIdentifier + "",
							patientPosition, organizationName,
							participantIdentifier, consentDateStr, informedConsentVersion,
							ptInitials, enrollDateStr,
							birthDateStr, gender);
				} catch (Throwable t) {
					// TODO log a warning saying that gets e-mailed saying that
					// MRN
					// and NCI Institute Code could not be stored for the
					// request
					log	.warn("A problem occurred while setting the Patient ID (MRN) and/or NCI Institue Code: "
									+ t);
					// do nothing because a study may not have a Patient Id or
					// Institute Code defined for it so there is no error
				}

				if (res != null && !res.trim().equalsIgnoreCase("")) {
					throw new StudyAccessException(
							"Failed to Enroll Patient : " + res);
				}

			} catch (Throwable t) {
				t.printStackTrace();
				throw new StudyAccessException(t.getMessage());
			}

		} else {
			throw new Exception(
					"Can Not enroll the patient :StudySubject identifier is missing ");
		}
		return patientPosition;
	}
	
	private String getNextStudyPosId(String study, String site) {
		Connection cn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		String posId = null;
		try {
			cn = getConnection();
			stmt = cn.prepareStatement(
			/*
			 * "SELECT distinct P.PATIENT_POSITION_ID FROM " +
			 * "PATIENT_POSITIONS P," + "CLINICAL_STUDIES CS," +
			 * "STUDY_SITE_PATIENT_POSITIONS SP," + "SITES S " + "WHERE
			 * P.CLINICAL_STUDY_ID = CS.CLINICAL_STUDY_ID AND " +
			 * "P.CLINICAL_STUDY_ID = SP.CLINICAL_STUDY_ID AND SP.SITE_ID =
			 * S.SITE_ID AND " + "P.PATIENT_ENROLLMENT_DATE IS NULL AND " +
			 * "CS.STUDY = ? AND S.SITE =? ");
			 */

			"SELECT DISTINCT P.PATIENT_POSITION_ID "
					+ " FROM PATIENT_POSITIONS P, " + " CLINICAL_STUDIES CS, "
					+ " SITES S, " + " STUDY_SITE_PATIENT_POSITIONS SP "
					+ " WHERE SP.CLINICAL_STUDY_ID = CS.CLINICAL_STUDY_ID "
					+ " AND SP.PATIENT_POSITION_ID = P.PATIENT_POSITION_ID "
					+ " AND SP.SITE_ID = S.SITE_ID "
					+ " AND SP.CURRENT_FLAG = 'Y' "
					+ " AND P.PATIENT_ENROLLMENT_DATE IS NULL "
					+ " AND P.CLINICAL_STUDY_ID = SP.CLINICAL_STUDY_ID "
					+ " AND CS.STUDY = ? AND S.SITE = ?");

			stmt.setString(1, study);
			stmt.setString(2, site);

			result = stmt.executeQuery();
			if (result != null && result.next()) {
				posId = result.getString("PATIENT_POSITION_ID");
				log.debug("----------posId :" + posId);
			} else {
				throw new Exception(
						"Can not enroll the patient, position not available for Study:" 
						+ study + " and Site: " + site);
			}

		} catch (Exception e) {
			log.error(e.getMessage(), e);
		} finally {
			try {
				stmt.close();
				cn.close();
			} catch (Exception ex) {
			}
		}

		return posId;
	}
	
	
	private void setPatientMRN(
			String nciInstituteCode,
			String studyIdentifier, String patientPosition,
			String organizationName, String participantIdentifier,
			String consentDate, String consentVersion,
			String ptInitials, String regDate,
			String ptBirthDate, String ptGender)
			throws InvalidStudyOrPatientException, StudyAccessException,
			Exception {

		System.out.println("Inside setPatientMRN");

		String uName = null;
		String pWord = null;
		String c3dTnsEntry = null;
		// Model Change
		// String
		// nciInstituteCode=studySubject.getStudySite().getHealthCareSite(0).getHealthcareSiteIdentifier().toString();

		QuestionLoader qa = new gov.nih.nci.c3d.study.QuestionLoader();

		// Get DCAPI User Credentials
		Map<String, String> m = getDCAPIUserCredentials();

		if (m != null && m.containsKey(Constants.UNAME)
				&& m.containsKey(Constants.PWORD)
				&& m.containsKey(Constants.C3D_TNS_ENTRY)) {
			uName = (String) m.get(Constants.UNAME);
			pWord = (String) m.get(Constants.PWORD);
			c3dTnsEntry = (String) m.get(Constants.C3D_TNS_ENTRY);
		} else {
			// Throw Exception
			throw new StudyAccessException(
					"Unable to get DCAPIUserCredentials. Please Contact Clinical Connector Administrator.");
		}
		// get Study name
		Map<String, String> mrnCode = getMRNCDEInformation(studyIdentifier);
		// Map offStCdes= getOffStudyCDEInformation(stName);
		// if (offStCdes != null && offStCdes.containsKey(Constants.PT_ID_CDE)
		// &&
		// offStCdes.containsKey(Constants.NCI_INST_CD_CDE ) ){
		log.debug("Inside setPatientMRN");

		if (mrnCode != null) {
			/* && mrnCode.containsKey(Constants.PT_ID_CDE)
			   && mrnCode.containsKey(Constants.NCI_INST_CD_CDE)) */

			log.debug("Study Name : "    + studyIdentifier);
			System.out.println("Loading CDE identified data points.");
			/*
			log.debug("  PT_ID_CDE : "   + mrnCode.get(Constants.PT_ID_CDE));
			log.debug("  NCI_INST_CD : " + mrnCode.get(Constants.NCI_INST_CD_CDE));
			log.debug("  CONSENT_DATE : "    + mrnCode.get(Constants.CONSENT_DATE));
			log.debug("  CONSENT_VERSION : " + mrnCode.get(Constants.CONSENT_VERSION));
			log.debug("  PT_INITS : "	     + mrnCode.get(Constants.PT_INITS));
			log.debug("  PT_DOB : "          + mrnCode.get(Constants.PT_DOB));
			log.debug("  PT_GENDER : "       + mrnCode.get(Constants.PT_GENDER));
			log.debug("  REG_DATE : "	     + mrnCode.get(Constants.REG_DATE));
			*/
			String res = null;
			/*System.out.println("NCI_INST_CD : " + nciInstituteCode);
			System.out.println("PT_ID_CDE : " + participantIdentifier);
			System.out.println("CONSENT_DATE" + consentDate);
			System.out.println("CONSENT_VERSION" + consentVersion);
			System.out.println("PT_INITS" + ptInitials);
			System.out.println("PT_DOB" + ptBirthDate);
			System.out.println("PT_GENDER" + ptGender);
			System.out.println("REG_DATE" + regDate);*/

			// Try to set MRN if it's not NULL
			// TODO Need to check that mrnCode.get returns a value for each call 
			// TODO and only execute if it does retutn a value...
			// TODO nulls are killing system.

			if (participantIdentifier != null
				&& participantIdentifier.length() > 0
				&& mrnCode.containsKey(Constants.PT_ID_CDE)) {
				try {
					log.debug("MRN CODE :" + participantIdentifier);
					
					res = qa.loadQuestionValuesWrapper(uName, pWord,
							c3dTnsEntry, studyIdentifier, patientPosition,
							(String) mrnCode.get(Constants.PT_ID_CDE),
							participantIdentifier);

					if (res != null && !res.equalsIgnoreCase("")) {
						log.warn("Failed to record Patient Id/MRN due to reason : "	+ res);
					}
				} catch (Throwable t) {
					log.warn("Failed to record Patient Id/MRN due to reason : "
							+ res, t);
				}
			} else {
				System.out.println("   Patient Id not loaded due to value being null or CDE not being set for study.");
			}

			if (nciInstituteCode != null && nciInstituteCode.length() > 0
					&& mrnCode.containsKey(Constants.NCI_INST_CD_CDE) ) {
				try {
					log.debug("NCI Institute CODE :" + nciInstituteCode);

					res = qa.loadQuestionValuesWrapper(uName, pWord,
							c3dTnsEntry, studyIdentifier, patientPosition,
							(String) mrnCode.get(Constants.NCI_INST_CD_CDE),
							nciInstituteCode);

					if (res != null && !res.equalsIgnoreCase("")) {
						log.warn("Failed to record NCI Institute Code due to: "	+ res);
					}
				} catch (Throwable t) {
					log.warn("Failed to record NCI Institute Code due to: " + res, t);
				}
			} else {
				System.out.println("   NCI Institution Code not loaded due to value being null or CDE not being set for study.");
			}
			
			if (consentDate != null && consentDate.length() > 0
					&& mrnCode.containsKey(Constants.CONSENT_DATE) ) {
				try {
					log.debug("Consent Date:" + consentDate);

					res = qa.loadQuestionValuesWrapper(uName, pWord,
							c3dTnsEntry, studyIdentifier, patientPosition,
							(String) mrnCode.get(Constants.CONSENT_DATE),
							consentDate);

					if (res != null && !res.equalsIgnoreCase("")) {
						log.warn("Failed to record Consent Date due to: " + res);
					}
				} catch (Throwable t) {
					log.warn("Failed to record Consent Date due to: " + res, t);
				}
			} else {
				System.out.println("   Consent Date not loaded due to value being null or CDE not being set for study.");
			}
			/* PRC Removed because this is a FUTURE requirement
			 * if (consentVersion != null && consentVersion.length() > 0) {
				try {
					log.debug("Consent Version:" + consentVersion);

					res = qa.loadQuestionValuesWrapper(uName, pWord,
							c3dTnsEntry, studyIdentifier, patientPosition,
							(String) mrnCode.get(Constants.CONSENT_VERSION),
							consentVersion);

					if (res != null && !res.equalsIgnoreCase("")) {
						log.warn("Failed to record Consent Version due to: " + res);
					}
				} catch (Throwable t) {
					log.warn("Failed to record Consent Version due to: " + res, t);
				}
			}*/
			if (ptInitials != null && ptInitials.length() > 0
					&& mrnCode.containsKey(Constants.PT_INITS) ) {
				try {
					log.debug("Patient Initials:" + ptInitials);

					res = qa.loadQuestionValuesWrapper(uName, pWord,
							c3dTnsEntry, studyIdentifier, patientPosition,
							(String) mrnCode.get(Constants.PT_INITS),
							ptInitials);

					if (res != null && !res.equalsIgnoreCase("")) {
						log.warn("Failed to record Patient Initials due to: " + res);
					}
				} catch (Throwable t) {
					log.warn("Failed to record Patient Initials due to: " + res, t);
				}
			} else {
				System.out.println("   Patient Initials not loaded due to value being null or CDE not being set for study.");
			}
			
			if (ptBirthDate != null && ptBirthDate.length() > 0
					&& mrnCode.containsKey(Constants.PT_DOB) ) {
				try {
					log.debug("Patient DOB:" + ptBirthDate);

					res = qa.loadQuestionValuesWrapper(uName, pWord,
							c3dTnsEntry, studyIdentifier, patientPosition,
							(String) mrnCode.get(Constants.PT_DOB),
							ptBirthDate);

					if (res != null && !res.equalsIgnoreCase("")) {
						log.warn("Failed to record Patient DOB due to: " + res);
					}
				} catch (Throwable t) {
					log.warn("Failed to record Patient DOB due to: " + res, t);
				}
			} else {
				System.out.println("   Patient Date of Birth not loaded due to value being null or CDE not being set for study.");
			}
			
			if (ptGender != null && ptGender.length() > 0
					&& mrnCode.containsKey(Constants.PT_GENDER) ) {
				try {
					log.debug("Patient Gender:" + ptGender);

					res = qa.loadQuestionValuesWrapper(uName, pWord,
							c3dTnsEntry, studyIdentifier, patientPosition,
							(String) mrnCode.get(Constants.PT_GENDER),
							ptGender);

					if (res != null && !res.equalsIgnoreCase("")) {
						log.warn("Failed to record Patient Gender due to: " + res);
					}
				} catch (Throwable t) {
					log.warn("Failed to record Patient Gender due to: " + res, t);
				}
			} else {
				System.out.println("   Patient Gender not loaded due to value being null or CDE not being set for study.");
			}
			
			if (regDate != null && regDate.length() > 0
				&& mrnCode.containsKey(Constants.REG_DATE) ) {
				try {
					log.debug("Patient Gender:" + regDate);

					res = qa.loadQuestionValuesWrapper(uName, pWord,
							c3dTnsEntry, studyIdentifier, patientPosition,
							(String) mrnCode.get(Constants.REG_DATE),
							regDate);

					if (res != null && !res.equalsIgnoreCase("")) {
						log.warn("Failed to record Registration Date due to: " + res);
					}
				} catch (Throwable t) {
					log.warn("Failed to record Registration Date due to: " + res, t);
				}
			} else {
				System.out.println("   Registration Date not loaded due to value being null or CDE not being set for study.");
			}

		} else {
			throw new StudyAccessException(
					"Unable to get Study CDE Loading Information. Please contact Clinical Connector for C3D Service Administrator ");
		}

	}
	
	private void setDataFlag(String pId){
		String query = "";
		Connection cn=null;
		PreparedStatement stmt = null;
		try {
			cn = getConnection();
			stmt = cn.prepareStatement("update patient_positions set has_data_flag = 'Y' where patient_position_id = ?");

			stmt.setString(1, pId);

			stmt.executeQuery();

		} catch (Exception e) {
			log.error(e.getMessage(), e);
		} finally {
			try {
				stmt.close();
				cn.close();
			} catch (Exception ex) {
			}
		}

		
	}

}
