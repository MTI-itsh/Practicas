/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeromayorde3;

/**
 *
 * @author TEC HUAUCHINANGO 9
 */
import java.util.Scanner;
public class NumeroMayorde3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   System.out.println("COMPARA 3 NÚMEROS E INDICA CUAL ES EL MAYOR");
        Scanner esc = new Scanner(System.in);
    int N1,N2,N3;
    System.out.println("Introduce el primer número");
    N1=esc.nextInt();
    System.out.println("Introduce el segundo número");
    N2=esc.nextInt();
    System.out.println("Introduce el tercer número");
    N3=esc.nextInt();
    
    if(N1>N2)
    {
        if(N1>N3)
    {
     System.out.println("El número Mayor es: "+N1);
    }
        else
        {
            System.out.println("El número Mayor es: "+N3);
        }
    }
        else if (N2>N3)
        {
            System.out.println("El número Mayor es: "+N2);
        }
     else{System.out.println("El número Mayor es: "+N3);
        }
    
    }
    }
    
