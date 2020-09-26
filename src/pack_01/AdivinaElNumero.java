package pack_01;

import javax.swing.JOptionPane;

/**
 *
 * @author Mark_Zamudio
 */

public class AdivinaElNumero {
    public static void main(String[] args) {
        int number = 0,cont = 0, surpriseBox;
        
        JOptionPane.showMessageDialog(null, "Bienvenido A Juegos Del Destino Comenzemos", "Juegos Del Destino", JOptionPane.PLAIN_MESSAGE);
        surpriseBox = (int)(Math.random() * 100 + 1);
        
        while (number != surpriseBox) {
            number = Integer.parseInt(JOptionPane.showInputDialog("Digite Un Numero"));
            
            if (surpriseBox > number) 
                JOptionPane.showMessageDialog(null, "Digite Un Numero Mayor", "Juegos Del Destino", JOptionPane.INFORMATION_MESSAGE);
            if (surpriseBox < number) 
                JOptionPane.showMessageDialog(null, "Digite Un Numero Menor", "Juegos Del Destino", JOptionPane.INFORMATION_MESSAGE);
            
            cont++;
        }   
    
        JOptionPane.showMessageDialog(null, "Felicidades El Numero Escondido Era El " + number, "Juegos Del Destino", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "El Numeros De Intentos Fue " + cont, "Juegos Del Destino", JOptionPane.INFORMATION_MESSAGE);
    }
}
