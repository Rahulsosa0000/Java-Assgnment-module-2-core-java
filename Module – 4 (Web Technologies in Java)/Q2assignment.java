/*Write a Java program to submit student information (fname, lname, email, mobile, gender, password) 
 * using jsp form to servlet.
 */

package com.assignment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/aaa")
public class Q2assignments extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
             
		PrintWriter out=res.getWriter();
		
		String fname=req.getParameter("Fname");
		String lname=req.getParameter("Lname");
		String email=req.getParameter("Email");
		String password=req.getParameter("Password");
		String number=req.getParameter("Mobile");
		String gender=req.getParameter("Gender");
		
		    out.println("First Name: " + fname);
	        out.println("Last Name: " + lname);
	        out.println("Email: " + email);
	        out.println("Password: " + password);
	        out.println("Mobile: " + number);
	        out.println("Gender: " + gender);
	     
	}

}


// student jsp page 

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration form</title>
</head>
<body>
<form action="aaa" method="post" align="center">

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