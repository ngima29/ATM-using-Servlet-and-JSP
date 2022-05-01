<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link href="css/style.css" rel="stylesheet" type="text/css"/>
    <script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script>
    
        
  </head>
  <body>
      <!--navber-->
      <%@include file="navbar.jsp" %>
    <!--Home page-->
    <div class="container-fluid p-0 m-0">
        <div class="jumbotron bg-primary text-white bg_line">
            <div class="container p-5">
                <div class="d-flex justify-content-center m-5 p-5 ">
                <h1>Welcome To Hamro Bank </h1>
              
                </div>
                 
                <a href="login.jsp" class="btn btn-outline-light btn-lg"> <span class="fa fa-check-square fa-spin"> </span> Login</a>
                <a href="register.jsp" class="btn btn-outline-light btn-lg"> <span class="fa fa-address-card fa-spin"> </span> Sign up </a>
            </div>
    
        </div>
        
    </div>
    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    <script src="js/myjs.js" type="text/javascript"></script>
    
  </body>
</html>