<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="javax.servlet.http.Cookie"
	import="javax.servlet.http.HttpServlet"
	import="javax.servlet.http.HttpServletRequest"
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<% 
	PrintWriter pw = response.getWriter();
	Cookie[] cookies = null;
	Cookie cookie = null;
	cookies = request.getCookies();
	String v="",s="";
	if(cookies!=null)
	{
		cookie = cookies[cookies.length-1];
		s = cookie.getName();
		v = cookie.getValue();
		pw.println("<center>");
		pw.println("<a href='new_user.jsp'>New Users Click Here to Create New Account</a><br />");
		pw.println("<hr size='3' color='navy' width='400px'><br />");
		pw.println("<form action='login' method='post'>");
		pw.println("<strong>User Name: </strong><input type='text' name='username' value="+s+"><br /><br />");
		pw.println("<strong>Password: </strong><input type='password' name='pass' value="+v+"><br /><br />");
		pw.println("<input type='checkbox' name='rem'><strong>Remember Me for 1 Day</strong><br /><br />");
		pw.println("<input type='submit' value='Login' name='login_button'><br />");
		pw.println("</form>");
		pw.println("<hr size='3' color='navy' width='400px'><br />");
		pw.println("<br /><a href='data_table'>Click Here to View Table Data</a>");
		pw.println("</center>");
	}
	else
	{
		pw.println("<center>");
		pw.println("<a href='new_user.jsp'>New Users Click Here to Create New Account</a><br />");
		pw.println("<hr size='3' color='navy' width='400px'><br />");
		pw.println("<form action='login' method='post'>");
		pw.println("<strong>User Name: </strong><input type='text' name='username'><br /><br />");
		pw.println("<strong>Password: </strong><input type='password' name='pass'><br /><br />");
		pw.println("<input type='checkbox' name='rem'><strong>Remember Me for 1 Day</strong><br /><br />");
		pw.println("<input type='submit' value='Login' name='login_button'><br />");
		pw.println("</form>");
		pw.println("<hr size='3' color='navy' width='400px'><br />");
		pw.println("<br /><a href='data_table'>Click Here to View Table Data</a>");
		pw.println("</center>");
	}
%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Form</title>
</head>
<body>
</body>
</html>