package com.tutorial;
import java.time.Period;
import java.time.LocalDate;

// Method Overloading adalah kemampuan membuat method dengan nama yang sama lebih dari sekali.
// Syaratnya, data parameter di method tersebut harus berbeda-beda, entah jumlah atau tipe data nya.
// Jika ada yang sama, program kita akan eror

public class Siswa {
    String nama;
    LocalDate tanggalLahir;
    double totalNilai;
    double[] nilai;

    Siswa(String nama, String tanggalLahir){
        this.nama = nama;
        this.tanggalLahir = LocalDate.parse(tanggalLahir);
    }
    
    // Method Overloading. 
    Siswa(String nama, String tanggalLahir, double... nilai){
        this.nama = nama;
        this.tanggalLahir = LocalDate.parse(tanggalLahir);
        this.nilai = nilai;
    }

    public String umur(){
        return String.format("Umur siswa %s adalah %d tahun.\n", nama, Period.between(this.tanggalLahir, LocalDate.now()).getYears());
    }

    // Menggunakan method variabel argumen. harus pakai simbol titik(.) sebanyak 3 setelah tipe data. 
    // nanti saat di beri argumen tidak perlu pakai simbol lain. Langsung nilainya saja. Lihat file Main.java
    void itungNilai(double...nilai){
        this.nilai = nilai;
        double total = 0;
        for(var i : this.nilai){
            total += i;
        }

        this.totalNilai = total / nilai.length;
        System.out.println("Nilai = " + this.totalNilai);
    }

    String isPass(){
        return this.totalNilai >= 75 ? String.format("Selamat %s, kamu lulus!",this.nama) : String.format("Maaf %s, kamu tidak lulus.",this.nama);
    }

}
