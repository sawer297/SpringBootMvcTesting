<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form Test Page</title>
</head>
<body>
		<div>
		<form:form method="POST" action="/displayData">
			<div style="float:left;">
				First Name : <br>
				Last Name : <br>
				Job : <br>
				Age : 
			</div>
			<div>
				<input id="FName" name="FName" type="text" /><br>
				<input id="LName" name="LName" type="text"/><br>
				<input id="Job" name="Job" type="text"/><br>
				<input id="Age" name="Age" type="text"/>
			</div>
			<input type="button" onclick="this.form.reset();" value="Clear"/> 
			<input type="submit" value="Submit"/>
		</form:form>
	</div>
</body>
</html>