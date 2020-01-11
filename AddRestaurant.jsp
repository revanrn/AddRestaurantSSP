<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RESTAURANT DETAILS</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	rel="stylesheet">

<style>
.middle {
	margin-top: 50%;
	margin-left: 40%;
	margin-right: 20%;
}

.imgAlign {
	margin-top: 50px;
	margin-left: 200px;
	margin-right: 200px;
}

body {
	background: linear-gradient(to bottom, rgba(0, 0, 0, 0.9),
		rgba(0, 0, 0, 0.6), rgba(0, 0, 0, 0.7), rgba(0, 0, 0, 1)),
		url(back2.jpg) no-repeat;
	width: 100%;
	background-size: cover;
	color: white;
	font-family: sans-serif;
}

}
.imgAlign1 {
	align: center;
}
</style>
</head>
<body>
	<form onsubmit="return submitform()" action="/addRestaurant">
		<div align="center">
			<!--<h1><b>LimeTray</b></h1>
<h4><b>Food Delivery App</b></h4><br/><br/><br/>-->
			<h2 style="font-family: seriff; font-size: 25">
				<b>RESTAURANT DETAILS</b>
			</h2>
			<br /> Restaurant Id: <input type="text" name="restaurantId"
				oninput=nameValidation(this) required autofocus />&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp; Restaurant Name: <input type="text"
				name="restaurantName" required />&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp; Route Id: <input type="text" name="routeId"
				oninput=nameValidation(this) required autofocus /> <br />
			<br />
			<span id="err" class="error"></span> <br /><br /><b>Category: <select name="category"
				required>
					<option value="">Select...</option>
					<option value="APPETIZERS" name="category">APPETIZERS</option>
					<option value="MAIN COURSE" name="category">MAIN COURSE</option>
					<option value="DESSERT" name="category">DESSERT</option>
			</select> <br />
			<br /> <b>From:<select name="from" id="from1" required>
						<option value="">Select...</option>
						<option value="BANGLORE" name="from">BANGLORE</option>
						<option value="COIMBATORE" name="from">COIMBATORE</option>
						<option value="KOCHI" name="from">KOCHI</option>
				</select>
			</b> &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; 
			<b>To:<select name="to" id="to1" required>
						<option value="">Select...</option>
						<option value="BANGLORE" name="to">BANGLORE</option>
						<option value="COIMBATORE" name="to">COIMBATORE</option>
						<option value="KOCHI" name="to">KOCHI</option>
				</select>
			</b><br /><span id="error1"></span><br /><br />




				<div align="center" class="imgAlign">
					Item 1: <input type="text" name="foodName" required />&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp; Price: <input type="text" name="price"
						oninput=nameValidation1(this) required /><br />
					<br /> Item 2: <input type="text" name="foodName1" required />&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp; Price: <input type="text" name="price1"
						oninput=nameValidation1(this) required /><br />
					<br /> Item 3: <input type="text" name="foodName2" required />&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp; Price: <input type="text" name="price2"
						oninput=nameValidation1(this) required /><br />
					<br /> <span id="error"></span><br /><br />
					<br /> <b>Stops: <select name="stopName" required>

							<option value="">Select...</option>
							<option name="stopName" value="BANGLORE">BANGLORE</option>
							<option name="stopName" value="COIMBATORE">COIMBATORE</option>
							<option name="stopName" value="KOCHI">KOCHI</option>
					</select>
					</b> </br>
					</br> <input type="submit" value="ADD RESTAURANT" /> <input type="reset"
						value="Cancel" />
				</div>
				</center>
	</form>
	${msg}
	<script>
		function nameValidation(ele) {
			var userValue = ele.value;
			var namePattern = "^[0-9]+$";

			if (!userValue.match(namePattern))

				document.getElementById("err").innerHTML = "Should contain only numbers";

			else
				document.getElementById("err").innerHTML = "";
		}
		function nameValidation1(ele) {
			var userValue = ele.value;
			var namePattern = "^[0-9]+$";

			if (!userValue.match(namePattern))

				document.getElementById("error").innerHTML = "Should contain only numbers";
				
			else
				document.getElementById("error").innerHTML = "";
		}
		

		function submitform(){
			var x=nameValidation1();
			var y = nameValidation1();
			if(x && y)
				return true;
			else
				return false;
			}
	</script>
</body>
</html>