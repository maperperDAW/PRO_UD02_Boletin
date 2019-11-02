/*
* Escribe un programa que diga si un número introducido por teclado es o no primo.
* Un número primo es aquel que sólo es divisible entre él mismo y la unidad.
 */
package pro_ud02_boletin;

/**
 *
 * @author miguel-angel
 */
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        
        int num;
        int num_mitad;
        int ii = 2; //Índice para buscar múltiplos.
        boolean no_es_multiplo = true;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca un número entero positivo y distinto de 0: ");
        num = teclado.nextInt();
        
        while ( num <= 2 ){
            System.out.print("Introduzca un número entero positivo y mayor que 1: ");
            num = teclado.nextInt();
        }
        
        if ( num == 2 ){
            System.out.print("El número " + 2 + " es primo.\n");
        }else{
            num_mitad = num /2; // Límite superior de la lista de posibles primos.
            
            /* Se buscan los primos partiendo desde el 2 por motivos de eficiencia.
            * Una vez se encuentre el primer primo, el bucle se para.*/
            while ( (ii <= num_mitad) && no_es_multiplo ){
                if ( num % ii == 0){
                    no_es_multiplo = false;
                }
                ii++;
            }
        }
       
        if ( no_es_multiplo ){
            System.out.print("El número " + num + " es primo.\n");
        }else{
            System.out.print("El número " + num + " no es primo.\n");
        }
    }
    
}
