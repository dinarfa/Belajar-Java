package com.tutorial;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * User
 */
public class Book {
    private String title; 
    private ArrayList<String> authors = new ArrayList<>();

    Book(String title, String[] authors){
        this.title = title;
        this.authors = new ArrayList<String>(Arrays.asList(authors));
        // for(String name : authors){
        //     this.authors.add(name);
        // };
    }

    // Override 
    public String toString(){
        return String.format("%s oleh %s", this.title, this.authors.toString());
    }
    
    
}