package com.tutorial;

class Player{
    String name; //default, dia akan bisa dibaca dan ditulis dari luar class
    public int exp; //public, dia akan bisa dibaca dan ditulis dari luar class
    private int health; //Private, hanya akan bisa dibaca dan ditulis di dalam class saja

    Player(String name, int exp, int health){
        this.name = name;
        this.exp = exp;
        this.health = health;

    }

    // default modifier access
    void display(){
        tambahExp();
        System.out.println("\nName\t: " 
        + this.name);
        System.out.println("Exp\t: " 
        + this.exp);
        System.out.println("Health\t: " 
        + this.health); // membaca tapi di dalam class
        
    }

    // Public
    public void ubahName(String nameBaru){
        this.name = nameBaru;
    }

    // Private
    private void tambahExp(){
        this.exp += 200;
    }
}

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player("Dinar", 0, 100);

        // Default
        System.out.println(player1.name); // Membaca data
        player1.name = "Blaw"; // Menulis data
        System.out.println(player1.name); // Membaca data
        
        
        // Public
        System.out.println(player1.exp); // Membaca data
        player1.exp = 100; // Menulis data
        System.out.println(player1.exp); // Membaca data
        
        // Private (Tidak bisa di akses)
        // System.out.println(player1.health); // Membaca data
        // player1.health = 100; // Menulis data
        // System.out.println(player1.health); // Membaca data

        // Default
        player1.display();
        
        // Public
        player1.ubahName("Blekii");
        player1.display();

        // Private, tidak bisa diakses dari luar
        // player1.tambahExp();








    }
}
