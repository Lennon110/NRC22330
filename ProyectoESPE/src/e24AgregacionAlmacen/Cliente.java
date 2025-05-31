
package e24AgregacionAlmacen;

import java.util.Scanner;

public class Cliente {
    //atributos
    private String nombre;
    
    //constructor
    public Cliente(){
        this.nombre = null; 
    }
    
    //metodos usario
    public void ingresarCliente(){
        Scanner scanner = new Scanner(System.in);       
        System.out.println("Ingrese el nombre: ");
        setNombre(scanner.nextLine());
    }
    
    //metodo para mostrar los datos
    @Override
    public String toString(){
        return getNombre();
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
