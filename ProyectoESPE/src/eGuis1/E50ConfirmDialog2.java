package eGuis1;

import javax.swing.*;
import javax.swing.text.html.HTML;

public class E50ConfirmDialog2 {

    public E50ConfirmDialog2() {
        int respuesta = JOptionPane.showConfirmDialog(null,
                                                "Ola k pasa",
                                                "titulo",
                                                1,
                                                JOptionPane.ERROR_MESSAGE
        );
    }
    public static void main(String[] args) {
        E50ConfirmDialog2 objeto = new E50ConfirmDialog2();

    }

}
