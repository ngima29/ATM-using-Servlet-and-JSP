
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
      <!--login form-->
        <main class="d-flex align-items-center bg-primary  bg_line" style="height: 80vh">
 <div class="container">
   <div class="row">
     <div class="col-md-4 offset-md-4">
       <div class="card" >
           <div class="card-header bg-primary text-white text-center">
               <span class="fa fa-user-plus fa-3x"></span>
               <h1 class="d-flex justify-content-center">Login</h1>
               <br>
            </div>
      <div class="card-body">
          <form action="login" method="POST">
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Account Number</label>
    <input type="number" class="form-control" id="exampleInputEmail1" name="Lacnum" required>
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Pin Number</label>
    <input type="number" class="form-control" id="exampleInputPassword1" name="Lpin" required>
  </div>
        <div class="d-flex justify-content-center">         
  <button type="submit" class="btn btn-primary ">Submit</button>
        </div>
        <a href="#">sign up </a>
</form>
  </div>
</div>
  </div>         
 </div>
 </div>
      </main>
        
        
     <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    <script src="js/myjs.js" type="text/javascript"></script>
    </body>
</html>
