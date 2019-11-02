/*
Escribe un programa que pida un número entero positivo por teclado y que muestre
a continuación los 5 números consecutivos a partir del número introducido. 
Al lado de cada número se debe indicar si se trata de un primo
o no.
Ejemplo:
Por favor, introduzca un número entero positivo: 17
17 es primo
18 no es primo
19 es primo
20 no es primo
21 no es primo
 */
package pro_ud02_boletin;

import java.util.Scanner;
/**
 *
 * @author miguel-angel
 */
public class Ejercicio25 {
    public static void main(String args[]){
        int num;
        int num_aux;
        int num_mitad;
        int ii = 2; //Índice para buscar múltiplos.
        boolean no_es_multiplo = true;
        
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca un número entero positivo: ");
        num = teclado.nextInt();
        
        for ( int jj = 0; jj < 5; jj++){
            num_aux = num + jj;
/*            
            if ( num_aux == 1 ){
                System.out.print("El número " + 1 + " es primo.\n");
            }else if ( num == 2 ){
                System.out.print("El número " + 2 + " es primo.\n");
            }else{
                */
            num_mitad = num_aux /2;

            while ( (ii <= num_mitad) && no_es_multiplo ){
                if ( num_aux % ii == 0){
                    no_es_multiplo = false;
                }
                ii++;
            }
        

            if ( no_es_multiplo ){
                System.out.print(num_aux + " es primo.\n");
            }else{
                System.out.print(num_aux + " no es primo.\n");
            }
        }
    }
}
