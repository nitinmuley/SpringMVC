<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Engineering College Admission</title>
</head>
<body>
<link rel="stylesheet" href="<spring:spring:theme code='styleSheet'/>" type="text/css" />
<p> <a href ="/SpringMVCStudent/admission/admissionForm.html?siteTheme=green">Green </a> |
 <a href ="/SpringMVCStudent/admission/admissionForm.html?siteTheme=red">Red </a></p>
	<h3>Testttttttttt</h3>
	<h2>${heading}</h2>
	
		<form:errors path="details.*"/>
		
		<form name="myForm" action="/SpringMVCStudent/admission/admissionSuccess.html" method="post">
			
			<table>
				<tr>
					<td>Student Name: </td>
					<td><input type="text" name="studentName" /></td>
				</tr>
				<tr>
					<td>Student Email: </td>
					<td><input type="text" name="studentEmail" /></td>
				</tr>
				<tr>
					<td>Student Mobile: </td>
					<td><input type="text" name="studentMobile" /></td>
				</tr>
					<tr>
					<td>Student Blood group : </td>
					<td><input type="text" name="studentBloodGrp" /></td>
				</tr>
				<tr>
					<td>Student DOB: </td>
					<td><input type="text" name="studentDOB" /></td>
				</tr>
				<tr>
					<td>Student Address: </td>
					<td>
						Country:   <input type="text" name="studentAddress.country" /> <br>
						City:      <input type="text" name="studentAddress.city" /> <br>
						Street:    <input type="text" name="studentAddress.street" /> <br>
						Pincode:   <input type="text" name="studentAddress.pincode" /> 
					</td>
				</tr>
				<tr>
					<td><input type="submit" value="Click here to Submit" /></td>
				</tr>
			</table>
		
		</form>
	
	<br><br><br><br><br><br><br>
	<h3>${footer}</h3>
</body>
</html>