
<!DOCTYPE html>
<%@ page import="java.util.List" %>
<html>
<body>
<h2>Hello World! pratham here</h2>
<%
     String s = (String) request.getAttribute("sname");
     Integer id = (Integer) request.getAttribute("sid");

%>
<h1> name of the pratham is <%=s%> and id is <%=id%>  </h1>

</body>
</html>
