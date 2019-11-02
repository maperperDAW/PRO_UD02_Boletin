/*
Realiza un programa que calcule las horas transcurridas entre dos horas de dos 
días de la semana. No se tendrán en cuenta los minutos ni los segundos. El día 
de la semana se puede pedir como un número (del 1 al 7) o como una cadena 
(de “lunes” a “domingo”). Se debe comprobar que el usuario introduce los datos 
correctamente y que el segundo día es posterior al primero.

Ejemplo:
Por favor, introduzca la primera hora.
Día: lunes
Hora: 18
Por favor, introduzca la segunda hora.
Día: martes
Hora: 20
Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.
 */
package pro_ud02_boletin;
/**
 *
 * @author miguel-angel
 */
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String args[]){
        int dia1_int = 0;
        int dia2_int = 0;
        int dia_aux = 0;
        int hora1 = 0;
        int hora2 = 0;
        int horas_totales;
        String dia_str = "";
        String dia_str1 = "";
        String dia_str2 = "";
        
        boolean es_correcto = true;
        
        Scanner teclado = new Scanner(System.in);
        
        
        do{
            for ( int ii = 0; ii < 2; ii++ ){
                if ( ii == 0 ){
                    System.out.print("Por favor, introduzca la primera hora.\n");
                    System.out.print("Día: ");
                    dia_str = teclado.next();
                    dia_str1 = dia_str;
                    System.out.print("Hora: ");
                    hora1 = teclado.nextInt();         
                }else{
                    System.out.print("Por favor, introduzca la segunda hora.\n");
                    System.out.print("Día: ");
                    dia_str = teclado.next();
                    dia_str2 = dia_str;
                    System.out.print("Hora: ");
                    hora2 = teclado.nextInt();
                }
                
                switch( dia_str ){
                    case "lunes":
                        dia_aux = 1;
                        break;
                    case "martes":
                        dia_aux = 2;
                        break; 
                    case "miercoles":
                        dia_aux = 3;
                        break;
                    case "jueves":
                        dia_aux = 4;
                        break;
                    case "viernes":
                        dia_aux = 5;
                        break;
                    case "sabado":
                        dia_aux = 6;
                        break;
                    case "domingo":
                        dia_aux = 7;
                        break;
                    default:
                        break;
                }
                switch( dia_str ){
                    case "1":
                        dia_aux = 1;
                        if ( ii == 0 ){
                            dia_str1 = "lunes";
                        }else{
                            dia_str2 = "lunes";
                        }
                        break;
                    case "2":
                        dia_aux = 2;
                        if ( ii == 0 ){
                            dia_str1 = "martes";
                        }else{
                        dia_str2 = "martes";
                        }
                        break; 
                    case "3":
                        dia_aux = 3;
                        if ( ii == 0 ){
                            dia_str1 = "miercoles";
                        }else{
                        dia_str2 = "miercoles";
                        }
                        break;
                    case "4":
                        dia_aux = 4;
                        if ( ii == 0 ){
                        dia_str1 = "jueves";
                        }else{
                        dia_str2 = "jueves";
                        }
                        break;
                    case "5":
                        dia_aux = 5;
                        if ( ii == 0 ){
                            dia_str1 = "viernes";
                        }else{
                            dia_str2 = "viernes";
                        }
                        break;
                    case "6":
                        dia_aux = 6;
                        if ( ii == 0 ){
                            dia_str1 = "sabado";
                        }else{
                            dia_str2 = "sabado";
                        }
                        break;
                    case "7":
                        dia_aux = 7;
                        if ( ii == 0 ){
                            dia_str1 = "domingo";
                        }else{
                            dia_str2 = "domingo";
                        }
                        break;
                    default:
                        break;
                }
                if ( ii == 0 ){
                    if ( dia_aux < 1 || dia_aux > 7){
                        es_correcto = false;
                    }else{
                        dia1_int = dia_aux;
                    }
                }else{
                    if ( dia_aux < 1 || dia_aux > 7){
                        es_correcto = false;
                    }else{
                        dia2_int = dia_aux;
                    }
                }
            } 
            
            if ( ( dia1_int > 0 && dia2_int > 0) 
                    && ( dia1_int < 8 && dia2_int < 8 )){    
                if ( (dia2_int < dia1_int) ){
                    es_correcto = false;
                    System.out.print("Hubo algún error. "
                            + "Se le requerirán otra vez los datos.\n");
                }else if ( (dia2_int == dia1_int) && (hora2 <= hora1) ){
                    es_correcto = false;               
                    System.out.print("Hubo algún error."
                            + " Se le requerirán otra vez los datos.\n");
                }else{
                    es_correcto = true;
                }
            }else{
                System.out.print("Se le requerirán otra vez los datos.\n"
                        + "Introdujo valores fuera de rango.\n");
                es_correcto = false;
            }
        
        }while ( !es_correcto );
        
        horas_totales = (dia2_int - dia1_int) * 24 - hora1 + hora2;
        System.out.print("Entre las " + hora1 + ":00h del " + dia_str1 + " y las "
                + hora2 + ":00h del " + dia_str2 + " hay " + horas_totales + 
                " hora/s.");
    }
}