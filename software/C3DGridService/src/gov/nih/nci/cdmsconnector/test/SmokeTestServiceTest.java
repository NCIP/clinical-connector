package gov.nih.nci.cdmsconnector.test;

import java.rmi.RemoteException;

import org.apache.axis.types.URI.MalformedURIException;

import gov.nih.nci.ccts.grid.smoketest.client.SmokeTestServiceClient;
import junit.framework.TestCase;

public class SmokeTestServiceTest extends TestCase {

	private String url="http://localhost:8080/c3d/services/cagrid/SmokeTestService";
	
	public void smokeTest() throws MalformedURIException, RemoteException{
		SmokeTestServiceClient client = new SmokeTestServiceClient(url);
		
		client.ping();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
