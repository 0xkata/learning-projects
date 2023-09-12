<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<c:forEach items="${students}" var="s">
		${s} <br>
	</c:forEach>
	
	<br>
	
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://127.0.0.1:3306/test-data"
		user="root" password="B0blovesmysql"/>
		
	<sql:query var="rs" dataSource="${db}">select * from students</sql:query>
	
	<c:forEach items="${rs.rows}" var="s"> 
		<c:out value="${s.id}"></c:out> : <c:out value="${s.name}"></c:out> : <c:out value="${s.age}"></c:out> <br> 
	</c:forEach>
	
	<br>
	
	<c:set var="str" value="Bob the builder is cool."></c:set>
	
	Length : ${fn:length(str)} <br>

	<c:forEach items="${fn:split(str, ' ')}" var="s">
		${s} <br>
	</c:forEach>
	
	index of "is" : ${fn:indexOf(str, "is")} <br>
	
	contains "cool" : ${fn:contains(str, "cool")} <br>
	
	<c:if test="${fn:endsWith(str, 'cool.')}">
		cool <br> 
	</c:if>
	
	${fn:toLowerCase(str)}
	
</body>
</html>