package pack_02;

import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

public class CrecienteDecreciente {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int numbers[] = new int[10];
        boolean creciente = false, decreciente= false;
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Digite Un Numero");
            numbers[i] = reader.nextByte();
        }
        
        for (int x:numbers) {
            System.out.print(x + " ");
        }System.out.println();
        
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i+1]) {
                creciente = true;
            }
            
            if (numbers[i] > numbers[i+1]) {
                decreciente = true;
            }
        }
        
        if (creciente == true && decreciente == false) {
            System.out.println("El Arreglo Esta Ordenado De Forma Ascendente");
        } else if (creciente == false && decreciente == true) {
            System.out.println("El Arreglo Esta Ordenado De Forma Descendente");
        } else if (creciente == true && decreciente == true){
            System.out.println("El Arreglo Esta Ordenado De Forma Desordenada");
        } else {
            System.out.println("Los Numeros Son Iguales");
        }
    }
}
