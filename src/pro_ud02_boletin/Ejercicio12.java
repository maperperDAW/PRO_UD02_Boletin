/*
* Escribe un programa que lea un número n e imprima una pirámide de números con
* n filas como en la siguiente figura:
* 1
* 121
* 12321
* 1234321
 */
package pro_ud02_boletin;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args){
        int altura;
        int jj;
        int kk;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca la altura de la pirámide: ");
        altura = teclado.nextInt();
        
        for ( int ii = 1; ii <= altura; ii++ ){
            for ( jj = 1; jj <= ii; jj++ ){
                System.out.print(jj);
            }
            for ( kk = jj-2; kk > 0; kk -= 1){
                System.out.print(kk);
            }
            System.out.print("\n");
        }
    }
}
