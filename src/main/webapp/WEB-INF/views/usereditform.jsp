<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<h1>Edit user</h1>
       <form:form method="PUT" action="/editsave">  
      	<table >  
         <tr>  
          <td>Name : </td> 
          <td><form:input path="name"  /></td>
         </tr>  
         <tr>  
          <td>Email ID :</td>  
          <td><form:input path="emailId" /></td>
         </tr> 
         <tr>  
          <td>Password :</td>  
          <td><form:input path="password" /></td>
         </tr> 
         <tr>  
          <td>Pan Card : </td> 
          <td><form:input path="pancardNo"  /></td>
         </tr>  
         <tr>  
          <td>Address :</td>  
          <td><form:input path="address" /></td>
         </tr> 
         <tr>  
          <td>Mobile Number :</td>  
          <td><form:input path="mobileNo" /></td>
         </tr> 
          <tr>  
          <td>Balance :</td>  
          <td><form:input path="balance" /></td>
         </tr> 
         <tr>  
          <td> </td>  
           <td><input type="submit" value="Edit&Save" /></td>  
         </tr>  
        </table>  
       </form:form>  
