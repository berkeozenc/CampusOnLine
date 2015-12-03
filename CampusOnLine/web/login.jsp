<%-- 
    Document   : login
    Created on : 30.Kas.2015, 21:49:20
    Author     : Berke
--%>

<%@page import="Model.Instructor"%>
<%@page import="Model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "Controller.Login" %>
<jsp:useBean id = "login" scope = "session" class= "Controller.Login"></jsp:useBean>
<jsp:setProperty name = "login" property = "*"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body>
        
        
        
        <%if (login.logIn()) {
                if (login.getU() instanceof Student) {
        %>
        <jsp:forward page = "stuHome.jsp" />
        <%
        } else if (login.getU() instanceof Instructor) {
        %>
        <jsp:forward page = "instHome.jsp" />
        <%
            }
        else if(login.getU().getStatus() == 1){ %>
         <jsp:forward page = "adminHome.jsp" />   
        <% }
        } else {
        %>
        <jsp:forward page = "login.html" />
        <%}
        %>
    </body>
</html>
