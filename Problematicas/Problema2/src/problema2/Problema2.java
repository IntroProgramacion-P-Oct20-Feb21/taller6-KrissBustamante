/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;
import java.util.Locale;
import java.util.Scanner;        
/**
 *
 * @author USER
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int contador = 1;
        int cadena = 0;
        
        while(contador <= 6){
            if ((contador / 2  ) ==0){
            System.out.println(contador + "/"+ 20+cadena);
            }else{
                System.out.println(contador +"/" + 10+cadena);}
            contador = contador+1;
            cadena = cadena+1;
                    
        }
        
      
    }
    
}
