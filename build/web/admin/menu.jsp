<%-- 
    Document   : menu
    Created on : Oct 15, 2017, 2:40:45 PM
    Author     : NUNTTSE62525
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="nunnt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu</title>
        <!-- Bootstrap Core CSS -->
        <link href="/PhotographClub/css/bootstrap.min.css" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href="/PhotographClub/css/metisMenu.min.css" rel="stylesheet">

        <!-- Timeline CSS -->
        <link href="/PhotographClub/css/timeline.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="/PhotographClub/css/sb-admin-2.css" rel="stylesheet">

        <!-- Morris Charts CSS -->
        <link href="/PhotographClub/css/morris.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="/PhotographClub/css/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <nunnt:if test="${sessionScope.ROLELOGIN ne 'admin'}">
            <jsp:forward page="../login.jsp"/>
        </nunnt:if>
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <!-- /.navbar-header -->
            <ul class="nav navbar-top-links navbar-right">
                <li>
                    <form action="/PhotographClub/MainController" method="POST">
                        <i class="fa fa-sign-out fa-fw"></i><input type="submit" value="Logout" name="action" />
                    </form>
                </li>
            </ul>
            <!-- /.navbar-top-links -->

            <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">       
                        <li>
                            <a href="/PhotographClub/admin/index.jsp"><i class="fa fa-dashboard fa-fw"></i> Dashboard</a>
                        </li>
                        <li>
                            <a href="/PhotographClub/admin/usermanager.jsp"><i class="fa fa-table fa-fw"></i> User Manager</a>
                        </li>
                        <li>
                            <a href="/PhotographClub/admin/editprofile.jsp"><i class="fa fa-edit fa-fw"></i> Edit Profile</a>
                        </li>
                        <li>
                            <a href="/PhotographClub/"><i class="fa fa-arrow-circle-right"></i> Back to Website</a>
                        </li>

                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>
    </body>
</html>
