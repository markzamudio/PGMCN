package pack_01;

import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

public class Practica1 {
    public static void main(String[] args) {
        Scanner lectorString = new Scanner(System.in);
        Scanner lectorInt = new Scanner(System.in);
        
        String name, apeMat, apePat, cadena;
        int numberOne, numberTwo, numberThree, Comparacion;
        
        
        System.out.println("Digite Su Nombre");
        name = lectorString.nextLine();
        
        System.out.println("Digite Su Apellido Paterno");
        apePat = lectorString.nextLine();
        
        System.out.println("Digite Su Apellido Materno");
        apeMat = lectorString.nextLine();
                
        System.out.println(name.toUpperCase().substring(0,1) + "." + apeMat.toUpperCase().substring(0,1) + "." + apePat.toUpperCase().substring(0,1));
        System.out.println(name.toUpperCase().substring(name.length() - 1) + "#" + apeMat.toUpperCase().substring(apeMat.length() - 1) + "#" + apePat.toUpperCase().substring(apePat.length() - 1));
        
        System.out.println("Digite Un Numero");
        numberOne = lectorInt.nextInt();
        System.out.println("Digite Otro Numero");
        numberTwo = lectorInt.nextInt();
               
        numberThree = (int)(Math.random() * 8 + 5);
        System.out.println(numberThree);
        
        System.out.println(numberOne > numberThree ? "El Numero " + numberOne + " Es Mayor Que " + numberThree + " = True" :"El Numero " + numberOne + " No Es Mayor Que " + numberThree + " = False");
    }
}
