<%@ taglib uri="http://jakarta.apache.org/taglibs/response-1.0" prefix="res" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<script>
window.location='<s:property value="hotLink"/>';
</script>


<!doctype html public "-//w3c//dtd html 4.0 transitional//en">
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
   <meta name="Author" content="Stephen Clover">
   <meta name="GENERATOR" content="Mozilla/4.78 [en] (Windows NT 5.0; U) [Netscape]">
   <title>Hot Link to RDC</title>
<script language="JavaScript">
function getAction() {
	var windowname="ntcbioocdev";
	var config="hotlinkrdc";
	var sessionprefix="a%20";
	var sessiontitle="RDC";
	var vwidth="400";
	var vheight="80";
    var otherparams=window.location.search.substring(1);
    <%
    String sessionId = session.getId();
    out.println("otherparams+='&jsessionId="+sessionId+"';");
    %>
    var t='tt';
	window.open('http://octrials-dev.nci.nih.gov/servlet/f60servlet?config='+config+'&'+otherparams+'&HTMLbeforeForm=<b>Please%20do%20not%20close%20this%20window%20with%20'+sessionprefix+sessiontitle+'%20session%20running.%20%20Closing%20the%20window%20will%20cause%20report/file%20viewing%20and%20help%20to%20stop%20working.</b>','A'+config+windowname,'toolbar=0,location=0,directories=0,status=0,menubar=0,scrollbars=0,resizable=1,copyhistory=0,width='+vwidth+',height='+vheight);
}

</script>
</head>
<body text="#000000" bgcolor="#FFFFFF" link="#800000" vlink="#551A8B" alink="#FF0000">
&nbsp;
<center><table COLS=2 WIDTH="100%" >
<tr>
<td>
<center>
<h1>
<font face="Arial,Helvetica">Oracle Pharmaceutical Applications&nbsp;</font></h1></center>

<center>
<h1>
<font face="Arial,Helvetica">Hot Link RDC Redirection Application</font></h1></center>

<center>
<p><br><script language="JavaScript">
getAction()
/* PRC - 11/05/2008 - Ekagra Software Technologies                                                   */
/* The five lines following these coments will provide a button to click to launch the redirection   */
/* Once they are uncommented, the landing page will perform more like the regular OC RDC Launch Page */
/*   
document.write("<FORM>");
document.write('<INPUT TYPE="button" VALUE="Login" onClick="getAction()">');
document.write("<p></FORM>"); 
*/
</script>
<noscript><font face="Arial,Helvetica"><font size=+1><a href="../servlet/f60servlet?config=j2eerdc45">Launch</a></font></font></noscript>
<p><font face="Arial,Helvetica"><a href="../servlet/f60servlet?config=rdcpassw45">Change
Password</a></font>
<br><font face="Arial,Helvetica"><a href="xhelp/oc/start/wwhelp.htm?context=start&topic=oclogin&single=true">Login help</a></font>
<br>&nbsp;
<br>&nbsp;
<p><font face="Arial,Helvetica">For supported browsers and operating systems
check with your administrator or Oracle Support</font></center>
</td>

<td ALIGN=CENTER VALIGN=CENTER>
<center><table CELLSPACING=0 CELLPADDING=0 WIDTH="80%" >
<tr>
<td>
<center><a href="xhelp/rdc/user/wwhelp.htm"><img SRC="workflow.gif" ALT="Documentation" HSPACE=15 VSPACE=5 NOSAVE BORDER=0 height=40 width=40></a></center>
</td>

<td><font face="Arial,Helvetica">RDC Online Documentation</font></td>
</tr>

<tr>
<td>
<center><b><font face="Arial,Helvetica"><font size=+1><a href="opa45_download.htm">Downloads</a></font></font></b></center>
</td>

<td><font face="Arial,Helvetica">Plugin download page</font></td>
</tr>

<tr>
<td>
<center><b><font face="Arial,Helvetica"><font size=+1><a href="http://www.oracle.com/industries/life_sciences/">Life
Sciences</a></font></font></b></center>
</td>

<td><font face="Arial,Helvetica">Oracle Life Sciences</font></td>
</tr>

<tr>
<td>
<center><b><font face="Arial,Helvetica"><font size=+1><a href="http://www.ocug.org/">OCUG</a></font></font></b></center>
</td>

<td><font face="Arial,Helvetica">Oracle Clinical User Group</font></td>
</tr>
</table></center>
</td>
</tr>
</table></center>

<hr SIZE=3 NOSHADE WIDTH="99%">
<br><a href="http://www.oracle.com/"><img SRC="ologo_200pxl.jpg" ALT="Oracle homepage" HSPACE=10 BORDER=0 height=40 width=204></a>
<table BORDER=0 WIDTH="100%" >
<tr>
<td VALIGN=TOP><font face="Arial,Helvetica"><font size=-2>Copyright 2003
<a href="http://www.oracle.com/">Oracle
Corporation </a>All Rights Reserved.&nbsp;</font></font>
<br><font face="Arial,Helvetica"><font size=-2>Questions, comments, etc:
Please contact your local Oracle support representative.</font></font></td>
</tr>
</table>

</body>
</html>
