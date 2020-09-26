package pack_01;

/**
 *
 * @author Mark_Zamudio
 */

public class DecimalABinario {
    public static void main(String[] args) {
        byte binario[] = new byte[8];
        byte decimal, cont = 7;
        
        decimal = (byte)(Math.random() * 100 + 1);
        System.out.println("Numero Generado: " + decimal);
        
        while (decimal > 0) {
                binario[cont] = (byte)(decimal % 2);
                decimal /=2;
                cont--;
        }
        
        for (byte x:binario) {
            System.out.print(x + " ");
        }System.out.println();
    }
}
