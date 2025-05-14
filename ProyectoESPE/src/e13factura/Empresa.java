
package e13factura;

import java.util.Scanner;

public class Empresa {
    
    //Atributo
    private String RUC;
    private String nombre;
    private String direccion;
    private String telefono;

    public void ingresarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESO DE DATOS EMPRESA".toLowerCase());
        System.out.print("Ingrese el RUC: ");
        setRUC(sc.nextLine());
        System.out.print("Ingrese el nombre de la empresa: ");
        setNombre(sc.nextLine());
        System.out.print("Ingrese la direccion de la empresa: ");
        setDireccion(sc.nextLine());
        System.out.print("Ingrese el telefono de la empresa: ");
        setTelefono(sc.nextLine());
    }

    public String mostrarDatos() {
        return "RUC: " + getRUC() + "\nNombre: " + getNombre() + "\nDireccion: "
                + getDireccion() + "\nTelefono: " + getTelefono();
    }
    
    public void mostrarDatos1() {
        System.out.println("RUC: " + getRUC() + "\nNombre" + getNombre() + "\nDireccion: "
                + getDireccion() + "\nTelefono: " + getTelefono()); 
    }

    /**
     * @return the RUC
     */
    public String getRUC() {
        return RUC;
    }

    /**
     * @param RUC the RUC to set
     */
    public void setRUC(String RUC) {
        this.RUC = RUC;
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

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}


