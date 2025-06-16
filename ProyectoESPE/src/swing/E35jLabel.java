package swing;

import javax.swing.*;

//clase principal
public class E35jLabel extends JFrame {
    //atributos
    private JLabel label1,label2;
    
    //constructor
    public E35jLabel() {
        //gestor de diseño
        setLayout(null);
        
        //elemento
        label1=new JLabel("Sistema de Facturación.");
        //posicion y tamaño
        label1.setBounds(10,20,300,30);
        //agregar elemento
        add(label1);
   
        label2=new JLabel("Version 1.0");
        label2.setBounds(10,100,100,30);
        add(label2);
    }
    
    //metodo principal
    public static void main(String[] ar) {
        E35jLabel formulario1=new E35jLabel();
        //ventana
        formulario1.setBounds(0,0,300,200);
        //restringir el redimensionamiento de la ventana
        formulario1.setResizable(false);
        //para que la ventana sea visible
        formulario1.setVisible(true);
    }
}