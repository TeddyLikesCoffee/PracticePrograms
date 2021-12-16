<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/Controller" method="post">
Full Name: <input type="text" name="name" required><br/>
Gender: <input type="radio" name="gender" value="male" checked="checked">Male
        <input type="radio" name="gender" value="female" >Female <br/>
Spoken Language: <input type="checkbox" name="Languge" value="English">English
				 <input type="checkbox" name="Languge" value="Spanish">Spanish
				 <input type="checkbox" name="Languge" value="French">French<br/>
Country: <select name="country">
		 <option value="USA">USA</option>
		 <option value="Mexico">Mexico</option>
		 <option value="Canada">Canada</option>
		 </select><br/>
		 <input type="submit" value="Submit">
</form>
</body>
</html>