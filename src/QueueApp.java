
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author M S I
 */
public class QueueApp {

    public static void main(String[] args) {

        Queue coba = new Queue();
        coba.insert("nabila", "Hubba boba", 15000, 1, "15000", 15000, "0", "13 desember 2022");
        coba.insert("amel", "Tea Top", 25000, 2, "50000", 50000, "0", "13 desember 2022");
        coba.insert("lila", "Tea Party Club", 30000, 3, "90000", 100000, "10000", "13 desember 2022");
        coba.insert("andi", "Hubba Boba", 15000, 1, "15000", 15000, "0", "13 desember 2022");
        coba.insert("dirga", "Tea Top", 25000, 2, "50000", 50000, "0", "13 desember 2022");
        coba.insert("cinta", "Tea Party Club", 30000, 3, "90000", 100000, "10000", "13 desember 2022");
        coba.insert("anggi", "Hubba Boba", 15000, 1, "15000", 20000, "5000", "13 desember 2022");
        coba.insert("laily", "Tea Top", 25000, 2, "50000", 50000, "0", "13 desember 2022");
        coba.insert("miqdad", "Tea Party Club", 30000, 3, "90000", 100000, "10000", "13 desember 2022");
        coba.insert("putri", "Hubba boba", 15000, 3, "45000", 50000, "5000", "13 desember 2022");
        coba.display();

        System.out.println(" ");
        System.out.println("Jumlah seluruh data antrian  ");
        System.out.println(coba.getSize());

        coba.dequeue();
        coba.display();

        System.out.println(" ");
        System.out.println("Nama customer yang berada pada antrian awal ");
        System.out.println(coba.peek().getNama_pemesan() + " >> berada pada antrian awal ");

        System.out.println(" ");
        System.out.println("Jumlah seluruh data antrian  ");
        System.out.println(coba.getSize());
    }

}
