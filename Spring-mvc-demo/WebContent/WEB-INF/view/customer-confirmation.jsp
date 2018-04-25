<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<head>
	<title>Customer Confiramtion</title>
</head>
<body>

	The confirmed customer is : ${customer.firstName }  ${customer.lastName} <br>
	Number of Free Passes : ${customer.freePass} <br>
	Postal Code: ${customer.postalCode}
	
</body>
</html>