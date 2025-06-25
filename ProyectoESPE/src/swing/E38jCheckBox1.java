package swing;

//librerias
import javax.swing.*;
import javax.swing.event.*;

//clase principal
public class E38jCheckBox1 extends JFrame implements ChangeListener{    
    //atributos
    private JCheckBox check1,check2,check3;
    
    //constructor
    public E38jCheckBox1() {
        //gestor de diseño
        setLayout(null);
        
        //elementos
        //checkbox
        check1=new JCheckBox("Inglés");
        check1.setBounds(10,10,150,30);
        //para detectar cambios
        check1.addChangeListener(this);
        add(check1);
        
        check2=new JCheckBox("Francés");
        check2.setBounds(10,50,150,30);
        check2.addChangeListener(this);        
        add(check2);
        
        check3=new JCheckBox("Alemán");
        check3.setBounds(10,90,150,30);
        check3.addChangeListener(this);        
        add(check3);        
    }
    
    //Metodo que se ejecuta cuando se selecciona o deselecciona un checkbox
    @Override
    public void stateChanged(ChangeEvent ce){
        String cad="";
        //agregar a la cadena dependiendo del checkbox
        if (check1.isSelected()==true) {
            cad=cad+"Inglés-";
        }
        if (check2.isSelected()==true) {
            cad=cad+"Francés-";
        }
        if (check3.isSelected()==true) {
            cad=cad+"Alemán-";
        }
        //establecer titulo con los idiomas seleccionados
        setTitle(cad);
    }
    
    //metodo principal
    public static void main(String[] ar) {
        E38jCheckBox1 formulario1=new E38jCheckBox1();
        //ventana
        formulario1.setBounds(0,0,300,200);
        formulario1.setVisible(true);
    }    
}