package com.tutorial;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;

public class User {
    String name; 
    LocalDate birthDay; 
    ArrayList<Book> borrowedBooks = new ArrayList<Book>();

    // Konstruktor
    User(String name, String birthDay){
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);
    }

    public int age(){
        return Period.between(this.birthDay, LocalDate.now()).getYears();
    }

    void borrow(Book book){
        this.borrowedBooks.add(book);
    }

    // Overloading method
    void borrow(Book[] books){
        this.borrowedBooks.addAll(Arrays.asList(books));
    }

    public String getBorrowedBooks(){
        return this.borrowedBooks.toString();
    }
}