package gov.nih.nci.cdmsconnector.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

	private static Properties props;
	private static String propertiesFileLocation;

	public static Properties getProperties() throws Exception {

		if (props == null) {
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

				validateProperties(properties);
				props = properties;
			}
		}

		return props;

	}
	
	public static Properties loadProperties(String path) throws Exception{
		propertiesFileLocation=path+"/c3dgridservice.properties";
		getProperties();
		props.put("CONF_FILES_DIR", path);
		return props;
	}

	private static void validateProperties(Properties properties)
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
