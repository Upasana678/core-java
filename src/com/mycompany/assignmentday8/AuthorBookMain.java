package com.mycompany.assignmentday8;

import java.util.Scanner;
public class AuthorBookMain {
    static Scanner sc = new Scanner(System.in);
    static int choice;
    public static void menu(){
        System.out.println("0.Enter number of books and authors");
        System.out.println("1.Add authors.");
        System.out.println("2.Add books ");
        System.out.println("3.Search a book by book name ");
        System.out.println("4.Display a book details ");
        System.out.println("5.Display an author details.");
        System.out.println("6.Display all books.");
        System.out.println("7.Display all authors.");
        System.out.println("99.Exit Program");
        System.out.println("Enter your choice :");
        choice = sc.nextInt();

    }
    public static void main(String[] args)
    {
        Book books[] =null;
        Author authors[] = null;
        Author author = null;
        Book book = null;
        int noOfAuthors = 0;
        int noOfBooks = 0;

        while(true){
            menu();
            switch(choice)
            {
                case 0:
                    System.out.println("Enter the number of Authors you want");
                    noOfAuthors = sc.nextInt();
                    authors = new Author[noOfAuthors];
                    System.out.println("Enter the number of Books you want");
                    noOfBooks = sc.nextInt();
                    books = new Book[noOfBooks];
                    break;
                case 1:
                    System.out.println("Add "+noOfAuthors+" Author details");

                    //Create object of Author and add to the author array
                    for(int i = 0; i<noOfAuthors; i++){
                        System.out.println("Enter author ID");
                        int authorId = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter author name");
                        String authorName = sc.nextLine();
                        author = new Author(authorId,authorName);
                        authors[i] = author;
                    }
                    break;
                case 2:
                    System.out.println("Add "+noOfBooks+" Book details");

                    //Create object of Book and add to the Book array
                    for(int i = 0; i<noOfBooks; i++){
                        System.out.println("Enter Book ID");
                        int bookId = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter Book name");
                        String bookTitle = sc.nextLine();
                        System.out.println("Enter Book Description");
                        String description = sc.nextLine();
                        System.out.println("Enter book price");
                        double price = sc.nextDouble();
                        // display user all available authors and ask to choose one author
                        System.out.println("Available authors");
                        System.out.println("--------------------------------------------");
                        for(Author a : authors){
                            System.out.println("Author ID : "+a.authorId);
                            System.out.println("Author Name : "+a.authorName);
                            System.out.println("--------------------------------------------");

                        }
                        System.out.println("Enter the author Id of the author for this book");
                        int authId = sc.nextInt();
                        //System.out.println(authId);
                        Author tempAuthor = null;
                        //Search the author from author array for this authorId
                        for(Author a : authors){
                            //System.out.println(a.authorId);
                            if(a.authorId == authId){
                                tempAuthor = a;
                                break;
                            }
                        }
                        if(tempAuthor == null){
                            System.out.println("No matching author found");
                        }
                        else
                        {
                            System.out.println("Your chosen Author Name is "+tempAuthor.authorName);
                        }

                        book = new Book(bookId,bookTitle,description,price,tempAuthor);
                        books[i] = book;

                    }

                    break;
                case 3:
                    System.out.println("Search a book by book name");
                    System.out.println("Enter the name of the book you want to search :");
                    sc.nextLine();
                    String bookName = sc.nextLine();
                    int found = 0;
                    for(int i = 0; i < books.length; i++)
                    {
                        if(bookName.equals(books[i].bookTitle))
                        {
                            found = i;
                            break;
                        }
                    }
                    if(found == 0)
                    {
                        System.out.println("Sorry! No book found");
                    }
                    else
                    {
                        System.out.println(" Book found!Below are the details");
                        System.out.println("Book Name :-"+books[found].bookTitle);
                        System.out.println("Book ID :-"+books[found].bookId);
                        System.out.println("Book Price :-"+books[found].price);
                        System.out.println("Book Description :-"+books[found].description);
                        System.out.println("Book Author :-"+books[found].author.authorName);

                    }
                    break;
                case 4:
                    System.out.println("Display a book details");
                    sc.nextLine();
                    int searchSucessful = 0;
                    System.out.println("Enter book name you want to search :-");
                    String name = sc.nextLine();
                    for(int i = 0; i < books.length; i++)
                    {
                        if(books[i].bookTitle.equals(name))
                        {
                            searchSucessful = 1;
                            System.out.println("Book Name :- "+books[i].bookTitle);
                            System.out.println("Book ID :- "+books[i].bookId);
                            System.out.println("Book Description :- "+books[i].description);
                            System.out.println("Book Price :- "+books[i].price);
                            System.out.println("Book Author :- "+books[i].author.authorName);
                            break;
                        }
                    }
                    if(searchSucessful == 0)
                    {
                       System.out.println("No such book exists.");
                    }
                    break;
                case 5:
                    System.out.println("Display an author details");
                    sc.nextLine();
                    int search = 0;
                    System.out.println("Enter Author name you want to search :-");
                    String author1 = sc.nextLine();
                    for(int i = 0; i < authors.length; i++)
                    {
                        if(authors[i].authorName.equals(author1))
                        {
                            search = i;
                            System.out.println("Author ID :- "+authors[i].authorId);
                            System.out.println("Author Name :- "+authors[i].authorName);
                            break;
                        }
                    }
                    if(search == 0)
                    {
                        System.out.println("No such author exists");
                    }
                    break;
                case 6:
                    System.out.println("Display all books");
                    System.out.println("--------------------------------------------");
                    for(Book b : books){
                        System.out.println("Book ID : "+b.bookId);
                        System.out.println("Book Name : "+b.bookTitle);
                        System.out.println("Book description : "+b.description);
                        System.out.println("Book price : "+b.price);
                        System.out.println("Book Author : "+b.author.authorName);
                        System.out.println("--------------------------------------------");


                    }
                    break;
                case 7:
                    System.out.println("Display all authors");
                    System.out.println("--------------------------------------------");
                    for(Author a : authors){
                        System.out.println("Author ID : "+a.authorId);
                        System.out.println("Author Name : "+a.authorName);
                        System.out.println("--------------------------------------------");

                    }
                    break;
                case 99:
                    System.out.println("Exiting the application");
                    System.exit(0);
                default:
                    System.out.println("Wrong Input!.Please Try Again");
                    break;
            }

        }


        }

    }

