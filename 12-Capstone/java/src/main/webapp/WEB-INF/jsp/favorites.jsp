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



<c:forEach var="park" items="${ favoriteParks }">

<c:url var="parkImg" value="img/parks/${ park.parkCode.toLowerCase() }.jpg"/>
<c:url var="detailsLink" value="details?code=${ park.parkCode }"/>
<c:set var="code" value="${ park.parkCode }"/>
<a href="${ detailsLink }"><img src="${ parkImg }"/></a>


<p><c:out value="${ park.parkName }"/></p>
<p><c:out value="${ park.state }"/></p>
<p><c:out value="${ park.acreage }"/></p>
<p><c:out value="${ park.elevationInFeet }"/></p>
<p><c:out value="${ park.milesOfTrail }"/></p>
<p><c:out value="${ park.numberOfCampsites }"/></p>
<p><c:out value="${ park.climate }"/></p>
<p><c:out value="${ park.yearFounded }"/></p>
<p><c:out value="${ park.annualVisitorCount }"/></p>
<p><c:out value="${ park.inspirationalQuote }"/></p>
<p><c:out value="${ park.inspirationalQuoteSource }"/></p>
<p><c:out value="${ park.entryFee }"/></p>
<p><c:out value="${ park.parkDescription }"/></p>
<p><c:out value="${ park.numberOfAnimalSpecies }"/></p>

</c:forEach>





</body>
</html>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />