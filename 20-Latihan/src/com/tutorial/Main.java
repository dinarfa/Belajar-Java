package com.tutorial;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Tabungan user1 = new Tabungan("Dinar Fauziah", 50000);
        System.out.printf("\nHalo Saudari %s, Saldo kamu saat ini adalah Rp%d.\n", user1.getNamaUser(), user1.getSaldoUser());
        user1.ambilUang(20000);
        System.out.printf("Kamu akan menarik saldo sebesar Rp%d. Ketuk 'Selanjutnya' untuk menyetujui.\n", user1.getAmbilUang());
        System.out.printf("\nHalo Saudari %s, Saldo kamu saat ini adalah Rp%d.\n", user1.getNamaUser(), user1.getSaldoUser());
    }
}