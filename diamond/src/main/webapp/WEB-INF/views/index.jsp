<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>

<body>
<jsp:include page="header.jsp"></jsp:include>
${msg}

<div id="myCarousel" class="carousel slide" data-ride="carousel">
<ol class="carousel-indicators">
<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
<li data-target="#myCarousel" data-slide-to="1" class="active"></li>
<li data-target="#myCarousel" data-slide-to="2" class="active"></li>
</ol>
<div class="carousel-inner">

<div class="item active">
<img class="img-rounded" class="img-responsive center-block" src="${pageContext.request.contextPath}/resources/d2.jpg" style="width:100%;">
</div>
<div class="item">
<img class="img-rounded" class="img-responsive center-block" src="${pageContext.request.contextPath}/resources/d1.jpg" style="width:100%;">
</div>
<div class="item">
<img class="img-rounded" class="img-responsive center-block" src="${pageContext.request.contextPath}/resources/d4.jpg" style="width:100%;">
</div>

</div>

<a class="left carousel-control" href="#myCarousel" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
    <span class="sr-only">Next</span>
  </a>
  </div>
  
  
  <div class="row">
  <div class="col-md-4">
    <div class="thumbnail">
      <a href="./resources/b.jpg">
        <img src="./resources/b.jpg" style="width:100%">
        <div class="caption">
          <p>Earrings collections...</p>
        </div>
      </a>
    </div>
  </div>
  <div class="col-md-4">
    <div class="thumbnail">
      <a href="./resources/d.jpg">
        <img src="./resources/d.jpg" style="width:100%">
        <div class="caption">
          <p>Cute Chains...</p>
        </div>
      </a>
    </div>
  </div>
  <div class="col-md-4">
    <div class="thumbnail">
      <a href="./resources/f.jpg">
        <img src="./resources/f.jpg" style="width:100%">
        <div class="caption">
          <p>Rings...</p>
        </div>
      </a>
    </div>
  </div>
  
</div>
  
  
 <jsp:include page="footer.jsp"></jsp:include> 
</body>

</html>
