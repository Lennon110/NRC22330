
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
 
    //metodo que permite ingresar datos del estudiante
    @Override
    public void ingresarDatos(){
        super.ingresarDatos(); 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nivel: ");
        setNivel(scanner.nextInt());        
        System.out.println("Ingrese el sueldo: ");
        setSueldo(scanner.nextFloat());
    }
    
    //metodo que permite mostrar datos del estudiante
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.print("\t" + getNivel() + "\t" + getSueldo());
    }
    
    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the sueldo
     */
    public float getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

}
