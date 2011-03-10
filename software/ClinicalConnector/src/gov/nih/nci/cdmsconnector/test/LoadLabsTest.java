package gov.nih.nci.cdmsconnector.test;

/*import gov.nih.nci.cabig.ccts.domain.bridg.Document;
import gov.nih.nci.cabig.ccts.domain.bridg.Participant;
import gov.nih.nci.cabig.ccts.domain.bridg.PerformedClinicalResult;
import gov.nih.nci.cabig.ccts.domain.bridg.PerformedObservation;
import gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol;
import gov.nih.nci.cabig.ccts.domain.bridg.StudySubject;
import gov.nih.nci.cabig.ccts.domain.cdt.CD;
import gov.nih.nci.cabig.ccts.domain.cdt.II;
import gov.nih.nci.cabig.ccts.domain.cdt.PQ;
import gov.nih.nci.cabig.ccts.domain.cdt.REAL;
import gov.nih.nci.cabig.ccts.domain.cdt.ST;
import gov.nih.nci.cabig.ccts.domain.cdt.TS;
import gov.nih.nci.cabig.ccts.domain.bridg.loadlabs.LoadLabsRequest;
import gov.nih.nci.cabig.ccts.domain.bridg.loadlabs.LoadLabsResponse;
import gov.nih.nci.cagrid.common.Utils;
import gov.nih.nci.cdmsconnector.c3d.client.C3DGridServiceClient;*/
import gov.nih.nci.clinicalconnector.client.ClinicalConnectorClient;
import _21090.org.iso.CD;
import _21090.org.iso.II;
import _21090.org.iso.PQ;
import clinicalconnector.nci.nih.gov.LoadLabsRequest;
import clinicalconnector.nci.nih.gov.LoadLabsResponse;
import gov.nih.nci.cagrid.common.Utils;
import clinicalconnector.nci.nih.gov.PerformedObservation;
import clinicalconnector.nci.nih.gov.PerformedClinicalResult;

import java.io.InputStream;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Date;

import javax.xml.namespace.QName;

import org.apache.log4j.Logger;

public class LoadLabsTest extends CDMSConnectorBaseTest {

	private final static Logger log = Logger.getLogger(LoadLabsTest.class);

	private String mrn1 = "00-00-00-0";
	private String mrn2 = "00-00-00-0";
	private String activityName1 = "BUN";
	private String activityName2 = "WBC";
	private String patientPosition1 = "1";
	private String patientPosition2 = "2";
	private String textResult1 = "Result1";
	private String textResult2 = "Result2";
	private String studyName = "SMOKE_TEST";

    //private LoadLabsRequest loadLabsRequest = getPopulatedLoadLabsRequest();

