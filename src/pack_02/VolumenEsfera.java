package Pack_02;

import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

public class VolumenEsfera {
    public static void main(String[] args) {        
        Scanner teclado = new Scanner(System.in);
        
        byte radio;
        double volumen;
    
        System.out.println("Digite el radio de la esfera");        
        radio = teclado.nextByte();
        
        volumen = 4.0 / 3 * Math.PI * Math.pow(radio, 3);
        System.out.println("El Volumen De La Esfera Es " + volumen);
    }
}
