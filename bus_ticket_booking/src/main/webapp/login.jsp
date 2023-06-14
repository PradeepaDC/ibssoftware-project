<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="validation" modelAttribute="loginobj">
Operator ID 		 :<form:input path="operator_id" required="required"/><br>
Password		 :<form:input path="operator_pwd" required="required"/><br>
<form:button>Submit</form:button>
<form:button>Reset</form:button>
</form:form>
</body>
</html>