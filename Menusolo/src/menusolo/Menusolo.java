/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menusolo;

/**
 *
 * @author Enrique
 */
import java.util.Scanner;
public class Menusolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("MENU DE OPCIONES");
        
        // TODO code application logic here
        Scanner esc=new Scanner(System.in);
        boolean salir = false;
        int opcion;
         while(!salir){
         System.out.println("1) Cuadrado");
         System.out.println("2) Rectangulo");
         System.out.println("3) Circulo");
         System.out.println("4) Salir");
         
         
         System.out.println("Selecciona una de las opciones");
         opcion=esc.nextInt();
         
         
         switch(opcion){
             case 1: 
                 System.out.println("Has seleccionado la opción 1: Cuadrado");
                 //System.out.println("Ingresa el valor del lado");
                               
                 break;
             case 2:
                 System.out.println("Has seleccionado la opción 2: Rectangulo");
                 
                 break;
             case 3:
                 System.out.println("Has seleccionado la opción 3: Circulo");
                
                 break;
             case 4:
                 System.out.println("Has seleccionado la opción 4");
                 salir=true;
                 break;
             default:
                 System.out.println("Solo números entre 1 y 4");
                                                  
         }
         }
       
                
    }
    }
    

