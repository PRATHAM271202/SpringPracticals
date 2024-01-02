
<!DOCTYPE html>
<%@ page import="java.util.List" %>
<html>
<body>
<h2>Hello World! pratham here</h2>
<%
     String s = (String) request.getAttribute("name");
     Integer id = (Integer) request.getAttribute("id");
     List<String> names = (List<String>) request.getAttribute("names");
%>
<h1> name of the pratham is <%=s%> and id is <%=id%>  </h1>
<%
if(names!=null) {for(String str : names){
%>
 <h2><%=str%></h2>
<%
   }  }
%>
</body>
</html>
