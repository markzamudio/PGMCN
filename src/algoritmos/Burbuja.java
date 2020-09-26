package algoritmos;

/**
 *
 * @author Mark_Zamudio
 */

public class Burbuja {
    public static void main(String[] args) {
        int numeros[] = {4,7,6,8,4,6,3};
        
        for (int x:numeros) {
            System.out.print(x + " ");
        }System.out.println();
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] > numeros[j+1]) {
                    int aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                    
                    /*Segunda Forma De Intercabiar Las Variables Sin Necesidad De Utilizar Una Variable AUX*/
//                    numeros[j] += numeros[j+1];
//                    numeros[j+1] = numeros[j] - numeros[j+1];
//                    numeros[j] -= numeros[j+1];
                }
            }
        }
        
        System.out.println("Datos Ordenados");
        for (int x:numeros) {
            System.out.print(x + " ");
        }System.out.println();
    }
}
