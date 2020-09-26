package pack_01;

/**
 *
 * @author Mark_Zamudio
 */

public class WordXWord {
    public static void main(String[] args) {
        String saludo = "Hola Mundo Mark";
        String words[] = saludo.split(" ");         

        for (int i = 0; i < words.length; i++) {            
            System.out.println(words[i]);
        }            
    }        
}
