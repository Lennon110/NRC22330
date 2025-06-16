package swing;

//librerias
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

//clase principal
public class E39jCheckBox2 extends JFrame implements ActionListener, ChangeListener{
    //atributos
    private JLabel label1;
    private JCheckBox check1;
    private JButton boton1;
    
    //constructor
    public E39jCheckBox2() {
        //gestor de diseño
        setLayout(null);
        //elementos
        //etiqueta
        label1=new JLabel("Esta de acuerdo con las normas del servicio?");
        label1.setBounds(10,10,400,30);
        add(label1);
        //checkbox
        check1=new JCheckBox("Acepto");
        check1.setBounds(10,50,100,30);
        check1.addChangeListener(this);
        add(check1);
        //boton
        boton1=new JButton("Continuar");
        boton1.setBounds(10,100,100,30);
        add(boton1);
        boton1.addActionListener(this);
        boton1.setEnabled(false);
    }
    
    //metodo que se ejecuta cuando el estado del checkbox cambia
    @Override
    public void stateChanged(ChangeEvent e) {
        if (check1.isSelected()==true) {
            boton1.setEnabled(true);//habilita boton
        } else {
            boton1.setEnabled(false);	
        }
    }
    
    // Metodo que se ejecuta cuando se hace clic en el botón
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            System.exit(0);
        }
    }
    
    //metodo principal
    public static void main(String[] ar) {
        E39jCheckBox2 formulario1=new E39jCheckBox2();
        //ventana
        formulario1.setBounds(0,0,350,200);
        formulario1.setVisible(true);
    }        
}