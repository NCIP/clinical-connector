<%@ taglib uri="http://jakarta.apache.org/taglibs/response-1.0" prefix="res" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
<title>Grid ID to C3D Id Capture</title>
<style type="text/css">
h2 {color:blue}
p {color:green}
</style>
<script language="JavaScript">
function doSave() {
    TestVar1 = document.getElementById("c3dAccount_gridIdName").value;
    TestVar2 = document.getElementById("c3dAccount_c3dUsername").value;
    alert ("Saving " + TestVar2 + " for " + TestVar1);
    document.getElementById("message").value="";
    document.getElementById("command").value="save";
    document.getElementById("c3dAccount").submit();
}
function doVerify() {
    TestVar1 = document.getElementById("c3dAccount_gridIdName").value;
    TestVar2 = document.getElementById("c3dAccount_c3dUsername").value;
    alert ("Verifying " + TestVar2 + " for " + TestVar1);
    document.getElementById("message").value="";
    document.getElementById("command").value="verify";
    document.getElementById("c3dAccount").submit();
}
</script>

</head>
<body>
<h2>Grid ID to C3D Id Capture</h2>

<form id="c3dAccount" name="c3dAccount" action="capture.action" method="POST">

<table class="wwFormTable" frame="above">


	<tr>
		<td class="tdLabel"><label for="c3dAccount_gridIdName" class="label">
		Grid Login Id:</label></td>
		<td> <input type="text" name="gridIdName" value='<s:property value="gridIdName"/>' 
			  id="c3dAccount_gridIdName" />
             <input type="hidden" name="command" value='<s:property value="NULL"/>' />
            </td>
	</tr>

	<tr>
		<td class="tdLabel"><label for="c3dAccount_gridIdPass" class="label">
		Grid Password:</label></td>
		<td><input type="password" name="gridIdPass" value="" 
			id="c3dAccount_gridIdPass" /></td>
	</tr>
	
	<tr>
		<td class="tdLabel"><label for="c3dAccount_c3dUsername" class="label">
		C3D Username:</label></td>
		<td><input type="text" name="c3dUsername" value='<s:property value="c3dUsername"/>'
			id="c3dAccount_c3dUsername" /></td>
	</tr>

	<tr>
		<td class="tdLabel"><label for="c3dAccount_c3dPassword" class="label">
		C3D Password:</label></td>
		<td><input type="password" name="c3dPassword" id="c3dAccount_c3dPassword" />
		</td>
	</tr>

	<tr>
		<td>
		<div align="left"><input type="button" id="doVerify_0"
			value="Verify" onClick="doVerify()" /></div>
		</td>
		<td>
		<div align="right"><input type="button" id="doSave_0"
			value="Save" onClick="doSave()" /></div>
		</td>
	
	</tr>

<table class="wwFormTable" frame="void">

	<tr>
		<td><input disabled type="text" name="message" id="c3dAccount_message" 
		value='<s:property value="message"/>'/></td>
	</tr>

</table>
</table>
</form>
</body>

</html>