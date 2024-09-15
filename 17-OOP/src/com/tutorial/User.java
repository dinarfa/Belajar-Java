package com.tutorial;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    String name; 
    LocalDate birthDay; 

    ArrayList<Book> borrowedBooks = new ArrayList<>();

    int age(){
        return Period.between(this.birthDay, LocalDate.now()).getYears();
    }

    void borrow(Book book){
        this.borrowedBooks.add(book);
    }
}