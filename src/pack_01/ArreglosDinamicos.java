package pack_01;

/**
 *
 * @author Mark_Zamudio
 */

public class ArreglosDinamicos {
    public static void main(String[] args) {
        /*
            Imprime un vector primer elemento & ultimo elemento
        */
        byte numbers[] = new byte[6];
        
        for (byte x = 0;x < numbers.length; x++) {
            numbers[x] = (byte)(Math.random() * 100 + 1);
            System.out.print(numbers[x] + "  ");
        }System.out.println();

        System.out.println("************************************************");
        
        for (byte x = 0; x < numbers.length / 2; x++) {
            System.out.print(numbers[x] + "  " + numbers[numbers.length - 1 - x] + "  ");
        }
        
        if (numbers.length % 2 == 1)
                System.out.print(numbers[numbers.length / 2]);
        
        System.out.println();
    }
}
