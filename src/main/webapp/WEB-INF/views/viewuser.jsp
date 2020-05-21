    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<h1>Users List</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>ACCOUNT NO</th><th>NAME</th><th>EMAIL ID</th><th>PANCARD</th><th>ADDRESS</th><th>MOBILE</th><th>BALANCE</th><th>Edit</th><th>Delete</th></tr>
    <c:forEach var="customerDetails" items="${list}"> 
    <tr>
    <td>${customerDetails.accountNo}</td>
    <td>${customerDetails.name}</td>
    <td>${customerDetails.emailId}</td>
    <td>${customerDetails.pancardNo}</td>
    <td>${customerDetails.address}</td>
    <td>${customerDetails.mobileNo}</td>
    <td>${customerDetails.balance}</td>
    <td><a href="edituser/${customerDetails.accountNo}">Edit</a></td>
    <td><a href="deleteuser/${customerDetails.accountNo}">Delete</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
    <a href="registration">Add New Employee</a>
