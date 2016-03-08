<%-- 
    Document   : jspDisplay
    Created on : Mar 4, 2016, 4:57:28 PM
    Author     : root
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head><title>nduatiServletjsp</title>>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
        <%@page import="data.*" %>
        <% Person person=(Person) request.getAttribute("display");%>
        First Name is :
        <%=person.getFirstName()%>
        Last Name is :
        <%=person.getLastName()%>
    </body>
</html>
