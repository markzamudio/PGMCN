package pack_02;

import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

public class Simetrica {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int numbers[][],nFilas,nColumnas;
        boolean simetrica;
        
        System.out.println("Digite El Numero De Filas Para Su Matriz");
        nFilas = reader.nextInt();
        
        System.out.println("Digite El Numero De Columnas Para Su Matriz");
        nColumnas = reader.nextInt();
        
        simetrica = nColumnas == nFilas ? true:false;
        numbers = new int[nFilas][nColumnas];
        
        System.out.println("Digite La Matriz");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.println("Digite Un Numero [" + i + "][" + j + "]:");
                numbers[i][j] = reader.nextInt();
            }
        }
        
        
        for (int i = 0; i < nFilas && simetrica == true;i++) {
            for (int j = 0; j < nColumnas; j++) {
                if (numbers[i][j] != numbers[j][i]) {
                    simetrica = false;
                    break;
                }
            }
        }
        
        System.out.println("La Matriz Es: ");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        
        if (simetrica == true)
            System.out.println("La Matriz Es Simetrica");
        else
            System.out.println("La Matriz No Es Simetrica");
    }
}
