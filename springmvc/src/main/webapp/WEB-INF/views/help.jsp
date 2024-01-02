

<%@ page import="java.util.List" %>



<%@page isELIgnored="false" %>
<html>
<body>
<h2>Hello World! pratham here</h2>

<h1> name of the pratham is ${sname } and id is ${sid}  </h1>
<h3> list is ${snames} </h3>
<c:forEach var="item" items="${snames}">
    <h1>${item}</h1>
</c:forEach>

</body>
</html>
