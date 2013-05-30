<%--
Copyright Ekagra and SemanticBits, LLC

Distributed under the OSI-approved BSD 3-Clause License.
See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
--%>
<%@page import="gov.nih.nci.cdmsconnector.test.EnrollPatientTest"%>
<%@page import="java.net.URL"%>
<%@page import="java.io.StringWriter"%>
<%@page import="gov.nih.nci.cagrid.common.Utils"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page
	import="gov.nih.nci.cdmsconnector.dao.c3d.EnrollmentOracleDAOImpl"%>
<%@page import="gov.nih.nci.cdmsconnector.dao.BaseJDBCDAO"%>
<%@page import="gov.nih.nci.cdmsconnector.test.LoadLabsTest"%>
<%@page import="gov.nih.nci.cdmsconnector.test.SmokeTestServiceTest"%>
<%@page import="gov.nih.nci.cdmsconnector.test.GetStudyCDEsTest"%>
<%@page import="gov.nih.nci.cdmsconnector.test.GetStudyCDEsDataTest"%>

<%@page import="gov.nih.nci.cabig.ccts.domain.bridg.CommonDataElement"%>
<%@page import="gov.nih.nci.cdmsconnector.test.IsValidStudyTest"%>
<%@page import="gov.nih.nci.cdmsconnector.test.CSMCDMSConnectorSecurityManagerTest"%>
<%@page import="junit.framework.TestResult"%>
<%@page import="junit.textui.TestRunner"%>
<%@page import="junit.textui.ResultPrinter"%>
<%@page import="java.io.BufferedWriter"%>
<%@page import="java.io.PrintStream"%>
<%@page import="java.io.BufferedOutputStream"%>
<%@page import="java.util.Enumeration"%>
<%@page import="junit.framework.TestSuite"%>
<%@page import="java.io.PipedOutputStream"%>
<%@page import="java.io.PipedInputStream"%>
<%@page import="java.io.ByteArrayOutputStream"%><html>
<%
	response.setContentType("text/html");
%>

