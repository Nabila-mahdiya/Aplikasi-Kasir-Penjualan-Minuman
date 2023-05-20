

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author M S I
 */
public class Array {

    private Admin_Login[] arr=new Admin_Login[10];
    private int nElemen;
    int MAX=10;
  
    public Array() {
        this.arr = arr;
        nElemen = 0;

    }
    public void insert(String nama,String password){
         arr[nElemen] = new Admin_Login(nama, password);
         nElemen++;
    }
    public void ceklogin(String nama, String password) {

        try {
            if (nama.equals("Admin") || password.equals("jcjelly")) {
                new Admin().setVisible(true);

                //   dispose();
            } else if (nama != "Admin" && password != "jcjelly") {
                JOptionPane.showMessageDialog(null, nama + " PASSWORD ANDA SALAH ", " Pesan error ", JOptionPane.ERROR_MESSAGE);
                // Username.requestFocus();
                // HapusLayar();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void displayArray(){
        for(int i=0;i<nElemen;i++){
            arr[i].display();
        }
        
    }
    
    

}
