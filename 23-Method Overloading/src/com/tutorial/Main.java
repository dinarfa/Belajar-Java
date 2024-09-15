package com.tutorial;

public class Main {


    public static void main(String[] args) {
        Siswa siswa1 = new Siswa("Dinar Fauziah", "2004-12-26");
        
        // Method Overloading
        Siswa siswa2 = new Siswa("Fahmi Said", "2003-04-17", 80, 90, 70, 86.5, 68.5);
        System.out.println(siswa1.umur());
        System.out.println(siswa2.umur());
        
        siswa1.itungNilai(80.5, 80, 90, 40, 90); // Menggunakan method Variabel Argumen
        System.out.println(siswa1.isPass());
        System.out.println(siswa2.isPass()); 
    }
}