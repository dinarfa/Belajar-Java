package com.tutorial;

 class Data{
    // Instance field
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    // Constructor
    public Data(){
        this.intPublic = 0;
        this.intPrivate = 6;
    }

    // getter
    public int getIntPrivate(){
        return this.intPrivate;
    }

    // Setter
    public void setDoublePrivate(double value){
        this.doublePrivate = value;
    }

    void display(){
        
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
        System.out.println(this.doublePrivate);
    }
 }


 class Lingkaran{
    private double diameter;

    Lingkaran(double diameter){
        this.diameter = diameter;
    }

    // Setter
    public void setJari2(double jari2){
        this.diameter = jari2*2;
    }
 
    // Getter
    public double getJari2(){
        return this.diameter/2;
    }

    // Getter
    public double getLuas(){
        return 3.14*diameter*diameter/4;
    }
 
 }


 public class Main {
 
    public static void main(String[] args) {

        Data object = new Data();

        // Public

        // read dan write menggunakan public
        object.intPublic = 10; //write
        System.out.println("Public : " + object.intPublic); // read

        // read only (kita bisa menggunakan GETTER)
        int angkaInt = object.getIntPrivate();
        System.out.println("Getter : " + angkaInt);
        
        // Write only, hanya bisa menulis tanpa melihat
        object.setDoublePrivate(20.5);
        object.display();

        // Gabungkan read dan write dengan setter dan getter
        Lingkaran object2 = new Lingkaran(10);
        System.out.println("Jari-jari : " + object2.getJari2());
        object2.setJari2(14);
        System.out.println("Jari-jari : " + object2.getJari2());

        System.out.println("Luas : " + object2.getLuas());


    }
 }