package Pack_02;

import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

public class NumeroDeLaSuerte {
    public static void main(String[] args) {
//        Calculamos el número de la suerte así: 12+7+1980 = 1999  1+9+9+9 = 28
        Scanner teclado = new Scanner(System.in);
        byte day, month;
        short year, number;
                
        System.out.println("Digite Su Fecha De Nacimiento D M A");
        day = teclado.nextByte();
        month = teclado.nextByte();
        year = teclado.nextShort();
        
        number = (short)(day + month + year);
        number = (short)(number / 1000 + number / 100 % 10 + number / 10 % 10 + number % 10);
        System.out.println(number);
    }
}
