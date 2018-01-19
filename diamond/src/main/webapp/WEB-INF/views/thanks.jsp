<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="container" style="margin-top:5%;">
	<div class="row">
        <div class="jumbotron" style="box-shadow: 2px 2px 4px #000000;">
        <h2>Your Order is placed</h2>
            <h2 class="text-center">Thank you for Shopping with <span style="color:#F89406;"> </span><span style="color:#26A65B;">DIAMOND STORE</span><span style="color:#19B5FE;">......</span></h2>
            <center><div class="btn-group" style="margin-top:50px;">
                <a href="${pageContext.request.contextPath}/" class="btn btn-lg btn-primary">Home</a>
                <a href="${pageContext.request.contextPath}/login" class="btn btn-lg btn-default">Login</a>
            </div></center>
        </div>
	</div>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>