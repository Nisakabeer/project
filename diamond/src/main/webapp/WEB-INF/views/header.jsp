<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
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
      <li class="active"><a href="${pageContext.request.contextPath}/">Home</a></li>
      <c:if test="${pageContext.request.userPrincipal.name  == 'admin123@gmail.com'}">
      <li><a href="${pageContext.request.contextPath}/admin">Admin</a></li>
      </c:if> 
             <c:if test="${pageContext.request.userPrincipal.name  != 'admin123@gmail.com'}">
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Catogery
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
        <c:forEach items="${clist }" var="c">
        
     					<li><a href="productBycat?id=${c.cid}">${c.cname}</a></li>
         			 </c:forEach>
       
          
    </ul>
    </li>
    </c:if>
           
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
    
    </ul>
    
      <ul class="nav navbar-nav navbar-right">
       <c:if test="${pageContext.request.userPrincipal.name == null }">
      <li>
      
      <a href="register" ><span class="glyphicon glyphicon-user"></span> Sign Up</a>
      </li>
      </c:if>
      <c:if test="${pageContext.request.userPrincipal.name == null }">
      <li>
      
      <a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </c:if>
       <li>  
            <c:if test="${pageContext.request.userPrincipal.name  != null}">
					<li><a>Welcome: ${pageContext.request.userPrincipal.name}</a></li>
					<li><a href='<c:url value="/j_spring_security_logout" />'>Logout</a></li>
				</c:if>
            </li>  
      <li>
    
    <p> </p>
    <p>
    <c:if test="${pageContext.request.userPrincipal.name != null && pageContext.request.userPrincipal.name  != 'admin123@gmail.com'}">
    <button type="button" class="btn btn-default btn-sm">
    <span class="glyphicon glyphicon-shopping-cart"></span> <a href="${pageContext.request.contextPath}/user/Cart?cmsg=" >Shopping Cart</a>
    </button>
    </c:if>
    </p>
    </ul>
  </div>
</nav>

</body>
</html>