package pack_01;

import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

public class Cifras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        byte cifras;        
                
        System.out.println("Digite Un Numero");
        numero = teclado.nextInt();
        cifras = 0;        
            
        while (numero > 0) {
            numero /= 10;
            cifras++;
        }          
            
        System.out.println("El Numero Introducido Tiene " + cifras + " Cifras");
    }    
}
