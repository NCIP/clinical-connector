package gov.nih.nci.clinicalconnector.dao.c3d;

import gov.nih.nci.clinicalconnector.dao.TranslateStudyDAO;
import gov.nih.nci.cabig.ctms.suite.authorization.SuiteRole;
import gov.nih.nci.cdmsconnector.domain.StudySubject;
import gov.nih.nci.clinicalconnector.dao.IsValidStudyDAO;
import gov.nih.nci.cdmsconnector.domain.Study;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import gov.nih.nci.cdmsconnector.domain.EnrollPatientRequest;

import org.apache.log4j.Logger;

public class TranslateStudyDAOImpl extends OracleDAO implements TranslateStudyDAO {
	
	IsValidStudyDAO isValidStudyDAO;

	private static final Logger log = Logger.getLogger(C3DCaptureDAOImpl.class
			.getName());

	protected static final String FIND_EXISTING_TRANS = 
		"SELECT STUDY_TRANS FROM STUDY_TRANSLATIONS WHERE STUDY_IN = ?";

	protected static final String TRANSLATE_STUDY =
		"SELECT CC_TRANSLATE(?) NEW_TRANS FROM DUAL";

	protected static final String FIND_REVERSE_TRANS = 
		"SELECT STUDY_IN FROM STUDY_TRANSLATIONS WHERE STUDY_TRANS = ?";

	protected static final String INSERT_TRANS = 
		"INSERT INTO STUDY_TRANSLATIONS (STUDY_IN, STUDY_TRANS, CREATE_USER, CREATE_DATE) " +
		"VALUES (?, ?, ?, SYSDATE)";
	
	public String translateStudy(String studyName) throws Exception {

		System.out.println("Inside Translate Study");
        PreparedStatement stmt1 = null;
		PreparedStatement stmt2 = null;
		Connection cn = null;
		boolean atLeastOne = false;
		String holdStudy = studyName;
		String newStudy = null;
		String revsStudy = null;
		
		// Find Record
		try {
			System.out.println("Connecting to DB");
			cn = getConnection();

			// Find existing Translation 
			stmt1 = cn.prepareStatement(FIND_EXISTING_TRANS);
			stmt1.setString(1, holdStudy);

			System.out.println("Executing Query FIND_EXISTING_TRANS");
			ResultSet rs1 = stmt1.executeQuery();

			while (rs1.next()) {
				atLeastOne = true;
				newStudy = rs1.getString("STUDY_TRANS");
			}
			stmt1.close();
            
			// If no translation found, Build one.
			if (!atLeastOne) {
				System.out.println("Existing Not Found");
				stmt2 = cn.prepareStatement(TRANSLATE_STUDY);
				stmt2.setString(1, holdStudy);
				
				System.out.println("Executing Query TRANSLATE_STUDY");
				ResultSet rs2 = stmt2.executeQuery();
				
				while (rs2.next()) {
					newStudy = rs2.getString("NEW_TRANS");
					System.out.println("Translated '" + holdStudy +"' to '" + newStudy +"'.");
				}
				stmt2.close();
				if(!isValidStudyDAO.isValidStudy(newStudy)){
					throw new Exception("ERROR: Translated Study Not Found! (inBound Study=[" + holdStudy + "] " + 
							            "Translated Study=[" + newStudy + "]).  Invalid Study Identifier.");
				} else {
					stmt1 = null;
					rs1 = null;
					stmt1 = cn.prepareStatement(FIND_REVERSE_TRANS);
					stmt1.setString(1, newStudy);

					rs1 = stmt1.executeQuery();

					while (rs1.next()) {
						atLeastOne = true;
						revsStudy = rs1.getString("STUDY_IN");
					}
					stmt1.close();
					if(atLeastOne){
						throw new Exception("ERROR: Duplicate Translation Attempted! (inBound Study [" + holdStudy + 
								            "] translated to [" + newStudy + "] which is already mapped to [" +
								            revsStudy + "]).");
					} else {
						String userDN = null;
						try {
							userDN=gov.nih.nci.cagrid.introduce.servicetools.security.SecurityUtils.getCallerIdentity();
						} catch (Exception e1) {
							e1.printStackTrace();
							throw new Exception(e1.toString());
						}
						
						stmt2 = null;
						stmt2 = cn.prepareStatement(INSERT_TRANS);
						stmt2.setString(1, holdStudy);
						stmt2.setString(2, newStudy);
						stmt2.setString(3, userDN);
						stmt2.executeUpdate();
					
						stmt2.close();
						//return newStudy;
						//study.setStudyIdentifier(newStudy);
						//cdmsEnrollPatientRequest.setStudy(study);
					}
				}
			} //else {
				//return newStudy;
				//study.setStudyIdentifier(newStudy);
				//cdmsEnrollPatientRequest.setStudy(study);
	        //}	
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new Exception(ex.getMessage());
		}
		try {
			cn.close();
		} catch (Exception ex){ 
			ex.printStackTrace();
		}
		return newStudy;
	}
	
	public IsValidStudyDAO getIsValidStudyDAO() {
		return isValidStudyDAO;
	}

	public void setIsValidStudyDAO(IsValidStudyDAO isValidStudyDAO) {
		this.isValidStudyDAO = isValidStudyDAO;
	}
}
