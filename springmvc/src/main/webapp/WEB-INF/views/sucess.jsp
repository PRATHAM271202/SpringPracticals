
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="java.util.List" %>



<%@page isELIgnored="false" %>
<html>
<body>
<h1><% String h = (String) request.getAttribute("header");%><%=h%></h1>
<p><% String he = (String) request.getAttribute("discription");%><%=he%></p>
<h2>Hello World! pratham here</h2>

<h1> name of the candidate is ${user.userName } and mail is ${user.email}  </h1>
<h3> password is ${user.userPassword} </h3>


</body>
</html>
