<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
 rel="stylesheet">
 
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<script src="<c:url value="/resources/js/random.js" />"></script>
</head>
<body>







 <div class="container">
  <div class="col-md-offset-1 col-md-10">
   <h3 class="text-center">ADMIN</h3>
   <hr />
      

   <input type="button" value="REQUEST"
    onclick="window.location.href='adminreq'; return false;"
    class="btn btn-primary" /> 
    <input type="button" value="ACCEPTED REQUEST"
    onclick="window.location.href='adminaccept'; return false;"
    class="btn btn-primary" /> <br />
   <br />
   <div class="panel panel-info "  style="width:300%">
    <div class="panel-heading">
     <div class="panel-title">Customer List</div>
    </div>
    <div class="panel-body " >
    
    
     <table class="table table-striped table-bordered">
      <tr>
       <th>Title</th>
       <th>First Name</th>
       <th>Middle Name</th>
       <th>Last Name</th>
       <th>Father's Name</th>
       <th>Phone No</th>
       <th>Email ID</th>
       <th>Aadhar Number</th>
       <th>DOB</th>
       
       <th>Residential Address Line 1</th>
       <th>Residential Address Line 2</th>
       <th>Residential Landmark</th>
       <th>Residential City</th>
       <th>Residential State</th>
       <th>Residential Pincode</th>
       
       <th>Permanent  Address Line 1</th>
       <th>Permanent  Address Line 2</th>
       <th>Permanent  Landmark</th>
       <th>Permanent  City</th>
       <th>Permanent  State</th>
       <th>Permanent  Pincode</th>
       
       <th>Occupation Type</th>
       <th>Source of Income</th>
       <th>Gross Annual Income </th>
       <th>Account number</th>
       <th>Action</th> 
      
      </tr>
      

      <!-- loop over and print our customers -->
      <c:forEach var="tempCustomer" items="${customers}">
           <!-- construct an "update" link with customer id -->
       <c:url var="acceptLink" value="/admin/sendMail">
        <c:param name="accNo" value="${tempCustomer.accNo}" />
         <c:param name="mail" value="${tempCustomer.email}" />
           <c:param name="fName" value="${tempCustomer.fName}" />
       </c:url>

       <!-- construct an "delete" link with customer id -->
       <c:url var="rejectLink" value="/admin/deleteform">
        <c:param name="accNo" value="${tempCustomer.accNo}" />
       </c:url>
       <tr>
        <td>${tempCustomer.title}</td>
		<td>${tempCustomer.fName}</td>
		<td>${tempCustomer.mName}</td>
		<td>${tempCustomer.lName}</td>
        <td>${tempCustomer.faName}</td>
        <td>${tempCustomer.phno}</td>
        <td>${tempCustomer.email}</td>
        <td>${tempCustomer.aadharNo}</td>
        <td>${tempCustomer.dob}</td>
        <td>${tempCustomer.resaddrline1}</td>
        <td>${tempCustomer.resaddrline2}</td>       
        <td>${tempCustomer.reslandmark}</td>
        <td>${tempCustomer.rescity}</td>
        <td>${tempCustomer.resstate}</td>
        <td>${tempCustomer.respincode}</td>
        <td>${tempCustomer.addrline1}</td>
        <td>${tempCustomer.addrline2}</td>       
        <td>${tempCustomer.landmark}</td>
        <td>${tempCustomer.city}</td>
        <td>${tempCustomer.state}</td>
        <td>${tempCustomer.pincode}</td>
        <td>${tempCustomer.occtype}</td>
        <td>${tempCustomer.sourceofincome}</td>
        <td>${tempCustomer.gaincome}</td>
         <td>${tempCustomer.accNo}</td>
        
   


       <td>
         
         <a href="${acceptLink}">Accept</a>|
         
           <!-- onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false" -->
          <a href="${rejectLink}">Reject</a>
        </td> 
         		 </tr>
        
      </c:forEach>
      
       
     </table>	



    </div>
   </div>
  </div>

 </div>
 
 
</body>

<footer class="page-footer font-small blue">
  <div class="footer-copyright text-center py-3">© 2019 Sicuro:
    
  </div>
 </footer>
</html>