/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista5numeros;

/**
 *
 * @author TEC HUAUCHINANGO 9
 */
import java.util.Scanner;
public class Lista5numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner esc=new Scanner(System.in);
        int LN;
        System.out.print("Introduzca un número con 5 cifras:");
        LN=esc.nextInt();
        System.out.println(LN/10000);
        System.out.println(LN/1000);
        System.out.println(LN/100);
        System.out.println(LN/10);
        System.out.println(LN);
        
    }
    
}
