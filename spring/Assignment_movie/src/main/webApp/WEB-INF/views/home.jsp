<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
		function setMinMaxDate() {
			var today = new Date();
			var maxDate = new Date();
			maxDate.setDate(today.getDate() + 5); // Set maximum date to 5 days from today
			var datePicker = document.getElementById("m_date");
			datePicker.min = today.toISOString().split("T")[0]; // Set minimum date to today
			datePicker.max = maxDate.toISOString().split("T")[0]; // Set maximum date to 5 days from today
		}
		
		var cost=0;
		if(document.getElementbyId("e_type")){
			cost = num_of_tickets*150;
		}
		else if(document.getElementbyId("p_type")){
			cost = num_of_tickets*250;
		}
		console.log(cost);
	</script>
</head>
<body>

	<form>
		<label>Mobile Number: </label> 
		<input type="number" id="mob_num" placeholder="Enter Phone Number"><br><br> 
		
		<label>Movie Name: </label> 
		<select>
			<option value="s1">screen 1 - Vash</option>
			<option value="s2">screen 2 - tu jhuthi me makkkar</option>
			<option value="s3">screen 3 - selfie</option>
			<option value="s4">screen 4 - KGF 2</option>
		</select><br> <br> 
		
		<label>Show Date: </label> 
		<input type="date" id="m_date"><br> <br> 
		<script>
			var today = new Date();
			var maxDate = new Date(today.getTime() + 5 * 24 * 60 * 60 * 1000);
			var formattedDate = maxDate.toISOString().substring(0, 10);
			document.getElementById("date-input").setAttribute("min", today.toISOString().substring(0, 10));
			document.getElementById("date-input").setAttribute("max", formattedDate);
		</script>
		
		<label>Show Time: </label> 
		<select>
			<option value="time">10:00 AM</option>
			<option value="time">02:30 PM</option>
			<option value="time">06:00 PM</option>
			<option value="time">10.00 PM</option>
		</select><br> <br> 
		
		<label>Ticket Type: </label><br> 
		<input type="radio" id="e_type" name="type" value="Economy">Economy Rs. 150<br> 
		<input type="radio" id="p_type" name="type" value="Platinum">Platinum Rs. 250<br> <br> 
		
		<label>Number of tickets: </label> 
		<input type="number" id="num_of_tickets" placeholder="Enter Number of Tickets"><br><br>

		<button value="check availability">check availability</button><br><br>
		
		<label>Payment Type: </label> 
		<select>
			<option value="mode">cash</option>
			<option value="mode">UPI</option>
			<option value="mode">card</option>
		</select><br><br>
		
		<label>Transaction Number: </label>
		<input type="text" id="t_num" placeholder="Enter Transaction Number"><br><br>
		
		<button value="book_now">Book Now</button>
	</form>

</body>
</html>
