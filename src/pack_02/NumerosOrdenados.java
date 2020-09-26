package Pack_02;

import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

public class NumerosOrdenados {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        byte numberOne, numberTwo, numberThree;
                        
        //Ordenar 3 Numeros Aleatorios De Manera Descedente
        numberOne = (byte)(Math.random() * 100 + 1);
        numberTwo = (byte)(Math.random() * 100 + 1);
        numberThree = (byte)(Math.random() * 100 + 1);
                                
        System.out.println(numberOne + "  " + numberTwo + "  " + numberThree);
        
        if (numberOne > numberTwo & numberTwo > numberThree)
            System.out.println(numberOne + "  " + numberTwo + "  " + numberThree);
        
        if (numberOne > numberThree & numberThree > numberTwo)
            System.out.println(numberOne + "  " + numberThree + "  " + numberTwo);
        
        if (numberTwo > numberOne & numberOne > numberThree)
            System.out.println(numberTwo + "  " + numberOne + "  " + numberThree);
        
        if (numberTwo > numberThree & numberThree > numberOne)
            System.out.println(numberTwo + "  " + numberThree + "  " + numberOne);
        
        if (numberThree > numberOne & numberOne > numberTwo)
            System.out.println(numberThree + "  " + numberOne + "  " + numberTwo);
        
        if (numberThree > numberTwo & numberTwo > numberOne)
            System.out.println(numberOne + "  " + numberTwo + "  " + numberThree);
    }
}
