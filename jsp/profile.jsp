<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" 
		content="text/html; charset=windows-1256">
		<title>My Profile</title>
	</head>
	<body>
		<center>
			<% String age = (String) session.getAttribute("age");%>
			<% String gender = (String) session.getAttribute("gender");%>
			<% String address = (String) session.getAttribute("address");%>
			Your Age :  <%= age %>
			Your Gender : <%= gender %>
			Your Address <%= address %>
		</center>
	</body>
</html>
