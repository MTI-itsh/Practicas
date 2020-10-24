/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

/**
 *
 * @author Enrique
 */
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import java.util.Scanner;

public class Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("CALCULO DE ÁREAS Y PERIMETRO DE FIGURAS GEOMETRICAS");
        int area,perimetro;
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
                 int L;
                 System.out.println("Ingresa el valor del lado");
                  L=esc.nextInt();
                  
                  area= (int) Math.pow(L,2);
                  perimetro= (L*4);
                  
                  System.out.println("El área del cuadrado es: "+area+" m2");
                  System.out.println("El perimetro del cuadrado es: "+perimetro+" m2");
                  System.out.println("----------------------------------------");
                   
                 break;
             case 2:
                 System.out.println("Has seleccionado la opción 2: Rectangulo");
                 int A,B;
                 System.out.println("Ingresa el valor de la altura");
                  A=esc.nextInt();
                  System.out.println("Ingresa el valor de la base");
                  B=esc.nextInt();
                  
                  area= (B*A);
                  perimetro= ((2*A)+(2*B));
                  
                  System.out.println("El área del rectangulo es: "+area+" m2");
                  System.out.println("El perimetro del rectangulo es: "+perimetro+" m2");
                  System.out.println("----------------------------------------");
                 break;
             case 3:
                 System.out.println("Has seleccionado la opción 3: Circulo");
                 float R;
                 
                 System.out.println("Ingresa el valor del radio");
                  R=esc.nextFloat();
                                    
                  area=  (int) ((2*3.1416)*R);
                  perimetro=  (int) (3.1416*(Math.pow(R, 2)));
                  
                  System.out.println("El área del circulo es: "+area+" m2");
                  System.out.println("El perimetro del circulo es: "+perimetro+" m2");
                  System.out.println("----------------------------------------");
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
