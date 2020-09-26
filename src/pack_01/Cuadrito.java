package pack_01;

import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

public class Cuadrito {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int [][]numbers;
        String number;
        int size;
        int n = 1;
        
        for (;;) {
            System.out.println("Digite Un Digito");
            number = lector.next();
            
            if (number.matches("[1-9]"))
                break;
        }
        
        size = Integer.parseInt(number);
        numbers = new int[size][3];
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < 3; j++) {
                numbers[i][j] = n++;
            }
        }
            
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
