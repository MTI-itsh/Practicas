/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosusuario;

/**
 *
 * @author TEC HUAUCHINANGO 9
 */
import java.util.Scanner;
public class Numerosusuario {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce dos números enteros");
        Scanner esc = new Scanner(System.in);
        int numero1,numero2;
        System.out.println("Introduce el primer número entero");
        numero1 = esc.nextInt();
        System.out.println("Introduce el segundo número entero");
        numero2 = esc.nextInt();
        System.out.println("Número introducido:"+ numero1);
        System.out.println("Número introducido:"+ numero2);
    
    }
    
}