<body>
<%
	String logOut = request.getParameter("logOut");
	if (logOut != null && "true".equals(logOut)) {
		request.getSession().setAttribute("testUserName", null);
		request.getSession().setAttribute("testPassword", null);
		out.println("Logged out<br/>");
		out.flush();
	}

	String runSmokeTest = request.getParameter("runSmokeTest");
	if (runSmokeTest != null && "true".equals(runSmokeTest)) {
		out.println("Starting the SmokeTest...<br/>");
		out.flush();
		boolean success = runSmokeTest(request, response, out);
		if (success) {
			out.println("<br/>SmokeTest Status: Success<br/>");
		} else {
			out.println("<br/>SmokeTest Status: Failed<br/>");
		}
		out.flush();
	}

	String testEnrollPatient = request
			.getParameter("testEnrollPatient");
	if (testEnrollPatient != null && "true".equals(testEnrollPatient)) {
		out.println("Starting the EnrollPatientTest...<br/>");
		out.flush();
		boolean success = testEnrollPatient(request, response, out);
		if (success) {
			out.println("<br/>EnrollPatientTest Status: Success<br/>");
		} else {
			out.println("<br/>EnrollPatientTest Status: Failed<br/>");
		}
		out.flush();
	}

	String testLoadLabsService = request
			.getParameter("testLoadLabsService");
	if (testLoadLabsService != null
			&& "true".equals(testLoadLabsService)) {
		out.println("Starting the LoadLabsTest...<br/>");
		out.flush();
		boolean success = testLoadLabsService(request, response, out);
		if (success) {
			out.println("<br/>LoadLabsTest Status: Success<br/>");
		} else {
			out.println("<br/>LoadLabsTest Status: Failed<br/>");
		}
		out.flush();
	}

	String testEnrollPatientService = request
			.getParameter("testEnrollPatientService");
	if (testEnrollPatientService != null
			&& "true".equals(testEnrollPatientService)) {
		out.println("Starting the EnrollPatientServiceTest...<br/>");
		out.flush();
		boolean success = testEnrollPatientService(request, response,
				out);
		if (success) {
			out
					.println("<br/>EnrollPatientServiceTest Status: Success<br/>");
		} else {
			out
					.println("<br/>EnrollPatientServiceTest Status: Failed<br/>");
		}
		out.flush();
	}

	String testGetStudyCDEs = request.getParameter("testGetStudyCDEs");
	if (testGetStudyCDEs != null && "true".equals(testGetStudyCDEs)) {
		out.println("Starting the GetStudyCDEsTest...<br/>");
		out.flush();
		boolean success = testGetStudyCDEs(request, response, out);
		if (success) {
			out.println("<br/>GetStudyCDEsTest Status: Success<br/>");
		} else {
			out.println("<br/>GetStudyCDEsTest Status: Failed<br/>");
		}
		out.flush();
	}

	String testGetStudyCDEsData = request
			.getParameter("testGetStudyCDEsData");
	if (testGetStudyCDEsData != null
			&& "true".equals(testGetStudyCDEsData)) {
		out.println("Starting the GetStudyCDEsDataTest...<br/>");
		out.flush();
		boolean success = testGetStudyCDEsData(request, response, out);
		if (success) {
			out
					.println("<br/>GetStudyCDEsDataTest Status: Success<br/>");
		} else {
			out
					.println("<br/>GetStudyCDEsDataTest Status: Failed<br/>");
		}
		out.flush();
	}

	String testIsValidStudy = request.getParameter("testIsValidStudy");
	if (testIsValidStudy != null && "true".equals(testIsValidStudy)) {
		out.println("Starting the IsValidStudyTest...<br/>");
		out.flush();
		boolean success = testIsValidStudy(request, response, out);
		if (success) {
			out.println("<br/>IsValidStudyTest Status: Success<br/>");
		} else {
			out.println("<br/>IsValidStudyTest Status: Failed<br/>");
		}
		out.flush();
	}

	String testPermissions = request.getParameter("testPermissions");
	if (testPermissions != null && "true".equals(testPermissions)) {
		out.println("Starting the PermissionsTest...<br/>");
		out.flush();
		boolean success = testPermissions(request, response, out);
		if (success) {
			out.println("<br/>PermissionsTest Status: Success<br/>");
		} else {
			out.println("<br/>PermissionsTest Status: Failed<br/>");
		}
		out.flush();
	}

	String testDBConnectivity = request
			.getParameter("testDBConnectivity");
	if (testDBConnectivity != null && "true".equals(testDBConnectivity)) {
		out.println("Starting the DBConnectivityTest...<br/>");
		out.flush();
		boolean success = testDBConnectivity(request, response, out);
		if (success) {
			out.println("<br/>DBConnectivityTest Status: Success<br/>");
		} else {
			out.println("<br/>DBConnectivityTest Status: Failed<br/>");
		}
		out.flush();
	}

	String loadLabDBCleanUp = request.getParameter("loadLabDBCleanUp");
	if (loadLabDBCleanUp != null && "true".equals(loadLabDBCleanUp)) {
		out.println("Starting the loadLabDBCleanUpTest...<br/>");
		out.flush();
		boolean success = loadLabDBCleanUp(request, response, out);
		if (success) {
			out
					.println("<br/>loadLabDBCleanUpTest Status: Success<br/>");
		} else {
			out
					.println("<br/>loadLabDBCleanUpTest Status: Failed<br/>");
		}
		out.flush();
	}

	String registrationDBCleanUp = request
			.getParameter("registrationDBCleanUp");
	if (registrationDBCleanUp != null
			&& "true".equals(registrationDBCleanUp)) {
		out.println("Starting the registrationDBCleanUp...<br/>");
		out.flush();
		boolean success = registrationDBCleanUp(request, response, out);
		if (success) {
			out
					.println("<br/>registrationDBCleanUp Status: Success<br/>");
		} else {
			out
					.println("<br/>registrationDBCleanUp Status: Failed<br/>");
		}
		out.flush();
	}
%>

<script language="JavaScript">
function getAction() {
	var windowname="ntcbioocdev";
	var config="hotlinkrdc";
	var sessionprefix="a%20";
	var sessiontitle="RDC";
	var vwidth="400";
	var vheight="80";
    var patientId=document.getElementById("patientId").value;
    var study=document.getElementById("study").value;
    var patientPosition=document.getElementById("patientPosition").value;

    var link='hotLink/hotLink.action?study='+study+'&patientId='+patientId+'&patientPosition='+patientPosition;
    document.getElementById("hotlink").innerHTML="<a href=\""+link+"\" target='_blank'>"+link+"<a/>";

    return false;
}

</script>


<p>
<ul>
	<!--	<li><a href="happy.jsp?runSmokeTest=true">Run
	SmokeTest</a></li>-->
	<li><a href="happy.jsp?testEnrollPatient=true">Run
	testEnrollPatient</a></li>
	<li><a href="happy.jsp?testLoadLabsService=true">Run
	testLoadLabsService</a></li>
	<li><a href="happy.jsp?testEnrollPatientService=true">Run
	testEnrollPatientService</a></li>
	<li><a href="happy.jsp?testGetStudyCDEs=true">Run
	testGetStudyCDEs</a></li>
	<li><a href="happy.jsp?testGetStudyCDEsData=true">Run
	testGetStudyCDEsData</a></li>
	<li><a href="happy.jsp?testIsValidStudy=true">Run
	testIsValidStudy</a></li>

	<li>HotLink<form>Study:<input id="study" value="SMOKE_TEST">  Patient Position<input id="patientPosition" value="">  PatientId(MRN)<input id="patientId" value="1212332"> <input type="button" value="create hot link to c3d" onclick="getAction()"/></form><div id="hotlink"></div><br/></li>

	<li><a href="happy.jsp?testPermissions=true">Run
	testPermissions</a></li>

	<li><a href="happy.jsp?testDBConnectivity=true">Run
	testDBConnectivity</a></li>
	<li><a href="happy.jsp?loadLabDBCleanUp=true">Run
	loadLabDBCleanUp</a></li>
	<li><a href="happy.jsp?registrationDBCleanUp=true">Run
	registrationDBCleanUp</a> (Note: Please delete the Study Data from C3D
	before running this)</li>
	<li><a href="happy.jsp?logOut=true">Logout</a></li>
