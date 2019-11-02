/*
* Escribe un programa que pida una base y un exponente (entero positivo) 
* y que calcule la potencia.
 */
package pro_ud02_boletin;

/**
 *
 * @author miguel-angel
 * 
 */
import java.util.Scanner;

public class Ejercicio02 {
    
    public static void main(String[] args) {
        long base;
        long potencia = 1;
        int exponente;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca la base (número entero): ");
        base = teclado.nextLong();
        System.out.print("Introduzca el exponente (número entero): ");
        exponente = teclado.nextInt();
        
        for ( int ii = 1; ii <= exponente; ii++ ){
            potencia = potencia * base;
        }
        
        System.out.print( base + " elevado a " + exponente + " es igual a "
        + potencia + ".\n");
    }
}
