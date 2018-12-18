<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>OPENDAP Collector Home</title>
</head>
<body>
	<h1>${message}</h1>
	<p>a paragraph tag area</p>
	<form:form method="POST" action="/testRedirect" >
		<input type="submit" name="list" value="List_Page"/>
		<input type="submit" name="second" value="Second_Page"/>
	</form:form >
	<form:form>
		<a href="/testRedirect" >Second_Page</a>
	</form:form>
</body>
</html>