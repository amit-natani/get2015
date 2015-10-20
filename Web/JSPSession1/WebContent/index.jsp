<!DOCTYPE html>
<html>
	<head>
		<title> Registration </title>
		<link rel = "stylesheet" type = "text/css" href = "css/style2.css"/ >
		<script type = "text/javascript" src = "js/registerscript.js"></script>
	</head>
	<body>
		<fieldset>
			<legend> :: Registration :: </legend>
			<form id = "myform" action = "Registration" method = "post">
				<label><b>Enter Name:<span id = "span">*</span></b></label><br/>
				<input id = "name" class = "text" type = "text" name = "name" pattern = "[a-zA-Z]{2,}[a-zA-Z ]{0,}" placeholder = "Enter Name" required/><br/>
				<label><b>Enter UserName:<span id = "span">*</span></b></label><br/>
				<input id = "username" class = "text" type = "text" name = "username" pattern = "[a-z|A-Z|0-9]*" placeholder = "Enter Username" required/><br/>
				<label><b>Enter Email:<span id = "span">*</span></b></label><br/>
				<input id = "email" class = "text" type = "email" name = "email" placeholder = "Enter Email" required/><br/>
				<label><b>Enter Password:<span id = "span">*</span></b></label><br/>
				<input id = "password" class = "text" type = "password" name = "password" placeholder = "Enter Password" required/><br/>
				<label><b>Re-Enter Password:<span id = "span">*</span></b></label><br/>
				<input id = "confirmPassword" class = "text" type = "password" name = "confirmPassword" placeholder = "Re-Enter Password" required/><br/>
				<label><b>Choose State:<span id = "span">*</span></b></label><br/>
				<select class = "text" id = "state" name = "state"  onchange = "cityShow()" required>
					<option value ="">--Select State--</option>
					<option value = "rajasthan">Rajasthan</option>
					<option value = "maharashtra">Maharashtra</option>
					<option value = "bihar">Bihar</option>
					<option value = "punjab">Punjab</option>
				</select><br/>
				<label><b>Choose City:<span id = "span">*</span></b></label><br/>
				<select class = "text" id = "city" name = "city" required>
					<option value ="">--Select City--</option>
				</select><br/>
				<input type = "submit" value = "Submit" id = "submitbutton" onclick = "return validate()"/><br/>
				<label>${a}</label>
			</form>
			<a href = "login.jsp" style = "text-decoration : none;">Already Registered...<b>Log In</b></a>
		</fieldset>
	</body>
</html>
