/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema5;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int contador = 1;
        String nombre;
        double promedio;
        
        
        while(contador <=4){
        System.out.println("Ingrese el nombre del estudiante");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el promedio del ciclo");
        promedio = entrada.nextDouble();
        
        if(promedio >=7){System.out.printf( nombre + "\t" + promedio + 
                "\n" + "aprobado");
        }else{
            System.out.printf(nombre + "\t"  
                    + promedio + "\n" +"reprobado");    
        }
        contador = contador+1;
        
        }
    }
    
}
