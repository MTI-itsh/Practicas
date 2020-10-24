/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablasmultiplicar;

import java.util.Scanner;

/**
 *
 * @author Enrique
 */
public class TablasMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("MUESTRA EL NÚMERO MAYOR Y MENOR DE 10 NÚMEROS QUE REGISTRE");
        
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
                 int tabla,j;
                 
                 System.out.println("Indica la tabla de multiplicar: ");
                  tabla=esc.nextInt();
                             
                 for(j=1;j<=10;j++)
                 {
                     System.out.println(tabla+"X"+j+"="+tabla*j);
                     
                   }
                                 
                  System.out.println("-------------------------");
                 break;
             case 2:
                 System.out.println("Has seleccionado la opción 2: While");
                
                 System.out.println("Indica la tabla de multiplicar");
                  tabla=esc.nextInt();
                 int e=1;
                 while(e<=10){
                     
                     System.out.println(tabla+"X"+e+"="+tabla*e);
                     e++;
                      
             }
                 System.out.println("-------------------------");
                 break;
             case 3:
                 System.out.println("Has seleccionado la opción 3: Do while");
                 System.out.println("Indica la tabla de multiplicar");
                  tabla=esc.nextInt();
                 int o=1;
                
               do{
                    System.out.println(tabla+"X"+o+"="+tabla*o);
                     o++;
             }while(o<=10);
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