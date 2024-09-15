package com.tutorial;

class Manager{
    String name;
    String company;

    Manager(String name){
        this.name = name;
    }
    Manager(String name, String company){
        this.name = name;
        this.company = company;
    }

    String name(){
        return this.name;
    }

    public static void main(String[] args) {
        Manager manager = new Manager("Dinar");
        System.out.println(manager.name);

        VicePresident vp = new VicePresident("Fahmi");
        System.out.println(vp.name);
    }


}