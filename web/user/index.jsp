<%-- 
    Document   : index
    Created on : Oct 15, 2017, 4:39:42 PM
    Author     : NUNTTSE62525
--%>

<%@page import="nuntt.dtos.RegistrationDTO"%>
<%@page import="nuntt.daos.RegistrationDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="nunnt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Page</title>
        <!-- Bootstrap Core CSS -->
        <link href="/PhotographClub/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="/PhotographClub/css/sb-admin-2.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="/PhotographClub/css/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <style>
            .tagtd {
                padding: 10px 15px;
            }
            .taginput {
                height: 50px;
                width: 300px;
            }
        </style>
    </head>
    <body>
        <nunnt:if test="${sessionScope.ROLELOGIN ne 'user'}">
            <jsp:forward page="../login.jsp"/>
        </nunnt:if>
        <div>
            <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
                <!-- /.navbar-header -->
                <ul class="nav navbar-top-links navbar-right">
                    <li>
                        <form action="/PhotographClub/MainController" method="POST">
                            <i class="fa fa-sign-out fa-fw"></i><input type="submit" value="Logout" name="action" />
                        </form>
                    </li>
                </ul>

                <div class="navbar-default sidebar" role="navigation">
                    <div class="sidebar-nav navbar-collapse">
                        <ul class="nav" id="side-menu">       
                            <li>
                                <a href="/PhotographClub/user/index.jsp"><i class="fa fa-edit fa-fw"></i> Edit Profile</a>
                            </li>
                            <li>
                                <a href="/PhotographClub/"><i class="fa fa-arrow-circle-right"></i> Back to Website</a>
                            </li>

                        </ul>
                    </div>
                    <!-- /.sidebar-collapse -->
                </div>
            </nav>

            <div id="page-wrapper">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header" style="text-align: center;">My Profiles</h1>
                    </div>       
                </div>

                <%
                    String username = (String) session.getAttribute("USERLOGIN");
                    RegistrationDAO dao = new RegistrationDAO();
                    RegistrationDTO dto = dao.findByPK(username);
                %>

                <center>
                    <form action="/PhotographClub/MainController" method="POST">
                        <table border="0">
                            <tr>
                                <td class="tagtd">Username: </td>
                                <td class="tagtd">
                                    <input type="text" name="txtUsername" value="<%= dto.getUsername()%>" readonly="readonly" class="taginput"/>
                                </td>
                            </tr>
                            <tr>
                                <td class="tagtd">Fullname: </td>
                                <td class="tagtd">
                                    <input type="text" name="txtFullname" value="<%= dto.getFullname()%>" class="taginput" />
                                </td>
                            </tr>
                            <tr>
                                <td class="tagtd">Password: </td>
                                <td class="tagtd">
                                    <input type="password" name="txtPassword" value="" class="taginput"/>
                                </td>
                            </tr>
                            <tr>
                                <td class="tagtd">Retype password: </td>
                                <td class="tagtd">
                                    <input type="password" name="txtRPassword" value="" class="taginput"/>
                                </td>
                            </tr>
                            <tr><td class="tagtd"></td>
                                <td class="tagtd">
                                        <input type="submit" value="Save" name="action" />
                                </td>
                            </tr>
                        </table>
                    </form>
                </center>
            </div>
    </body>
</html>
