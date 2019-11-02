/*
 Escribe un programa que muestre por pantalla todos los números enteros
 positivos menores a uno leído por teclado que no sean divisibles entre otro 
 también leído de igual forma.
 */
package pro_ud02_boletin;
/**
 *
 * @author miguel-angel
 */
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String args[]){
        int num;
        int divisor;
        Scanner teclado = new Scanner(System.in);
        
        do{
            System.out.print("Introduzca un número entero no negativo: ");
            num = teclado.nextInt();
        } while ( num <= 0 );
        
        do{
            System.out.print("Introduzca un número entero no negativo menor"
                    + " al anterior: ");
            divisor = teclado.nextInt();
        } while ( (divisor <= 0) || ( divisor > num ) );
        
        for ( int ii = divisor; ii <= num; ii++ ){
            if ( (num % ii) != 0 ){
                System.out.print( ii + ", ");
            }
        }
        System.out.print( ".\n");
    }
}
