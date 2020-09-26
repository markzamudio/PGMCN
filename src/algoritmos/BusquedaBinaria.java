package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

import java.util.Scanner;

public class BusquedaBinaria {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int numeros[] = {5,7,3,4,9,2,6};
        int min = 0, max = numeros.length - 1, medio, numeroBuscado;
        
        for (int x:numeros) {
            System.out.print(x + " ");
        }System.out.println();
        
        /*
            Para Poder Usar La Busqueda Binaria El Arreglo Debe Estar Ordenado
            Puedes utilizar cualquier algoritmo de ordenamiento
        */
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] > numeros[j+1]) {
                    numeros[j] += numeros[j+1];
                    numeros[j+1] = numeros[j] - numeros[j+1];
                    numeros[j] -= numeros[j+1];
                }
            }
        }
        
        System.out.println("Datos Ordenados");
        for (int x:numeros) {
            System.out.print(x + " ");
        }System.out.println();
        
        System.out.println("Digite El Numero Que Desea Buscar");
        numeroBuscado = lector.nextInt();
        
        if (numeroBuscado < numeros[min] || numeroBuscado > numeros[max]) {
            System.out.println("El Numero No Existe");
        } else {
            while (min <= max) {
                medio = (min + max) / 2;
                if (numeroBuscado == numeros[medio]) {
                    System.out.println("El Numero Esta En El Indice " + medio);
                    min = max + 1; // O Usar Break
                } else {
                    if (numeroBuscado < numeros[medio]) {
                        max = medio - 1;
                    } else {
                        min = medio + 1;
                    }
                }
            }
        }
    }
}
