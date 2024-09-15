package com.tutorial;
import java.time.LocalDate;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        User user = new User();
        
        user.name = "Dinar";
        user.birthDay = LocalDate.parse("2004-12-26");
        System.out.printf("%s berusia %s tahun.\n", user.name, user.age());
        
        Book book = new Book();
        book.title = "Cara dapat cuan";
        user.borrow(book);
        book.authors.add("Kevin");

        Book book2 = new Book();
        book2.title = "baguss";
        user.borrow(book2);
        book2.authors.add("alvin");

        System.out.printf("%s meminjam buku-buku ini : %s\n", user.name, user.borrowedBooks.toString(), book.authors.toString());

    }

    
}