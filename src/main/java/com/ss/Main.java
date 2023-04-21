package com.ss;
import java.util.*;
public class Main {
    public static void main(String[] args){

        Scanner myscanner = new Scanner(System.in);
        Book[] book = new Book[5];
        book[0] = new Book("The Lorax", 2345643, "43332423" , true, "Sunny");
        book[1] = new Book("Oh, the Places I'll go", 673862, "73184", false, "Aliea");
        book[2] = new Book("The 500 Hats", 485839, "293u84", false, "Zara");
        book[3] = new Book("Green Eggs and Ham", 8347532, "6726284", false, "Kai");
        book[4] = new Book("The Cat in the Hat", 483924845, "333245", true, "Zayne");



    }
}

class Book{
    ///Properties
    private String title;
    private int id;
    private String isbn;

    private boolean booksCheckedOut;
    private String checkOutTo;

    ////Constructors
    public Book ( String title, int id, String isbn, boolean booksCheckedOut, String checkOutTo){

        this.title = title;
        this.id = id;
        this.isbn = isbn;
        this.booksCheckedOut = booksCheckedOut;
        this.checkOutTo = checkOutTo;
    }

    ////Setter & Getter
    public int getId(){
      return this.id;

    }
    public void setId(int id){
        this.id = id;

    }
    public String getIsbn( ){
        return this.isbn;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;

    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public Boolean getBooksCheckedOut(){
        return this.booksCheckedOut;
    }
    public void setBooksCheckedOut( Boolean BooksCheckedOut){
        this.booksCheckedOut = booksCheckedOut;
    }
    public String getCheckOutTo(){
        return this.checkOutTo;
    }
    public void setBooksCheckedOut (String checkOutTo){
       this.checkOutTo = checkOutTo;
    }

    }