/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplo8;

/**
 *
 * @author TEC HUAUCHINANGO 9
 */
import java.util.Scanner;
public class Multiplo8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("VERIFICA SI EL NÚMERO INGRESADO ES MULTIPLO DE 8");
        Scanner esc=new Scanner(System.in);
        int N,resultado;
        System.out.println("Introduce un número entero");
          N=esc.nextInt();
          resultado=N%8;
          
          if (resultado==0)
        {
            System.out.println("El número"+N+" ES multiple de 8");}
           
            else
            {
            System.out.println("El número "+N+" NO es multiple de 8");
        
        }
        
    }
    
}
