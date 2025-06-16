package swing;

//librerias
import javax.swing.*;
import java.awt.event.*;

//clase principal
public class E45Suma extends JFrame implements ActionListener{
    //atributos
    private JTextField textfield1,textfield2, campoSuma;
    private JButton boton1;
    
    //constructor
    public E45Suma() {
        //gestor de diseño
        setLayout(null);
        //elementos
        //campo de texto
        textfield1=new JTextField();
        textfield1.setBounds(10,10,100,30);
        add(textfield1);
        
        textfield2=new JTextField();
        textfield2.setBounds(10,50,100,30);
        add(textfield2);
        
        campoSuma=new JTextField();
        campoSuma.setBounds(10,90,100,30);
        add(campoSuma);
        
        //boton
        boton1=new JButton("Sumar");
        boton1.setBounds(10,130,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }
    
    //metodo que realiza la suma al presionar el clic
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            String cad1=textfield1.getText();
            String cad2=textfield2.getText();
            int x1=Integer.parseInt(cad1);
            int x2=Integer.parseInt(cad2);
            int suma=x1+x2;
            String total=String.valueOf(suma);
            campoSuma.setText(total);
            setTitle(total);
        }
    }
    
    //metodo principal
    public static void main(String[] ar) {
        E45Suma formulario1=new E45Suma();
        //ventana
        formulario1.setBounds(50,50,190,200);
        formulario1.setVisible(true);
    }
}