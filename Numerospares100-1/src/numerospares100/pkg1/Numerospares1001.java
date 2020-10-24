/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerospares100.pkg1;

import java.util.Scanner;

/**
 *
 * @author Enrique
 */
public class Numerospares1001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("MUESTRA LOS NÚMEROS PARES DEL 100 AL 1 SEGÚN LA ESTRUCTURA ITERATIVA");
        
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
                 for(int i=100;i>=1;i--)
                 if (i%2==0){
                     System.out.println(i);}
                 //int par;
                // par=(i%2);
                  System.out.println("-------------------------");
                 break;
             case 2:
                 System.out.println("Has seleccionado la opción 2: While");
                 System.out.println("Números del 100 al 1:");
                 int e=100;
                 while(e>=1){
                     if(e%2==0){
                     System.out.println(e);}
                     e--;
                      
             }
                 System.out.println("-------------------------");
                 break;
             case 3:
                 System.out.println("Has seleccionado la opción 3: Do while");
                 System.out.println("Números del 100 al 1:");
                 int o=100;
                
               do{
                  if(o%2==0){   System.out.println(o);}
                     o--;
             }while(o>=1);
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

    

