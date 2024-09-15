package com.tutorial;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * User
 */
public class Book {
    String title; 
    int pageCount;
    ArrayList<String> authors = new ArrayList<String>();

    // Konstruktor
    Book(String title, int pageCount, String[] authors){
        this.title = title;
        this.pageCount = pageCount;
        this.authors = new ArrayList<String>(Arrays.asList(authors));
    }
    // Overloading method
    Book(String title, String[] authors){
        this.title = title;
        this.authors = new ArrayList<String>(Arrays.asList(authors));
    }
    
    // override
    public String toString(){
        return String.format("%s oleh %s", this.title, this.authors.toString());
    }
    
    // Method lainnya
    public String getBookTitle(){
        return this.title;
    }

    public String getAuthorNames(){
        return this.authors.toString();
    }

    


    
    
}