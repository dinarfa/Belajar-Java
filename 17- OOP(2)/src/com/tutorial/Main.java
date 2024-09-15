package com.tutorial;
// import java.time.LocalDate;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        User user = new User("Dinar Fauziah", "2004-12-26");

        System.out.printf("Nama : %s \n",user.getName());

        Book book1 = new Book ("Learn Java", new String[] {"Beau"});
        Book book2 = new Book ("Learn Python", new String[] {"Franklin"});
        Book book3 = new Book ("Learn PHP", new String[] {"John"});

    user.borrow(new Book[]{book1, book2});
    user.borrow(book3);
    System.out.println(user.getBirthDay());
    System.out.printf("%s telah meminjam buku-buku ini : %s\n", user.getName(), user.getBorrowedBooks());


        
    }

    
}