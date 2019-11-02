/*
Escribe un programa que diga si un número introducido por teclado es o no 
capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El 
programa debe aceptar números de cualquier longitud siempre que lo permita el 
tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar 
long en lugar de int ya que el primero admite números más largos.
Ejemplo 1:
Por favor, introduzca un número entero positivo: 678
El 678 no es capicúa.
Ejemplo 2:
Por favor, introduzca un número entero positivo: 2019102
El 2019102 es capicúa.
 */
package pro_ud02_boletin;
/**
 *
 * @author miguel-angel
 */
import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String args[]){
        long numero;
        long numero_aux_izq;
        long numero_aux_der;
        long numero_aux_der_bucle;
        long mitad;
        long divisor = 1;
        long divisor_izq;
        long divisor_der;
        long num_izq = 0;
        long num_der = 0;
        long cont_dig = 0;
        boolean es_capicua = true;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca un número: ");
        numero = teclado.nextInt();
        
        while ( (numero / divisor) > 0 ){
            divisor = divisor * 10;
            cont_dig++;
        }
        divisor = divisor/10;
        
        if ( cont_dig % 2 == 0 ){
            mitad = cont_dig / 2;
        }else{
            mitad = cont_dig / 2 + 1;      
        }
        numero_aux_izq = numero;
        numero_aux_der = numero;
        divisor_der = divisor;
        numero_aux_der_bucle = numero_aux_der;
        divisor_izq = divisor;
        
        for ( int ii = 1; ii <= mitad; ii++ ){
            num_izq = numero_aux_izq / divisor_izq;
            numero_aux_izq = numero_aux_izq - num_izq * divisor_izq;
            for ( int jj = 1; jj <= cont_dig-ii+1; jj++ ){
                num_der = numero_aux_der_bucle/divisor_der;
                numero_aux_der_bucle = numero_aux_der_bucle - num_der * divisor_der;
                divisor_der = divisor_der/10;
            }

            divisor_izq = divisor_izq/10;
            divisor_der = divisor_izq;
            numero_aux_der = numero_aux_der/10;
            numero_aux_der_bucle = numero_aux_der;
 
            if ( num_der!= num_izq ){
                es_capicua = false;
            }            
        }
        if ( es_capicua ){
            System.out.print("El " + numero +" es capicúa.\n");
        }else{
            System.out.print("El " + numero +" no es capicúa.\n");
        }
    }
}
