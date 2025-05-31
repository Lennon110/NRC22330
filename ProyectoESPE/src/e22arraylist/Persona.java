
package e22arraylist;

import java.util.Scanner;


public class Persona {
    
    //Atributos
    private String cedula;
    private String nombre;
    private int edad;
    private String genero;
    private float peso;
    
    
    //Constructores
    
    public Persona() {
        this.cedula = null;
        this.nombre = "";
        this.edad = 0;
        this.genero = null;
        this.peso = (float)50.5;
    }
    
    //Metodos Usuario
    
    public void ingresarDatos(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cedula: ");
        setCedula(leer.nextLine());
        System.out.print("Ingresa el nombre: ");
        setNombre(leer.nextLine());
        System.out.print("Ingresa la edad: ");
        setEdad(leer.nextInt());
        System.out.print("Ingresa el genero: ");
        setGenero(leer.next());
        System.out.print("Ingresa el peso: ");
        setPeso(leer.nextFloat());
    }
    
    public void mostrarDatosPersona(){
        System.out.println("Los datos son: ".toUpperCase());
        System.out.println("La cedula es: " + getCedula());
        System.out.println("El nombre es: " + getNombre());
        System.out.println("La edad es: " + getEdad());
        System.out.println("El genero es: " + getGenero());
        System.out.println("El peso es: " + getPeso());
  
    }
    
    //Metodos Especiales

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + getCedula() + ", nombre=" + getNombre() + ", edad=" + getEdad() + ", genero=" + getGenero() + ", peso=" + getPeso() + '}';
    }
    
    //Metodos Getter y Setter

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    

    

    
}
