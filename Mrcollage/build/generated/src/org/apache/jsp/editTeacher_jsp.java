package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public final class editTeacher_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("<html>\n");
      out.write("    <head>    \n");
      out.write("        <title>Student Registration Form</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write(" \n");
      out.write("        </head>\n");
      out.write(" \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("         ");

             
            Connection con;     
            String msg = "";
            String color = "";
   
    
   	    if(request.getMethod().compareToIgnoreCase("post")==0)
   		{
   			try
   			{
                                String regno = request.getParameter("regno");
   				String tname = request.getParameter("teachername");
   	   			String subject = request.getParameter("subject");
   	   			String address = request.getParameter("address");
   	   			String phone = request.getParameter("phone");
   	   			
   	   			
   	   			 Class.forName("com.mysql.jdbc.Driver");
                                 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mrcollage", "root", "nh123456");
   	   			 String query = "update teacher set teachername = ?, subject= ?, address =? ,phone= ? where regno = ?";
   	   	
   	   			PreparedStatement pst = con.prepareStatement(query);
   	   			
   	   			
   	   			pst.setString(1, tname);
                                pst.setString(2, subject);
   	   			pst.setString(3, address);
   	   			pst.setString(4, phone);
   	   			pst.setString(5, regno);
   	   			pst.executeUpdate();
   	   			
   	   			color = "green";
   	   			msg = "Teacher Updated Succesfully";
   	   			
   	   			
   			}catch(Exception ex){
   				ex.printStackTrace();
   				color = "red";
   				msg = "Error Occured";
   			}
   		}
    
      out.write("    \n");
      out.write(" \n");
      out.write("    <div class=\"form-group col-12 p-0\">\n");
      out.write("        \n");
      out.write("\t<h4 style=\"color:");
      out.print( color );
      out.write('"');
      out.write('>');
      out.print( msg );
      out.write("</h4>\n");
      out.write("\t</div>\n");
      out.write("        \n");
      out.write("        <form id=\"form\" method=\"post\" action=\"editTeacher.jsp\" class=\"form-horizontal\">\n");
      out.write("            \n");
      out.write("             ");
 
                          
                            PreparedStatement pst;
                            ResultSet rs;
 
                            Class.forName("com.mysql.jdbc.Driver");
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mrcollage", "root", "nh123456");
                             
                           String id = request.getParameter("id");
                           
                            pst = con.prepareStatement("select * from teacher where regno = ?");
                            pst.setString(1, id);
                            rs = pst.executeQuery();
                            
                            while(rs.next())
                            {
                    
                    
      out.write("   \n");
      out.write("         \t\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <div  class=\"col-sm-4\"></div>\n");
      out.write("                <div  class=\"col-sm-4\">\n");
      out.write("                    <h2 style=\"text-align: center\">Teacher Details</h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <hr/>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                 <div  class=\"col-sm-4\"></div>\n");
      out.write("                  <div  class=\"col-sm-4 mx-auto\">\n");
      out.write("                  \t<label>Registation No</label>\n");
      out.write("                        <input type=\"text\" name=\"regno\" class=\"form-control\" id=\"regno\" value=\"");
      out.print( rs.getString("regno") );
      out.write("\">\n");
      out.write("                  </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("                 <div  class=\"col-sm-4\"></div>\n");
      out.write("                  <div  class=\"col-sm-4 mx-auto\">\n");
      out.write("                  \t<label >Teacher Name</label>\n");
      out.write("  \t\t\t<input type=\"text\" name=\"teachername\" class=\"form-control\" id=\"teachername\"  value=\"");
      out.print( rs.getString("teachername") );
      out.write("\">\n");
      out.write("                  </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("                 <div  class=\"col-sm-4\"></div>\n");
      out.write("                  <div  class=\"col-sm-4 mx-auto\">\n");
      out.write("                  \t<label>Subject</label>\n");
      out.write("  \t\t\t\t\t<input type=\"text\" name=\"subject\" class=\"form-control\" id=\"course\" value=\"");
      out.print( rs.getString("subject") );
      out.write("\">\n");
      out.write("                  </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("                            <div  class=\"col-sm-4\"></div>\n");
      out.write("                            <div  class=\"col-sm-4 mx-auto\">\n");
      out.write("                                        <label>Address:</label>\n");
      out.write("  \t\t\t\t\t<input type=\"text\" name=\"address\" class=\"form-control\" id=\"address\" value=\"");
      out.print( rs.getString("address") );
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("            \n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("                            <div  class=\"col-sm-4\"></div>\n");
      out.write("                            <div  class=\"col-sm-4 mx-auto\">\n");
      out.write("                                    <label>Phone</label>\n");
      out.write("  \t\t\t\t    <input type=\"text\" name=\"phone\" class=\"form-control\" id=\"phone\" value=\"");
      out.print( rs.getString("phone") );
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\n");
      out.write("            <br/>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\" align=\"right\">\n");
      out.write("             \n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <div class=\"col-sm-2\">\n");
      out.write("                        <Button class=\"btn btn-success\" style=\"width: 80px;\">Submit</Button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("             ");
 } 
      out.write("\n");
      out.write("        </form>\n");
      out.write("        <div class=\"col-sm-12\"  align=\"right\">\n");
      out.write("            <a href=\"index.jsp\"><Button class=\"btn btn-success\" style=\"width: 80px;\">Home</Button></a>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
