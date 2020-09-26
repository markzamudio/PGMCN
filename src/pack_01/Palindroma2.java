package pack_01;

import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

public class Palindroma2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        String cadena, nueva = "";
        
        cadena = lector.nextLine();
        cadena = cadena.replaceAll(" ", "");
        
        for (int i = cadena.length() - 1; i >= 0; i--) {
            nueva += cadena.charAt(i);
        }
        
        if (cadena.equalsIgnoreCase(nueva)){
            System.out.println("La Cadena Es Palindroma");
        } else {
            System.out.println("La Cadena No Es Palindroma");
        }
    }
}
