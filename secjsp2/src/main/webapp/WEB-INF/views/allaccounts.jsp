<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Account transaction SPI bank </title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
</head>
<body>
<a href="logout">logout</a>
<br/>
<br/>
<br/>

<div class="container">
  <div class="row">
    <div class="col-sm-6">

	<table class="table table-striped">

		<thead>
			<tr>
				<th>accountNumber</th>
				<th>balance</th>
				<th>customer name</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${accounts}" var="account">
				<tr>
					<td>${account.accountNumber }</td>
					<td>${account.balance }</td>
					<td>${account.customer.name }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</div>
</div>
</body>
</html>