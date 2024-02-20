<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Event Registration Form</h2>
	<form action="EventRegistrationServlet" method="post">
		<label for="eventName">Event Name:</label> <input type="text"
			id="eventName" name="eventName">
			<br>
		<br> 
		<label for="posterImage">Poster Image:</label> <input
			type="file" id="posterImage" name="posterImage">
			<br>
		<br>
		 <label for="bannerImage">Banner Image:</label> <input
			type="file" id="bannerImage" name="bannerImage">
			<br>
		<br>
		 <label for="organizerName">Organizer Name:</label> <input
			type="text" id="organizerName" name="organizerName">
			<br>
		<br>
		 <label for="tech">Tech:</label> <input type="text" id="tech"
			name="tech">
			<br>
		<br>
		 <label for="dateTime">Date & Time:</label> <input
			type="text" id="dateTime" name="dateTime">
			<br>
		<br>
		 <label for="noOfRegistration">Number of
			Registrations:</label> 
			<input type="number" id="noOfRegistration"
			name="noOfRegistration">
			<br>
		<br> 
		<label for="aboutContest">About Contest:</label>
		<textarea id="aboutContest" name="aboutContest"></textarea>
		<br>
		<br>
		 <label for="rulesToFollow">Rules to Follow:</label>
		<textarea id="rulesToFollow" name="rulesToFollow"></textarea>
		<br>
		<br>
		 <label for="rewards">Rewards:</label>
		  <input type="text"
			id="rewards" name="rewards">
			<br>
		<br> 
		<label for="aboutOrganizer">About Organizer:</label>
		<textarea id="aboutOrganizer" name="aboutOrganizer"></textarea>
		<br>
		<br>
		 <label for="rating">Rating:</label> 
		 <input type="number"
			id="rating" name="rating">
			<br>
		<br> 
		<label for="contactDetails">Contact Details:</label>
		<textarea id="contactDetails" name="contactDetails"></textarea>
		<br>
		<br>
		 <label for="founder">Founder:</label> <input type="text"
			id="founder" name="founder"><br>
		<br> 
		<label for="companySize">Company Size:</label> <input
			type="text" id="companySize" name="companySize"><br>
		<br> 
		<label for="industryType">Industry Type:</label> <input
			type="text" id="industryType" name="industryType">
			<br>
		<br> <input type="submit" value="Submit">
	</form>
</body>
</html>