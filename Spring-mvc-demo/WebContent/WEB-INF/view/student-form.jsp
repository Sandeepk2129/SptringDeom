<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>


<head>
	<title>Student Registration Form</title>
</head>

<body>
	<form:form action="processForm" modelAttribute="student">
	
	First Name : <form:input path="firstName"/>
	<br><br>
	
	Last Name : <form:input path="lastName"/>
	<br><br>
	
	 Country : <form:select path="country">
			<form:options items= "${theCountryOptions}"	/>	
			 
	</form:select>  
	
	<br><br>
	Select Your Favorite Language
	Java <form:radiobutton path="favLanguage" value="Java"/>
	C# <form:radiobutton path="favLanguage" value="C#"/>
	PHP <form:radiobutton path="favLanguage" value="PHP"/>
	Python <form:radiobutton path="favLanguage" value="Python"/>
	
	<br><br>
	
	<input type="submit" value="Submit"/>
	
	
	</form:form>



</body>
</html>