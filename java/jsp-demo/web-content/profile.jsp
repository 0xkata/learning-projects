<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%
	
		String url = "jdbc:mysql://127.0.0.1:3306/test-data";
		String username = "root";
		String password = "B0blovesmysql";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		
		String sql = "select * from students where age=9";
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(sql);
		rs.next();
		
	%>
	
	id: <%= rs.getString(1) %> <br>
	name: <%= rs.getString(2) %> <br>
	age: <%= rs.getString(3) %>

</body>
</html>