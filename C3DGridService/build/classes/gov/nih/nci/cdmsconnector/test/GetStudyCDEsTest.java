package gov.nih.nci.cdmsconnector.test;


import gov.nih.nci.cabig.ccts.domain.bridg.DataCollectionInstrument;
import gov.nih.nci.cabig.ccts.domain.bridg.DataCollectionModule;
import gov.nih.nci.cabig.ccts.domain.bridg.Event;
import gov.nih.nci.cabig.ccts.domain.bridg.Question;
import gov.nih.nci.cabig.ccts.domain.bridg.QuestionGroup;
import gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol;
import gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCDEsRequest;
import gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCDEsResponse;
import gov.nih.nci.cagrid.common.Utils;
import gov.nih.nci.cdmsconnector.c3d.client.C3DGridServiceClient;

import java.io.StringWriter;

import javax.xml.namespace.QName;

public class GetStudyCDEsTest extends CDMSConnectorBaseTest {

	StudyProtocol[] result;
	String studyName = "00C0079";

/*	public void testGetStudyCDEsAPI() throws Exception {
		compareDataFromAPI(studyName, 974);
		// compareDataFromAPI(null, 0);
		// compareDataFromAPI("%", 0);
	}

	private void compareDataFromAPI(String studyName, int expected)
			throws Exception {
		GetStudyCDEDataDAO dao = new GetStudyCDEDataOracleDAOImpl();
		result = dao.getStudyCDEs(createGetStudyCDEsRequest(studyName));// StudyCDEs(
																// studyName);
		System.out.println("rcvd size=" + result.size());
		// assertEquals("Reveived wrong number of studies", expected, result
		// .size());
	}*/

	public void testGetStudyCDEsService() throws Exception {
		C3DGridServiceClient client = new C3DGridServiceClient(url, getCredentials());
		GetStudyCDEsResponse response = client.getStudyCDEs(createGetStudyCDEsRequest(studyName));
		result = response.getStudyProtocol();
		StringWriter writer = new StringWriter();
		Utils.serializeObject(response, new QName("GetStudyCDEsResponse"), writer);

		responseStr = writer.getBuffer().toString();
	}

	private GetStudyCDEsRequest createGetStudyCDEsRequest(String studyName) {
		GetStudyCDEsRequest req = new GetStudyCDEsRequest();
		req.setStudyName(studyName);
		return req;
	}

	public static void main(String[] args) throws Exception {
		GetStudyCDEsTest test = new GetStudyCDEsTest();

		//test.testGetStudyCDEsAPI();

		// test.testGetStudyCDEsService();
	}

	public String getStudyName() {
		return studyName;
	}

	public void setStudyName(String studyName) {
		this.studyName = studyName;
	}

	public String getCSVResponse() {
		StringBuffer buf = new StringBuffer();
		for (StudyProtocol studyProtocol : result) {
			for (Event event : studyProtocol.getEvent()) {
				for (DataCollectionInstrument dci : event.getDataCollectionInstrument()) {
					for (DataCollectionModule dcm : dci.getDataCollectionModule()) {
						for (QuestionGroup qg : dcm.getQuestionGroup()) {
							for (Question q : qg.getQuestion()) {
								buf.append(studyProtocol.getIdentifier(0).getExtension()).append(
										',');
								buf.append(event.getName()).append(',');
								buf.append(dci.getName()).append(',');
								buf.append(dcm.getId()).append(',');
								buf.append(qg.getName()).append(',');
								buf.append(q.getId()).append(',');
								buf.append(q.getDefaultPrompt()).append(',');
								buf.append(q.getCommonDataElement().getPublicIdentifier())
										.append(':').append(
												q.getCommonDataElement().getVersion());
								buf.append('\n');
							}
						}
					}
				}
			}
		}
		return buf.toString();
	}

}
