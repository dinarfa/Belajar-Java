package com.tutorial;


// class tanpa constructor / class polos
class Polos{
    String dataString;
    int dataInterger;
}

// Class dengan constructor
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;

    // Constructor dipanggil saat object pertama kali dibuat
    // Mahasiswa(){
    //     System.out.println("Ini adalah constructor tanpa parameter");
        
    // }

    Mahasiswa(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println("Halo " + nama);
        System.out.println("NIM kamu adalah " + NIM);
        System.out.println("Jurusan kamu adalah " + jurusan + "\n");
    }
}



public class Main{
    public static void main(String[] args) throws Exception {

        // Mahasiswa mahasiswa1 = new Mahasiswa();
        // Bisa dipanggil juga seperti : 
        // new Mahasiswa();

        Mahasiswa mahasiswa1 = new Mahasiswa("Dinar", "F52123078", "Teknik Informatika");
        Mahasiswa mahasiswa2 = new Mahasiswa("Blackiee", "F52123079", "Teknik Informatika");
    }
}