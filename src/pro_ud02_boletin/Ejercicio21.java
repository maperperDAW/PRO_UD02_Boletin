/*
Realiza un programa que pinte una X hecha de asteriscos. El programa debe pedir
la altura. Se debe comprobar que la altura sea un número impar mayor o igual 
a 3, en caso contrario se debe mostrar un mensaje de error.
Ejemplo:
Por favor, introduzca la altura de la X: 7
   *     *
    *   *
     * *
      *
     * *
    *   *
   *     *
 */
package pro_ud02_boletin;
/**
 *
 * @author miguel-angel
 */

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String args[]){
        int altura;
        int espacios_intermedios;
        int espacios_iniciales = 0;
        int mitad;
        boolean desc = true; //Cambio en el sentido de cómo crecen o decrecen 
                            // los espacios.
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca la altura (número mayor o igual a "
                + "3 e impar: ");
        altura = teclado.nextInt();
        
        if ( ( altura < 3) || ( (altura % 2) == 0)){
            System.out.print("El número introducido es menor que "
                + "3 o par.\n");
        }else{
            mitad = altura / 2 + 1;
            espacios_intermedios = altura - 2;
            for( int ii = 1; ii <= altura; ii++ ){
                if ( ( ii >= 1) && ( ii < mitad)){
                    for ( int kk = 1; kk <= espacios_iniciales; kk++ ){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    for ( int jj = 1; jj <= espacios_intermedios; jj++ ){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    espacios_intermedios -= 2;
                    espacios_iniciales += 1;
                }else if ( ii == mitad ){
                    for ( int kk = 1; kk <= espacios_iniciales; kk++ ){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    espacios_intermedios = 1;
                    espacios_iniciales -= 1;
                }else{
                    for ( int kk = 1; kk <= espacios_iniciales; kk++ ){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    for ( int jj = 1; jj <= espacios_intermedios; jj++ ){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    espacios_intermedios += 2;
                    espacios_iniciales -= 1;
                }
                System.out.print("\n");
            }
        }
    }
}