<!-- Write above Java program and print fetched data on another jsp using expression language.
 -->



<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration form</title>
</head>
<body>
<form action="StudentusingEL.jsp" method="post" align="center">

        <label for="">Fname:</label><input type="text" name="Fname">  <br>  <br>         
        <label for="">Lname:</label><input type="text" name="Lname">  <br>  <br>
        <label for="">Email:</label><input type="email" name="Email">  <br>  <br>
        <label for="">password:</label><input type="password" name="Password"> <br>  <br>
        <label for="">mobile:</label><input type="number" name="Mobile"maxlength="10"> <br> <br>
        <label for="">gender:</label><input type="radio" name="Gender" value="Male">Male <input type="radio" name="Gender" value="Female">Female   <br>  <br>
         <input type ="submit" name="submit">


</form>
</body>
</html>

<!-- Write above Java program and print fetched data on another jsp using expression language.
 -->


 
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration form</title>
</head>
<body>


    First Name: ${param.Fname}<br>
    Last Name: ${param.Lname}<br>
    Email: ${param.Email}<br>
    Password: ${param.Password} <br>
    Mobile: ${param.Mobile}<br>
    Gender: ${param.Gender}<br>



</body>
</html>