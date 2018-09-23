/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import allclasses.Account;
import allclasses.DBConnect;
import allclasses.IssueBook;
import allclasses.ReturnBook;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Asif
 */
public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        String btn = request.getParameter("button");
        
        String rm = request.getParameter("rememberMe");
        // rm.equals("yes")
        
        ArrayList<Account> accList2 = null;
        accList2 = FetchAccountList(email,pass);
       
        
        if(btn.equals("registerbtn") ){
            response.sendRedirect("Registration.jsp");
        }
        else{
        
        if (accList2.isEmpty()){
            PrintWriter out = response.getWriter();
                   out.println("<script type=\"text/javascript\">");
                    out.println("alert('User or password incorrect');");
                    out.println("location='index.jsp';");
                    out.println("</script>");
                    //response.sendRedirect("Login.jsp");
        }
        
                    
        else if(email.equals(accList2.get(0).getUsername())&& pass.equals(accList2.get(0).getPassword())
                    &&btn.equals("signInbtn")){
            
            
            
                 HttpSession session = request.getSession(true);
                // Place the shopping cart inside the session
                synchronized (session) { // synchronized to prevent concurrent updates
                    session.setAttribute("name","Welcome " + accList2.get(0).getName());
                }
                
                
                //response.sendRedirect("Home.jsp");
                ArrayList<IssueBook> ibookList2 = null;
                ibookList2 = FetchIssueBookList();
                
                request.setAttribute("piList", ibookList2);
                
                ///
                ArrayList<ReturnBook> rbookList2 = null;
                rbookList2 = FetchReturnBookList();
                
                request.setAttribute("piList2", rbookList2);
                ///

                String destination="/FirstJSP.jsp"; //If authentication fails///////////
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/Home.jsp");
                //rd.forward(request, response);
                rd.include(request, response);
                
               /* HttpSession session = request.getSession(false);
                if (session != null) {
                    session.invalidate();
                    //session.removeAttribute("name");
                }*/
                
                
                
                
                ///////////////////
                

                

        }
        else{
                response.sendRedirect("error.jsp");
        }
        
        }
        
        
        /*
        if(email.equals("asifishiaq@gmail.com")&& pass.equals("1234") && btn.equals("signInbtn")){
            response.sendRedirect("index.html");
        }*/
        //processRequest(request, response);
        
        
       
        // Allocate a shopping cart (assume to be a list of String)
        
        // Retrieve the current session, create one if not exists
       
        


        
        
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
        doGet(request,response);
        
        /*
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        
        ArrayList<Account> accList2 = null;
        accList2 = FetchAccountList(email,pass);
        
        System.out.println(email+" "+pass);
        
        if(email.equals(accList2.get(0).getUsername())&& pass.equals(accList2.get(0).getPassword())){
            response.sendRedirect("index.html");
        }
        else{
            response.sendRedirect("error.jsp");
        }
        */
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    
    public ArrayList<Account> FetchAccountList(String email,String pass){
        ArrayList<Account> accList = new ArrayList<Account>();
        String query = "select * from Account where username = '"+email+"' and password = '"+pass+"'";
        Statement statement = null;
        ResultSet result=null;
        try {
            statement = DBConnect.getConnection().createStatement();
            result = statement.executeQuery(query);
                    //result.next();
            Account acc;
        
            while(result.next()){
                acc = new Account(
                                   result.getString("name"),
                                   result.getString("username"),
                                   result.getString("password"),
                                   result.getString("sec_q"),
                                   result.getString("answer")
                                    );
                accList.add(acc);
            }
        
            DBConnect.closeConnection();
            statement.close();
        }catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
            //Logger.getLogger(LogInPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return accList;
    }
    
    
    public ArrayList<IssueBook> FetchIssueBookList(){
        ArrayList<IssueBook> ibookList = new ArrayList<IssueBook>();
        String query;
        String ret = "no";
        
            query = "select * from issue";
        
        
        
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
            //Logger.getLogger(LogInPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ibookList;
    }
    
        public ArrayList<ReturnBook> FetchReturnBookList(){
        ArrayList<ReturnBook> ibookList = new ArrayList<ReturnBook>();
        String query;
        String ret = "no";
        
            query = "select * from returned ";
        
        
        
        Statement statement = null;
        ResultSet result=null;
        try {
            statement = DBConnect.getConnection().createStatement();
            result = statement.executeQuery(query);
                    //result.next();
            ReturnBook rbook;
        
            while(result.next()){
                rbook = new ReturnBook(
                                   result.getInt("bookid"),
                                   result.getString("studentid"),
                                   result.getString("date")
                                         
                                    );
                ibookList.add(rbook);
            }
        
            DBConnect.closeConnection();
            statement.close();
        }catch (SQLException ex) {
            //Logger.getLogger(LogInPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ibookList;
    }
}
