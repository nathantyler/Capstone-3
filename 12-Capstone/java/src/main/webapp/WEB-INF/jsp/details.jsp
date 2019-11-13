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

	<div class="container-fluid">
		<div class="content">

			<div class="row justify-content-center">
			<div class="col-sm-10">
				<h1 id="detailsName">
					<c:out value="${ park.parkName }" />
				</h1>
				<br/>
				<p id="detailsQuote">
					"<c:out value="${ park.inspirationalQuote }" />
					" -
					<c:out value="${ park.inspirationalQuoteSource }" />
				</p>
				
				
				<c:url var="parkImg"
					value="img/parks/${ park.parkCode.toLowerCase() }.jpg" />
				<img class="park-image" src="${ parkImg }" />
				
				<p>
						<c:out value="${ park.parkDescription }" />
					</p> <br/>
					</div>
					</div>

			<div class="row justify-content-center">
				<div class="col-sm-5">
					<p>
						Location:
						<c:out value="${ park.state }" />
					</p>
					<p>
						Acreage:
						<c:out value="${ park.acreage }" />
					</p>
					<p>
						Elevation:
						<c:out value="${ park.elevationInFeet }" />
						ft.
					</p>
					<p>
						Hiking:
						<c:out value="${ park.milesOfTrail }" />
						miles of trails
					</p>
					<p>
						Number of campsites:
						<c:out value="${ park.numberOfCampsites }" />
					</p>

				</div>
				<!-- col div -->

				<div class="col-sm-5">
				
					<p>
						Climate:
						<c:out value="${ park.climate }" />
					</p>
					<p>
						Founded in:
						<c:out value="${ park.yearFounded }" />
					</p>
					<p>
						Annual Visitors:
						<c:out value="${ park.annualVisitorCount }" />
					</p>

					<p>
						Number of animal Species:
						<c:out value="${ park.numberOfAnimalSpecies }" />
					</p>
					<p>
						Entry Fee: $
						<c:out value="${ park.entryFee }" />
					</p>

				</div>
				<!-- col div -->
			</div>
			<!-- row div -->
			
			

			<c:set var="isCelcius" value="${ sessionScope.inCelcius }" />
			<c:url var="celciusFormAction"
				value="details?code=${ park.parkCode }"></c:url>



			<form action="${ celciusFormAction }" method="POST">

				<input type="radio" name="chooseCelcius" value="${ false }"
					<c:out value="${ isCelcius ? '' : 'checked' }"/>>Fahrenheit
				<input type="radio" name="chooseCelcius" value="${ true }"
					<c:out value="${ isCelcius ? 'checked' : '' }"/>>Celcius <input
					type="submit" value="Submit!" />

			</form>

			<div class="row justify-content-center">


				<c:forEach var="weather" items="${ weathers }">

					<div class="col-sm-2">
						<div class="weathertile">
							<c:url var="weatherImg"
								value="img/weather/${ weather.weatherImgName }.png" />
							<img id="weatherImage" src="${ weatherImg }" />

							<p>
								Low:
								<c:out value="${ inCelcius ? weather.lowInC : weather.low }" />
								<c:out value="${ isCelcius ? '° C' : '° F' }" />
							</p>
							<p>
								High:
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
						</div> <!-- weather tile -->

					</div> <!--  col div -->
				</c:forEach>



			</div> <!-- row div -->
		</div> <!--  content -->
	</div> <!--  container fluid -->
</body>
</html>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />