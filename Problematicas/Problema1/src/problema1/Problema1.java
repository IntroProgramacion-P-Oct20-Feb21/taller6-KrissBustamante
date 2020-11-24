/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        
        String nombre;
        int mensualidades;
        String empresa;
        double base;
        double total;
        
        System.out.println("Ingrese el nombre de la persona");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el numero de mensualidades");
        mensualidades = entrada.nextInt();
        System.out.println("Ingrese el valor de la base a pagar");
        base = entrada.nextDouble();
        
        System.out.println("Ingrese el nombre de la empresa");
        String cadena = entrada.nextLine();
        
     
     switch(cadena){
         
         case "Netflix":
             System.out.printf( "El valor de la mensualidad de Netflix es"
                     + base * mensualidades );
             break;
             
         case "Disney plus":
             System.out.printf("El valor de la mensualidad de Disney Plus"
                     + base * mensualidades);
             break;
         
         case "Tv":
             System.out.printf("El valor de la mensualidad de Apple TV es" 
                     + base * mensualidades );
             break;
             
         case "Amazon Prime":
             System.out.printf("El valor de la mensualidad de Amazon Prime es"
             + base * mensualidades );
             break;
         
         default:
             System.out.printf("Ninguna de las anteriores");
         
         
         
         
         
         
         
         
         
         
         
         
     
     }
    }
    
}
