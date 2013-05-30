/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.cdmsconnector.test;

import gov.nih.nci.cabig.ccts.domain.bridg.CommonDataElement;
import gov.nih.nci.cabig.ccts.domain.bridg.DataCollectionInstrument;
import gov.nih.nci.cabig.ccts.domain.bridg.DataCollectionModule;
import gov.nih.nci.cabig.ccts.domain.bridg.Event;
import gov.nih.nci.cabig.ccts.domain.bridg.Question;
import gov.nih.nci.cabig.ccts.domain.bridg.QuestionGroup;
import gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol;
import gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCDEDataRequest;
import gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCDEDataResponse;
import gov.nih.nci.cagrid.common.Utils;
import gov.nih.nci.cdmsconnector.c3d.client.C3DGridServiceClient;
import gov.nih.nci.cdmsconnector.dao.GetStudyCDEDataDAO;
import gov.nih.nci.cdmsconnector.dao.c3d.GetStudyCDEDataOracleDAOImpl;

import java.io.StringWriter;

import javax.xml.namespace.QName;

/**
 * test case for getData service
 * 
 * @author Amit
 * 
 */
public class GetStudyCDEsDataTest extends CDMSConnectorBaseTest {

	StudyProtocol[] result;
	CommonDataElement cde;

	String studyName = "00C0079";

	/**
	 * tests the getData Service at API level
	 */
	public void testGetDataAPI() {

		try {
			compareData(cde, studyName, 504);

			// compareData(cde, null, 143);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			compareData(cde, "wrongStudyName", 0);
			assertEquals("Should have thrown and exception", true, false);
		} catch (Exception e) {
			System.out.println("Error Message " + e.getMessage());
		}

		try {
			compareData(null, studyName, 0);
			assertEquals("Should have thrown and exception", true, false);
		} catch (Exception e) {
			System.out.println("Error Message " + e.getMessage());
		}

	}

	/**
	 * test the getData Service at the grid-service layer. Expects the
	 * gridservice with C3Dgridservice to be running on localhost
	 * 
	 * @throws Exception
	 */

	public void testGetStudyCDEsDataService() throws Exception {

		C3DGridServiceClient client = new C3DGridServiceClient(url,
				getCredentials());
		GetStudyCDEDataResponse response = client
				.getStudyCDEData(createGetStudyCDEDataRequest(cde, studyName));
		result = response.getStudyProtocol();
		StringWriter writer = new StringWriter();
		Utils.serializeObject(response, new QName("GetStudyCDEDataResponse"),
				writer);

		responseStr = writer.getBuffer().toString();
	}

	public static void main(String[] args) {
		GetStudyCDEsDataTest test = new GetStudyCDEsDataTest();

		test.testGetDataAPI();

		// test.testGetDataService();
	}

	public void compareData(CommonDataElement cde, String studyName,
			int expected) throws Exception {
		GetStudyCDEDataDAO dao = new GetStudyCDEDataOracleDAOImpl();
		// result = dao.getStudyCDEData(createGetStudyCDEDataRequest(cde,
		// studyName));
		// System.out.println("rcvd size=" + result.size());
		// assertEquals("Reveived wrong number of studies", expected, result
		// .size());
	}

	private GetStudyCDEDataRequest createGetStudyCDEDataRequest(
			CommonDataElement cde, String studyName) {
		if (cde == null || cde.getPublicIdentifier() == null
				|| cde.getVersion() == null) {
			cde = new CommonDataElement();
			cde.setPublicIdentifier("62");
			cde.setVersion("6.0");
		}

		GetStudyCDEDataRequest req = new GetStudyCDEDataRequest();
		req.setStudyName(studyName);
		req.setCommonDataElement(cde);
		return req;
	}

	public StudyProtocol[] getResult() {
		return result;
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
												q.getCommonDataElement().getVersion())
										.append(',');
								buf.append(q.getQuestionValue().getValue());
								buf.append('\n');
							}
						}
					}
				}
			}
		}
		return buf.toString();
	}

	public CommonDataElement getCde() {
		return cde;
	}

	public void setCde(CommonDataElement cde) {
		this.cde = cde;
	}

	public String getStudyName() {
		return studyName;
	}

	public void setStudyName(String studyName) {
		this.studyName = studyName;
	}

}
