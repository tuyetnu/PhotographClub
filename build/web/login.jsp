<%-- 
    Document   : login
    Created on : Oct 8, 2017, 1:39:47 PM
    Author     : NUNTTSE62525
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="HTML/header.jsp"/>
    <center>
        <form action="/PhotographClub/MainController" method="POST">
            <br/>
            <b>Username:&nbsp;&nbsp;</b> <input type="text" name="txtUsername" value="" /><br/><br/>
            <b>Password:&nbsp;&nbsp;</b> <input type="password" name="txtPassword" value="" /><br/><br/>
            <input type="submit" value="Login" name="action" />
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input type="reset" value="Reset" />
        </form>
    </center>
    <br/><br/>
        <jsp:include page="HTML/footer.html"/>
    </body>
</html>
