/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombremes;

/**
 *
 * @author Enrique
 */
import java.util.Scanner;
public class NombreMes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("INTRODUCE UN NÚMERO DEL 1 AL 12 Y TE MOSTRARÁ EL MES CORRESPONDIENTE");
        Scanner esc = new Scanner(System.in);
        int N;
        System.out.println("Introduce un número de 1 al 12");
        N=esc.nextInt();
        
        if (N==1)
        {
            System.out.println("El mes es Enero");
            
        }
        
                else if (N==2)
        {
            System.out.println("El mes es Febrero");
        }
        else if (N==3)
        {
            System.out.println("El mes es Marzo");
        }
        else  if (N==4)
        {
            System.out.println("El mes es Abril");
        }
        else   if (N==5)
        {
            System.out.println("El mes es Mayo");
        }
        else    if (N==6)
        {
            System.out.println("El mes es Junio");
        }
        else     if (N==7)
        {
            System.out.println("El mes es Julio");
        }
         else     if (N==8)
        {
            System.out.println("El mes es Agosto");
        }
        else       if (N==9)
        {
            System.out.println("El mes es Septiembre");
        }
         else       if (N==10)
        {
            System.out.println("El mes es Octubre");
        }
         else        if (N==11)
        {
            System.out.println("El mes es Noviembre");
        }
        else if (N==12)
        {
            System.out.println("El mes es Diciembre");
        }
         else //if((N>0) || (N<12))
        {
            System.out.println("El dato que ingresaste no está dentro del rango solicitado");
        }
    }
    
}
