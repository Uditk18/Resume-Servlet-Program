<!-- Page displaying the resume in particular format after user clicks the submit button -->


<%@ page import="com.cg.model.ResumeModel" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% ResumeModel resume=(ResumeModel)request.getAttribute("ResumeObject"); 
%>
	<table align = "center">
		<tr>
		<td><h1>Resume</h1></td>
		</tr>
		
		<tr>
			<td>Name:</td>
			<td><%= resume.getFname() %>&nbsp;
			<%= resume.getLname()%></td>
			
			<%-- <td><img src="<%= ((ResumeModel)(request.getAttribute("ResumeObject"))).getPicAddress() %>" height="100px" width="100"/></td> --%>
		</tr>
		
		<tr>
			<td>Gender</td>
			<td><%= resume.getGender() %></td>
		</tr>
		
		<tr>
			<td>Highest Educational Qualification:</td>
			<td><%= resume.getHighestQualification()%></td>
		</tr>
		
		<tr>
			<td>Date of Birth:</td>
			<td><%= resume.getDob() %></td>
		</tr>
		
		 <tr>
			<td>Hobbies:</td>
			<td>
			<%for(String hobby : resume.getHobbies())
					{ %>
			<%= hobby + "\t" %>
			<%} %>
			</td>
		</tr>
		
		<tr>
			<td>Address:</td>
			<td><%= resume.getAddress() %></td>
		</tr>
			
		<tr>
			<td>Skills:</td>
			<td>
			<%for(String hobby : resume.getSkills()) 
					{ %>
			<%= hobby + "\t" %>
			<%} %>
			</td>
		</tr> 
		
		<tr>
			<td>Email ID:</td>
			<td>
			<%= resume.getEmail() %>
			</td>
		</tr>
		
	 <tr>
			<%-- <td>URL:</td>
			<td><%= ((ResumeModel)(request.getAttribute("ResumeObject"))).get() %></td>
		</tr> 
		 --%>
		 <tr>
			<td>Phone:</td>
			<td><%= resume.getPhone()%></td>
		</tr> 
		
	<tr>
			<td>Description:</td>
			<td><%= resume.getDescription()%>
			</td>
		</tr>
	</table>
</body>
</html>