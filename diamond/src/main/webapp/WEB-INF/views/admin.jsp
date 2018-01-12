<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Insert title here</title>
<style type="text/css">

/* USER PROFILE PAGE */
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
<div class="container">
<div class="col-lg-10 col-sm-10">
    <div class="card hovercard">
        <div class="card-background">
            <img class="card-bkimg" alt="" src="http://lorempixel.com/100/100/people/9/">
            <!-- http://lorempixel.com/850/280/people/9/ -->
        </div>
        <div class="useravatar">
            <img alt="" src="http://lorempixel.com/100/100/people/9/">
        </div>
        <div class="card-info"> <span class="card-title">ADMIN PAGE</span>

        </div>
    </div>
    <div class="btn-pref btn-group btn-group-justified btn-group-lg" role="group" aria-label="...">
        <div class="btn-group" role="group">
            <button type="button" id="stars" class="btn btn-primary" href="#cat" data-toggle="tab"><span class="glyphicon glyphicon-star" aria-hidden="true"></span>
                <div class="hidden-xs">Category</div>
            </button>
        </div>
        <div class="btn-group" role="group">
            <button type="button" id="favorites" class="btn btn-default" href="#supp" data-toggle="tab"><span class="glyphicon glyphicon-user" aria-hidden="true"></span>
                <div class="hidden-xs">Supplier</div>
            </button>
        </div>
        <div class="btn-group" role="group">
            <button type="button" id="following" class="btn btn-default" href="#prod" data-toggle="tab"><span class="glyphicon glyphicon-star" aria-hidden="true"></span>
                <div class="hidden-xs">Product</div>
            </button>
        </div>
    </div>

        <div class="well">
      <div class="tab-content">
        <div class="tab-pane fade in active" id="cat">
          <div class="row">
		<form id="category" action="saveCategory" method="post" role="form" style="display: block;">
			<div class="form-group">
				<input type="text" name="catname" id="catName" tabindex="2" class="form-control" placeholder="enter category name" required>
			</div>
			<div class="form-group">
				<input type="text" name="catdescription" id="catdescription" tabindex="2" class="form-control" placeholder="about category" required>
			</div>

			<div class="col-sm-6 col-sm-offset-3">
				<input type="submit" name="submit" id="submit" tabindex="4" class="form-control btn btn-submit" value="SUBMIT">
			</div>
		</form>
  
        </div>
        </div>
        <div class="tab-pane fade in" id="supp">
         <div class="row">
    <form id="Supplier" action="saveSupplier" method="post" role="form" style="display: block;">
		<div class="form-group">
			<input type="text" name="SupName" id="SupName" tabindex="2" class="form-control" placeholder="Enter Supplier name">
		</div>
		<div class="form-group">
			<input type="text" name="SupAddress" id="SupAddress" tabindex="2" class="form-control" placeholder="Enter Supplier Address">
		</div>
		<div class="col-sm-6 col-sm-offset-3">
			<input  type="submit" name="submit" id="submit" tabindex="4" class="form-control btn btn-submit" value="SUBMIT">
		</div>
	</form>
        </div>
        </div>
        <div class="tab-pane fade in" id="prod">
          <div class="row">
      <form id="Product" action="saveProduct" method="post" role="form" style="display: block;" enctype="multipart/form-data">
			<div class="form-group">
				<input type="text" name="productname" id="productname" tabindex="2" class="form-control" placeholder="Enter product name">
			</div>

			<div class="form-group">
				<input type="text" name="productDescription" id="productDescription" tabindex="2" class="form-control" placeholder="About the product">
			</div>

			<div class="form-group">
				<input type="number" name="quantity" id="quantity" tabindex="2" class="form-control" placeholder="enter quantity">
			</div>

			<div class="form-group">
				<input type="number" name="price" id="price" tabindex="2" class="form-control" placeholder="enter price">
			</div>

			
<%-- <%-- 
				<div class="form-group">
				    Choose Category: 
     			<select name="cid">
                    <option>SELECT CATEGORY</option>
        			<c:forEach items="${clist }" var="c">
     						 <option value="${c.catId}">${c.catName}</option>
         			 </c:forEach>
                 </select>

               </div>
               
				<div class="form-group">
				    Choose Publisher: 
     			<select name="sid">
                    <option>SELECT SUPPLIER</option>
        			<c:forEach items="${slist }" var="c">
     						 <option value="${c.supId}">${c.supName}</option>
         			 </c:forEach>
                 </select>

               </div>
            <div class="form-group">
					PRODUCT Image
					<input type="file" name="img">
			</div>  --%>
 			<div class="col-sm-4 col-sm-offset-3">
			<input  type="submit" name="submit" id="submit" tabindex="4" class="form-control btn btn-submit" value="SUBMIT">
		</div>
</form>
     </div>   
      </div>
    </div>
    
    </div>
    </div>
            
    <jsp:include page="footer.jsp"></jsp:include>
<script type="text/javascript">
$(document).ready(function() {
	$(".btn-pref .btn").click(function () {
	    $(".btn-pref .btn").removeClass("btn-primary").addClass("btn-default");
	    // $(".tab").addClass("active"); // instead of this do the below 
	    $(this).removeClass("btn-default").addClass("btn-primary");   
	});
	});
</script>
</body>
</html>