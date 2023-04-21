package com.ss;

public class Main {
    public static void main(String[] args){

    }
}

class Book{
    ///Properties
    private int id;
    private String isbn;
    private String title;
    private boolean booksCheckedOut;
    private String checkOutTo;

    ////Constructors
    public Book (int id, String isbn, String title, boolean booksCheckedOut, String checkOutTo){
        this.id = id;
        this.isbn = isbn;
        this.title = title;
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
    public String getIsbn(){
        return this.isbn;
    }
    public void setIsbn(){
        this.isbn = isbn;

    }
    public String getTitle(){
        return this.title;
    }
    public String setTitle(){
        this.title = title;
    }
    public Boolean getBooksCheckedOut(){
        return this.booksCheckedOut;
    }
    public Boolean setBooksCheckedOut(){
        this.booksCheckedOut = booksCheckedOut;
    }


    }