<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee reg</title>
</head>
<body>

<form:form action="adduser" method="post" modelAttribute="userFormBean">
    Enter Employee Name: <form:input path="name"/><br/>
    Enter Employee password: <form:input path="password"/><br/> 
    Enter Employee email: <form:input path="email"/><br/>
    Enter Employee phone: <form:input path="phone"/><br/>
    Enter Employee address: <form:input path="address"/><br/>
    Enter Employee roles: <form:select path="roles" items="${user_roles}"/><br/>
    <input type="submit"/>
</form:form>
</body>
</html>