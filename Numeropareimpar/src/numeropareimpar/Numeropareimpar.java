/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeropareimpar;

/**
 *
 * @author TEC HUAUCHINANGO 9
 */
import java.util.Scanner;
public class Numeropareimpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("VERIFICA SI EL NÚMERO INGRESADO ES PAR O IMPAR");
        Scanner esc=new Scanner(System.in);
        int N;
        System.out.println("Introduce un número");
        N=esc.nextInt();
        if (N%2==0)
        {
            System.out.println("El número"+N+" es par");}
           
            else
            {
            System.out.println("El número "+N+" es impar");
        
        }
        
    }
    
}
