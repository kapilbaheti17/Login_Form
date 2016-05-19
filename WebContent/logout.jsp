<%@page import="java.io.PrintWriter"%>
<%@page import="javax.servlet.http.HttpServletResponse"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logout</title>
</head>
<body>
<center>
<%
	PrintWriter outr = response.getWriter();
	session.invalidate();
	outr.print("<h3>Session Destroyed</h3><br />");
%>
<h2>Thank You for Using the Services</h2><br />
<hr size="5" color="navy" width="400px"><br />
<h4><a href="login.jsp">Click Here to Login</a></h4>
</center>
</body>
</html>