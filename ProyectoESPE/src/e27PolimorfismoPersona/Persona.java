
package e27PolimorfismoPersona;

import java.util.Scanner;

public class Persona {
    //atributos
    private String cedula;
    private String nombre;
    private float peso;
    
    //constructor vacio
    public Persona(){
        this.cedula = null;
        this.nombre = null;
        this.peso = (float)0.0; //si pongo 0.0 hago cast
    }
    
    //metodo que permite ingresar datos de la persona
    public void ingresarDatos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cedula: ");
        setCedula(scanner.nextLine());
        System.out.println("Ingrese el nombre: ");
        setNombre(scanner.nextLine());
        System.out.println("Ingrese el peso: ");
        setPeso(scanner.nextFloat());
    }
    
    //metodo que permite mostrar datos de la persona
    public void mostrarDatos(){
        System.out.print(this.getCedula() + "\t" + getNombre() + "\t" + getPeso());
    }
    
    //getters y setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
            
}
