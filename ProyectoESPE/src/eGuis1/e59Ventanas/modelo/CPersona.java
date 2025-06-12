/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eGuis1.e59Ventanas.modelo;

/**
 *
 * @author LABS-ESPE
 */
public class CPersona {
    //atributos
    private String nombre;
    private String direccion;
    private int telefono;
    
    //constructor vacio
    public CPersona(){
        this.nombre = null;
        this.direccion = null;
        this.telefono = 0;
    }

    public CPersona(String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    
    
    
    //ingresar
    
    //toString

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", Direccion=" + direccion + ", Telefono=" + telefono + '}';
    }

    //get y set
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
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    
}
