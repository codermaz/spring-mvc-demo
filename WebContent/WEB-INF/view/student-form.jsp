<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>
</head>

<body>
	<form:form action="processForm" modelAttribute="student"> 
		First Name :
		<form:input path="firstName" placeholder="Write your firstname" />
		<br> <br> 
		Last Name :
		<form:input path="lastName" placeholder="Write your lastname" />
		<br> <br>
		Country:
		<form:select path="country">
			<form:options items="${student.countryOptions}" />
<%-- 			<form:option value="Brazil" label="Brazil" /> --%>
<%-- 			<form:option value="France" label="France" /> --%>
<%-- 			<form:option value="Germany" label="Germany" /> --%>
<%-- 			<form:option value="India" label="India" /> --%>
		</form:select>
		<br> <br>
		
		Favorite Programming Languages: <br>
<%--    <form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"  /> --%>
		<table>
			<tr>
				<td> Java <form:radiobutton path="favoriteLanguage" value="Java"/> </td>
				<td> C# <form:radiobutton path="favoriteLanguage" value="C#"/> </td>
			</tr>
			<tr>
				<td> PHP <form:radiobutton path="favoriteLanguage" value="PHP"/> </td>
				<td> Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/> </td>
			</tr>
		</table>
		
		Operating Systems:
		Linux <form:checkbox path="operatingSystems" value="Linux"/>
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
		MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>
		
		
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>
