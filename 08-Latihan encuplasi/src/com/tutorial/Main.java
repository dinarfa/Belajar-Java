package com.tutorial;

class Player{

    private String name;
    private int baseHealth;

    public Player(String name){
        this.name = name;
        this.baseHealth = 100;

    
    }

    public void display(){
        System.out.println("Player : " + this.name);
        System.out.println("health : " + this.baseHealth);
    }

    public int maxHealth()

class Armor{
    private String name;
    private int strength;

    public Armor(String name, int strength){
        this.name = name;
        this.strength = strength;
    }
}


public class Main {

    public static void main(String[] args) {
        
        Player player1 = new Player("Dinar");
        player1.display();


    }

}


