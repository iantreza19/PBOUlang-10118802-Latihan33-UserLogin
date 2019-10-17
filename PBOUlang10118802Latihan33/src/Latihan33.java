
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IantReza
 */
public class Latihan33 {
    
    private static String usName;
    private static String passWord;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Username = ");
        usName = scanner.next();

        System.out.print("Masukkan Password = ");
        passWord = scanner.next();

        User cek = new User();
        cek.pengecekkanLogin(usName,passWord);
        
    }
    
}
