package com.tutorial;

public class AudioBook extends Book{
    private int runTime;

    // Konstruktor
    AudioBook(String title, String[] authors, int runTime){
        super(title, authors);
        this.runTime = runTime;
    }

    // Ga jadi pake method ini karna bisa pake dari klas induk hehe
    // public String getAuthorName(){
    //     return this.authors.toString();
    // }

    // Method lain
    public int getRunTime() {
        return runTime;
    }
}