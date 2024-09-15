package com.tutorial;

public class Ebook extends Book{
    private String type;

    Ebook(String title, String [] authors, int pageCount, String type){
        super(title, pageCount, authors);
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
}