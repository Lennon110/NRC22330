
package e27PolimorfismoPersona;

import java.util.Scanner;

public class Estudiante extends Persona {
    //atributos
    private String carrera;
    
     //constructor vacio o por defecto
    public Estudiante(){
        this.carrera = null;
    }
    
    //metodo que permite ingresar datos del estudiante
    @Override
    public void ingresarDatos(){
        super.ingresarDatos(); 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la carrera: ");
        setCarrera(scanner.nextLine());        
    }
    
    //metodo que permite mostrar datos del estudiante
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.print("\t" + getCarrera());
    }
    
    //getters y setters
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
}
