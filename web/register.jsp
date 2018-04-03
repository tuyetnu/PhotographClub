<%-- 
    Document   : register
    Created on : Oct 8, 2017, 3:06:56 PM
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
        <form action="MainController" method="POST">
            <br/><br/>
            Username: <input type="text" name="txtUsername" value="" />
            <br/><br/>
            Fullname: <input type="text" name="txtFullname" value="" />
            <br/><br/>
            Password: <input type="password" name="txtPassword" value="" />
            <br/><br/>
            Confirm: <input type="password" name="txtConfirm" value="" />
            <br/><br/>
            <input type="submit" value="Register" name="action" />&nbsp;&nbsp;&nbsp;
            <input type="reset" value="Reset" />
        </form>
    </center>
    <br/><br/>
        <jsp:include page="HTML/footer.html"/>
    </body>
</html>
