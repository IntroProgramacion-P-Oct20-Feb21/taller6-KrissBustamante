/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int contador =1;
        String nombre;
        int puntos;
        int faltas;
        String cadenafinal;
        
        
        while (contador <= 10){
            System.out.println("Ingrese el Nombre del jugador");
            nombre = entrada.nextLine();
            entrada.nextLine();
            
            System.out.println("Ingrese la cantidad de puntos que"
                    + " anotó en la temporada");
            puntos = entrada.nextInt();
            System.out.println("Ingrese la cantidad de faltas de la temporada");
            faltas = entrada.nextInt();
             cadenafinal =  nombre + "\t" + puntos + "\t" + faltas + "\n";
            contador = contador +1;
            System.out.printf("cadenafinal");
        }
    }
    
}
