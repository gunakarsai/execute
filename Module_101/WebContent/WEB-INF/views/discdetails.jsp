 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Discounts</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>product_id</th><th>product_price</th><th>product_discount</th><th>Discount_valid</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="discounts" items="${list}">   
   <tr>  
   <td>${discounts.product_id}</td>  
   <td>${discounts.product_price}</td>  
   <td>${discounts.product_discount}</td>  
	<td>${discounts.discount_valid}</td>
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
