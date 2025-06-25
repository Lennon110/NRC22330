package eGuis1;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class e31Ventana2 extends JFrame {

    //atributos
    JButton salir;

    //constructor
    public e31Ventana2() {
        //ventana
        super("Ventana2");
        this.setSize(3840, 2160);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //gestor de diseño
        FlowLayout flow = new FlowLayout();
        setLayout(flow);

        //elementos
        JButton aceptar = new JButton("Aceptar");
        JButton cancelar = new JButton("Cancelar");
        salir = new JButton("SALIR");
        JLabel texto = new JLabel("Ingrese un dato: ");
        JTextField campo = new JTextField(30);
        JCheckBox algebra = new JCheckBox("Algebra");
        JCheckBox edo = new JCheckBox("EDO", true);
        JCheckBox calculo = new JCheckBox("Calculo");
        JCheckBox POO = new JCheckBox("POO");
        ButtonGroup exactas = new ButtonGroup();
        exactas.add(algebra);
        exactas.add(edo);
        exactas.add(calculo);
        JPanel panel = new JPanel();
        
        add(aceptar);
        add(cancelar);
        add(salir);
        add(texto);
        add(campo);
        add(algebra);
        add(edo);
        add(calculo);
        add(POO);
        add(panel);
        
        //añadir aspecto
        
        setVisible(true);
    }

    public static void main(String[] args) {
        //new 30Ventana().setVisible();
        new e31Ventana2();
    }
}
