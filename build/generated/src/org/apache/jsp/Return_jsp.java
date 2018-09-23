package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import allclasses.IssueBook;
import java.sql.ResultSet;
import java.sql.Statement;
import allclasses.Book;
import allclasses.Student;
import allclasses.DBConnect;
import java.sql.SQLException;
import java.util.ArrayList;

public final class Return_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head runat=\"server\">\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("    <title>LMS</title>\n");
      out.write("    <script\n");
      out.write("        src=\"https://code.jquery.com/jquery-3.2.1.min.js\" integrity=\"sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=\" crossorigin=\"anonymous\">\n");
      out.write("    </script>\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"css/Custom-Cs.css\" rel=\"stylesheet\" />\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function myfunction() {\n");
      out.write("            $(\"#btnCart\").click(function myfunction() {\n");
      out.write("                window.location.href = \"/Cart.aspx\";\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("    <asp:ContentPlaceHolder ID=\"head\" runat=\"server\">\n");
      out.write("    </asp:ContentPlaceHolder>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("  <body>\n");
      out.write("      \n");
      out.write("\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      <h4>Login</h4>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"form-horizontal\">\n");
      out.write("            <h1></h1>\n");
      out.write("             <hr />\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("             \n");
      out.write("      \n");
      out.write("        <form id=\"form1\" runat=\"server\">\n");
      out.write("        <div>\n");
      out.write("            <!-- Navbar -->\n");
      out.write("            <div class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <a class=\"navbar-brand\" href=\"#\"><span>\n");
      out.write("                            <img alt=\"Logo\" src=\"images\\logo.png\" height=\"30\" /></span>  Library Management System</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"navbar-collapse collapse\">\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                            <li><a href=\"#\">Home</a></li>\n");
      out.write("                            \n");
      out.write("                            <li><a href=\"Issue2.jsp\">Issue Book</a></li>\n");
      out.write("                            <li><a href=\"Return.jsp\">Return Book</a></li>\n");
      out.write("                            <li><a href=\"#\">Add Book</a></li>\n");
      out.write("                            <li><a href=\"#\">Add Student</a></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Navbar End -->\n");
      out.write("                        <!-- Navbar End -->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <asp:ContentPlaceHolder ID=\"ContentPlaceHolder1\" runat=\"server\">\n");
      out.write("                </asp:ContentPlaceHolder>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"form-horizontal\">\n");
      out.write("            <h2>Return Book</h2>\n");
      out.write("             <hr />\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("     <div class=\"row\">\n");
      out.write("        <div class=\"col-md-6 col-md-offset-3\">\n");
      out.write("            <form action=\"IssueServlet\" method=\"GET\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <label for=\"exampleInputEmail1\">Book ID</label>\n");
      out.write("                  <input type=\"text\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Book Id\"name=\"bookId\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <label for=\"exampleInputPassword1\">Student Id</label>\n");
      out.write("                  <input type=\"text\" name=\"studentId\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Student Id\">\n");
      out.write("                 \n");
      out.write("                </div>  \n");
      out.write("                   \n");
      out.write("                      \n");
      out.write("                <button type=\"submit\" Class=\"btn btn-success\" name=\"button\" value=\"returnbtn\">Return Book</button>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div> \n");
      out.write("    \n");
      out.write("    <hr />\n");
      out.write("    \n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"form-horizontal\">\n");
      out.write("            <h3>All Books</h3>\n");
      out.write("             <hr />\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-6 col-md-offset-3\">\n");
      out.write("            <table class=\"table table-striped\" >\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><b>Book Id</b></td>\n");
      out.write("                        <td><b>Student Id</b></td>\n");
      out.write("                        <td><b>Date</b></td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                ");

                    String search ="";
                    ArrayList<IssueBook> ibookList = new ArrayList<IssueBook>();
                            String query;
                            String ret = "no";
                            if(search.equals("")){
                                query = "select * from issue where returned = '"+ret+"'";
                            }
                            else{
                                query = "select * from issue where returned = '"+ret+"' and studentid like '"+search+"%' order by studentid;";
                            }

                            Statement statement = null;
                            ResultSet result=null;
                            try {
                                statement = DBConnect.getConnection().createStatement();
                                result = statement.executeQuery(query);
                                        //result.next();
                                IssueBook ibook;

                                while(result.next()){
                                    ibook = new IssueBook(
                                                       result.getInt("bookid"),
                                                       result.getString("studentid"),
                                                       result.getString("date"),
                                                       result.getString("returned")         
                                                        );
                                    ibookList.add(ibook);
                                }

                                DBConnect.closeConnection();
                                statement.close();
                            }catch (SQLException ex) {
                               // Logger.getLogger(LogInPage.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    
                    int count = 0;
                    String style = "";
                    /*
                    ArrayList <Book> al =new ArrayList <Book>();
                    ArrayList <Book> pList =new ArrayList <Book>();
                    if (request.getAttribute("bookList") != null) {
                        al = (ArrayList) request.getAttribute("bookList");
                        System.out.println(al); 
                    */
                       /* Iterator itr = al.iterator();
                        while (itr.hasNext()) {

                            if ((count % 2) == 0) {
                                style = "info";
                            }
                            count++;
                            //pList = (ArrayList) itr.next();*/
                       
                       ArrayList <IssueBook> al =new ArrayList <IssueBook>();
                       al = ibookList;
                       for(int i=0;i<al.size();i++){
                           count = i+ count;
                
      out.write("\n");
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("                    <tr class=\"");
      out.print(style);
      out.write("\">\n");
      out.write("                        <td>");
      out.print(al.get(i).getBookid());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(al.get(i).getStudentid());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(al.get(i).getDate());
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("                ");

                    }
                    //}
                    if (count == 0) {
                
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("                    <tr class=\"warning\">\n");
      out.write("                        <td colspan=\"4 text-center\"><b>No Record Found..</b></td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </div> \n");
      out.write("            \n");
      out.write("    \n");
      out.write("            \n");
      out.write("       <!--- Footer  -->\n");
      out.write("\n");
      out.write("    <hr />\n");
      out.write("\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <p class=\"pull-right\"><a href=\"#\">Back to top</a></p>\n");
      out.write("            <p>&copy; Asif &middot; <a href=\"Login.jsp\">Home</a> &middot; <a href=\"#\">About</a></p>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("    <!--- Footer -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    \n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
