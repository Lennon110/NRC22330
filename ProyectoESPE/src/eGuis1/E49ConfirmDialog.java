

package eGuis1;

import javax.swing.JOptionPane;

public class E49ConfirmDialog extends javax.swing.JFrame { //no es necesario jframe a menos que queramos ventana
                                                           //contenedores, etc
    
    public E49ConfirmDialog(){
        int respuesta = JOptionPane.showConfirmDialog(null, "Seleccion una opcion: ");
        
        System.out.println("La respuesta es: " + respuesta);
    }
    public static void main(String[] args) {
        new E49ConfirmDialog();
        
    }
    
}
