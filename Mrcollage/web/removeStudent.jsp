<%-- 
    Document   : removeStudent
    Created on : Sep 3, 2021, 3:25:21 AM
    Author     : HP
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%
             
            Connection con;     
 
    
   	  
                                String regno = request.getParameter("id");
   			
   	   			
   	   			 Class.forName("com.mysql.jdbc.Driver");
                                 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mrcollage","root","nh123456");
   	   			 String query = "delete from  student where regno = ?";
   	   	
   	   			PreparedStatement pst = con.prepareStatement(query);
   	   			
   	   	
   	   			pst.setString(1, regno);
   	   			pst.executeUpdate();
	
    %>   
    
    <script>
        
          window.location.replace("viewStudent.jsp");       
        
    </script>
