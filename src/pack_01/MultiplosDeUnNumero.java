package pack_01;

import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

public class MultiplosDeUnNumero {
    public static void main(String[] args) {        
        //Determinar Si Un Numero Es Multiplo de 2 3 5 7 9
        Scanner lector = new Scanner(System.in);
                
        System.out.println("Digite Un Numero");
        int valor = lector.nextInt();
        
        System.out.println("El Numero " + valor + " Es Multiplo De ");
        if (valor  % 2 == 0)
            System.out.print("2 ");
        
        if (valor  % 3 == 0)
            System.out.print("3 ");
        
        if (valor  % 5 == 0)
            System.out.print("5 ");
        
        if (valor  % 7 == 0)
            System.out.print("7 ");
        
        if (valor  % 9 == 0)
            System.out.print("9 ");
        
        System.out.println();
    } 
}
