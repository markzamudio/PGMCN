package pack_02;

/**
 *
 * @author Mark_Zamudio
 */

import java.util.Scanner;

public class MoverElementosA {
    private int numbers[];
    
    public void llenarArray(int size) {
        numbers = new int[size];
        for (int i = 0; i < this.numbers.length; i++) {
            this.numbers[i] = i + 1;
        }
    }
    
    public void hacerRecorrido(int cant) {
        int aux = 0;
        for (int i = 0; i < cant; i++) {
            for (int j = this.numbers.length - 1; j > 0 ;j--) {                                
                aux = this.numbers[j - 1];
                this.numbers[j - 1] = this.numbers[this.numbers.length - 1];
                this.numbers[this.numbers.length - 1] = aux;
            }                        
        }
    }
    
    public void mostrar() {
        for (int x: this.numbers) {
            System.out.print(x);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {        
        Scanner lector = new Scanner(System.in);
        MoverElementosA obj = new MoverElementosA();
        
        int recorridos, size;
        
        System.out.println("Digite El Tamaño Del Arreglo");
        size = lector.nextInt();
        
        System.out.println("Digite La Cant De Recorridos Que Desea Realizar");
        recorridos = lector.nextInt();
        
        obj.llenarArray(size);
        obj.hacerRecorrido(recorridos);
        obj.mostrar();
    }
}
