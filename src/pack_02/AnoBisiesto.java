package pack_02;

import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

public class AnoBisiesto {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Digite Un Año");
        short year = reader.nextShort();
        
        if ((year % 4 == 0 & year % 100 != 0) | year % 400 == 0) {
            System.out.println("El Año" + year + "Es Año Bisiesto");
        } else {
            System.out.println("El Año" + year + "No Es Año Bisiesto");
        }
    }
}
