<%-- 
    Document   : post
    Created on : Oct 22, 2017, 6:08:39 PM
    Author     : NUNTTSE62525
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function previewImg() {
                var m = document.getElementById("inputfile");
                var n = document.getElementById("img");
                n.src = m.value;
                alert(n.src);
            }
        </script>
    </head>
    <body>
    <center>
        <table>
            <tr>
                <td style="width: 45%">
                    <div style="border: solid 1px; border-color: #000000; width: 500px; height: 500px; margin-left: 100px; margin-top: 50px; margin-right: 20px">
                        <img src="" style="width: 500px; height: 500px;" id="img"/>  
                    </div>
                    <input type="file" style="margin-left: 100px; margin-bottom: 100px; margin-top: 20px;" onchange="previewImg()" id="inputfile"/>
                </td>
                <td style="width: 55%; ">
                    <table>
                        <tr>
                            <td>
                                <div style="width: 500px; height: 40px; ">
                                    <b>Title:</b>  <input type="text" name="txtTitle" value="" style="width: 80%"/>
                                </div>
                            </td>
                        </tr>
                        <tr style="height: 560px;">
                            <td style="width: 100%">
                                <div style="width: 100%; height: 500px;">
                                    <textarea style="width: 100%; height: 430px;" name="taContent"></textarea>
                                </div>
                            </td>
                        </tr>
                    </table>


                </td>
            </tr>
        </table>
    </center>
</body>
</html>
