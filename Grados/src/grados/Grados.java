/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grados;

/**
 *
 * @author TEC HUAUCHINANGO 9
 */
import java.util.Scanner;
public class Grados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("CONVIERTE GRADOS CENTIGRADOS A FARENHEIT");
        Scanner esc = new Scanner(System.in);
        double gradoc, gradof;
        System.out.println("Ingresa los grados centigrados:");
        gradoc=esc.nextDouble();
        gradof=((gradoc*9)/5)+32;
        System.out.println("La conversión de los "+gradoc+"grados centigrados es"+gradof+"farenheit");
        
    }
    
}
