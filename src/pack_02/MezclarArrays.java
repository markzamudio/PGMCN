package Pack_01;

/**
 *
 * @author Mark_Zamudio
 */

public class MezclarArrays {
    public static void main(String[] args) {
     byte auxA = 0, auxB = 0;
        byte numberGroupA[] = new byte[10];
        byte numberGroupB[] = new byte[10];
        byte numberGroupC[] = new byte[20];
        
        for (byte x = 0; x < numberGroupA.length; x++) {
            numberGroupA[x] = (byte)(Math.random() * 100 + 1);
            numberGroupB[x] = (byte)(Math.random() * 100 + 1);
        }
        
        for (byte x:numberGroupA) {
            System.out.print(x + " ");
        }System.out.println();
        
        for (byte x:numberGroupB) {
            System.out.print(x + " ");
        }System.out.println();
        
        for (byte m = 0; m < numberGroupC.length / 2; m++) {
            //Forma 1
            /*if (m % 2 == 0) {
                numeritosC[m] = NumeritosA[auxA];
                auxA++;
            } else {
                numeritosC[m] = numeritosB[auxB];
                auxB++;
            }*/
            
            //forma 2
            /*numeritosC[auxA] = numeritosA[m];
            auxA++;
            numeritosC[auxA] = numeritosB[m];
            auxA++;*/
        }
        
        for (byte x:numberGroupC) {
            System.out.print(x + " ");
        }System.out.println();
    }
}
