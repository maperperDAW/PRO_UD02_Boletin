/*    ENUNCIADO
 * Escribe un programa que lea una lista de diez números y determine cuántos son
 * positivos, y cuántos son negativos.
 */
package pro_ud02_boletin;

/**
 *
 * @author miguel-angel
 */

import java.util.Scanner;

public class Ejercicio01 {

    
    public static void main(String[] args) {
        int contador_pos = 0;
        int contador_neg = 0;
        int num;

        Scanner teclado = new Scanner(System.in);
        
        for ( int i = 1; i <= 10; i++ ){
            System.out.print("Introduzca un número entero: ");
            num = teclado.nextInt();
            if ( num > 0 ){
                contador_pos += 1;
            }else if ( num < 0 ){
                contador_neg += 1;
            }
        }        
        System.out.print("La cantidad de números positivos es de " + contador_pos
                + " y la de números negativos es de " + contador_neg + ".\n");
    }
    
}
