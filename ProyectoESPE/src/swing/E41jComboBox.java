package swing;

//librerias
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//clase principal
public class E41jComboBox extends JFrame implements ActionListener{
    
    //variables globales
    private JLabel label1,label2,label3;
    private JComboBox combo1,combo2,combo3;
    private JButton boton1;
    
    //constructor
    public E41jComboBox() {
        //gestor de diseño
        setLayout(null);
        
        //elementos
        
        //etiqueta de texto
        label1=new JLabel("Rojo:");
        label1.setBounds(10,10,100,30);
        add(label1);
        
        //lista desplegable
        combo1=new JComboBox();
        combo1.setBounds(120,10,50,30);
        //agregar valores de 0 al 255 al desplegable
        for(int f=0;f<=255;f++) {
            combo1.addItem(String.valueOf(f));
        }
        add(combo1);
        
        label2=new JLabel("Verde:");
        label2.setBounds(10,50,100,30);
        add(label2);
        combo2=new JComboBox();
        combo2.setBounds(120,50,50,30);
        for(int f=0;f<=255;f++) {
            combo2.addItem(String.valueOf(f));
        }
        add(combo2);
        
        label3=new JLabel("Azul:");
        label3.setBounds(10,90,100,30);
        add(label3);
        combo3=new JComboBox();
        combo3.setBounds(120,90,50,30);
        for(int f=0;f<=255;f++) {
            combo3.addItem(String.valueOf(f));
        }
        add(combo3);
        
        //boton
        boton1=new JButton("Fijar Color");
        boton1.setBounds(10,130,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }
    
    //metodo que se ejecuta al hacer clic en el botón
    @Override
    public void actionPerformed(ActionEvent e) {
        // Obtener los valores seleccionados en las listas desplegables
        if (e.getSource()==boton1) {
            String cad1=(String)combo1.getSelectedItem();
            String cad2=(String)combo2.getSelectedItem();
            String cad3=(String)combo3.getSelectedItem();
            int rojo=Integer.parseInt(cad1);
            int verde=Integer.parseInt(cad2);
            int azul=Integer.parseInt(cad3);
            Color color1=new Color(rojo,verde,azul);
            boton1.setBackground(color1);
        }
    }
    
    //metodo principal
    public static void main(String[] ar) {
        E41jComboBox formulario1=new E41jComboBox();
        //ventana
        formulario1.setBounds(0,0,400,300);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        formulario1.setVisible(true);
    }    
}