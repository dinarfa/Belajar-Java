package com.tutorial.apps;

public class Avanza implements Car{
    @Override
    public int getTire() {
        return 4;
    }
    public void getName(){
        System.out.println("Avanza ");
    }

    public void getBrand(){
        System.out.println("Toyota");
    }
}