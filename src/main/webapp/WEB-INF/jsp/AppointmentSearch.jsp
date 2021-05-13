<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="com.divergentsl.springwebcms.entity.Appointment"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>springwebcms</title>


<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">

<!--  <link rel="stylesheet" href="resources/styles.css">
-->

</head>
<body
	style="background: #fff url(resources/images/Background1.jpg) center center/cover no-repeat fixed;">


	<header>

		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<div class="container-fluid">

				<a class="navbar-brand" href="appointmentmenu">Appointment Menu</a>

				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>

				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">

						<li class="nav-item"><a class="nav-link"
							aria-current="page" href="appointmentinsert">Insert</a></li>

						<li class="nav-item"><a class="nav-link disabled active" href="#">Search</a></li>

						<li class="nav-item"><a class="nav-link" href="appointmentlist">List
								All</a></li>

						<li class="nav-item"><a class="nav-link" href="#">Update</a></li>


					</ul>
					<div class="d-flex">

						<h3>Divergent Software Labs</h3>

					</div>
				</div>
			</div>
		</nav>
	</header>


	<div class="text-center mt-5">
		<form action="appointmentsearch" method="get"
			style="max-width: 480px; margin: auto;">

			<h1 class="h3 mb-3 font-weight-normal">Insert Appointment Data</h1>

			<input type="number" class="form-control" placeholder=" Id"
				name="id" required autofocus>

			<div class="mt-3">
				<button class="btn btn-lg btn-primary btn-block" type="submit">Search</button>
			</div>

		</form>
		
		<% 
			if(request.getAttribute("appointment") != null) {
				
		     Appointment appointment = (Appointment)request.getAttribute("appointment");
		%>

		<div>
			
			<%-- <ul class="list-group list-group-horizontal">
				<li class="list-group-item">Id</li>
				<li class="list-group-item"><%= appointment.getId() %></li>
			</ul> --%>
			
			<ul class="list-group list-group-horizontal">
				<li class="list-group-item">Name</li>
				<li class="list-group-item"><%= appointment.getName() %></li>
			</ul>
			
		</div>
		
		<% } %>

	</div>


</body>
</html>