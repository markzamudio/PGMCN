package pack_02;

import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

public class Factorial {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Digite Un Numero");
        int numerito = lector.nextInt();
        
        int factorial = 1;
        
        for (int x = numerito;x > 1;x--) {
            factorial *= x;
        }
        
        System.out.println("El Factorial De " + numerito + " Es " + factorial);
    }
}
