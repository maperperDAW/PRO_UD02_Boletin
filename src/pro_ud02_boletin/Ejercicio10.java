/*
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 */
package pro_ud02_boletin;

/**
 *
 * @author miguel-angel
 */
public class Ejercicio10 {
    
    public static void main(String[] args) {
        
        int num_mitad;
        int ii;
        boolean no_es_multiplo;
        
        System.out.print("2 ");
        /* Todos los primos son impares a excepción del dos, de ahí que el 
         * incremento sea de dos en dos.
         */
        for ( int kk = 3; kk <= 100; kk += 2 ){   
            if ( kk == 2 ){
                System.out.print( kk + " ");
            }else{
                ii = 2;
                no_es_multiplo = true;

                num_mitad = kk /2;

                while ( (ii <= num_mitad) && no_es_multiplo ){
                    if ( kk % ii == 0){
                        no_es_multiplo = false;
                    }
                    ii++;
                }
                if ( no_es_multiplo ){
                    System.out.print( kk + " ");
                }
            }
        }
        System.out.println();
    }
}