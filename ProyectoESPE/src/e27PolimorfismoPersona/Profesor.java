
package e27PolimorfismoPersona;

import java.util.Scanner;

public class Profesor extends Persona{
    //atributos
    private String titulo;
    
    //constructor vacio o por defecto
    public Profesor(){
        this.titulo = null;
    }
    
    //metodo que permite ingresar datos del profesor
    @Override
    public void ingresarDatos(){
        super.ingresarDatos(); //super => arriba, super es clausula
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el titulo: ");
        setTitulo(scanner.nextLine());        
    }
    
    //metodo que permite mostrar datos del profesor
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.print("\t" + getTitulo());
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
}
