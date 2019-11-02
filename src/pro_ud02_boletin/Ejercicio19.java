/*
Escribe un programa que, dado un número entero positivo, diga cuáles son y 
cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, 
de izquierda a derecha. Usa long en lugar de int donde sea necesario para 
admitir números largos.
Ejemplo 1:
Por favor, introduzca un número entero positivo: 94026782
Dígitos pares: 4 0 2 6 8 2
Suma de los dígitos pares: 22
 */
package pro_ud02_boletin;
/**
 *
 * @author miguel-angel
 */

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String args[]){
        int numero;
        int numero_aux;
        int cifra = 0;
        int divisor = 1;
        int divisor_aux;
        int cont = 0;
        int suma_pares = 0;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca un número entero positivo: ");
        numero = teclado.nextInt();
        
        while ( (numero / divisor) > 0 ){
            divisor = divisor * 10;
            cont++;
        }
        divisor_aux = divisor/10;
        numero_aux = numero;
        System.out.print("Dígitos pares: ");
        for ( int ii = 0; ii < cont; ii++ ){

            cifra = numero_aux/divisor_aux;
            if ( cifra % 2 == 0 ){
                System.out.print(cifra + " ");
                suma_pares += cifra;
            }
            numero_aux = numero_aux - cifra * divisor_aux;
            divisor_aux = divisor_aux / 10;
        }
        System.out.print("\n");
        System.out.print("Suma de los dígitos pares: " + suma_pares + ".\n");

            
    }
}

    