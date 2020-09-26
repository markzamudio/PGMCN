package pack_02;

import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

public class EliminarElementos {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int numbers[] = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 100 + 1);
        }

        for (int x:numbers) {
            System.out.print(x + " ");
        }System.out.println();

        System.out.println("Digite la posicion que desea eliminar 1-10");
        int position = reader.nextInt();

        for (int i = position - 1; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }

        numbers[numbers.length - 1] = 0;

        System.out.println("Resultados");

        for (int x:numbers) {
            System.out.print(x + " ");
        }System.out.println();
    }
}
