package e25RepasoPrueba;

import java.util.*;

public class Principal {
    
    //main
    public static void main(String[] args) {
        //variables locales
        Scanner leer = new Scanner(System.in);
        Vehiculo vehiculo = new Vehiculo();
        ArrayList <Vehiculo> vector = new ArrayList <Vehiculo>();
        double suma=0;
        char opcion;
        
        //codigo
        do{
            System.out.println("\n\nMENU");
            System.out.println("1. Ingresar Vehiculo");
            System.out.println("2. Mostrar Vehiculo");
            System.out.println("3. Costo Total");
            System.out.println("4. Ordenar por placa");
            System.out.println("5. Salir");
            System.out.println("Seleccione la opcion: ");
            opcion = leer.next().charAt(0);
            
            switch(opcion){
                case '1':
                    ingresarDatos(vehiculo, vector);
                    //vehiculo = new Vehiculo(); //IMPORTANTE PONER ESTA LINEA, INICIALIZAR INGRESAR Y ASIGNAR
                    //vehiculo.ingresarDatos();
                    //vector.add(vehiculo);
                    break;
                case '2':
                    mostrarVehiculo(vector);
//                    Iterator <Vehiculo> it = vector.iterator(); //SABER DE MEMORIA
//                    for(it = vector.iterator(); it.hasNext();){
//                        System.out.println(it.next());
//                    }
                    break;
                case '3':
                    suma = 0;
                    Iterator<Vehiculo> it;
                    for (it = vector.iterator(); it.hasNext();) {
                        suma = suma + it.next().getCosto();
                    }
                    System.out.println("Suma: " + suma);
                    break;
                case '4':
                    Iterator<Vehiculo> it1;
                    Iterator<Vehiculo>
                    
                    break;
                case '5':
                    System.out.println("Gracias por utilizar");
                    break;
                    
                default:
                    System.out.println("Opcion no valida");
            }
        }while(opcion != '5');
        
    }
    
    //metodo que permite ingresar datos del vehiculo
    private static void ingresarDatos(Vehiculo vehiculo, ArrayList <Vehiculo> vector) {
        vehiculo = new Vehiculo();
        vehiculo.ingresarDatos();
        vector.add(vehiculo);
    }
    
    
    //metodo que permite mostrar los datos de un vehiculo
    private static void mostrarVehiculo(ArrayList <Vehiculo> vector) {
        Iterator<Vehiculo> it;
        for (it = vector.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
    }
    
    
}
