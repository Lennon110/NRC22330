
package eGuis1;

import javax.swing.JOptionPane;

public class E55OptionDialog {

    public static void main(String[] args) {
        String vector[] = {"-1-", "-2-", "-3-"};
        int respuesta = JOptionPane.showOptionDialog(
                null,
                "Seleccion un caso", 
                "Titulo",
                0,
                0,
                null,
                vector,
                vector[0]
        );
        JOptionPane.showMessageDialog(null, respuesta);
    }
    
}
