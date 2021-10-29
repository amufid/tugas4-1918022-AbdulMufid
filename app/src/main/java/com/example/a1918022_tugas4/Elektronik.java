package com.example.a1918022_tugas4;

public class Elektronik {
    private String nama,harga,kota;
    private int gambar;
    public Elektronik(String nama, String harga, String kota, int gambar) {
        this.nama = nama;
        this.harga = harga;
        this.kota = kota;
        this.gambar = gambar;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getHarga() {
        return harga;
    }
    public void setHarga(String harga) {
        this.harga = harga;
    }
    public String getKota() {
        return kota;
    }
    public void setKota(String kota) {
        this.kota = kota;
    }
    public int getGambar() {
        return gambar;
    }
    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
