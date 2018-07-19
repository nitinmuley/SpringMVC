<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Engineering College Admission</title>
</head>
<body>
	<h2>${heading}</h2>
	<h3>Student Details -></h3>
	<br>
	<hr>
	<h4>Student Name: ${details.studentName}</h4>
	<h4>Student Email: ${details.studentEmail}</h4>
	<h4>Student Mobile: ${details.studentMobile}</h4>
	<h4>Student Blood group: ${details.studentBloodGrp}</h4>
	<h4>Student DOB: ${details.studentDOB}</h4>
	<h4>Student Address: ${details.studentAddress.country} , ${details.studentAddress.city}, ${details.studentAddress.street}, ${details.studentAddress.pincode}</h4>
	<br><br><br><br><br><br><br><br><br>
	<h4>${footer}</h4>
</body>
</html>