	public void testLoadLabsService() throws Exception {

		ClinicalConnectorClient client = new ClinicalConnectorClient(url, getCredentials());

		LoadLabsResponse response = client
				.loadLabs(getPopulatedLoadLabsRequest());

		StringWriter writer = new StringWriter();
		try {
			InputStream seralizeStream = ClinicalConnectorClient.class.getResourceAsStream(
			"client-config.wsdd");
			Utils.serializeObject(response, new QName(
			"LoadLabsResponse"), writer, seralizeStream);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		//Utils.serializeObject(response, new QName("LoadLabsResponse"), writer);

		responseStr = writer.getBuffer().toString();
		log.debug(responseStr);

	}

	public void testLoadLabsAPI() {

	}

	public String getRequestStr() throws Exception {
		LoadLabsRequest llReq = getPopulatedLoadLabsRequest();
		StringWriter writer = new StringWriter();
		 try {
             InputStream seralizeStream = ClinicalConnectorClient.class.getResourceAsStream(
                        "client-config.wsdd");
             Utils.serializeObject(llReq, new QName(
                        "LoadLabsRequest"), writer, seralizeStream);
        } catch (Exception e) {
             e.printStackTrace();
             throw new RuntimeException(e);
        }
		//Utils.serializeObject(getPopulatedLoadLabsRequest(), new QName(
		//		"LoadLabsRequest"), writer);

		return writer.getBuffer().toString();
	}

	private LoadLabsRequest getPopulatedLoadLabsRequest() {

		LoadLabsRequest llr = new LoadLabsRequest();

		PerformedClinicalResult[] performedClinicalResults = new PerformedClinicalResult[2];  
		
		PerformedObservation performedObservation1 = new PerformedObservation();
		CD activityNameCode1 = new CD();
		activityNameCode1.setCode(activityName1);
		II studyii1 = new II();
		studyii1.setExtension(studyName);
		II subjectii1 = new II();
		subjectii1.setExtension(mrn1);
		
		performedObservation1.setActivityNameCode(activityNameCode1);
		performedObservation1.setStudyProtocolIdentifier(studyii1);
		performedObservation1.setStudySubjectIdentifier(subjectii1);

		// Reference Range
		_21090.org.iso.IVLPQ referenceRange = new _21090.org.iso.IVLPQ();
		PQ low = new PQ();
		low.setPrecision(100);
		referenceRange.setLow(low);
		PQ high = new PQ();
		high.setPrecision(120);
		referenceRange.setHigh(high);

	    _21090.org.iso.TS reportedDate = new _21090.org.iso.TS();
	    Calendar calendar = Calendar.getInstance();
	    //SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM/yyyy");
	    SimpleDateFormat dFormat = new SimpleDateFormat("yyyy/MM/dd");
	    //reportedDate.setValue(dFormat.format(calendar.getTime()));
	    reportedDate.setValue("20101212");
	    //reportedDate.setValue("20080430T02:28:00.000Z");
	    _21090.org.iso.ST textResult = new _21090.org.iso.ST();
        textResult.setValue(textResult1);
		
        performedClinicalResults[1].setReportedDate(reportedDate);
        performedClinicalResults[1].setTextResult(textResult);
        performedClinicalResults[1].setReferenceRange(referenceRange);
		performedClinicalResults[1].setPerformedObservation(performedObservation1);
		
		PerformedObservation performedObservation2 = new PerformedObservation();
		CD activityNameCode2 = new CD();
		activityNameCode2.setCode(activityName2);
		II studyii2 = new II();
		studyii2.setExtension("STUDY:"+studyName);
		II subjectii2 = new II();
		subjectii2.setExtension("MRN:"+mrn2);
		
		performedObservation2.setActivityNameCode(activityNameCode2);
		performedObservation2.setStudyProtocolIdentifier(studyii2);
		performedObservation2.setStudySubjectIdentifier(subjectii2);

        performedClinicalResults[2].setReportedDate(reportedDate);
        performedClinicalResults[2].setTextResult(textResult);
        performedClinicalResults[2].setReferenceRange(referenceRange);
		performedClinicalResults[2].setPerformedObservation(performedObservation1);
		
		List<PerformedClinicalResult> pcResults = llr.getPerformedClinicalResult();
		for(PerformedClinicalResult result: performedClinicalResults){
			pcResults.add(result);
		}
		
		
		/*StringWriter writer = new StringWriter();
		try {
			Utils.serializeObject(llr, new QName("LoadLabsRequest"), writer);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}*/
		
		/*StringWriter writer = new StringWriter();
		 try {
            InputStream seralizeStream = ClinicalConnectorClient.class.getResourceAsStream(
                       "client-config.wsdd");
            Utils.serializeObject(llr, new QName("LoadLabsRequest"),
            		              writer, seralizeStream);
       } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
       }
		System.out.println(writer.getBuffer().toString());*/

		return llr;
	}

	/*private StudySubject getLoadLabsStudySubject(String activityName, String mrn, String patientPosition, String textResult) {
		StudySubject ss = new StudySubject();
		
		Participant p = new Participant();

		p.setIdentifier(new II[1]);
		p.setIdentifier(0, new II());
		p.getIdentifier()[0].setExtension("MRN:"+mrn);
		ss.setParticipant(p);
		
		ss.setIdentifier(new II[1]);
		ss.setIdentifier(0, new II());
		ss.getIdentifier()[0].setExtension("PATIENTPOSITION:"+patientPosition);

		PerformedObservation[] observations = new PerformedObservation[1];
		ss.setPerformedObservation(observations);

		PerformedObservation performedObservation = new PerformedObservation();
		ss.setPerformedObservation(0, performedObservation);
		performedObservation.setName(new CD());
		performedObservation.getName().setCode(activityName);

		PerformedClinicalResult results[] = new PerformedClinicalResult[1];
		performedObservation.setPerformedClinicalResult(results);
		performedObservation.setPerformedClinicalResult(0, getPerformedClinicalResult(textResult));

		return ss;
	}

	private PerformedClinicalResult getPerformedClinicalResult(String textResult) {
		PerformedClinicalResult performedClinicalResult = new PerformedClinicalResult();
		
		performedClinicalResult.setReferenceRangeLow(new REAL());
		performedClinicalResult.getReferenceRangeLow().setValue(new Float(1));
		
		performedClinicalResult.setReferenceRangeHigh(new REAL());
		performedClinicalResult.getReferenceRangeHigh().setValue(new Float(2));

		performedClinicalResult.setReportedDate(new TS());
		performedClinicalResult.getReportedDate().setValue(Calendar.getInstance());

		performedClinicalResult.setNumericResult(new PQ());
		performedClinicalResult.getNumericResult().setUnit(new CD());
		performedClinicalResult.getNumericResult().getUnit().setCode("mg/dL");

		performedClinicalResult.setTextResult(new ST());
		performedClinicalResult.getTextResult().setValue(textResult);
		
		return performedClinicalResult;
	}*/

	public String getMrn1() {
		return mrn1;
	}

	public void setMrn1(String mrn1) {
		this.mrn1 = mrn1;
	}

	public String getMrn2() {
		return mrn2;
	}

	public void setMrn2(String mrn2) {
		this.mrn2 = mrn2;
	}

	public String getActivityName1() {
		return activityName1;
	}

	public void setActivityName1(String activityName1) {
		this.activityName1 = activityName1;
	}

	public String getActivityName2() {
		return activityName2;
	}

	public void setActivityName2(String activityName2) {
		this.activityName2 = activityName2;
	}

	public String getPatientPosition1() {
		return patientPosition1;
	}

	public void setPatientPosition1(String patientPosition1) {
		this.patientPosition1 = patientPosition1;
	}

	public String getPatientPosition2() {
		return patientPosition2;
	}

	public void setPatientPosition2(String patientPosition2) {
		this.patientPosition2 = patientPosition2;
	}

	public String getTextResult1() {
		return textResult1;
	}

	public void setTextResult1(String textResult1) {
		this.textResult1 = textResult1;
	}

	public String getTextResult2() {
		return textResult2;
	}

	public void setTextResult2(String textResult2) {
		this.textResult2 = textResult2;
	}

	public String getStudyName() {
		return studyName;
	}

	public void setStudyName(String studyName) {
		this.studyName = studyName;
	}
	
}
