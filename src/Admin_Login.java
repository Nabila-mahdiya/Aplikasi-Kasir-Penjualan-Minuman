/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M S I
 */
public class Admin_Login {
    private String nama;
    private String password;

    public Admin_Login(String nama, String password) {
        this.nama = nama;
        this.password = password;
    }

   

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void display(){
        System.out.println("nama "+nama);
        System.out.println("Password "+password);
        
        System.out.println(" ");
    }
    
}
