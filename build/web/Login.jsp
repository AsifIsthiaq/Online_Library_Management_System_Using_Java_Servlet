<%-- 
    Document   : Login
    Created on : Jul 27, 2018, 10:33:05 AM
    Author     : Asif
--%>

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
    
    <script type = 'text/javascript' >
     function changeHashOnLoad() {
         window.location.href += '#';
         setTimeout('changeHashAgain()', '50');
     }

     function changeHashAgain() {
         window.location.href += '1';
     }

     var storedHash = window.location.hash;
     window.setInterval(function () {
         if (window.location.hash != storedHash) {
             window.location.hash = storedHash;
         }
     }, 50);
     window.onload = changeHashOnLoad;
</script> 

</head>
  <body>
      <h4>Login</h4>
      
    <div class="container">
        <div class="form-horizontal">
            <h1>Sign In</h1>
             <hr />
        </div>
    </div>
             
      
        <form id="form1" runat="server">
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
                        <a class="navbar-brand" href="Login.jsp"><span>
                            <img alt="Logo" src="images\logo.png" height="30" /></span>  Library Management System</a>
                    </div>
                    <div class="navbar-collapse collapse">
                        <ul class="nav navbar-nav navbar-right">
                     

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
    

    
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <form action="LoginServlet" method="POST">
                <div class="form-group">
                  <label for="exampleInputEmail1">Email address</label>
                  <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Email"name="email">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Password</label>
                  <input type="password" name="pass" class="form-control" id="exampleInputPassword1" placeholder="Password">
                 
                </div>  
                   
                      
                <button type="submit" Class="btn btn-success" name="button" value="signInbtn">Sign In</button>
                <button type="submit"class="btn btn-default" name="button" value="registerbtn">Register</button>
                
                
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
