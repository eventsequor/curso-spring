<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Form</title>
</head>
<body>

	<form:form action="formProcessor" modelAttribute="theStudent">
		<div>
			Name:
			<form:input path="name" />
			<form:errors path="name" style="color: red"/>
		</div>
		<div>
			Last name:
			<form:input path="lastName" />
		</div>
		<div>
			Age:
			<form:input path="age" />
			<form:errors path="age" style="color: red"></form:errors>
		</div>
		<div>
			Email:
			<form:input path="email" />
			<form:errors path="email" style="color: red"></form:errors>
		</div>
		<br />
		<div>
			<div>Elective subjects</div>
			<div>
				<form:select path="elective" multiple="true">
					<form:option value="Design" label="Design"></form:option>
					<form:option value="Math" label="Math"></form:option>
					<form:option value="e-commerce " label="E-commerce"></form:option>
				</form:select>
			</div>
		</div>
		<br />
		<div>
			Choose a city where would you like to study.
			<ul>
				<li>Barcelona <form:radiobutton path="studiestCity"
						value="Barcelona" /></li>
				<li>Bogota <form:radiobutton path="studiestCity" value="Bogota" /></li>
				<li>Santa Marta <form:radiobutton path="studiestCity"
						value="Santa Marta" /></li>
				<li>Medellin <form:radiobutton path="studiestCity"
						value="Medellin" /></li>
			</ul>
		</div>
		<br />
		<div>
			What languages do you want to study?Spanish<br /> Spanish
			<ul>
				<li>Spanish<form:checkbox path="language" value="Spanish" /></li>
				<li>French <form:checkbox path="language" value="French" /></li>
				<li>English <form:checkbox path="language" value="English" /></li>
				<li>Chinese <form:checkbox path="language" value="Chinese" /></li>
			</ul>
		</div>

		<br />
		<div>
			<input type="submit" text="Send" />
		</div>
	</form:form>

</body>
</html>