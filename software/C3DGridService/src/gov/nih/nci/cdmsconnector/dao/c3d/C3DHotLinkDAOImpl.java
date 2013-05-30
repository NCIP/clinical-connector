/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.cdmsconnector.dao.c3d;

import gov.nih.nci.cdmsconnector.dao.HotLinkDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.UUID;

import org.apache.log4j.Logger;

public class C3DHotLinkDAOImpl extends OracleDAO implements HotLinkDAO {
	private static final Logger log = Logger.getLogger(C3DHotLinkDAOImpl.class
			.getName());

	protected static final String CREATE_TRANSACTION_QUERY = "INSERT INTO HOTLINKRDC (TRANS_NUMB, HL_USER, HL_PASS, HL_STUDY, HL_PTPOS, HL_PTID ) VALUES (?, ?, ?, ?, ?, ?)";

	public String createTransaction(String userName, String password,
			String study, String patientPosition, String patientId) {
		String randId = UUID.randomUUID().toString();
		String transactionId = randId.substring(0, randId.length() > 30 ? 30
				: randId.length());
		log.debug("new transactionId generated:" + transactionId);

		try {
			Connection conn = getConnection();
			PreparedStatement stmt = conn
					.prepareStatement(CREATE_TRANSACTION_QUERY);
			stmt.setString(1, transactionId);
			stmt.setString(2, userName);
			stmt.setString(3, password);
			stmt.setString(4, study);
			stmt.setString(5, patientPosition);
			stmt.setString(6, patientId);
			stmt.executeUpdate();
			return transactionId;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
