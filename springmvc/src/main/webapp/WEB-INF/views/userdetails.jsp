
<!DOCTYPE html>
<%@ page import="java.util.List" %>
<%@ page import="springmvc.model.User" %>
<%@ page import="java.time.LocalDate" %>
<html>
<body>
<h2>Hello World! pratham here</h2>
<%

     List<User> names = (List<User>) request.getAttribute("list");
     int i=1;
%>
<%
if(names!=null) {for(User user : names){
%>
 <%
       String mail = user.getEmail();
       String fn = user.getUserFirstName();
       String ln = user.getUserLastName();
       String pwd = user.getUserPassword();
       boolean status = user.isStatus();
       LocalDate bd = user.getBirthDate();
       String pn = user.getPrnNo();
 %>
 <h1> The detail of the user <%=i%> is : </h1>
 <h3> mail of the user is <%=mail%> </h3>
 <h3> first name of the user is <%=fn%> </h3>
 <h3> last name of the user is <%=ln%> </h3>
 <h3> password of the user is <%=pwd%> </h3>
 <h3> status of the user is <%=status%> </h3>
 <h3> birth date of the user is <%=bd%> </h3>
 <h3> prn no of the user is <%=pn%> </h3>

<%
 i++;  }  }
%>
</body>
</html>
