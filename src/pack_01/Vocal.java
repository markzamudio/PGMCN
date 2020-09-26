package pack_01;

import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

public class Vocal {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String cadena;
        boolean vocal = false;
        
        while (vocal == false) {            
            System.out.println("Digite Una Cadena Que Inicie Con Una Vocal");
            cadena = lector.next();
            
            switch (cadena.toUpperCase().charAt(0)) {
                case 'A':
                    vocal = true;
                    break;
                case 'E':
                    vocal = true;
                    break;
                case 'I':
                    vocal = true;
                    break;
                case 'O':
                    vocal = true;
                    break;
                case 'U':
                    vocal = true;
                    break;
                default:
                    System.out.println("Error La Cadena No Inicia Con Una Vocal Vuelva A Intentarl");
            }                                         
        }
    }
}
