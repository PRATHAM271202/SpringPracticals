<!doctype html>
<%@page isELIgnored="false" %>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet"  >
    <script src="<c:url value="/resources/js/script.js"/>"></script>
    <title>Hello, world!</title>
  </head>
  <body>
  <img alt="My image" src="<c:url value="/resources/image/WIN_20240113_09_29_55_Pro.jpg" />">
  <div class="container">
  <div class ="card mx-auto mt-5 bg-secondary" style="width: 50%;">
  <div class ="card-body py-5">
      <h3 class="text-center text-white" style="text-transform:uppercase">${msg}</h3>

                <div class="container text-center">
                  <button type="submit" class="btn btn-success">Click Here to See the details of Users</button>
                </div>



              <div class="container text-center">
                <button type="submit" class="btn btn-success">Click Here to go to the User Login page</button>
              </div>

  </div>
  </div>
  </div>


    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
  </body>
</html>