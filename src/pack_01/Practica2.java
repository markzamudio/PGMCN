package pack_01;

import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

public class Practica2 {
    public static void main(String[] args) {
//        Pregunte Cuantas(VALIDAR) materias llevas crear dos arreglos 
//        (nombre y calificaciones pedir datos mostrar relacion Materia Y Calif Promed General.
        
        Scanner lectorString = new Scanner(System.in);
        Scanner lectorInt = new Scanner(System.in);
        Scanner lectorDouble = new Scanner(System.in);
        
        String materiaMax, materiaMin;
        int cant;
        double promedio, nota, notaMax, notaMin;
        
        String []materias;
        double []notas;
        
        
        for (;;){
            System.out.println("Digite La Cantidad Que Materias Que Desea Registrar?? ");
            cant = lectorInt.nextInt();
            
            if (cant > 0){                
                materias = new String[cant];
                notas = new double[cant];
                break;
            }             
        }
                
        for (int i = 0; i < materias.length; i++) {
            System.out.println("Ingrese El Nombre De La Materia");
            materias[i] = lectorString.nextLine();                                                                  
        }
        
        for (int i = 0; i < notas.length; i++) {
            for (;;){
                System.out.print("Ingrese La Calificacion De " + materias[i] + ": ");
                nota = lectorDouble.nextDouble();
                if (nota <= 100 & nota >= 0)                    
                    break;                
            }              
            notas[i] = nota;
        }
        
        materiaMax = "";
        materiaMin = "";
        notaMax = 0;
        notaMin = 0;
        promedio = 0;        
        
        for (int i = 0;i < cant; i++){
            if (i == 0){
                notaMax = notas[i];
                notaMin = notaMax;
                materiaMax = materias[i];
                materiaMin = materias[i];
            }
            
            if (notas[i] >= notaMax){
                notaMax = notas[i];
                materiaMax = materias[i];
            }
            
            if (notas[i] <= notaMin){
                notaMin = notas[i];
                materiaMin = materias[i];
            }            
            
            promedio += notas[i];
        }
        
        promedio /= cant;
        
        System.out.println("Resumen General:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println(materias[i] + " " + notas[i]);            
        }
        
        System.out.println("El Promedio General Fue De " + promedio);
        System.out.println("La Califacion Mas Alta Fue " + notaMax + " Pertenece A La Materia De " + materiaMax);
        System.out.println("La Califacion Mas Baja Fue " + notaMin + " Pertenece A La Materia De " + materiaMin);
    }
}
