/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listanumeros;

import java.util.Scanner;

/**
 *
 * @author Enrique
 */
public class ListaNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("GENERA UNA LISTA DE NÚMEROS DADO EL RANGO DEFINIDO POR EL USUARIO");
        
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
                 int inicio, fin;
                  System.out.println("Ingresa el valor en que inicia el rango");
                  inicio=esc.nextInt();
                  System.out.println("Ingresa el valor en que finalará el rango");
                  fin=esc.nextInt();
                  
                 for(int x=inicio;x<=fin;x++)
                 {
                     System.out.println(x);              
                   }
                 
                 System.out.println("-------------------------");
                 break;
             case 2:
                 System.out.println("Has seleccionado la opción 2: While");
                 //System.out.println("Indica la tabla de multiplicar");
                 // tabla=esc.nextInt();
                 int inicio1, fin1;
                System.out.println("Ingresa el valor en que inicia el rango");
                  inicio1=esc.nextInt();
                  System.out.println("Ingresa el valor en que finalará el rango");
                  fin1=esc.nextInt();
                 int x=inicio1;
                 while(x<=fin1){
                     
                    // System.out.println("ingrese número"+e);
                     x++;
                     System.out.println(x);
                      
             }
                // System.out.println("El número mayor es: "+mayor1);
                // System.out.println("El número menor es: "+menor1);
                 System.out.println("-------------------------");
                 break;
             case 3:
                 System.out.println("Has seleccionado la opción 3: Do while");
                 int inicio2, fin2;
                 System.out.println("Ingresa el valor en que inicia el rango");
                  inicio2=esc.nextInt();
                  System.out.println("Ingresa el valor en que finalará el rango");
                  fin2=esc.nextInt();
                
                 int x1=inicio2;
                
               do{
                    //System.out.println(tabla+"X"+o+"="+tabla*o);
                     x1++;
                     System.out.println(x1);
                      
             }while(x1<=fin2);
               
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