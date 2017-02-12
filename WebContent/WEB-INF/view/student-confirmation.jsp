<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>
</head>

<body>
	The student is confirmed: ${student.firstName} ${student.lastName} 
<br>
	from ${student.country} - ${student.countryFullName}
<br>
	Fav Language: ${student.favoriteLanguage}
<br>
	Operating Systems: 
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}"> 
			<li> ${temp} </li> 		
		</c:forEach>
	</ul>
	
<br>
<a href="/spring-mvc-demo"> Return Home </a>
</body>
</html>