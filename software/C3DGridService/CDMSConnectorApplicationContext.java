/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.cdmsconnector.util;

import org.springframework.web.context.support.XmlWebApplicationContext;

public class CDMSConnectorApplicationContext extends XmlWebApplicationContext {

	protected String[] getDefaultConfigLocations() {
		/*String confFilesLocation = getServletContext().getRealPath("")
				.replaceAll("webapps", "conf");
		try {
			PropertiesUtil.loadProperties(confFilesLocation);
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		//return new String[] { confFilesLocation + "/applicationConfig.xml" };
		return new String[] { "C:/softwares/jakarta-tomcat-5.0.28/conf/c3d/applicationConfig.xml" };
	}
	
	protected void initBeanDefinitionReader(org.springframework.beans.factory.xml.XmlBeanDefinitionReader beanDefinitionReader){

		beanDefinitionReader.loadBeanDefinitions(getResourceByPath("C:/softwares/jakarta-tomcat-5.0.28/conf/c3d/applicationConfig.xml"));
	}
}
