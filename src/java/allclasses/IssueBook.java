/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allclasses;

/**
 *
 * @author Asif
 */
public class IssueBook {
    private int bookid;
    private String studentid;
    private String date;
    private String returned;
    
    public IssueBook(int bookid,String studentid,String date,String returned){
        this.bookid=bookid;
        this.studentid=studentid;
        this.date = date;
        this.returned = returned;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getReturned() {
        return returned;
    }

    public void setReturned(String returned) {
        this.returned = returned;
    }
    
    
    
}
