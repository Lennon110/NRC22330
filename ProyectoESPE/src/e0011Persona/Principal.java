
package e0011Persona;


public class Principal {


    public static void main(String[] args) {
        
        Persona persona = new Persona();
        persona.mostrarDatosPersona();
        persona.ingresarDatos();
        System.out.println(persona.toString());
    }
    
}
