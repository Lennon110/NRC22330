package eGuis1;

import java.awt.*;
import javax.swing.*;
//import java.awt.FlowLayout;
//import javax.swing.JFrame;
//import javax.swing.JButton;
//import javax.swing.JLabel;
//java.awt.*
//java.swing.*

public class e30Ventana extends JFrame {
    //atributos
    JButton salir;
    
    //constructor
    public e30Ventana() {
        //ventana
        super("Titulo de la ventana");
        this.setSize(3840, 2160);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //gestor de diseño
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        
        //elementos
        JButton aceptar = new JButton("Aceptar");
        JButton cancelar = new JButton("Cancelar");
        salir = new JButton("SALIR");
        
        add(aceptar);        
        add(cancelar);
        add(salir);
        
        JLabel texto = new JLabel("Ingrese un dato: ");
        add(texto);
        
        JTextField campo = new JTextField(30);
        add(campo);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        //new 30Ventana().setVisible();
        e30Ventana ventana = new e30Ventana();       
    }
}
