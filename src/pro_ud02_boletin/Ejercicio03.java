/*
* Escribe un programa que dados dos números, uno real (base) y un entero positivo
* (exponente), saque por pantalla todas las potencias con base el numero dado y 
* exponentes entre uno y el exponente introducido. No se deben utilizar funciones
* de exponenciación. Por ejemplo, si introducimos el 2 y el 5, se deberán 
* mostrar 2^1, 2^2, 2^3, 2^4 y 2^5.
 */
package pro_ud02_boletin;

/**
 *
 * @author miguel-angel
 */
import java.util.Scanner;
/**
 * @exception
*/
public class Ejercicio03 {
    public static void main(String[] args) {
        int base;
        int potencia = 1;
        int exponente;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca la base (número entero): ");
        base = teclado.nextInt();
        System.out.print("Introduzca el exponente (número entero): ");
        exponente = teclado.nextInt();
        
        for ( int ii = 1; ii <= exponente; ii++){
            potencia = potencia * base;
            System.out.print( base + " elevado a " + ii + " es igual a " + 
                    potencia + ".\n");
        }
    }
}
