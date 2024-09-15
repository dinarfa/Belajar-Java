package com.tutorial;

class Tabungan {
    private String nama;
    private int saldo;
    private int tarikSaldo;

    public Tabungan(String nama, int saldo){
        this.nama = nama;
        this.saldo = saldo;
    }

    public void ambilUang(int tarikSaldo){
        this.tarikSaldo = tarikSaldo;
        this.saldo -= tarikSaldo;
    }
    
    public int getAmbilUang(){
        return tarikSaldo;
    }

    public String getNamaUser(){
        return this.nama;
    }

    public int getSaldoUser(){
        return this.saldo;
    }
}
