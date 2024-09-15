package com.tutorial.apps;

public class Manager extends Person {
    // super("Dinar", "F52123078");
    public Manager(String name, String id){
        super(name, id);
        
    }

    public void gaji(int gaji){
        System.out.println("Gaji Manajer adalah " + gaji);
    }

}
