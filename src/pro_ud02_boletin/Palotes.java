/*
Realiza un conversor del sistema decimal al sistema de “palotes”.
Ejemplo:
Por favor, introduzca un número entero positivo: 47021
El 47021 en decimal es el | | | | - | | | | | | | - - | | - | en el sistema
de palotes
 */
package pro_ud02_boletin;
/**
 *
 * @author miguel-angel
 */

import java.util.Scanner;


public class Palotes {
    public static void main(String args[]){
        long numero;
        long num_aux;
        int cont_digitos = 0;
        int divisor = 1;
        int cifra;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca un número entero positivo: ");
        numero = teclado.nextLong();
        num_aux = numero;
        
        do{
            divisor = divisor * 10;
            cont_digitos++;
        }while( numero/(divisor) > 0);
        
        divisor = divisor/10;
        
        System.out.print("El " + numero + " en decimal es el ");
        
        
        
        for ( int ii = 0; ii < cont_digitos; ii++ ){    
            cifra =  (int) num_aux/divisor;
            num_aux = num_aux - cifra * divisor;
            divisor = divisor/10;
                switch ( cifra ){
                    case 1:
                        System.out.print("|");
                        break;
                    case 2:
                        System.out.print("||");
                        break;
                    case 3:
                        System.out.print("|||");
                        break;
                    case 4:
                        System.out.print("||||");
                        break;
                    case 5:
                        System.out.print("|||||");
                        break;
                    case 6:
                        System.out.print("||||||");
                        break;
                    case 7:
                        System.out.print("|||||||");
                        break;
                    case 8:
                        System.out.print("||||||||");
                        break;
                    case 9:
                        System.out.print("|||||||||");
                        break;
                    case 0:
                        System.out.print("-");
                        break;
                }
                if ( (ii != (cont_digitos-1) ) ){
                    System.out.print("-");
                }   
        }
    System.out.print(" en el sistema de palotes.\n");
    }
}
