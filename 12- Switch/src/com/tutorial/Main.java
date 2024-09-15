package com.tutorial;
// Switch Statement

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        String nilai = "R";

        //Switch Statement biasa
        switch(nilai){
            case "A":
            System.out.println("Selamat ya, kamu pintar!");
            break;
            case "B": //data digabung
            case "C":
            System.out.println("Nilai kamu cukup baik!");
            break;
            case "D":
            System.out.println("Belajar yang banyak..");
            break;
            case "E":
            System.out.println("Ngulang ini mah!");
            break;
            default:
            System.out.println("Coba tanya adminn deh.");

        }

        // Switch Lambda
        switch (nilai) {
            case "A" ->{
                System.out.println("Selamat ya, kamu pintar!");
            }
            case "B", "C" ->{
                System.out.println("Nilai kamu cukup baik!");
            }
            case "D" ->{
                System.out.println("Belajar yang banyak..");
            }
            case "E" ->{
                System.out.println("Ngulang ini mah!");
            }
            default ->{System.out.println("Coba tanya adminn deh.");}
        }

        // Switch tanpa yield
        String ucapan;
        switch(nilai){
            case "A" -> ucapan = "Selamat ya, kamu pintar!";
            case "B", "C" -> ucapan = "Nilai kamu cukup baik!";
            case "D" -> ucapan = "Belajar yang banyak..";
            case "E" -> ucapan = "Ngulang ini mah!";
            default -> ucapan = "Coba tanya adminn deh.";
        }
        System.out.println(ucapan);

        // Switch dengan yield
        ucapan = switch(nilai){
            case "A": yield "Selamat ya, kamu pintar!";
            case "B", "C" : yield "Nilai kamu cukup baik!";
            case "D" : yield "Belajar yang banyak..";
            case "E" : yield "Ngulang ini mah!";
            default : yield "Coba tanya adminn deh.";
        };
        System.out.println(ucapan);

    }
}