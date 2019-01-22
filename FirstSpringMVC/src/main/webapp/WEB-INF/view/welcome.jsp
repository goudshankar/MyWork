<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Login page</title>
		<link href="<c:url value='/resources/css/bootstrap.css' />"  rel="stylesheet"></link>
		<link href="<c:url value='/resources/css/app.css' />" rel="stylesheet"></link>
		<link rel="stylesheet" type="text/css" href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.css" />
	</head>

	<body>
	<c:url var="adminUrl" value="/admin" />
	
		<div id="mainWrapper">
			<div class="login-container">
				<div class="login-card">
				<a href="${adminUrl}">Admin URL</a>
					<div class="login-form">
						
	
							<div class="input-group input-sm">
								<label class="input-group-addon" for="username">User Name</label>
								<input type="text" class="form-control" id="userName" value="${userDetails.getUserName()}" name="userName" placeholder="Enter Username" required>
							</div>
							<div class="input-group input-sm">
								<label class="input-group-addon" for="Email">Email Address</i></label>
								<input type="text" class="form-control" id="userName" value="${userDetails.getEmail()}" name="userName" placeholder="Enter Username" required>
							</div>
							<div class="input-group input-sm">
								<label class="input-group-addon" for="username">Mobile Number</i></label>
								<input type="text" class="form-control" id="userName" value="${userDetails.getMobile()}" name="userName" placeholder="Enter Username" required>
							</div>
							<div class="input-group input-sm">
								<label class="input-group-addon" for="username">Gender</i></label>
								<input type="text" class="form-control" id="userName" value="${userDetails.getGender()}" name="userName" placeholder="Enter Username" required>
							</div>
							<div class="input-group input-sm">
								<label class="input-group-addon" for="username">DOB</i></label>
								<input type="text" class="form-control" id="userName" value="${userDetails.getDob()}" name="userName" placeholder="Enter Username" required>
							</div>
							<div class="input-group input-sm">
								<label class="input-group-addon" for="username">Skills</i></label>
								<input type="text" class="form-control" id="userName" value="${userDetails.getSkills().name}" name="userName" placeholder="Enter Username" required>
							</div>
							
					
					</div>
				</div>
			</div>
		</div>

	</body>
</html>