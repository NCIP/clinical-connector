package gov.nih.nci.clinicalconnector.dao.c3d;

import gov.nih.nci.cdmsconnector.domain.LabResult;
import gov.nih.nci.clinicalconnector.dao.LoadLabsDAO;
import gov.nih.nci.clinicalconnector.manager.StudyAccessException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.log4j.Logger;

public class LoadLabsOracleDAOImpl extends OracleDAO implements LoadLabsDAO {
	private final static Logger log = Logger.getLogger(LoadLabsOracleDAOImpl.class
            .getName());
	
	public void loadLabs(gov.nih.nci.cdmsconnector.domain.LoadLabsRequest request)
			throws Exception {
		Connection cn = null;
		PreparedStatement stmt = null;
		int[] insertStatus = null;
		boolean isExecuteBatch = false;
		try {
			// Getting the database connection
			log.debug("Getting Connection to dbase");
			cn = getConnection();
			log.debug("Got Connection to dbase");
			cn.setAutoCommit(false);
			stmt = cn
					.prepareStatement("INSERT INTO NCI_LABS_MANUAL_LOAD_HOLD (STUDY, PATIENT_ID, OC_PATIENT_POS, LAB_SAMPLE_DATE_RAW, LAB_SAMPLE_TIME_RAW,"
							+ "LAB_TEST_NAME, LAB_TEST_RESULT, LAB_TEST_UOM, LAB_TEST_RANGE, LABORATORY, LAB_TEST_EVENT, LAB_TEST_RANGE_LOW, LAB_TEST_RANGE_HIGH) VALUES"
							+ "(?,?,?,?,?,?,?,?,?,?,?,?,?)");

			for (LabResult result : request.getResults()) {

				if (result == null) {
					continue;
				}

				String range = result.getLow() + "-" + result.getHigh();

				stmt.setString(1, result.getStudy().getStudyIdentifier());
				stmt.setString(2, result.getStudySubject().getParticipantIdentifier());
				stmt.setString(3, result.getStudySubject().getPatientPosition());

				SimpleDateFormat fmt = new SimpleDateFormat("yyyy/MM/dd");

				String reportedDate = fmt.format(Calendar.getInstance()
						.getTimeInMillis());

				if (result.getReportedDate() != null) {
					reportedDate = fmt.format(result.getReportedDate());
				}

				stmt.setString(4, reportedDate);

				SimpleDateFormat fmtTime = new SimpleDateFormat("HH:mm:ssa");

				String reportedTime = fmtTime.format(Calendar.getInstance()
						.getTimeInMillis());

				if (result.getReportedDate() != null) {
					reportedTime = fmtTime.format(result.getReportedDate());
				}

				stmt.setString(5, reportedTime);

				stmt.setString(6, result.getActivity().getName());

				stmt.setString(7, result.getTextResult());

				stmt.setString(8, result.getResultUnit());
				stmt.setString(9, range);

				stmt.setString(10, result.getLabIdentifier());

				stmt.setString(11, result.getActivity().getName());
				stmt.setString(12, result.getLow());
				stmt.setString(13, result.getHigh());
				stmt.addBatch();
				isExecuteBatch = true;

			}
			if (isExecuteBatch == true) {
				// Executing the batch of statements.
				insertStatus = stmt.executeBatch();
				cn.commit();

			}

		} catch (Exception ex) {
			log.fatal(ex);
			throw new StudyAccessException(ex);
		} finally {
			try {
				if (insertStatus != null) {
					int iProcessed = 0;
					boolean bError = false;
					// determine operation result
					for (int i = 0; i < insertStatus.length; i++) {
						iProcessed = insertStatus[i];
						if (iProcessed > 0 || iProcessed == -2) {
							// statement was successful
						} else {
							// error on statement
							bError = true;
							break;
						}
					}
					if (bError) {
						cn.rollback();
					} else {
						cn.commit();
					}
				} else {
					if (cn != null)
						cn.rollback();
				}
				if (stmt != null)
					stmt.close();
				if (cn != null)
					cn.close();
			} catch (Exception ex) {
			}
		}

	}

}
