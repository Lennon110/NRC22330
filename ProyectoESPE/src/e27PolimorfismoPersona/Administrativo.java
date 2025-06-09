
package e27PolimorfismoPersona;

import java.util.Scanner;

public class Administrativo extends Persona {
    //atributos
    private int nivel;
    private float sueldo;
    
     //constructor vacio o por defecto
    public Administrativo(){
        this.nivel = 0;
        this.sueldo = (float) 0.0;
    }
 
    //metodo que permite ingresar datos del administrativo
    @Override
    public void ingresarDatos(){
        super.ingresarDatos(); 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nivel: ");
        setNivel(scanner.nextInt());        
        System.out.println("Ingrese el sueldo: ");
        setSueldo(scanner.nextFloat());
    }
    
    //metodo que permite mostrar datos del administrativo
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.print("\t" + getNivel() + "\t" + getSueldo());
    }
    
    //getters y setters
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public float getSueldo() {
        return sueldo;
    }
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

}
