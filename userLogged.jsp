<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
		<title>User Logged Successfully</title>
	</head>
	<body>
	<center>
		<% String currentUser = (String) session.getAttribute("currentSessionUser");%>
		Welcome <%= currentUser %> !!!!!!
		<a href="/organize/profile">My Profile</a>
	</center>
	</body>
</html>
