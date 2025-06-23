
package eGuis1;

import javax.swing.JOptionPane;


public class E52InputDialog2 {


    public static void main(String[] args) {
        String respuesta = JOptionPane.showInputDialog(null,
                "Ingrese el dato",
                "Titulo",
                JOptionPane.ERROR_MESSAGE
        );
        
        System.out.println("La respuesta es: " + respuesta);
    }
    
}
