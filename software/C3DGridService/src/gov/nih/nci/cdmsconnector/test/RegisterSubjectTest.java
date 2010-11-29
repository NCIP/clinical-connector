package gov.nih.nci.cdmsconnector.test;

import gov.nih.nci.cabig.ccts.domain.enrollpatient.EnrollPatientRequest;

import java.io.IOException;

import org.apache.log4j.Logger;

public class RegisterSubjectTest extends CDMSConnectorBaseTest {

	private final static Logger log = Logger
			.getLogger(RegisterSubjectTest.class);

	private String firstName = "John";
	private String lastName = "Smith";
	private String gender = "Male";
	private String studyName = "SMOKE_TEST";
	private String nciInstituteCode = "NCI";
	private String mrn = "1212332";

	public void testRegisterSubjectService() throws Exception {
/*		fileName = "registerSubjectTest.xml";

		userName = "ccts@nih.gov";
		password = "!Ccts@nih.gov1";

		System.out.println("in testRegisterSubjectService");
		org.cagrid.gaards.websso.authentication.CaGridAuthenticationManager authManager = new org.cagrid.gaards.websso.authentication.CaGridAuthenticationManager();
		System.out.println("got the authManager");
		UsernamePasswordCredentials credentials = new UsernamePasswordCredentials();
		credentials.setUsername(userName.trim());
		credentials.setPassword(password.trim());
		System.out.println("created the credentials");
		Authentication auth = authManager.authenticate(credentials);
		System.out.println("authenticated");
		delegatedReference = authManager.getSerializedDelegationEpr();
		System.out.println("got the delegated Reference");
		RegistrationConsumerClient client = new RegistrationConsumerClient(url,
				authManager.getCredentials());
		System.out.println("new client created");

		Registration registration = getPopulatedRegistration();

		Registration response = client.register(registration);

		StringWriter writer = new StringWriter();
		Utils.serializeObject(response, new QName("Registration"), writer);

		responseStr = writer.getBuffer().toString();
		log.debug(responseStr);*/

	}

	public void testRegisterSubjectAPI() throws IOException, Exception {

/*		fileName = "registerSubjectTest.xml";

		Registration registration = getPopulatedRegistration();

		Resource res = new ClassPathResource("applicationContext-grid.xml");
		BeanFactory factory = new XmlBeanFactory(res);

		C3DGridServiceImpl impl = (C3DGridServiceImpl) factory
				.getBean("registrationConsumer");

		Registration response = impl.register(registration);

		StringWriter writer = new StringWriter();
		Utils.serializeObject(response, new QName("Registration"), writer);

		responseStr = writer.getBuffer().toString();
		log.debug(responseStr);*/

	}

	private EnrollPatientRequest getPopulatedRegistration() {

/*		Registration registration = new Registration();
		StudyRefType sr = new StudyRefType();
		SystemAssignedIdentifierType sait = new SystemAssignedIdentifierType();
		sait.setPrimaryIndicator(true);
		sait.setValue(studyName);
		// sait.setValue("04_C_0121");
		IdentifierType[] idType = new IdentifierType[1];
		idType[0] = sait;
		sr.setIdentifier(idType);
		registration.setStudyRef(sr);

		StudySiteType ss = new StudySiteType();
		HealthcareSiteType[] hcsts = new HealthcareSiteType[1];
		HealthcareSiteType hcst = new HealthcareSiteType();
		hcst.setNciInstituteCode(nciInstituteCode);
		// hcst.setNciInstituteCode("SITE_01");
		hcsts[0] = hcst;
		ss.setHealthcareSite(hcsts);

		registration.setStudySite(ss);

		ParticipantType pType = new ParticipantType();
		OrganizationAssignedIdentifierType oAIdT = new OrganizationAssignedIdentifierType();
		oAIdT.setPrimaryIndicator(true);
		oAIdT.setType("MRN");
		oAIdT.setValue("MRN-" + mrn);

		pType.setFirstName(firstName);
		pType.setLastName(lastName);
		pType.setAdministrativeGenderCode(gender);

		HealthcareSiteType hcsType = new HealthcareSiteType();

		hcsType.setNciInstituteCode("NCIMET");
		oAIdT.setHealthcareSite(hcsType);

		IdentifierType[] idType1 = new IdentifierType[1];
		idType1[0] = oAIdT;
		pType.setIdentifier(idType1);
		registration.setParticipant(pType);
		return registration;*/
		return null;
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
