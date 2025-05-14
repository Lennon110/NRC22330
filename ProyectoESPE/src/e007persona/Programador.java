package e007persona;


public class Programador extends Persona {
    
    //Atributos
    String so_favorito;
    String marca_pc;
    
    //Constructor
    
    public Programador(){
        System.out.println("UUUUUUU");
    }
    
    //Metodos del usuario o privados

    @Override
    public void imprimeSaludo(){
        System.out.println("Soy programador " + this.nombre + " so: " + so_favorito );
    }
}
