
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
           <div class="card-header bg-primary text-white" >
               <h3 class="d-flex justify-content-center">Current Balance</h3>
               <br>
            </div>
      <div class="card-body">     
  <div class="mb-3">
      
      <ul class="list-group list-group-flush">
    <li class="list-group-item"><h3>Rs: ${blc} </h3></li>
  </ul> 
  </div>
        <div class="d-flex justify-content-center  ">         
  <a href="home.jsp" type="btn" class="btn btn-primary ">BACK</a>
        </div>

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

