<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add new account</title>
</head>
<body>
<form:form action="addaccount" method="post" modelAttribute="accountFormBean">
    Enter opening amount: <form:input path="balance"/><br/>
    Enter customer name: <form:input path="name"/><br/> 
    Enter opening phone: <form:input path="phone"/><br/>
    Enter opening address: <form:input path="address"/><br/>
    Enter opening city: <form:input path="city"/><br/>
    Enter opening country: <form:input path="country"/><br/>
    <input type="submit"/>
</form:form>
</body>
</html>
