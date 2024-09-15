package com.tutorial;

// Static variabel maksudnya kita menaruh si attribut atau variabel nempel ke class

class Display{
    static String type ="Display";
    private String name;


    Display(String name){
        this.name = name;
    }

    void setType(String typeInput){
        // type = typeInput; //Alternatif 1
        // this.type = typeInput; // Alternatif 2
        Display.type = typeInput; //Alternatif 3, rekomendasi
    }

    void show(){
        System.out.println("Display name = " + this.name);
    }


}


public class Main {

    public static void main(String[] args) {
        Display display1 = new Display("Dinar");
        display1.show();

        Display display2 = new Display("Yareyare");
        display2.show();

        // Tampilkan static variable atau class variable
        System.out.println("\nMenampilkan static variable");

        // Kita coba mengganti variabel staticnya
        Display.type = "Hey";

        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type);

    }
}