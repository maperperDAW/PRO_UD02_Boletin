/*
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
 * entre 1 y un número leído por teclado.
 */
package pro_ud02_boletin;

/**
 * 
 * @author miguel-angel
 */

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args){
        int num = 0;
        Scanner teclado = new Scanner(System.in);
        boolean flag = true;
        
        while ( flag ){
            System.out.print("Introduce un número mayor que 3: ");
            num = teclado.nextInt();
            flag = num <= 3;
        }
        
        for ( int ii = 3; ii <=num; ii++){
            if ( (ii % 3) == 0 ){
                System.out.print( ii + " ");
            }
        }
        System.out.print(".\n");
    }
}
