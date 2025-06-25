package swing;

//librerias
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//clase principal
public class E43jLookAndFeelDemo {
    //atributos
    static JFrame frame;
    JLabel label;
    JComboBox combo;
    
    //metodo que crea y organiza los componentes de la ventana
    public Component createComponents() {
        //Elementos
        //etiqueta de texto
        label = new JLabel("Selecciona un L&F");
        //lista desplegable
        combo = new JComboBox();
        combo.addItem("Metal");
        combo.addItem("Windows");
        combo.addItem("Motif");
        //detectar cuando se seleccion un estilo
        combo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //invocar metodo para cambiar de estilo
                initLookAndFeel(combo.getSelectedItem().toString());
            }
        });
        
        label.setLabelFor(combo); //asociar etiqueta con la lista desplegable
        
        //panel
        JPanel pane = new JPanel(new GridLayout(0, 1)); //panel en columnas
        pane.add(label);
        pane.add(combo);
        pane.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        return pane;
    }
    
    //metodo que cambia el LookAndFeel de la interfaz según la opción seleccionada
    private static void initLookAndFeel(String LaF) {
        String lookAndFeel = null;

        if (LaF != null) {
            if (LaF.equals("Metal")) {
                lookAndFeel = "javax.swing.plaf.metal.MetalLookAndFeel";
            }else if (LaF.equals("Windows")) {
                lookAndFeel = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
            } else if (LaF.equals("Motif")) {
                lookAndFeel = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
            } else {
                lookAndFeel = UIManager.getCrossPlatformLookAndFeelClassName();
            }

            try {
                UIManager.setLookAndFeel(lookAndFeel);
                SwingUtilities.updateComponentTreeUI(frame);
                frame.pack();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (UnsupportedLookAndFeelException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    //metodo que crea y muestra la ventana principal
    private static void createAndShowGUI() {
        //permitir que los bordes de las ventanas también adopten el estilo visual
        JFrame.setDefaultLookAndFeelDecorated(true);
        //ventana
        frame = new JFrame("Look And Feel Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //crear los componentes y añadirlos a la ventana
        E43jLookAndFeelDemo app = new E43jLookAndFeelDemo();
        Component contents = app.createComponents();
        frame.getContentPane().add(contents, BorderLayout.CENTER);

        frame.pack();//ajusta tamaño segun los compomentes
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }
    
    //metodo principal
    public static void main(String[] args) {
        //asegurar que la interfaz se cree en el hilo de eventos de Swing
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();//llama al método que lanza la GUI
            }
        });
    }
}
