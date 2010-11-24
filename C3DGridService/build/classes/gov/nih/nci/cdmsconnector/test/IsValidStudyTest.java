package gov.nih.nci.cdmsconnector.test;


import gov.nih.nci.cabig.ccts.domain.studydata.IsValidStudyRequest;
import gov.nih.nci.cabig.ccts.domain.studydata.IsValidStudyResponse;
import gov.nih.nci.cagrid.common.Utils;
import gov.nih.nci.cdmsconnector.c3d.client.C3DGridServiceClient;

import java.io.StringWriter;

import javax.xml.namespace.QName;

public class IsValidStudyTest extends CDMSConnectorBaseTest {

	String studyName = "00C0079";

	public void testIsValidStudyService() throws Exception {

		C3DGridServiceClient client = new C3DGridServiceClient(url, getCredentials());
		IsValidStudyResponse response = client.isValidStudy(createIsValidStudyRequest(studyName));
		StringWriter writer = new StringWriter();
		Utils.serializeObject(response, new QName("IsValidStudyResponse"), writer);

		responseStr = writer.getBuffer().toString();
	}

	private IsValidStudyRequest createIsValidStudyRequest(String studyName) {
		IsValidStudyRequest req = new IsValidStudyRequest();
		req.setStudyName(studyName);
		return req;
	}

	public static void main(String[] args) throws Exception {
		IsValidStudyTest test = new IsValidStudyTest();

		//test.testGetStudyCDEsAPI();

		// test.testGetStudyCDEsService();
	}

	public String getStudyName() {
		return studyName;
	}

	public void setStudyName(String studyName) {
		this.studyName = studyName;
	}

//	public String getCSVResponse() {
//		StringBuffer buf = new StringBuffer();
//		for (StudyProtocol study : result) {
//			for (Event event : study.getEvent()) {
//				for (DataCollectionInstrument dci : event.getDcis()) {
//					for (DataCollectionModule dcm : dci.getDcms()) {
//						for (QuestionGroup qg : dcm.getQuestionGroups()) {
//							for (Question q : qg.getQuestions()) {
//								buf.append(study.getStudyIdentifier()).append(
//										',');
//								buf.append(event.getName()).append(',');
//								buf.append(dci.getName()).append(',');
//								buf.append(dcm.getId()).append(',');
//								buf.append(qg.getName()).append(',');
//								buf.append(q.getId()).append(',');
//								buf.append(q.getDefaultPrompt()).append(',');
//								buf.append(q.getCde().getPublicIdentifier())
//										.append(':').append(
//												q.getCde().getVersion());
//								buf.append('\n');
//							}
//						}
//					}
//				}
//			}
//		}
//		return buf.toString();
//	}

}
