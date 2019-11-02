/*
 Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares 
 hay dentro de un número. Se recomienda usar long en lugar de int ya que el 
 primero admite números más largos.
 */
package pro_ud02_boletin;

import java.util.Scanner;
/**
 *
 * @author miguel-angel
 */

public class Ejercicio24 {
    public static void main(String args[]){
        long numero;
        long numero_aux;
        int cifra;
        long divisor = 1;
        int cont_digitos = 0;
        int cont_par = 0;
        int cont_impar = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca un número entero positivo: ");
        numero = teclado.nextLong();
        
        do{
            divisor = divisor * 10;
            cont_digitos++;
        }while( numero/divisor > 0);
        
        divisor = divisor/10;
        numero_aux = numero;
        
        for( int ii = 0; ii < cont_digitos; ii++ ){
            cifra = (int) (numero_aux/divisor);
            numero_aux = numero_aux - (long) (cifra*divisor);
            divisor = divisor/10;
            if ( cifra % 2 == 0){
                cont_par++;
            }else{
                cont_impar++;
            }        
        }
        System.out.print("El " + numero + " contiene " + cont_par + 
                " dígitos pares y " + cont_impar + " dígitos impares.\n");
    }
}