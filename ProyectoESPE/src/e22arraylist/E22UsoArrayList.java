package e22arraylist;

import java.util.*;

public class E22UsoArrayList {
    //Var

    
    
    public static void main(String[] args) {
        
        //declarar    
        LinkedList<Persona> vector = new LinkedList<>();        
        Scanner leer = new Scanner(System.in);
        char opcion;
        
        
        //codigo
        do{
            System.out.println("\n\nMENU");
            System.out.println("1. Ingresar");
            System.out.println("2. Mostrar");
            System.out.println("3. Eliminar");
            System.out.println("4. Salir");
            
            System.out.print("Seleccione la opcion: ");
            opcion = leer.next().charAt(0);
            
            switch(opcion){
                case '1':
                    System.out.println("Ejecuto la opcion 1");
                    ingresarDatos(vector);

                    break;
                case '2':
                    System.out.println("Ejecuto la opcion 2");
                    //ingresarDatos();
                    System.out.println("\nCon el Iterator");
                    for (Iterator<Persona> it = vector.iterator(); it.hasNext();) {
                        System.out.println(it.next());
                    }
                    break;
                case '3':
                    System.out.print("Ingrese el elemento a eliminar: ");
                    int elemento = leer.nextInt();
                    vector.remove(elemento-1);
                    break;
                case '4':
                    System.out.println("Gracias por utilizar el programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(opcion != '4');
        
//        System.out.println("\n\nCon el for");
//        for(int i=0; i<vector.size(); i++){
//            persona = new Persona();
//            persona = (Persona) vector[i];
//            System.out.println(persona.toString());
//        }
        
//        Iterator<Persona> it = vector.iterator();
        
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
        
        

        
        
    }  

    private static void ingresarDatos(LinkedList<Persona> vector) {                    
        Persona persona = new Persona();
        persona.ingresarDatos();
        vector.add(persona);
    }
}
