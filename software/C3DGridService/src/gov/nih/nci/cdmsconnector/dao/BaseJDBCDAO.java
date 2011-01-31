/*
 * Created on Jul 21, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package gov.nih.nci.cdmsconnector.dao;

import gov.nih.nci.cdmsconnector.dao.c3d.OracleDAO;
import gov.nih.nci.cdmsconnector.dao.c3d.OracleDAOConstants;
import gov.nih.nci.cdmsconnector.manager.AccessPermissionException;
import gov.nih.nci.cdmsconnector.manager.StudyAccessException;
import gov.nih.nci.cdmsconnector.util.Constants;
import gov.nih.nci.cdmsconnector.util.PropertiesUtil;
import gov.nih.nci.cdmsconnector.util.ServiceLocator;
import gov.nih.nci.cdmsconnector.util.ServiceLocatorException;
import gov.nih.nci.cdmsconnector.util.StringEncrypter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;
import javax.transaction.UserTransaction;

import org.apache.log4j.Logger;

import java.util.Map;
import java.util.Properties;

/**
 * @author griffinch
 * 
 *         TODO To change the template for this generated type comment go to
 *         Window - Preferences - Java - Code Style - Code Templates
 */
public abstract class BaseJDBCDAO {

	private static Logger log = Logger.getLogger(Connection.class);

	public static Connection getConnection() throws Exception {

		// Get Datasource or connection directly .
		log.debug("Trying to get Connection");
		Connection cn = null;

		Properties DBprops = null;
		try {
			DBprops = PropertiesUtil.getDBProperties();
		} catch (Exception e) {

		}

		Class.forName(DBprops.getProperty(Constants.C3DDS_DRIVERCLASSNAME));
		cn = DriverManager.getConnection(
				DBprops.getProperty(Constants.C3DDS_URL), 
				DBprops.getProperty(Constants.C3DDS_USERNAME), 
				DBprops.getProperty(Constants.C3DDS_PASSWORD));

		log.debug("After Trying to get Connection");

		return cn;
	}

	public static Connection getConnection(String userName, String password)
			throws Exception {

		// Get Datasource or connection directly .
		log.debug("Trying to get Connection");
		Connection cn = null;

		Properties DBprops = null;
		try {
			DBprops = PropertiesUtil.getDBProperties();
		} catch (Exception e) {

		}

		Class.forName(DBprops.getProperty(Constants.C3DDS_DRIVERCLASSNAME));
		cn = DriverManager.getConnection(
				DBprops.getProperty(Constants.C3DDS_URL), userName, password);

		log.debug("After Trying to get Connection");

		return cn;
	}

	protected Connection getConnectionOriginal()
			throws ServiceLocatorException, SQLException {

		ServiceLocator service = ServiceLocator.getInstance();
		DataSource ds = service.getDataSource(ServiceLocator.C3D_DATA_SOURCE);
		Connection cn = ds.getConnection();
		return cn;
	}

	protected UserTransaction getUserTransaction()
			throws ServiceLocatorException {
		ServiceLocator service = ServiceLocator.getInstance();
		return service.getUserTransaction();

	}
}
