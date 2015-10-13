function searchScript1() {	
	document.getElementById("submitSearch").disabled = true;
	document.getElementById("searchMake").innerHTML = "Make";
	document.getElementById("searchModel").innerHTML = "Model";
	document.getElementById("firstList").innerHTML = "<option value = ''>- - Select Make - -</option><option value = 'hyundai'>Hyundai</option><option value = 'maruti'>Maruti</option><option value = 'ford'>Ford</option>";
	document.getElementById("secondList").innerHTML = "<option value = ''>- - Select Model - -</option><option value = 'verna'>Verna</option><option value = 'ciaz'>Ciaz</option><option value = 'figo'>Figo</option>";
}

function searchScript2() {
	document.getElementById("submitSearch").disabled = true;
	document.getElementById("searchMake").innerHTML = "Min Price";
	document.getElementById("searchModel").innerHTML = "Max Price";
	document.getElementById("firstList").innerHTML = "<option value = ''>- - Select Min Price - -</option><option value = '1Lac'>1 Lac</option><option value = '2Lac'>2 Lac</option><option value = '3Lac'>3 Lac</option>";
	document.getElementById("secondList").innerHTML = "<option value = ''>- - Select Max Price - -</option><option value = '3Lac'>3 Lac</option><option value = '4Lac'>4 Lac</option><option value = '5Lac'>5 Lac</option>";

	}
	
function activeSearch() 
{
	var x = document.getElementById("firstList").value;
	var y = document.getElementById("secondList").value;
	if(x != "" && y != "") 
	{
		document.getElementById("submitSearch").disabled = false;
	}
}

function activeLogin() 
{	
	var x = document.getElementById("username").value;
	var y = document.getElementById("password").value;
	if(x != "" && y != "")
	{
		document.getElementById("submitLogin").disabled = false;
	}
}

function validateLogin()
{	
	var flag = false;
	var x = document.getElementById("username").value;
	var y = document.getElementById("password").value;
	if(x=="amitnatani")
	{
		if(y=="8559818925")
		{
			flag = true;
		}
	}
	if(flag == false) {
		alert("Invalid Username or password");
	}
	return flag;
}

function createValidate(flag1) {
	var make = document.getElementById("make").value;
	var model = document.getElementById("model").value;
	var fuelCapacity = document.getElementById("fuelCapacity").value;
	var engineCC = document.getElementById("engineCC").value;
	var mileage = document.getElementById("mileage").value;
	var price = document.getElementById("price").value;
	var roadTax = document.getElementById("roadTax").value;
	var flag = true;
	if(make == "") {
		alert("Make not entered");
		flag = false;
	}
	else if(model == "") {
		alert("Model not entered");
		flag = false;
	}
	else if(engineCC == "") {
		alert("EngineCC not entered");
		flag = false;
	}
	else if(fuelCapacity == "") {
		alert("Fuel Capacity Not entered");
		flag = false;
	}
	else if(mileage == "") {
		alert("Mileage not entered");
		flag = false;
	} 
	else if(price == "") {
		alert("price not entered");
		flag = false;
	}
	else if(roadTax == "") {
		alert("Road tax not entered");
		flag = false;
	}
	else {
		if(flag1) 
			alert("Vehicle created successfully");
		else
			alert("vehicle Edited Successfully");
	}
	return flag;
}
