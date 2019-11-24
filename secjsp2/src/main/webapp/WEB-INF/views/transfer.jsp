<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="transfer" method="post" modelAttribute="fundTransferBean">
	Enter from Account : <form:input path="fromAccount"/><br/>
	Enter to Account : <form:input path="toAccount"/><br/>
	Enter the amount : <form:input path="amount"/><br/>
	<input type="submit"/>
</form:form>
</body>
</html>