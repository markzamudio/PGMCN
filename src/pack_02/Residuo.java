package pack_02;

import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

public class Residuo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        /*Version 1 Determinar Si Un Numero Es Par O Impar Sin Utilizar El Residuo*/
//        System.out.println("Digite Un Numero");
//        int number = reader.nextInt();
//        
//        int residuo = 0;
//        
//        for (;;) {
//            residuo += 2;
//            
//            if (residuo == number) {
//                System.out.println("El Numero" + number + "Es Un Numero Par");
//                break;
//            }
//            
//            if (number - residuo == 1){
//                System.out.println("El Numero" + number + "Es Un Numero Impar");
//                break;
//            }
//        }



    /*Version 2 Determinar Si Un Numero Es Par O Impar Sin Utilizar El Residuo*/
//        System.out.println("Digite Un Numero");
//        int number = reader.nextInt();
//        
//        int residuo = Math.abs(number);
//        
//        for (;;) {
//            residuo -= 2;
//            
//            if (residuo == number) {
//                System.out.println("El Numero" + number + "Es Un Numero Par");
//                break;
//            }
//            
//            if (residuo == 1){
//                System.out.println("El Numero" + number + "Es Un Numero Impar");
//                break;
//            }
//        }



        /*Version 3 Sacar El Residuo Sin Utilizar El Residuo*/
//        int numerador = 8;
//        int denominador = 3;
//        
//        int residuo = numerador - denominador * (numerador / denominador);
//        
//        System.out.println(numerador + " % " + denominador + " = " +residuo);
    }
}
