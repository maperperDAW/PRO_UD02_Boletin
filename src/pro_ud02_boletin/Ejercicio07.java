/*
* Realiza un programa que pinte una pirámide por pantalla. La altura se debe 
* pedir por teclado. El carácter con el que se pinta la pirámide también se debe
* pedir por teclado.
 */

/*
       * 
      ***
     *****
    *******
*/
package pro_ud02_boletin;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        String caracter_leido;
        char caracter;
        int altura; // Altura pirámide
        int espacios_linea;
        int caracteres_por_linea;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca la altura de la pirámide: ");
        altura = teclado.nextInt();
        
        while ( altura <= 0){
            System.out.print("Introduzca la altura de la pirámide (numero entero"
                    + " no negativo y distinto de 0: ");
            System.out.print("Introduzca la altura de la pirámide: ");
            altura = teclado.nextInt();
        }
        
        System.out.print("Introduzca caracter: ");
        caracter_leido = teclado.next();
        caracter = caracter_leido.charAt(0);
        
        espacios_linea = altura - 1;
        if ( altura == 1 ){
            System.out.printf("%c\n", caracter);
        }else{
            for ( int ii = 1; ii <= altura; ii++ ){
                for ( int jj = 1; jj <= espacios_linea; jj++ ){
                    System.out.print(" ");
                }
                espacios_linea -= 1;
                caracteres_por_linea = (ii-1)*2 + 1;
                for ( int kk = 1; kk <= caracteres_por_linea; kk++ ){
                    System.out.printf("%c", caracter);
                }
                System.out.print("\n");
            }
        }
        
        
    }
}  
