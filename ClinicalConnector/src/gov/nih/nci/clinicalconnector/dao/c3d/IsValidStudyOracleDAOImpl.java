package gov.nih.nci.clinicalconnector.dao.c3d;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import gov.nih.nci.clinicalconnector.dao.IsValidStudyDAO;

import org.apache.log4j.Logger;

public class IsValidStudyOracleDAOImpl extends OracleDAO implements
		IsValidStudyDAO {

	private final static Logger log = Logger
			.getLogger(IsValidStudyOracleDAOImpl.class.getName());
	
	private final static String IS_STUDY_VALID_SQL="Select Study from clinical_studies where study = ?";
	
	private final static String IS_STUDY_READY_FOR_LOAD_LABS_SQL="select Study from NCI_LABS_MANUAL_LOAD_CTL where study = ? or inbound_study = ?";

	public boolean isValidStudy(String studyName) throws Exception {
		Boolean isValid = false;
		Connection conn = getConnection();
		PreparedStatement stmt = conn.prepareStatement(IS_STUDY_VALID_SQL);
		stmt.setString(1, studyName);
		ResultSet rs = stmt.executeQuery();
		//prc added code to hold boolean result; added closes for stmt and conn
		isValid = rs.next();
		stmt.close();
		conn.close();
		return isValid;
	}

	public boolean isStudyReadyForLoadLabs(String studyName) throws Exception {
		Connection conn = getConnection();
		PreparedStatement stmt = conn.prepareStatement(IS_STUDY_READY_FOR_LOAD_LABS_SQL);
		stmt.setString(1, studyName);
		stmt.setString(2, studyName);
		ResultSet rs = stmt.executeQuery();
		return rs.next();
	}
	
}
