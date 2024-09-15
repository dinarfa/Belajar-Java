package com.tutorial;
// import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Definisikan lirik lagu dalam array
        String[] lyrics = {
            "Twinkle, twinkle, little star,",
            "How I wonder what you are!",
            "Up above the world so high,",
            "Like a diamond in the sky.",
            "Twinkle, twinkle, little star,",
            "How I wonder what you are!"
        };

        // Panggil metode untuk mencetak lirik dengan jeda
        singSong(lyrics, 2000); // Jeda 2000 ms (2 detik)
    }

    // Metode untuk mencetak lirik dengan jeda
    public static void singSong(String[] lyrics, int delay) {
        for (String line : lyrics) {
            System.out.println(line);
            try {
                Thread.sleep(delay); // Menunda eksekusi selama beberapa milidetik
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
