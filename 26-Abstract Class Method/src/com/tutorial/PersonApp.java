package com.tutorial;

import com.tutorial.apps.Manager;
import com.tutorial.apps.Person;
// HAhaha jadi!
// nama packagenya apps krna lgi coba2 aja 
public class PersonApp {
    public static void main(String[] args) {
        Person manager = new Manager("Dinar Fauziah", "F521");
        manager.gaji(32);
        manager.setName("Dinaro");
        System.out.println(manager.getName());
    }
}
