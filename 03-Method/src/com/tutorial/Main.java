package com.tutorial;


class Mahasiswa {
    // Data member
    String nama;
    String NIM;
    

    // Constructor
    Mahasiswa(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;

    }

    // Method tanpa return dan tanpa parameter
    void data(){
     System.out.println("Nama : " + this.nama);   
     System.out.println("NIM : " + this.NIM);   
    }

    // Method tanpa return dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }

    // Method dengan return dan tanpa parameter
    String getNama(){
        return this.nama;
    }

    String getNIM(){
        return this.NIM;
    }

    // Method dengan return dan dengan parameter
    String sayHi(String pesan){
        return "Haloo " + this.nama + pesan;
    }


}


public class Main{
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Dinar Fauziah", "F52123078");
        mahasiswa1.data();
        mahasiswa1.setNama("Blackie");
        mahasiswa1.data();
        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String sayIt = mahasiswa1.sayHi(" Apa kabar?");
        System.out.println(sayIt);
    }
}


