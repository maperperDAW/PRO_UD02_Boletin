/*
Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 */
package pro_ud02_boletin;


import java.util.Scanner;

public class Ejercicio08 {
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
        
        System.out.print("Pirámide 1: \n");
        
        espacios_linea = altura;
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
                    if ( (kk == 1 || kk == caracteres_por_linea) &&  (ii != altura)){
                        System.out.printf("%c", caracter);
                    }else if (ii == altura)  {
                        System.out.printf("%c", caracter);
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");
            }
        }
     
        System.out.print("\n\nPirámide 2: \n");
        
        int ancho_base = 2 * altura - 1;
        int ancho_marco = ancho_base + 2;
        
        // Marco superior
        for ( int ii = 0; ii < ancho_marco; ii++){
            System.out.print(caracter);
        }
        System.out.print("\n");
        
        /* Pirámide
            ii es la variable que controla el número de espacios en blanco
            que es definida en el bucle superior
        */
        for ( int ii = 1; ii <= ancho_base; ii += 2 ){
            caracteres_por_linea = (ancho_marco - ii) / 2;
            for ( int jj = 0; jj < caracteres_por_linea; jj++ ){
                System.out.print(caracter);
            }
            
            for ( int jj = 0; jj < ii; jj++ ){
                System.out.print(" ");
            }
            
            for ( int jj = 0; jj < caracteres_por_linea; jj++ ){
                System.out.print(caracter);
            }
                System.out.print("\n");
        }
        
        // Marco inferior
        for ( int ii = 0; ii < ancho_marco; ii++){
            System.out.print(caracter);
        }
        System.out.print("\n");
    }
}  
