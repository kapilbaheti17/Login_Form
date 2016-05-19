<%-- 
    Document   : new_user
    Created on : Apr 6, 2016, 1:11:10 PM
    Author     : Kapil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New User Login</title>
    </head>
    <body>
    <center>
    	<hr size="3" color="black" width="500px"><br /><br />
        <h1>New User Login Here </h1>
        <form action="Register" method="post">
            <strong>Username: </strong><input type="text" name = "username"><br><br>
            <strong>Password: </strong><input type="password" name="pass"><br><br>
            <strong>Email: </strong><input type="text" name="email"><br><br>
            <strong>Phone Number: </strong><input type="text" name="phone"><br><br>
            <input type="submit" name="submit" value="Submit"><br><br>
        </form>
        <hr size="3" color="black" width="500px"><br />
        <a href="login.jsp"><strong>Already Existing User Click Here To Login</strong></a>
    </center>
    </body>
</html>