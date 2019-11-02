/*
* Realiza un programa que pida primero un número y a continuación un dígito. 
* El programa nos debe dar la posición (o posiciones) contando de izquierda a 
* derecha que ocupa ese dígito en el número introducido.
 */
package pro_ud02_boletin;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args){
        int numero;
        int numero_aux;
        int cifra = 0;
        int divisor = 1;
        int divisor_aux;
        int cont = 0;
        int cont_dig = 1;
        int digito;
        int noDigito = 0;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca un número: ");
        numero = teclado.nextInt();
        System.out.print("Introduzca un dígito: ");
        digito = teclado.nextInt();
        
        while ( (numero / divisor) > 0 ){
            divisor = divisor * 10;
            cont += 1;
        }
            divisor_aux = divisor/10;
            numero_aux = numero;
        for ( int ii = 0; ii < cont; ii++ ){

            cifra = numero_aux/divisor_aux;
            if ( cifra == digito ){
                System.out.print("El dígito está en la posición: " + cont_dig
                + "\n");
            }else{
                noDigito +=1 ;
            }           
            cont_dig++;
            numero_aux = numero_aux - cifra * divisor_aux;
            divisor_aux = divisor_aux / 10;
        }
        if ( noDigito == cont ){
                System.out.print("El dígito no está en el número.\n");
            }

            
    }
}

/*
    int numero, digito;
    int 
*/