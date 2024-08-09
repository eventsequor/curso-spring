<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student registration confirmation</title>
</head>
<body>

	<h3>Registration status</h3>
	<div>
		<div>
			The student with name: <strong>${theStudent.name}</strong> and last
			name: <strong>${theStudent.lastName}</strong>
		</div>
		<div>Was registred success</div>
		<div>
			The subject selected was <strong>${theStudent.elective}</strong>
		</div>
		<div>The city where the student is going to start to study is: <strong>${theStudent.studiestCity}</strong></div>
		<div>The languages the student is going to practice and learn are: <strong>${theStudent.language}</strong></div>
		<div>The age of the student is: <strong>${theStudent.age}</strong></div>
		<div>The student email is: <strong>${theStudent.email}</strong></div>
	</div>

</body>
</html>