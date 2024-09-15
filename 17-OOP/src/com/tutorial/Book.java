package com.tutorial;
import java.util.ArrayList;
/**
 * User
 */
public class Book {
    String title; 
    ArrayList<String> authors = new ArrayList<>();
    

    public String toString(){
        return String.format("%s oleh %s.", this.title, this.authors.toString());
    }
    
    
}