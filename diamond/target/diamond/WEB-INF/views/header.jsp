<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="description" content="">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">DIAMOND STORE</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="./">Home</a></li>
      <li><a href="#">Admin</a></li>
      <li><a href="#">Product</a></li>
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Catogery
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
        <li><a href="ring">Ring</a></li>
          <li><a href="#">Earrings</a></li>
          <li><a href="#">Pendant</a></li>
          <li><a href="#">Neklaces</a></li>
          <li><a href="#">Bracelets</a></li>
          <li><a href="#">Bangles</a></li>
          
    </ul>
    <li>
    <form class="navbar-form navbar-left" action="#">
  <div class="input-group">
    <input type="text" class="form-control" placeholder="Search">
    <div class="input-group-btn">
      <button class="btn btn-default" type="submit">
        <i class="glyphicon glyphicon-search"></i>
      </button>
    </div>
  </div>
</form>
    </li>
    
      <li>&nbps;&nbps;&nbps;&nbps;&nbps;</li>
      <li><a href="register" ><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      <li>&nbps;</li>
    </ul>
    <p> </p>
    <p>
    
    <button type="button" class="btn btn-default btn-sm">
    <span class="glyphicon glyphicon-shopping-cart"></span> <a href="shoppingcart" >Shopping Cart</a>
    </button>
    </p>
  </div>
</nav>

</body>
</html>