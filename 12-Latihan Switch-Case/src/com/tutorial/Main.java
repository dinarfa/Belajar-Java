package com.tutorial;
import java.util.Scanner;


public class Main{
    static Scanner scanner = new Scanner(System.in);
    static double angka1;
    static double angka2;
    static void inputan(){
        System.out.print("Masukkan angka pertama : ");
        angka1 = scanner.nextDouble();
        System.out.print("Masukkan angka kedua : ");
        angka2 = scanner.nextDouble();

    }
    public static void main(String[] args) {
        while (true){

            System.out.println("\nKALKULATOR SEDERHANA");
    
            System.out.println("Pilihan Operasi :");
            System.out.println("1. Pertambahan");
            System.out.println("2. Perkalian");
            System.out.println("3. Pengurangan");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");
            System.out.print("Masukkan operasi yang ingin dilakukan : ");

            String operasi = scanner.next();
            operasi.toLowerCase();
            // if (operasi == "keluar") {
            //     System.out.println("Keluar dari program.");
            //     break;
            // }
            
            
            switch (operasi) {
                case "pertambahan":
                    inputan();
                    System.out.printf("Hasil penjumlahan dari %.2f + %.2f = %.2f\n", angka1, angka2, angka1 + angka2);
                    
                    break;
                case "perkalian":
                    inputan();
                    System.out.printf("Hasil penjumlahan dari %.2f * %.2f = %.2f\n", angka1, angka2, angka1 * angka2);
                    
                    break;
                case "pengurangan":
                    inputan();
                    System.out.printf("Hasil penjumlahan dari %.2f - %.2f = %.2f\n", angka1, angka2, angka1 - angka2);
                    
                    break;
                case "pembagian":
                    inputan();
                    if(angka2 == 0){
                        System.out.println("Tidak dapat dibagi dengan 0");
                        continue;
                    } else{
                        System.out.printf("Hasil penjumlahan dari %.2f / %.2f = %.2f\n", angka1, angka2, angka1 / angka2);
                    }
                break;

                case "keluar":
                    System.out.println("Keluar dari Program.\n");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Mohon masukkan input yang sesuai\n");
                    break;
            }
    
            
        }
    }
}