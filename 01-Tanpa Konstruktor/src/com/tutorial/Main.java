package com.tutorial;


// Membuat class sebagai template
class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}

public class Main{
    public static void main(String[] args) {

        // instansiasi/ membuat object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Dinar Fauziah";
        mahasiswa1.NIM = "F52123078";
        mahasiswa1.jurusan = "Teknik Informatika";
        mahasiswa1.IPK = 3.95;
        mahasiswa1.umur = 19;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Blackie";
        mahasiswa2.NIM = "F52123001";
        mahasiswa2.jurusan = "Teknik Informatika";
        mahasiswa2.IPK = 3.7;
        mahasiswa2.umur = 1;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);
    }

}


