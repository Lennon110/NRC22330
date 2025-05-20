/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e24AgregacionAlmacen;

/**
 *
 * @author LABS-ESPE
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cliente = new Cliente();
        cliente.ingresarCliente();
        System.out.println(cliente.toString());
        
        Almacen almacen = new Almacen();
        System.out.println(almacen.mensaje(cliente));
    }
    
}
