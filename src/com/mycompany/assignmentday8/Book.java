package com.mycompany.assignmentday8;

public class Book {
    int bookId;
    String bookTitle;
    String description;
    double price;
    Author author;

    public Book()
    {

    }
    public Book(int bookId,String bookTitle,String description,double price,Author author)
    {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.description = description;
        this.price = price;
        this.author = author;
    }
}
