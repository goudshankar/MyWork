<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
Current Locale : ${pageContext.response.locale}
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">

<title>Create an account</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>

<body>

	<div class="container">
		<form:form method="POST" modelAttribute="userForm" action="./register"
			class="form-signin">
			<h2 class="form-signin-heading"><spring:message code="label.title" text="default text" /></h2>
			<center>
				<a href="?lang=en">english</a> &nbsp;&nbsp;&nbsp; 
				<a href="?lang=hi">Hindhi</a> &nbsp;&nbsp;&nbsp; 
				<a href="?lang=te">Telugu</a> &nbsp;&nbsp;&nbsp; 
				<a href="?lang=tm">Tamil</a> &nbsp;&nbsp;&nbsp;
			</center><br>
			<div class="form-group" class="col-lg-10 col-sm-12">
				<spring:message code="label.userName" text="default text" /><form:input type="text" path="userName"
					class="form-control input-sm" autofocus="true"></form:input>
				<form:errors path="userName" cssClass="alert-danger" />
			</div>
			<div class="form-group">
				<spring:message code="label.password" text="default text" />
				<form:input type="password" path="password"
					class="form-control input-sm" ></form:input>
				<form:errors path="password" cssClass="alert-danger" />
			</div>
			<div class="form-group">
				<spring:message code="label.confirmPassword" text="default text" /><form:input type="password" path="confirmPassword"
					class="form-control input-sm"></form:input>
				<form:errors path="confirmPassword" cssClass="alert-danger" />
			</div>
			<div class="form-group">
				<spring:message code="label.email" text="default text" /><form:input type="email" path="email" class="form-control input-sm"/>
				<form:errors path="email" cssClass="alert-danger" />
			</div>

			<div class="form-group">
				<spring:message code="label.mobile" text="default text" /><form:input type="text" path="mobile" class="form-control input-sm"
					 />
				<form:errors path="mobile" cssClass="alert-danger" />
			</div>
			<div class="form-group">
				<spring:message code="label.gender" text="default text" />
				<form:radiobutton path="gender" value="Male" />
				Male
				
				<form:radiobutton path="gender" value="Female" />
				Female
				<form:errors path="gender" cssClass="alert-danger" />
			</div>
			<!--Select options  -->
			<div class="form-group">
				<div class="dropdown">
					<!--Drop down -->
					<spring:message code="label.skills" text="default text" />
					<form:select path="skills" items="${test.skills}" itemValue="id"
						itemLabel="name">
					</form:select>
					<form:errors path="skills" cssClass="alert-danger" />
				</div>
			</div>

			<%-- <form:select path="skills" class="required">
						<form:option  value="">Select skills</form:option>
						<form:options items="${skills}" /> --%>

			<!--Date Picker  -->
			<%-- <div class="form-group">
				<!-- Date input -->
				<label class="control-label" for="date"></label>
				<spring:message code="label.dob" text="default text" />
				<form:input class="form-control" id="date" name="date" path="dob"
					 type="date" />
				<form:errors path="dob" cssClass="alert-danger" />

			</div> --%>
			<div class="form-group">
				<button class="btn btn-lg btn-primary btn-block Default input"
					type="submit">Submit</button>
			</div>
		</form:form>
	</div>
	<!-- /container -->
	<%-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script> --%>
</body>
</html>