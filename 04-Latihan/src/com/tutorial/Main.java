package com.tutorial;

// Player
class Player{
    String name;
    double health;
    int level;

    // Object member
    Weapon weapon;
    Armor armor;

    Player(String name, double health){
        this.name = name;
        this.health = health;

    }

    void attack(Player musuh){
        double attackPower = this.weapon.attackPower;
        System.out.println(this.name + " attacking " + musuh.name + " with power " + attackPower);
        musuh.defence(attackPower);
        
    }
    
    void defence(double attackPower){
        
        double damage;
        if(this.armor.defencePower < attackPower){
            
            damage = attackPower - this.armor.defencePower; 
        } else{
            damage = 0;
        }
        this.health -= damage;
        System.out.println(this.name + " gets " + damage + " damage");
        // System.out.println(this.name + " now have " + this.health + " hp");
         
    }


    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    
    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health + " Hp");
        this.weapon.display();
        this.armor.display();
        
    }


}


// Weapon
class Weapon{
    double attackPower;
    String name;

    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;      
    }
    void display(){
        System.out.println("Weapon : " + name + ", Power : " + this.attackPower);
    }
}

// Armor
class Armor{
    double defencePower;
    String name;

    Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    void display(){
    System.out.println("Armor : " + name + ", Defence : " + this.defencePower);
    }
}


public class Main{

    public static void main(String[] args) {
        
        // Membuat objek player
        Player player1 = new Player("Dinar", 100);
        Player player2 = new Player("Blackie", 90);

        // membuat objek weapon
        Weapon gun = new Weapon("M416",45);
        Weapon pedang = new Weapon("pedang",25);

        // Membuat objek armor
        Armor vest = new Armor("vest Lv 1", 20);
        Armor kaos = new Armor("kaos", 0);

        // equip senjata dan armor
        player1.equipWeapon(gun);
        player1.equipArmor(vest);
        player1.display();
        
        
        player2.equipWeapon(pedang);
        player2.equipArmor(kaos);
        player2.display();
        
        System.out.println("\nPERTEMPURAN!");
        System.out.println("\nEpisode 1\n");
        player1.attack(player2);
        player1.display();
        player2.display();
        
        System.out.println("\nEpisode 2\n");
        player2.attack(player1);
        player1.display();
        player2.display();

        
    }
}