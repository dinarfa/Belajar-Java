package com.tutorial;

/**
 * Main
 */
public class Main {


    public static void main(String[] args) {
        // Menggunakan method Variabel Argumen
        Siswa siswa1 = new Siswa("Dinar Fauziah", "2004-12-26");
        System.out.println(siswa1.umur());
        siswa1.itungNilai(80.5, 80, 90, 40, 90);
        System.out.println(siswa1.isPass());
        siswa1.isPass();
    }
}