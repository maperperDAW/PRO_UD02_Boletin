/*
* Realiza un programa que pida un número por teclado y que luego muestre ese 
* número al revés.
 */
package pro_ud02_boletin;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args){
        int numero;
        int numero_aux;
        int cifra = 0;
        int divisor = 1;
        int divisor_aux;
        int cont = 0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca un número: ");
        numero = teclado.nextInt();
        
        while ( (numero / divisor) > 0 ){
            divisor = divisor * 10;
            cont += 1;
        }
       
        divisor = divisor / 10;
        
        for ( int jj = 0; jj < cont; jj++ ){
            divisor_aux = divisor;
            numero_aux = numero;
            for ( int ii = jj; ii < cont; ii++){
                cifra = numero_aux/divisor_aux;
                numero_aux = numero_aux - cifra * divisor_aux;
                divisor_aux = divisor_aux / 10;
            }
            System.out.print(cifra);
        }
        System.out.print("\n");
    }
}
