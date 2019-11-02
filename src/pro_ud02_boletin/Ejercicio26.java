/*
Escribe un programa que permita partir un número introducido por teclado en 
dos partes. Las posiciones se cuentan de izquierda a derecha empezando por el 1.
Suponemos que el usuario introduce correctamente los datos, es decir, el 
número introducido tiene dos dígitos como mínimo y la posición en la que se 
parte el número está entre 2 y la longitud del número. No se permite en este 
ejercicio el uso de funciones de manejo de String (por ej. para extraer 
subcadenas dentro de una cadena).
Ejemplo:
Por favor, introduzca un número entero positivo: 406783
Introduzca la posición a partir de la cual quiere partir el número: 5
Los números partidos son el 4067 y el 83.
 */
package pro_ud02_boletin;

/**
 *
 * @author miguel-angel
 */
import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String args[]){
        long num;
        long num1;
        long num2;
        int pos;
        int cont_dig = 0;
        int divisor = 1;
        int div;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca un número entero positivo: ");
        num = teclado.nextLong();
        System.out.print("Introduzca la posición a partir de la cual "
                + "quiere partir el número: ");
        pos = teclado.nextInt();

        do{
            divisor = divisor * 10;
            cont_dig++;
        }while ( num/divisor > 0);
        
        divisor = 1;
        div = cont_dig - pos + 1;
        
        for ( int jj = 0; jj < div; jj++ ){
            divisor = divisor * 10;
        }
        
        num1 = num / divisor;
        num2 = num - num1*divisor;
        System.out.print("Los números partidos son el " + num1 + 
                " y el " + num2 +".\n");
        
    }
}
