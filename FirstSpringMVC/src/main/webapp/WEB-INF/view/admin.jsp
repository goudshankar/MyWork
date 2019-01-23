<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin page</title>
<!--Bootstrap table content  -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

</head>
<body>

	<div class="container">
		<h2>
			Dear <strong>${user}</strong>, Welcome to Admin Page. <a href="<c:url value="/logout" />">Logout</a>
		</h2>
		<br>
		<br>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th data-field="userName">Name</th>
					<th data-field="email">Email</th>
					<th data-field="mobile">Mobile</th>
					<th data-field="role">Role</th>
					<th data-field="update">Update</th>
				</tr>

			</thead>
			<tbody>
				<c:forEach items="${user}" var="usr">
				<tr>
					<td>${userName}</td>
					<td><strong>${email}</strong></td>
					<td><strong>${mobile}</strong></td>
					<td><select class="form-control defaultpicker">
							<option>Admin</option>
							<option>User</option>
					</select></td>
					<td><button type="button" class="btn btn-primary">Update</button></td>
				</tr>
				</c:forEach>
				<tr>
					<td>${userName}</td>
					<td>${email }</td>
					<td>${mobile}</td>
					<td><select class="form-control defaultpicker">
							<option>Admin</option>
							<option>User</option>
					</select></td>
					<td><button type="button" class="btn btn-primary">Update</button></td>
				</tr>
				<tr>
					<td>${userName}</td>
					<td>${userName}</td>
					<td>${mobile}</td>
					<td><select class="form-control defaultpicker">
							<option>Admin</option>
							<option>User</option>
					</select></td>
					<td><button type="button" class="btn btn-primary">Update</button></td>
				</tr>
			</tbody>
		</table>
	</div>

</body>
</html>