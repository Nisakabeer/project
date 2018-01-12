<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
 .card {
    margin-top: 20px;
    padding: 30px;
    background-color: rgba(214, 224, 226, 0.2);
    -webkit-border-top-left-radius:5px;
    -moz-border-top-left-radius:5px;
    border-top-left-radius:5px;
    -webkit-border-top-right-radius:5px;
    -moz-border-top-right-radius:5px;
    border-top-right-radius:5px;
    -webkit-box-sizing: border-box;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
}
.card.hovercard {
    position: relative;
    padding-top: 0;
    overflow: hidden;
    text-align: center;
    background-color: #fff;
    background-color: rgba(255, 255, 255, 1);
}
.card.hovercard .card-background {
    height: 130px;
}
.card-background img {
    -webkit-filter: blur(25px);
    -moz-filter: blur(25px);
    -o-filter: blur(25px);
    -ms-filter: blur(25px);
    filter: blur(25px);
    margin-left: -100px;
    margin-top: -200px;
    min-width: 130%;
}
.card.hovercard .useravatar {
    position: absolute;
    top: 15px;
    left: 0;
    right: 0;
}
.card.hovercard .useravatar img {
    width: 100px;
    height: 100px;
    max-width: 100px;
    max-height: 100px;
    -webkit-border-radius: 50%;
    -moz-border-radius: 50%;
    border-radius: 50%;
    border: 5px solid rgba(255, 255, 255, 0.5);
}
.card.hovercard .card-info {
    position: absolute;
    bottom: 14px;
    left: 0;
    right: 0;
}
.card.hovercard .card-info .card-title {
    padding:0 5px;
    font-size: 20px;
    line-height: 1;
    color: #262626;
    background-color: rgba(255, 255, 255, 0.1);
    -webkit-border-radius: 4px;
    -moz-border-radius: 4px;
    border-radius: 4px;
}
.card.hovercard .card-info {
    overflow: hidden;
    font-size: 12px;
    line-height: 20px;
    color: #737373;
    text-overflow: ellipsis;
}
.card.hovercard .bottom {
    padding: 0 20px;
    margin-bottom: 17px;
}
.btn-pref .btn {
    -webkit-border-radius:0 !important;
}


</style>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class=container style="width:50%;">
 <div class="row">
		 <form id="Product" action="updateProduct" method="post" role="form" style="display: block;" enctype="multipart/form-data">
		 <input type="hidden" name="id" value="${p.pid}"/>
			<div class="form-group">
				<input type="text" name="productname" id="productname" tabindex="2" class="form-control" placeholder="Enter product name" value="${p.pname }" required>
			</div>

			<div class="form-group">
				<input type="text" name="productDescription" id="productDescription" tabindex="2" class="form-control" placeholder="About the product" value="${p.description }" required>
			</div>

			<div class="form-group">
				<input type="number" name="quantity" id="quantity" tabindex="2" class="form-control" placeholder="enter quantity" value="${p.stock }" required>
			</div>

			<div class="form-group">
				<input type="number" name="price" id="price" tabindex="2" class="form-control" placeholder="enter price" value="${p.price }" required>
			</div>

			

				<div class="form-group">
				    Choose Category: 
     			<select name="cid">
                    <option>Select Category</option>
        			<c:forEach items="${clist }" var="c">
     						 <option value="${c.cid}">${c.cname}</option>
         			 </c:forEach>
                 </select>

               </div>
               
				<div class="form-group">
				    Choose Supplier: 
     			<select name="sid">
                    <option>Select Supplier</option>
        			<c:forEach items="${slist }" var="s">
     						 <option value="${s.sid}">${s.sname}</option>
         			 </c:forEach>
                 </select>

               </div>
            <div class="form-group">
					Product Image
					<input type="file" name="img">
			</div>
 			 
 			<div class="col-sm-4 col-sm-offset-3">
			<input  type="submit" name="submit" id="submit" tabindex="4" class="form-control btn btn-submit" value="SUBMIT">
		</div>
</form>
		</div>
		</div>
		<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>