package gov.nih.nci.cdmsconnector.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilderFactory;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.globus.gsi.GlobusCredential;
import org.jasig.cas.authentication.Authentication;
import org.jasig.cas.authentication.principal.UsernamePasswordCredentials;

public abstract class CDMSConnectorBaseTest extends TestCase {
	private final static Logger log = Logger
			.getLogger(CDMSConnectorBaseTest.class);

	DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	Properties loginProperties = null;
	String externalIdentifier = "myExternalIdentifier";
	String userName = null;
	String password = null;
	String delegatedReference = null;

	protected String request = "";
	protected String url = "https://localhost:8080/c3d/services/cagrid/C3DGridService";
	protected String responseStr;
	protected String fileName;
	private GlobusCredential globusCredential;

	public GlobusCredential getCredentials() {
		if (globusCredential == null) {
			try {
				if(userName==null || password==null || "".equals(userName.trim()) || "".equals(password.trim())){
					return null;
				}
				org.cagrid.gaards.websso.authentication.CaGridAuthenticationManager authManager = new org.cagrid.gaards.websso.authentication.CaGridAuthenticationManager();
				UsernamePasswordCredentials credentials = new UsernamePasswordCredentials();
				credentials.setUsername(userName.trim());
				credentials.setPassword(password.trim());
				Authentication auth = authManager.authenticate(credentials);
				log.debug("authenticated");
				delegatedReference = authManager.getSerializedDelegationEpr();
				globusCredential = authManager.getCredentials();

			} catch (Exception e) {
				System.out.println("Error creating the client");
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
		return globusCredential;
	}

	public String getRequest() {

		try {
			if (request == null || "".equals(request)) {
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(new FileInputStream(fileName)));
				String s;

				s = reader.readLine();

				request = "";
				while (s != null) {
					request += s;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getResponseStr() {
		return responseStr;
	}

	public void setResponseStr(String responseStr) {
		this.responseStr = responseStr;
	}

	protected Reader getXMLReader() throws IOException {
		StringReader reader = new StringReader(getRequest());
		return reader;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
