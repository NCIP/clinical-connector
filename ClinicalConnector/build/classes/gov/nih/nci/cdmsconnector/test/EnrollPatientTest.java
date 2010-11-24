package gov.nih.nci.cdmsconnector.test;

//import gov.nih.nci.cabig.ccts.domain.bridg.Document;
//import gov.nih.nci.cabig.ccts.domain.bridg.HealthCareSite;
//import gov.nih.nci.cabig.ccts.domain.bridg.Participant;
//import gov.nih.nci.cabig.ccts.domain.bridg.Person;
//import gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol;
//import gov.nih.nci.cabig.ccts.domain.bridg.StudySite;
//import gov.nih.nci.cabig.ccts.domain.bridg.StudySubject;
//import gov.nih.nci.cabig.ccts.domain.cdt.CD;
//import gov.nih.nci.cabig.ccts.domain.cdt.II;
//import gov.nih.nci.cabig.ccts.domain.cdt.PN;
//import gov.nih.nci.cabig.ccts.domain.cdt.TS;
import gov.nih.nci.cagrid.common.Utils;
import gov.nih.nci.clinicalconnector.client.ClinicalConnectorClient;
import gov.nih.nci.clinicalconnector.service.ClinicalConnectorImpl;
import clinicalconnector.nci.nih.gov.StudySubject;
//import clinicalconnector.nci.nih.gov.StudySite;
//import clinicalconnector.nci.nih.gov.StudyProtocol;
import _21090.org.iso.ENPN;
import _21090.org.iso.II;

import java.io.IOException;
import java.io.StringWriter;
//import java.util.Calendar;

import javax.xml.namespace.QName;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import clinicalconnector.nci.nih.gov.RegisterSubjectRequest;
import clinicalconnector.nci.nih.gov.RegisterSubjectResponse;

public class EnrollPatientTest extends CDMSConnectorBaseTest {

	private final static Logger log = Logger.getLogger(EnrollPatientTest.class);

	private String firstName = "John";
	private String lastName = "Smith";
	private String gender = "Male";
	private String studyName = "SMOKE_TEST";
	private String nciInstituteCode = "NCI";
	private String mrn = "1212332";

	public void testEnrollPatientService() throws Exception {
		ClinicalConnectorClient client = new ClinicalConnectorClient(url,
				getCredentials());

		RegisterSubjectRequest request = getPopulatedEnrollPatientRequest();

		RegisterSubjectResponse response = client.registerSubject(request);

		StringWriter writer = new StringWriter();

		Utils.serializeObject(response, new QName("EnrollPatientResponse"),
				writer);
		responseStr = writer.getBuffer().toString();
		log.debug(responseStr);

	}

	public void testEnrollPatientAPI() throws IOException, Exception {
		RegisterSubjectRequest request = getPopulatedEnrollPatientRequest();

		String beansFilePath = System.getProperty("catalina.home")
				+ "/conf/c3d/applicationContext.xml";
		ApplicationContext ctx = new FileSystemXmlApplicationContext(
				beansFilePath);

		ClinicalConnectorImpl impl = (ClinicalConnectorImpl) ctx
				.getBean("c3DGridService");

		RegisterSubjectResponse response = impl.registerSubject(request);

		StringWriter writer = new StringWriter();
		Utils.serializeObject(response, new QName("EnrollPatientResponse"),
				writer);

		responseStr = writer.getBuffer().toString();
		log.debug(responseStr);

	}

	private RegisterSubjectRequest getPopulatedEnrollPatientRequest() {

		RegisterSubjectRequest request = new RegisterSubjectRequest();
		
		StudySubject studySubject = new StudySubject();
		
		//Subject MRN
		II subjectii = new II();
		subjectii.setExtension("MRN:" + mrn);
		studySubject.setIdentifier(subjectii);
		
		//Subject Name - Wow totally complicated, good thing we don't us it.
		ENPN name = new ENPN();
		studySubject.setName(name);
		
		//Subject Race
		_21090.org.iso.CD raceCode = new _21090.org.iso.CD();
		raceCode.setCode(null);
		studySubject.setRaceCode(raceCode);
		
		//Subject Gender
		_21090.org.iso.CD sexCode = new _21090.org.iso.CD();
		sexCode.setCode(gender);
		studySubject.setSexCode(sexCode);
		
		//Subject Birthdate
		_21090.org.iso.TS birthDate = new _21090.org.iso.TS();
		birthDate.setValue(null);
		studySubject.setBirthDate(birthDate);

		//Subject StudySiteIdentifier
		_21090.org.iso.II studySiteIdentifier = new _21090.org.iso.II();
		studySiteIdentifier.setExtension(nciInstituteCode);
		studySubject.setStudyIdentifier(studySiteIdentifier);

		//Subject Study
		_21090.org.iso.II studyii = new II();
 		studyii.setExtension("STUDY:" + studyName);
		studySubject.setStudyIdentifier(studyii);
		
		request.setStudySubject(studySubject);
        
		return request;
	}

	/*private StudySite getStudySite() {
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
	} */
    
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
