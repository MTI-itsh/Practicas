/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros1.pkg100;

import java.util.Scanner;

/**
 *
 * @author Enrique
 */
public class Numeros1100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("MUESTRA LOS NÚMEROS DEL 1 AL 100 SEGÚN LA ESTRUCTURA ITERATIVA");
        
        // TODO code application logic here
        Scanner esc=new Scanner(System.in);
        boolean salir = false;
        int opcion;
         while(!salir){
         System.out.println("1) For");
         System.out.println("2) While");
         System.out.println("3) Do while");
         System.out.println("4) Salir");
         
         
         System.out.println("Selecciona una de las opciones");
         opcion=esc.nextInt();
                 
         switch(opcion){
             case 1: 
                 System.out.println("Has seleccionado la opción 1: For");
                 //System.out.println("Ingresa el valor del lado");
                // System.out.println("Números del 1 al 100:");
                 for(int i=1;i<=100;i++)
                 System.out.println(i);
                  System.out.println("-------------------------");
                 break;
             case 2:
                 System.out.println("Has seleccionado la opción 2: While");
                 System.out.println("Números del 1 al 100:");
                 int e=1;
                 while(e<=100){
                     System.out.println(e);
                     e++;
                      System.out.println("-------------------------");
             }
                 break;
             case 3:
                 System.out.println("Has seleccionado la opción 3: Do while");
                 System.out.println("Números del 1 al 100:");
                 int o=1;
                 
               do{
                     System.out.println(o);
                     o++;
             }while(o<=100);
                System.out.println("-------------------------");
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
