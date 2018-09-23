<%-- 
    Document   : Home
    Created on : Jul 27, 2018, 7:15:18 PM
    Author     : Asif
--%>

<%@page import="allclasses.ReturnBook"%>
<%@page import="allclasses.IssueBook"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>LMS</title>
    <script
        src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous">
    </script>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet" />
    <link href="css/Custom-Cs.css" rel="stylesheet" />
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script>
        $(document).ready(function myfunction() {
            $("#btnCart").click(function myfunction() {
                window.location.href = "/Cart.aspx";
            });
        });
    </script>
    <asp:ContentPlaceHolder ID="head" runat="server">
    </asp:ContentPlaceHolder>

</head>
  <body>
      

      
      
      <h4>Login</h4>
      
      
    <div class="container">
        <div class="form-horizontal">
            <h1></h1>
             <hr />
        </div>
    </div>
             
      
      <form id="form1" runat="server" action="">
        <div>
            <!-- Navbar -->
            <div class="navbar navbar-default navbar-fixed-top" role="navigation">
                <div class="container">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="#"><span>
                            <img alt="Logo" src="images\logo.png" height="30" /></span>  Library Management System</a>
                    </div>
                    <div class="navbar-collapse collapse">
                        <ul class="nav navbar-nav navbar-right">
                            <li><a href="#">Home</a></li>
                            
                            <li><a name="issueBookLink" value="issueBook" href="Issue2.jsp">Issue Book</a></li>
                            <li><a href="Return.jsp">Return Book</a></li>
                            <li><a href="#">Add Book</a></li>
                            <li><a href="#">Add Student</a></li>
                            <li><a href="Login.jsp">Log Out</a></li>

                        </ul>
                    </div>
                </div>
            </div>
            <!-- Navbar End -->
                        <!-- Navbar End -->
            <div class="container">
                <asp:ContentPlaceHolder ID="ContentPlaceHolder1" runat="server">
                </asp:ContentPlaceHolder>
            </div>
        </div>
    </form>
    

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    
     
     <%
            String str="";
            HttpSession session2 = request.getSession(false);
            if (session2 != null) {
                str=(String)session2.getAttribute("name");
            }

    %>
    
    <div class="container">
        <div class="form-horizontal">
            <h2><%=str%></h2>
             <hr />
        </div>
    </div>
    
    <div class="container">
        <div class="form-horizontal">
            <h3>Issue Detail</h3>
             <hr />
        </div>
    </div>

    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <table class="table table-striped" >
                <thead>
                    <tr>
                        <td><b>Book Id</b></td>
                        <td><b>Student Id</b></td>
                        <td><b>Date</b></td>
                        <td><b>Returned</b></td>
                    </tr>
                </thead>
                <%
                    int count = 0;
                    String style = "";
                    ArrayList <IssueBook> al =new ArrayList <IssueBook>();
                    ArrayList <IssueBook> pList =new ArrayList <IssueBook>();
                    if (request.getAttribute("piList") != null) {
                        al = (ArrayList) request.getAttribute("piList");
                        System.out.println(al);
                       /* Iterator itr = al.iterator();
                        while (itr.hasNext()) {

                            if ((count % 2) == 0) {
                                style = "info";
                            }
                            count++;
                            //pList = (ArrayList) itr.next();*/
                       for(int i=0;i<al.size();i++){
                           count = i+ count;
                %>

                <tbody>
                    <tr class="<%=style%>">
                        <td><%=al.get(i).getBookid()%></td>
                        <td><%=al.get(i).getStudentid()%></td>
                        <td><%=al.get(i).getDate()%></td>
                        <td><%=al.get(i).getReturned()%></td>
                    </tr>
                </tbody>
                <%
                    }
                    }
                    if (count == 0) {
                %>
                <tbody>
                    <tr class="warning">
                        <td colspan="4 text-center"><b>No Record Found..</b></td>
                    </tr>
                </tbody>
                <%
                    }
                %>
            </table>
        </div>
    </div> 
            
            
     <div class="container">
        <div class="form-horizontal">
            <h3>Return Detail</h3>
             <hr />
        </div>
    </div>

    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <table class="table table-striped" >
                <thead>
                    <tr>
                        <td><b>Book Id</b></td>
                        <td><b>Student Id</b></td>
                        <td><b>Date</b></td>
                        
                    </tr>
                </thead>
                <%
                     count = 0;
                     style = "";
                    ArrayList <ReturnBook> al2 =new ArrayList <ReturnBook>();
                    ArrayList <ReturnBook> pList2 =new ArrayList <ReturnBook>();
                    if (request.getAttribute("piList2") != null) {
                        al2 = (ArrayList) request.getAttribute("piList2");
                        System.out.println(al2);
                       /* Iterator itr = al.iterator();
                        while (itr.hasNext()) {

                            if ((count % 2) == 0) {
                                style = "info";
                            }
                            count++;
                            //pList = (ArrayList) itr.next();*/
                       for(int i=0;i<al2.size();i++){
                           count = i+ count;
                %>

                <tbody>
                    <tr class="<%=style%>">
                        <td><%=al2.get(i).getBookid()%></td>
                        <td><%=al2.get(i).getStudentid()%></td>
                        <td><%=al2.get(i).getDate()%></td>
                        
                    </tr>
                </tbody>
                <%
                    }
                    }
                    if (count == 0) {
                %>
                <tbody>
                    <tr class="warning">
                        <td colspan="4 text-center"><b>No Record Found..</b></td>
                    </tr>
                </tbody>
                <%
                    }
                %>
            </table>
        </div>
    </div> 
            
            
    <div class="row">
        <div class="col-md-6 col-md-offset-8">
            <form action="HomeServlet" method="POST">

                   
                      
                <button type="submit" Class="btn btn-success" name="button" value="signOutbtn">Sign Out</button>
              
                
                
            </form>
        </div>
    </div> 
    
            
       <!--- Footer  -->

    <hr />

    <footer>
        <div class="container">
            <p class="pull-right"><a href="#">Back to top</a></p>
            <p>&copy; Asif &middot; <a href="Login.jsp">Home</a> &middot; <a href="#">About</a></p>
        </div>
    </footer>

    <!--- Footer -->


    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    
  </body>
</html>
