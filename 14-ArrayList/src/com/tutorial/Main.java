package com.tutorial;
import java.util.ArrayList;
import java.util.Comparator;
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> angka = new ArrayList<>();
        angka.add(1);
        angka.add(6);
        angka.add(5);

        // konversi string ke int menggunakan method Integer.parseInt()
        // String angka2 = "123";
        // int angka3 = Integer.parseInt(angka2);
        // angka.add(angka3);
        // System.out.println(angka.toString());

        // Menetapkan suatu value dengan indeks yang diberikan
        // angka.set(2, 15);
        // System.out.println(angka.toString());

        // MENCETAK ELEMEN BERDASARKAN INDEKS YANG DIBERIKAN
        // System.out.println(angka.get(0));

        // HAPUS ELEMEN BERDASARKAN INDEKS YANG DIBERIKAN
        // angka.remove(2);
        // System.out.println(angka.toString());

        // HAPUS ELEMEN BERDASARKAN VALUE
        // angka.remove(Integer.valueOf(1));
        // System.out.println(angka.toString());


        // for(int i = 0; i <= 10; i++){
        //     angka.add(i);
        // }

        // MENDUPLIKAT ARRAYLIST 
        // ArrayList<Integer> angkaClone = (ArrayList<Integer>)angka.clone(); //CASTING DARI OBJEK KE ARRAY LIST

        // MEMBANDINGKAN KESAMAAN ELEMEN KEDUA ARRAY LIST
        // System.out.println(angkaClone.equals(angka)); //true
        // System.out.println(angkaClone);

        // MENGURUTKAN ARRAYLIST
        // angka.sort(Comparator.naturalOrder()); // ascending
        // System.out.println(angka.toString());
        // angka.sort(Comparator.reverseOrder()); // descending
        // System.out.println(angka.toString());

        // MENYIMPAN ELEMEN YANG SAMA DARI DUA ARRAYLIST
        ArrayList <Integer> angka2 = new ArrayList<>();
        angka2.add(2);
        angka2.add(3);
        angka2.add(5);
        angka2.add(123);

        // Menyimpan elemen yang sama
        // angka.retainAll(angka2);
        // System.out.println(angka.toString());

        angka.forEach(item -> {
            item = item + 2;
            System.out.printf("%d, ",item);
        });
        // System.out.println(angka.toString());













    
        // BELUM PAHAM AKU WAK🧐. KOK MANGGIL LIST AMA ARRAY LIST SIH
        // List<String> list = new ArrayList();

        // list.add("Hello");
        // list.add("World");

        // String str = (String) list.get(1);

        // System.out.println("String: " + str);

        

    }

}