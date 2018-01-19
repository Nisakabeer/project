<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
  .center {text-align: center; margin-left: auto; margin-right: auto; margin-bottom: auto; margin-top: auto;}

</style>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="container">
  <div class="row">
    <div class="span12">
      <div class="hero-unit center">
          <h1>Page Not Found <small><font face="Tahoma" color="red">Error 404</font></small></h1>
          <br />
          <p>The page you requested could not be found, either contact your webmaster or try again. Use your browsers <b>Back</b> button to navigate to the page you have prevously come from</p>
          <p><b>Or you could just press this neat little button:</b></p>
          <a href="${pageContext.request.contextPath}/" class="btn btn-large btn-info"><i class="icon-home icon-white"></i> Take Me Home</a>
        </div>
        <br />
        <center>
        <img src="${pageContext.request.contextPath}/resources/err.jpg" width="50%" height="50%">
        </center>
        <br />
        <p></p>
        <!-- By ConnerT HTML & CSS Enthusiast -->  
    </div>
  </div>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>