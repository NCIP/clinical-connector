/*
 * Created on Jul 21, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package gov.nih.nci.clinicalconnector.dao;

import gov.nih.nci.cdmsconnector.util.Constants;
import gov.nih.nci.cdmsconnector.util.PropertiesUtil;
import gov.nih.nci.cdmsconnector.util.ServiceLocator;
import gov.nih.nci.cdmsconnector.util.ServiceLocatorException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;
import javax.transaction.UserTransaction;

import org.apache.log4j.Logger;

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

		Properties props = null;
		try {
			props = PropertiesUtil.getProperties();
		} catch (Exception e) {

		}

		Class.forName(props.getProperty(Constants.C3DDS_DRIVERCLASSNAME));
		cn = DriverManager.getConnection(
				props.getProperty(Constants.C3DDS_URL), props
						.getProperty(Constants.C3DDS_USERNAME), props
						.getProperty(Constants.C3DDS_PASSWORD));

		log.debug("After Trying to get Connection");

		return cn;
	}

	public static Connection getConnection(String userName, String password)
			throws Exception {

		// Get Datasource or connection directly .
		log.debug("Trying to get Connection");
		Connection cn = null;

		Properties props = null;
		try {
			props = PropertiesUtil.getProperties();
		} catch (Exception e) {

		}

		Class.forName(props.getProperty(Constants.C3DDS_DRIVERCLASSNAME));
		cn = DriverManager.getConnection(
				props.getProperty(Constants.C3DDS_URL), userName, password);

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
