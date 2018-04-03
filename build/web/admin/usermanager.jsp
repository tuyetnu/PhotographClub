<%-- 
    Document   : usermanager
    Created on : Oct 15, 2017, 2:48:09 PM
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
        <div>
            <jsp:include page="menu.jsp"/>

            <div id="page-wrapper">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">List User</h1>
                    </div>


                    <div class="input-group" style="width: 40%">
                        <input type="text" class="form-control" placeholder="Search like fullname...">
                        <span class="input-group-btn">
                            <button class="btn btn-default" type="button">
                                <i class="fa fa-search"></i>
                            </button>
                        </span>
                    </div>



                </div>
            </div>
        </div>
    </body>
</html>
