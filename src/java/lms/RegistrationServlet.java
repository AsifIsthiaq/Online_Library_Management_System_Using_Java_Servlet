/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import allclasses.DBConnect;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Asif
 */
public class RegistrationServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegistrationServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegistrationServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String pass1 = request.getParameter("pass1");
        String pass2 = request.getParameter("pass2");
        String btn = request.getParameter("button");
        String ques = "empty";
        String ans = "empty";
        
        
        /*
        if(btn.equals("backbtn")){
            response.sendRedirect("Login.jsp");
        }*/
        
        if(btn.equals("signUpbtn") && pass1.equals(pass2) 
                && name!="" && email!="" && pass1!="" && pass2!=""){
            InsertIntoDB(email,name,pass1,ques,ans);
            response.sendRedirect("Login.jsp");
        }
        else if(btn.equals("backbtn")){
            response.sendRedirect("Login.jsp");
        }
        else{
                response.sendRedirect("error.jsp");
                //response.sendRedirect("Login.jsp");
        }
        
        /*
        
        if(btn.equals("backbtn")){
            //InsertIntoDB(name,email,pass1,ques,ans);
            response.sendRedirect("Login.jsp");
        }
        else{
            if(btn.equals("signUpbtn") && pass1.equals(pass2)){
                InsertIntoDB(name,email,pass1,ques,ans);
                //response.sendRedirect("Login.jsp");
        }
        else{
                response.sendRedirect("error.jsp");
        }
        }
*/

        
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            doGet(request, response);
            //processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    
    public void InsertIntoDB(String email,String name,String pass,String ques,String ans){
        
        PreparedStatement statement = null;
        try {
            String query = "insert into Account (username,name,password,sec_q,answer) values(?,?,?,?,?)" ;
            
            statement = DBConnect.getConnection().prepareStatement(query);
            statement.setString(1,email);
            statement.setString(2,name);
            statement.setString(3,pass);
            statement.setString(4,ques);
            statement.setString(5,ans);
            
            statement.execute();
            

            System.out.println("Record is inserted !");
      
        
            DBConnect.closeConnection();
            statement.close();
        }catch (SQLException ex) {
            //Logger.getLogger(SignUpPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
