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
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">WebSiteName</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">Page 1</a></li>
      <li><a href="#">Page 2</a></li>
      <li><a href="#">Page 3</a></li>
    </ul>
  </div>
</nav>

<body>


	<div class="container-fluid">
		<div class="row justify-content-center">
			<c:forEach var="park" items="${ parks }">
				<div class="col-4 home-row">
					<c:url var="parkImg"
						value="img/parks/${ park.parkCode.toLowerCase() }.jpg" />
					<c:url var="detailsLink" value="details?code=${ park.parkCode }" />
					<%-- <c:set var="code" value="${ park.parkCode }" /> --%>
					<a href="${ detailsLink }"><img src="${ parkImg }" /></a>
				</div>
				<div class="col-7 home-row home-text">
					<h3><c:out value="${ park.parkName }" /></h3>
					<p><c:out value="${ park.parkDescription }" /></p>
				</div>

			</c:forEach>

		</div>

	</div>

</body>
</html>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />