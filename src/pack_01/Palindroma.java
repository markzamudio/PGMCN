package pack_01;

import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

public class Palindroma {
    public static void main(String[] args) {
//        Verifica si es palindroma o no la siguiente cadena = anita lava la tina

        String word = "anita lava la tina";
        String words[] = word.split(" ");
        String result = "";
        boolean palindroma = true;
        
        System.out.print(word + " -> ");
        word = word.replace(" ","");
        int x = word.length() - 1;
        
        for (int i = 0; i < word.length(); i++) {
            if (word.toLowerCase().charAt(i) != word.toLowerCase().charAt(word.length() - 1 - i)) {
                palindroma = false;
                break;
            }
        }

        for (int i = 0; i < words.length && word.length() > 0; i++) {
            for (;;) {
                result += word.charAt(x);
                x--;
                
                if (result.length() == words[i].length())
                    break;
            }
            System.out.print(result + " ");
            result = "";
        }
        
        if (palindroma)
            System.out.println("La cadena Es Palindroma");
        else
            System.out.println("La Cadena No Es Palindroma");
    }
}
