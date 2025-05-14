


/*ufa espe
    carrera patito
    nombre          periodo
    asignatura      nrc
    fecha:
    Tema: programa en java que permite mostrar un menu
*/

import java.util.Scanner;

public class E005Menu {
    
    static int numero1=0, numero2=0;
    static int resultado=0;
    
    //main
    public static void main(String[] args) {
        //variables
        char opcion;
        Scanner leer = new Scanner(System.in);
        
        //codigo
        do{
            System.out.println("\n\nMENU");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Salir");
            System.out.println("Seleccione la opcion: ");
            opcion = leer.next().charAt(0);
            
            switch(opcion){
                case '1':
                    System.out.println("Ejecuto la opcion 1");
                    ingresarDatos();
                    int suma = Sumar();
                    System.out.println("La suma es: "+suma);
                    break;
                case '2':
                    System.out.println("Ejecuto la opcion 2");
                    ingresarDatos();
                    int resta = Restar();
                    System.out.println("La resta es: "+resta);
                    break;
                case '3':
                    System.out.println("Gracias por utilizar el programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(opcion != '3');
        
    }

    private static int Sumar() {        
        resultado = numero1 + numero2;
        return resultado;
    }
    
    private static int Restar() {
        resultado = numero1 + numero2;
        return resultado;
    }
    
    
    private static void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero1: ");
        numero1 = scanner.nextInt();
        System.out.print("Ingrese un numero2: ");
        numero2 = scanner.nextInt();
    }
}
