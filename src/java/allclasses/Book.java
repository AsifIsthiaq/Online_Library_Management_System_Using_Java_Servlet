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
public class Book {
    private int bookid;
    private String name;
    private String publisher;
    private int edition;
    private int quantity;
    private double price;
    
    public Book(int bookid,String name,String publisher,int edition,int pages,double price){
        this.bookid=bookid;
        this.name=name;
        this.edition=edition;
        this.quantity=pages;
        this.price=price;
        this.publisher=publisher;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
}
