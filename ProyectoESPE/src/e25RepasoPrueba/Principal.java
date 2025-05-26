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
            System.out.println("3. Ordenar por placa");
            System.out.println("4. Salir");
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
                    System.out.println("Ordenar:");
                    Iterator<Vehiculo> it1 = vector.iterator();
                    Iterator<Vehiculo> it2;
                    double minimo = 0;
                    minimo =  it1.next().getCosto();
                    for (it1 = vector.iterator(); it1.hasNext();) {
                        double costo1 = it1.next().getCosto();
                        
                        for (it2 = vector.iterator(); it2.hasNext();) {
                            double costo2 = it2.next().getCosto();
                            if(minimo > costo2){
                                minimo = costo1;
                                
                            }

                        }
                        System.out.println(minimo);
                    }
                                                 
                    
                    break;
                case '4':
                    System.out.println("Gracias por utilizar");
                    break;
                    
                default:
                    System.out.println("Opcion no valida");
            }
        }while(opcion != '4');
        
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
