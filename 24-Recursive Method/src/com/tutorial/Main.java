package com.tutorial;
// Recursive method
// adalah kemampuan method memanggil method dirinya sendiri 
// jika recursive terlalu dalam, maka akan ada kemungkinan terjadi eror StackOverFlow.
// 


public class Main {

    // Contoh recursive method yg bisa menyebabkan eror
    // bisa eror kalau value nya lebih dari 3000 an
    static void loop(int value){
        if(value == 0){
            System.out.println("Selesai");
        }else{
            System.out.println("Loop ke - " + value);
            loop(value-1);
        }

    };

    static int factorial(int value){
        int hasil = 1;
        for(int counter = 1; counter <= value; counter++){
            hasil *= counter;
        };
        return hasil;

    };

    static int factorialRecursive(int value){
        if(value == 0){
            return 1;
        } else{
            return value * factorialRecursive(value - 1);
        }

    };


    public static void main(String[] args) {
        // Mehtod static bisa ditulis di static main juga
        System.out.println(factorial(0));
        System.out.println(factorialRecursive(5));

        loop(10);

    }
}