/*
* Realiza un programa que sume los 100 números siguientes a un número entero
* y positivo introducido por teclado. Se debe comprobar que el dato introducido
* es correcto (que es un número positivo).
 */
package pro_ud02_boletin;

/**
 *
 * @author miguel-angel
 */

 import java.util.Scanner;

public class Ejercicio05 {
     public static void main(String[] args) {
        int num = 0;
        int suma = 0;
        boolean flag = true;
        Scanner teclado = new Scanner(System.in);
        
        while ( flag ){
            System.out.print("Introduzca un número entero y positivo: ");
            num = teclado.nextInt();
            flag = num < 0;
        }

        suma = num;
        for ( int ii = 1; ii <= 100; ii++){
            suma = suma + num + ii;
        }
        /* Se podría hacer usando la fórmula de la progresión aritmética:
        suma = (2 * num + 100)/2 * 100;
        */
        
    System.out.print("La suma desde " + num + " hasta " + (num+100) + " es " + 
            suma + ".\n");    
    }
}
