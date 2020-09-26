package pack_01;

import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

public class PerimetroyArea {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        String figure, triangleType;
        int lado, l1, l2, l3, radio, diametro, base, altura, perimetro;
        double area, perimetroCirc;
                
        System.out.println("Que Operacion Desea Realizar: " + "\n\u001B[32ml. Area" + "\n\033[33m2. Perimetro" + "\n\u001B[35m3.Salir\u001B[0m");
        String opcion = lector.nextLine();
        
        opcion = opcion.toLowerCase().replaceAll("area", "1");
        opcion = opcion.toLowerCase().replaceAll("perimetro", "2");
        opcion = opcion.toLowerCase().replaceAll("salir", "3");
        
        switch (opcion){
            case "1": 
                System.out.println("Area:");
                System.out.println("\u001B[32ml.Cuadrado" + "\n\033[33m2.Circulo" + "\n\u001B[36m3.Triangulo" + "\n\u001B[35m4.Salir\u001B[0m");
                figure = lector.nextLine();
                figure = figure.toLowerCase().replaceAll("cuadrado", "1");
                figure = figure.toLowerCase().replaceAll("circulo", "2");
                figure = figure.toLowerCase().replaceAll("triangulo", "3");
                figure = figure.toLowerCase().replaceAll("salir", "4");
                switch(figure){
                    case "1":
                        System.out.println("Ingrese El Lado Del Cuadrado");
                        lado = lector.nextInt();
                        area = lado * lado;
                        System.out.println("El Area Del Cuadrado Es: " + area);
                        break;
                    case "2":
                        System.out.println("Ingrese El Radio Del Circulo");
                        radio = lector.nextInt();
                        area = Math.PI * Math.pow(radio,2);
                        System.out.println("El Area Del Circulo Es: " + area);                        
                        break;
                    case "3":
                        System.out.println("Ingrese La Base Del Triangulo");
                        base = lector.nextInt();
                        System.out.println("Ingrese La Altura Del Triangulo");
                        altura = lector.nextInt();
                        area = base * altura / 2;
                        System.out.println("El Area Del Triangulo Es: " + area);
                        break;
                    case "4":
                        System.out.println("Gracias X Usar Nuestro Programas Vuelva Pronto");
                        break;
                    default:
                        System.err.println("Error: La Opcion Es Incorrecta");
                }
                break;
            case "2":
                System.out.println("Perimetro");
                System.out.println("\u001B[32ml.Cuadrado \n\033[33m2.Circulo" + "\n\u001B[36m3.Triangulo" + "\n\u001B[35m4.Salir\u001B[0m");
                figure = lector.nextLine();
                figure = figure.toLowerCase().replaceAll("cuadrado", "1");
                figure = figure.toLowerCase().replaceAll("circulo", "2");
                figure = figure.toLowerCase().replaceAll("triangulo", "3");
                figure = figure.toLowerCase().replaceAll("salir", "4");
                switch(figure){
                    case "1":
                        System.out.println("Ingrese El Lado Del Cuadrado");
                        lado = lector.nextInt();
                        perimetro = lado * 4;
                        System.out.println("El Perimetro Del Cuadrado Es: " + perimetro);
                        break;
                    case "2":
                        System.out.println("Ingrese El Radio Del Circulo");
                        diametro = lector.nextInt();
                        perimetroCirc = Math.PI * diametro;
                        System.out.println("El Perimetro Del Circulo Es: " + perimetroCirc);
                        break;
                    case "3":
                        System.out.println("Tipo De Triangulo Es ");
                        System.out.println("\u001B[32ml.Equilatero" + "\n\033[33m2.Isosceles" + "\n\u001B[36m3.Escaleno\u001B[0m" + "\n\u001B[35m4.Salir\u001B[0m");
                        triangleType = lector.nextLine();
                        triangleType = triangleType.toLowerCase().replaceAll("equilatero", "1");
                        triangleType = triangleType.toLowerCase().replaceAll("isosceles", "2");
                        triangleType = triangleType.toLowerCase().replaceAll("escaleno", "3");
                        triangleType = triangleType.toLowerCase().replaceAll("salir", "4");
                        switch (triangleType){
                            case "1":
                                System.out.println("Ingrese El Lado Del Triangulo");
                                l1 = lector.nextInt();
                                perimetro = l1 * 3;
                                System.out.println("El Perimetro Del Triangulo Equilatero Es: " + perimetro);
                                break;
                            case "2":
                                System.out.println("Ingrese La Base Del Triangulo");
                                l1 = lector.nextInt();
                                System.out.println("Ingrese Uno De Sus Lados Adyacentes");
                                l2 = lector.nextInt();
                                perimetro = 2 * l2 + l1;
                                System.out.println("El Perimetro Del Triangulo Isosceles Es: " + perimetro);
                                break;
                            case "3":
                                System.out.println("Ingrese El Lado 1 Del Triangulo");
                                l1 = lector.nextInt();
                                System.out.println("Ingrese El Lado 2 Del Triangulo");
                                l2 = lector.nextInt();
                                System.out.println("Ingrese El Lado 3 Del Triangulo");
                                l3 = lector.nextInt();
                                perimetro = l1 + l2 +l3;
                                System.out.println("El Perimetro Del Triangulo Escaleno Es: " + perimetro);
                                break;
                            case "4":
                                System.out.println("Gracias X Usar Nuestro Programas Vuelva Pronto");
                                break;
                            default:
                                System.err.println("Error: La Opcion Es Incorrecta");
                        }
                        break;
                    case "4":
                        System.out.println("Gracias X Usar Nuestros Programas Vuelva Pronto");
                        break;
                    default:
                        System.err.println("Error: La Opcion Es Incorrecta");
                }
                break;
            case "3":
                System.out.println("Gracias X Usar Nuestros Programas Vuelva Pronto");
                break;
            default:
                System.err.println("Error: La Opcion Es Incorrecta");
        }
    }
}
