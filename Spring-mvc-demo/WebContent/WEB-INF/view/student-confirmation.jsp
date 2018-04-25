<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>


<head>
	<title>Student Confirmaiton</title>
</head>
 
<body>
The student is Confirmed: ${student.firstName }  ${student.lastName }

<br><br>
Country : ${student.country }

<br><br>
Favorite Language : ${student.favLanguage }

<br><br>

Operating System
<ul>
	<c:forEach var="temp" items="${student.operatingSystem}">
		<li>${temp}</li>
	</c:forEach>
</ul>

</body>
</html>