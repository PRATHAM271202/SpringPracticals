
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="java.util.List" %>
<%@ page import="java.time.LocalDate" %>



<%@page isELIgnored="false" %>
<html>
<body>
<h1><% String h = (String) request.getAttribute("header");%><%=h%></h1>
<p><% String he = (String) request.getAttribute("discription");%><%=he%></p>
<h2>Hello World! pratham here</h2>

<h1> first name  is ${user.userFirstName } </h1>
<h3> last name  is ${user.userLastName} </h3>
<h3> email  is ${user.email} </h3>
<h3> password  is ${user.userPassword} </h3>

<h3> users birthdate is${user.birthDate} </h3>
<h3> prn   is ${user.prnNo} </h3>






</body>
</html>
