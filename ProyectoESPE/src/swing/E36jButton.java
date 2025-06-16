package swing;

//librerias
import java.awt.event.*;
import javax.swing.*;

//clase principal
public class E36jButton extends JFrame implements ActionListener {
    //atributos
    private JButton boton1;
    
    //constructor
    public E36jButton() {
        //titulo de la ventana
        super("Botones");
        //gestor de diseño
        setLayout(null);
        //elemento
        boton1=new JButton("Finalizar");
        boton1.setBounds(300,250,100,30);
        add(boton1);
        //responde al clic
        boton1.addActionListener(this);
    }
    
    //metodo que se ejecuta cuando se hace clic en el boton
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            System.exit(0);
        }
    }
    
    //metodo principal
    public static void main(String[] ar) {
        E36jButton formulario1=new E36jButton();
        //ventana
        formulario1.setBounds(0,0,450,350);
        formulario1.setVisible(true);
    }
}
