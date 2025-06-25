package swing;

//librerias
import javax.swing.*;
import java.awt.event.*;

//clase principal
public class E42jTextArea extends JFrame implements ActionListener{
    //variables globales
    private JScrollPane scrollpane1;
    private JTextArea textarea1;
    private JButton boton1;
    
    //constructor
    public E42jTextArea() {
        //gestor de diseño
        setLayout(null);
        
        //elementos
        //caja de texto con deslizador
        textarea1=new JTextArea();
        scrollpane1=new JScrollPane(textarea1);
        scrollpane1.setBounds(10,10,300,200);
        add(scrollpane1);
        
        //boton
        boton1=new JButton("Verificar");
        boton1.setBounds(10,260,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }
    
    //metodo que se ejecuta cuando el usuario hace clic en el botón
    @Override
    public void actionPerformed(ActionEvent e) {
        //verificar si el texto tiene la palabra ecuador
        if (e.getSource()==boton1) {
            String texto=textarea1.getText();
            if (texto.indexOf("ecuador")!=-1) {
                setTitle("Si contiene el texto \"ecuador\"");
            } else {
                setTitle("No contiene el texto \"ecuador\"");            
            }
        }
    }
    
    //metodo principal
    public static void main(String[] ar) {
        E42jTextArea formulario1=new E42jTextArea();
        //ventana
        formulario1.setBounds(0,0,400,380);
        formulario1.setVisible(true);
    }        
}