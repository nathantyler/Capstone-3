<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<c:url value="/css/site.css" var="cssHref" />
<link rel="stylesheet" href="${ cssHref }">
<meta charset="ISO-8859-1">
<title>National Park Enthusiast</title>
</head>
<c:url var="homeUrl" value="/" />
<c:url var="surveyUrl" value="survey" />


	<nav class="navbar navbar-default">
		<ul class="nav navbar-nav">
			<li><a href="${ homeUrl }">Home Page</a></li>
			<li><a href="${ surveyUrl }">Survey</a></li>
		</ul>

	</nav>




</html>