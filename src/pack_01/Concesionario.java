package pack_01;

import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

public class Concesionario {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        final short SUELDOBASE = 1000;
        byte cantCochesVendidos;
        int precioCoche;
        float sueldoMensual = SUELDOBASE;
        String respuesta;
        
        System.out.println("Bienvenido Al Dragon Palace");
        
        do {
            System.out.println("Estimado vendedor digite la cant de coches que usted ha vendido");
            cantCochesVendidos = lector.nextByte();

            System.out.println("Digite El Precio Del Coche Vendido");
            precioCoche = lector.nextInt();
            
            do {
                System.out.println("Desea ingresar mas ventas al sistemas Y/N");
                respuesta = lector.next();
                if (respuesta.matches("[YN]")) {
                    break;
                } else {
                    System.out.println("ERROR RESPUESTA INVALIDA");
                }
            } while (true);
            sueldoMensual += cantCochesVendidos * 150 + precioCoche * .05 * cantCochesVendidos;
        } while (respuesta.equals("Y"));

        System.out.println("Su Sueldo Es: " + sueldoMensual + " Pesos");
    }
}
