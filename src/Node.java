/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M S I
 */
public class Node {

    private String nama_pemesan;
    private String nama_menu;
    private int harga;
    private int jumlah;
    private String total_harga;
    private int uang;
    private String kembalian;
    private String tanggal;
    public Node next = null;

    public Node(String nama_pemesan, String nama_menu, int harga, int jumlah, String total_harga, int uang, String kembalian, String tanggal) {
        this.nama_pemesan = nama_pemesan;
        this.nama_menu = nama_menu;
        this.harga = harga;
        this.jumlah = jumlah;
        this.total_harga = total_harga;
        this.uang = uang;
        this.kembalian = kembalian;
        this.tanggal = tanggal;
        this.next = null;
    }

    Node(String nama_pemesan) {
        this.nama_pemesan = nama_pemesan;
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

    public String getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(String total_harga) {
        this.total_harga = total_harga;
    }

    public int getUang() {
        return uang;
    }

    public void setUang(int uang) {
        this.uang = uang;
    }

    public String getKembalian() {
        return kembalian;
    }

    public void setKembalian(String kembalian) {
        this.kembalian = kembalian;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public void displayQueue() {

        System.out.println("tanggal: " + tanggal + ", " + "nama: " + nama_pemesan + ", " + "menu: " + nama_menu + ", "
                            + "harga: " + harga + ", " + "jumlah: " + jumlah + ", " + "total harga: " + total_harga + ", "
                            + "uang: " + uang + "," + "kembalian: " + kembalian + ", ");

        System.out.print(" ");

    }

}
