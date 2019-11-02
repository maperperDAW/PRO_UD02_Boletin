/*
* Realiza un programa que vaya pidiendo números hasta que se introduzca un número
* negativo y nos diga cuantos números se han introducido, la media de los impares
* y el mayor de los pares. El número negativo sólo se utiliza para indicar el
* final de la introducción de datos pero no se incluye en el cómputo.
*/

package pro_ud02_boletin;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        int numero = 0;
        int contador = 0; // Para evitar contar el número negativo que finaliza el while.
        float suma_impares = 0;
        float media_impares = 0;
        int num_impares = 0;
        int max_par = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        while ( numero >= 0 ){
            System.out.print("Introduzca un número: ");
            numero = teclado.nextInt();
            if ( numero > 0 ){
                contador++;
                if ( numero % 2 != 0){
                    suma_impares = suma_impares + numero;
                    num_impares++;
                }else{
                    if (numero > max_par){
                        max_par = numero;
                    }
                }
            }
        }
        // Para evitar la división entre cero.   
        if ( num_impares == 0){
            media_impares = 0;
        }else{
            media_impares = (float) (suma_impares / num_impares) ;
        }
        System.out.printf("La cantidad de números introducida es " + contador + 
                ", la media de los impares es " +  media_impares + 
                " y el mayor de los pares es " +  max_par + ".\n" );
    }
}


/*
    while ( numero < 0 ){
    
    }
    cont++;
    if( numero % 2 == 0){
    if ( num > parMayor){
        parMayor = numero;
    }   

    do{
        fumaImpar += numero;
        contarImpar++;
    }while( );
*/