package swing;

//librerias
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//clase principal
public class E44jMenu extends JFrame implements ActionListener{
    //atributos
    private JMenuBar mb;
    private JMenu menu1,menu2,menu3;
    private JMenuItem mi1,mi2,mi3,mi4;
   
    //constructor
    public E44jMenu() {
        //gestor de diseño
        setLayout(null);
        //elementos
        //barra de menu
        mb=new JMenuBar();
        setJMenuBar(mb);
        //menu principal
        menu1=new JMenu("Opciones");
        mb.add(menu1);
        //submenu1(cambia tamaño)
        menu2=new JMenu("Tamaño de la ventana");
        menu1.add(menu2);
        //submenu2(cambia color de fondo)
        menu3=new JMenu("Color de fondo");
        menu1.add(menu3);
        //opciones submenu1
        mi1=new JMenuItem("640*480");
        menu2.add(mi1);
        mi1.addActionListener(this);
        mi2=new JMenuItem("1024*768");
        menu2.add(mi2);
        mi2.addActionListener(this);
        //opciones subemenu2
        mi3=new JMenuItem("Rojo");
        menu3.add(mi3);
        mi3.addActionListener(this);
        mi4=new JMenuItem("Verde");
        menu3.add(mi4);
        mi4.addActionListener(this);
    }
    
    //metodo que maneja los eventos de las opciones del menú
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==mi1) {
            setSize(640,480);
        }
        if (e.getSource()==mi2) {
            setSize(1024,768);
        }
        if (e.getSource()==mi3) {
            getContentPane().setBackground(new Color(255,0,0));
        }
        if (e.getSource()==mi4) {
            getContentPane().setBackground(new Color(0,255,0));
        }
    }
    
    //metodo principal
    public static void main(String[] ar) {
        E44jMenu formulario1=new E44jMenu();
        //ventana
        formulario1.setBounds(0,0,300,200);
        formulario1.setVisible(true);
    }     
}