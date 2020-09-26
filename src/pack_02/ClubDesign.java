package pack_02;

import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

public class ClubDesign {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String names[] = new String[10];
        String job[] = new String[10];
        int gender, projectManager = 0, programmer = 0, designer = 0, counter = 0, ayudante = 0;
        
        System.out.println("Bienvenidos Al Club De Diseño  De Sun Micro Systems");
        System.out.println("Estamos Contratando Personal");
        
        for (int x = 0;x < 10; x++) {
            gender = (int)(Math.random() * 2);
            
            if (gender == 0) {
                System.out.println((x+1) + ". Mujer Digite Su Nombre");
                names[x] = reader.next();
            } else {
                System.out.println((x+1) + ". Hombre Digite Su Nombre");
                names[x] = reader.next();
            }
            
            while (true) {
                int destiny = (int)(Math.random() * 5 + 1);
                if (destiny == 1 && projectManager == 0) {
                    if (gender == 0) {
                        job[x] = "Jefa De Projecto";
                    } else {
                        job[x] = "Jefe De Projecto";
                    }
                    
                    projectManager++;
                    break;
                }
                
                if (destiny == 2 && programmer < 4 ) {
                    if (gender == 0) {
                        job[x] = "Programadora";
                    } else {
                        job[x] = "Programador";
                    }
                    
                    programmer++;
                    break;
                }
                
                if (destiny == 3 && designer < 2 ) {
                    if (gender == 0) {
                        job[x] = "Diseñadora";
                    } else {
                        job[x] = "Diseñador";
                    }
                                        
                    designer++;
                    break;
                }
                
                if (destiny == 4 && counter == 0 ) {
                    if (gender == 0) {
                        job[x] = "Contadora";
                    } else {
                        job[x] = "Contador";
                    }
                    
                    counter++;
                    break;
                }
                
                if (destiny == 5 && ayudante < 2 ) {
                    job[x] = "Ayudante";
                    ayudante++;
                    break;
                }
                System.out.println("Numero Generado " + destiny);
            }
        }
        
        System.out.println("Ya Tienes Listo A Tu Equipo De Desarrollo");
        System.out.println("Equipo: ");
        
        for (int x = 0; x < 10; x++) {
            System.out.println(names[x] + " " + job[x]);
        }
    }
}
