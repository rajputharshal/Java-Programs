<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html lang="en">
<head>
<meta charset="ISO-8859-1">
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Insert title here</title>
<%@include file='component/design.jsp'%>
<style type="text/css">
* {
	padding: 0%;
	margin: 0%;
	box-sizing: border-box;
}

.contain {
	width: 80%;
	margin: auto;
	text-align: center;
}

.card {
	width: 100%;
	margin: auto;
	text-align: center;
	display: inline;
}

.card .card-left {
	width: 65%;
	justify-content: space-between;
	display: flex;
	float: left;
}

.card .card-left .first {
	width: 45%;
	justify-content: space-around;
}

.card .card-left .first .left {
	width: 100%;
	min-height: 100px;
	padding: 10px;
	margin: 10px;
	border-radius: 5px;
	box-shadow: 7px 7px 10px rgb(133, 134, 129);
}

.card .card-left .first .right {
	width: 100%;
	min-height: 100px;
	padding: 10px;
	margin: 10px;
	border-radius: 5px;
	box-shadow: 7px 7px 10px rgb(133, 134, 129);
	border: 0.px solid black;
}

.card .card-left .second {
	width: 45%;
	justify-content: space-around;
}

.card .card-left .second .left {
	width: 100%;
	min-height: 100px;
	padding: 10px;
	margin: 10px;
	border-radius: 5px;
	box-shadow: 7px 7px 10px rgb(133, 134, 129);
	border: 0.px solid black;
}

.card .card-left .second .right {
	width: 100%;
	min-height: 100px;
	padding: 10px;
	margin: 10px;
	border-radius: 5px;
	box-shadow: 7px 7px 10px rgb(133, 134, 129);
	border: 0.px solid black;
}

.card .card-right {
	width: 30%;
	display: flex;
	justify-content: space-around;
	align-items: center;
	float: right;
}

.card .card-right .imgdiv {
	height: auto;
	width: 100%;
	margin-top: 20px;
	border-radius: 10px;
	box-shadow: 7px 7px 10px rgb(133, 134, 129);
}
</style>
</head>
<body>
	<%@include file='component/navbar.jsp'%>
	<div id="carouselExampleFade" class="carousel slide carousel-fade"
		data-bs-ride="carousel">
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="image/doc.jpg" class="d-block w-100" alt="..."
					height="600">
			</div>
			<div class="carousel-item">
				<img src="image/doc3.jpg" class="d-block w-100" alt="..."
					height="600">
			</div>
			<div class="carousel-item">
				<img src="image/hos.jpg" class="d-block w-100" alt="..."
					height="600">
			</div>
		</div>
		<button class="carousel-control-prev" type="button"
			data-bs-target="#carouselExampleFade" data-bs-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Previous</span>
		</button>
		<button class="carousel-control-next" type="button"
			data-bs-target="#carouselExampleFade" data-bs-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Next</span>
		</button>
	</div>
	<div class="contain">
		<h3>KEY FEATURE OF HOSPITAL</h3>

		<div class="card">

			<div class="card-left">
				<div class="first">
					<div class="left">
						<h>100% SAFE</h>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
							Libero reiciendis quos placeat maiores mollitia illum expli</p>
					</div>
					<div class="right">
						<h>100% SAFE</h>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
							Libero reiciendis quos placeat maiores mollitia illum expli</p>
					</div>
				</div>

				<div class="second">
					<div class="left">
						<h>100% SAFE</h>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
							Libero reiciendis quos placeat maiores mollitia illum expli</p>
					</div>
					<div class="right">
						<h>100% SAFE</h>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
							Libero reiciendis quos placeat maiores mollitia illum expli</p>
					</div>
				</div>

			</div>

			<div class="card-right">
				<img class="imgdiv" src="image/doc.jpg" alt="img" />
			</div>

		</div>
	</div>
</body>
</html>