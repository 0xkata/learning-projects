<%-- 
    Document   : error
    Created on : Jun. 8, 2023, 8:06:58 p.m.
    Author     : sinan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <body bgcolor="red">
        Error <%= exception.getMessage() %>
    </body>
</html>
