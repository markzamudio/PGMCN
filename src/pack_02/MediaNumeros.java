package Pack_02;

import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

public class MediaNumeros {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        byte numero, contPS = 0, contNG = 0, cont0 = 0;
        float mediaPS = 0, mediaNG = 0;
        
        
        // System.out.println("Digite Sus Numeros Favoritos");
        
        for (byte S = 0; S < 10; S++) {
            numero = (byte)(Math.random() * 10 + 1);
            System.out.println(numero);
            
            if (numero > 0) {
                mediaPS += numero;
                contPS++;
            } else if (numero < 0) {
                mediaNG += numero;
                contNG++;
            } else {
                cont0++;
            }
        }
        
        if (mediaPS != 0) {
            mediaPS /= contPS;
            System.out.println("La Media De Los Numeros Positivos Fue De " + mediaPS);
        } else {
            System.out.println("No Hay Media Para Numero Positivos");
        }
        
        if (mediaNG != 0) {
            mediaNG /= contNG;
            System.out.println("La Media De Los Numeros Negativos Fue De " + mediaNG);
        } else {
            System.out.println("No Hay Media Para Numeros Negativos");
        }
            
        System.out.println("La Cantidad De 0 Introducidos Fueron " + cont0); 
    }
}
