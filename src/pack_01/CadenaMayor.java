package pack_01;

import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

public class CadenaMayor {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        String cadenaA, cadenaB;
        int diferencia;
        
        System.out.println("Introduzca La Primera Cadena");
        cadenaA = lector.nextLine();
        
        System.out.println("Introduzca La Segunda Cadena");
        cadenaB = lector.nextLine();
        
        if (cadenaA.length() > cadenaB.length()) {
            diferencia = cadenaA.length() - cadenaB.length();
            System.out.println(cadenaA + " Fue La cadena Mas Larga Con " + diferencia + " Caracteres Mas Que " + cadenaB);
        } else if (cadenaA.length() < cadenaB.length()) {
            diferencia = cadenaB.length() - cadenaA.length();
            System.out.println(cadenaB + " Fue La cadena Mas Larga Con " + diferencia + " Caracteres Mas Que " + cadenaA);
        } else {
            System.out.println("La Dos Cadenas Tienen La  Misma Longitud");
        }
    }
}
