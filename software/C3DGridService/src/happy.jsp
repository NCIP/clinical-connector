<%--
Copyright Ekagra and SemanticBits, LLC

Distributed under the OSI-approved BSD 3-Clause License.
See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
--%>
<%@page import="java.net.URL"%>
<%@page import="java.io.StringWriter"%>
<%@page import="gov.nih.nci.cagrid.common.Utils"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="gov.nih.nci.cdmsconnector.dao.BaseJDBCDAO"%>
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

<h1>C3D Grid Service Happy JSP / Tests</h1>
<p>
<ul>
	<li><a href="happy.jsp?testGetStudyCDEs=true">Run
	testGetStudyCDEs</a></li>
	<li><a href="happy.jsp?testGetStudyCDEsData=true">Run
	testGetStudyCDEsData</a></li>
	<li><a href="happy.jsp?testIsValidStudy=true">Run
	testIsValidStudy</a></li>

	<li>HotLink<form>Study:<input id="study" value="SMOKE_TEST">  Patient Position<input id="patientPosition" value="">  PatientId(MRN)<input id="patientId" value="1212332"> <input type="button" value="create hot link to c3d" onclick="getAction()"/></form><div id="hotlink"></div><br/></li>

	<li><a href="happy.jsp?testDBConnectivity=true">Run
	testDBConnectivity</a></li>
	<li><a href="happy.jsp?logOut=true">Logout</a></li>
</ul>
</p>
</body>
</html>


<%!
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

%>
