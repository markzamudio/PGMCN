package pack_02;

import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

public class MoverElementosB {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        /* Codigo Base */
        int numbers[] = new int[10];
        int desplazamiento;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 100 + 1);
        }

        for (int x:numbers) {
            System.out.print(x + " ");
        }System.out.println();

        System.out.println("Digite el numero de desplazamientos que desea realizar");
        desplazamiento = reader.nextInt();

        
        
        /*Version 1*/
//        for (int i = 0; i < numbers.length - 1; i++) {
//            numbers[i] += numbers[i+1];
//            numbers[i+1] = numbers[i] - numbers[i+1];
//            numbers[i] = numbers[i] - numbers[i+1];
//        }



        /*Version 2*/
//        for (int i = numbers.length - 1; i > 0; i--) {
//            numbers[i] += numbers[i-1];
//            numbers[i-1] = numbers[i] - numbers[i-1];
//            numbers[i] = numbers[i] - numbers[i-1];
//        }



        /*Version 3 Realiza La Misma Funcion De La Version 2 Mejorado*/
//        int aux = numbers[numbers.length - 1];
//        for (int i = numbers.length - 1; i > 0; i--) {
//            numbers[i] = numbers[i-1];
//        }
//        numbers[0] = aux;



        /*Forma 4 Realiza La Misma Funcion De La Version 1 Mejorado*/
//        int aux = numbers[0];
//        for (int i = 0; i < numbers.length - 1; i++) {
//            numbers[i] = numbers[i+1];
//        }
//        numbers[numbers.length - 1] = aux;



        /*Desplazamiento De Numeros N Version 3 De Referencia Mejorado*/
//        for (int i = 0; i < desplazamiento; i++) {
//            int aux = numbers[numbers.length - 1];
//            for (int j = numbers.length - 1; j > 0; j--) {
//                numbers[j] = numbers[j-1];
//            }
//            numbers[0] = aux;
//        }



        System.out.println("Resultados");

        for (int x:numbers) {
            System.out.print(x + " ");
        }System.out.println();
    }
}
