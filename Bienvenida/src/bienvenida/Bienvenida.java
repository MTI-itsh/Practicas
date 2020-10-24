/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bienvenida;

/**
 *
 * @author TEC HUAUCHINANGO 9
 */

import java.util.Scanner;
public class Bienvenida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner esc = new Scanner (System.in);
        String mensaje;
        System.out.println("Introduce un nombre");
        mensaje=esc.nextLine();
        System.out.println("Bienvenido(a):"+ mensaje);
    }
    
}
