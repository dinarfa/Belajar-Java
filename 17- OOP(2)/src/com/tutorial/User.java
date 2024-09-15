package com.tutorial;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;

public class User {
    private String name; 
    private LocalDate birthDay; 
    private ArrayList<Book> borrowedBooks = new ArrayList<Book>();

    User(String name, String birthDay){
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);
    }

    int age(){
        return Period.between(this.birthDay, LocalDate.now()).getYears();
    }

    public String getName(){
        return this.name;
    }

    public String getBirthDay(){
        return this.birthDay.toString();
    }

    public void setName(String name){
        this.name = name;
    }
    
    public void setBirthDay(String birthDay){
        this.birthDay = LocalDate.parse(birthDay);
    }

    public String getBorrowedBooks(){
        return this.borrowedBooks.toString();
    }

    void borrow(Book book){
        this.borrowedBooks.add(book);
    }

    void borrow(Book[] books){
        this.borrowedBooks.addAll(Arrays.asList(books));
    }
}