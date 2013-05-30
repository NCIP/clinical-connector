/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.clinicalconnector.dao.c3d;

import gov.nih.nci.clinicalconnector.dao.CaptureDAO;
//import gov.nih.nci.security.util.StringEncrypter;
//import gov.nih.nci.security.util.StringEncrypter.EncryptionException;
import gov.nih.nci.cdmsconnector.util.StringEncrypter;
import gov.nih.nci.cdmsconnector.util.StringEncrypter.EncryptionException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.log4j.Logger;

public class C3DCaptureDAOImpl extends OracleDAO implements CaptureDAO {
	private static final Logger log = Logger.getLogger(C3DCaptureDAOImpl.class
			.getName());

	protected static final String FIND_USER_QUERY = 
		"SELECT 'X' FROM C3D_USER WHERE EXTRNL_LOGIN_NAME = ?";
	protected static final String UPDATE_USER_QUERY = 
		"UPDATE C3D_USER SET C3D_USERNAME = ?, C3D_PASSWORD = ?, UPDATE_DATE = SYSDATE" +
		" WHERE EXTRNL_LOGIN_NAME =?";
	protected static final String INSERT_USER_QUERY = 
		"INSERT INTO C3D_USER (C3D_USERNAME, C3D_PASSWORD, EXTRNL_LOGIN_NAME) " +
		"VALUES (?, ?, ?)";
	
	public void createTransaction(String gridIdName, String c3dUsername, String c3dPassword) {

		PreparedStatement stmt1 = null;
		PreparedStatement stmt2 = null;
		Connection cn = null;
		boolean atLeastOne = false;

		log.debug("Starting Insert Transaction for C3D_USER table");

		// Encrypt Password
		try {
			c3dPassword = new StringEncrypter().oEncrypt(c3dPassword.trim());
		} catch (EncryptionException e) {
			e.printStackTrace();
		}

		// Find Record
		try {
			cn = getConnection();

			// Find the Grid User 
			stmt1 = cn.prepareStatement(FIND_USER_QUERY);
			stmt1.setString(1, gridIdName);

			ResultSet rs1 = stmt1.executeQuery();

			while (rs1.next()) {
				atLeastOne = true;
			}
			stmt1.close();
            
			// Grid User Not Found, So Insert one.
			if (!atLeastOne) {
				stmt2 = cn.prepareStatement(INSERT_USER_QUERY);
				stmt2.setString(1, c3dUsername);
				stmt2.setString(2, c3dPassword);
				stmt2.setString(3, gridIdName);
				stmt2.executeUpdate();
			
				stmt2.close();
			}
			if (atLeastOne) {
				stmt2 = cn.prepareStatement(UPDATE_USER_QUERY);
				stmt2.setString(1, c3dUsername);
				stmt2.setString(2, c3dPassword);
				stmt2.setString(3, gridIdName);
				stmt2.executeUpdate();
			
				stmt2.close();
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		try {
			cn.close();
		} catch (Exception ex){ 
			ex.printStackTrace();
		}
	
	}

}
