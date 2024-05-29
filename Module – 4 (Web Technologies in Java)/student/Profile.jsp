<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>


	<h2>Data from Database</h2>

	<%
	// JDBC Connection variables
	String url = "jdbc:mysql://localhost:3306/student";
	String username = "root";
	String password = "123456";

	// JDBC Connection
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, username, password);
		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM student";
		ResultSet resultSet = statement.executeQuery(sql);
	%>
	<table border=1>
		<tr>
			<th>first_name</th>
			<th>last_name</th>
			<th>email</th>
			<th>password</th>
			<th>mobile</th>
			<th>gender</th>


		</tr>
		<%
		while (resultSet.next()) {
		%>
		<tr>
			<td><%=resultSet.getInt("first_name")%></td>
			<td><%=resultSet.getString("last_name")%></td>
			<td><%=resultSet.getString("email")%></td>
			<td><%=resultSet.getString("password")%></td>
			<td><%=resultSet.getString("mobile")%></td>
			<td><%=resultSet.getString("gender")%></td>
		</tr>
		<%
		}
		%>
	</table>


	<%
	// Close JDBC objects
	resultSet.close();
	statement.close();
	connection.close();
	} catch (Exception e) {
	e.printStackTrace();
	}
	%>
</body>
</html>