/*
 *  Escribe un programa que calcule el factorial de un número entero leído por
 * teclado.
 */
package pro_ud02_boletin;

/**
 *
 * @author miguel-angel
 */

import java.util.Scanner;
        
public class Ejercicio16 {
    public static void main(String args[]){
        long num = -1;
        long resultado = 1;
        boolean flag = true;
        Scanner teclado = new Scanner(System.in);
        
        while ( flag ){
            System.out.print("Introduzca un número entero no negativo: ");
            num = teclado.nextInt();
            flag = num < 0;
        }
        
        if ( (num == 0) || (num == 1)){
            System.out.print(num + "! = " + 1 + ".\n");
        }else{
            for ( int ii = 2; ii <= num; ii++ ){
                resultado = resultado * ii;
            }
            if ( resultado <= 0){
                System.out.print("Resultado fuera de rango.\n");
            }else{
                System.out.print(num + "! = " + resultado + ".\n");
            }
        }
    }
}
