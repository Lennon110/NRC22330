package e007persona;

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
        
        /*
        Persona persona = new Persona();
        persona.imprimeSaludo();
        
        Programador p = new Programador();
        p.nombre = "Karenina";
        System.out.println("Nombre : " + p.nombre);
        p.imprimeSaludo();
        */
        
        //Atributos
        Programador prog = new Programador();
        Profesor profe = new Profesor();
        Futbolista fut = new Futbolista();
        
        prog.nombre = "Carlos";
        prog.edad = 25;
        
        
        profe.nombre = "David";
        profe.escuela = "UNAM";
        
        
        fut.nombre = "Messi";
        fut.equipo = "Barcelona";
        
        System.out.print("\n");
        System.out.println("La persona " + fut.nombre + " tiene " + fut.edad);
        
        System.out.print("\n");
        prog.imprimeSaludo();
        profe.imprimeSaludo();
        fut.imprimeSaludo();
        
        System.out.print("\n");
        Persona per = new Futbolista(); //poliformismo variable con muchas formas 
        per.imprimeSaludo();
        per = new Programador();
        per.imprimeSaludo();
        
        
        System.out.print("\n");
        Persona []arreglo = new Persona[3];
        arreglo[0] = new Programador();
        arreglo[1] = new Profesor();
        arreglo[2] = new Futbolista();
        
        for (Persona p : arreglo) {
            p.imprimeSaludo();
        }
        
        for (int i = 0; i < 3; i++) {
            arreglo[i].imprimeSaludo();
        }
    }
    
}
