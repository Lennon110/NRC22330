package swing;

//librerias
import javax.swing.*;
import java.awt.event.*;

//clase principal
public class E37EjTextField extends JFrame implements ActionListener{
    //atributos
    private JTextField textfield1;
    private JLabel label1;
    private JButton boton1;
    
    //constructor
    public E37EjTextField() {
        //gestor de diseño
        setLayout(null);
        //elementos
        //etiqueta
        label1=new JLabel("Usuario:");
        label1.setBounds(10,10,100,30);
        add(label1);
        //campo de texto
        textfield1=new JTextField();
        textfield1.setBounds(120,10,150,20);
        add(textfield1);
        //boton
        boton1=new JButton("Aceptar");
        boton1.setBounds(10,80,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }
    
    //metodo que se ejecuta cuando se hace clic en el boton
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            String cad=textfield1.getText();
            setTitle(cad);
        }
    }
    
    //metodo principal
    public static void main(String[] ar) {
        E37EjTextField formulario1=new E37EjTextField();
        //ventana
        formulario1.setBounds(0,0,300,150);
        formulario1.setVisible(true);
    }
}
