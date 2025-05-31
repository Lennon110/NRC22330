
package e24AgregacionAlmacen;

import java.util.Scanner;

public class Almacen {
    //atributos
    private String nombre;
    private String direccion;
    
    //constructor
    public Almacen(){
        nombre = "ESTE";
        direccion = null;        
    }
    
    //metodos usuarios
    public void ingresarAlmacen(){
        Scanner scanner = new Scanner(System.in);       
        System.out.println("Ingrese la direccion: ");
        setDireccion(scanner.nextLine());
    }
    
    //metodo para mostrar los datos
    @Override
    public String toString(){
        return getNombre() + "\nLa direccion es: " + getDireccion();
    }
    
    
    //metodod mensaje
    
    public String mensaje(Cliente cliente){
        return "Cliente en mora: " + cliente.getNombre();
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

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
