<%@page import="com.bean.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
		tr,td{
		padding: 10px;
		
		}
</style>
</head>
<body>
<%
	Student s=(Student)request.getAttribute("s");
%>

<form name="update" method="post" action="StudentController">
	<table>
		<tr>
			<td><input type="hidden" name="id" value="<%=s.getId()%>"></td>
		</tr>
		<tr>
			<td>First Name: </td>
			<td><input type="text" name="fname" value="<%=s.getFname()%>"></td>
		</tr>
		
		<tr>
			<td>Last Name: </td>
			<td><input type="text" name="lname" value="<%=s.getLname()%>"></td>
		</tr>
		
		<tr>
			<td>Email: </td>
			<td><input type="text" name="email" value="<%=s.getEmail()%>"></td>
		</tr>
		
		<tr>
			<td>Mobile : </td>
			<td><input type="text" name="mobile" value="<%=s.getMobile()%>"></td>
		</tr>
		
		<tr>
		<td colspan="2" align="center">
				<input type="submit" name="action" value="update">
		</td>
		</tr>
	
	</table>
	<a href="show.jsp">show all student</a>


</form>

</body>
</html>