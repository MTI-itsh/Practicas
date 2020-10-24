/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayormenor10;

import java.util.Scanner;

/**
 *
 * @author Enrique
 */
public class MayorMenor10 {

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
                 int tabla,i,numero,mayor,menor;
                 mayor=-10000;
                 menor=10000;
                 //System.out.println("Ingrese número");
                  //tabla=esc.nextInt();
                             
                 for(i=1;i<=10;i++)
                 {
                     System.out.println("Ingrese número"+i+":");
                     numero = esc.nextInt();
                     if(numero>mayor){mayor=numero;}
                     if(numero<menor){menor=numero;}                 
                   }
                 System.out.println("El número mayor es: "+mayor);
                 System.out.println("El número menor es: "+menor);
                 System.out.println("-------------------------");
                 break;
             case 2:
                 System.out.println("Has seleccionado la opción 2: While");
                 //System.out.println("Indica la tabla de multiplicar");
                 // tabla=esc.nextInt();
                 int numero1,mayor1,menor1;
                 mayor1=-10000;
                 menor1=10000;
                 int e=1;
                 while(e<=10){
                     
                    // System.out.println("ingrese número"+e);
                     e++;
                     System.out.println("ingrese número"+e);
                      numero1 = esc.nextInt();
                      if(numero1>mayor1){mayor1=numero1;}
                     if(numero1<menor1){menor1=numero1;}  
             }
                 System.out.println("El número mayor es: "+mayor1);
                 System.out.println("El número menor es: "+menor1);
                 System.out.println("-------------------------");
                 break;
             case 3:
                 System.out.println("Has seleccionado la opción 3: Do while");
                 //System.out.println("Indica la tabla de multiplicar");
                  //tabla=esc.nextInt();
                 int numero2,mayor2,menor2;
                 mayor2=-10000;
                 menor2=10000;
                 int o=1;
                
               do{
                    //System.out.println(tabla+"X"+o+"="+tabla*o);
                     o++;
                     System.out.println("ingrese número"+o);
                     numero2 = esc.nextInt();
                      if(numero2>mayor2){mayor2=numero2;}
                     if(numero2<menor2){menor2=numero2;} 
             }while(o<=10);
               System.out.println("El número mayor es: "+mayor2);
                 System.out.println("El número menor es: "+menor2);
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