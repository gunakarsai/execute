<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="saveProduct" method="post">
		<input type="text" placeholder="product_id" name="id">
		<input type="text" placeholder="product_price" name="price">
		<input type="text" placeholder="product_discount" name="discount">
		<input type="text" placeholder="product_valid" name="discount_valid_month">
		<input type="submit" value="submit">
	</form>
</body>
</html>