</ul>
</p>
</body>
</html>


<%!private boolean testEnrollPatient(HttpServletRequest request,
			HttpServletResponse response, javax.servlet.jsp.JspWriter writer)
			throws Exception {
		StringWriter stringWriter;

		try {
			URL enrollPatientURL = new URL(request.getScheme(), request
					.getServerName(), request.getServerPort(), request
					.getContextPath()
					+ "/services/cagrid/C3DGridService");

			EnrollPatientTest enrollPatientTest = new EnrollPatientTest();
			enrollPatientTest.setUrl(enrollPatientURL.toString());

			String def = request.getParameter("def");
			if (def != null && "false".equals(def)) {
				String firstName = request.getParameter("firstName");
				enrollPatientTest.setFirstName(firstName);
				String lastName = request.getParameter("lastName");
				enrollPatientTest.setLastName(lastName);
				String gender = request.getParameter("gender");
				enrollPatientTest.setGender(gender);
				String studyName = request.getParameter("studyName");
				enrollPatientTest.setStudyName(studyName);
				String mrn = request.getParameter("mrn");
				enrollPatientTest.setMrn(mrn);
				String nciInstituteCode = request
						.getParameter("nciInstituteCode");
				enrollPatientTest.setNciInstituteCode(nciInstituteCode);
			}

			writer
					.println("EnrollPatientRequest:<br/><form method='post' action='happy.jsp?testEnrollPatient=true&def=false'><br/>");
			writer.println("First Name:<input name='firstName' value='"
					+ enrollPatientTest.getFirstName() + "'/><br/>");
			writer.println("Last Name:<input name='lastName' value='"
					+ enrollPatientTest.getLastName() + "'/><br/>");
			writer.println("Gender:<input name='gender' value='"
					+ enrollPatientTest.getGender() + "'/><br/>");
			writer.println("studyName:<input name='studyName' value='"
					+ enrollPatientTest.getStudyName() + "'/><br/>");
			writer.println("MRN:<input name='mrn' value='"
					+ enrollPatientTest.getMrn() + "'/><br/>");
			writer
					.println("nciInstituteCode:<input name='nciInstituteCode' value='"
							+ enrollPatientTest.getNciInstituteCode()
							+ "'/><br/>");

			writer.flush();

			writer.println("<input type='Submit'/><br/>");

			enrollPatientTest.testEnrollPatientAPI();

			writer
					.println("EnrollPatientResponse:<br/><textarea name='response' cols='100' rows='30'>"
							+ enrollPatientTest.getResponseStr()
							+ "</textarea><br/></form>");
			writer.flush();

		} catch (Exception e) {
			writer.println("EnrollPatient Exception:<span><br/><pre>");

			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			String stacktrace = sw.toString();

			writer.println(stacktrace);
			e.printStackTrace();
			writer.println("</pre></span><br/>");
			writer.flush();
			return false;
		}

		return true;
	}

	private boolean testEnrollPatientService(HttpServletRequest request,
			HttpServletResponse response, javax.servlet.jsp.JspWriter writer)
			throws Exception {
		StringWriter stringWriter;

		try {
			URL registrationURL = new URL(request.getScheme(), request
					.getServerName(), request.getServerPort(), request
					.getContextPath()
					+ "/services/cagrid/C3DGridService");

			EnrollPatientTest enrollPatientTest = new EnrollPatientTest();
			enrollPatientTest.setUrl(registrationURL.toString());

			enrollPatientTest.setUserName((String) request.getSession()
					.getAttribute("testUserName"));
			enrollPatientTest.setPassword((String) request.getSession()
					.getAttribute("testPassword"));

			String def = request.getParameter("def");
			if (def != null && "false".equals(def)) {
				String userName = request.getParameter("userName");
				String password = request.getParameter("password");
				if (userName != null && !"".equals(userName)
						&& password != null && !"".equals(password)) {
					enrollPatientTest.setUserName(userName);
					enrollPatientTest.setPassword(password);
					request.getSession().setAttribute("testUserName", userName);
					request.getSession().setAttribute("testPassword", password);
				}
				String firstName = request.getParameter("firstName");
				enrollPatientTest.setFirstName(firstName);
				String lastName = request.getParameter("lastName");
				enrollPatientTest.setLastName(lastName);
				String gender = request.getParameter("gender");
				enrollPatientTest.setGender(gender);
				String studyName = request.getParameter("studyName");
				enrollPatientTest.setStudyName(studyName);
				String mrn = request.getParameter("mrn");
				enrollPatientTest.setMrn(mrn);
				String nciInstituteCode = request
						.getParameter("nciInstituteCode");
				enrollPatientTest.setNciInstituteCode(nciInstituteCode);
			}

			writer
					.println("EnrollPatientRequest:<br/><form method='post' action='happy.jsp?testEnrollPatientService=true&def=false'><br/>");
			writer.println("Username:<input name='userName' value='"
					+ enrollPatientTest.getUserName() + "'/><br/>");
			writer
					.println("Password:<input name='password' type='password'/><br/>");
			writer.println("First Name:<input name='firstName' value='"
					+ enrollPatientTest.getFirstName() + "'/><br/>");
			writer.println("Last Name:<input name='lastName' value='"
					+ enrollPatientTest.getLastName() + "'/><br/>");
			writer.println("Gender:<input name='gender' value='"
					+ enrollPatientTest.getGender() + "'/><br/>");
			writer.println("studyName:<input name='studyName' value='"
					+ enrollPatientTest.getStudyName() + "'/><br/>");
			writer.println("MRN:<input name='mrn' value='"
					+ enrollPatientTest.getMrn() + "'/><br/>");
			writer
					.println("nciInstituteCode:<input name='nciInstituteCode' value='"
							+ enrollPatientTest.getNciInstituteCode()
							+ "'/><br/>");

			writer.flush();

			writer.println("<input type='Submit'/><br/>");

			try {
				if (enrollPatientTest.getCredentials() == null) {
					writer
							.println("<font color='red'>Credentials Invalid</font><br/></form>");
					writer.flush();
					return false;
				}
			} catch (Exception e) {
				writer
						.println("<font color='red'>Credentials Invalid</font><br/></form>");
				writer.flush();
				return false;
			}

			enrollPatientTest.testEnrollPatientService();

			writer
					.println("EnrollPatientResponse:<br/><textarea name='response' cols='100' rows='30'>"
							+ enrollPatientTest.getResponseStr()
							+ "</textarea><br/></form>");
			writer.flush();

		} catch (Exception e) {
			writer.println("EnrollPatient Exception:<span><br/><pre>");

			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			String stacktrace = sw.toString();

			writer.println(stacktrace);
			e.printStackTrace();
			writer.println("</pre></span><br/>");
			writer.flush();
			return false;
		}

		return true;
	}

	private boolean testLoadLabsService(HttpServletRequest request,
			HttpServletResponse response, javax.servlet.jsp.JspWriter writer)
			throws Exception {
		StringWriter stringWriter;

		try {
			URL loadLabsURL = new URL(request.getScheme(), request
					.getServerName(), request.getServerPort(), request
					.getContextPath()
					+ "/services/cagrid/C3DGridService");

			LoadLabsTest loadLabsTest = new LoadLabsTest();
			loadLabsTest.setUrl(loadLabsURL.toString());
			loadLabsTest.setUserName((String) request.getSession()
					.getAttribute("testUserName"));
			loadLabsTest.setPassword((String) request.getSession()
					.getAttribute("testPassword"));

			String def = request.getParameter("def");
			if (def != null && "false".equals(def)) {
				String userName = request.getParameter("userName");
				String password = request.getParameter("password");
				if (userName != null && !"".equals(userName)
						&& password != null && !"".equals(password)) {
					loadLabsTest.setUserName(userName);
					loadLabsTest.setPassword(password);
					request.getSession().setAttribute("testUserName", userName);
					request.getSession().setAttribute("testPassword", password);
				}
				loadLabsTest.setMrn1(request.getParameter("mrn1"));
				loadLabsTest.setMrn2(request.getParameter("mrn2"));
				loadLabsTest.setActivityName1(request
						.getParameter("activityName1"));
				loadLabsTest.setActivityName2(request
						.getParameter("activityName2"));
				loadLabsTest.setPatientPosition1(request
						.getParameter("patientPosition1"));
				loadLabsTest.setPatientPosition2(request
						.getParameter("patientPosition2"));
				loadLabsTest
						.setTextResult1(request.getParameter("textResult1"));
				loadLabsTest
						.setTextResult2(request.getParameter("textResult2"));
				loadLabsTest.setStudyName(request.getParameter("studyName"));
			}

			writer
					.println("loadLabsRequest:<br/><form method='post' action='happy.jsp?testLoadLabsService=true&def=false'><br/>");

			writer.println("<table>");
			writer.println("<tr><td>Username:<input name='userName' value='"
					+ loadLabsTest.getUserName() + "'/></td>");
			writer
					.println("<td>Password:<input name='password' type='password'/></td></tr>");

			writer.println("<tr><td>MRN1:<input name='mrn1' value='"
					+ loadLabsTest.getMrn1()
					+ "'/></td><td>MRN2:<input name='mrn2' value='"
					+ loadLabsTest.getMrn2() + "'/></td></tr>");
			writer
					.println("<tr><td>ActivityName1:<input name='activityName1' value='"
							+ loadLabsTest.getActivityName1()
							+ "'/></td><td>ActivityName2:<input name='activityName2' value='"
							+ loadLabsTest.getActivityName2() + "'/></td></tr>");
			writer
					.println("<tr><td>PatientPosition1:<input name='patientPosition1' value='"
							+ loadLabsTest.getPatientPosition1()
							+ "'/></td><td>PatientPosition2:<input name='patientPosition2' value='"
							+ loadLabsTest.getPatientPosition2()
							+ "'/></td></tr>");
			writer
					.println("<tr><td>TextResult1:<input name='textResult1' value='"
							+ loadLabsTest.getTextResult1()
							+ "'/></td><td>TextResult2:<input name='textResult2' value='"
							+ loadLabsTest.getTextResult2() + "'/></td></tr>");

			writer.println("<tr><td>StudyName:<input name='studyName' value='"
					+ loadLabsTest.getStudyName() + "'/></td><td></td></tr>");

			writer.println("</table><br/><input type='Submit'/><br/>");
			writer
					.println("loadLabsRequestXML:<br/><textarea name='request' cols='100' rows='30'>"
							+ loadLabsTest.getRequestStr() + "</textarea><br/>");
			writer.flush();

			try {
				if (loadLabsTest.getCredentials() == null) {
					writer
							.println("<font color='red'>Credentials Invalid</font><br/></form>");
					writer.flush();
					return false;
				}
			} catch (Exception e) {
				writer
						.println("<font color='red'>Credentials Invalid</font><br/></form>");
				writer.flush();
				return false;
			}

			loadLabsTest.testLoadLabsService();

			writer
					.println("loadLabsResponse:<br/><textarea name='response' cols='100' rows='5'>"
							+ loadLabsTest.getResponseStr()
							+ "</textarea><br/></form>");
			writer.flush();

		} catch (Exception e) {
			writer.println("Register Exception:<span><br/><pre>");

			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			String stacktrace = sw.toString();

			writer.println(stacktrace);
			e.printStackTrace();
			writer.println("</pre></span><br/>");
			writer.flush();
			return false;
		}

		return true;
	}

	private boolean testGetStudyCDEs(HttpServletRequest request,
			HttpServletResponse response, javax.servlet.jsp.JspWriter writer)
			throws Exception {
		StringWriter stringWriter;

		try {

			URL c3dURL = new URL(request.getScheme(), request.getServerName(),
					request.getServerPort(), request.getContextPath()
							+ "/services/cagrid/C3DGridService");

			GetStudyCDEsTest getStudyCDEsTest = new GetStudyCDEsTest();

			getStudyCDEsTest.setUrl(c3dURL.toString());

			String studyName = "00C0079";

			getStudyCDEsTest.setUserName((String) request.getSession()
					.getAttribute("testUserName"));
			getStudyCDEsTest.setPassword((String) request.getSession()
					.getAttribute("testPassword"));

			String def = request.getParameter("def");
			if (def != null && "false".equals(def)) {
				String userName = request.getParameter("userName");
				String password = request.getParameter("password");
				if (userName != null && !"".equals(userName)
						&& password != null && !"".equals(password)) {
					getStudyCDEsTest.setUserName(userName);
					getStudyCDEsTest.setPassword(password);
					request.getSession().setAttribute("testUserName", userName);
					request.getSession().setAttribute("testPassword", password);
				}
				studyName = request.getParameter("studyName");
			}

			getStudyCDEsTest.setStudyName(studyName);

			writer
					.println("GetStudyCDEsTestRequest:<br/><form method='post' action='happy.jsp?testGetStudyCDEs=true&def=false'><br/>");

			writer.println("Username:<input name='userName' value='"
					+ getStudyCDEsTest.getUserName() + "'/><br/>");
			writer
					.println("Password:<input name='password' type='password'/><br/>");
			writer.println("StudyName:<input name='studyName' value='"
					+ studyName + "'/><br/>");
			writer
					.println("<br/><input name='xml' value='XML Response' type='Submit'/> <input name='csv' value='CSV Response' type='Submit'/><br/>");
			writer.flush();

			try {
				if (getStudyCDEsTest.getCredentials() == null) {
					writer
							.println("<font color='red'>Credentials Invalid</font><br/></form>");
					writer.flush();
					return false;
				}
			} catch (Exception e) {
				writer
						.println("<font color='red'>Credentials Invalid</font><br/></form>");
				writer.flush();
				return false;
			}
			getStudyCDEsTest.testGetStudyCDEsService();

			if (request.getParameter("csv") != null
					&& request.getParameter("csv").equals("CSV Response")) {
				writer.println("GetStudyCDEsDataTestResponse:<br/><pre>"
						+ getStudyCDEsTest.getCSVResponse()
						+ "</pre><br/></form>");
			} else {
				writer
						.println("GetStudyCDEsTestResponse:<br/><textarea name='response' cols='100' rows='50'>"
								+ getStudyCDEsTest.getResponseStr()
								+ "</textarea><br/></form>");
			}
			writer.flush();

		} catch (Exception e) {
			writer.println("GetStudyCDEs Exception:<span><br/><pre>");

			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			String stacktrace = sw.toString();

			writer.println(stacktrace);
			e.printStackTrace();
			writer.println("</pre></span><br/>");
			writer.flush();
			return false;
		}

		return true;
	}

	private boolean testGetStudyCDEsData(HttpServletRequest request,
			HttpServletResponse response, javax.servlet.jsp.JspWriter writer)
			throws Exception {
		StringWriter stringWriter;

		try {

			URL c3dURL = new URL(request.getScheme(), request.getServerName(),
					request.getServerPort(), request.getContextPath()
							+ "/services/cagrid/C3DGridService");

			GetStudyCDEsDataTest getStudyCDEsDataTest = new GetStudyCDEsDataTest();

			getStudyCDEsDataTest.setUrl(c3dURL.toString());

			String studyName = "00C0079";
			CommonDataElement cde = new CommonDataElement();
			cde.setPublicIdentifier("62");
			cde.setVersion("6.0");

			getStudyCDEsDataTest.setUserName((String) request.getSession()
					.getAttribute("testUserName"));
			getStudyCDEsDataTest.setPassword((String) request.getSession()
					.getAttribute("testPassword"));

			String def = request.getParameter("def");
			if (def != null && "false".equals(def)) {
				String userName = request.getParameter("userName");
				String password = request.getParameter("password");
				if (userName != null && !"".equals(userName)
						&& password != null && !"".equals(password)) {
					getStudyCDEsDataTest.setUserName(userName);
					getStudyCDEsDataTest.setPassword(password);
					request.getSession().setAttribute("testUserName", userName);
					request.getSession().setAttribute("testPassword", password);
				}
				studyName = request.getParameter("studyName");
				cde.setPublicIdentifier(request
						.getParameter("cdePublicIdentifier"));
				cde.setVersion(request.getParameter("cdeVersion"));
			}

			getStudyCDEsDataTest.setCde(cde);
			getStudyCDEsDataTest.setStudyName(studyName);

			writer
					.println("GetStudyCDEsDataTestRequest:<br/><form method='post' action='happy.jsp?testGetStudyCDEsData=true&def=false'><br/>");

			writer.println("Username:<input name='userName' value='"
					+ getStudyCDEsDataTest.getUserName() + "'/><br/>");
			writer
					.println("Password:<input name='password' type='password'/><br/>");

			writer.println("StudyName:<input name='studyName' value='"
					+ studyName + "'/>");
			writer
					.println("<br/>cde.publicIdentifier:<input name='cdePublicIdentifier' value='"
							+ cde.getPublicIdentifier() + "'/>");
			writer.println("<br/>cde.version:<input name='cdeVersion' value='"
					+ cde.getVersion() + "'/>");
			writer
					.println("<br/><input name='xml' value='XML Response' type='Submit'/> <input name='csv' value='CSV Response' type='Submit'/><br/>");
			writer.flush();

			try {
				if (getStudyCDEsDataTest.getCredentials() == null) {
					writer
							.println("<font color='red'>Credentials Invalid</font><br/></form>");
					writer.flush();
					return false;
				}
			} catch (Exception e) {
				writer
						.println("<font color='red'>Credentials Invalid</font><br/></form>");
				writer.flush();
				return false;
			}

			getStudyCDEsDataTest.testGetStudyCDEsDataService();

			if (request.getParameter("csv") != null
					&& request.getParameter("csv").equals("CSV Response")) {
				writer.println("GetStudyCDEsDataTestResponse:<br/><pre>"
						+ getStudyCDEsDataTest.getCSVResponse()
						+ "</pre><br/></form>");
			} else {
				writer
						.println("GetStudyCDEsDataTestResponse:<br/><textarea name='response' cols='100' rows='50'>"
								+ getStudyCDEsDataTest.getResponseStr()
								+ "</textarea><br/></form>");
			}
			writer.flush();

		} catch (Exception e) {
			writer.println("GetStudyCDEsData Exception:<span><br/><pre>");

			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			String stacktrace = sw.toString();

			writer.println(stacktrace);
			e.printStackTrace();
			writer.println("</pre></span><br/>");
			writer.flush();
			return false;
		}

		return true;
	}

	private boolean testIsValidStudy(HttpServletRequest request,
			HttpServletResponse response, javax.servlet.jsp.JspWriter writer)
			throws Exception {
		StringWriter stringWriter;

		try {

			URL c3dURL = new URL(request.getScheme(), request.getServerName(),
					request.getServerPort(), request.getContextPath()
							+ "/services/cagrid/C3DGridService");

			IsValidStudyTest isValidStudyTest = new IsValidStudyTest();

			isValidStudyTest.setUrl(c3dURL.toString());

			String studyName = "00C0079";

			isValidStudyTest.setUserName((String) request.getSession()
					.getAttribute("testUserName"));
			isValidStudyTest.setPassword((String) request.getSession()
					.getAttribute("testPassword"));

			String def = request.getParameter("def");
			if (def != null && "false".equals(def)) {
				String userName = request.getParameter("userName");
				String password = request.getParameter("password");
				if (userName != null && !"".equals(userName)
						&& password != null && !"".equals(password)) {
					isValidStudyTest.setUserName(userName);
					isValidStudyTest.setPassword(password);
					request.getSession().setAttribute("testUserName", userName);
					request.getSession().setAttribute("testPassword", password);
				}
				studyName = request.getParameter("studyName");
			}

			isValidStudyTest.setStudyName(studyName);

			writer
					.println("IsValidStudyTestRequest:<br/><form method='post' action='happy.jsp?testIsValidStudy=true&def=false'><br/>");

			writer.println("Username:<input name='userName' value='"
					+ isValidStudyTest.getUserName() + "'/><br/>");
			writer
					.println("Password:<input name='password' type='password'/><br/>");

			writer.println("StudyName:<input name='studyName' value='"
					+ studyName + "'/>");
			writer
					.println("<br/><input name='xml' value='XML Response' type='Submit'/><br/>");
			writer.flush();

			try {
				if (isValidStudyTest.getCredentials() == null) {
					writer
							.println("<font color='red'>Credentials Invalid</font><br/></form>");
					writer.flush();
					return false;
				}
			} catch (Exception e) {
				writer
						.println("<font color='red'>Credentials Invalid</font><br/></form>");
				writer.flush();
				return false;
			}

			isValidStudyTest.testIsValidStudyService();

			writer
					.println("IsValidStudyTestResponse:<br/><textarea name='response' cols='100' rows='5'>"
							+ isValidStudyTest.getResponseStr()
							+ "</textarea><br/></form>");
			writer.flush();

		} catch (Exception e) {
			writer.println("IsValidStudy Exception:<span><br/><pre>");

			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			String stacktrace = sw.toString();

			writer.println(stacktrace);
			e.printStackTrace();
			writer.println("</pre></span><br/>");
			writer.flush();
			return false;
		}

		return true;
	}

	private boolean testPermissions(HttpServletRequest request,
			HttpServletResponse response, javax.servlet.jsp.JspWriter writer)
			throws Exception {

		try {
			CSMCDMSConnectorSecurityManagerTest test = new CSMCDMSConnectorSecurityManagerTest();

			/*ByteArrayOutputStream bos = new ByteArrayOutputStream();

			writer.print("testing the permissions..");
			writer.flush();
			TestRunner runner = new TestRunner();
			runner.setPrinter(new ResultPrinter(new PrintStream(bos)));
			TestResult tresult = runner.doRun(test);
			if(tresult.errorCount()>0 || tresult.failureCount()>0){
				writer.println("<pre>"+bos.toString()+"</pre>");
			}
			*/
			
			test.testCanAccess();
			
			if(test.getStatus()!=null){
				writer.println("<pre>"+test.getStatus()+"</pre>");
			}
			writer.println("</br>Completed<br/>");
			writer.flush();

		} catch (Exception e) {
			writer.println("Permission Test Exception:<span><br/><pre>");

			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			String stacktrace = sw.toString();

			writer.println(stacktrace);
			e.printStackTrace();
			writer.println("</pre></span><br/>");
			writer.flush();
			return false;
		}

		return true;

	}

	private boolean testDBConnectivity(HttpServletRequest request,
			HttpServletResponse response, javax.servlet.jsp.JspWriter writer)
			throws Exception {

		try {
			Connection conn = BaseJDBCDAO.getConnection();

			Statement stmt = conn.createStatement();
			writer.print("testing the db connectivity..");
			stmt.execute("select 1 from DUAL");
			writer.println("Completed<br/>");

			writer.flush();

		} catch (Exception e) {
			writer.println("db connectivity Exception:<span><br/><pre>");

			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			String stacktrace = sw.toString();

			writer.println(stacktrace);
			e.printStackTrace();
			writer.println("</pre></span><br/>");
			writer.flush();
			return false;
		}

		return true;

	}

	private boolean loadLabDBCleanUp(HttpServletRequest request,
			HttpServletResponse response, javax.servlet.jsp.JspWriter writer)
			throws Exception {

		try {
			Connection conn = BaseJDBCDAO.getConnection();

			Statement stmt = conn.createStatement();
			//deletes the batch job associated with SMOKE_TEST requests
			writer
					.print("deleting the batch job associated with SMOKE_TEST requests..");
			stmt
					.execute("delete from NCI_LABS_MANUAL_LOAD_BATCHES where batch_id in (select batch_id from nci_labs_manual_load_hold where study = 'SMOKE_TEST') or batch_id in (select batch_id from nci_labs_manual_load_stage where study = 'SMOKE_TEST')");
			writer.println("Completed<br/>");

			writer.flush();

			//deletes the Lab Loader records associated with SMOKE_TEST requests
			writer
					.print("deleting the Lab Loader records associated with SMOKE_TEST requests..");
			stmt.execute("delete from NCI_LABS where oc_study = 'SMOKE_TEST'");
			writer.println("Completed<br/>");

			writer.flush();

			//deletes the "In Holding" records associated with SMOKE_TEST requests
			writer
					.print("deleting the 'In Holding' records associated with SMOKE_TEST requests..");
			stmt
					.execute("delete from NCI_LABS_AUTOLOAD_HOLD where study = 'SMOKE_TEST'");
			writer.println("Completed<br/>");

			writer.flush();

			//deletes the request for loading records associated with SMOKE_TEST requests
			writer
					.print("deleting the request for loading records associated with SMOKE_TEST requests..");
			stmt
					.execute("delete from NCI_LABS_MANUAL_LOAD_HOLD where study = 'SMOKE_TEST'");
			writer.println("Completed<br/>");

			writer.flush();

			//deletes the validated request records associated with SMOKE_TEST requests
			writer
					.print("deleting the validated request records associated with SMOKE_TEST requests..");
			stmt
					.execute("delete from NCI_LABS_MANUAL_LOAD_STAGE where study = 'SMOKE_TEST'");
			writer.println("Completed<br/>");

			writer.flush();

		} catch (Exception e) {
			writer.println("Cleanup Exception:<span><br/><pre>");

			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			String stacktrace = sw.toString();

			writer.println(stacktrace);
			e.printStackTrace();
			writer.println("</pre></span><br/>");
			writer.flush();
			return false;
		}

		return true;
	}

	private boolean registrationDBCleanUp(HttpServletRequest request,
			HttpServletResponse response, javax.servlet.jsp.JspWriter writer)
			throws Exception {

		try {
			Connection conn = BaseJDBCDAO.getConnection();

			Statement stmt = conn.createStatement();
			//deletes the batch job associated with SMOKE_TEST requests
			stmt
					.execute("update patient_positions a set a.REPORTED_BIRTH_DATE = NULL, a.REPORTED_FIRST_NAME = NULL, a.REPORTED_LAST_NAME = NULL, a.REPORTED_INITIALS = NULL, a.REPORTED_SEX = NULL, a.PATIENT_ENROLLMENT_DATE = NULL where a.CLINICAL_STUDY_ID = (select clinical_study_id from clinical_studies where study = 'SMOKE_TEST')");

			writer.println("Completed<br/>");

			writer.flush();

		} catch (Exception e) {
			writer.println("Cleanup Exception:<span><br/><pre>");

			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			String stacktrace = sw.toString();

			writer.println(stacktrace);
			e.printStackTrace();
			writer.println("</pre></span><br/>");
			writer.flush();
			return false;
		}

		return true;
	}

	private boolean runSmokeTest(HttpServletRequest request,
			HttpServletResponse response, javax.servlet.jsp.JspWriter writer)
			throws Exception {
		StringWriter stringWriter;

		try {
			URL smokeTestURL = new URL(request.getScheme(), request
					.getServerName(), request.getServerPort(), request
					.getContextPath()
					+ "/services/cagrid/SmokeTestService");

			SmokeTestServiceTest smokeTestServiceTest = new SmokeTestServiceTest();
			smokeTestServiceTest.setUrl(smokeTestURL.toString());

			smokeTestServiceTest.smokeTest();

			writer.flush();

		} catch (Exception e) {
			writer.println("SmokeTest Exception:<span><br/><pre>");

			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			String stacktrace = sw.toString();

			writer.println(stacktrace);
			e.printStackTrace();
			writer.println("</pre></span><br/>");
			writer.flush();
			return false;
		}

		return true;
	}%>
