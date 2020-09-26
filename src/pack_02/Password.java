package pack_02;

import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

public class Password {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        /*Password Version 1*/
//        String passwordCompany = "Design Motors";
//        boolean Interruptor = false;
//        int cont = 3;
//        
//        System.out.println("Bienvenido A Chevrolet S.A DE C.V");
//        while (Interruptor == false && cont != 0) {
//            System.out.println("Digite Su Contraseña Para Ingresar");
//            String passwd = reader.next();
//            cont--;
//            
//            if (passwd.equals(passwordCompany)) {
//                System.out.println("Acceso Autorizado");
//                Interruptor = true;
//            } else {
//                System.out.println("ERROR: Contraseña Incorrecta Vuelva A Digitar Su Contraseña Intento Restantes " + cont);
//            }
//        }
//        
//        if (cont == 3 && Interruptor == false)
//            System.out.println("Acceso Denegado Equipo Bloqueado");
        
        
        
        /*Password Version 2*/
//        String passwordCompany = "feroxrica";
//        String userCompany = "SomosUnicos";
//        
//        System.out.println("Digite Su Numero De Usuario");
//        String user = reader.nextLine();
//        
//        System.out.println("Digite Su Contraseña");
//        String passwd = reader.nextLine();
//        
//        if (user.equalsIgnoreCase(userCompany)) {
//            if (passwd.equals(passwordCompany)) {
//                System.out.println("Acceso Autorizado");
//            } else {
//                System.out.println("La Contraseña Es Incorrecta");
//            }
//        } else {
//            if (passwd.equals(passwordCompany)) {
//                System.out.println("El Usuario Es Incorrecto");
//            } else{
//                System.out.println("El Usuario Y La Contraseña Son Incorrectos");
//            }
//        }
    }
}
