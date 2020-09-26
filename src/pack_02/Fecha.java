package pack_02;

import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

public class Fecha {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String name, Mes = "";
        int day, month, year;
        boolean entry = false;
        
        System.out.println("Digite Su Nombre");
        name = reader.nextLine();
        
        System.out.println("Digite Su Fecha De Nacimiento");
            
        while (true) {
            System.out.print("DIA: ");
            day = reader.nextInt();
            if (day > 0 && day <= 31) {
                System.out.println("Dia Correcto");
                break;
            } else {
                System.out.println("ERROR: Dia Incorrecto Vuelva A Digitar El Dia De Su Nacimiento");
            }
        }
        
        while (true) {
            System.out.print("MES: ");
            month = reader.nextInt();
            if (month > 0 & month <= 12) {
                System.out.println("Mes Correcto");
                switch (month){
                    case 1:
                        Mes = "Enero";
                        break;
                    case 2:
                        Mes = "Febrero";
                            break;
                    case 3:
                        Mes = "Marzo";
                        break;
                    case 4:
                        Mes = "Abril";
                        break;
                    case 5:
                        Mes = "Mayo";
                        break;
                    case 6:
                        Mes = "Junio";
                        break;
                    case 7:
                        Mes = "Julio";
                        break;
                    case 8:
                        Mes = "Agosto";
                        break;
                    case 9:
                        Mes = "Septiembre";
                        break;
                    case 10:
                        Mes = "Octubre";
                        break;
                    case 11:
                        Mes = "Noviembre";
                        break;
                    case 12:
                        Mes = "Diciembre";
                        break;
                }
                break;
            } else {
                System.out.println("ERROR: Mes Incorrecto Vuelva A Digitar El Mes De Su Nacimiento");
            }
        }
        
        while (true) {
            System.out.print("AÑO: ");
            year = reader.nextInt();
            if (year > 0 & year < 2019) {
                System.out.println("Año Correcto");
                break;
            } else{
                System.out.println("ERROR: Año Incorrecto Vuelva A Digitar El Año De Su Nacimiento");
            }
        }
            
        int age = 2020 - year;
        
        System.out.println("Bienvenid@ " + name + " A Nuestro Club");
        
        System.out.println(name + " " + age + " Años");
        
        
        
        /*
            Version 2 Determina Si Una Fecha Es Correcta
        */
        
//        if (day > 31 || day <= 0) {
//            System.out.println("La Fecha Es Incorrecta");
//            System.out.println("Dia Fallo");
//        } else if (month > 12 || month <= 0) {
//            System.out.println("La Fecha Es Incorrecta");
//            System.out.println("Mes Fallo");
//        } else if (year <= 0) {
//            System.out.println("La Fecha Es Incorrecta");
//            System.out.println("Año Fallo");
//        } else {
//            System.out.println("La Fecha Introducida Es El " + (day < 10 ? "0" + day: day) + "/" + "" + (month < 10 ? "0" + month: month) + "/" + year);
//        }



        /*
            Version 3 Determina Si El Mes Y El Dia Coinciden Con El Calendario 
        */
        
//        if (year > 0 &&  month > 0 && month <= 12) {
//            if (day == 31 && ((month % 2 == 1 && month <= 7) || (month > 7 && month % 2 == 0))) {
//                System.out.println("La Fecha Introducida Es El " + (day < 10 ? "0" + day: day) + "/" + "" + (month < 10 ? "0" + month: month) + "/" + year);
//            } else if (day == 30 && ((month % 2 == 0 && month <= 7 & month != 2) || (month > 8 && month % 2 == 1))) {
//                System.out.println("La Fecha Introducida Es El " + (day < 10 ? "0" + day: day) + "/" + "" + (month < 10 ? "0" + month: month) + "/" + year);
//            } else if (day == 28 && month == 2) {
//                System.out.println("La Fecha Introducida Es El " + (day < 10 ? "0" + day: day) + "/" + "" + (month < 10 ? "0" + month: month) + "/" + year);
//            } else {
//                System.out.println("La Fecha Es Incorrecta");
//            }
//        } else {
//            System.out.println("La Fecha Es Incorrecta");
//        }
    }
}
