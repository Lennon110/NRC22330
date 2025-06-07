
package eGuis1;

import javax.swing.JOptionPane;

public class E53MessageDialog {

    public static void main(String[] args) {
        int respuesta = JOptionPane.showConfirmDialog(null,
                "Ingrese el dato",
                "Titulo",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if(respuesta == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, respuesta);
        }else{
            JOptionPane.showMessageDialog(null, "Se seleccion un valor diferente a no");
        }
    }
    
}
