
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
      pageEncoding="ISO-8859-1"%>
  <%@page isELIgnored="false" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>

     <div class="container mt-5" >

     <h3 class="text-center"> <%  String s = (String) request.getAttribute("header"); %><%=s %> </h3>
     <p>${description}</p>
       <form action="processDetails" method="post">

            <div class="form-group">
              <label for="exampleInputEmail1">Email address</label>
              <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"  name="email">

            </div>

               <div class="form-group">
                          <label for="userFirstName">User First Name</label>
                          <input type="text" class="form-control" id="userFirstName" aria-describedby="emailHelp" name="userFirstName">

                </div>

                 <div class="form-group">
                                          <label for="userLastName">User Last Name</label>
                                          <input type="text" class="form-control" id="userLastName" aria-describedby="emailHelp" name="userLastName">

                                </div>

               <div class="form-group">
                                      <label for="userPassword">User Password</label>
                                      <input type="password" class="form-control" id="userPassword" aria-describedby="emailHelp" name="userPassword">

               </div>

                 <div class="form-group"> <!-- Date input -->
                         <label class="control-label" for="date">Date</label>
                         <input class="form-control" id="bd" name="bd" placeholder="MM/DD/YYY" type="date"/>
                       </div>

          <div class="container text-center" >
                         <button type="submit" class="btn btn-success">Sign Up</button>
          </div>




          </form>
     </div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
  </body>
</html>