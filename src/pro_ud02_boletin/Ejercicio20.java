/*
Escribe un programa que pida dos números por teclado y que luego mezcle en dos 
números diferentes los dígitos pares y los impares. Se van comprobando los 
dígitos de la siguiente manera: primer dígito del primer número, primer dígito 
del segundo número, segundo dígito del primer número, segundo dígito del segundo
número, tercer dígito del primer número… Para facilitar el ejercicio, podemos 
suponer que el usuario introducirá dos números de la misma longitud y que 
siempre habrá al menos un dígito par y uno impar. Usa long en lugar de int 
donde sea necesario para admitir números largos.

Ejemplo 1:
Por favor, introduzca un número: 9402
Introduzca otro número: 6782
El número formado por los dígitos pares es 640822
El número formado por los dígitos impares es 97
 */
package pro_ud02_boletin;
/**
 *
 * @author miguel-angel
 */

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String args[]){
        int lon;
        int numero_1;
        int numero_1_aux;
        int numero_2;
        int numero_2_aux;
        int divisor = 1;
        int divisor_aux;
        int cont = 0;
        int cifra1;
        int cifra2;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca un número: ");
        numero_1 = teclado.nextInt();
        System.out.print("Introduzca otro número: ");
        numero_2 = teclado.nextInt();

        
        while ( (numero_1 / divisor) > 0 ){
            divisor = divisor * 10;
            cont += 1;
        }
        divisor_aux = divisor/10;
        numero_1_aux = numero_1;
        numero_2_aux = numero_2;
        System.out.print("El número formado por los dígitos pares es:  ");
        
        for ( int ii = 0; ii < cont; ii++ ){
            cifra1 = numero_1_aux/divisor_aux;
            cifra2 = numero_2_aux/divisor_aux;
            if ( cifra1 % 2 == 0 ){
                System.out.print(cifra1);
            }
            if ( cifra2 % 2 == 0 ){
                System.out.print(cifra2);
            }
            numero_1_aux = numero_1_aux - cifra1 * divisor_aux;
            numero_2_aux = numero_2_aux - cifra2 * divisor_aux;
            divisor_aux = divisor_aux / 10;
        }
        System.out.print("\n");
        
        divisor_aux = divisor/10;
        numero_1_aux = numero_1;
        numero_2_aux = numero_2;
        System.out.print("El número formado por los dígitos impares es:  ");
        
        for ( int ii = 0; ii < cont; ii++ ){
            cifra1 = numero_1_aux/divisor_aux;
            cifra2 = numero_2_aux/divisor_aux;
            if ( cifra1 % 2 != 0 ){
                System.out.print(cifra1);
            }
            if ( cifra2 % 2 != 0 ){
                System.out.print(cifra2);
            }
            numero_1_aux = numero_1_aux - cifra1 * divisor_aux;
            numero_2_aux = numero_2_aux - cifra2 * divisor_aux;
            divisor_aux = divisor_aux / 10;
        }
        System.out.print("\n");
    }
}
