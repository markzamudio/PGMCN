package pack_02;

import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

public class BuscarElementos {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int numbers[] = new int[10];
        boolean encontrado = false;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 100 + 1);
        }

        for (int x:numbers) {
            System.out.print(x + " ");
        }System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j+1]) {
                    numbers[j] += numbers[j+1];
                    numbers[j+1] = numbers[j] - numbers[j+1];
                    numbers[j] = numbers[j] - numbers[j+1];
                }
            }
        }


        System.out.println("Digite EL Numero Que Desea Buscar");
        int number = reader.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (number == numbers[i]) {
                System.out.println("El Numero " + number + " Se Encuentra En La Posicion " + (i + 1));
                encontrado = true;
                break;
            }
        }

        if (!encontrado)
            System.out.println("El Numero " + number + " No Se Encuentro En El Arreglo");

        
        
        System.out.println("Resultados");

        for (int x:numbers) {
            System.out.print(x + " ");
        }System.out.println();
    }
}
