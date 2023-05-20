/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author M S I
 */
public class LoginApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Array app=new Array();
        Scanner coba=new Scanner(System.in);
        System.out.println("Masukkan nama : ");
        String nama=coba.nextLine();
        System.out.println("Masukkan password : ");
        String password=coba.nextLine();
        
        app.insert(nama, password);
        app.ceklogin(nama, password);
        
        
        
        
    }
    
}
