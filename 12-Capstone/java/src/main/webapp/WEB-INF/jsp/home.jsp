<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<c:import url="/WEB-INF/jsp/common/header.jsp" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home</title>
</head>


<body>


	<div class="container-fluid">
	<div class="content">
		<div class="row justify-content-center">
			<c:forEach var="park" items="${ parks }">
				<div class="col-sm-5 home-row">
					<c:url var="parkImg"
						value="img/parks/${ park.parkCode.toLowerCase() }.jpg" />
					<c:url var="detailsLink" value="details?code=${ park.parkCode }" />
					<%-- <c:set var="code" value="${ park.parkCode }" /> --%>
					<a href="${ detailsLink }"><img class="park-image" src="${ parkImg }" /></a>
				</div>
				<div class="col-sm-7 home-row home-text">
					<h1><c:out value="${ park.parkName }" /></h3>
					<p>Location: <c:out value="${ park.state }" /></p>
					<p><c:out value="${ park.parkDescription }" /></p>
				</div>

			</c:forEach>
</div>
		</div>

	</div>

</body>
</html>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />