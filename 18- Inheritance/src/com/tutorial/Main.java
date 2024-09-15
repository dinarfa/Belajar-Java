package com.tutorial;
// import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        User user = new User("Dinar", "2004-12-26");
        Book book = new Book("House Of The Dragons", new String[]{"Geogre", "John Mikey"});
        Book book2 = new Book("House Of The Cats", 200, new String[]{"Kevin", "Alvin"});
        AudioBook audioBook = new AudioBook("House Of The Dogs", new String[]{"Ruby", "Bianca"}, 120);
        Ebook eBook = new Ebook("House Of The Huskies", new String[]{"Milo", "Archer"}, 324, "EPUB");
        // user.borrow(book);


        user.borrow(new Book[]{audioBook, book, book2, eBook});
        System.out.println(user.getBorrowedBooks());


    }

    
}