package com.tutorial;
import java.util.Scanner;

/**
 * Main
 */
public class Main {
    Scanner scanner = new Scanner(System.in);
    static double angka1;
    static double angka2;
    void input(){
        System.out.print("Masukkan angka pertama : ");
        angka1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Masukkan angka kedua : ");
        angka2 = scanner.nextDouble();
    }

    public static void main(String[] args) {
        //Operator Postfix dan prefix

        //Increment postfix
        int a = 1;
        System.out.println(a++);
        System.out.println(a); // output : 2
        System.out.println();

        //Decrement postfix
        a = 2;
        System.out.println(a--);
        System.out.println(a); // output : 1

        //Prefix Increment
        a = 3;
        System.out.println(++a); //Output : 4
        
        //Prefix Decrement
        a = 4;
        System.out.println(--a); //Output : 3

        //Operator Unary
        //Unary Plus
        a = 5;
        System.out.println(+a);

        //Unary Minus
        System.out.println(-a);

        //Unary logical complement
        boolean kuliah = true;
        System.out.println(!kuliah);

        // String validation = kuliah == true ? "kuliah" : "Nganggur";
        System.out.println(kuliah == true ? a : "Nganggur");
        System.out.println();
        Main objek = new Main();

        //Replace method

        // String nama = "Dinar Fauziahh";
        // nama = nama.replace("Fauziahh", "Fauziah");
        // System.out.println(nama.contains("Dinar"));
        // System.out.printf("Haloo %s, apa kabar?", nama);

        String opsi;
         
        do{
            System.out.println("\nKALKULATOR SEDERHANA");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Sisa Bagi");
            System.out.println("0. Keluar");
            System.out.print("Masukkan Pilihan anda (0/1/2/3/4/5) :");
            opsi = objek.scanner.nextLine();

            switch (opsi) {
                case "1":
                    objek.input();
                    System.out.printf("%.1f + %.1f = %.1f\n", angka1, angka2, angka1+angka2);
                    break;
                case "2":
                    objek.input();
                    System.out.printf("%.1f - %.1f = %.1f\n", angka1, angka2, angka1-angka2);
                    break;
                case "3":
                    objek.input();
                    System.out.printf("%.1f x %.1f = %.1f\n", angka1, angka2, angka1*angka2);
                    break;
                case "4":
                    objek.input();
                    System.out.printf("%.1f : %.1f = %.1f\n", angka1, angka2, angka1/angka2);
                    break;
                case "5":
                    objek.input();
                    System.out.printf("%.1f modulus %.1f = %.1f\n", angka1, angka2, angka1 % angka2);
                    break;
                case "0":
                    System.out.println("Keluar dari program");
                    objek.scanner.close();
                    System.exit(0);
                    break;
            
                default:
                    System.out.println("Input tidak valid");
                    continue;
            }
        }while(!opsi.isEmpty());
        // System.out.println("Keluar dari program");
        
        
        
        
    }
    
}