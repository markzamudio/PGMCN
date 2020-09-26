package pack_01;

import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

public class Digitos {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String number;
        
        for (;;){
            System.out.println("Introduzca Un Numero De 3 Digitos");
            number = lector.nextLine();
            if (number.matches("[0-9]{3}"))
                break;
        }
    }
}
