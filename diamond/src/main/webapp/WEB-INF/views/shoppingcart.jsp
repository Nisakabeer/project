<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <style>
 .table>tbody>tr>td, .table>tfoot>tr>td{
    vertical-align: middle;
}
@media screen and (max-width: 600px) {
    table#cart tbody td .form-control{
		width:20%;
		display: inline !important;
	}
	.actions .btn{
		width:36%;
		margin:1.5em 0;
	}
	
	.actions .btn-info{
		float:left;
	}
	.actions .btn-danger{
		float:right;
	}
	
	table#cart thead { display: none; }
	table#cart tbody td { display: block; padding: .6rem; min-width:320px;}
	table#cart tbody tr td:first-child { background: #333; color: #fff; }
	table#cart tbody td:before {
		content: attr(data-th); font-weight: bold;
		display: inline-block; width: 8rem;
	}
	
	
	
	table#cart tfoot td{display:block; }
	table#cart tfoot td .btn{display:block;}
	
}
 </style>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
<div class="container">
<h1>${cmsg }</h1>

	<table id="cart" class="table table-hover table-condensed">
    				<thead>
						<tr>
							<th style="width:50%">Product</th>
							<th style="width:10%">Price</th>
							<th style="width:8%">Quantity</th>
							<th style="width:22%" class="text-center">Subtotal</th>
							<th style="width:10%"></th>
						</tr>
					</thead>
					<tbody>
				
					<c:set var="sum" value="0" />
					 <c:forEach var = "ct" items="${calist }">
						<tr>
							<td data-th="Product">
								<div class="row">
									<div class="col-sm-2 hidden-xs"><img src="${pageContext.request.contextPath}/resources/images/${ct.product.pid}.jpg" alt="..." class="img-responsive"/></div>
									<div class="col-sm-10">
										<h4 class="nomargin">${ct.product.pname}</h4>
										<p>${ct.product.description }</p>
									</div>
								</div>
							</td>
							<td data-th="Price">${ct.product.price }</td>
							<form action="updatecart" method="post">
                           <input type="hidden" name="cid" value="${ct.cartid}"/>
							<td data-th="Quantity">
								<input type="number" class="form-control text-center" value="${ct.cartqnty }" min="1" name="qty">
							</td>
							<td data-th="Subtotal" class="text-center">${ct.product.price*ct.cartqnty}</td>
							<td class="actions" data-th="">  
							
							<c:set var="sum" value="${sum+ (ct.product.price*ct.cartqnty)}"/>
								<button type="submit" class="btn btn-info btn-sm"><i class="fa fa-refresh"></i></button></form>
								<a href="deletecart?id=${ct.cartid }"><button class="btn btn-danger btn-sm"><i class="fa fa-trash-o"></i></button>	</a>
										
							</td>
							
						</tr>
						</c:forEach>
					</tbody>
					<tfoot>
						<tr class="visible-xs">
							<td class="text-center"><strong>Total ${sum }</strong></td>
						</tr>
						<tr>
							<td><a href="./" class="btn btn-warning"><i class="fa fa-angle-left"></i> Continue Shopping</a></td>
							<td colspan="2" class="hidden-xs"></td>
							<td class="hidden-xs text-center"><strong>Total ${sum }</strong></td>
							<td><a href="${pageContext.request.contextPath}/user/shipping" class="btn btn-success btn-block">Checkout <i class="fa fa-angle-right"></i></a></td>
						</tr>
					</tfoot>
				</table>
</div>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>