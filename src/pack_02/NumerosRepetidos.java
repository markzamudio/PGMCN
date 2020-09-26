package Pack_02;

import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

public class NumerosRepetidos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        byte numbers[], size, number, noElements = 0;
        boolean noEncontrado = false; 
        
        System.out.println("Digite El Tamaño Que Tendra Su Arreglo");
        size = teclado.nextByte();
        
        numbers = new byte[size];
                
        while (noElements < numbers.length) {
            System.out.println("Digite Un Numero");
            number = teclado.nextByte();
            
            for (byte x = 0; x < noElements; x++) {
                if (number == numbers[x]) {
                    noEncontrado = true;
                    break;
                }
            }
            
            if (noEncontrado) {
                System.out.println("El Numero " + number + " Ya Existe En El Arreglo");
            } else {
                numbers[noElements] = number;
                noElements++;
            }
            noEncontrado = false;
        }
        
        for (byte x:numbers) {
            System.out.print(x + " ");
        }System.out.println();
    }
}
