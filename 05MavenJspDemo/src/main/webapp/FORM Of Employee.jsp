<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Employee Registration form</h1>
<form action="ReadingForm.jsp" method="get">

		EID: <input type="text" name="id"> <br> 
		Ename: <input type="text" name="name"> <br>
		Fees: <input type="text" name="fees"> <br> 
		<br>
		
		<label for="PERCENTAGE">MERIT OF STUDENT : </label>
	 <select merit="PERCENTAGE" name="percentage">
    <option value="top student"> >90</option>
    <option value="Average student"> 80-90</option>
    <option value="below average student"> 70-80</option>
    <option value="not good"> <40</option>
  </select>
  
  
  <p>Select the gender</p>
  <input type="radio"  name="gender" value="MALE">
  <label for="male">MALE</label><br>
  <input type="radio"  name="gender" value="FEMALE">
  <label for="female">FEMALE</label><br>
  
  

		
		<input type="submit" value="Save">
		<input type="reset">
		
</form>
</body>
</html>