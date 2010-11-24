package gov.nih.nci.cdmsconnector.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import gov.nih.nci.cdmsconnector.dao.BaseJDBCDAO;

public class PropertiesUtil {

	private static Properties DBprops;
	private static Properties AppProps;
	private static String propertiesFileLocation;

	public static Properties getDBProperties() throws Exception {

		if (DBprops == null) {

						String catalinaHome = System.getProperty("catalina.home");
			String propertiesFilePath = "c3d/c3dgridservice.properties";
			java.io.InputStream inputStream = null;

			if (catalinaHome != null) {
				propertiesFilePath = catalinaHome + "/conf/"
						+ propertiesFilePath;
				inputStream = new FileInputStream(propertiesFilePath);
			} else {
				inputStream = FileLoader.getInstance().getFileAsStream(
						"registerConsumer_gridservice.properties");
			}

			Properties properties = new Properties();
			if (inputStream != null) {
				try {
					properties.load(inputStream);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (!properties.isEmpty()) {

				validateDBProperties(properties);
				DBprops = properties;
			}
		}

		return DBprops;

	}

public static Properties getAppProperties() throws Exception {

	if (AppProps == null) {

		/* * * * */
		// prc This will get Properties from Table
		String GET_FILTER = "select PROPERTY_KEY, PROPERTY_VALUE" +
			                "  from CLINICAL_CONNECTOR_PROPERTIES ";

		Connection cn = null;
		PreparedStatement stmt1 = null;
		Properties properties = new Properties();

		try {
			cn = BaseJDBCDAO.getConnection();
			stmt1 = cn.prepareStatement(GET_FILTER);

			ResultSet rs1 = stmt1.executeQuery();

			while (rs1.next()) {
				properties.setProperty(rs1.getString("PROPERTY_KEY"), rs1.getString("PROPERT_VALUE"));
			}

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
			
		if (!properties.isEmpty()) {

			AppProps = properties;
		}
	}

	return AppProps;

}

	public static Properties loadDBProperties(String path) throws Exception{
		propertiesFileLocation=path+"/c3dgridservice.properties";
		getDBProperties();
		DBprops.put("CONF_FILES_DIR", path);
		return DBprops;
	}

	private static void validateDBProperties(Properties properties)
			throws Exception {

		String errorMessage = "";
		boolean isValue = true;
		if (properties.containsKey(Constants.C3DDS_URL)) {
			String url = properties.getProperty(Constants.C3DDS_URL);
			if (isValue && url != null && url.length() > 0)
				isValue = true;
			else
				isValue = false;
		} else {
			errorMessage = errorMessage + Constants.C3DDS_URL
					+ " property is missing.";
			isValue = false;
		}
		if (properties.containsKey(Constants.C3DDS_DRIVERCLASSNAME)) {
			String driverClassName = properties
					.getProperty(Constants.C3DDS_DRIVERCLASSNAME);
			if (isValue && driverClassName != null
					&& driverClassName.length() > 0)
				isValue = true;
			else
				isValue = false;
		} else {
			errorMessage = errorMessage + Constants.C3DDS_DRIVERCLASSNAME
					+ " property is missing.";
			isValue = false;
		}
		if (properties.containsKey(Constants.C3DDS_USERNAME)) {
			String username = properties.getProperty(Constants.C3DDS_USERNAME);
			if (isValue && username != null && username.length() > 0)
				isValue = true;
			else
				isValue = false;
		} else {
			errorMessage = errorMessage + Constants.C3DDS_USERNAME
					+ " property is missing.";
			isValue = false;
		}
		if (properties.containsKey(Constants.C3DDS_PASSWORD)) {
			String password = properties.getProperty(Constants.C3DDS_PASSWORD);
			if (isValue && password != null && password.length() > 0)
				isValue = true;
			else {
				isValue = false;
			}
		} else {
			errorMessage = errorMessage + Constants.C3DDS_PASSWORD
					+ " property is missing.";
			isValue = false;
		}

		if (!isValue)
			throw new Exception(errorMessage);

	}

}
