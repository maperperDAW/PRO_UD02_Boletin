/*
Escribe un programa que pida un número entero positivo por teclado y que 
muestre a continuación los números desde el 1 al número introducido junto con
su factorial.
Ejemplo:
Por favor, introduzca un número entero positivo: 7
1! = 1
2! = 2
3! = 6
4! = 24
5! = 120
6! = 720
7! = 5040
 */
package pro_ud02_boletin;
/**
 *
 * @author miguel-angel
 */

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String args[]){
        long numero;
        long resultado = 1;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca un número entero positivo: ");
        numero = teclado.nextLong();
        
        for ( int ii = 1; ii <= numero; ii++ ){
            resultado = 1;
            for ( int kk = 1; kk <= ii; kk++ ){
                resultado = resultado * kk;
            }
            System.out.print(ii + "! = " + resultado + "\n");
        }
    }
    
}
