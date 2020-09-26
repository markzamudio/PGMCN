package pack_01;

import javax.swing.JOptionPane;

/**
 *
 * @author Mark_Zamudio
 */

public class CajeroAutomatico {
    public static void main(String[] args) {        
        final short SALDOINICIAL = 1000;
        int saldoActual = SALDOINICIAL, cant;
        byte opcion;
        
        JOptionPane.showMessageDialog(null, "Bienvenido A Banorte S.A. de C.V", "Banorte S.A. de C.V", JOptionPane.INFORMATION_MESSAGE);
         
        do {
            opcion = Byte.parseByte(JOptionPane.showInputDialog("Que Operacion Desear Realizar \n   1.Depositar Dinero \n   2.Retirar Dinero \n   3.Salir"));
            switch (opcion) {
                case 1:
                    cant = Integer.parseInt(JOptionPane.showInputDialog("Digite La Cantidad De Dinero Que Desea Depositar"));
                    if (cant > 0) {
                        saldoActual += cant;
                        JOptionPane.showMessageDialog(null, "El Deposito Se Realizo Con Exito", "Banorte S.A. de C.V", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, "Su Saldo Actual Es De " + saldoActual + " DLS", "Banorte S.A. de C.V", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR: CANTIDAD INCORRECTA", "Banorte S.A. de C.V", JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                case 2:
                    cant = Integer.parseInt(JOptionPane.showInputDialog("Digite La Cantidad De Dinero Que Desea Retirar"));
                    if (cant <= SALDOINICIAL) {
                        saldoActual = SALDOINICIAL - cant;
                        JOptionPane.showMessageDialog(null, "El Retiro Se Realizo Con Exito", "Banorte S.A. de C.V", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, "Su Saldo Actual Es De " + saldoActual + " Dls", "Banorte S.A. de C.V", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR: DINERO INSUFICIENTE", "Banorte S.A. de C.V", JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Gracias X Su Visita Vuelva Pronto", "Banorte S.A. de C.V", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "La Opcion No Se Encuentra En El Menu", "Banorte S.A. de C.V", JOptionPane.ERROR_MESSAGE);
            }
        } while (opcion != 3);
    }
}
