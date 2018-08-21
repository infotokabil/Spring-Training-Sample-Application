<%@page contentType="text/html" pageEncoding="UTF-8"  %>
<%@ page isELIgnored="false" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <div align="center">
	        <h1>Person List</h1>
	        <h2><a href="new">New Person</a></h2>
	        
        	<table border="2">
	        	<th>No</th>
	        	<th>Personname</th>
	        	<th>Country</th>
	        	<th>Actions</th>
	        	
				<c:forEach var="person" items="${personList}" varStatus="status">
	        	<tr>
	        		<td>${status.index + 1}</td>
					<td>${person.name}</td>
					<td>${person.country}</td>
					<td>
						<a href="edit?id=${person.id}" >Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="delete?id=${person.id}">Delete</a>
					</td>
	        	</tr>
				</c:forEach>	        	
        	</table>
        </div>
    </body>
</html>
