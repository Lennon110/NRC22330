package eGuis1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class e61Prueba extends JFrame implements ActionListener {

    //variables globales
    private JLabel texto1, texto2, texto3;
    private JTextField numero1, numero2, numero3;
    private JButton boton1;

    public e61Prueba() {
        super("suma");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);

        //gestor de diseño
        //GridLayout flow = new GridLayout(2,5);
        setLayout(null);

        //elementos
        texto1 = new JLabel("Numero1: ");
        texto1.setBounds(10,10,80,20);
        add(texto1);
        
        numero1 = new JTextField();
        numero1.setBounds(100, 10, 100, 20);
        add(numero1);
        
        texto2 = new JLabel("Numero2: ");
        texto2.setBounds(10,30,80,20);
        add(texto2);
        
        numero2 = new JTextField();
        numero2.setBounds(100, 30, 100, 20);
        add(numero2);
        
        texto3 = new JLabel("Suma: ");
        texto3.setBounds(10,50,80,20);
        add(texto3);
        
        numero3 = new JTextField();
        numero3.setBounds(100, 50, 100, 20);
        add(numero3);
        
        boton1 = new JButton("sumar");
        boton1.setBounds(100, 70, 100, 20);
        add(boton1);
        boton1.addActionListener(this);

        /*try {

        } catch (NumberFormatException ex) {
            System.out.println("Error");
        }*/
    }

    @Override
    public void actionPerformed(ActionEvent objeto) {
        if (objeto.getSource() == boton1) {
            String resp = JOptionPane.showInputDialog(this,
                    "Ingrese el valor");
            int n1 = Integer.parseInt(resp);
            int n2 = Integer.parseInt(numero2.getText());
            int n3;
            n3 = n1 + n2;
            String tn3 = String.valueOf(n3);
            numero3.setText(tn3);
            setTitle(numero3.getText());

        }
    }

    public static void main(String[] args) {
        new e61Prueba().setVisible(true);
    }
}
