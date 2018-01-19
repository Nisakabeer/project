<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 
</head>

<body>
<jsp:include page="header.jsp"></jsp:include>

 <div class="row" style="width:100%;">
<c:forEach var = "p" items="${plist }">
 
    
  <div class="col-xs-3"  >
    <div class="thumbnail" >
      <a href="productdetails?id=${p.pid }&cmsg=">
        <img src="${pageContext.request.contextPath}/resources/images/${p.pid}.jpg" >
        <div class="caption">
        
          <p>${p.pname}<br>
    ${p.price}<br></p></a>
        </div>
      
    </div>
  </div>
 
  </c:forEach>
  
</div>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>