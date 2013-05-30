<%--
Copyright Ekagra and SemanticBits, LLC

Distributed under the OSI-approved BSD 3-Clause License.
See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
--%>
<%@ taglib uri="http://jakarta.apache.org/taglibs/response-1.0" prefix="res" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>HotLink to C3D: Login</title>

</head>
<body>
<form id="hotLink" name="hotLink" onsubmit="return true;"
	action="hotLink.action" method="POST">
<table class="wwFormTable">

	<tr>
		<td colspan="2">HotLink to C3D: Login</td>

	</tr>

	<tr>
		<td class="tdLabel"><label for="hotLink_username" class="label">
		Login name:</label></td>
		<td><input type="text" name="c3dUserName" value=""
			id="hotLink_username" /></td>
	</tr>

	<tr>
		<td class="tdLabel"><label for="hotLink_password" class="label">
		Password:</label></td>
		<td><input type="password" name="c3dPassword" id="hotLink_password" />
		</td>
	</tr>

	<tr>
		<td><input type="checkbox" name="remember" id="hotLink_remember" />
		<td class="tdLabel"><label for="hotLink_remember" class="label">Remember my C3D Password</label></td>
		</td>
	</tr>

	<tr>
		<td colspan="2">
		<input type="hidden" name="study" value='<s:property value="study"/>'/>
		<input type="hidden" name="patientId" value='<s:property value="patientId"/>'/>
		<input type="hidden" name="patientPosition" value='<s:property value="patientPosition"/>'/>
		<div align="center"><input type="submit" id="doLogin_0"
			value="Login" /></div>
		</td>
	</tr>
</table>
</form>
</body>

</html>
