
public class Programador extends Persona {
    
    //Atributos
    String so_favorito;
    String marca_pc;
    
    //Constructor
    
    //Metodos del usuario o privados

    @Override
    public void imprimeSaludo(){
        //System.out.println("Soy programador " + this.nombre + " so: " + so_favorito );
        System.out.println("Yo soy un programador " + so_favorito);
    }
}
