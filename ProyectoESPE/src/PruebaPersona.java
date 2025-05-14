
public class PruebaPersona {

    public static void main(String[] args) {
    //STATIC METODO DE CLASE PARA UTILIZ X TODOS 
        //generar una instancia de tipo programador 
        Programador prog = new Programador();
        prog.nombre = "Carlos";
        prog.edad = 25;
        
        Profesor profe = new Profesor();
        profe.nombre = "David";
        profe.escuela = "UNAM";
        
        Futbolista fut = new Futbolista();
        fut.nombre = "Messi";
        fut.equipo = "Barcelona";
        
        System.out.println("\n");
        prog.imprimeSaludo();
        profe.imprimeSaludo();
        fut.imprimeSaludo();
        
        System.out.println("\n");
        Persona per = new Futbolista(); //poliformismo variable con muchas formas 
        per.imprimeSaludo();
        per = new Programador();
        per.imprimeSaludo();
        
        System.out.println("\n");
        Persona[] arreglo = new Persona[3];
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
