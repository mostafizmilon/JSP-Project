<%-- 
    Document   : index
    Created on : Sep 3, 2021, 1:29:51 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
   
    <style>
body {  
  background-position: center; 
  background-repeat: no-repeat;
  background-size: cover; 
  background-image: url("student.jpg");    
}
</style>
</head>
<body style="padding:150px" >
        
        <div>
	<a href="addStudent.jsp"  class="btn btn-success">Add Student</a>
	<a href="addTeacher.jsp"  class="btn btn-primary">Add Teacher</a>
	<a href="viewStudent.jsp" class="btn btn-warning">View Student</a>
	<a href="viewTeacher.jsp"  class="btn btn-danger">View Teacher</a>
	</div> 
</body>
</html>