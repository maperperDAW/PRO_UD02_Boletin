/*
* Escribe un programa que permita ir introduciendo una serie indeterminada de 
* números mientras su suma no supere el valor 10000. Cuando esto último ocurra,
* se debe mostrar el total acumulado, el contador de los números introducidos
* y la media.
 */
package pro_ud02_boletin;

import java.util.Scanner;

public class Ejercicio11 {
    
    public static void main(String[] args){
        int num = 0;
        float suma = 0;
        int contador = 0;
        boolean flag = true;
        Scanner teclado = new Scanner(System.in);
        
        // Ver si el primer número cumple con la condición de ser menor que 10000.
        while ( flag ){
            System.out.print("Introduzca un número menor que 10000: ");
            num = teclado.nextInt();
            suma += num;
            if ( num < 10000 ){
                flag = false;
                contador += 1;
            }else{
                suma = 0;
            }
        }
     
         while ( suma < 10000 ){
            System.out.print("Introduzca un número: ");
            num = teclado.nextInt();
            suma += num;
            contador += 1;
        }
         
        if ( suma > 10000 ){
            suma -= num;
            contador -= 1;
        }
        
        System.out.print("El total acumulado es: " + suma + ".\nLa media de los "
                + "números introducidos es: " + suma /( (float) contador) + ".\n"
                + "La cantidad de números introducidos es de: " + contador + ".\n"); 
        
    }
}
