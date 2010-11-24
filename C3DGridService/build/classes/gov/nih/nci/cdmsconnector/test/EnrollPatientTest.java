package gov.nih.nci.cdmsconnector.test;

import gov.nih.nci.cabig.ccts.domain.bridg.Document;
import gov.nih.nci.cabig.ccts.domain.bridg.HealthCareSite;
import gov.nih.nci.cabig.ccts.domain.bridg.Participant;
import gov.nih.nci.cabig.ccts.domain.bridg.Person;
import gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol;
import gov.nih.nci.cabig.ccts.domain.bridg.StudySite;
import gov.nih.nci.cabig.ccts.domain.bridg.StudySubject;
import gov.nih.nci.cabig.ccts.domain.cdt.CD;
import gov.nih.nci.cabig.ccts.domain.cdt.II;
import gov.nih.nci.cabig.ccts.domain.cdt.PN;
import gov.nih.nci.cabig.ccts.domain.cdt.TS;
import gov.nih.nci.cabig.ccts.domain.enrollpatient.EnrollPatientRequest;
import gov.nih.nci.cabig.ccts.domain.enrollpatient.EnrollPatientResponse;
import gov.nih.nci.cagrid.common.Utils;
import gov.nih.nci.cdmsconnector.c3d.client.C3DGridServiceClient;
import gov.nih.nci.cdmsconnector.c3d.service.C3DGridServiceImpl;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Calendar;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class EnrollPatientTest extends CDMSConnectorBaseTest {

	private final static Logger log = Logger.getLogger(EnrollPatientTest.class);

	private String firstName = "John";
	private String lastName = "Smith";
	private String gender = "Male";
	private String studyName = "SMOKE_TEST";
	private String nciInstituteCode = "NCI";
	private String mrn = "1212332";

/*	public void testEnrollPatientService() throws Exception {
		C3DGridServiceClient client = new C3DGridServiceClient(url,
				getCredentials());

		EnrollPatientRequest request = getPopulatedEnrollPatientRequest();

		EnrollPatientResponse response = client.enrollPatient(request);

		StringWriter writer = new StringWriter();

		Utils.serializeObject(response, new QName("EnrollPatientResponse"),
				writer);
		responseStr = writer.getBuffer().toString();
		log.debug(responseStr);

	}
*/
	public void testEnrollPatientAPI() throws IOException, Exception {
		/*EnrollPatientRequest request = getPopulatedEnrollPatientRequest();

		String beansFilePath = System.getProperty("catalina.home")
				+ "/conf/c3d/applicationContext.xml";
		ApplicationContext ctx = new FileSystemXmlApplicationContext(
				beansFilePath);

		C3DGridServiceImpl impl = (C3DGridServiceImpl) ctx
				.getBean("c3DGridService");

		EnrollPatientResponse response = impl.enrollPatient(request);

		StringWriter writer = new StringWriter();
		Utils.serializeObject(response, new QName("EnrollPatientResponse"),
				writer);

		responseStr = writer.getBuffer().toString();
		log.debug(responseStr);*/
		throw new RemoteException("Not yet implemented");

	}

	private EnrollPatientRequest getPopulatedEnrollPatientRequest() {

		EnrollPatientRequest request = new EnrollPatientRequest();
		StudyProtocol studyProtocol = new StudyProtocol();
		request.setStudyProtocol(studyProtocol);

		studyProtocol.setDocument(new Document[1]);// .getIdentifier(0).
		// getExtension();
		studyProtocol.setDocument(0, new Document());
		studyProtocol.getDocument()[0].setIdentifier(new II[1]);
		studyProtocol.getDocument()[0].getIdentifier()[0] = new II();
		studyProtocol.getDocument()[0].getIdentifier()[0].setExtension("STUDY:"
				+ studyName);

		studyProtocol.setStudySubject(new StudySubject[1]);
		studyProtocol.setStudySubject(0, getEnrollPatientStudySubject());

		studyProtocol.getStudySubject(0).setStudySite(getStudySite());

		return request;
	}

	private StudySite getStudySite() {
		StudySite studySite = new StudySite();

		studySite.setHealthCareSite(new HealthCareSite());
		studySite.getHealthCareSite().setIdentifier(new II());
		studySite.getHealthCareSite().getIdentifier().setExtension(
				nciInstituteCode);
		return studySite;
	}

	private StudySubject getEnrollPatientStudySubject() {
		StudySubject ss = new StudySubject();

		Participant p = new Participant();

		p.setIdentifier(new II[1]);
		p.setIdentifier(0, new II());
		p.getIdentifier()[0].setExtension("MRN:" + mrn);
		ss.setParticipant(p);

		Person person = new Person();
		p.setPerson(person);
		PN name = new PN();
		person.setName(name);
		name.setGiven(firstName);
		name.setFamily(lastName);

		person.setGender(new CD());
		person.getGender().setCode(gender);

		person.setBirthDate(new TS());
		person.getBirthDate().setValue(Calendar.getInstance());

		return ss;
	}

	public String getRequest() {
		return null;
	}

	public String getMrn() {
		return mrn;
	}

	public void setMrn(String mrn) {
		this.mrn = mrn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStudyName() {
		return studyName;
	}

	public void setStudyName(String studyName) {
		this.studyName = studyName;
	}

	public String getNciInstituteCode() {
		return nciInstituteCode;
	}

	public void setNciInstituteCode(String nciInstituteCode) {
		this.nciInstituteCode = nciInstituteCode;
	}

}
