/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import allclasses.Book;
import allclasses.DBConnect;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
public class IssueServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            // TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet IssueServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet IssueServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        */
        
            String stuid = request.getParameter("studentId");
            String bookid = request.getParameter("bookId");
            
            String btn = request.getParameter("button");
            
            if(btn.equals("issuebtn")){
                
                InsertIntoDB(bookid,stuid);
                ArrayList<Book> bookList = new ArrayList<Book>();
                bookList = FetchBookList(bookid);
                int i=0;
                
                int quantity = bookList.get(i).getQuantity() - 1;
                UpdateDB(quantity,bookid); 
                
                response.sendRedirect("Issue2.jsp");
            
            }
            else{
                
            }
    }
    
    
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    
        public void InsertIntoDB(String bookid,String stuid){
        String str = "no";
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        //String datestr = sdf.format(date.getDate());
        
        String datestr = "2018-7-31";
        
        PreparedStatement statement = null;
        try {
            String query = "insert into issue (bookid,studentid,date,returned) values(?,?,?,?)" ;
            
            statement = DBConnect.getConnection().prepareStatement(query);
            statement.setString(1,bookid);
            statement.setString(2,stuid);
            statement.setString(3,datestr);
            
            statement.setString(4,str);
            
            statement.execute();
            

            System.out.println("Record is inserted !");
      
        
            DBConnect.closeConnection();
            statement.close();
        }catch (SQLException ex) {
           // Logger.getLogger(SignUpPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        
        public void UpdateDB(int quantity,String bookid){
        //int quantity = Integer.parseInt(bookidtf4.getText()) - 1;
        PreparedStatement statement = null;
        try {
            String query = "update book set quantity ='"+quantity+"' where bookid = '"+bookid+"'" ;
            
            statement = DBConnect.getConnection().prepareStatement(query);

            
            statement.execute();
            

            System.out.println("Record is Updated !");
      
        
            DBConnect.closeConnection();
            statement.close();
        }catch (SQLException ex) {
            //Logger.getLogger(SignUpPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        
    public ArrayList<Book> FetchBookList(String bookid){
        ArrayList<Book> bookList = new ArrayList<Book>();
        String query;

        query = "select * from book where bookid = '"+bookid+"'";
        
        
        Statement statement = null;
        ResultSet result=null;
        try {
            statement = DBConnect.getConnection().createStatement();
            result = statement.executeQuery(query);
                    //result.next();
            Book book;
        
            while(result.next()){
                book = new Book(
                                   result.getInt("bookid"),
                                   result.getString("name"),
                                   result.getString("publisher"),
                                   result.getInt("edition"),
                                   result.getInt("quantity"),
                                   result.getDouble("price")
                                    );
                bookList.add(book);
            }
        
            DBConnect.closeConnection();
            statement.close();
        }catch (SQLException ex) {
           // Logger.getLogger(LogInPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bookList;
    }

}
