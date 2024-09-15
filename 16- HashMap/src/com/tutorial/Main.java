package com.tutorial;
import java.util.HashMap;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        HashMap <String, Double> prices = new HashMap<>();
       
        prices.put("Apple", 1.9);
        prices.put("Grapes", 1.5);
        prices.put("Orange", 2.0);

        // Jika elemen tidak ada, maka akan diisi
        // prices.putIfAbsent("Tomato", 1.4);
        // prices.putIfAbsent("Milk", 2.5);

        // Method get(key) untuk menampilkan value
        // System.out.println(prices.get("Milk"));
        // System.out.println(prices.toString());
        
        // Jika key tidak ada pada HashMap, maka akan dikeluarkan default value. Harus ikuti tipe data
        // System.out.println(prices.getOrDefault("Onion", 2.8));
        
        // Metode replace(key, value) untuk mengupdate value di HashMap
        // prices.replace("Orange", 3.0);
        // System.out.println(prices.toString());
        
        // Method remove(key) untuk menghapus elemen
        // prices.remove("Tomato");
        // System.out.println(prices.toString());
        
        // Method size() untuk mengetahui jumlah elemen dalam HashMap
        // System.out.println(prices.size());
        
        // Method clear() untuk menghapus semua elemen dalam HashMap
        // prices.clear();
        // System.out.println(prices.toString());

        // Menambahkan elemen lebih dari 1 sekaligus
        // HashMap <String, Double> morePrices = new HashMap<>();
        // morePrices.put("Grapes", 3.0);
        // morePrices.put("Cherry", 0.8);
        // prices.putAll(morePrices);
        System.out.println(prices.toString());
        
        // Mengganti elemen lebih dari 1 sekaligus
        // prices.replaceAll((fruit, price) -> price * 2);
        // System.out.println(prices.toString());

        // Mengecek apakah hashmap memiliki elemen berdasarkan key atau value
        System.out.println(prices.containsKey("Apple"));
        System.out.println(prices.containsValue(2.0));
        
        // Mengecek apakah hashmap kosong atau tidak
        System.out.println(prices.isEmpty());

        // Melakukan aksi pada semua elemen dalam hash Map
        System.out.println("Prices after discounts");
        prices.forEach((fruits, price) -> {
            // System.out.printf("%s : %.2f\n", fruits, price - 0.5);
            System.out.println(fruits + " : " + (price - 0.5));
        });


    }
}
