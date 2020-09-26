package pack_02;

import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

public class FormulaGeneral {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int a = 7;
        int b = 1;
        int c = 10;
            
        double raiz = (b*b-4*a*c);
        
        if (raiz > 0 && a != 0) {
            raiz = Math.sqrt(raiz);
            double r1 = (-b + raiz) / (2*a);
            double r2 = (-b - raiz) / (2*a);

            System.out.println("R1 = " + r1);
            System.out.println("R2 = " + r2);
        } else {
            System.out.println("No Hay Solucion");
        }
    }    
}
