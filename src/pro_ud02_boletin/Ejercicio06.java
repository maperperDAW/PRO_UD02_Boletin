/*
* Escribe un programa que obtenga los números enteros comprendidos entre dos 
* números introducidos por teclado y validados como distintos, el programa debe
* empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.
 */
package pro_ud02_boletin;

import java.util.Scanner;


     
public class Ejercicio06 {
     public static void main(String[] args) {
        int lim_inf; //Límite inferior
        int lim_sup; //Límite superior
        int incr;  // Variable para contar de 7 en 7.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número como límite inferior: ");
        lim_inf = teclado.nextInt();
        incr = lim_inf;
         
        System.out.print("Introduzca un número como límite superior: ");
        lim_sup = teclado.nextInt();
         
        while ( lim_sup <= lim_inf ){
            System.out.print("El número introducido como límite superior"
                     + " no es estrictamente mayor que el límite inferior.\n");
            System.out.print("Introduzca un número como límite superior: ");
            lim_sup = teclado.nextInt();
         }
        System.out.print("La lista desde " + lim_inf + " de 7 en 7 hasta " + 
                lim_sup + " será: \n");
        while ( incr <= lim_sup ){
            System.out.print( incr + " ");
            incr += 7;
        }
        System.out.print("\n");
     }
    
}
