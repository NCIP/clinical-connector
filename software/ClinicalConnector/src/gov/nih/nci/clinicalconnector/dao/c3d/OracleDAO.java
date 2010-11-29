package gov.nih.nci.clinicalconnector.dao.c3d;

import gov.nih.nci.cdmsconnector.util.Constants;
import gov.nih.nci.clinicalconnector.dao.BaseJDBCDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

public abstract class OracleDAO extends BaseJDBCDAO {
	private final static Logger log = Logger.getLogger(OracleDAO.class
            .getName());
	
	private static Map<String, String> dcapiUserCredentials;

	public Map<String, String> getDCAPIUserCredentials() {
		if(dcapiUserCredentials==null){
			synchronized(this.getClass()){
				Map<String, String> m = new HashMap<String, String>();
				Connection cn = null;
				PreparedStatement stmt = null;
				ResultSet result = null;
				String pWord = null;

				try {
					cn = getConnection();
					stmt = cn
							.prepareStatement("SELECT UNAME,PWORD,STATUS,C3D_TNS_ENTRY FROM DCAPI_USER_CREDENTIALS WHERE STATUS = 'ACTIVE'");
					result = stmt.executeQuery();
					if (result != null) {
						result.next();
						m.put(Constants.UNAME, result.getString(Constants.UNAME));
						pWord = result.getString(Constants.PWORD);
						log.debug("----------DCAPI PWORD before decryption :" + pWord);
						gov.nih.nci.cdmsconnector.util.StringEncrypter encrypter = new gov.nih.nci.cdmsconnector.util.StringEncrypter();
						pWord = encrypter.oDecrypt(pWord);

						m.put(Constants.PWORD, pWord);
						m.put(Constants.C3D_TNS_ENTRY, result
								.getString(Constants.C3D_TNS_ENTRY));

						log.debug("----------DCAPI UNAME :"
								+ result.getString(Constants.UNAME));
						log.debug("----------DCAPI PWORD :" + pWord);
						log.debug("----------DCAPI C3D_TNS_ENTRY :"
								+ result.getString(Constants.C3D_TNS_ENTRY));
					}

				} catch (Exception e) {
					log.fatal(e);
					throw new RuntimeException(e);
				} finally {
					try {
						stmt.close();
					} catch (Exception ex) {
					}
					try {
						cn.close();
					} catch (Exception ex) {
					}
				}
				dcapiUserCredentials=m;
			}
		}
		
		return dcapiUserCredentials;
	}
	
	
	public String getStudyPosId(String study, String pos, String site) {
		Connection cn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		String posId = null;
		try {
			cn = getConnection();
			stmt = cn.prepareStatement("SELECT P.PATIENT_POSITION_ID FROM "
					+ "PATIENT_POSITIONS P," + "CLINICAL_STUDIES CS,"
					+ "STUDY_SITE_PATIENT_POSITIONS SP,"
					+ "SITES S "
					+ "WHERE P.CLINICAL_STUDY_ID = CS.CLINICAL_STUDY_ID AND "
					+
					// "P.CLINICAL_STUDY_ID = SP.CLINICAL_STUDY_ID AND
					// SP.SITE_ID = S.SITE_ID AND " +
					"P.PATIENT_ENROLLMENT_DATE IS NULL AND "
					+ "P.PATIENT=? AND CS.STUDY = ? AND S.SITE =? ");

			stmt.setString(1, pos);
			stmt.setString(2, study);
			stmt.setString(3, site);

			result = stmt.executeQuery();

			if (result != null) {
				result.next();
				posId = result.getString("PATIENT_POSITION_ID");

				log.debug("----------posId :" + posId);

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

	public String getStudyPosId(String posId) {
		Connection cn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		String position = null;
		try {
			cn = getConnection();
			stmt = cn
					.prepareStatement("SELECT PATIENT FROM PATIENT_POSITIONS WHERE PATIENT_POSITION_ID=? ");

			stmt.setString(1, posId);

			result = stmt.executeQuery();
			if (result != null) {
				result.next();
				position = result.getString("PATIENT");
				log.debug("----------posId :" + position);
			} else {
				throw new Exception(
						"Can Not enroll the patient :Position not available ");
			}

		} catch (Exception e) {
			log.error(e.getMessage(), e);
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				cn.close();
			} catch (Exception ex) {
			}
		}

		return position;
	}


	/**
	 * 
	 * @param study
	 * @return
	 */
	public Map<String, String> getMRNCDEInformation(String study) {

		Map<String, String> m = new HashMap<String, String>();
		Connection cn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			cn = getConnection();
			pstmt = cn
					.prepareStatement("SELECT REFERENCE_CODE,CDE FROM STUDY_CDES WHERE STUDY =? " +
							          " AND REFERENCE_CODE IN (?,?,?,?,?,?,?,?)");
			pstmt.setString(1, study);
			pstmt.setString(2, Constants.PT_ID_CDE);
			pstmt.setString(3, Constants.NCI_INST_CD_CDE);
			pstmt.setString(4, Constants.CONSENT_DATE);
			pstmt.setString(5, Constants.CONSENT_VERSION);
			pstmt.setString(6, Constants.PT_INITS);
			pstmt.setString(7, Constants.PT_DOB);
			pstmt.setString(8, Constants.PT_GENDER);
			pstmt.setString(9, Constants.REG_DATE);
			
			rs = pstmt.executeQuery();
			while (rs.next()) {
				if (rs.getString(Constants.REFERENCE_CODE).equalsIgnoreCase(
						Constants.PT_ID_CDE)) {
					m.put(Constants.PT_ID_CDE, rs.getString(Constants.CDE));
				} else if (rs.getString(Constants.REFERENCE_CODE)
						.equalsIgnoreCase(Constants.NCI_INST_CD_CDE)) {
					m.put(Constants.NCI_INST_CD_CDE, rs
							.getString(Constants.CDE));
				} else if (rs.getString(Constants.REFERENCE_CODE)
						.equalsIgnoreCase(Constants.CONSENT_DATE)) {
					m.put(Constants.CONSENT_DATE, rs
							.getString(Constants.CDE));
				} else if (rs.getString(Constants.REFERENCE_CODE)
						.equalsIgnoreCase(Constants.CONSENT_VERSION)) {
					m.put(Constants.CONSENT_VERSION, rs
							.getString(Constants.CDE));
				} else if (rs.getString(Constants.REFERENCE_CODE)
						.equalsIgnoreCase(Constants.PT_INITS)) {
					m.put(Constants.PT_INITS, rs
							.getString(Constants.CDE));
				} else if (rs.getString(Constants.REFERENCE_CODE)
						.equalsIgnoreCase(Constants.PT_DOB)) {
					m.put(Constants.PT_DOB, rs
							.getString(Constants.CDE));
				} else if (rs.getString(Constants.REFERENCE_CODE)
						.equalsIgnoreCase(Constants.PT_GENDER)) {
					m.put(Constants.PT_GENDER, rs
							.getString(Constants.CDE));
				} else if (rs.getString(Constants.REFERENCE_CODE)
						.equalsIgnoreCase(Constants.REG_DATE)) {
					m.put(Constants.REG_DATE, rs
							.getString(Constants.CDE));
				}
			}
		} catch (Exception ex) {

			log.fatal(ex);
			throw new RuntimeException(ex);

		} finally {
			try {
				pstmt.close();
			} catch (Exception ex) {
			}
			try {
				cn.close();
			} catch (Exception x) {
			}
		}
		return m;
	}


}
