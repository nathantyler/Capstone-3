<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>details</title>
</head>
<body>


	<c:url var="parkImg"
		value="img/parks/${ park.parkCode.toLowerCase() }.jpg" />
	<img src="${ parkImg }" />

	<p>
		<c:out value="${ park.parkName }" />
	</p>
	<p>
		<c:out value="${ park.state }" />
	</p>
	<p>
		<c:out value="${ park.acreage }" />
	</p>
	<p>
		<c:out value="${ park.elevationInFeet }" />
	</p>
	<p>
		<c:out value="${ park.milesOfTrail }" />
	</p>
	<p>
		<c:out value="${ park.numberOfCampsites }" />
	</p>
	<p>
		<c:out value="${ park.climate }" />
	</p>
	<p>
		<c:out value="${ park.yearFounded }" />
	</p>
	<p>
		<c:out value="${ park.annualVisitorCount }" />
	</p>
	<p>
		<c:out value="${ park.inspirationalQuote }" />
	</p>
	<p>
		<c:out value="${ park.inspirationalQuoteSource }" />
	</p>
	<p>
		<c:out value="${ park.entryFee }" />
	</p>
	<p>
		<c:out value="${ park.parkDescription }" />
	</p>
	<p>
		<c:out value="${ park.numberOfAnimalSpecies }" />
	</p>



	<c:set var="isCelcius" value="${ sessionScope.inCelcius }" />
	<c:url var="celciusFormAction" value="details?code=${ park.parkCode }"></c:url>
	<form action="${ celciusFormAction }" method="POST">

		<input type="radio" name="chooseCelcius" value="${ false }"
			<c:out value="${ isCelcius ? '' : 'checked' }"/>>Fahrenheit 
			<input type="radio" name="chooseCelcius" value="${ true }"
			<c:out value="${ isCelcius ? 'checked' : '' }"/>>Celcius 
			<input type="submit" value="Submit!" />

	</form>

	<c:forEach var="weather" items="${ weathers }">

		<c:url var="weatherImg"
			value="img/weather/${ weather.weatherImgName }.png" />
		<img src="${ weatherImg }" />

		<p>
			<c:out value="${ weather.parkCode }" />
		</p>
		<p>
			<c:out value="${ weather.fiveDayForecastValue }" />
		</p>

		<p>
			<c:out value="${ inCelcius ? weather.lowInC : weather.low }" />
			<c:out value="${ isCelcius ? '° C' : '° F' }" />
		</p>
		<p>
			<c:out value="${ inCelcius ? weather.highInC : weather.high }" />
			<c:out value="${ isCelcius ? '° C' : '° F' }" />
		</p>
		<p>
			<c:out value="${ weather.forecast }" />
		</p>
		<p>
			<c:out value="${ weather.forecastMessage }" />
		</p>
		<p>
			<c:out value="${ weather.temperatureMesage }" />
		</p>

	</c:forEach>

</body>
</html>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />