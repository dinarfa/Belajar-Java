package com.tutorial;

class Buku{
    String judul;
    String penulis;

    Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }

    void display(){
        System.out.println("\nPenulis\t: "+ this.penulis);
        System.out.println("Judul\t: "+ this.judul);
    }
}
public class Main {

    
    public static void main(String[] args) {
        Buku buku1 = new Buku("The Queen of Dragons", "Dinar Fauziah");
        buku1.display();
        
        // Menampilakan address
        String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressBuku1);
        
        // Assignment object
        Buku buku2 = buku1;
        buku2.display();
        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println(addressBuku2); 
        // Address nya akan sama karena object buku2 mengacu pada reference yang sama dengan buku1
        
        buku1.judul = "The Lord of Rings";
        buku1.display();
        buku2.display(); // buku2 juga akan berubah mengikuti buku1 karena mereka memiliki reference yang sama

        // Kita akan memasukkan object ke dalam methods
        fungsi(buku1);
        buku1.display();
        buku2.display();
        
        
    }
    
    public static void fungsi(Buku dataBuku){
        String addressDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("Address dalam fungsi " + addressDataBuku);
        dataBuku.penulis = "Dinaro";
        
    }

}
