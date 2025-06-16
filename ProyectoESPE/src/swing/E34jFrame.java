package swing;

import javax.swing.*;

public class E34jFrame extends JFrame{
    //constructor
    public E34jFrame() {
        //gestor de diseño
        setLayout(null);
    }
    
    //metodo principal
    public static void main(String[] ar) {
        E34jFrame formulario1=new E34jFrame();
        formulario1.setBounds(10,20,400,300);
        formulario1.setVisible(true);
    }
}