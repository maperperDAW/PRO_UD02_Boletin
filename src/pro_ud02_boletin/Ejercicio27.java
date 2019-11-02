/*
Escribe un programa que sea capaz de insertar un dígito dentro de un número 
indicando la posición. El nuevo dígito se colocará en la posición indicada y el
resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
izquierda a derecha empezando por el 1. Suponemos que el usuario introduce 
correctamente los datos. Se recomienda usar long en lugar de int ya que el
primero admite números más largos.
Ejemplo:
Por favor, introduzca un número entero positivo: 406783
Introduzca la posición donde quiere insertar: 3
Introduzca el dígito que quiere insertar: 5
El número resultante es 4056783.
 */
package pro_ud02_boletin;

import java.util.Scanner;

/**
 *
 * @author miguel-angel
 */
public class Ejercicio27 {
    public static void main(String args[]){
        long num;
        long num1;
        long num2;
        long num_nuevo;
        int digito_nuevo;
        int pos;
        int cont_dig = 0;
        int divisor = 1;
        int div;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca un número entero positivo: ");
        num = teclado.nextLong();
        System.out.print("Introduzca la posición donde quiere insertar:  ");
        pos = teclado.nextInt();
        System.out.print("Introduzca el dígito que quiere insertar: ");
        digito_nuevo = teclado.nextInt();
        

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
        num1 = num1 * divisor * 10 + digito_nuevo * divisor;
        num_nuevo = num1 + num2;
        
        
        //Ejemplo:
        /* Para un número 406783, posición 3 y dígito 5:
        (División entera) num1 = 406783 / ( divisor = 10000) = 40
        num2 = 406783 - 40*10000 = 6783
        num1 = num1 * divisor * 10 + digito_nuevo * divisor;
        num1 = 40 * 10000 * 10 + 5 * 10000 = 4050000
        num_nuevo = num1 + num2;
        num_nuevo = 4050000 + 6783 = 4056783
        */
        
        System.out.print("El número resultante es: " + num_nuevo + ".\n");
        
    }
}