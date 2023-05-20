/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M S I
 */
public class antrian {
    private String nama_pemesan;
    private String nama_menu;
    private int harga;
    private int jumlah;
    private int total_harga;
    private int uang;
    private int kembalian;
    private int nomor_antri;

    public antrian(String nama_pemesan, String nama_menu, int harga, int jumlah, int total_harga, int uang, int kembalian, int nomor_antri) {
        this.nama_pemesan = nama_pemesan;
        this.nama_menu = nama_menu;
        this.harga = harga;
        this.jumlah = jumlah;
        this.total_harga = total_harga;
        this.uang = uang;
        this.kembalian = kembalian;
        this.nomor_antri = nomor_antri;
    }

    public String getNama_pemesan() {
        return nama_pemesan;
    }

    public void setNama_pemesan(String nama_pemesan) {
        this.nama_pemesan = nama_pemesan;
    }

    public String getNama_menu() {
        return nama_menu;
    }

    public void setNama_menu(String nama_menu) {
        this.nama_menu = nama_menu;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(int total_harga) {
        this.total_harga = total_harga;
    }

    public int getUang() {
        return uang;
    }

    public void setUang(int uang) {
        this.uang = uang;
    }

    public int getKembalian() {
        return kembalian;
    }

    public void setKembalian(int kembalian) {
        this.kembalian = kembalian;
    }

    public int getNomor_antri() {
        return nomor_antri;
    }

    public void setNomor_antri(int nomor_antri) {
        this.nomor_antri = nomor_antri;
    }
    
    
}
