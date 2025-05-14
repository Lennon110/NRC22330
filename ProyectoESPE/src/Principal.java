
//membrete


public class Principal {

    //metodo main para crear objeto
    public static void main(String[] args) {

        //Persona persona = new Persona("xx", "xy", 50); //crear e inicializar = instanciar
        
        //persona.imprimeSaludo();
        //persona.nombre = "Ruben Arroyo";
        //persona.imprimeSaludo();
        
        //Persona persona1 = new Persona(29); //argumento
        //persona1.imprimeSaludo();
        
        Persona persona = new Persona();
        persona.imprimeSaludo();
        
        Programador p = new Programador();
        p.nombre = "Karenina";
        System.out.println("Nombre : " + p.nombre);
        p.imprimeSaludo();
    }
    
}
