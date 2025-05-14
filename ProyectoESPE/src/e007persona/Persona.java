package e007persona;


class Persona {
    
    //Atributos
    String nombre;
    String sexo;
    int edad;
    
    //Constructor
    
    //Si no hay ningun constructor se pone el constructor por defecto
     
    /*
    public Persona(){
        this.nombre = "Rubensito";
        this.sexo = "";
        this.edad=0;
        //System.out.println("Ejecutando constructor...");
        //nombre = "zzzzz";
    }

    public Persona(int a){ //parametro
        
    }
    
    public Persona(String nom, String sexo, int edad) {
        this.nombre = nom;
        this.sexo = sexo;
        this.edad = edad;
    }
    */
    
    //Metodos del usuario o privados
    
    //Metodos especiales
    
    //no es necesario static
    public void imprimeSaludo(){
        System.out.println("Hola soy una Persona... mi nombre es " + nombre );
    }
    //Metodos publicos o get y set
    
}
