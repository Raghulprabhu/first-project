<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>project</title>
</head>
<body>
<h1><center>FIRST PROJECT</center></h1>
<div class="Raghul">

<%
String message = (String) request.getAttribute("one");
String t = (String) request.getAttribute("two");

out.println("Hai User..!");
out.println("</br>");
out.println("Welcome to Java");


%>
</div>
</body>
</html>