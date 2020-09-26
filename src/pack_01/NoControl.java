package pack_01;

import javax.swing.JOptionPane;

/**
 *
 * @author Mark_Zamudio
 */

public class NoControl {
    public static void main(String[] args) {
        String noControl;
        
        noControl = JOptionPane.showInputDialog("Ingrese Su Numero De Control");
        
        char carrera = noControl.toUpperCase().charAt(0);        
        
        /*
            Forma 1
        */
        
        if (carrera == 'S'){
            JOptionPane.showMessageDialog(null, "Bienvenido A Sistemas Computaciones");
        } else if(carrera == 'A'){
            JOptionPane.showMessageDialog(null, "Bienvenido A Ambiental");
        } else if(carrera == 'T'){
            JOptionPane.showMessageDialog(null, "Bienvenido A Automotriz");
        } else if(carrera == 'G'){
            JOptionPane.showMessageDialog(null, "Bienvenido A Gestion Empresarial");
        } else if(carrera == 'E'){
            JOptionPane.showMessageDialog(null, "Bienvenido A Electronica");
        } else if(carrera == 'D'){
            JOptionPane.showMessageDialog(null, "Bienvenido A Industrial");
        } else if(carrera == 'M'){
            JOptionPane.showMessageDialog(null, "Bienvenido A Gastronomia");
        }else{
            JOptionPane.showMessageDialog(null, "Numeros De Control Erroneo Usted No Pertenece A Este Instituto");
        }
        
        /*
            Forma 2
        */
        
        switch (carrera) {
            case 'S':
                JOptionPane.showMessageDialog(null, "Bienvenido A Sistemas Computaciones");break;
            case 'A':
                JOptionPane.showMessageDialog(null, "Bienvenido A Ambiental");break;    
            case 'T': 
                JOptionPane.showMessageDialog(null, "Bienvenido A Automotriz");break;
            case 'G': 
                JOptionPane.showMessageDialog(null, "Bienvenido A Gestion Empresarial");break;
            case 'E': 
                JOptionPane.showMessageDialog(null, "Bienvenido A Electronica");break;
            case 'D': 
                JOptionPane.showMessageDialog(null, "Bienvenido A Industrial");break;
            case 'M': 
                JOptionPane.showMessageDialog(null, "Binenvenido A Gastronomia");break;      
            default: JOptionPane.showMessageDialog(null, "Numeros De Control Erroneo Usted No Pertenece A Este Instituto");
        }       
    }
}
