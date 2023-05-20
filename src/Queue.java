
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author M S I
 */
public class Queue {

    private Node rear;
    private Node front;
    private int size;

    public Queue() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        boolean response = false;
        if (size == 0) {
            response = true;
        }
        return response;
    }

    public void insert(String nama_pemesan, String nama_menu, int harga, int jumlah, String total_harga, int uang, String kembalian, String tanggal) {
        Node newNode = new Node(nama_pemesan, nama_menu, harga, jumlah, total_harga, uang, kembalian, tanggal);
        if (rear == null) {
            front = rear = newNode;
             size++;
            return;
        }
        rear.next = newNode;
        rear = newNode;
       size++;
    }

    

    public Node dequeue() {
        Node response = null;
        if (front != null) {
            if (front.next != null) {
                response = new Node(front.getNama_pemesan());
                front = front.next;
                size--;
            } else {
                response = new Node(front.getNama_pemesan());
                front = null;
                rear = null;
                size--;
            }
        }
        return response;
    }

    public Node peek() {
        Node response = null;
        if (!isEmpty()) {
            response = new Node(front.getNama_pemesan());
        }
        return response;
    }

    public int kembalian(int harga, int jumlah, int uang) {

        return uang - (harga * jumlah);
    }

    public int hitung(int harga, int jumlah) {

        return harga * jumlah;
    }

    public int getSize() {
        return size;
    }

    public void display() {
        System.out.println("\n(List antrian >>front-->rear");
        //  String output="List antrian ";
        Node currentQueue = front;
        while (currentQueue != null) {

            currentQueue.displayQueue();
            currentQueue = currentQueue.next;
        }
    }

}
