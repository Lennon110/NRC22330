package swing;

//librerias
import javax.swing.*;
import javax.swing.event.*;

//clase principal
public class E40jRadioButton extends JFrame implements ChangeListener{
    //variables globales
    private JRadioButton radio1,radio2,radio3;
    private ButtonGroup bg;
    
    //constructor
    public E40jRadioButton() {
        //gestor de diseño
        setLayout(null);
        
        //elementos
        //grupo de botones
        bg=new ButtonGroup(); //para que se puede seleccionar una opcion a la vez
        
        //radio button
        radio1=new JRadioButton("640*480");
        radio1.setBounds(10,20,100,30);
        radio1.addChangeListener(this);
        add(radio1);
        bg.add(radio1); //agregar boton al grupo
        
        radio2=new JRadioButton("800*600");
        radio2.setBounds(10,70,100,30);
        radio2.addChangeListener(this);        
        add(radio2);
        bg.add(radio2);
        
        radio3=new JRadioButton("1024*768");
        radio3.setBounds(10,120,100,30);
        radio3.addChangeListener(this);        
        add(radio3);
        bg.add(radio3);        
    }
    
    //metodo que se ejecuta cuando cambia el estado de alguno de los radio buttons
    @Override
    public void stateChanged(ChangeEvent ce) {
        //cambia la resolucion de la ventana dependiendo del radio button seleccionado
        if (radio1.isSelected()) {
            setSize(640,480);
        }
        else if (radio2.isSelected()) {
            setSize(800,600);
        }
        else if (radio3.isSelected()) {
            setSize(1024,768);
        }        
    }
    
    //metodo principal
    public static void main(String[] ar) {
        E40jRadioButton formulario1=new E40jRadioButton();
        //ventana
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        formulario1.setBounds(0,0,350,230);
        formulario1.setVisible(true);
    } 	
}