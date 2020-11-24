/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        boolean bandera = true;
        int contador = 0;
        String nombre;
        int numeroDias;
        double costodia;
        double total;
        String cadenafinal;
        
        
        while(bandera){
                
        System.out.println("Ingrese el nombre del empleado");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el número de días trabajados");
        numeroDias = entrada.nextInt();
        System.out.println("Ingrese el costo del día trabajado");
        costodia = entrada.nextDouble();
        
        total = costodia * numeroDias;
        cadenafinal = nombre + "\t" + numeroDias + "\t$s" + costodia 
                + "\n" + total +"\n";
        contador = contador + 1;
        
        //proceso para salir
        System.out.println("Ingrese el valor de -1 para salir del ciclo \n");
        
        int temporal = entrada.nextInt();
        if(temporal == -1){
        
        bandera = false;
        }
                
            
        }
        
    }
    
}
